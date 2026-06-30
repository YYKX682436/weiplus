package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.platform.window.activity.b0 f87680d;

    public z(com.tencent.mm.plugin.appbrand.platform.window.activity.b0 b0Var) {
        this.f87680d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationRetrier", "cancelTikTok reset");
        com.tencent.mm.plugin.appbrand.platform.window.activity.b0 b0Var = this.f87680d;
        com.tencent.mm.sdk.platformtools.b4 b4Var = b0Var.f87575c;
        if (b4Var != null) {
            b4Var.d();
        }
        b0Var.f87573a = 0;
        b0Var.f87574b = null;
    }
}
