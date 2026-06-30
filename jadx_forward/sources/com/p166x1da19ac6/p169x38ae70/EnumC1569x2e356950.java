package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaLogLevel */
/* loaded from: classes5.dex */
public enum EnumC1569x2e356950 {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);


    /* renamed from: mIntValue */
    private final int f5155x46224e4f;

    EnumC1569x2e356950(int i17) {
        this.f5155x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1569x2e356950 m16819xdc92efe5(int i17) {
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

    /* renamed from: intValue */
    public int m16822x2124a6c2() {
        return this.f5155x46224e4f;
    }
}
