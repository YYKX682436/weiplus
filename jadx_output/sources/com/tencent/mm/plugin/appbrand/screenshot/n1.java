package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class n1 implements com.tencent.mm.plugin.appbrand.screenshot.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f88536a = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:12:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.tencent.mm.plugin.appbrand.screenshot.n1 r25, com.tencent.mm.plugin.appbrand.AppBrandRuntime r26, java.lang.String r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.screenshot.n1.c(com.tencent.mm.plugin.appbrand.screenshot.n1, com.tencent.mm.plugin.appbrand.AppBrandRuntime, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.appbrand.screenshot.q0
    public void a(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, java.lang.String path) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = runtime.Q;
        if (lifecycleScope == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RecordScreenshotTakeReactor", "onScreenshotTaken, lifecycleScope is null");
            return;
        }
        android.app.Activity r07 = runtime.r0();
        if (!(r07 != null ? r07.hasWindowFocus() : true)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.RecordScreenshotTakeReactor", "onScreenshotTaken, hasWindowFocus is false");
            return;
        }
        oz5.i e17 = com.tencent.mm.sdk.coroutines.LifecycleScope.e(lifecycleScope, null, new com.tencent.mm.plugin.appbrand.screenshot.l1(this, runtime, path, null), 1, null);
        ((kotlinx.coroutines.c3) e17).p(new com.tencent.mm.plugin.appbrand.screenshot.j1(lifecycleScope, this, path));
        ((java.util.concurrent.ConcurrentHashMap) this.f88536a).put(path, e17);
    }

    @Override // com.tencent.mm.plugin.appbrand.screenshot.q0
    public void b(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, java.lang.String fromPath, java.lang.String toPath) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(fromPath, "fromPath");
        kotlin.jvm.internal.o.g(toPath, "toPath");
        kotlinx.coroutines.f1 f1Var = (kotlinx.coroutines.f1) ((java.util.concurrent.ConcurrentHashMap) this.f88536a).remove(fromPath);
        if (f1Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RecordScreenshotTakeReactor", "onScreenshotMove, deferred is null");
            return;
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = runtime.Q;
        if (lifecycleScope == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RecordScreenshotTakeReactor", "onScreenshotMove, lifecycleScope is null");
        } else {
            v65.i.b(lifecycleScope, null, new com.tencent.mm.plugin.appbrand.screenshot.h1(f1Var, fromPath, toPath, null), 1, null);
        }
    }
}
