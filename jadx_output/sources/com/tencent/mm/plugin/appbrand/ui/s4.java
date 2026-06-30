package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f90199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.w4 f90200e;

    public s4(com.tencent.mm.plugin.appbrand.ui.w4 w4Var, int i17) {
        this.f90200e = w4Var;
        this.f90199d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDataTransferState  state=");
        int i17 = this.f90199d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameUILoadingSplash", sb6.toString());
        if (i17 == 3) {
            com.tencent.mm.plugin.appbrand.ui.w4 w4Var = this.f90200e;
            if (!w4Var.L) {
                w4Var.M = this;
            } else {
                w4Var.K.setVisibility(0);
                w4Var.K.setText(com.tencent.mm.R.string.a0d);
            }
        }
    }
}
