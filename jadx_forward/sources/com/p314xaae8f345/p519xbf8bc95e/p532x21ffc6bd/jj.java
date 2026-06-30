package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class jj {
    public static double a(long j17, float f17) {
        float f18 = ((float) j17) / 5000.0f;
        return ((-f17) * f18 * (f18 - 2.0f)) + 0.0f;
    }

    private static double b(long j17, float f17, float f18, long j18) {
        float f19 = ((float) j17) / ((float) j18);
        return (f18 * f19 * f19) + f17;
    }

    private static double c(long j17, float f17, float f18, long j18) {
        float f19;
        float f27;
        long j19 = ((float) j17) / (((float) j18) / 2.0f);
        if (j19 < 1) {
            f27 = (float) j19;
            f19 = (f18 / 2.0f) * f27;
        } else {
            f19 = (-f18) / 2.0f;
            long j27 = j19 - 1;
            f27 = (float) ((j27 * (j27 - 2)) - 1);
        }
        return (f19 * f27) + f17;
    }

    private static double d(long j17, float f17, float f18, long j18) {
        return (f18 * java.lang.Math.pow(j17 / j18, 3.0d)) + f17;
    }

    private static double e(long j17, float f17, float f18, long j18) {
        return (f18 * (java.lang.Math.pow((((float) j17) / ((float) j18)) - 1.0f, 3.0d) + 1.0d)) + f17;
    }

    private static double f(long j17, float f17, float f18, long j18) {
        double d17;
        double pow;
        long j19 = j17 / (j18 / 2);
        if (j19 < 1) {
            d17 = f18 / 2.0f;
            pow = java.lang.Math.pow(j19, 3.0d);
        } else {
            d17 = f18 / 2.0f;
            pow = java.lang.Math.pow(j19 - 2, 3.0d) + 2.0d;
        }
        return (d17 * pow) + f17;
    }

    private static double g(long j17, float f17, float f18, long j18) {
        float f19 = ((float) j17) / ((float) j18);
        return (f18 * f19 * f19 * f19 * f19) + f17;
    }

    private static double h(long j17, float f17, float f18, long j18) {
        float f19 = (float) (j17 / (j18 - 1));
        return ((-f18) * ((((f19 * f19) * f19) * f19) - 1.0f)) + f17;
    }

    private static double i(long j17, float f17, float f18, long j18) {
        float f19;
        float f27;
        long j19 = j17 / (j18 / 2);
        if (j19 < 1) {
            f27 = (float) j19;
            f19 = (f18 / 2.0f) * f27 * f27 * f27;
        } else {
            f19 = (-f18) / 2.0f;
            long j27 = j19 - 2;
            f27 = (float) ((((j27 * j27) * j27) * j27) - 2);
        }
        return (f19 * f27) + f17;
    }

    private static double j(long j17, float f17, float f18, long j18) {
        float f19 = (float) (j17 / j18);
        return (f18 * f19 * f19 * f19 * f19 * f19) + f17;
    }

    private static double k(long j17, float f17, float f18, long j18) {
        long j19 = (j17 / j18) - 1;
        return (f18 * ((float) ((j19 * j19 * j19 * j19 * j19) + 1))) + f17;
    }

    private static double l(long j17, float f17, float f18, long j18) {
        float f19;
        float f27;
        long j19 = j17 / (j18 / 2);
        if (j19 < 1) {
            f27 = (float) j19;
            f19 = (f18 / 2.0f) * f27 * f27 * f27 * f27;
        } else {
            f19 = f18 / 2.0f;
            long j27 = j19 - 2;
            f27 = (float) ((j27 * j27 * j27 * j27 * j27) + 2);
        }
        return (f19 * f27) + f17;
    }

    private static double m(long j17, float f17, float f18, long j18) {
        return (f18 * (1.0d - java.lang.Math.cos((j17 / j18) * 1.5707963267948966d))) + f17;
    }

    private static double n(long j17, float f17, float f18, long j18) {
        return (f18 * java.lang.Math.sin((j17 / j18) * 1.5707963267948966d)) + f17;
    }

    private static double o(long j17, float f17, float f18, long j18) {
        return ((f18 / 2.0f) * (1.0d - java.lang.Math.cos((j17 * 3.141592653589793d) / j18))) + f17;
    }

    private static double p(long j17, float f17, float f18, long j18) {
        return (f18 * java.lang.Math.pow(2.0d, ((j17 / j18) - 1) * 10)) + f17;
    }

    private static double q(long j17, float f17, float f18, long j18) {
        return (f18 * ((-java.lang.Math.pow(2.0d, (j17 * (-10)) / j18)) + 1.0d)) + f17;
    }

    private static double r(long j17, float f17, float f18, long j18) {
        long j19 = j17 / j18;
        return (f18 * (1.0d - java.lang.Math.sqrt(1 - (j19 * j19)))) + f17;
    }

    private static double s(long j17, float f17, float f18, long j18) {
        long j19 = j17 / (j18 - 1);
        return (f18 * java.lang.Math.sqrt(1 - (j19 * j19))) + f17;
    }

    private static double t(long j17, float f17, float f18, long j18) {
        long j19 = j17 / (j18 / 2);
        if (j19 < 1) {
            return ((f18 / 2.0f) * (1.0d - java.lang.Math.sqrt(1 - (j19 * j19)))) + f17;
        }
        long j27 = j19 - 2;
        return ((f18 / 2.0f) * (java.lang.Math.sqrt(1 - (j27 * j27)) + 1.0d)) + f17;
    }

    private static double u(long j17, float f17, float f18, long j18) {
        float f19;
        long j19;
        long j27 = j17 / (j18 / 2);
        if (j27 < 1) {
            f19 = f18 / 2.0f;
            j19 = j27 * j27 * ((j27 * 4) - 3);
        } else {
            f19 = f18 / 2.0f;
            long j28 = j27 - 2;
            j19 = (j28 * j28 * ((j28 * 4) + 3)) + 2;
        }
        return (f19 * ((float) j19)) + f17;
    }

    private static double v(long j17, float f17, float f18, long j18) {
        float f19 = (float) (j17 / j18);
        return (f18 * f19 * f19 * ((float) ((r0 * 21) - 20))) + f17;
    }

    private static double w(long j17, float f17, float f18, long j18) {
        long j19 = (j17 / j18) - 1;
        return (f18 * ((float) ((j19 * j19 * ((j19 * 21) + 20)) + 1))) + f17;
    }

    public static double a(long j17, float f17, float f18, long j18) {
        return ((f18 * ((float) j17)) / ((float) j18)) + f17;
    }
}
