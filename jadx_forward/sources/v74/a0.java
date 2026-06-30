package v74;

/* loaded from: classes4.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.k0 f515292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f515293e;

    public a0(v74.k0 k0Var, android.view.View view) {
        this.f515292d = k0Var;
        this.f515293e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        w64.n nVar;
        i64.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnOverScrollActionListener$1$onActionUp$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$handleSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        v74.k0 k0Var = this.f515292d;
        k0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", "handleSlideJump");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = k0Var.f515371d;
        v74.m mVar = (c17933xe8d1b2262 == null || (m70354x74235b3e2 = c17933xe8d1b2262.m70354x74235b3e()) == null) ? null : m70354x74235b3e2.f38191xf4087299;
        if ((mVar != null ? mVar.d() : null) == null || (c17933xe8d1b226 = k0Var.f515371d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookLogic", "slideActionInfo==null or snsInfo==null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e3 = c17933xe8d1b226.m70354x74235b3e();
            s34.x xVar = m70354x74235b3e3 != null ? m70354x74235b3e3.f38171x7a21d490 : null;
            android.view.View view = this.f515293e;
            if (xVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", "slideJump with animation");
                t34.g gVar = new t34.g();
                gVar.f(k0Var.f515368a);
                gVar.e(k0Var.f515371d);
                gVar.c(mVar != null ? mVar.d() : null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = k0Var.f515371d;
                gVar.a((c17933xe8d1b2263 == null || (m70354x74235b3e = c17933xe8d1b2263.m70354x74235b3e()) == null) ? null : m70354x74235b3e.f38171x7a21d490);
                gVar.b(new v74.v(view));
                v74.t tVar = k0Var.f515385r;
                if (tVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
                    b1Var = tVar.f515446b;
                } else {
                    b1Var = null;
                }
                gVar.d(b1Var);
                gVar.g(k0Var.f515370c);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookPagAnimLogic", "adIdKeyReport:1");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46351xef4fad50, 1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", "slideJump normal");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
                if (mVar.d() != null && k0Var.f515371d != null && (nVar = k0Var.f515372e) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", "doSlideJump");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCardAnimPrepareListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                    nVar.f524852l = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardAnimPrepareListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                    nVar.p(new w64.c(mVar.d(), k0Var.f515371d, 0, null, false, ca4.m0.Y(k0Var.f515371d) ? 1 : 2, false, null, 220, null));
                    nVar.k(view);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookPagAnimLogic", "adIdKeyReport:2");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46351xef4fad50, 2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$handleSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnOverScrollActionListener$1$onActionUp$1");
    }
}
