package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class l6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r6 f197993d;

    public l6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r6 r6Var) {
        this.f197993d = r6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.s6 s6Var = this.f197993d.f198165b;
        if (s6Var != null) {
            df2.t2 t2Var = (df2.t2) s6Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCenterController", "onHangupClick");
            fj2.s sVar = fj2.s.f344716a;
            android.content.Context context = null;
            sVar.e(ml2.q4.f409389i, null);
            sVar.b(ml2.n4.f409289w);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCenterController", "showHangupConfirmSheet");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r6 r6Var = t2Var.f312929m;
            if (r6Var != null && (view2 = r6Var.f198164a) != null) {
                context = view2.getContext();
            }
            if (context != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
                k0Var.U1 = true;
                k0Var.f293388d2 = true;
                k0Var.f293405n = new df2.r2(k0Var, context);
                k0Var.f293414s = new df2.s2(t2Var, k0Var);
                k0Var.v();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
