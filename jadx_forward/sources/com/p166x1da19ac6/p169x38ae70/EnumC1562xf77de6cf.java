package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaDirection */
/* loaded from: classes11.dex */
public enum EnumC1562xf77de6cf {
    INHERIT(0),
    LTR(1),
    RTL(2);


    /* renamed from: mIntValue */
    private final int f5113x46224e4f;

    EnumC1562xf77de6cf(int i17) {
        this.f5113x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1562xf77de6cf m16777xdc92efe5(int i17) {
        if (i17 == 0) {
            return INHERIT;
        }
        if (i17 == 1) {
            return LTR;
        }
        if (i17 == 2) {
            return RTL;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    /* renamed from: intValue */
    public int m16780x2124a6c2() {
        return this.f5113x46224e4f;
    }
}
