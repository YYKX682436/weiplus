package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public final class x3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 f236225d;

    public x3(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var) {
        this.f236225d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.u0) this.f236225d.f236082c).f236136a;
        boolean z17 = m0Var.f236002x;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m0Var.f235989h;
        if (z17) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(abstractActivityC21394xb3d2c0cf);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = m0Var.f235992n;
            if (z3Var != null && z3Var.d1() != null) {
                ((qk.s6) gm0.j1.s(qk.s6.class)).U6(7, m0Var.f235992n.d1(), m0Var.f235992n.P0());
            }
        } else {
            if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).q()) {
                m0Var.d();
            } else {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).B(abstractActivityC21394xb3d2c0cf, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.a1(m0Var));
            }
            int i17 = m0Var.C;
            if (i17 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11263, java.lang.Integer.valueOf(i17), m0Var.f235992n.d1());
            }
            gr3.e.c(m0Var.f235992n.d1(), 200, m0Var.D, abstractActivityC21394xb3d2c0cf.getIntent(), m0Var.L, m0Var.f236000v);
            gr3.f.f356390a.a(m0Var.M, "follow", "", -1L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
