package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 f178715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h02.a f178716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.y0 f178717f;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.y0 y0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var, h02.a aVar) {
        this.f178717f = y0Var;
        this.f178715d = t0Var;
        this.f178716e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f178715d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.y0 y0Var = this.f178717f;
        h02.a aVar = this.f178716e;
        long h17 = y0Var.h(aVar);
        if (h17 <= 0) {
            aVar.f68441x10a0fed7 = 4;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
            y0Var.f178745a.c(aVar.f68408x32b20428, 901, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImpl23", "addDownloadTask Failed: Invalid downloadId");
            return;
        }
        aVar.f68442x143643eb = h17;
        aVar.f68441x10a0fed7 = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
        y0Var.f178745a.i(aVar.f68408x32b20428, aVar.f68419xf1e9b966);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().m(aVar.f68408x32b20428)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i();
            long j17 = aVar.f68408x32b20428;
            i17.getClass();
            ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.f178656h).put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(h17));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("off_line_download_ids", 0).edit().putLong(j17 + "", h17).commit();
        }
        y0Var.f178736e.add(java.lang.Long.valueOf(aVar.f68408x32b20428));
        if (y0Var.f178737f.e()) {
            y0Var.f178737f.c(100L, 100L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImpl23", "addDownloadTask: id: %d, url: %s, path: %s", java.lang.Long.valueOf(aVar.f68408x32b20428), aVar.f68411x238eb002, aVar.f68419xf1e9b966);
    }
}
