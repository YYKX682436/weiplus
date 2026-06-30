package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public abstract class x7 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f76053a;

    public static com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader a() {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader;
        synchronized (com.tencent.mm.plugin.appbrand.appcache.x7.class) {
            iCommLibReader = f76053a;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaCommLibPreloadSessionInMM", "getCurrentAcceptedCommLibReader [%s], stacktrace=%s", iCommLibReader, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        return iCommLibReader;
    }

    public static void b(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        synchronized (com.tencent.mm.plugin.appbrand.appcache.x7.class) {
            try {
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader2 = f76053a;
                if (iCommLibReader2 != null) {
                    try {
                        iCommLibReader2.close();
                    } catch (java.lang.Throwable th6) {
                        if (iCommLibReader2 != null) {
                            try {
                                iCommLibReader2.close();
                            } catch (java.lang.Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                        }
                        throw th6;
                    }
                }
                if (iCommLibReader2 != null) {
                    iCommLibReader2.close();
                }
            } catch (java.lang.Exception unused) {
            }
            f76053a = iCommLibReader;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaCommLibPreloadSessionInMM", "setCurrentUsingVersion wx.version:%s(%d)", iCommLibReader.W0(), java.lang.Integer.valueOf(iCommLibReader.i()));
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.plugin.appbrand.appcache.w7.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((com.tencent.mm.plugin.appbrand.appcache.w7) ((fs.n) qVar.get())).J1(iCommLibReader);
            }
        }
    }
}
