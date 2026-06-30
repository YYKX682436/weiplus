package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.screenshot.s1 f88564a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.screenshot.s1 f88565b;

    public t1(com.tencent.mm.plugin.appbrand.screenshot.s0 listener) {
        com.tencent.mm.plugin.appbrand.screenshot.s1 s1Var;
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.plugin.appbrand.screenshot.s1 s1Var2 = null;
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(android.os.Environment.getExternalStorageDirectory().getPath());
            java.lang.String str = java.io.File.separator;
            sb6.append(str);
            sb6.append(android.os.Environment.DIRECTORY_PICTURES);
            sb6.append(str);
            sb6.append("Screenshots");
            sb6.append(str);
            s1Var = new com.tencent.mm.plugin.appbrand.screenshot.s1(sb6.toString(), listener);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.ScreenshotObserverCompact", e17, "<init>, create observer1 fail", new java.lang.Object[0]);
            s1Var = null;
        }
        this.f88564a = s1Var;
        try {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(android.os.Environment.getExternalStorageDirectory().getPath());
            java.lang.String str2 = java.io.File.separator;
            sb7.append(str2);
            sb7.append(android.os.Environment.DIRECTORY_DCIM);
            sb7.append(str2);
            sb7.append("Screenshots");
            sb7.append(str2);
            s1Var2 = new com.tencent.mm.plugin.appbrand.screenshot.s1(sb7.toString(), listener);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.ScreenshotObserverCompact", e18, "<init>, create observer2 fail", new java.lang.Object[0]);
        }
        this.f88565b = s1Var2;
    }
}
