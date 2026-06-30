package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1097x95a79262;

/* loaded from: classes7.dex */
final class f implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private f() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", "ipc PullOnReceiveCacheMsgChannelBatchTask Task, src:%s", c10756x2a5d7b2d.m46222x9616526c());
            oh1.h1 h1Var = oh1.h1.INSTANCE;
            java.lang.String m46222x9616526c = c10756x2a5d7b2d.m46222x9616526c();
            synchronized (h1Var) {
                arrayList = (java.util.ArrayList) h1Var.f426758d.remove(m46222x9616526c);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", e17, "ipc PullOnReceiveCacheMsgChannelBatchTask task", new java.lang.Object[0]);
        }
        if (arrayList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", "msgChannels is null");
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12430xb6dd70e1();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12430xb6dd70e1 c12430xb6dd70e1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12430xb6dd70e1();
        c12430xb6dd70e1.f167548d = arrayList;
        return c12430xb6dd70e1;
    }
}
