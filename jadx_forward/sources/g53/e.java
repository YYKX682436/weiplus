package g53;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final g53.e f350438a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f350439b;

    /* renamed from: c, reason: collision with root package name */
    public static final nf.r f350440c;

    /* renamed from: d, reason: collision with root package name */
    public static final nf.r f350441d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f350442e;

    /* renamed from: f, reason: collision with root package name */
    public static g53.b f350443f;

    static {
        g53.e eVar = f350438a;
        f350439b = new f06.v[]{p3321xbce91901.jvm.p3324x21ffc6bd.i0.c(new p3321xbce91901.jvm.p3324x21ffc6bd.s(eVar, g53.e.class, "needPreload", "getNeedPreload()Z", 0)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.c(new p3321xbce91901.jvm.p3324x21ffc6bd.s(eVar, g53.e.class, "isCgiDone", "isCgiDone()Z", 0))};
        f350438a = new g53.e();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        f350440c = new nf.r(bool, "isGameH5CgiNeedPreload");
        f350441d = new nf.r(bool, "isGameH5CgiDone");
        f350442e = jz5.h.a(jz5.i.f384364f, g53.c.f350436d);
    }

    public static final boolean b() {
        return ((java.lang.Boolean) f350440c.b(f350438a, f350439b[0])).booleanValue();
    }

    public static final void c(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        f350440c.c(f350438a, f350439b[0], java.lang.Boolean.TRUE);
        d(false);
        m53.f2 f2Var = new m53.f2();
        f2Var.f405208d = url;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/mmgame-bin/getgameindexpreload";
        lVar.f152200d = 5089;
        lVar.f152197a = f2Var;
        lVar.f152198b = new m53.g2();
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new g53.d(currentTimeMillis), false);
    }

    public static final void d(boolean z17) {
        f350441d.c(f350438a, f350439b[1], java.lang.Boolean.valueOf(z17));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1746x633fb29.C15897x3884718 a() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1746x633fb29.C15897x3884718) f350442e.mo141623x754a37bb();
    }
}
