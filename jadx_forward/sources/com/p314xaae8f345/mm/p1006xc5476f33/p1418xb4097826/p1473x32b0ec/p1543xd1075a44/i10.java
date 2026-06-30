package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class i10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f200147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f200148e;

    public i10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var, r45.fr1 fr1Var) {
        this.f200147d = m10Var;
        this.f200148e = fr1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dk dkVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$showNewGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f200147d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ui uiVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ui) m10Var.f200534c.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ui.class);
        if (uiVar != null && (dkVar = uiVar.f196101p) != null) {
            dkVar.a();
        }
        m10Var.l();
        ((mm2.c1) m10Var.f200534c.P0(mm2.c1.class)).V2 = true;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_GAME_TEAM_JOIN_GUIDE_SHOW_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        if (((mm2.c1) m10Var.f200534c.P0(mm2.c1.class)).C2 != null) {
            m10Var.f();
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        r45.fr1 fr1Var = this.f200148e;
        r0Var.Tj(m10Var.j(fr1Var != null ? fr1Var.m75939xb282bd08(8) : 0, 18));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$showNewGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
