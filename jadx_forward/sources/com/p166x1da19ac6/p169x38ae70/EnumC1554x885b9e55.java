package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaAlign */
/* loaded from: classes15.dex */
public enum EnumC1554x885b9e55 {
    AUTO(0),
    FLEX_START(1),
    CENTER(2),
    FLEX_END(3),
    STRETCH(4),
    BASELINE(5),
    SPACE_BETWEEN(6),
    SPACE_AROUND(7);


    /* renamed from: mIntValue */
    private final int f5102x46224e4f;

    EnumC1554x885b9e55(int i17) {
        this.f5102x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1554x885b9e55 m16749xdc92efe5(int i17) {
        switch (i17) {
            case 0:
                return AUTO;
            case 1:
                return FLEX_START;
            case 2:
                return CENTER;
            case 3:
                return FLEX_END;
            case 4:
                return STRETCH;
            case 5:
                return BASELINE;
            case 6:
                return SPACE_BETWEEN;
            case 7:
                return SPACE_AROUND;
            default:
                throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
        }
    }

    /* renamed from: intValue */
    public int m16752x2124a6c2() {
        return this.f5102x46224e4f;
    }
}
