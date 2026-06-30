package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class pn0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f195455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 f195456e;

    public pn0(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var) {
        this.f195455d = i17;
        this.f195456e = wn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var = this.f195456e;
        int i17 = this.f195455d;
        if (i17 == 1) {
            if (((mm2.c1) wn0Var.P0(mm2.c1.class)).F) {
                qo0.c.a(wn0Var.f196506p, qo0.b.f446957v3, null, 2, null);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveWishPanelPlug", "remindInteractionWishAction ignore as like is disable");
                return;
            }
        }
        if (i17 != 2) {
            if (i17 == 3) {
                qo0.c.a(wn0Var.f196506p, qo0.b.f446961w3, null, 2, null);
                return;
            }
            return;
        }
        wn0Var.getClass();
        if (!(!zl2.r4.f555483a.J1(wn0Var.S0()) && ((mm2.c1) wn0Var.P0(mm2.c1.class)).f410417t && ((mm2.c1) wn0Var.P0(mm2.c1.class)).f410435w && ((mm2.c1) wn0Var.P0(mm2.c1.class)).f410429v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveWishPanelPlug", "remindInteractionWishAction ignore as comment is disable");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
        wn0Var.f196506p.mo46557x60d69242(qo0.b.W, bundle);
    }
}
