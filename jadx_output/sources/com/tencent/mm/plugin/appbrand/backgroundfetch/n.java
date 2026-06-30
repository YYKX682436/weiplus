package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes7.dex */
class n implements com.tencent.mm.ipcinvoker.k0 {
    private n() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity appBrandBackgroundFetchDataStorageIPC$WxappIdentity = (com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity) obj;
        if (appBrandBackgroundFetchDataStorageIPC$WxappIdentity != null) {
            java.lang.String str = appBrandBackgroundFetchDataStorageIPC$WxappIdentity.f76785d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                try {
                    return ((com.tencent.mm.plugin.appbrand.backgroundfetch.s1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.s1.class)).E4(str, appBrandBackgroundFetchDataStorageIPC$WxappIdentity.f76786e);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "GetCall fail", e17);
                    return null;
                }
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "GetCall:data or username is null");
        return null;
    }
}
