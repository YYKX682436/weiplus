package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes5.dex */
public final class hc0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 f216152d;

    public hc0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 nc0Var) {
        this.f216152d = nc0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        int childCount = recyclerView.getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = recyclerView.getChildAt(i19);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = recyclerView.w0(childAt);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w07, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.SimpleViewHolder");
            int top = childAt.getTop();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 nc0Var = this.f216152d;
            double min = java.lang.Math.min(java.lang.Math.abs((top - nc0Var.f216852q.f306282f) - nc0Var.f216855t) / childAt.getHeight(), 1.0d) * 0.5d;
            android.view.View p17 = ((in5.s0) w07).p(com.p314xaae8f345.mm.R.id.f568222m54);
            if (p17 != null) {
                p17.setBackground(new android.graphics.drawable.ColorDrawable(android.graphics.Color.argb((int) (min * 255), 0, 0, 0)));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$onCreateAfter$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
