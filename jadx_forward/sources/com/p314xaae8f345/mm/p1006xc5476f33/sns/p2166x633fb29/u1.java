package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f246232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f246233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.s7 f246234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246235g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 f246236h;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var, java.util.List list, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, java.lang.String str) {
        this.f246236h = i1Var;
        this.f246232d = list;
        this.f246233e = i17;
        this.f246234f = s7Var;
        this.f246235g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$5");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "pushToImageLoaderUi %d", java.lang.Integer.valueOf(this.f246232d.size()));
        ca4.s0 s0Var = new ca4.s0(this.f246232d);
        s0Var.e(ca4.z0.O(this.f246232d));
        s0Var.d(this.f246233e);
        boolean z19 = true;
        for (int i17 = 0; i17 < this.f246232d.size() && i17 < 9; i17++) {
            r45.jj4 jj4Var = (r45.jj4) this.f246232d.get(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 Cj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj();
            java.lang.String str = jj4Var.f459388d;
            Cj.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
            synchronized (Cj.f245977g) {
                try {
                    if (((java.util.concurrent.ConcurrentHashMap) Cj.f245984n).containsKey(ca4.z0.G(1, str))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    } else if (((java.util.concurrent.ConcurrentHashMap) Cj.f245984n).containsKey(ca4.z0.G(5, str))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                        z17 = false;
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    throw th6;
                }
            }
            if (!z17) {
                if (!com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.U(jj4Var))) {
                    if (!com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.J(jj4Var))) {
                        if (!com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.d0(jj4Var))) {
                            if (!com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.W(jj4Var))) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().e(jj4Var, jj4Var.f459389e == 6 ? 5 : 1, s0Var, this.f246234f, this.f246235g);
                            }
                        }
                    }
                }
            }
            z19 = false;
        }
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 > 100) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fileexist check2  endtime ");
            sb6.append(elapsedRealtime2);
            sb6.append(" ");
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append(" ");
            sb6.append(lp0.b.e0());
            sb6.append("  ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.fj();
            sb6.append(s0Var.c());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", sb6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var = this.f246236h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        long j17 = i1Var.f245785a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (android.os.SystemClock.elapsedRealtime() - j17 > 60000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Long valueOf = java.lang.Long.valueOf(elapsedRealtime2);
            java.lang.String name = java.lang.Thread.currentThread().getName();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.fj();
            g0Var.d(11696, 1, valueOf, 0, name, "", lp0.b.e0());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var2 = this.f246236h;
            long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$402", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            i1Var2.f245785a = elapsedRealtime3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$402", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        }
        java.lang.String O = ca4.z0.O(this.f246232d);
        if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t1(this, O));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$5");
    }
}
