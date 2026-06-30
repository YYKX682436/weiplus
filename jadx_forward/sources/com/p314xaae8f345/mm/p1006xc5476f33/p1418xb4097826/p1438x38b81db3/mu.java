package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public abstract class mu extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f185581e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lu.f185481d);

    public final java.lang.String n(int i17) {
        if (((java.lang.Boolean) ((jz5.n) this.f185581e).mo141623x754a37bb()).booleanValue()) {
            java.lang.String string = i17 < 10000 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lge, java.lang.Integer.valueOf(i17)) : i17 < 100000 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lga, java.lang.Double.valueOf(((i17 * 1.0f) / 10000) - 0.05d)) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgc, 10);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        if (i17 < 10000) {
            return java.lang.String.valueOf(i17);
        }
        if (i17 < 100000) {
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgb, java.lang.Double.valueOf(((i17 * 1.0f) / 1000) - 0.05d));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            return string2;
        }
        java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgd, 100);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
        return string3;
    }
}
