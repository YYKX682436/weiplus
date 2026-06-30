package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class h00 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f200022a;

    public h00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var) {
        this.f200022a = m10Var;
    }

    @Override // l81.e1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "onAppBrandProcessDied");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f200022a.f200534c;
        mm2.c1 c1Var = lVar != null ? (mm2.c1) lVar.P0(mm2.c1.class) : null;
        if (c1Var == null) {
            return;
        }
        c1Var.L2 = false;
    }

    @Override // l81.e1
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "onAppBrandPreconditionErrors");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f200022a.f200534c;
        mm2.c1 c1Var = lVar != null ? (mm2.c1) lVar.P0(mm2.c1.class) : null;
        if (c1Var == null) {
            return;
        }
        c1Var.L2 = false;
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "onTriggerHalfScreenShare");
    }

    @Override // l81.e1
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "onAppBrandUIEnter");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f200022a.f200534c;
        mm2.c1 c1Var = lVar != null ? (mm2.c1) lVar.P0(mm2.c1.class) : null;
        if (c1Var != null) {
            c1Var.L2 = true;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var2 != null) {
            c1Var2.O1 = true;
        }
        mm2.c1 c1Var3 = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var3 == null) {
            return;
        }
        c1Var3.K8(false);
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "onAppBrandUIExit:%b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f200022a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = m10Var.f200534c;
        mm2.c1 c1Var = lVar != null ? (mm2.c1) lVar.P0(mm2.c1.class) : null;
        if (c1Var != null) {
            c1Var.L2 = false;
        }
        m10Var.N = null;
    }
}
