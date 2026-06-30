package com.facebook.yoga;

/* loaded from: classes11.dex */
public enum YogaMeasureMode {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int mIntValue;

    YogaMeasureMode(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaMeasureMode fromInt(int i17) {
        if (i17 == 0) {
            return UNDEFINED;
        }
        if (i17 == 1) {
            return EXACTLY;
        }
        if (i17 == 2) {
            return AT_MOST;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
