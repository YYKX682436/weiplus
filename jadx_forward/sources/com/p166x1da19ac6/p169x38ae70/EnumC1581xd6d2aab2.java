package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaOverflow */
/* loaded from: classes11.dex */
public enum EnumC1581xd6d2aab2 {
    VISIBLE(0),
    HIDDEN(1),
    SCROLL(2);


    /* renamed from: mIntValue */
    private final int f5192x46224e4f;

    EnumC1581xd6d2aab2(int i17) {
        this.f5192x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1581xd6d2aab2 m17046xdc92efe5(int i17) {
        if (i17 == 0) {
            return VISIBLE;
        }
        if (i17 == 1) {
            return HIDDEN;
        }
        if (i17 == 2) {
            return SCROLL;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    /* renamed from: intValue */
    public int m17049x2124a6c2() {
        return this.f5192x46224e4f;
    }
}
