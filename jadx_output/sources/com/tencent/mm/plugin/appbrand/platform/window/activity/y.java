package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.platform.window.activity.a0 f87678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.platform.window.activity.b0 f87679e;

    public y(com.tencent.mm.plugin.appbrand.platform.window.activity.b0 b0Var, com.tencent.mm.plugin.appbrand.platform.window.activity.a0 a0Var) {
        this.f87679e = b0Var;
        this.f87678d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.platform.window.activity.b0 b0Var = this.f87679e;
        com.tencent.mm.sdk.platformtools.b4 b4Var = b0Var.f87575c;
        if (b4Var != null) {
            b4Var.d();
        }
        b0Var.f87573a = 0;
        b0Var.f87574b = this.f87678d;
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.appbrand.platform.window.activity.x(this), true);
        b0Var.f87575c = b4Var2;
        b4Var2.c(500L, 500L);
    }
}
