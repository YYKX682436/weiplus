package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaUnit */
/* loaded from: classes15.dex */
public enum EnumC1585xc25ea834 {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);


    /* renamed from: mIntValue */
    private final int f5247x46224e4f;

    EnumC1585xc25ea834(int i17) {
        this.f5247x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834 m17064xdc92efe5(int i17) {
        if (i17 == 0) {
            return UNDEFINED;
        }
        if (i17 == 1) {
            return POINT;
        }
        if (i17 == 2) {
            return PERCENT;
        }
        if (i17 == 3) {
            return AUTO;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    /* renamed from: intValue */
    public int m17067x2124a6c2() {
        return this.f5247x46224e4f;
    }
}
