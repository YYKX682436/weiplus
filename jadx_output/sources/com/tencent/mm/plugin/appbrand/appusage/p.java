package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class p extends c01.i8 {
    @Override // c01.i8
    public java.lang.String a() {
        return "MicroMsg.AppBrandCollectionRecordTableUpgradeIssueDataTransfer";
    }

    @Override // c01.i8
    public boolean b(int i17) {
        return !gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_COLLECTION_RECORD_TABLE_UPGRADE_ISSUE_DONE_BOOLEAN, false);
    }

    @Override // c01.i8
    public void c(int i17) {
        try {
            com.tencent.mm.plugin.appbrand.app.r9.Ri().A("AppBrandStarApp", "update AppBrandStarApp set orderSequence = updateTime");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_COLLECTION_RECORD_TABLE_UPGRADE_ISSUE_DONE_BOOLEAN, java.lang.Boolean.TRUE);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandCollectionRecordTableUpgradeIssueDataTransfer", th6, "transfer failed", new java.lang.Object[0]);
        }
    }
}
