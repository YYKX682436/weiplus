package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class p0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 f202281d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var) {
        this.f202281d = t0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var = this.f202281d;
        if (i17 == 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.e) ((jz5.n) t0Var.f202309J).mo141623x754a37bb()).y(t0Var.f202314r, t0Var.f202316t, t0Var.f202317u, t0Var.f202321y);
            return;
        }
        if (i17 != 1) {
            return;
        }
        kn2.c cVar = t0Var.f202310n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.n0 n0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.n0(t0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.o0 o0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.o0(t0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0) cVar;
        wn0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishPanelPlug", "deleteInteractionWish with callback: " + wn0Var.f196513w);
        if (wn0Var.C1()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(wn0Var, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sn0(wn0Var, 2, null, n0Var, o0Var, null), 2, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishPanelPlug", "deleteInteractionWish ignore as interactiveWish disable.");
            o0Var.mo147xb9724478(null, null, null);
        }
    }
}
