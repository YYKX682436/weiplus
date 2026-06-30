package com.facebook.yoga;

/* loaded from: classes15.dex */
public class YogaConstants {
    public static final float UNDEFINED = Float.NaN;

    public static float getUndefined() {
        return Float.NaN;
    }

    public static boolean isUndefined(float f17) {
        return java.lang.Float.compare(f17, Float.NaN) == 0;
    }

    public static boolean isUndefined(com.facebook.yoga.YogaValue yogaValue) {
        return yogaValue.unit == com.facebook.yoga.YogaUnit.UNDEFINED;
    }
}
