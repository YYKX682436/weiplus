package u94;

/* loaded from: classes4.dex */
public class o implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f507411d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f507412e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f507413f;

    /* renamed from: g, reason: collision with root package name */
    public final int f507414g;

    /* renamed from: h, reason: collision with root package name */
    public final w64.k f507415h;

    public o(u94.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, w64.k kVar) {
        this.f507411d = new java.lang.ref.WeakReference(pVar);
        this.f507412e = c17702x544f64e9;
        this.f507413f = c17933xe8d1b226;
        this.f507414g = i17;
        this.f507415h = kVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HalfSubscribeController", "onSceneEnd errType %d,errCode %d,errMsg %s,scene %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        try {
            if (m1Var instanceof ib4.j) {
                java.lang.ref.WeakReference weakReference = this.f507411d;
                if (weakReference != null && weakReference.get() != null) {
                    u94.p pVar = (u94.p) weakReference.get();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    pVar.f507416a = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new u94.l(this, pVar));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    android.content.Context context = pVar.f507419d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    int i19 = this.f507414g;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f507412e;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f507413f;
                    if (i17 == 0 && i18 == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HalfSubscribeController", "subscribe is success");
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new u94.m(this, context));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.k(ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e), java.lang.String.valueOf(1));
                        o94.c.b(c17933xe8d1b226, i19, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x2(c17702x544f64e9.f244130o, c17702x544f64e9.f244116h, 1, 0));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HalfSubscribeController", "subscribe is failed");
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new u94.n(this, context));
                        o94.c.b(c17933xe8d1b226, i19, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x2(c17702x544f64e9.f244130o, c17702x544f64e9.f244116h, 1, -3));
                    }
                    gm0.j1.d().q(m1Var.mo808xfb85f7b0(), this);
                }
                gm0.j1.d().q(m1Var.mo808xfb85f7b0(), this);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                return;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HalfSubscribeController", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
    }
}
