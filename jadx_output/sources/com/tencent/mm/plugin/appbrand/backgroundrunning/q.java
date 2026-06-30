package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class q implements com.tencent.mm.plugin.appbrand.ipc.l0 {
    @Override // com.tencent.mm.plugin.appbrand.ipc.l0
    public void a(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel) {
            com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel = (com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "app received data, operation:%s", mMBackgroundRunningOperationParcel);
            if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class) != null) {
                ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) ((com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class))).Ai(mMBackgroundRunningOperationParcel);
            }
        }
    }
}
