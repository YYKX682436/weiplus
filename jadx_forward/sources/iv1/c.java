package iv1;

/* loaded from: classes8.dex */
public class c implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv1.f f376638d;

    public c(iv1.f fVar) {
        this.f376638d = fVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        iv1.f fVar = this.f376638d;
        if (((java.util.HashSet) fVar.f376646g).size() == 0) {
            return false;
        }
        fv1.c cVar = fVar.f376644e;
        if (cVar != null) {
            try {
                cVar.Vf();
            } catch (android.os.RemoteException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadClient", "check process active false");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(710L, 3L, 1L, false);
                fVar.getClass();
                if (java.lang.System.currentTimeMillis() - fVar.f376643d > u04.d.f505010c) {
                    fVar.f376643d = java.lang.System.currentTimeMillis();
                    java.util.Iterator it = ((java.util.HashSet) fVar.f376646g).iterator();
                    while (it.hasNext()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00) it.next()).f177041q = true;
                    }
                    fVar.d();
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadClient", "dead twice in 1 min, something wrong must be happened");
                g0Var.mo68477x336bdfd8(710L, 4L, 1L, false);
                java.util.Iterator it6 = ((java.util.HashSet) fVar.f376646g).iterator();
                while (it6.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.w) fVar.f376647h).a(((com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13091xf399cf00) it6.next()).f177032e, 4, 204, null);
                }
                ((kv1.a) fVar.f376646g).clear();
                mv1.c a17 = mv1.b.a();
                if (a17 != null) {
                    a17.m145253xb158737d("CdnDownloadInfo", java.lang.String.format("delete from %s", "CdnDownloadInfo"));
                }
                return false;
            }
        }
        return true;
    }
}
