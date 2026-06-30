package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes10.dex */
final class g implements com.tencent.mm.ipcinvoker.k0 {
    private g() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AppBrandRecordClientService", "ipc updateDeviceInfo");
            return new com.tencent.mm.ipcinvoker.type.IPCString(gm0.j1.u().j().n0(77825));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.AppBrandRecordClientService", e17, "ipc updateDeviceInfo task", new java.lang.Object[0]);
            return new com.tencent.mm.ipcinvoker.type.IPCString("");
        }
    }
}
