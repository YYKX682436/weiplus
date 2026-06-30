package l94;

/* loaded from: classes4.dex */
public final class z extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l94.b0 f398943d;

    public z(l94.b0 b0Var) {
        this.f398943d = b0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rv6);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent$setupListeners$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            l94.b0 b0Var = this.f398943d;
            boolean z17 = b0Var.f398856i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            if (z17) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = rv6.getLayoutManager();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419 c17827xd9ca7419 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f.C17827xd9ca7419) layoutManager : null;
                int n17 = c17827xd9ca7419 != null ? c17827xd9ca7419.n() : 0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setScrollIdleIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                b0Var.f398865r = n17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setScrollIdleIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getScrollIdleIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                int i18 = b0Var.f398865r;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getScrollIdleIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTouchDownIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                int i19 = b0Var.f398864q;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTouchDownIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                if (i18 != i19) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getScrollCount$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    int i27 = b0Var.f398863p;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getScrollCount$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setScrollCount$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    b0Var.f398863p = i27 + 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setScrollCount$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                b0Var.f398856i = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                float n18 = l94.b0.n(b0Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                b0Var.o(n18);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent$setupListeners$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$3");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrolled", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent$setupListeners$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent$setupListeners$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrolled", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$3");
    }
}
