package hr2;

/* loaded from: classes15.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a f364900d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a) {
        this.f364900d = c14594x9de071a;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        int i18;
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nest/FinderChildRecyclerView$initScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a = this.f364900d;
            if (c14594x9de071a.mFinderParentRecyclerView == null) {
                android.view.ViewParent parent = c14594x9de071a.getParent();
                while (true) {
                    z17 = parent instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034;
                    if (z17) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                c14594x9de071a.mFinderParentRecyclerView = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034) parent : null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034 = c14594x9de071a.mFinderParentRecyclerView;
            if (c14595xffb7e034 != null && c14594x9de071a.g1() && (i18 = c14594x9de071a.f203762k2) != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b1 b1Var = c14594x9de071a.f203761j2;
                double a17 = b1Var.a(i18);
                if (a17 > java.lang.Math.abs(c14594x9de071a.totalDy)) {
                    c14595xffb7e034.r0(0, -b1Var.b(a17 + c14594x9de071a.totalDy));
                }
                c14594x9de071a.totalDy = 0;
                c14594x9de071a.f203762k2 = 0;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nest/FinderChildRecyclerView$initScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/finder/nest/FinderChildRecyclerView$initScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a = this.f364900d;
        if (c14594x9de071a.isStartFling) {
            c14594x9de071a.m58539x6d8bac37(0);
            c14594x9de071a.m58538xbd3ccc1c(false);
        }
        c14594x9de071a.m58539x6d8bac37(c14594x9de071a.getTotalDy() + i18);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nest/FinderChildRecyclerView$initScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
