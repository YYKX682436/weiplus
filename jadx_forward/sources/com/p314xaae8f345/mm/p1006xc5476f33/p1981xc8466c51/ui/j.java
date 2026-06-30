package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class j implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.n f236953d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.n nVar) {
        this.f236953d = nVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.n nVar = this.f236953d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavRecordDetailUI", "favItemInfo: id %d, status %d", java.lang.Integer.valueOf(nVar.f236988d.f236793x.f67643xc8a07680), java.lang.Integer.valueOf(nVar.f236988d.f236793x.f67644x3059914a));
        o72.r2 r2Var = nVar.f236988d.f236793x;
        if (r2Var.f67643xc8a07680 > 0 && !r2Var.Q0() && !nVar.f236988d.f236793x.P0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16963xe302cdf1 activityC16963xe302cdf1 = nVar.f236988d;
            if (activityC16963xe302cdf1.f236794y) {
                g4Var.f(0, activityC16963xe302cdf1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccw));
            }
        }
        g4Var.f(5, nVar.f236988d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccl));
        g4Var.f(3, nVar.f236988d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572728ca4));
        g4Var.f(2, nVar.f236988d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
    }
}
