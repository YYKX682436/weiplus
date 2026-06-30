package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
final class k1 implements com.tencent.mm.ipcinvoker.k0 {
    private k1() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        try {
            return new com.tencent.mm.ipcinvoker.type.IPCInteger(((com.tencent.mm.plugin.appbrand.appusage.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.b6.class)).getCount());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandLocalUsageStorageIPCImpl", e17, "ipc getCount", new java.lang.Object[0]);
            return new com.tencent.mm.ipcinvoker.type.IPCInteger(0);
        }
    }
}
