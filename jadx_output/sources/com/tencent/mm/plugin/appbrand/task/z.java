package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler f89221d;

    public z(com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler appBrandPreloadProfiler) {
        this.f89221d = appBrandPreloadProfiler;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler appBrandPreloadProfiler = this.f89221d;
        try {
            java.lang.String str = appBrandPreloadProfiler.f88980f;
            if (str != null) {
                java.lang.Class.forName(str).newInstance();
            }
            java.lang.String str2 = appBrandPreloadProfiler.f88981g;
            if (str2 != null) {
                java.lang.Class.forName(str2).newInstance();
            }
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "run: ", e17);
        }
    }
}
