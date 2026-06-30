package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5274xb33ae62e f260536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f260537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.i f260538f;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.i iVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5274xb33ae62e c5274xb33ae62e, android.app.Dialog dialog) {
        this.f260538f = iVar;
        this.f260536d = c5274xb33ae62e;
        this.f260537e = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5274xb33ae62e c5274xb33ae62e = this.f260536d;
        if (c5274xb33ae62e.f135599h != null) {
            android.app.Dialog dialog = this.f260537e;
            if (dialog != null) {
                dialog.dismiss();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBiometricPaySettingsUI", "close event result: %s", java.lang.Integer.valueOf(c5274xb33ae62e.f135599h.f88068a));
            if (c5274xb33ae62e.f135599h.f88068a == 0) {
                gm0.j1.n().f354821b.g(new ss4.e0(null, 19));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.i iVar = this.f260538f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19041xb051660 activityC19041xb051660 = iVar.f260543e;
            activityC19041xb051660.Z6(activityC19041xb051660.f260360g, activityC19041xb051660.f260370t);
            if (activityC19041xb051660.f260366p == 1) {
                activityC19041xb051660.Z6(activityC19041xb051660.f260363m, activityC19041xb051660.f260368r);
                activityC19041xb051660.Z6(activityC19041xb051660.f260362i, activityC19041xb051660.f260369s);
            } else {
                activityC19041xb051660.Z6(activityC19041xb051660.f260361h, activityC19041xb051660.f260367q);
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC19041xb051660.m79336x8b97809d()).notifyDataSetChanged();
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19041xb051660 activityC19041xb0516602 = iVar.f260543e;
            if (((mz2.a) activityC19041xb0516602.f260371u).a()) {
                db5.e1.F(activityC19041xb0516602, activityC19041xb0516602.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_h), "", true);
            } else {
                db5.e1.F(activityC19041xb0516602, activityC19041xb0516602.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kud), "", true);
            }
        }
    }
}
