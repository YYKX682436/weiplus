package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes14.dex */
public class ec implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.gc f171224d;

    public ec(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.gc gcVar) {
        this.f171224d = gcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98 activityC12695x889c9c98 = this.f171224d.f171277b;
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98.f171024h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "showNeedDownloadConfirmDialog, finishing[%b] destroyed[%b]", java.lang.Boolean.valueOf(activityC12695x889c9c98.isFinishing()), java.lang.Boolean.valueOf(activityC12695x889c9c98.m78477x9d1e994e()));
        if (activityC12695x889c9c98.isFinishing() || activityC12695x889c9c98.m78477x9d1e994e()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.cc ccVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.cc(activityC12695x889c9c98);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d) {
            ccVar.onClick(null, 0);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dc dcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dc(activityC12695x889c9c98);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC12695x889c9c98.mo55332x76847179();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293262s = activityC12695x889c9c98.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571877sd);
        aVar.A = false;
        aVar.f293265v = of5.b.a(mo55332x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571876sc);
        aVar.E = ccVar;
        aVar.f293266w = of5.b.a(mo55332x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571875sb);
        aVar.F = dcVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(366L, 1L, 1L, false);
    }
}
