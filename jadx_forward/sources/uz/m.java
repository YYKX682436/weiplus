package uz;

@j95.b
/* loaded from: classes8.dex */
public class m extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0[] f513599d = {null};

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178440d == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178440d = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c();
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178441e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178441e = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.a(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().a(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178440d);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178441e, intentFilter);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178444h.mo48813x58998cd();
        m43.c.b().a("md5_check", new uz.j(this));
        m43.c.b().a("download_resume", new uz.l(this));
        if (f02.f.f339947a == null) {
            f02.f.f339947a = new f02.e(null);
        }
        android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
        intentFilter2.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter2.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter2.addAction(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(f02.f.f339947a, intentFilter2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Downloader.NetWorkManager", e17.getMessage());
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloaderFeatureService", "onAccountRelease");
        android.content.BroadcastReceiver broadcastReceiver = f02.f.f339947a;
        if (broadcastReceiver != null) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(broadcastReceiver);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Downloader.NetWorkManager", e17.getMessage());
            }
        }
        f02.f.f339947a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178440d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().s(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178440d);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178441e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178440d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178441e = null;
        ((java.util.concurrent.CopyOnWriteArraySet) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178442f).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178444h.mo48814x2efc64();
        ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.f178438b).clear();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        new a02.a(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0.f178513j).startWatching();
    }

    public final void wi(h02.a aVar) {
        aVar.f68410x4e46f707 = 3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i();
        long j17 = aVar.f68408x32b20428;
        i17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "resumeDownloadTask, id = " + j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "gamelog.restart,resumeDownloadTaskWhenProcessRestart id = " + j17);
        if (!i17.m(j17)) {
            h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
            if (c17 == null || c17.f68414xf4f8adf4 != 3) {
                i02.h l17 = i17.l();
                l17.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTaskWhenProcessRestart, id = " + j17);
                l17.k(j17, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 g17 = i17.g();
                g17.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileCDNDownloader", "resumeDownloadTaskWhenProcessRestart, id = " + j17);
                g17.k(j17, false);
            }
        }
        g02.c cVar = new g02.c();
        cVar.a(aVar);
        g02.b.c(24, cVar);
    }
}
