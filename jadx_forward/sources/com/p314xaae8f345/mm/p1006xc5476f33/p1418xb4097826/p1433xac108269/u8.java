package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class u8 {

    /* renamed from: b, reason: collision with root package name */
    public static long f184133b;

    /* renamed from: c, reason: collision with root package name */
    public static long f184134c;

    /* renamed from: d, reason: collision with root package name */
    public static long f184135d;

    /* renamed from: e, reason: collision with root package name */
    public static long f184136e;

    /* renamed from: f, reason: collision with root package name */
    public static long f184137f;

    /* renamed from: h, reason: collision with root package name */
    public static int f184139h;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8 f184132a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8();

    /* renamed from: g, reason: collision with root package name */
    public static int f184138g = 1;

    public static /* synthetic */ void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8 u8Var, gk2.e eVar, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            i18 = 0;
        }
        u8Var.b(eVar, i17, i18, (i19 & 8) != 0 ? "" : str, (i19 & 16) != 0 ? "" : str2);
    }

    public final void a(long j17, long j18, long j19, java.lang.String snn, int i17, int i18, int i19, java.lang.String statistics, int i27, int i28, java.lang.String liveEventMsg, java.lang.String extra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snn, "snn");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statistics, "statistics");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveEventMsg, "liveEventMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        zy2.qa qaVar = (zy2.qa) i95.n0.c(zy2.qa.class);
        long j27 = f184133b;
        long j28 = f184134c - j27;
        long j29 = f184135d - j27;
        long j37 = f184136e - j27;
        long j38 = f184138g;
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c01.z1.r() + f184133b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) qaVar).Bk(1, j18, j19, i17, 0, j27, j28, j29, j37, i18, i19, statistics, 0, 0, "", i27, i28, liveEventMsg, extra, snn, j17, j38, a17);
    }

    public final void b(gk2.e buContext, int i17, int i18, java.lang.String msg, java.lang.String extra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        long m75939xb282bd08 = ((mm2.e1) buContext.a(mm2.e1.class)).f410521r.m75939xb282bd08(4);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((mm2.e1) buContext.a(mm2.e1.class)).f410521r.m75939xb282bd08(6));
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : c01.id.e();
        long m75942xfb822ef2 = ((mm2.e1) buContext.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        long j17 = intValue - m75939xb282bd08;
        java.lang.String str = ((mm2.e1) buContext.a(mm2.e1.class)).f410527x;
        boolean N6 = ((mm2.f6) buContext.a(mm2.f6.class)).N6();
        int i19 = ((mm2.c1) buContext.a(mm2.c1.class)).f410346h2;
        int i27 = ((mm2.c1) buContext.a(mm2.c1.class)).f410340g2;
        java.lang.String str2 = ((mm2.c1) buContext.a(mm2.c1.class)).f410400q2;
        if (str2 == null) {
            str2 = "";
        }
        a(m75942xfb822ef2, m75939xb282bd08, j17, str, N6 ? 1 : 0, i19, i27, str2, i17, i18, msg, extra);
    }
}
