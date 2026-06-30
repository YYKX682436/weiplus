package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class i2 {

    /* renamed from: b, reason: collision with root package name */
    public static r45.w11 f183780b;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i2 f183779a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f183781c = kz5.c0.i(1, 2, 5, 9, 11);

    public final void a(r45.xb1 resp) {
        r45.w11 w11Var;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(30);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFinder_config_item(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            w11Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj).m75945x2fec8307(0), "enhance_config")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        if (yy0Var != null) {
            w11Var = new r45.w11();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = yy0Var.m75934xbce7f2f(1);
            if (m75934xbce7f2f != null) {
                w11Var.mo11468x92b714fd(m75934xbce7f2f.g());
            }
        }
        f183780b = w11Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderEnhanceUtils", "initEnhanceConfig liveRefreshConfig: " + f183780b);
    }
}
