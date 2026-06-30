package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class k6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r6 f197973d;

    public k6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r6 r6Var) {
        this.f197973d = r6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.s6 s6Var = this.f197973d.f198165b;
        if (s6Var != null) {
            df2.t2 t2Var = (df2.t2) s6Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCenterController", "onCameraClick");
            android.content.Context context = null;
            if (pm0.v.z(t2Var.d7(), 2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r6 r6Var = t2Var.f312929m;
                if (r6Var != null && (view2 = r6Var.f198164a) != null) {
                    context = view2.getContext();
                }
                if (context != null) {
                    int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                    e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.omk);
                    e4Var.c();
                }
            } else {
                fj2.s sVar = fj2.s.f344716a;
                sVar.e(ml2.q4.f409388h, null);
                sVar.b(ml2.n4.F);
                if2.b.Y6(t2Var, qo0.b.f446893h3, null, 2, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
