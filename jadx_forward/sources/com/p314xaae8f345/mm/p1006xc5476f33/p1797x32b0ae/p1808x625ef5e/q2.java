package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class q2 implements t80.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 f225580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 f225581c;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.r2 r2Var, java.lang.String str, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var) {
        this.f225579a = str;
        this.f225580b = c3712x3ed8a441;
        this.f225581c = k2Var;
    }

    @Override // t80.f
    public void a(int i17, int i18, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.String str2 = this.f225579a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp checkUpdate fail, appId: %s, errorType: %d, errorCode: %d, errorMsg: %s", str2, valueOf, valueOf2, str);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c).mo25333x2fd71e(str2, 2);
        }
    }

    @Override // t80.f
    public void b(r45.xr5 xr5Var) {
        boolean isEmpty = xr5Var.f471894d.isEmpty();
        java.util.LinkedList linkedList = xr5Var.f471894d;
        java.lang.String str = this.f225579a;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp checkUpdate success but got no update, appId: %s, resourceList size: %d", str, java.lang.Integer.valueOf(linkedList.size()));
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c).mo25334x90b54003(this.f225580b, 1);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp checkUpdate success, got no update, appId: %s, resourceList size: %d", str, java.lang.Integer.valueOf(linkedList.size()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = this.f225581c;
        if (k2Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k2Var.f225533e = currentTimeMillis;
            k2Var.f225534f = currentTimeMillis;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.vy4 vy4Var = (r45.vy4) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp checkUpdate success, got update, appId: %s, resourceName: %s, version: %d, size: %d, md5: %s, url: %s, createTime: %d", this.f225579a, vy4Var.f470197e, java.lang.Integer.valueOf(vy4Var.f470198f), java.lang.Integer.valueOf(vy4Var.f470199g), vy4Var.f470200h, vy4Var.f470201i, java.lang.Integer.valueOf(vy4Var.f470202m));
            oq1.q qVar = new oq1.q();
            qVar.f428879a = str;
            qVar.f428892n = vy4Var.f470197e;
            qVar.f428893o = vy4Var.f470198f;
            qVar.f428886h = vy4Var.f470199g;
            qVar.f428883e = vy4Var.f470200h;
            qVar.f428882d = vy4Var.f470201i;
            qVar.f428884f = "";
            qVar.f428885g = "";
            qVar.f428896r = 0;
            r45.kk0 kk0Var = vy4Var.f470203n;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_pay_lite_app_open_pkg_compress_android, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "liteapp pkg abtest is enable compress, appId: %s", str);
                java.util.LinkedList linkedList2 = vy4Var.f470205p;
                if (!nf.c.a(linkedList2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "onPayCheckSuccess has version meta data");
                    r45.kk0 D = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.D(linkedList2, qVar, null);
                    if (D != null) {
                        kk0Var = D;
                    }
                }
            }
            if (kk0Var != null) {
                qVar.f428895q = new oq1.c(kk0Var.f460306d, android.util.Base64.decode(kk0Var.f460309g, 0), android.util.Base64.decode(kk0Var.f460308f, 0), android.util.Base64.decode(kk0Var.f460307e, 0), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.q(vy4Var).getBytes(java.nio.charset.StandardCharsets.UTF_8));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.INSTANCE.b(qVar, "release", this.f225581c, null, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c);
        }
    }
}
