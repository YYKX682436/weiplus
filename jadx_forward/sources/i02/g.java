package i02;

/* loaded from: classes8.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f368045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f368046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f368047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i02.h f368048g;

    public g(i02.h hVar, h02.a aVar, boolean z17, long j17) {
        this.f368048g = hVar;
        this.f368045d = aVar;
        this.f368046e = z17;
        this.f368047f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        i02.h hVar = this.f368048g;
        h02.a aVar = this.f368045d;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.c(aVar.f68404x28d45f97, aVar.f68411x238eb002, aVar.f68433xf9fba680);
            zo3.p.Ui().d(aVar.f68404x28d45f97);
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 m104830xc45041ae = hVar.j().m104830xc45041ae(aVar.f68411x238eb002);
            if (m104830xc45041ae != null && ((i17 = m104830xc45041ae.f56062xbec81024) == 1 || i17 == 2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask, is running");
                return;
            }
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 j17 = hVar.j();
            java.lang.String str = aVar.f68411x238eb002;
            int m104834x729383af = j17.m104834x729383af(str, aVar.f68433xf9fba680, aVar.f68420xf1eb3542, 0, "resource/tm.android.unknown", com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.z0.f(str), aVar.f68405x56e99a7c, hVar.f368055i);
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 m104830xc45041ae2 = hVar.j().m104830xc45041ae(aVar.f68411x238eb002);
            if (m104834x729383af == 0) {
                aVar.f68441x10a0fed7 = 1;
                aVar.f68440x1bb3b54a = java.lang.System.currentTimeMillis();
                aVar.f68419xf1e9b966 = m104830xc45041ae2.f56061xa9723acf;
                aVar.f68443x78351860 = m104830xc45041ae2.f56063xeaf8334;
                aVar.f68441x10a0fed7 = 1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
                hVar.f368054h.add(java.lang.Long.valueOf(aVar.f68408x32b20428));
                i02.h.g(hVar, aVar.f68411x238eb002, 2, 0, true);
                if (this.f368046e) {
                    hVar.f178745a.h(aVar.f68408x32b20428, aVar.f68419xf1e9b966);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d", java.lang.Long.valueOf(this.f368047f));
                return;
            }
            if (m104834x729383af == 1) {
                aVar.f68441x10a0fed7 = 4;
                aVar.f68416x1c571ead = 803;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
                hVar.f178745a.c(aVar.f68408x32b20428, 803, false);
                return;
            }
            if (m104834x729383af == 2) {
                aVar.f68441x10a0fed7 = 4;
                aVar.f68416x1c571ead = 104;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
                hVar.f178745a.c(aVar.f68408x32b20428, 104, false);
                return;
            }
            if (m104834x729383af == 3) {
                aVar.f68441x10a0fed7 = 4;
                aVar.f68416x1c571ead = 700;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
                hVar.f178745a.c(aVar.f68408x32b20428, 700, false);
                return;
            }
            if (m104834x729383af != 4) {
                if (m104834x729383af != 5) {
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
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            aVar.f68422xfdca0665 = currentTimeMillis;
            aVar.f68440x1bb3b54a = currentTimeMillis;
            aVar.f68441x10a0fed7 = 6;
            aVar.f68419xf1e9b966 = m104830xc45041ae2.f56061xa9723acf;
            long j18 = m104830xc45041ae2.f56060xabd4db75;
            aVar.f68438x1bb3427e = j18;
            aVar.f68413xf432b5ad = j18;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %s", e18.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FileDownloaderImplTMAssistant", e18, "", new java.lang.Object[0]);
            aVar.f68441x10a0fed7 = 4;
            aVar.f68416x1c571ead = 103;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
            hVar.f178745a.c(aVar.f68408x32b20428, 103, false);
        }
    }
}
