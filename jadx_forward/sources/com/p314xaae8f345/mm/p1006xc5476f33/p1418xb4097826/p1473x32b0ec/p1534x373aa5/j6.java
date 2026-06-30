package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class j6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r6 f197946d;

    public j6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r6 r6Var) {
        this.f197946d = r6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.s6 s6Var = this.f197946d.f198165b;
        if (s6Var != null) {
            df2.t2 t2Var = (df2.t2) s6Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCenterController", "onVideoClick");
            boolean z17 = pm0.v.z(t2Var.d7(), 2);
            fj2.s sVar = fj2.s.f344716a;
            sVar.e(ml2.q4.f409387g, z17 ? ml2.r4.f409443e : ml2.r4.f409444f);
            if (z17) {
                sVar.b(ml2.n4.E);
                if2.b.Y6(t2Var, qo0.b.f446964x0, null, 2, null);
            } else {
                sVar.b(ml2.n4.D);
                if2.b.Y6(t2Var, qo0.b.f446930p0, null, 2, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
