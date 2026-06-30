package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class u8 {

    /* renamed from: b, reason: collision with root package name */
    public static long f102600b;

    /* renamed from: c, reason: collision with root package name */
    public static long f102601c;

    /* renamed from: d, reason: collision with root package name */
    public static long f102602d;

    /* renamed from: e, reason: collision with root package name */
    public static long f102603e;

    /* renamed from: f, reason: collision with root package name */
    public static long f102604f;

    /* renamed from: h, reason: collision with root package name */
    public static int f102606h;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.u8 f102599a = new com.tencent.mm.plugin.finder.assist.u8();

    /* renamed from: g, reason: collision with root package name */
    public static int f102605g = 1;

    public static /* synthetic */ void c(com.tencent.mm.plugin.finder.assist.u8 u8Var, gk2.e eVar, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            i18 = 0;
        }
        u8Var.b(eVar, i17, i18, (i19 & 8) != 0 ? "" : str, (i19 & 16) != 0 ? "" : str2);
    }

    public final void a(long j17, long j18, long j19, java.lang.String snn, int i17, int i18, int i19, java.lang.String statistics, int i27, int i28, java.lang.String liveEventMsg, java.lang.String extra) {
        kotlin.jvm.internal.o.g(snn, "snn");
        kotlin.jvm.internal.o.g(statistics, "statistics");
        kotlin.jvm.internal.o.g(liveEventMsg, "liveEventMsg");
        kotlin.jvm.internal.o.g(extra, "extra");
        zy2.qa qaVar = (zy2.qa) i95.n0.c(zy2.qa.class);
        long j27 = f102600b;
        long j28 = f102601c - j27;
        long j29 = f102602d - j27;
        long j37 = f102603e - j27;
        long j38 = f102605g;
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(c01.z1.r() + f102600b);
        kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
        ((com.tencent.mm.plugin.finder.report.o3) qaVar).Bk(1, j18, j19, i17, 0, j27, j28, j29, j37, i18, i19, statistics, 0, 0, "", i27, i28, liveEventMsg, extra, snn, j17, j38, a17);
    }

    public final void b(gk2.e buContext, int i17, int i18, java.lang.String msg, java.lang.String extra) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(extra, "extra");
        long integer = ((mm2.e1) buContext.a(mm2.e1.class)).f328988r.getInteger(4);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((mm2.e1) buContext.a(mm2.e1.class)).f328988r.getInteger(6));
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : c01.id.e();
        long j17 = ((mm2.e1) buContext.a(mm2.e1.class)).f328988r.getLong(0);
        long j18 = intValue - integer;
        java.lang.String str = ((mm2.e1) buContext.a(mm2.e1.class)).f328994x;
        boolean N6 = ((mm2.f6) buContext.a(mm2.f6.class)).N6();
        int i19 = ((mm2.c1) buContext.a(mm2.c1.class)).f328813h2;
        int i27 = ((mm2.c1) buContext.a(mm2.c1.class)).f328807g2;
        java.lang.String str2 = ((mm2.c1) buContext.a(mm2.c1.class)).f328867q2;
        if (str2 == null) {
            str2 = "";
        }
        a(j17, integer, j18, str, N6 ? 1 : 0, i19, i27, str2, i17, i18, msg, extra);
    }
}
