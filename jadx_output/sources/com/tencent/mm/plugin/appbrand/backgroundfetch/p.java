package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes7.dex */
class p implements com.tencent.mm.ipcinvoker.k0 {
    private p() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappParams appBrandBackgroundFetchDataStorageIPC$WxappParams = (com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappParams) obj;
        if (appBrandBackgroundFetchDataStorageIPC$WxappParams == null || com.tencent.mm.sdk.platformtools.t8.K0(appBrandBackgroundFetchDataStorageIPC$WxappParams.f76787d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "SetCall:data or username is null");
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
        }
        try {
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(((com.tencent.mm.plugin.appbrand.backgroundfetch.s1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.s1.class)).L3(appBrandBackgroundFetchDataStorageIPC$WxappParams.f76787d, appBrandBackgroundFetchDataStorageIPC$WxappParams.f76788e, appBrandBackgroundFetchDataStorageIPC$WxappParams.f76789f, appBrandBackgroundFetchDataStorageIPC$WxappParams.f76790g, appBrandBackgroundFetchDataStorageIPC$WxappParams.f76791h, appBrandBackgroundFetchDataStorageIPC$WxappParams.f76792i, appBrandBackgroundFetchDataStorageIPC$WxappParams.f76793m, appBrandBackgroundFetchDataStorageIPC$WxappParams.f76794n));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "SetCall fail", e17);
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
        }
    }
}
