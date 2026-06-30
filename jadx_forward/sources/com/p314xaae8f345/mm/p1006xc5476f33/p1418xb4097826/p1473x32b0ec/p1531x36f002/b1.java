package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes14.dex */
public final class b1 {

    /* renamed from: b, reason: collision with root package name */
    public static final float f196978b = (float) (java.lang.Math.log(0.78d) / java.lang.Math.log(0.9d));

    /* renamed from: c, reason: collision with root package name */
    public static final float f196979c = android.view.ViewConfiguration.getScrollFriction();

    /* renamed from: a, reason: collision with root package name */
    public final float f196980a;

    public b1(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f196980a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
    }

    public final double a(int i17) {
        float abs = java.lang.Math.abs(i17) * 0.35f;
        float f17 = f196979c;
        float f18 = this.f196980a;
        double log = java.lang.Math.log(abs / (f17 * f18));
        float f19 = f196978b;
        return java.lang.Math.exp(log * (f19 / (f19 - 1.0d))) * f17 * f18;
    }

    public final int b(double d17) {
        double d18 = f196978b;
        float f17 = f196979c;
        return java.lang.Math.abs((int) (((java.lang.Math.exp(((d18 - 1.0d) * java.lang.Math.log(d17 / (f17 * r5))) / d18) * f17) * this.f196980a) / 0.3499999940395355d));
    }
}
