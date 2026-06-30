package l42;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l42.n f397519d;

    public e(l42.n nVar) {
        this.f397519d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l42.n nVar = this.f397519d;
        for (s42.b bVar : ((java.util.HashMap) nVar.f397532d).values()) {
            if (u46.l.e(bVar.f484474k) && !u46.l.e(bVar.f484475l)) {
                java.lang.String c17 = g42.i.c(bVar.f484475l);
                if (u46.l.e(c17)) {
                    t42.a.g(false);
                } else {
                    try {
                        bVar.f484474k = new java.lang.String(android.util.Base64.decode(c17, 0), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                        l42.n.wi(nVar);
                        t42.a.g(true);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingConfigService", "EdgeComputingConfigService [tryToDownloadScript] throw Exception : " + e17.getMessage());
                        t42.a.g(false);
                    }
                }
            }
        }
        for (s42.c cVar : ((java.util.HashMap) nVar.f397533e).values()) {
            if (u46.l.e(cVar.f484480c) && !u46.l.e(cVar.f484481d)) {
                java.lang.String c18 = g42.i.c(cVar.f484481d);
                if (u46.l.e(c18)) {
                    t42.a.g(false);
                } else {
                    try {
                        cVar.f484480c = new java.lang.String(android.util.Base64.decode(c18, 0), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                        nVar.Ri();
                        t42.a.g(true);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingConfigService", "EdgeComputingConfigService [tryToDownloadScript] throw Exception : " + e18.getMessage());
                        t42.a.g(false);
                    }
                }
            }
        }
    }
}
