package hr2;

/* loaded from: classes15.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 f364901d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034) {
        this.f364901d = c14595xffb7e034;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034.f203766p2;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispatchChildFling isScrollEnd: ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034 = this.f364901d;
            sb6.append(c14595xffb7e034.h1());
            sb6.append(" velocityY: ");
            sb6.append(c14595xffb7e034.f203771n2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderParentRecyclerView", sb6.toString());
            if (c14595xffb7e034.h1()) {
                c14595xffb7e034.m58541xc7d4965e(false);
                int i19 = c14595xffb7e034.f203771n2;
                if (i19 != 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b1 b1Var = c14595xffb7e034.f203767j2;
                    double a17 = b1Var.a(i19);
                    double d17 = c14595xffb7e034.totalDy;
                    if (a17 > d17) {
                        int b17 = b1Var.b(a17 - d17);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a g17 = c14595xffb7e034.g1();
                        if (g17 != null) {
                            g17.startNestedScroll(2);
                            g17.r0(0, b17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderParentRecyclerView", "childFling " + b17);
                        }
                    }
                }
            }
            c14595xffb7e034.totalDy = 0;
            c14595xffb7e034.f203771n2 = 0;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034 = this.f364901d;
        if (c14595xffb7e034.isStartFling) {
            c14595xffb7e034.m58543x6d8bac37(0);
            c14595xffb7e034.m58542xbd3ccc1c(false);
        }
        c14595xffb7e034.m58543x6d8bac37(c14595xffb7e034.getTotalDy() + i18);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
