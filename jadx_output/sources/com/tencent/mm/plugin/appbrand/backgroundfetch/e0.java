package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes.dex */
class e0 implements com.tencent.mm.ipcinvoker.k0 {
    private e0() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenStorageIPC$WxappParams appBrandBackgroundFetchDataTokenStorageIPC$WxappParams = (com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenStorageIPC$WxappParams) obj;
        if (appBrandBackgroundFetchDataTokenStorageIPC$WxappParams != null) {
            java.lang.String str = appBrandBackgroundFetchDataTokenStorageIPC$WxappParams.f76797d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                try {
                    return new com.tencent.mm.ipcinvoker.type.IPCBoolean(((com.tencent.mm.plugin.appbrand.backgroundfetch.t1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.t1.class)).P2(str, appBrandBackgroundFetchDataTokenStorageIPC$WxappParams.f76798e));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageIPC", "SetCall fail", e17);
                    return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
                }
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageIPC", "SetCall:data or username is null");
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
    }
}
