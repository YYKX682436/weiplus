package ug0;

/* loaded from: classes8.dex */
public final class q extends jm0.g {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f509003i;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f509004m;

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f509005n;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f509006f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.t2 f509007g;

    /* renamed from: h, reason: collision with root package name */
    public final tg0.u1 f509008h;

    static {
        com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20686x4bce7a5e c20686x4bce7a5e = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20686x4bce7a5e();
        bm5.o1 o1Var = bm5.o1.f104252a;
        boolean z17 = false;
        if (o1Var.h(c20686x4bce7a5e) == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "isCommonSyncRedDotEnabled: false, disabled by Repairer.");
        } else if (o1Var.h(c20686x4bce7a5e) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "isCommonSyncRedDotEnabled: true, enabled by Repairer.");
            z17 = true;
        } else {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).sj(e42.c0.clicfg_android_search_tabtips_reddot, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "isCommonSyncRedDotEnabled: " + z17);
        }
        f509005n = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f509006f = jz5.h.b(ug0.j.f508993d);
        this.f509007g = new ug0.k(this);
        this.f509008h = new wg0.a();
    }

    public static final ug0.q T6(jm0.o hostService) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hostService, "hostService");
        if (!jm0.g.class.isAssignableFrom(ug0.q.class)) {
            throw new java.lang.IllegalArgumentException(hostService.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(hostService.getViewModel(), new jm0.e(hostService)).a(ug0.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (ug0.q) ((jm0.g) a17);
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onAccountInit");
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        ((mn3.h) ((ra0.u) i95.n0.c(ra0.u.class))).aj();
        ((mn3.h) ((ra0.u) i95.n0.c(ra0.u.class))).Zi();
        if (!f509005n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onAccountInit, CommonSyncRedDot not enabled, skipped observing.");
            return;
        }
        pm0.v.X(new ug0.o(this));
        O6(new ug0.p(this));
        com.p314xaae8f345.mm.app.w.INSTANCE.a(this.f509007g);
        f70.e eVar = (f70.e) i95.n0.c(f70.e.class);
        xg0.a aVar = new xg0.a();
        ((h70.a) eVar).getClass();
        w71.l1.f524951a.add(aVar);
        ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).Ai();
        U6(3006, 8, false, null);
    }

    @Override // jm0.g
    public void S6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onAccountRelease");
        com.p314xaae8f345.mm.app.w.INSTANCE.p(this.f509007g);
    }

    public final void U6(int i17, int i18, boolean z17, byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nativeSync, syncScene: ");
        sb6.append(i17);
        sb6.append(", shouldCheckConfig: ");
        sb6.append(z17);
        sb6.append(", contextBufferSize: ");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", sb6.toString());
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a Bi = this.f381800d.Bi();
        if (Bi != null) {
            v65.i.b(Bi, null, new ug0.l(z17, i18, i17, bArr, null), 1, null);
        }
    }
}
