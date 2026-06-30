package f02;

/* loaded from: classes8.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f339946d;

    public d(f02.e eVar, android.content.Context context) {
        this.f339946d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!gm0.j1.a() || gm0.m.r()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Downloader.NetWorkManager", "acc has not ready");
            return;
        }
        int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (m40067xab9ed241 == f02.f.f339948b) {
            return;
        }
        f02.f.f339948b = m40067xab9ed241;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Downloader.NetWorkManager", "onNetStateChange, netState = " + m40067xab9ed241);
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(this.f339946d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Downloader.NetWorkManager", "network is not connected");
            return;
        }
        java.util.LinkedList linkedList = null;
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(m40067xab9ed241)) {
            h02.b g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.g();
            if (g17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiRunningTasks, sql = select * from FileDownloadInfo where status=1 and downloadInWifi=1");
                android.database.Cursor m145256x1d3f4980 = g17.m145256x1d3f4980("select * from FileDownloadInfo where status=1 and downloadInWifi=1", new java.lang.String[0]);
                linkedList = new java.util.LinkedList();
                if (m145256x1d3f4980 != null) {
                    while (m145256x1d3f4980.moveToNext()) {
                        h02.a aVar = new h02.a();
                        aVar.mo9015xbf5d97fd(m145256x1d3f4980);
                        linkedList.add(aVar);
                    }
                    m145256x1d3f4980.close();
                }
            }
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    h02.a aVar2 = (h02.a) it.next();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Downloader.NetWorkManager", "pauseTask, appId: " + aVar2.f68404x28d45f97);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().d(aVar2.f68408x32b20428);
                }
                return;
            }
            return;
        }
        h02.b g18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.g();
        if (g18 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiPauseTasks, sql = select * from FileDownloadInfo where status<>1 and status<>3 and downloadInWifi=1");
            android.database.Cursor m145256x1d3f49802 = g18.m145256x1d3f4980("select * from FileDownloadInfo where status<>1 and status<>3 and downloadInWifi=1", new java.lang.String[0]);
            linkedList = new java.util.LinkedList();
            if (m145256x1d3f49802 != null) {
                while (m145256x1d3f49802.moveToNext()) {
                    h02.a aVar3 = new h02.a();
                    aVar3.mo9015xbf5d97fd(m145256x1d3f49802);
                    linkedList.add(aVar3);
                }
                m145256x1d3f49802.close();
            }
        }
        if (linkedList != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                h02.a aVar4 = (h02.a) it6.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Downloader.NetWorkManager", "resumeTask, appId = %s, state = %d", aVar4.f68404x28d45f97, java.lang.Integer.valueOf(aVar4.f68441x10a0fed7));
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.h(aVar4.f68411x238eb002)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Downloader.NetWorkManager", "hasDuplicatedTask");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.k(aVar4.f68411x238eb002);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(710L, 26L, 1L, false);
                } else {
                    int i17 = aVar4.f68441x10a0fed7;
                    if (i17 == 2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i();
                        long j17 = aVar4.f68408x32b20428;
                        i18.getClass();
                        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                        if (c17 == null || c17.f68414xf4f8adf4 != 3) {
                            i02.h l17 = i18.l();
                            l17.getClass();
                            h02.a c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                            if (c18 != null) {
                                c18.f68410x4e46f707 = 2;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c18);
                            }
                            g02.b.e(j17, 14);
                            l17.k(j17, true);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b0 g19 = i18.g();
                            g19.getClass();
                            h02.a c19 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
                            if (c19 != null) {
                                c19.f68410x4e46f707 = 2;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c19);
                            }
                            g02.b.e(j17, 14);
                            g19.k(j17, true);
                        }
                    } else if (i17 == 0 && aVar4.f68431x4651c731) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i();
                        i19.getClass();
                        if (aVar4.f68414xf4f8adf4 == 3) {
                            i19.g().e(aVar4);
                        } else {
                            i19.h().e(aVar4);
                        }
                    }
                }
            }
        }
        m43.c.b().a("failed_download_resume", new f02.c(this));
    }
}
