package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class i2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f245820d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f245821e;

    /* renamed from: f, reason: collision with root package name */
    public final int f245822f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.l76 f245823g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f245824h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f245825i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f245826m;

    /* renamed from: n, reason: collision with root package name */
    public final int f245827n;

    public i2(r45.l76 l76Var, java.lang.String str, java.lang.String str2, int i17) {
        r45.ud6 ud6Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70311x485d7;
        this.f245827n = 0;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.c76();
        lVar.f152198b = new r45.d76();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnsadcomment";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.o1.f34634x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f245820d = a17;
        r45.c76 c76Var = (r45.c76) a17.f152243a.f152217a;
        c76Var.f452884d = l76Var;
        this.f245822f = l76Var.f460738f.f459995h;
        this.f245823g = l76Var;
        c76Var.f452885e = str;
        c76Var.f452889i = i17;
        this.f245821e = str;
        long j17 = l76Var.f460736d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseStatSnsAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(j17);
        if (y07 == null || (m70311x485d7 = y07.m70311x485d7()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseStatSnsAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            ud6Var = null;
        } else {
            ud6Var = com.p314xaae8f345.mm.p959x883644fd.k0.h(m70311x485d7.f39040xbd345fc4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseStatSnsAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        }
        if (ud6Var != null) {
            c76Var.f452888h = x51.j1.i(com.p314xaae8f345.mm.p959x883644fd.k0.g(ud6Var));
            c76Var.f452887g = ud6Var.f468803g;
        }
        c76Var.f452886f = x51.j1.i(str2 == null ? "" : str2);
        if (l44.h3.e()) {
            c76Var.f452892o = l44.e.b();
        }
        java.lang.String e17 = m54.j.e();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            c76Var.f452893p = e17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdComment", "the req vangogh version is " + c76Var.f452893p);
        }
        this.f245827n = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdComment", l76Var.f460738f.f459991d + " " + l76Var.f460738f.f459992e + " type " + l76Var.f460738f.f459995h + " aduxinfo " + str2 + ", SnsStat=" + c76Var.f452888h + ", source=" + c76Var.f452887g + ", scene=" + i17 + ", SupportCapability = " + c76Var.f452892o);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        this.f245824h = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f245820d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.o1.f34634x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.d76 d76Var;
        int i27;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().v(this.f245823g.f460736d, this.f245822f, this.f245821e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("mergeToDb", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            r45.k76 k76Var = this.f245823g.f460738f;
            int i28 = k76Var.f459995h;
            if (i28 == 1 || i28 == 2 || i28 == 3 || i28 == 5 || i28 == 7 || i28 == 8 || i28 == 16) {
                r45.e86 e86Var = new r45.e86();
                e86Var.f454664i = k76Var.f459997m;
                e86Var.f454662g = k76Var.f459995h;
                e86Var.f454661f = k76Var.f459996i;
                e86Var.f454659d = k76Var.f459991d;
                e86Var.f454660e = k76Var.f459993f;
                e86Var.f454663h = k76Var.f459998n;
                e86Var.f454672t = k76Var.f460005u;
                try {
                    com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f245820d;
                    r45.c76 c76Var = (r45.c76) oVar.f152243a.f152217a;
                    d76Var = (r45.d76) oVar.f152244b.f152233a;
                    i27 = c76Var.f452887g;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsAdComment", e17, "", new java.lang.Object[0]);
                }
                if (i27 != 1 && i27 != 2) {
                    synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.f246278a) {
                        try {
                            r45.f76 f76Var = d76Var.f453740d;
                            c19806x4c372b7 = f76Var.f455609d;
                            boolean z18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.h() == 1;
                            java.lang.String str2 = "";
                            if (z18) {
                                z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.z(f76Var);
                                if (z17) {
                                    java.lang.String g17 = x51.j1.g(f76Var.f455612g);
                                    if (g17 == null) {
                                        g17 = "";
                                    }
                                    str2 = g17;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1802, 2);
                                } else {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1802, 3);
                                }
                            } else {
                                z17 = false;
                            }
                            int i29 = (!z18 || z17) ? z18 ? 2 : 0 : 1;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdComment", "adDynamic, graySwitch=" + z18 + ", isValid=" + z17 + ", replaceMode=" + i29 + ", dynamicAdInfoStr=" + str2);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.r(f76Var, str2, i29, false);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                        } finally {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mergeToDb", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
                        }
                    }
                    this.f245826m = c19806x4c372b7;
                    c19806x4c372b7.toString();
                    c19806x4c372b7.f38984xe83113e0.size();
                    c19806x4c372b7.f38963x20c46e68.size();
                    if (k76Var.f459995h == 7 && (c19806x4c372b72 = this.f245826m) != null) {
                        l44.b3 b3Var = l44.b3.f397574a;
                        java.lang.String j17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("ad_table_", c19806x4c372b72.Id);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdLikeResponse", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdInteractHelper", "onAdLikeResponse() called with: snsId = " + j17);
                        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) l44.b3.f397586m).e(j17);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdLikeResponse", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                    }
                }
                r45.ca6 ca6Var = d76Var.f453741e;
                c19806x4c372b7 = ca6Var.f452935d;
                java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.f246278a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                r45.f76 d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.d(ca6Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.r(d17, "", 0, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                this.f245826m = c19806x4c372b7;
                c19806x4c372b7.toString();
                c19806x4c372b7.f38984xe83113e0.size();
                c19806x4c372b7.f38963x20c46e68.size();
                if (k76Var.f459995h == 7) {
                    l44.b3 b3Var2 = l44.b3.f397574a;
                    java.lang.String j172 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("ad_table_", c19806x4c372b72.Id);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdLikeResponse", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdInteractHelper", "onAdLikeResponse() called with: snsId = " + j172);
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) l44.b3.f397586m).e(j172);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdLikeResponse", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mergeToDb", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().g();
        } else if (i18 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().v(this.f245823g.f460736d, this.f245822f, this.f245821e);
        }
        this.f245824h.mo815x76e0bfae(i18, i19, str, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
    }
}
