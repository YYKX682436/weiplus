package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appstorage.t f76321a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f76322b = false;

    /* renamed from: c, reason: collision with root package name */
    public static volatile int f76323c = 1;

    static {
        com.tencent.mm.plugin.appbrand.appstorage.t tVar = new com.tencent.mm.plugin.appbrand.appstorage.t();
        f76321a = tVar;
        tVar.b();
    }

    public final synchronized boolean a() {
        com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
        com.tencent.mm.plugin.appbrand.app.r9.mj();
        return f76323c == 2;
    }

    public final synchronized void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKVStorageTransferABTest", "[load]");
        f76322b = true;
        f76323c = 3;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKVStorageTransferABTest", "[load] isNeedTransfer=" + f76322b + "  phases=" + f76323c);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKVStorageTransferABTest", "[load] isPerformanceReportOn=false");
    }
}
