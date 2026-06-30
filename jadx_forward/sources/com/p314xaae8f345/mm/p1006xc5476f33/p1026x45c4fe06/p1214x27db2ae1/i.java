package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.ServiceC12737xad93c887 f172262d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.ServiceC12737xad93c887 serviceC12737xad93c887) {
        this.f172262d = serviceC12737xad93c887;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.ServiceC12737xad93c887.f172182e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.ServiceC12737xad93c887 serviceC12737xad93c887 = this.f172262d;
        serviceC12737xad93c887.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AndroidWxaCommLibV8SnapshotService", "exitIfCan");
        if (serviceC12737xad93c887.f172183d.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AndroidWxaCommLibV8SnapshotService", "exitIfCan, do exit");
            serviceC12737xad93c887.stopSelf();
        }
    }
}
