package i02;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f368034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i02.h f368035e;

    public a(i02.h hVar, h02.a aVar) {
        this.f368035e = hVar;
        this.f368034d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i02.h hVar = this.f368035e;
        h02.a aVar = this.f368034d;
        int i17 = -1;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.c(aVar.f68404x28d45f97, aVar.f68411x238eb002, aVar.f68433xf9fba680);
            zo3.p.Ui().d(aVar.f68404x28d45f97);
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 j17 = hVar.j();
            java.lang.String str = aVar.f68411x238eb002;
            i17 = j17.m104834x729383af(str, aVar.f68433xf9fba680, aVar.f68420xf1eb3542, 0, "resource/tm.android.unknown", com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.z0.f(str), aVar.f68405x56e99a7c, hVar.f368055i);
            if (i17 == 0) {
                com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 m104830xc45041ae = hVar.j().m104830xc45041ae(aVar.f68411x238eb002);
                java.lang.String str2 = m104830xc45041ae.f56061xa9723acf;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "Task Info from TMAssistant: URL: %s, PATH: %s, fileLen: %d, receiveLen: %d", aVar.f68411x238eb002, str2, java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(str2)), java.lang.Long.valueOf(m104830xc45041ae.f56060xabd4db75));
                aVar.f68441x10a0fed7 = 1;
                aVar.f68440x1bb3b54a = java.lang.System.currentTimeMillis();
                long j18 = m104830xc45041ae.f56060xabd4db75;
                aVar.f68438x1bb3427e = j18;
                aVar.f68419xf1e9b966 = m104830xc45041ae.f56061xa9723acf;
                aVar.f68413xf432b5ad = j18;
                aVar.f68443x78351860 = m104830xc45041ae.f56063xeaf8334;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
                hVar.f368054h.add(java.lang.Long.valueOf(aVar.f68408x32b20428));
                i02.h.g(hVar, aVar.f68411x238eb002, m104830xc45041ae.f56062xbec81024, 0, true);
                hVar.f178745a.i(aVar.f68408x32b20428, m104830xc45041ae.f56061xa9723acf);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask: id: %d, url: %s, path: %s", java.lang.Long.valueOf(aVar.f68408x32b20428), aVar.f68411x238eb002, aVar.f68419xf1e9b966);
                return;
            }
            if (i17 == 1) {
                aVar.f68441x10a0fed7 = 4;
                aVar.f68416x1c571ead = 803;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
                hVar.f178745a.c(aVar.f68408x32b20428, 803, false);
                return;
            }
            if (i17 == 2) {
                aVar.f68441x10a0fed7 = 4;
                aVar.f68416x1c571ead = 104;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
                hVar.f178745a.c(aVar.f68408x32b20428, 104, false);
                return;
            }
            if (i17 == 3) {
                aVar.f68441x10a0fed7 = 4;
                aVar.f68416x1c571ead = 700;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
                hVar.f178745a.c(aVar.f68408x32b20428, 700, false);
                return;
            }
            if (i17 != 4) {
                if (i17 != 5) {
                    return;
                }
                aVar.f68440x1bb3b54a = java.lang.System.currentTimeMillis();
                aVar.f68441x10a0fed7 = 1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
                hVar.f368054h.add(java.lang.Long.valueOf(aVar.f68408x32b20428));
                i02.h.g(hVar, aVar.f68411x238eb002, 2, 0, true);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "file has existed");
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 m104830xc45041ae2 = hVar.j().m104830xc45041ae(aVar.f68411x238eb002);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            aVar.f68422xfdca0665 = currentTimeMillis;
            aVar.f68440x1bb3b54a = currentTimeMillis;
            aVar.f68441x10a0fed7 = 6;
            aVar.f68419xf1e9b966 = m104830xc45041ae2.f56061xa9723acf;
            long j19 = m104830xc45041ae2.f56060xabd4db75;
            aVar.f68438x1bb3427e = j19;
            aVar.f68413xf432b5ad = j19;
            aVar.f68443x78351860 = m104830xc45041ae2.f56063xeaf8334;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
            hVar.f178745a.b(aVar.f68408x32b20428);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178490n, 1);
            intent.setClass(hVar.f368050d, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.class);
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178489m, aVar.f68408x32b20428);
            try {
                j45.l.A(intent);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", e17.getMessage());
            }
            hVar.f368054h.remove(java.lang.Long.valueOf(aVar.f68408x32b20428));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "Adding task to TMAssistant failed: ", e18.getMessage());
            aVar.f68416x1c571ead = 102;
            aVar.f68441x10a0fed7 = 4;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "Adding Task via TMAssistant Failed: %d, url: %s", java.lang.Integer.valueOf(i17), aVar.f68411x238eb002);
            hVar.f178745a.c(aVar.f68408x32b20428, 102, false);
        }
    }
}
