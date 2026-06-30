package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class qy implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty f195589d;

    public qy(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar) {
        this.f195589d = tyVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        boolean z17 = false;
        int itemId = menuItem != null ? menuItem.getItemId() : 0;
        int i18 = 2;
        if (itemId == 0) {
            this.f195589d.A1(2, 2);
        } else if (itemId == 1) {
            this.f195589d.A1(2, 3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar = this.f195589d;
        if (itemId != tyVar.Z) {
            tyVar.Z = itemId;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tyVar.f196021q, "switchSortType currentSortType: " + this.f195589d.Z);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar2 = this.f195589d;
            if (tyVar2.v1()) {
                i18 = 1;
            } else {
                if (((mm2.n0) tyVar2.P0(mm2.n0.class)).f410806r) {
                    i18 = 16;
                }
            }
            int i19 = (tyVar2.Z == 1 && tyVar2.v1()) ? 3 : 0;
            bm2.n5 n5Var = tyVar2.R;
            if (tyVar2.Z == 1 && tyVar2.v1()) {
                z17 = true;
            }
            n5Var.L = z17;
            dk2.xf W0 = tyVar2.W0();
            if (W0 != null) {
                ((dk2.r4) W0).B(i18, i19, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iy(tyVar2));
            }
        }
    }
}
