package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f178507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f178508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f178509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 f178510g;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 b0Var, h02.a aVar, boolean z17, long j17) {
        this.f178510g = b0Var;
        this.f178507d = aVar;
        this.f178508e = z17;
        this.f178509f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        h02.a aVar = this.f178507d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.c(aVar.f68404x28d45f97, aVar.f68411x238eb002, aVar.f68433xf9fba680);
        zo3.p.Ui().d(this.f178507d.f68404x28d45f97);
        iv1.f f17 = iv1.f.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0.g(this.f178510g, this.f178507d);
        synchronized (f17) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17.f177032e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CDNDownloadClient", "resumeDownloadTask, info invalid");
                i17 = -1;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "resumeDownloadTask: " + g17.f177032e);
                if (((java.util.HashSet) f17.f376646g).contains(g17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "resumeDownloadTask, already in running");
                    i17 = -2;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f h17 = f17.h(g17.f177032e);
                    if (h17 != null && h17.f177044d == 104 && com.p314xaae8f345.mm.vfs.w6.j(g17.f177034g)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "resumeDownloadTask, has download success");
                        i17 = 1;
                    } else {
                        g17.f177041q = true;
                        fv1.c cVar = f17.f376644e;
                        if (cVar != null) {
                            try {
                                int aa6 = cVar.aa(g17);
                                ((iv1.d) f17.f376650n).L2(g17.f177033f, 1, 0, "");
                                if (aa6 == 0 || aa6 == -2) {
                                    f17.c(g17);
                                }
                                i17 = aa6;
                            } catch (android.os.RemoteException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadClient", "resumeDownloadTask, " + e17.getMessage());
                            }
                        }
                        f17.c(g17);
                        f17.d();
                        i17 = 0;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "resumeDownloadTask: " + i17);
        this.f178507d.f68440x1bb3b54a = java.lang.System.currentTimeMillis();
        h02.a aVar2 = this.f178507d;
        aVar2.f68438x1bb3427e = aVar2.f68413xf432b5ad;
        aVar2.f68439x5ab9b1b4 = 1;
        if (i17 == 0) {
            aVar2.f68441x10a0fed7 = 1;
            aVar2.f68416x1c571ead = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar2);
            if (this.f178508e) {
                this.f178510g.f178745a.h(this.f178509f, this.f178507d.f68419xf1e9b966);
            }
            h02.a aVar3 = this.f178507d;
            long j17 = aVar3.f68443x78351860;
            long j18 = j17 != 0 ? (aVar3.f68413xf432b5ad * 100) / j17 : 0L;
            long j19 = this.f178507d.f68413xf432b5ad;
            long j27 = this.f178507d.f68443x78351860;
            this.f178510g.l(this.f178507d.f68411x238eb002, 1, (int) j18, true, false, true);
            return;
        }
        if (i17 == -2) {
            aVar2.f68441x10a0fed7 = 1;
            aVar2.f68416x1c571ead = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar2);
            return;
        }
        if (i17 != 1) {
            aVar2.f68441x10a0fed7 = 4;
            aVar2.f68416x1c571ead = 202;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar2);
            this.f178510g.f178745a.c(this.f178509f, this.f178507d.f68416x1c571ead, false);
            return;
        }
        int i18 = aVar2.f68441x10a0fed7;
        if (i18 == 6 || i18 == 3) {
            return;
        }
        aVar2.f68441x10a0fed7 = 6;
        long j28 = aVar2.f68443x78351860;
        aVar2.f68413xf432b5ad = j28;
        aVar2.f68438x1bb3427e = j28;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        aVar2.f68422xfdca0665 = currentTimeMillis;
        aVar2.f68440x1bb3b54a = currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(this.f178507d);
        this.f178510g.f178745a.b(this.f178507d.f68408x32b20428);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178490n, 1);
        intent.setClass(this.f178510g.f178514c, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.class);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178489m, this.f178507d.f68408x32b20428);
        try {
            j45.l.A(intent);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileCDNDownloader", e18.getMessage());
        }
    }
}
