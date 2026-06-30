package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes3.dex */
public final class iz implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk<java.lang.Object> {
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk
    public final java.lang.Object a(float f17, java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Integer) obj).intValue();
        int i17 = intValue >> 24;
        int i18 = (intValue >> 16) & 255;
        int i19 = (intValue >> 8) & 255;
        int i27 = intValue & 255;
        int intValue2 = ((java.lang.Integer) obj2).intValue();
        return java.lang.Integer.valueOf(((i17 + ((int) (((intValue2 >> 24) - i17) * f17))) << 24) | ((i18 + ((int) ((((intValue2 >> 16) & 255) - i18) * f17))) << 16) | ((i19 + ((int) ((((intValue2 >> 8) & 255) - i19) * f17))) << 8) | (i27 + ((int) (f17 * ((intValue2 & 255) - i27)))));
    }
}
