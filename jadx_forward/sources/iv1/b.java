package iv1;

/* loaded from: classes8.dex */
public class b implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv1.f f376637d;

    public b(iv1.f fVar) {
        this.f376637d = fVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        fv1.c aVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "onServiceConnected");
        iv1.f fVar = this.f376637d;
        int i17 = fv1.b.f348503d;
        if (iBinder == null) {
            aVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof fv1.c)) ? new fv1.a(iBinder) : (fv1.c) queryLocalInterface;
        }
        fVar.f376644e = aVar;
        iv1.f fVar2 = this.f376637d;
        fVar2.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "registerCallback");
            fVar2.f376644e.ca(fVar2.f376650n);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadClient", "registerCallback: " + e17.getMessage());
        }
        iv1.f fVar3 = this.f376637d;
        fVar3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "resumeTaskWhenSvrConnected");
        java.util.HashSet hashSet = (java.util.HashSet) fVar3.f376646g;
        if (hashSet.size() > 0) {
            fVar3.b();
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00 c13091xf399cf00 = (com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "resumeTaskWhenSvrConnected, url: %s, resume: %b", c13091xf399cf00.f177032e, java.lang.Boolean.valueOf(c13091xf399cf00.f177041q));
            try {
                if (c13091xf399cf00.f177041q) {
                    fVar3.f376644e.aa(c13091xf399cf00);
                } else {
                    fVar3.f376644e.y2(c13091xf399cf00);
                }
                ((iv1.d) fVar3.f376650n).L2(c13091xf399cf00.f177033f, 1, 0, "");
            } catch (android.os.RemoteException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadClient", "resumeTaskWhenSvrConnected: " + e18);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(710L, 0L, 1L, false);
            }
        }
        try {
            java.lang.Object obj = iv1.f.f376642p;
            synchronized (obj) {
                obj.notifyAll();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "onServiceDisconnected");
        iv1.f fVar = this.f376637d;
        if (((java.util.HashSet) fVar.f376646g).size() != 0) {
            java.util.Iterator it = ((java.util.HashSet) fVar.f376646g).iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00) it.next()).f177041q = true;
            }
        }
    }
}
