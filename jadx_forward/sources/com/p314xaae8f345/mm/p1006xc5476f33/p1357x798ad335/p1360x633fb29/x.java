package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f178725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 f178726e;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 b0Var, h02.a aVar) {
        this.f178726e = b0Var;
        this.f178725d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        h02.a aVar = this.f178725d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.c(aVar.f68404x28d45f97, aVar.f68411x238eb002, aVar.f68433xf9fba680);
        zo3.p.Ui().d(this.f178725d.f68404x28d45f97);
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0.g(this.f178726e, this.f178725d);
        iv1.f f17 = iv1.f.f();
        synchronized (f17) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17.f177032e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CDNDownloadClient", "addDownloadTask, info invalid");
                i17 = -1;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "addDownloadTask filePath:%s, url:%s", g17.f177034g, g17.f177032e);
                if (((java.util.HashSet) f17.f376646g).contains(g17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "addDownloadTask, already in running");
                    i17 = -2;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f h17 = f17.h(g17.f177032e);
                    if (h17 != null && h17.f177044d == 104 && com.p314xaae8f345.mm.vfs.w6.j(g17.f177034g)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "addDownloadTask, has download success");
                        i17 = 1;
                    } else {
                        fv1.c cVar = f17.f376644e;
                        if (cVar != null) {
                            try {
                                int y27 = cVar.y2(g17);
                                ((iv1.d) f17.f376650n).L2(g17.f177033f, 1, 0, "");
                                if (y27 == 0 || y27 == -2) {
                                    f17.c(g17);
                                }
                                i17 = y27;
                            } catch (android.os.RemoteException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadClient", "addDownloadTask, " + e17.getMessage());
                            }
                        }
                        f17.c(g17);
                        f17.d();
                        i17 = 0;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "addDownloadTask: ret = %d, downloadId = %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f178725d.f68408x32b20428));
        if (i17 == 0) {
            h02.a aVar2 = this.f178725d;
            aVar2.f68441x10a0fed7 = 1;
            aVar2.f68440x1bb3b54a = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.a(this.f178725d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 l0Var = this.f178726e.f178745a;
            h02.a aVar3 = this.f178725d;
            l0Var.i(aVar3.f68408x32b20428, aVar3.f68419xf1e9b966);
            this.f178726e.l(this.f178725d.f68411x238eb002, 1, 0, true, false, false);
            return;
        }
        if (i17 == -2) {
            h02.a aVar4 = this.f178725d;
            aVar4.f68441x10a0fed7 = 1;
            aVar4.f68440x1bb3b54a = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.a(this.f178725d);
            return;
        }
        if (i17 != 1) {
            h02.a aVar5 = this.f178725d;
            aVar5.f68441x10a0fed7 = 4;
            aVar5.f68416x1c571ead = 201;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.a(aVar5);
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 l0Var2 = this.f178726e.f178745a;
            h02.a aVar6 = this.f178725d;
            l0Var2.c(aVar6.f68408x32b20428, aVar6.f68416x1c571ead, false);
            return;
        }
        h02.a aVar7 = this.f178725d;
        aVar7.f68441x10a0fed7 = 6;
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(aVar7.f68419xf1e9b966);
        aVar7.f68443x78351860 = k17;
        aVar7.f68413xf432b5ad = k17;
        aVar7.f68438x1bb3427e = k17;
        h02.a aVar8 = this.f178725d;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        aVar8.f68422xfdca0665 = currentTimeMillis;
        aVar8.f68440x1bb3b54a = currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.a(this.f178725d);
        this.f178726e.f178745a.b(this.f178725d.f68408x32b20428);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178490n, 1);
        intent.setClass(this.f178726e.f178514c, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.class);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178489m, this.f178725d.f68408x32b20428);
        try {
            j45.l.A(intent);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileCDNDownloader", e18.getMessage());
        }
    }
}
