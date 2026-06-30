package a06;

/* loaded from: classes5.dex */
public abstract class d extends a06.c {
    public static final int a(double d17) {
        if (java.lang.Double.isNaN(d17)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        if (d17 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d17 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) java.lang.Math.round(d17);
    }

    public static final int b(float f17) {
        if (java.lang.Float.isNaN(f17)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(f17);
    }

    public static final long c(double d17) {
        if (java.lang.Double.isNaN(d17)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(d17);
    }

    public static final long d(float f17) {
        return c(f17);
    }
}
