package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public final class p extends c01.i8 {
    @Override // c01.i8
    public java.lang.String a() {
        return "MicroMsg.AppBrandCollectionRecordTableUpgradeIssueDataTransfer";
    }

    @Override // c01.i8
    public boolean b(int i17) {
        return !gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_COLLECTION_RECORD_TABLE_UPGRADE_ISSUE_DONE_BOOLEAN, false);
    }

    @Override // c01.i8
    public void c(int i17) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ri().A("AppBrandStarApp", "update AppBrandStarApp set orderSequence = updateTime");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_COLLECTION_RECORD_TABLE_UPGRADE_ISSUE_DONE_BOOLEAN, java.lang.Boolean.TRUE);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandCollectionRecordTableUpgradeIssueDataTransfer", th6, "transfer failed", new java.lang.Object[0]);
        }
    }
}
