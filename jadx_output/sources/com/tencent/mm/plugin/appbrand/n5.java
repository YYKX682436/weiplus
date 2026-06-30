package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f86024d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ze.n f86025e;

    public n5(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC, ze.n nVar) {
        this.f86025e = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f86024d.getAndSet(true)) {
            return;
        }
        ((com.tencent.mm.plugin.appbrand.o6) this.f86025e).j3();
    }
}
