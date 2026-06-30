package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class v2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f246246d;

    /* renamed from: e, reason: collision with root package name */
    public long f246247e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f246248f;

    /* renamed from: g, reason: collision with root package name */
    public final int f246249g;

    /* renamed from: h, reason: collision with root package name */
    public int f246250h = 0;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f246251i;

    public v2() {
        this.f246247e = 0L;
        this.f246248f = "";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ta6();
        lVar.f152198b = new r45.ua6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnspreloadingtimeline";
        lVar.f152200d = 718;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f246246d = a17;
        int E = ca4.z0.E();
        this.f246249g = 2;
        r45.ta6 ta6Var = (r45.ta6) a17.f152243a.f152217a;
        ta6Var.f467778m = E;
        ta6Var.f467773e = 0L;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Kj().i();
        long k27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k2(0L, i17, true);
        this.f246247e = k27;
        ta6Var.f467774f = k27;
        ta6Var.f467775g = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f1.c(k27, 0L, "@__weixintimtline");
        long k28 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k2(0L, 1, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsPreTimeLine", "newerid " + k28);
        ta6Var.f467776h = k28;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().J0("@__weixintimtline");
        java.lang.String str = J0.f67951x4b6e68b9;
        this.f246248f = str;
        if (str == null) {
            this.f246248f = "";
        }
        ta6Var.f467772d = this.f246248f;
        byte[] bArr = J0.f67936xd2d2440e;
        if (bArr == null) {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(new byte[0]);
            ta6Var.f467777i = cu5Var;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsPreTimeLine", "request adsession %s", bArr);
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(J0.f67936xd2d2440e);
            ta6Var.f467777i = cu5Var2;
        }
        r45.cu5 cu5Var3 = new r45.cu5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdPassThroughInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        byte[] b17 = l44.h3.b(null, 0, true, 0L, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdPassThroughInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        cu5Var3.d(b17);
        ta6Var.f467788w = cu5Var3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsPreTimeLine", "This req nextCount: " + i17 + " min:" + this.f246247e + " ReqTime:" + ta6Var.f467775g + " nettype: " + E);
        ca4.z0.t0(this.f246247e);
    }

    public final void H(r45.jj4 jj4Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealwithMedia", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
        if (jj4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealwithMedia", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
            return;
        }
        java.lang.String U = ca4.z0.U(jj4Var);
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d);
        if (!com.p314xaae8f345.mm.vfs.w6.j(d17 + U)) {
            if (!com.p314xaae8f345.mm.vfs.w6.j(d17 + ca4.z0.J(jj4Var))) {
                if (!com.p314xaae8f345.mm.vfs.w6.j(d17 + ca4.z0.W(jj4Var))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsPreTimeLine", "dealwithMedia ready to download:%s", jj4Var.f459388d);
                    ca4.s0 s0Var = new ca4.s0(jj4Var);
                    s0Var.d(z17 ? 1 : 0);
                    s0Var.e(jj4Var.f459388d);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 Cj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj();
                    int i17 = jj4Var.f459389e == 6 ? 5 : 1;
                    com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276832c;
                    Cj.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    Cj.f(jj4Var, i17, s0Var, s7Var, null, "", "", 1);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealwithMedia", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsPreTimeLine", "dealwithMedia exist:%s", jj4Var.f459388d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealwithMedia", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0174 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(r45.ua6 r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v2.I(r45.ua6, java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
        this.f246251i = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f246246d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
        return 718;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0369 A[Catch: all -> 0x03e0, TryCatch #0 {all -> 0x03e0, blocks: (B:38:0x0286, B:41:0x028e, B:44:0x02a2, B:46:0x02a8, B:49:0x02cb, B:51:0x02d1, B:53:0x02df, B:55:0x02e3, B:56:0x02ea, B:58:0x02f1, B:60:0x02f5, B:86:0x033e, B:73:0x035d, B:75:0x0369, B:78:0x03a7, B:80:0x03bd, B:93:0x03c3, B:94:0x03de), top: B:37:0x0286 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03bd A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r17, int r18, int r19, java.lang.String r20, com.p314xaae8f345.mm.p971x6de15a2e.v0 r21, byte[] r22) {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v2.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
