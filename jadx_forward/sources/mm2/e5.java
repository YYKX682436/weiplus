package mm2;

/* loaded from: classes3.dex */
public final class e5 extends mm2.e {

    /* renamed from: o, reason: collision with root package name */
    public static int f410534o = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_SPEED_INT_SYNC, 400);

    /* renamed from: f, reason: collision with root package name */
    public volatile r45.b94 f410535f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f410536g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f410537h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f410538i;

    /* renamed from: m, reason: collision with root package name */
    public final mm2.y4 f410539m;

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f410540n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        r45.b94 b94Var = new r45.b94();
        b94Var.set(0, 100);
        b94Var.set(10, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_INT_SYNC, 400)));
        b94Var.set(11, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_COUNT_INT_SYNC, 1)));
        b94Var.set(12, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_SPEED_INT_SYNC, 400)));
        this.f410535f = b94Var;
        this.f410537h = kz5.c0.i(1, 20002, 20032, 20034, 20035, 20124);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("MMFinder.LiveMsgSpeedControlSlice_HANDLER");
        n3Var.m77789xc5a5549d(false);
        this.f410538i = n3Var;
        this.f410539m = new mm2.y4();
    }

    public final void N6(yz5.l onMsgInCacheTimeExpired) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onMsgInCacheTimeExpired, "onMsgInCacheTimeExpired");
        this.f410536g = onMsgInCacheTimeExpired;
    }

    public final void O6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveMsgSpeedControlSlice", "[onMiniWindow]");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f410540n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f410540n = null;
        this.f410538i.mo50302x6b17ad39(null);
        this.f410536g = null;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveMsgSpeedControlSlice", "[onCleared]");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f410540n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f410540n = null;
        this.f410538i.mo50302x6b17ad39(null);
        pm0.v.L("MMFinder.LiveMsgSpeedControlSlice", true, new mm2.d5(this));
        this.f410536g = null;
    }
}
