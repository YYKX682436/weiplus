package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaMeasureOutput */
/* loaded from: classes14.dex */
public class C1573xf59b634f {
    /* renamed from: getHeight */
    public static float m16830x1c4fb41d(long j17) {
        return java.lang.Float.intBitsToFloat((int) (j17 & (-1)));
    }

    /* renamed from: getWidth */
    public static float m16831x755bd410(long j17) {
        return java.lang.Float.intBitsToFloat((int) ((j17 >> 32) & (-1)));
    }

    /* renamed from: make */
    public static long m16832x3305ee(float f17, float f18) {
        return java.lang.Float.floatToRawIntBits(f18) | (java.lang.Float.floatToRawIntBits(f17) << 32);
    }

    /* renamed from: make */
    public static long m16833x3305ee(int i17, int i18) {
        return m16832x3305ee(i17, i18);
    }
}
