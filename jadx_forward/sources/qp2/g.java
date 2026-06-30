package qp2;

/* loaded from: classes2.dex */
public final class g implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f447307d;

    /* renamed from: e, reason: collision with root package name */
    public final int f447308e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f447309f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f447310g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f447311h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f447312i;

    /* renamed from: m, reason: collision with root package name */
    public qp2.z f447313m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.s f447314n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f447315o;

    public g(android.content.Context context, int i17, java.lang.String byPass, java.lang.String encrypted_object_id, java.lang.String object_nonce_id, java.lang.String title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byPass, "byPass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encrypted_object_id, "encrypted_object_id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object_nonce_id, "object_nonce_id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f447307d = context;
        this.f447308e = i17;
        this.f447309f = byPass;
        this.f447310g = encrypted_object_id;
        this.f447311h = object_nonce_id;
        this.f447312i = title;
    }

    public final void a(r45.qt2 contextObj, boolean z17, boolean z18, yz5.s callback) {
        az2.w e17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        tq2.a aVar = tq2.d.f502763a;
        tq2.d.f502763a.c("startFetchTabs");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabFetcher", "fetch forcePermission:" + z17 + " isUseCache:" + z18);
        this.f447314n = callback;
        if (z18) {
            nq2.d dVar = nq2.d.f420513a;
            pq2.h hVar = nq2.d.f420514b;
            if (hVar != null) {
                rq2.s sVar = rq2.s.f480412a;
                boolean z19 = hVar.f439118n == pq2.a.f439107h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", "tickHasCacheFromClick isFromClick : " + rq2.s.f480415d + " hasCache: " + z19);
                if (rq2.s.f480415d) {
                    rq2.s.f480417f = z19;
                }
                int ordinal = hVar.f439118n.ordinal();
                if (ordinal == 1) {
                    hVar.f(new qp2.a(this, contextObj, z17));
                    return;
                } else if (ordinal == 5 && (e17 = hVar.e()) != null) {
                    mo815x76e0bfae(e17.f97691b, e17.f97690a, e17.f97692c, (com.p314xaae8f345.mm.p944x882e457a.m1) e17.f97693d);
                    return;
                }
            }
        }
        b(contextObj, z17, 2);
    }

    public final void b(r45.qt2 qt2Var, boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabFetcher", "fetchLiveSquareTabs, contextObj:" + qt2Var + " forcePermission:" + z17 + " invokeSource:" + i17);
        if (!z17) {
            c(qt2Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabFetcher", "fetchLiveSquareTabsForPermission, contextObj:" + qt2Var + " invokeSource:" + i17);
        qp2.d dVar = new qp2.d(this, qt2Var);
        qp2.e eVar = new qp2.e(this, qt2Var);
        ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class));
        if (!k0Var.N6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveSquareTabFetcher", "fetchLiveSquareTabsForPermission no location permission");
        } else if (c01.id.a() - k0Var.Q6() < 300000) {
            eVar.mo152xb9724478();
        } else {
            dVar.mo152xb9724478();
        }
    }

    public final void c(r45.qt2 qt2Var) {
        qp2.z zVar = new qp2.z(qt2Var, this.f447308e, this.f447309f, this.f447312i, this.f447310g, this.f447311h);
        this.f447313m = zVar;
        android.content.Context context = this.f447307d;
        zVar.f97688e = az2.c.a(az2.f.f97658d, context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L, null, 8, null);
        gm0.j1.d().a(4210, this);
        gm0.j1.d().g(this.f447313m);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabFetcher", "onSceneEnd handle NetSceneNearbyLiveSquareTabs, errType:" + i17 + " errCode:" + i18);
        gm0.j1.d().q(4210, this);
        if ((i17 != 0 || i18 != 0) && i18 != -200008) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NearbyLiveSquareTabFetcher", "onSceneEnd handle NetSceneNearbyLiveSquareTabs error");
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = ((qp2.z) scene).f447361h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveTabsResponse");
        tq2.d.f502763a.c("fetchTabsDone");
        pm0.v.X(new qp2.f((r45.h81) fVar, this));
    }
}
