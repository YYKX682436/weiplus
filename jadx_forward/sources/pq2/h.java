package pq2;

/* loaded from: classes2.dex */
public final class h extends pq2.c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: o, reason: collision with root package name */
    public r45.qt2 f439129o;

    /* renamed from: p, reason: collision with root package name */
    public int f439130p;

    /* renamed from: q, reason: collision with root package name */
    public qp2.z f439131q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f439132r = "12";

    /* renamed from: s, reason: collision with root package name */
    public final oq2.a f439133s = new oq2.a();

    @Override // pq2.c
    public void b() {
        r45.qt2 qt2Var = this.f439129o;
        if (qt2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439111d, "fetchLiveSquareTabs, contextObj:" + qt2Var);
        this.f439117m.c("doScene");
        rq2.s sVar = rq2.s.f480412a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", "tickTabCgiStart");
        rq2.s.f480420i = c01.id.c();
        this.f439131q = new qp2.z(qt2Var, this.f439130p, null, null, null, null, 60, null);
        gm0.j1.d().a(4210, this);
        gm0.j1.d().g(this.f439131q);
    }

    @Override // pq2.c
    public void h() {
        java.lang.String memoryCacheFlag = this.f439132r;
        oq2.a aVar = this.f439133s;
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memoryCacheFlag, "memoryCacheFlag");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PreloadCacheManager", "getPreloadSquareTabsCache memoryCacheFlag:".concat(memoryCacheFlag));
        ey2.c3 c3Var = aVar.f428905a;
        c3Var.getClass();
        az2.w wVar = (az2.w) c3Var.f338868g.get(memoryCacheFlag);
        boolean z17 = true;
        if (wVar != null && !d(wVar)) {
            this.f439114g = wVar;
            c(wVar, pq2.f.f439127d);
            z17 = false;
        }
        if (z17) {
            super.h();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439111d, "startPreload return for use cache tabs.");
        }
    }

    @Override // pq2.c
    public void i() {
        gm0.j1.d().q(4210, this);
        super.i();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439111d, "onSceneEnd errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scene:" + scene);
        this.f439117m.c("onSceneEnd");
        rq2.s sVar = rq2.s.f480412a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", "tickTabCgiEnd");
        rq2.s.f480421j = c01.id.c() - rq2.s.f480420i;
        az2.w wVar = new az2.w(i17, i18, str, scene, android.os.SystemClock.elapsedRealtime());
        this.f439114g = wVar;
        java.lang.String memoryCacheFlag = this.f439132r;
        oq2.a aVar = this.f439133s;
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memoryCacheFlag, "memoryCacheFlag");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PreloadCacheManager", "storePreloadSquareTabsCache memoryCacheFlag:".concat(memoryCacheFlag));
        ey2.c3 c3Var = aVar.f428905a;
        c3Var.getClass();
        c3Var.f338868g.put(memoryCacheFlag, wVar);
        c(this.f439114g, new pq2.g(this));
    }
}
