package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaFlexDirection */
/* loaded from: classes15.dex */
public enum EnumC1566x8b1dc6d6 {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);


    /* renamed from: mIntValue */
    private final int f5133x46224e4f;

    EnumC1566x8b1dc6d6(int i17) {
        this.f5133x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1566x8b1dc6d6 m16801xdc92efe5(int i17) {
        if (i17 == 0) {
            return COLUMN;
        }
        if (i17 == 1) {
            return COLUMN_REVERSE;
        }
        if (i17 == 2) {
            return ROW;
        }
        if (i17 == 3) {
            return ROW_REVERSE;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    /* renamed from: intValue */
    public int m16804x2124a6c2() {
        return this.f5133x46224e4f;
    }
}
