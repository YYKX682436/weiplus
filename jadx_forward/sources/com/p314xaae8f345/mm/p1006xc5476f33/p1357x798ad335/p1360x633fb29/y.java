package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f178732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 f178733e;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 b0Var, long j17) {
        this.f178733e = b0Var;
        this.f178732d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        h02.a c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 d17 = this.f178733e.d(this.f178732d);
        if (d17 == null) {
            return;
        }
        iv1.f f17 = iv1.f.f();
        java.lang.String str = d17.f178495e;
        synchronized (f17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "removeDownloadTask: " + str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CDNDownloadClient", "removeDownloadTask, url invalid");
            } else {
                f17.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00(str));
                fv1.c cVar = f17.f376644e;
                if (cVar != null) {
                    try {
                        cVar.Ba(str);
                    } catch (android.os.RemoteException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadClient", "removeDownloadTask, " + e17.getMessage());
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "removeDownloadTask false, service interface is null");
            }
        }
        this.f178733e.h(d17.f178495e);
        com.p314xaae8f345.mm.vfs.w6.h(d17.f178497g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "removeDownloadTask, delete file, path: %s", d17.f178497g);
        if (d17.f178496f == 5 || (c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(this.f178732d)) == null) {
            return;
        }
        c17.f68422xfdca0665 = java.lang.System.currentTimeMillis();
        c17.f68413xf432b5ad = d17.f178500m;
        c17.f68441x10a0fed7 = 5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.m(c17.f68411x238eb002, 5);
        java.lang.Long valueOf = java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) this.f178733e.f178520i.get(d17.f178495e), c17.f68440x1bb3b54a));
        if (valueOf != null) {
            k02.m.a(this.f178732d, ((((float) (d17.f178500m - java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) this.f178733e.f178519h.get(d17.f178495e), c17.f68438x1bb3427e)).longValue())) * 1000.0f) / ((float) (java.lang.System.currentTimeMillis() - valueOf.longValue()))) / 1048576.0f, (int) ((((float) d17.f178500m) / ((float) d17.f178501n)) * 100.0f));
        }
        this.f178733e.f178519h.remove(d17.f178495e);
        this.f178733e.f178520i.remove(d17.f178495e);
        this.f178733e.f178745a.g(this.f178732d);
    }
}
