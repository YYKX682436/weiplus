package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class sj implements com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 f155737a;

    public sj(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 activityC11475xf1a02871) {
        this.f155737a = activityC11475xf1a02871;
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    public void b(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WelcomeActivity", "facebook login success");
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871.f155224h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 activityC11475xf1a02871 = this.f155737a;
        activityC11475xf1a02871.getClass();
        gm0.j1.e().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.rj(activityC11475xf1a02871));
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    public void c(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WelcomeActivity", "facebook-android login error! %s", hVar.getMessage());
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 activityC11475xf1a02871 = this.f155737a;
        db5.e1.s(activityC11475xf1a02871, activityC11475xf1a02871.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c88), "");
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    public void d(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.n nVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WelcomeActivity", "facebook-android login error! %s", nVar.getMessage());
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 activityC11475xf1a02871 = this.f155737a;
        db5.e1.s(activityC11475xf1a02871, activityC11475xf1a02871.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c88), "");
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    /* renamed from: onCancel */
    public void mo48702x3d6f0539() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WelcomeActivity", "facebook login cancel");
    }
}
