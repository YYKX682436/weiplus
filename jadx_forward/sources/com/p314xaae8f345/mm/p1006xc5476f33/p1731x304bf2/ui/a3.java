package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.v1 f222550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b3 f222551e;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b3 b3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.v1 v1Var) {
        this.f222551e = b3Var;
        this.f222550d = v1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b3 b3Var = this.f222551e;
        try {
            b3Var.f222578f.Z6(this.f222550d, 2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameDownloadGuidanceUI", "GameDownloadGuidanceUI crash, %s", e17.getMessage());
            b3Var.f222578f.finish();
        }
        android.app.Dialog dialog = b3Var.f222578f.f222286r;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadGuidanceUI", "Server data parsing time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - b3Var.f222577e));
    }
}
