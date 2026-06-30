package com.facebook.yoga;

/* loaded from: classes14.dex */
public class YogaMeasureOutput {
    public static float getHeight(long j17) {
        return java.lang.Float.intBitsToFloat((int) (j17 & (-1)));
    }

    public static float getWidth(long j17) {
        return java.lang.Float.intBitsToFloat((int) ((j17 >> 32) & (-1)));
    }

    public static long make(float f17, float f18) {
        return java.lang.Float.floatToRawIntBits(f18) | (java.lang.Float.floatToRawIntBits(f17) << 32);
    }

    public static long make(int i17, int i18) {
        return make(i17, i18);
    }
}
