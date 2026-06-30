package u94;

/* loaded from: classes4.dex */
public class c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f507370d;

    /* renamed from: e, reason: collision with root package name */
    public final int f507371e;

    public c(u94.f fVar, int i17, u94.a aVar) {
        this.f507370d = new java.lang.ref.WeakReference(fVar);
        this.f507371e = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
        if ((m1Var instanceof ab0.s) || (m1Var instanceof ns.l)) {
            if (m1Var.mo808xfb85f7b0() != 30 && m1Var.mo808xfb85f7b0() != 667) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HalfScreenAddBrandController", "not expected scene,  type = " + m1Var.mo808xfb85f7b0());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                return;
            }
            if ((m1Var instanceof ns.l) && ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) ((ns.l) m1Var)).f270913g != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HalfScreenAddBrandController", "not opcode addcontact!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y.b(this);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HalfScreenAddBrandController", "catch add Contact errCode: %d && errMsg: %s", java.lang.Integer.valueOf(i18), str);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new u94.b(this, i17, i18, m1Var, str));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
    }
}
