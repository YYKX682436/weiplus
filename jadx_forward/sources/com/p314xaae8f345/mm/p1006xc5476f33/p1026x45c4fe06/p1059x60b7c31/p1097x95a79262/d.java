package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1097x95a79262;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1097x95a79262.e f163826d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1097x95a79262.e eVar) {
        this.f163826d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12430xb6dd70e1 c12430xb6dd70e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12430xb6dd70e1) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(this.f163826d.f163827d.f156336n), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1097x95a79262.f.class);
        if (c12430xb6dd70e1 == null || (arrayList = c12430xb6dd70e1.f167548d) == null || arrayList.size() < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", "fetchWxaAppMsgChannelListSync cache is empty.");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", "fetchWxaAppMsgChannelListSync appId:%s, cache list:%d", this.f163826d.f163827d.f156336n, java.lang.Integer.valueOf(c12430xb6dd70e1.f167548d.size()));
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1097x95a79262.g().x(this.f163826d.f163827d.C0(), c12430xb6dd70e1.f167548d);
        }
    }
}
