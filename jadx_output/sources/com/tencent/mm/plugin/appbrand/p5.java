package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class p5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f86324d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ze.n f86325e;

    public p5(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC, ze.n nVar) {
        this.f86325e = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f86324d.getAndSet(true)) {
            return;
        }
        ((com.tencent.mm.plugin.appbrand.o6) this.f86325e).j3();
    }
}
