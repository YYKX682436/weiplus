package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public abstract class e8 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f75515a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f75516b;

    static {
        pe.a.f353588a = new com.tencent.mm.plugin.appbrand.appcache.z7();
        f75516b = new java.lang.Object();
    }

    public static com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader a() {
        iz5.a.g(null, com.tencent.mm.sdk.platformtools.x2.n());
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibRuntimeReader", "ensureLibReaderInMainProcess()");
        java.lang.Object invoke = new com.tencent.mm.plugin.appbrand.appcache.c8().invoke(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
        return invoke instanceof com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader ? (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) invoke : f75515a;
    }

    public static synchronized com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader b() {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader;
        synchronized (com.tencent.mm.plugin.appbrand.appcache.e8.class) {
            if (f75515a == null) {
                d();
            }
            iCommLibReader = f75515a;
        }
        return iCommLibReader;
    }

    public static synchronized void c(boolean z17) {
        synchronized (com.tencent.mm.plugin.appbrand.appcache.e8.class) {
            if (f75515a != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibRuntimeReader", "load(), sReader %s loaded. stack:%s", f75515a, android.util.Log.getStackTraceString(new java.lang.Throwable()));
                return;
            }
            if (com.tencent.mm.plugin.appbrand.appcache.w8.f76029d == null) {
                com.tencent.mm.plugin.appbrand.appcache.w8.f76029d = java.lang.Boolean.FALSE;
            }
            if (com.tencent.mm.plugin.appbrand.appcache.w8.f76029d.booleanValue()) {
                f75515a = com.tencent.mm.plugin.appbrand.appcache.AssetReader.f75370n;
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibRuntimeReader", "load(), forceLocal, use AssetReader");
                return;
            }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo a17 = com.tencent.mm.plugin.appbrand.appcache.c8.a(false);
            if (a17 == null) {
                a17 = com.tencent.mm.plugin.appbrand.appcache.c8.a(true);
            }
            if (a17 != null) {
                f75515a = new com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$PkgReader(a17);
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibRuntimeReader", "load(), useSubProcessLoadRemote, success");
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.appcache.a8());
            } else {
                if (com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.d()) {
                    throw new java.lang.IllegalArgumentException("Unknown result[SubProcessLoad]");
                }
                f75515a = com.tencent.mm.plugin.appbrand.appcache.AssetReader.f75370n;
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibRuntimeReader", "load(), use AssetReader");
            }
        }
    }

    public static synchronized void d() {
        com.tencent.mm.plugin.appbrand.appcache.AssetReader assetReader;
        synchronized (com.tencent.mm.plugin.appbrand.appcache.e8.class) {
            try {
                c(false);
            } catch (java.lang.Throwable th6) {
                try {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibRuntimeReader", "loadOrFallback throw %s", android.util.Log.getStackTraceString(th6));
                    if (f75515a == null) {
                        assetReader = com.tencent.mm.plugin.appbrand.appcache.AssetReader.f75370n;
                    }
                } catch (java.lang.Throwable th7) {
                    if (f75515a == null) {
                        f75515a = com.tencent.mm.plugin.appbrand.appcache.AssetReader.f75370n;
                    }
                    throw th7;
                }
            }
            if (f75515a == null) {
                assetReader = com.tencent.mm.plugin.appbrand.appcache.AssetReader.f75370n;
                f75515a = assetReader;
            }
        }
    }
}
