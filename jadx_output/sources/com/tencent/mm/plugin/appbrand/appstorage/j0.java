package com.tencent.mm.plugin.appbrand.appstorage;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appstorage/j0;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/plugin/appbrand/appstorage/AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class j0 implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    public static final com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct a(com.tencent.mm.plugin.appbrand.appstorage.j0 j0Var, com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams appBrandStorageQuotaManager$CleanupTempFilesOnExitParams) {
        j0Var.getClass();
        com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct weAppFileSystemTempFileLastOccupationStatStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct();
        weAppFileSystemTempFileLastOccupationStatStruct.f62263j = 1L;
        weAppFileSystemTempFileLastOccupationStatStruct.f62257d = weAppFileSystemTempFileLastOccupationStatStruct.b("AppId", appBrandStorageQuotaManager$CleanupTempFilesOnExitParams.f76116d, true);
        weAppFileSystemTempFileLastOccupationStatStruct.f62258e = appBrandStorageQuotaManager$CleanupTempFilesOnExitParams.f76122m;
        int i17 = appBrandStorageQuotaManager$CleanupTempFilesOnExitParams.f76123n;
        weAppFileSystemTempFileLastOccupationStatStruct.f62259f = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.f.demo : cm.f.debug : cm.f.release;
        weAppFileSystemTempFileLastOccupationStatStruct.f62260g = appBrandStorageQuotaManager$CleanupTempFilesOnExitParams.f76124o;
        return weAppFileSystemTempFileLastOccupationStatStruct;
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams appBrandStorageQuotaManager$CleanupTempFilesOnExitParams = (com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams) obj;
        if (appBrandStorageQuotaManager$CleanupTempFilesOnExitParams != null) {
            ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.appstorage.i0(appBrandStorageQuotaManager$CleanupTempFilesOnExitParams, this, appBrandStorageQuotaManager$CleanupTempFilesOnExitParams), "AppBrandStorageQuotaManager");
        }
    }
}
