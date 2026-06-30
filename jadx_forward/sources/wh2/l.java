package wh2;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final wh2.l f527488a = new wh2.l();

    public final java.lang.Object a(java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        dn.j jVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePagLoader", "loadPag url:" + str + ", path:" + str2);
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePagLoader", "fileExist");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new wh2.h(str2)));
        } else {
            try {
                jVar = new dn.j();
                jVar.f323318d = "task_FinderCdnDownloader";
                java.lang.String host = new java.net.URL(str).getHost();
                int f17 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(host, false, new java.util.ArrayList());
                int f18 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(host, true, new java.util.ArrayList());
                char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                jVar.f69601xaca5bdda = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
                jVar.D1 = str;
                jVar.E1 = host;
                jVar.G1 = str2;
                jVar.J1 = f17;
                jVar.K1 = f18;
                jVar.L1 = false;
                jVar.M1 = "" + com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.c();
                jVar.N1 = "";
                jVar.P1 = 150;
                jVar.Q1 = 20201;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePagLoader", "attachPagTaskInfo mediaId:" + jVar.f69601xaca5bdda + " imageUrl:" + str);
            } catch (java.net.MalformedURLException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderLivePagLoader", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLivePagLoader", "attachPagTaskInfo fail:" + e17);
                jVar = null;
            }
            if (jVar == null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new wh2.g(10000)));
            } else {
                jVar.f323320f = new dn.d(new wh2.j(str2, rVar));
                if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(jVar)) {
                    rVar.m(new wh2.k(jVar));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePagLoader", "addRecvTask failed.");
                    p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new wh2.g(10001)));
                }
            }
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }
}
