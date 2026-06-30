package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f88485a;

    public g(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f88485a = kz5.c0.i(new com.tencent.mm.plugin.appbrand.screenshot.n1(), new com.tencent.mm.plugin.appbrand.screenshot.p1());
        new com.tencent.mm.plugin.appbrand.screenshot.e(runtime, new com.tencent.mm.plugin.appbrand.screenshot.f(this));
    }

    public static final boolean a(com.tencent.mm.plugin.appbrand.screenshot.g gVar, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        boolean z17;
        gVar.getClass();
        com.tencent.mm.plugin.appbrand.page.z zVar = appBrandRuntime.D1;
        if (zVar == null) {
            return false;
        }
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedDeque) zVar.f86759c).iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (((com.tencent.mm.plugin.appbrand.page.ha) it.next()).f86686f) {
                z17 = true;
                break;
            }
        }
        return true == z17;
    }
}
