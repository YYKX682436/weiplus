package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class g0 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f174129a;

    public g0(yz5.l lVar) {
        this.f174129a = lVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f1
    public final void a(int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f fVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "getRestoreConversationList, errorCode = " + i17 + ", convList = " + fVar.f297357d.size());
        yz5.l lVar = this.f174129a;
        if (i17 == 0) {
            lVar.mo146xb9724478(fVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewRoamBackupManager", "getBackedUpConversationListAsync return errorCode = %s", java.lang.Integer.valueOf(i17));
            lVar.mo146xb9724478(null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "getBackedUpConversationListAsync done");
    }
}
