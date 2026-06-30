package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes.dex */
class c0 implements com.tencent.mm.ipcinvoker.k0 {
    private c0() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageIPC", "DeleteCall:data or username is null");
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
        }
        try {
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(((com.tencent.mm.plugin.appbrand.backgroundfetch.t1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.t1.class)).d(iPCString.f68406d));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageIPC", "DeleteCall fail", e17);
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
        }
    }
}
