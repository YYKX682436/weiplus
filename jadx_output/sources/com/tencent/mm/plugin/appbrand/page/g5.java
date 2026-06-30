package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class g5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final u81.f f86636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.d5 f86637e;

    public g5(com.tencent.mm.plugin.appbrand.page.d5 d5Var) {
        this.f86637e = d5Var;
        com.tencent.mm.plugin.appbrand.page.f5 f5Var = new com.tencent.mm.plugin.appbrand.page.f5(this, this);
        this.f86636d = f5Var;
        d5Var.getRuntime().N.a(f5Var);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainerWC", "debug timeout call runtime onReady, appId:%s", this.f86637e.getAppId());
        this.f86637e.I();
        this.f86637e.getRuntime().N.c(this.f86636d);
    }
}
