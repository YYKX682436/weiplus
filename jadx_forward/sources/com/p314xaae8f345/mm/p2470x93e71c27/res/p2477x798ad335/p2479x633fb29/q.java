package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f271233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v f271234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271235f;

    public q(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.s sVar, java.util.List list, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar, java.lang.String str) {
        this.f271233d = list;
        this.f271234e = vVar;
        this.f271235f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.h hVar : this.f271233d) {
            hVar.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if ("CheckResUpdate".equals(this.f271234e.f271261f)) {
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e eVar = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e) hVar;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("networkEventListener.onComplete, urlkey = ");
                java.lang.String str = this.f271235f;
                sb6.append(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", sb6.toString());
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e17 = l0Var.e(str);
                if (e17 != null) {
                    com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(e17.f68791x44eeb14, 10L);
                    com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(e17.f68791x44eeb14, 15L);
                    com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.e(e17.f68792xb5ef19b5, e17.f68796x5334f55, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(e17.f68780xf1e133f7, 0), (int) e17.f68791x44eeb14, 77);
                    if ((!e17.f68775x9cdeb823 || e17.f68776x7d1f4984) && e17.f68779xcef2f7da) {
                        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.d0 d0Var = e17.f68784xeef7a77d > e17.f68793x74b591e3 ? com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.d0.RETRY_SUCC : com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.d0.SUCC;
                        int i17 = e17.f68792xb5ef19b5;
                        int i18 = e17.f68796x5334f55;
                        java.lang.String str2 = e17.f68797x4b6e88aa;
                        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(e17.f68780xf1e133f7, 0);
                        java.lang.String str3 = e17.f68782x3bf12d1d;
                        if (str3 == null) {
                            str3 = "";
                        }
                        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.c(i17, i18, str2, P, d0Var, true, str3.equals("NewXml"), false, e17.f68794x9383c60a);
                    }
                    if (e17.f68775x9cdeb823 || e17.f68776x7d1f4984) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "networkEventListener, addDecryptRequest");
                        eVar.f271101a.a(e17);
                    } else {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd();
                        java.lang.String str4 = e17.f68777xf1e9b966;
                        am.r2 r2Var = c5255x5f3208fd.f135586g;
                        r2Var.f89294c = str4;
                        r2Var.f89297f = e17.f68788xd2f45e28;
                        r2Var.f89296e = e17.f68779xcef2f7da;
                        r2Var.f89295d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(e17.f68780xf1e133f7, 0);
                        r2Var.f89292a = e17.f68792xb5ef19b5;
                        r2Var.f89293b = e17.f68796x5334f55;
                        l0Var.f271218d.mo50293x3498a0(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.d(eVar, c5255x5f3208fd));
                        e17.f68779xcef2f7da = false;
                        l0Var.g(e17, true);
                    }
                }
            }
        }
    }
}
