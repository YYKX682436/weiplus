package kn1;

/* loaded from: classes12.dex */
public abstract class q {

    /* renamed from: a */
    public static kn1.p f391191a = kn1.p.f391187e;

    /* renamed from: b */
    public static kn1.n f391192b = kn1.n.f391176e;

    /* renamed from: c */
    public static final java.lang.String f391193c = "session_id";

    /* renamed from: d */
    public static int f391194d;

    public static final void a(kn1.m action, kn1.o status, java.lang.String extra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        b(action, status, extra, 0L, 0L, 0L, 0L);
    }

    public static final void b(kn1.m action, kn1.o status, java.lang.String extra, long j17, long j18, long j19, long j27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        java.lang.String u17 = r26.i0.u(extra, ',', ';', false, 4, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(f391191a.f391190d);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(f391192b.f391181d);
        int i17 = action.f391175d;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
        int i18 = status.f391186d;
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i18);
        java.lang.Long valueOf5 = java.lang.Long.valueOf(j17);
        java.lang.Long valueOf6 = java.lang.Long.valueOf(j18);
        java.lang.String str = f391193c;
        g0Var.d(26824, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, str, java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), u17, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a, java.lang.Integer.valueOf(f391194d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Report26824", "report26824: type = %d, paired_device = %d, action = %d, status = %d, costTime = %d, size = %d, sessionId = %s, size2 = %d, size3 = %d, extra = %s, rev = %s, buildTag = %s, protocolVer = %d", java.lang.Integer.valueOf(f391191a.f391190d), java.lang.Integer.valueOf(f391192b.f391181d), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), str, java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), u17, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, java.lang.Integer.valueOf(f391194d));
    }

    public static /* synthetic */ void c(kn1.m mVar, kn1.o oVar, java.lang.String str, long j17, long j18, long j19, long j27, int i17, java.lang.Object obj) {
        b((i17 & 1) != 0 ? kn1.m.f391165e : mVar, (i17 & 2) != 0 ? kn1.o.f391182e : oVar, (i17 & 4) != 0 ? "" : str, (i17 & 8) != 0 ? 0L : j17, (i17 & 16) != 0 ? 0L : j18, (i17 & 32) != 0 ? 0L : j19, (i17 & 64) == 0 ? j27 : 0L);
    }
}
