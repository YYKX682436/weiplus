package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class c2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2 f250285d;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2 f2Var) {
        this.f250285d = f2Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$adExposeListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/OldVersionUIC$adExposeListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSnsAdStatistic$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2 f2Var = this.f250285d;
        i64.b1 b1Var = f2Var.f250327d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSnsAdStatistic$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        b1Var.e(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSnsAdStatistic$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSnsAdStatistic$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        boolean z17 = i17 == 0;
        i64.b1 b1Var2 = f2Var.f250327d;
        b1Var2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        b1Var2.f370643y = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStatistic", "onScrollStateChanged, isIdle=" + z17 + ", isImproveUI=" + b1Var2.f370636r);
        if (z17) {
            b1Var2.t();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        int d17 = l52.k.d(recyclerView);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OldVersionUIC", "onScrollStateChanged newState:" + i17 + " position:" + d17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        int i18 = f2Var.f250335o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        int max = java.lang.Integer.max(i18, d17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        f2Var.f250335o = max;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMaxItemIndex$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        f2Var.f250334n = d17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMaxItemIndex$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/component/OldVersionUIC$adExposeListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$adExposeListener$1");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$adExposeListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/OldVersionUIC$adExposeListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        int d17 = l52.k.d(recyclerView);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2 f2Var = this.f250285d;
        int i19 = f2Var.f250335o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        int max = java.lang.Integer.max(i19, d17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        f2Var.f250335o = max;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMaxItemIndex$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        f2Var.f250334n = d17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMaxItemIndex$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/component/OldVersionUIC$adExposeListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$adExposeListener$1");
    }
}
