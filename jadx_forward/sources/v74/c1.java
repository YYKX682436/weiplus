package v74;

/* loaded from: classes4.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.h1 f515304d;

    public c1(v74.h1 h1Var) {
        this.f515304d = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$1$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/SplashCardLogic$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashCardLogic", "onClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        v74.h1 h1Var = this.f515304d;
        v74.v0 v0Var = h1Var.f515336c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        v0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSplashCardClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        v74.u0 u0Var = v0Var.f515471h;
        if (u0Var != null) {
            int a17 = u0Var.a() + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
            u0Var.f515462h = a17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookStatistic.splashCard", "onSplashCardClick, clickCount=" + u0Var.a());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookStatistic.splashCard", "onSplashCardClick, data==null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSplashCardClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMOnCardClickAction$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        yz5.l lVar = h1Var.f515342i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMOnCardClickAction$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        if (lVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            lVar.mo146xb9724478(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/SplashCardLogic$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$1$1");
    }
}
