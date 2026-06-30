package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class nh extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.th f104097d;

    public nh(com.tencent.mm.plugin.finder.convert.th thVar) {
        this.f104097d = thVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        boolean z17;
        int size;
        int size2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert$bindAdapter$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int x17 = linearLayoutManager.x();
            com.tencent.mm.plugin.finder.convert.th thVar = this.f104097d;
            so2.i1 i1Var = thVar.f104617i;
            if (!i1Var.f410419g || (size2 = (size = i1Var.f410417e.size()) - x17) > 5 || thVar.f104618m) {
                z17 = false;
            } else {
                com.tencent.mars.xlog.Log.i("FinderFeedLiveListConvert", "[needToLoadMore] size:" + size + ", lastPos:" + x17 + ", leftSize:" + size2 + ", loading:" + thVar.f104618m);
                z17 = true;
            }
            if (z17) {
                thVar.f104618m = true;
                jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
                c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                com.tencent.mm.protobuf.g gVar = thVar.f104617i.f410416d;
                int i18 = thVar.f104615g;
                float floatValue = ((java.lang.Number) P6.f302833d).floatValue();
                float floatValue2 = ((java.lang.Number) P6.f302834e).floatValue();
                com.tencent.mm.plugin.finder.convert.ph phVar = new com.tencent.mm.plugin.finder.convert.ph(thVar);
                ((b92.d1) zbVar).getClass();
                new ke2.k0(gVar, i18, floatValue, floatValue2, phVar).l();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert$bindAdapter$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert$bindAdapter$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.Kh((zy2.zb) c17, recyclerView, ml2.x1.f328201e, this.f104097d.q(), ml2.y.f328243h, 0, 0L, 0, 112, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert$bindAdapter$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
