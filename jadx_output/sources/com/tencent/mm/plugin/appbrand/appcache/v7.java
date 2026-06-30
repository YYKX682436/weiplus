package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public abstract class v7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.c8 f76009a = new com.tencent.mm.plugin.appbrand.appcache.c8();

    public static void a() {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader;
        com.tencent.mm.plugin.appbrand.appcache.s7 s7Var;
        java.lang.Object invoke = f76009a.invoke(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
        if (invoke instanceof com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) {
            iCommLibReader = (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) invoke;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaCommLibPreloadNotify", "doNotify check ok ret[%s]", invoke);
        } else if (invoke instanceof com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) {
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) invoke;
            iCommLibReader = wxaPkgWrappingInfo.f75401f ? com.tencent.mm.plugin.appbrand.appcache.AssetReader.f75370n : new com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$PkgReader(wxaPkgWrappingInfo);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaCommLibPreloadNotify", "doNotify check ok ret[%s]", invoke);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WxaCommLibPreloadNotify", "doNotify check failed ret[%s]", invoke);
            iCommLibReader = com.tencent.mm.plugin.appbrand.appcache.AssetReader.f75370n;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaCommLibPreloadNotify", "doNotify invoke ipc reset with reader:%s", iCommLibReader);
        java.util.Objects.requireNonNull(iCommLibReader);
        java.lang.String[] strArr = gm0.j1.f273205l;
        int i17 = 0;
        while (true) {
            s7Var = null;
            if (i17 >= 5) {
                break;
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b + strArr[i17];
            if (com.tencent.mm.sdk.platformtools.x2.o(str)) {
                com.tencent.mm.ipcinvoker.extension.l.a(str, iCommLibReader, com.tencent.mm.plugin.appbrand.appcache.t7.class, null);
            }
            i17++;
        }
        if (com.tencent.mm.plugin.appbrand.appcache.e8.f75515a != null) {
            new com.tencent.mm.plugin.appbrand.appcache.t7().invoke(iCommLibReader, null);
        }
    }

    public static void b() {
        try {
            f76009a.invoke(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
        } catch (com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$AccountNotReadyError unused) {
            throw new c01.c();
        }
    }
}
