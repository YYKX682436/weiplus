package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f77034d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f77035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f77036f;

    public c7(com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.Runnable runnable) {
        this.f77036f = o6Var;
        this.f77035e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f77034d.getAndSet(true)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[ILaunchWxaAppInfoNotify] addPendingPermissionUpdateTask run()");
        this.f77035e.run();
    }
}
