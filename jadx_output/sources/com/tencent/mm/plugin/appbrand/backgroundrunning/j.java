package com.tencent.mm.plugin.appbrand.backgroundrunning;

@mk0.a
/* loaded from: classes7.dex */
class j implements com.tencent.mm.ipcinvoker.j {
    private j() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel = (com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel) obj;
        if (appBrandBackgroundRunningOperationParcel == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandBackgroundRunningManagerService", "sendOperation(MM process), data is null");
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
        } else if (!i95.n0.h(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class)) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
        } else {
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.b1) ((com.tencent.mm.plugin.appbrand.backgroundrunning.x0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class))).Di(appBrandBackgroundRunningOperationParcel);
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
        }
    }
}
