package la4;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.h f399113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ la4.d f399114g;

    public c(la4.d dVar, java.lang.String str, int i17, dn.h hVar) {
        this.f399114g = dVar;
        this.f399111d = str;
        this.f399112e = i17;
        this.f399113f = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase$1$1");
        la4.d dVar = this.f399114g;
        if (9 == dVar.f399117f.f399122f.f399080f) {
            dn.i iVar = (dn.i) dVar.f399115d;
            if (iVar.T1 == iVar.V1) {
                la4.f.g().remove(this.f399114g.f399117f.f399122f.f());
            }
        } else {
            la4.f.g().remove(this.f399114g.f399117f.f399122f.f());
        }
        ca4.s0 s0Var = this.f399114g.f399117f.f399122f.f399082h;
        int a17 = s0Var == null ? -1 : s0Var.a();
        java.lang.String str = this.f399111d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f399112e);
        la4.a aVar = this.f399114g.f399117f.f399122f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCdnDownloadBase", "[%s][media:%s]download done result: %d, url:%s, mediaID:%s, totalSize: %d, runningTasksSize: %d decodetype:%d", "[image-flow]", str, valueOf, aVar.f399077c, aVar.f399076b, java.lang.Long.valueOf(this.f399113f.f69523x17c343e7), java.lang.Integer.valueOf(la4.f.g().size()), java.lang.Integer.valueOf(a17));
        la4.a aVar2 = this.f399114g.f399117f.f399122f;
        boolean z17 = aVar2.f399078d;
        if (!z17 || this.f399112e == 2) {
            if (!z17 && ((i17 = aVar2.f399080f) == 4 || i17 == 6)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().K(this.f399114g.f399117f.f399122f.f399076b, this.f399114g.f399117f.f399122f.d() + ca4.z0.R(this.f399114g.f399117f.f399123g));
            }
        } else if (9 == aVar2.f399080f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n7.b(((r45.jj4) aVar2.f399090p.get(this.f399113f.f323306h)).f459388d, this.f399114g.f399117f.f399122f.f399088n);
            la4.f fVar = this.f399114g.f399117f;
            int i18 = this.f399113f.f323306h;
            fVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
            } else {
                la4.a aVar3 = fVar.f399122f;
                ca4.s0 s0Var2 = (ca4.s0) aVar3.f399091q.get(i18);
                r45.jj4 jj4Var = (r45.jj4) aVar3.f399090p.get(i18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCdnDownloadBase", "thumbAddDecode index: %d decodeType: %d.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(s0Var2.a()));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().J(jj4Var.f459388d, (com.p314xaae8f345.mm.p872xbfc2bd01.r) fVar.f399121e.get(i18), s0Var2.a());
                java.lang.String x17 = s0Var2.a() == 0 ? ca4.z0.x(0, s0Var2.c()) : null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCdnDownloadBase", "[%s][media:%s]thumbAddDecode cacheName2: %s.", "[image-flow]", jj4Var.f459388d, x17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
                java.lang.String str2 = jj4Var.f459388d;
                hj6.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRefImageView", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                hj6.r0(str2, x17, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRefImageView", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("thumbAddDecode", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase");
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n7.b(aVar2.f399076b, aVar2.f399088n);
            this.f399114g.f399117f.s();
        }
        la4.a aVar4 = this.f399114g.f399117f.f399122f;
        int i19 = aVar4.f399080f;
        if (9 == i19) {
            r45.jj4 jj4Var2 = (r45.jj4) aVar4.f399090p.get(this.f399113f.f323306h);
            dn.i iVar2 = (dn.i) this.f399114g.f399115d;
            if ((iVar2.T1 == iVar2.V1) && !iVar2.W1) {
                iVar2.W1 = true;
                long j17 = this.f399114g.f399116e;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCdnDownloadBase", "[%s][media:%s]group download, feed cost: %d.", "[image-flow]", this.f399111d, java.lang.Long.valueOf(currentTimeMillis));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.C(1040L, 3L, currentTimeMillis);
                g0Var.A(1040, 4);
                g0Var.C(1040L, 9L, currentTimeMillis);
                g0Var.C(1040L, 10L, iVar2.T1);
            }
            la4.f fVar2 = this.f399114g.f399117f;
            la4.e eVar = fVar2.f399119c;
            int i27 = this.f399112e;
            int e17 = fVar2.f399122f.e();
            la4.a aVar5 = this.f399114g.f399117f.f399122f;
            boolean z19 = aVar5.f399078d;
            java.lang.String f17 = aVar5.f();
            dn.h hVar = this.f399113f;
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0) eVar).u(i27, jj4Var2, e17, z19, f17, (int) hVar.f69523x17c343e7, hVar.f323306h, iVar2.T1 == iVar2.V1);
        } else {
            if (1 == i19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 Cj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj();
                java.lang.String str3 = this.f399114g.f399117f.f399122f.f399076b;
                Cj.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeMediaId", "com.tencent.mm.plugin.sns.model.DownloadManager");
                boolean remove = Cj.f245989s.remove(str3);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeMediaId", "com.tencent.mm.plugin.sns.model.DownloadManager");
                if (remove) {
                    long j18 = this.f399114g.f399116e;
                    boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCdnDownloadBase", "[%s][media:%s]single download cost: %d.", "[image-flow]", this.f399111d, java.lang.Long.valueOf(currentTimeMillis2));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var2.C(1040L, 6L, currentTimeMillis2);
                    g0Var2.A(1040, 7);
                }
            }
            if (this.f399114g.f399117f.f399122f.f399080f == 4) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[%s][media:%s]sight download cost=");
                long j19 = this.f399114g.f399116e;
                boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                sb6.append(java.lang.System.currentTimeMillis() - j19);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCdnDownloadBase", sb6.toString(), "[image-flow]", this.f399114g.f399117f.f399122f.f399076b);
            }
            la4.f fVar3 = this.f399114g.f399117f;
            la4.e eVar2 = fVar3.f399119c;
            int i28 = this.f399112e;
            r45.jj4 jj4Var3 = fVar3.f399123g;
            int e18 = fVar3.f399122f.e();
            la4.a aVar6 = this.f399114g.f399117f.f399122f;
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0) eVar2).u(i28, jj4Var3, e18, aVar6.f399078d, aVar6.f(), (int) this.f399113f.f69523x17c343e7, -1, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.download.SnsCdnDownloadBase$1$1");
    }
}
