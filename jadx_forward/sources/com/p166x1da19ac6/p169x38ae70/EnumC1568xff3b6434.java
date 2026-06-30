package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaLayoutType */
/* loaded from: classes.dex */
public enum EnumC1568xff3b6434 {
    LAYOUT(0),
    MEASURE(1),
    CACHED_LAYOUT(2),
    CACHED_MEASURE(3);


    /* renamed from: mIntValue */
    private final int f5147x46224e4f;

    EnumC1568xff3b6434(int i17) {
        this.f5147x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1568xff3b6434 m16813xdc92efe5(int i17) {
        if (i17 == 0) {
            return LAYOUT;
        }
        if (i17 == 1) {
            return MEASURE;
        }
        if (i17 == 2) {
            return CACHED_LAYOUT;
        }
        if (i17 == 3) {
            return CACHED_MEASURE;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    /* renamed from: intValue */
    public int m16816x2124a6c2() {
        return this.f5147x46224e4f;
    }
}
