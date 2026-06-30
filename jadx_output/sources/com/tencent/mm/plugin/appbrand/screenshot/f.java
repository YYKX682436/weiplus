package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class f implements com.tencent.mm.plugin.appbrand.screenshot.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.g f88482a;

    public f(com.tencent.mm.plugin.appbrand.screenshot.g gVar) {
        this.f88482a = gVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.screenshot.q0
    public void a(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, java.lang.String path) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.appbrand.screenshot.g gVar = this.f88482a;
        if (com.tencent.mm.plugin.appbrand.screenshot.g.a(gVar, runtime)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotForwardComponent", "onScreenshotTaken, pageIsCompletelyBlocked");
            return;
        }
        java.util.Iterator it = gVar.f88485a.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.screenshot.q0) it.next()).a(runtime, path);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.screenshot.q0
    public void b(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, java.lang.String fromPath, java.lang.String toPath) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(fromPath, "fromPath");
        kotlin.jvm.internal.o.g(toPath, "toPath");
        com.tencent.mm.plugin.appbrand.screenshot.g gVar = this.f88482a;
        if (com.tencent.mm.plugin.appbrand.screenshot.g.a(gVar, runtime)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotForwardComponent", "onScreenshotMove, pageIsCompletelyBlocked");
            return;
        }
        java.util.Iterator it = gVar.f88485a.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.screenshot.q0) it.next()).b(runtime, fromPath, toPath);
        }
    }
}
