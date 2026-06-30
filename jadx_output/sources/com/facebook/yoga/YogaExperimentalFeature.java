package com.facebook.yoga;

/* loaded from: classes.dex */
public enum YogaExperimentalFeature {
    WEB_FLEX_BASIS(0);

    private final int mIntValue;

    YogaExperimentalFeature(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaExperimentalFeature fromInt(int i17) {
        if (i17 == 0) {
            return WEB_FLEX_BASIS;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
