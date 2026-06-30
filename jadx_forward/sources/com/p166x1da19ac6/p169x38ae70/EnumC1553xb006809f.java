package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.LayoutPassReason */
/* loaded from: classes.dex */
public enum EnumC1553xb006809f {
    INITIAL(0),
    ABS_LAYOUT(1),
    STRETCH(2),
    MULTILINE_STRETCH(3),
    FLEX_LAYOUT(4),
    MEASURE(5),
    ABS_MEASURE(6),
    FLEX_MEASURE(7);


    /* renamed from: mIntValue */
    private final int f5092x46224e4f;

    EnumC1553xb006809f(int i17) {
        this.f5092x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1553xb006809f m16743xdc92efe5(int i17) {
        switch (i17) {
            case 0:
                return INITIAL;
            case 1:
                return ABS_LAYOUT;
            case 2:
                return STRETCH;
            case 3:
                return MULTILINE_STRETCH;
            case 4:
                return FLEX_LAYOUT;
            case 5:
                return MEASURE;
            case 6:
                return ABS_MEASURE;
            case 7:
                return FLEX_MEASURE;
            default:
                throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
        }
    }

    /* renamed from: intValue */
    public int m16746x2124a6c2() {
        return this.f5092x46224e4f;
    }
}
