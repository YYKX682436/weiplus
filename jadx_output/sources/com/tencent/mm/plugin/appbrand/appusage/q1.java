package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
final class q1 implements com.tencent.mm.ipcinvoker.k0 {
    private q1() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appusage.AppIdentity appIdentity = (com.tencent.mm.plugin.appbrand.appusage.AppIdentity) obj;
        try {
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(((com.tencent.mm.plugin.appbrand.appusage.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.b6.class)).x0(appIdentity.f76359d, appIdentity.f76360e));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandLocalUsageStorageIPCImpl", e17, "ipc removeUsage", new java.lang.Object[0]);
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
        }
    }
}
