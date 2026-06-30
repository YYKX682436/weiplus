package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class z60 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v70 f196835d;

    public z60(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v70 v70Var) {
        this.f196835d = v70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v70 v70Var = this.f196835d;
        v70Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "onClickExitBtn");
        ml2.q2 q2Var = ml2.q2.f409377z1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "report21054 op: 63 ");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
        fj2.j jVar = fj2.j.f344707a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = v70Var.U;
        android.content.Context context = v70Var.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        v70Var.U = jVar.c(k0Var, context, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o70(v70Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
