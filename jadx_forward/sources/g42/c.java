package g42;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s42.b f350247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r42.a f350248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g42.f f350249f;

    public c(g42.f fVar, s42.b bVar, r42.a aVar) {
        this.f350249f = fVar;
        this.f350247d = bVar;
        this.f350248e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        s42.b bVar = this.f350247d;
        int i17 = bVar.f484469f;
        r42.a aVar = this.f350248e;
        g42.f fVar = this.f350249f;
        if (i17 == 1) {
            h42.a aVar2 = (h42.a) fVar.f350256f;
            if (aVar != null) {
                j42.f fVar2 = aVar2.f360439a;
                if (fVar2 != null) {
                    fVar2.i(aVar);
                }
            } else {
                aVar2.getClass();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = fVar.f350262o;
            n3Var.mo50303x856b99f0(1003);
            fVar.f350261n.getClass();
            n3Var.mo50307xb9e94560(1003, o42.b.f424369f);
        } else {
            h42.a aVar3 = (h42.a) fVar.f350255e;
            if (aVar != null) {
                j42.f fVar3 = aVar3.f360439a;
                if (fVar3 != null) {
                    fVar3.i(aVar);
                }
            } else {
                aVar3.getClass();
            }
        }
        java.lang.String str = bVar.f484464a;
        long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - uptimeMillis;
        if (uptimeMillis2 <= 10) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 4L, 1L, false);
        } else if (uptimeMillis2 <= 100) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 5L, 1L, false);
        } else if (uptimeMillis2 <= 1000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 6L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 7L, 1L, false);
        }
        if (uptimeMillis2 <= 1000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(1409L, 43L, uptimeMillis2, false);
            g0Var.mo68477x336bdfd8(1409L, 44L, 1L, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.mo68477x336bdfd8(1409L, 90L, 1L, false);
        if (t42.a.a()) {
            g0Var2.d(20176, str, 1, java.lang.Long.valueOf(uptimeMillis2), 1, "");
        }
        g42.i.b("EdgeComputingMonitor", "[EdgeComputingMonitor] statCacheCostTime configID : %s, costTime : %d, dataSzie : %d", str, java.lang.Long.valueOf(uptimeMillis2), 1);
        t42.a.b(bVar.f484464a, 5, aVar.f451043s);
    }
}
