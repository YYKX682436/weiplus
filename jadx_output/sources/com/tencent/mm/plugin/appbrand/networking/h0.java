package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes7.dex */
public class h0 implements com.tencent.mm.plugin.appbrand.networking.d0, lm0.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f86090d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f86091e;

    public h0(com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6) {
        kotlin.jvm.internal.o.g(rt6, "rt");
        this.f86090d = rt6;
        this.f86091e = new java.util.concurrent.ConcurrentLinkedDeque();
    }

    public final void a() {
        com.tencent.mm.plugin.appbrand.e9 C0 = this.f86090d.C0();
        boolean z17 = false;
        if (C0 != null && C0.isRunning()) {
            z17 = true;
        }
        if (z17) {
            java.util.Iterator it = this.f86091e.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.networking.e0) it.next()).f();
            }
        }
    }

    public void b() {
        this.f86091e.clear();
    }

    public void c() {
        this.f86091e.add(new com.tencent.mm.plugin.appbrand.networking.g0(this));
    }
}
