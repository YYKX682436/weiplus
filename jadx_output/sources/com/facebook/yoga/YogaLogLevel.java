package com.facebook.yoga;

/* loaded from: classes5.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);

    private final int mIntValue;

    YogaLogLevel(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaLogLevel fromInt(int i17) {
        if (i17 == 0) {
            return ERROR;
        }
        if (i17 == 1) {
            return WARN;
        }
        if (i17 == 2) {
            return INFO;
        }
        if (i17 == 3) {
            return DEBUG;
        }
        if (i17 == 4) {
            return VERBOSE;
        }
        if (i17 == 5) {
            return FATAL;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
