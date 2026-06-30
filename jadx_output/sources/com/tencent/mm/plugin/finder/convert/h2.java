package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public final class h2 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.m2 f103547d;

    public h2(com.tencent.mm.plugin.finder.convert.m2 m2Var) {
        this.f103547d = m2Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderEmojiDesignerIPSetListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderEmojiDesignerIPSetListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.Map map;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderEmojiDesignerIPSetListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int x17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).x();
        com.tencent.mm.plugin.finder.convert.m2 m2Var = this.f103547d;
        if (x17 == m2Var.f103965g.size() - 1) {
            com.tencent.wechat.aff.emoticon.s sVar = m2Var.f103964f;
            if ((sVar == null || (map = sVar.f216671i) == null) ? false : kotlin.jvm.internal.o.b(((java.util.LinkedHashMap) map).get(bw5.ia.EmoticonDesignerListDataType_IPSet), java.lang.Boolean.TRUE)) {
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new com.tencent.mm.plugin.finder.convert.g2(m2Var, recyclerView, null), 3, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderEmojiDesignerIPSetListConvert$onBindViewHolder$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
