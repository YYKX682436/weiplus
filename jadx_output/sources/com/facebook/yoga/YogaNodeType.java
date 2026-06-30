package com.facebook.yoga;

/* loaded from: classes.dex */
public enum YogaNodeType {
    DEFAULT(0),
    TEXT(1);

    private final int mIntValue;

    YogaNodeType(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaNodeType fromInt(int i17) {
        if (i17 == 0) {
            return DEFAULT;
        }
        if (i17 == 1) {
            return TEXT;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
