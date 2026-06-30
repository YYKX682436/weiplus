package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f78259d;

    public h2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f78259d = appBrandRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.f2 f2Var = new com.tencent.mm.plugin.appbrand.f2(this);
        if (!this.f78259d.R1(f2Var)) {
            f2Var.run();
        }
        cf.i.b("onReady", new com.tencent.mm.plugin.appbrand.g2(this));
    }
}
