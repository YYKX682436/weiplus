package uz;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uz.j f513589d;

    public i(uz.j jVar) {
        this.f513589d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        this.f513589d.f513593a.getClass();
        h02.b g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.g();
        if (g17 == null) {
            linkedList = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiPauseTasks, sql = select * from FileDownloadInfo where status=6");
            android.database.Cursor m145256x1d3f4980 = g17.m145256x1d3f4980("select * from FileDownloadInfo where status=6", new java.lang.String[0]);
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
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178490n, 1);
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.class);
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178489m, aVar2.f68408x32b20428);
            try {
                j45.l.A(intent);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloaderFeatureService", e17.getMessage());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(710L, 25L, 1L, false);
        }
    }
}
