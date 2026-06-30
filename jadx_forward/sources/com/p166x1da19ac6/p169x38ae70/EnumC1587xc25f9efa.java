package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaWrap */
/* loaded from: classes15.dex */
public enum EnumC1587xc25f9efa {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);


    /* renamed from: mIntValue */
    private final int f5258x46224e4f;

    EnumC1587xc25f9efa(int i17) {
        this.f5258x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1587xc25f9efa m17076xdc92efe5(int i17) {
        if (i17 == 0) {
            return NO_WRAP;
        }
        if (i17 == 1) {
            return WRAP;
        }
        if (i17 == 2) {
            return WRAP_REVERSE;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    /* renamed from: intValue */
    public int m17079x2124a6c2() {
        return this.f5258x46224e4f;
    }
}
