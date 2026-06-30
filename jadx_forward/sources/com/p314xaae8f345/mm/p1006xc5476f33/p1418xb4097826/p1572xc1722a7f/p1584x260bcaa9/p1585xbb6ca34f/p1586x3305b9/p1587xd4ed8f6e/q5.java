package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class q5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f203434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21454xce35d788 f203435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 f203436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203437g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f203438h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vp2.l0 f203439i;

    public q5(android.widget.RelativeLayout relativeLayout, com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21454xce35d788 c21454xce35d788, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 t5Var, in5.s0 s0Var, android.widget.TextView textView, vp2.l0 l0Var) {
        this.f203434d = relativeLayout;
        this.f203435e = c21454xce35d788;
        this.f203436f = t5Var;
        this.f203437g = s0Var;
        this.f203438h = textView;
        this.f203439i = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        qa5.l sizeAnimController;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$expandClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.RelativeLayout expandView = this.f203434d;
        if (expandView.getVisibility() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SpecialColumnListConvert", "The content has been expanded");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$expandClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NEARBY_FOLLOW_TAB_EXPAND_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21454xce35d788 c21454xce35d788 = this.f203435e;
        if (c21454xce35d788 != null && (sizeAnimController = c21454xce35d788.getSizeAnimController()) != null) {
            sizeAnimController.f442660c = true;
        }
        in5.s0 s0Var = this.f203437g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 t5Var = this.f203436f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5.n(t5Var, s0Var, 1);
        android.widget.TextView titleContentView = this.f203438h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(titleContentView, "$titleContentView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(expandView, "$expandView");
        t5Var.t(titleContentView, expandView, this.f203439i, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$expandClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
