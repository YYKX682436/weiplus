package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class i implements com.tencent.mm.ipcinvoker.r {
    public i(com.tencent.mm.plugin.appbrand.backgroundrunning.k kVar) {
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        if (iPCBoolean != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningManagerService", "sendOperation(appbrand process), result:%s", java.lang.Boolean.valueOf(iPCBoolean.f68400d));
        }
    }
}
