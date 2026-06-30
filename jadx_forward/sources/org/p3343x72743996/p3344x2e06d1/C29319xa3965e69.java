package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.MathUtils */
/* loaded from: classes4.dex */
public class C29319xa3965e69 {

    /* renamed from: EPSILON */
    public static final float f73330xcf459f4a = 0.001f;

    private C29319xa3965e69() {
    }

    /* renamed from: areFloatsEqual */
    public static boolean m152501x8ce4e9(float f17, float f18) {
        return java.lang.Math.abs(f17 - f18) < 0.001f;
    }

    /* renamed from: clamp */
    public static float m152502x5a5a8bb(float f17, float f18, float f19) {
        float f27 = f18 > f19 ? f19 : f18;
        if (f18 <= f19) {
            f18 = f19;
        }
        return f17 < f27 ? f27 : f17 > f18 ? f18 : f17;
    }

    /* renamed from: compareLongs */
    public static int m152505x5a72392(long j17, long j18) {
        if (j17 < j18) {
            return -1;
        }
        return j17 == j18 ? 0 : 1;
    }

    /* renamed from: distance */
    public static float m152506x11318bf5(float f17, float f18, float f19, float f27) {
        float f28 = f19 - f17;
        float f29 = f27 - f18;
        return (float) java.lang.Math.sqrt((f28 * f28) + (f29 * f29));
    }

    /* renamed from: flipSignIf */
    public static float m152507x35d19287(float f17, boolean z17) {
        return z17 ? -f17 : f17;
    }

    /* renamed from: interpolate */
    public static float m152509x8828d901(float f17, float f18, float f19) {
        return f17 + ((f18 - f17) * f19);
    }

    public static float map(float f17, float f18, float f19, float f27, float f28) {
        return f27 + ((f28 - f27) * ((f17 - f18) / (f19 - f18)));
    }

    /* renamed from: positiveModulo */
    public static int m152510x8e1c0dcf(int i17, int i18) {
        int i19 = i17 % i18;
        return i19 >= 0 ? i19 : i19 + i18;
    }

    /* renamed from: roundTwoDecimalPlaces */
    public static double m152511x42e569bf(double d17) {
        return java.lang.Math.round(d17 * 100.0d) / 100.0d;
    }

    /* renamed from: scaleToFitTargetSize */
    public static float m152512xee614ebe(int[] iArr, int i17, int i18) {
        int i19;
        int i27;
        if (iArr.length < 2 || (i19 = iArr[0]) <= 0 || (i27 = iArr[1]) <= 0) {
            throw new java.lang.IllegalArgumentException("Expected dimensions to have length >= 2 && dimensions[0] > 0 && dimensions[1] > 0");
        }
        float max = java.lang.Math.max(i17 / i19, i18 / i27);
        iArr[0] = (int) (iArr[0] * max);
        iArr[1] = (int) (iArr[1] * max);
        return max;
    }

    /* renamed from: smoothstep */
    public static float m152513xa478f57a(float f17) {
        return f17 * f17 * (3.0f - (f17 * 2.0f));
    }

    /* renamed from: clamp */
    public static int m152503x5a5a8bb(int i17, int i18, int i19) {
        int i27 = i18 > i19 ? i19 : i18;
        if (i18 <= i19) {
            i18 = i19;
        }
        return i17 < i27 ? i27 : i17 > i18 ? i18 : i17;
    }

    /* renamed from: flipSignIf */
    public static int m152508x35d19287(int i17, boolean z17) {
        return z17 ? -i17 : i17;
    }

    /* renamed from: clamp */
    public static long m152504x5a5a8bb(long j17, long j18, long j19) {
        long j27 = j18 > j19 ? j19 : j18;
        if (j18 <= j19) {
            j18 = j19;
        }
        return j17 < j27 ? j27 : j17 > j18 ? j18 : j17;
    }
}
