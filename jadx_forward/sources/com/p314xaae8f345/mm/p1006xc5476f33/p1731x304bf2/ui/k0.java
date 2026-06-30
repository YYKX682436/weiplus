package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.x1 f222974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l0 f222975e;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l0 l0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.x1 x1Var) {
        this.f222975e = l0Var;
        this.f222974d = x1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l0 l0Var = this.f222975e;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15949x2763f3ba.Z6(l0Var.f222987f, this.f222974d, 2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterUI5", "GameCenter crash, %s", e17.getMessage());
            l0Var.f222987f.finish();
        }
        android.app.Dialog dialog = l0Var.f222987f.f222260z;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterUI5", "Server data parsing time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - l0Var.f222986e));
    }
}
