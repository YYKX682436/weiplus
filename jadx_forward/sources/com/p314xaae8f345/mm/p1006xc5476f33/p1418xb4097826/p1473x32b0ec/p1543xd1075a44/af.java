package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class af implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf f199296d;

    public af(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf cfVar) {
        this.f199296d = cfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansBuildWidget$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf cfVar = this.f199296d;
        boolean z17 = false;
        cfVar.g0(false);
        java.lang.String str = cfVar.U;
        r45.eq1 eq1Var = new r45.eq1();
        eq1Var.set(0, str);
        new ke2.e(1, eq1Var, (r45.qt2) null).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.we(cfVar, str));
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        if (c1Var != null && c1Var.a8()) {
            z17 = true;
        }
        if (z17) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).yj(ml2.z4.Q, "3", null);
        } else {
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            ml2.c1 c1Var2 = ml2.c1.f408858e;
            j0Var.hj(27L, "3", null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansBuildWidget$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
