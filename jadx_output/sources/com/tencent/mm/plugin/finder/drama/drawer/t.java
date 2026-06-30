package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes2.dex */
public final class t extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.drawer.e0 f105276d;

    public t(com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var) {
        this.f105276d = e0Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        int i18 = -1;
        int w17 = linearLayoutManager != null ? linearLayoutManager.w() : -1;
        if (w17 == -1) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var = this.f105276d;
        r45.bn2 bn2Var = (r45.bn2) ((zb2.b) e0Var.f105226p.get(w17)).f471258d.getCustom(1);
        int integer = bn2Var != null ? bn2Var.getInteger(2) : 1;
        java.util.Iterator it = e0Var.f105225o.iterator();
        int i19 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zb2.c cVar = (zb2.c) it.next();
            r45.ft4 ft4Var = (r45.ft4) cVar.f471259d.getCustom(0);
            int integer2 = ft4Var != null ? ft4Var.getInteger(0) : 0;
            r45.ft4 ft4Var2 = (r45.ft4) cVar.f471259d.getCustom(0);
            if (integer <= (ft4Var2 != null ? ft4Var2.getInteger(1) : 0) && integer2 <= integer) {
                i18 = i19;
                break;
            }
            i19++;
        }
        if (i18 != e0Var.f105234x) {
            e0Var.f105234x = i18;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = e0Var.f105228r;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("rangeRv");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recyclerView2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$6", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView2.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recyclerView2, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$6", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "Undefined", "scrollToPosition", "(I)V");
            androidx.recyclerview.widget.RecyclerView recyclerView3 = e0Var.f105228r;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("rangeRv");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView3.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            com.tencent.mm.plugin.finder.drama.drawer.s sVar = new com.tencent.mm.plugin.finder.drama.drawer.s(e0Var.getContext());
            sVar.f12049a = i18;
            androidx.recyclerview.widget.RecyclerView recyclerView4 = e0Var.f105228r;
            if (recyclerView4 == null) {
                kotlin.jvm.internal.o.o("rangeRv");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView4.getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.startSmoothScroll(sVar);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
