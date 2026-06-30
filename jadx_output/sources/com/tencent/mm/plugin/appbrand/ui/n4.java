package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.w4 f89880d;

    public n4(com.tencent.mm.plugin.appbrand.ui.w4 w4Var) {
        this.f89880d = w4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.w4 w4Var = this.f89880d;
        w4Var.R = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "mCustomSplashScreenDelayTimeEnd");
        if (w4Var.Q) {
            com.tencent.mm.plugin.appbrand.ui.w4.K(w4Var);
        }
    }
}
