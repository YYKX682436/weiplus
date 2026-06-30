package cw2;

/* loaded from: classes2.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15177x9c2650d3 f305297d;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15177x9c2650d3 c15177x9c2650d3) {
        this.f305297d = c15177x9c2650d3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15177x9c2650d3 c15177x9c2650d3 = this.f305297d;
        android.content.Context context = c15177x9c2650d3.getContext();
        jz5.f0 f0Var = null;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = c15177x9c2650d3.getFeed();
            if (feed != null) {
                vn2.u0 u0Var = vn2.u0.f519920a;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15177x9c2650d3.C;
                if (u0Var.a("Finder.FullSeeLaterView", "click", abstractActivityC21394xb3d2c0cf, feed, false, c15177x9c2650d3.getNeedClickAction(), c15177x9c2650d3.getPlayPercent())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15177x9c2650d3.A(c15177x9c2650d3);
                }
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15177x9c2650d3.C;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FullSeeLaterView", "click but feed is null!");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
