package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class jg extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.LinearLayoutManager f103750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qg f103752f;

    public jg(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.qg qgVar) {
        this.f103751e = s0Var;
        this.f103752f = qgVar;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        this.f103750d = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$onCreateViewHolder$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f103750d;
        in5.s0 s0Var = this.f103751e;
        if (i17 == 0) {
            so2.a2 a2Var = (so2.a2) s0Var.f293125i;
            int i18 = a2Var.f410250g.f410346b;
            if (i18 != -1 && i18 != linearLayoutManager.w()) {
                a2Var.f410250g.f410345a = -1;
                com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView = this.f103752f.f104390r;
                if (finderHomeTabRedDotTipsBubbleView != null) {
                    com.tencent.mm.plugin.finder.view.gb gbVar = com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView.f131137h;
                    finderHomeTabRedDotTipsBubbleView.a(true);
                }
            }
        } else if (i17 == 1) {
            so2.f5 f5Var = ((so2.a2) s0Var.f293125i).f410250g;
            if (f5Var.f410346b == -1 && f5Var.f410345a == 1) {
                f5Var.f410346b = linearLayoutManager.w();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$onCreateViewHolder$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$onCreateViewHolder$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$onCreateViewHolder$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
