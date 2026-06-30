package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class k6 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f210947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6 f210948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f210949f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f210950g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f210951h;

    public k6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6 o6Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2) {
        this.f210948e = o6Var;
        this.f210949f = c1162x665295de;
        this.f210950g = f0Var;
        this.f210951h = f0Var2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper$attachToRecyclerView$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6 o6Var = this.f210948e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.j6 j6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.j6(o6Var, recyclerView, this.f210949f, this.f210951h, this.f210950g);
            o6Var.f211113o = j6Var;
            recyclerView.postDelayed(j6Var, 20L);
        } else if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.n1().r()).booleanValue()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f210949f;
            if (c1162x665295de instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) c1162x665295de).f214174z = 0;
            }
        }
        this.f210947d = true;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f210951h;
        this.f210950g.f391649d = f0Var.f391649d;
        f0Var.f391649d = i17;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper$attachToRecyclerView$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper$attachToRecyclerView$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6 o6Var = this.f210948e;
        java.lang.Runnable runnable = o6Var.f211113o;
        if (runnable != null) {
            recyclerView.removeCallbacks(runnable);
            o6Var.f211113o = null;
        }
        o6Var.f211112n += i18;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.N0().r()).booleanValue()) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper$attachToRecyclerView$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        if (this.f210947d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6 o6Var2 = this.f210948e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6.n(o6Var2, recyclerView, this.f210949f, this.f210951h.f391649d, this.f210950g.f391649d, o6Var2.f211112n);
            this.f210947d = false;
        }
        o6Var.o(recyclerView, this.f210949f, o6Var.f211112n, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper$attachToRecyclerView$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
