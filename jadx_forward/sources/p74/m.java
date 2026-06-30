package p74;

/* loaded from: classes4.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p74.o f434100d;

    public m(p74.o oVar) {
        this.f434100d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic$mTouchActionListener$1$onActionUp$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardOverSlideLeftLogic", "onActionUp, doSlideJump");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        p74.o oVar = this.f434100d;
        android.content.Context context = oVar.f434102a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic$mTouchActionListener$1$onActionUp$1");
            return;
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic$mTouchActionListener$1$onActionUp$1");
                return;
            }
        }
        q74.b0 b0Var = p74.o.a(oVar).f434065g;
        if (b0Var != null) {
            b0Var.e();
        }
        oVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        p74.d dVar = oVar.f434103b;
        w64.n nVar = dVar.f434064f;
        if (nVar != null) {
            int i17 = ca4.m0.Y(oVar.f434105d) ? 1 : 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardOverSlideLeftLogic", "doSlideJump, nativeSightType=" + i17);
            s34.a1 a1Var = oVar.f434106e;
            nVar.p(new w64.c(a1Var != null ? a1Var.f76694x80bfd259 : null, oVar.f434105d, 0, null, false, i17, false, null, 220, null));
            nVar.k(dVar.f434059a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic$mTouchActionListener$1$onActionUp$1");
    }
}
