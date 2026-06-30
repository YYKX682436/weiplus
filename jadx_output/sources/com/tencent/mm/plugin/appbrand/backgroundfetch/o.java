package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes7.dex */
class o implements com.tencent.mm.ipcinvoker.k0 {
    private o() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity appBrandBackgroundFetchDataStorageIPC$WxappIdentity = (com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity) obj;
        if (appBrandBackgroundFetchDataStorageIPC$WxappIdentity != null) {
            java.lang.String str = appBrandBackgroundFetchDataStorageIPC$WxappIdentity.f76785d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                try {
                    return new com.tencent.mm.ipcinvoker.type.IPCLong(((com.tencent.mm.plugin.appbrand.backgroundfetch.s1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.s1.class)).D4(str, appBrandBackgroundFetchDataStorageIPC$WxappIdentity.f76786e));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "GetUpdateTimeCall fail", e17);
                    return new com.tencent.mm.ipcinvoker.type.IPCLong(0L);
                }
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "GetUpdateTimeCall:data or username is null");
        return new com.tencent.mm.ipcinvoker.type.IPCLong(0L);
    }
}
