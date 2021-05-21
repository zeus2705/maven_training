package fr.lernejo;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLClientInfoException;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    public Sample sampletest = new Sample();

    @Test
    void test1plus1() {
        Assertions.assertThat(sampletest.op(Sample.Operation.ADD, 1,1)).as("1 + 1")
            .isEqualTo(2);

    }
    @Test
    void test2fois2() {
        Assertions.assertThat(sampletest.op(Sample.Operation.MULT, 2,2)).as("2 * 2")
            .isEqualTo(4);
    }

    @Test
    void erorFact() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sampletest.fact(-1));
    }

    @Test
    void Fact1() {
        Assertions.assertThat(sampletest.fact(1)).as("fact(1)")
            .isEqualTo(1);
    }
}
