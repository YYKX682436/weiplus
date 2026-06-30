package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f182263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.i1 f182264e;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.i1 i1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f182264e = i1Var;
        this.f182263d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.i1 i1Var = this.f182264e;
        i1Var.f182272d.f182279d.f182283d.f182133g.f425024p = true;
        this.f182263d.dismiss();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteSightDetailUI", "do del fav file, local id %d, fav id %d", java.lang.Long.valueOf(i1Var.f182272d.f182279d.f182283d.f182174r.f67645x88be67a1), java.lang.Integer.valueOf(i1Var.f182272d.f182279d.f182283d.f182174r.f67643xc8a07680));
        i1Var.f182272d.f182279d.f182283d.finish();
    }
}
