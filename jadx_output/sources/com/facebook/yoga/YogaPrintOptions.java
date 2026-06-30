package com.facebook.yoga;

/* loaded from: classes.dex */
public enum YogaPrintOptions {
    LAYOUT(1),
    STYLE(2),
    CHILDREN(4);

    private final int mIntValue;

    YogaPrintOptions(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaPrintOptions fromInt(int i17) {
        if (i17 == 1) {
            return LAYOUT;
        }
        if (i17 == 2) {
            return STYLE;
        }
        if (i17 == 4) {
            return CHILDREN;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
