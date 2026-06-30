package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class o2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f246070d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f246071e;

    /* renamed from: f, reason: collision with root package name */
    public java.io.OutputStream f246072f = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f246073g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f246074h;

    /* renamed from: i, reason: collision with root package name */
    public final int f246075i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f246076m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f246077n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f246078o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.jj4 f246079p;

    public o2(r45.jj4 jj4Var, java.lang.String str, java.lang.String str2, int i17, boolean z17, int i18, java.lang.String str3) {
        this.f246071e = "";
        this.f246075i = -1;
        this.f246076m = true;
        this.f246077n = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMediaId", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        this.f246071e = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMediaId", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        this.f246079p = jj4Var;
        this.f246076m = z17;
        this.f246075i = i18;
        this.f246077n = str3;
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), str);
        this.f246073g = d17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.i86();
        lVar.f152198b = new r45.j86();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnsdownload";
        lVar.f152200d = 208;
        lVar.f152201e = 96;
        lVar.f152202f = 1000000096;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f246070d = a17;
        r45.i86 i86Var = (r45.i86) a17.f152243a.f152217a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 o17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().o1(str);
        o17 = o17 == null ? new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2() : o17;
        o17.k(str);
        o17.j(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().F2(str, o17);
        if (z17) {
            this.f246074h = ca4.z0.a0(jj4Var);
        } else {
            this.f246074h = ca4.z0.W(jj4Var);
        }
        com.p314xaae8f345.mm.vfs.w6.u(d17);
        com.p314xaae8f345.mm.vfs.w6.h(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), str) + this.f246074h);
        i86Var.f458350f = str2;
        i86Var.f458352h = 0;
        i86Var.f458348d = 0;
        i86Var.f458349e = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDownType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        i86Var.f458351g = i17;
    }

    public java.lang.String H() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaId", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        java.lang.String str = this.f246071e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaId", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return str;
    }

    public int I() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRequestDownloadType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRequestDownloadType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return this.f246075i;
    }

    public final void J() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().B(this.f246077n);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
    }

    public final void K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseFileHandle", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        try {
            java.io.OutputStream outputStream = this.f246072f;
            if (outputStream != null) {
                outputStream.flush();
                this.f246072f.close();
                this.f246072f = null;
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsDownload", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseFileHandle", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        this.f246078o = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f246070d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return 208;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        boolean z17;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        com.p314xaae8f345.mm.p944x882e457a.n nVar = (com.p314xaae8f345.mm.p944x882e457a.n) v0Var.mo13821x7f35c2d1();
        r45.j86 j86Var = (r45.j86) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        int mo150578x7f2fddf8 = nVar.mo150578x7f2fddf8();
        java.lang.String str2 = this.f246077n;
        if (mo150578x7f2fddf8 != 0) {
            this.f246078o.mo815x76e0bfae(i18, i19, str, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().B(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 o17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().o1(H());
        int i28 = j86Var.f459182e;
        if (i28 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsDownload", "error 1");
            J();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            return;
        }
        r45.cu5 cu5Var = j86Var.f459183f;
        if (cu5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsDownload", "error 2");
            J();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            return;
        }
        int i29 = j86Var.f459181d;
        if (i29 < 0 || cu5Var.f453374f.f273689a.length + i29 > i28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsDownload", "error 3");
            J();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            return;
        }
        if (i29 != o17.d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsDownload", "error 4");
            J();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            return;
        }
        byte[] g17 = j86Var.f459183f.f453374f.g();
        java.lang.String str3 = this.f246073g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendBuf", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        boolean j07 = ca4.z0.j0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bi());
        java.lang.String str4 = this.f246074h;
        if (j07) {
            try {
                try {
                    if (this.f246072f == null) {
                        com.p314xaae8f345.mm.vfs.w6.u(str3);
                        this.f246072f = com.p314xaae8f345.mm.vfs.w6.K(str3 + str4, false);
                    }
                    this.f246072f.write(g17);
                    K();
                    i27 = g17.length;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendBuf", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
                    z17 = false;
                } catch (java.io.IOException e17) {
                    z17 = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsDownload", e17, "appendBuf failed: " + str4, new java.lang.Object[0]);
                    K();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendBuf", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
                    i27 = -1;
                }
            } catch (java.lang.Throwable th6) {
                K();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendBuf", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
                throw th6;
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendBuf", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            z17 = false;
            i27 = 0;
        }
        if (i27 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsDownload", "error 5");
            J();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            return;
        }
        o17.j(o17.d() + i27);
        int i37 = j86Var.f459182e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTotallen", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        o17.f247583g = i37;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTotallen", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().F2(H(), o17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isGetCompleted", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        if (o17.d() == o17.f() && o17.f() != 0) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGetCompleted", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            r45.jj4 jj4Var = this.f246079p;
            int i38 = this.f246075i;
            java.lang.String U = i38 == 1 ? ca4.z0.U(jj4Var) : i38 == 10 ? ca4.z0.d0(jj4Var) : i38 == 11 ? ca4.z0.N(jj4Var) : ca4.z0.J(jj4Var);
            java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), H());
            com.p314xaae8f345.mm.vfs.w6.h(d17 + U);
            com.p314xaae8f345.mm.vfs.w6.P(d17, str4, U);
            if (this.f246076m) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.i1(d17, U, ca4.z0.e0(jj4Var), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.mj());
            } else {
                java.lang.String U2 = ca4.z0.U(jj4Var);
                if (!com.p314xaae8f345.mm.vfs.w6.j(d17 + U2)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.W0(d17, U, U2, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.tj());
                }
                java.lang.String e07 = ca4.z0.e0(jj4Var);
                if (!com.p314xaae8f345.mm.vfs.w6.j(d17 + e07)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.i1(d17, U, e07, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.mj());
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().B(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            this.f246078o.mo815x76e0bfae(i18, i19, str, this);
        } else {
            mo807x6c193ac1(m47995xb7ba1aa7(), this.f246078o);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return 100;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        com.p314xaae8f345.mm.p944x882e457a.o1 o1Var = com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return o1Var;
    }
}
