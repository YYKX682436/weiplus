package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class vz implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f201644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.q63 f201645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f201646f;

    public vz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var, r45.q63 q63Var, java.lang.Runnable runnable) {
        this.f201644d = m10Var;
        this.f201645e = q63Var;
        this.f201646f = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$PayGameTeamLogic$setupForNeedPayStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f201644d;
        m10Var.r();
        int m75939xb282bd08 = this.f201645e.m75939xb282bd08(5);
        java.lang.Runnable runnable = this.f201646f;
        boolean z17 = false;
        if (m75939xb282bd08 > 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(view.getContext());
            u1Var.g(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.czc));
            u1Var.n(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq));
            u1Var.j(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
            u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uz(runnable));
            u1Var.q(false);
        } else {
            m10Var.getClass();
            java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
            java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
            if (!android.text.TextUtils.isEmpty(str) && !r26.i0.p("CN", str, true)) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "is Wechat user");
                m10Var.getClass();
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k10(m10Var));
            } else {
                runnable.run();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$PayGameTeamLogic$setupForNeedPayStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
