package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class g0 implements com.tencent.wechat.aff.affroam.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f92596a;

    public g0(yz5.l lVar) {
        this.f92596a = lVar;
    }

    @Override // com.tencent.wechat.aff.affroam.f1
    public final void a(int i17, com.tencent.wechat.aff.affroam.f fVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "getRestoreConversationList, errorCode = " + i17 + ", convList = " + fVar.f215824d.size());
        yz5.l lVar = this.f92596a;
        if (i17 == 0) {
            lVar.invoke(fVar);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewRoamBackupManager", "getBackedUpConversationListAsync return errorCode = %s", java.lang.Integer.valueOf(i17));
            lVar.invoke(null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "getBackedUpConversationListAsync done");
    }
}
