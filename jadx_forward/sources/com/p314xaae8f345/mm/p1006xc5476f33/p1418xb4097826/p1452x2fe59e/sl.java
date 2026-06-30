package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class sl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl f190530d;

    public sl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar) {
        this.f190530d = tlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = this.f190530d;
        if (tlVar.g().e().getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoShareContract", "check2Play: video is ended");
            return;
        }
        java.lang.Object obj = tlVar.f().f374658i;
        so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
        if (u1Var == null || (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) tlVar.f().p(com.p314xaae8f345.mm.R.id.e_k)) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoShareContract", "check2Play: play trigger, id=".concat(pm0.v.u(u1Var.mo2128x1ed62e84())));
        cw2.v9.n(c15196x85976f5f, 0, null, null, 7, null);
    }
}
