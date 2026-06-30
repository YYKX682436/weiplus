package v74;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.g f515305d;

    public d(v74.g gVar) {
        this.f515305d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$mOnClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMRecyclerView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            v74.g gVar = this.f515305d;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = gVar.f515322h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMRecyclerView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            int u07 = c1163xf1deaba4 != null ? c1163xf1deaba4.u0(view) : -1;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick, pos=");
            sb6.append(u07);
            sb6.append(", itemCount=");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMLookbookCardInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMLookbookCardInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            sb6.append(gVar.f515321g.c().size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", sb6.toString());
            if (gVar.x(u07) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMOnItemClickListener$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
                v74.c cVar = gVar.f515328q;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMOnItemClickListener$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
                if (cVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnItemClickListener$1");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", "onItemClick, pos=" + u07);
                    v74.k0 k0Var = ((v74.z) cVar).f515479a;
                    if (k0Var.h(view, u07)) {
                        v74.v0 a17 = v74.k0.a(k0Var);
                        a17.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
                        v74.u0 d17 = a17.d(u07);
                        int a18 = d17.a() + 1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                        d17.f515462h = a18;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookStatistic", "onItemClick, pos=" + u07 + ", total=" + a17.d(u07).a());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookLogic", "onItemClick failed, pos=" + u07);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnItemClickListener$1");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookLogic", "onClick, itemInfo==null");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$mOnClickListener$1");
    }
}
