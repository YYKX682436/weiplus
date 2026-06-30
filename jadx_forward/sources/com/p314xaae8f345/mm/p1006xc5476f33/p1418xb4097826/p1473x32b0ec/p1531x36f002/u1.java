package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes2.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.p f197247a;

    public u1(int[] colors, float[] fArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colors, "colors");
        if (colors.length == 1) {
            int i17 = colors[0];
            colors = new int[]{i17, i17};
        }
        this.f197247a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t1(colors, fArr);
    }

    public final android.graphics.LinearGradient a(int i17, int i18) {
        return (android.graphics.LinearGradient) this.f197247a.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public u1(yz5.p customGradientCreator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customGradientCreator, "customGradientCreator");
        this.f197247a = customGradientCreator;
    }
}
