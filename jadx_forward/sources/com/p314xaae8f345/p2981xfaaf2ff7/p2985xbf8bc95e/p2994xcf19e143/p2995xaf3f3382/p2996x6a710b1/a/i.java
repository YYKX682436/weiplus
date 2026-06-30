package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static double f296932a = 6378137.0d;

    /* renamed from: b, reason: collision with root package name */
    public final double f296933b;

    public i() {
        this.f296933b = f296932a * 6.283185307179586d;
    }

    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h a(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26) {
        double m37196x79d7af9 = (c4406x873d1d26.m37196x79d7af9() / 360.0d) + 0.5d;
        double sin = java.lang.Math.sin(java.lang.Math.toRadians(c4406x873d1d26.m37195x2605e9e2()));
        double log = ((java.lang.Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d17 = this.f296933b;
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h(m37196x79d7af9 * d17, log * d17);
    }

    public i(double d17) {
        this.f296933b = d17;
    }

    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar) {
        double d17 = hVar.f296930a;
        double d18 = this.f296933b;
        return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(90.0d - java.lang.Math.toDegrees(java.lang.Math.atan(java.lang.Math.exp(((-(0.5d - (hVar.f296931b / d18))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d17 / d18) - 0.5d) * 360.0d);
    }

    public double a(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d262) {
        double m37196x79d7af9 = c4406x873d1d26.m37196x79d7af9();
        double d17 = m37196x79d7af9 * 0.01745329251994329d;
        double m37195x2605e9e2 = c4406x873d1d26.m37195x2605e9e2() * 0.01745329251994329d;
        double m37196x79d7af92 = c4406x873d1d262.m37196x79d7af9() * 0.01745329251994329d;
        double m37195x2605e9e22 = c4406x873d1d262.m37195x2605e9e2() * 0.01745329251994329d;
        double sin = java.lang.Math.sin(d17);
        double sin2 = java.lang.Math.sin(m37195x2605e9e2);
        double cos = java.lang.Math.cos(d17);
        double cos2 = java.lang.Math.cos(m37195x2605e9e2);
        double sin3 = java.lang.Math.sin(m37196x79d7af92);
        double sin4 = java.lang.Math.sin(m37195x2605e9e22);
        double cos3 = java.lang.Math.cos(m37196x79d7af92);
        double cos4 = java.lang.Math.cos(m37195x2605e9e22);
        double[] dArr = {cos * cos2, cos2 * sin, sin2};
        double d18 = cos3 * cos4;
        double d19 = cos4 * sin3;
        double d27 = dArr[0];
        double d28 = (d27 - d18) * (d27 - d18);
        double d29 = dArr[1];
        double d37 = dArr[2];
        return java.lang.Math.asin(java.lang.Math.sqrt((d28 + ((d29 - d19) * (d29 - d19))) + ((d37 - sin4) * (d37 - sin4))) / 2.0d) * this.f296933b * 3.141592653589793d;
    }
}
