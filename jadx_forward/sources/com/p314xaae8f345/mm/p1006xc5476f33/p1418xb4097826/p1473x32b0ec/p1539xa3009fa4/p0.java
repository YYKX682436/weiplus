package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 f198845d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 a1Var) {
        this.f198845d = a1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostUIC$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 a1Var = this.f198845d;
        boolean W6 = a1Var.W6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a;
        if (W6) {
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(a1Var.m80379x76847179(), "android.permission.RECORD_AUDIO", 80, "", "", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.o0(a1Var))) {
                x2Var.f(9, a1Var.f198417t);
                a1Var.a7();
            }
        } else {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184206b == 18) {
                x2Var.b(5);
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184206b == 19) {
                x2Var.b(2);
            }
            a1Var.a7();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostUIC$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
