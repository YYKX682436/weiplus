package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class s1 extends android.os.FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f88554a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.screenshot.s0 f88555b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f88556c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f88557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(java.lang.String dirPath, com.tencent.mm.plugin.appbrand.screenshot.s0 listener) {
        super(dirPath, 200);
        kotlin.jvm.internal.o.g(dirPath, "dirPath");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f88554a = dirPath;
        this.f88555b = listener;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i17, java.lang.String str) {
        if (str == null) {
            return;
        }
        java.lang.String path = this.f88554a + str;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ScreenshotObserver", "onEvent, event: " + i17 + ", takenPath: " + path);
        com.tencent.mm.plugin.appbrand.screenshot.s0 s0Var = this.f88555b;
        if (i17 == 8) {
            if (kotlin.jvm.internal.o.b(this.f88556c, path)) {
                return;
            }
            com.tencent.mm.plugin.appbrand.screenshot.c cVar = (com.tencent.mm.plugin.appbrand.screenshot.c) s0Var;
            cVar.getClass();
            kotlin.jvm.internal.o.g(path, "path");
            com.tencent.mm.plugin.appbrand.screenshot.e eVar = cVar.f88468a;
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.appbrand.screenshot.e.a(eVar), "onScreenshotTaken, path: ".concat(path));
            eVar.f88475b.a(eVar.f88474a, path);
            this.f88556c = path;
            return;
        }
        if (i17 == 64) {
            if (kotlin.jvm.internal.o.b(this.f88556c, path)) {
                this.f88557d = true;
                return;
            }
            return;
        }
        if (i17 == 128 && this.f88557d) {
            this.f88557d = false;
            java.lang.String str2 = this.f88556c;
            if (str2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ScreenshotObserver", "onEvent, fromPath is null");
                return;
            }
            com.tencent.mm.plugin.appbrand.screenshot.c cVar2 = (com.tencent.mm.plugin.appbrand.screenshot.c) s0Var;
            cVar2.getClass();
            kotlin.jvm.internal.o.g(path, "toPath");
            com.tencent.mm.plugin.appbrand.screenshot.e eVar2 = cVar2.f88468a;
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.appbrand.screenshot.e.a(eVar2), "onScreenshotMove, fromPath: " + str2 + ", toPath: " + path);
            eVar2.f88475b.b(eVar2.f88474a, str2, path);
        }
    }
}
