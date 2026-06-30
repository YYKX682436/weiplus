package com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img;

/* loaded from: classes12.dex */
public class b extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.c f234705d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.c cVar) {
        this.f234705d = cVar;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.CheckNetworkNetStatTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.c cVar = this.f234705d;
        long uidRxBytes = android.net.TrafficStats.getUidRxBytes(cVar.f234713n);
        long uidTxBytes = android.net.TrafficStats.getUidTxBytes(cVar.f234713n);
        long j17 = (uidRxBytes - cVar.f234711i) + (uidTxBytes - cVar.f234712m);
        if (j17 <= 20480) {
            cVar.f234710h = false;
            cVar.d();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "byteDelta %d", java.lang.Long.valueOf(j17));
        cVar.f234711i = uidRxBytes;
        cVar.f234712m = uidTxBytes;
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        kq3.l lVar = nVar.f347069u;
        com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.b(cVar);
        kq3.k kVar = lVar.f392812b;
        if (kVar != null) {
            lVar.f392812b.mo50311x7ab51103(kVar.mo50292x733c63a2(1, bVar), 1000L);
        }
    }
}
