package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes.dex */
class d0 implements com.tencent.mm.ipcinvoker.k0 {
    private d0() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageIPC", "GetCall:data or username is null");
            return null;
        }
        try {
            return ((com.tencent.mm.plugin.appbrand.backgroundfetch.t1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.t1.class)).get(iPCString.f68406d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageIPC", "GetCall fail", e17);
            return null;
        }
    }
}
