package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class b0 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 f202224a;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var) {
        this.f202224a = t0Var;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        dk2.xf j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var = this.f202224a;
        t0Var.getClass();
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            int i17 = (int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", "optGiftWall anchorStatusFlag: " + i17 + " enable:" + z17);
            if (z17) {
                mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
                java.util.regex.Pattern pattern = pm0.v.f438335a;
                c1Var.p8((-4194305) & i17);
            } else {
                mm2.c1 c1Var2 = (mm2.c1) eVar.a(mm2.c1.class);
                java.util.regex.Pattern pattern2 = pm0.v.f438335a;
                c1Var2.p8(i17 | 4194304);
            }
            gk2.e eVar2 = dk2.ef.I;
            if (eVar2 != null && ((mm2.c1) eVar2.a(mm2.c1.class)).a8()) {
                gk2.e eVar3 = dk2.ef.I;
                if (!((eVar3 == null || ((mm2.c1) eVar3.a(mm2.c1.class)).U7()) ? false : true) || (j17 = efVar.j(t0Var.f202312p)) == null) {
                    return;
                }
                dk2.xf.h(j17, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.c1) eVar.a(mm2.c1.class)).f410399q, 4194304, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.l0(eVar, 4194304, z17, i17, t0Var), 16, null);
            }
        }
    }
}
