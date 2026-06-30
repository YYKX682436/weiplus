package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class n4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b f214225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.n1 f214226e;

    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b, so2.n1 n1Var) {
        this.f214225d = c15260x406bbe1b;
        this.f214226e = n1Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderColumnFrameLayout$bindColumn$7$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b = this.f214225d;
        if (c15260x406bbe1b.getCurrentStats() != i17) {
            c15260x406bbe1b.m61764xd318a159(c15260x406bbe1b.getCurrentStats());
            c15260x406bbe1b.m61761xee202828(i17);
        }
        if (c15260x406bbe1b.getCurrentStats() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b.b(c15260x406bbe1b, recyclerView);
            c15260x406bbe1b.m61762xd6b00ae6(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderColumnFrameLayout$bindColumn$7$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderColumnFrameLayout$bindColumn$7$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            if (!layoutManager.getF180019n()) {
                i17 = i18;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b = this.f214225d;
            if (c15260x406bbe1b.getCurrentStats() == 1) {
                c15260x406bbe1b.m61762xd6b00ae6(c15260x406bbe1b.getDraggingDistance() + i17);
                int i19 = c15260x406bbe1b.e(this.f214226e) ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x.f214844d : c15260x406bbe1b.f212450u;
                int draggingDistance = c15260x406bbe1b.getDraggingDistance();
                int i27 = c15260x406bbe1b.f212451v;
                if (draggingDistance < 0 || java.lang.Math.abs(c15260x406bbe1b.getDraggingDistance()) > (i27 / 2) - i19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderColumnFrameLayout", "handleOnScrolled draggingDistance:" + c15260x406bbe1b.getDraggingDistance() + " offset:" + i17 + " widthPixels:" + i27);
                    c15260x406bbe1b.m61762xd6b00ae6(0);
                    c15260x406bbe1b.m61763xe501e016(-1);
                    recyclerView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m4(c15260x406bbe1b));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderColumnFrameLayout", "handleOnScrolled x draggingDistance:" + c15260x406bbe1b.getDraggingDistance() + " offset:" + i17 + " widthPixels:" + i27);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderColumnFrameLayout$bindColumn$7$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
