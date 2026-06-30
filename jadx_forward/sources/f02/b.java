package f02;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {
    public b(f02.c cVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m k17;
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.q.f178649a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadRetry", "gamelog.download, checkRetryFailTask , prepare check");
            java.util.HashSet hashSet = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.q.f178650b;
            hashSet.clear();
            h02.b g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.g();
            if (g17 == null) {
                linkedList = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiPauseTasks, sql = select * from FileDownloadInfo where status=4");
                android.database.Cursor m145256x1d3f4980 = g17.m145256x1d3f4980("select * from FileDownloadInfo where status=4", new java.lang.String[0]);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                if (m145256x1d3f4980 != null) {
                    while (m145256x1d3f4980.moveToNext()) {
                        h02.a aVar = new h02.a();
                        aVar.mo9015xbf5d97fd(m145256x1d3f4980);
                        linkedList2.add(aVar);
                    }
                    m145256x1d3f4980.close();
                }
                linkedList = linkedList2;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                return;
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                h02.a aVar2 = (h02.a) it.next();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.h(aVar2.f68411x238eb002)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadRetry", "hasDuplicatedTask");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.k(aVar2.f68411x238eb002);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(710L, 26L, 1L, false);
                } else if (aVar2.f68414xf4f8adf4 == 3 && com.p314xaae8f345.mm.vfs.w6.j(aVar2.f68419xf1e9b966)) {
                    int i17 = aVar2.f68416x1c571ead;
                    if (!(i17 == 802 || i17 == 806 || i17 == 805) && (k17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.k(aVar2.f68404x28d45f97, false)) != null && k17.k()) {
                        if (java.lang.System.currentTimeMillis() - aVar2.f68408x32b20428 <= 259200000) {
                            aVar2.f68410x4e46f707 = 3;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar2);
                            g02.c cVar = new g02.c();
                            cVar.a(aVar2);
                            g02.b.c(24, cVar);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().x(aVar2);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadRetry", "gamelog.download, checkRetryFailTask , retry downloadId = %d", java.lang.Long.valueOf(aVar2.f68408x32b20428));
                            hashSet.add(java.lang.Long.valueOf(aVar2.f68408x32b20428));
                            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.q.f178649a.put(java.lang.Long.valueOf(aVar2.f68408x32b20428), 1);
                        }
                    }
                }
            }
        }
    }
}
