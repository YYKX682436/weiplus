package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class l3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: y, reason: collision with root package name */
    public static int f245915y;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f245916d;

    /* renamed from: f, reason: collision with root package name */
    public final int f245918f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f245919g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.za6 f245920h;

    /* renamed from: i, reason: collision with root package name */
    public final int f245921i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f245922m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f245923n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f245924o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f245925p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f245926q;

    /* renamed from: r, reason: collision with root package name */
    public final long f245927r;

    /* renamed from: s, reason: collision with root package name */
    public final long f245928s;

    /* renamed from: t, reason: collision with root package name */
    public final int f245929t;

    /* renamed from: u, reason: collision with root package name */
    public final int f245930u;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k3 f245932w;

    /* renamed from: e, reason: collision with root package name */
    public int f245917e = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f245931v = 0;

    /* renamed from: x, reason: collision with root package name */
    public final dn.k f245933x = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j3(this);

    public l3(int i17, java.lang.String str, boolean z17, int i18) {
        boolean z18 = false;
        this.f245919g = "";
        this.f245921i = 0;
        this.f245922m = "";
        this.f245924o = "";
        this.f245925p = false;
        this.f245926q = false;
        this.f245927r = 0L;
        this.f245928s = 0L;
        this.f245929t = 0;
        this.f245930u = 0;
        this.f245927r = java.lang.System.currentTimeMillis();
        this.f245921i = i17;
        this.f245922m = str;
        this.f245930u = i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.za6();
        lVar.f152198b = new r45.ab6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnsupload";
        lVar.f152200d = 207;
        lVar.f152201e = 95;
        lVar.f152202f = 1000000095;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f245916d = a17;
        r45.za6 za6Var = (r45.za6) a17.f152243a.f152217a;
        this.f245920h = za6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().n1(i17);
        this.f245926q = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUpload", "start snsupload netscene localId " + i17 + "  offset " + n17.d() + " path " + n17.e() + " totallen " + n17.f());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.c(i17);
        if (!z17) {
            za6Var.f473405t = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUpload", "this is single upload");
        }
        try {
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().mo11468x92b714fd(n17.h());
            java.lang.String path = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), n17.e()) + ca4.z0.X(n17.e());
            this.f245919g = path;
            nu3.e eVar = nu3.e.f421731a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
            ((java.util.ArrayList) nu3.e.f421740j).add(path);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordVideo.CameraEditorReporter", "[setSnsPicWxamPath] path: ".concat(path));
            int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(path);
            this.f245918f = k17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUpload", "totallen " + k17 + " isLongPic: " + ca4.z0.k0(path));
            java.lang.String str2 = mj4Var.f462105p;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                str2 = kk.k.g(("" + android.os.SystemClock.elapsedRealtime()).getBytes());
                mj4Var.f462105p = str2;
                try {
                    n17.m(mj4Var.mo14344x5f01b1f6());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().Y2(n17.c(), n17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsUpload", e17, "", new java.lang.Object[0]);
                }
            }
            r45.za6 za6Var2 = this.f245920h;
            za6Var2.f473395g = this.f245918f;
            za6Var2.f473393e = n17.d();
            r45.za6 za6Var3 = this.f245920h;
            za6Var3.f473397i = str2;
            this.f245924o = str2;
            za6Var3.f473398m = mj4Var.f462096d;
            za6Var3.f473400o = mj4Var.f462104o + "";
            this.f245920h.f473399n = mj4Var.f462097e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUpload", "request upload type " + n17.g() + " md5: " + mj4Var.f462112w + " appid " + mj4Var.f462113x + " contenttype " + mj4Var.f462114y);
            this.f245920h.f473392d = n17.g();
            r45.kq6 kq6Var = new r45.kq6();
            kq6Var.f460439d = mj4Var.f462106q;
            kq6Var.f460440e = mj4Var.f462107r;
            this.f245920h.f473403r = kq6Var;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mj4Var.f462112w)) {
                this.f245920h.f473406u = mj4Var.f462112w;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mj4Var.f462113x)) {
                this.f245920h.f473404s = mj4Var.f462113x;
            }
            r45.za6 za6Var4 = this.f245920h;
            za6Var4.f473407v = mj4Var.f462114y;
            if (x51.o1.f533581d) {
                za6Var4.f473392d = 0;
            }
            if (this.f245928s == 0) {
                this.f245928s = java.lang.System.currentTimeMillis();
                this.f245929t = 20201;
            }
            r45.za6 za6Var5 = this.f245920h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUserCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(32)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneSnsUpload", "cdntra not use cdn flag:%b", java.lang.Boolean.valueOf(((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(32)));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUserCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            } else if (x51.o1.B == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUserCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            } else {
                java.lang.String str3 = za6Var5.f473397i;
                this.f245924o = str3;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneSnsUpload", "cdntra genClientId failed not use cdn");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUserCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUserCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                    z18 = true;
                }
            }
            if (z18) {
                this.f245925p = true;
            } else {
                if (M()) {
                    return;
                }
                J();
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
        }
    }

    public static int H() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHttpChunkSize", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_image_http_chunk_size, 8) * 1024;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHttpChunkSize", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return Ni;
    }

    public int I() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLocalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return this.f245921i;
    }

    public final void J() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2 Hj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj();
        int i17 = this.f245921i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 n17 = Hj.n1(i17);
        n17.j(0);
        try {
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().mo11468x92b714fd(n17.h());
            mj4Var.f462105p = "";
            n17.m(mj4Var.mo14344x5f01b1f6());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().Y2(i17, n17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().A(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        }
    }

    public final void K(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onErrorServer", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2 Hj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj();
        int i18 = this.f245921i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 n17 = Hj.n1(i18);
        try {
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().mo11468x92b714fd(n17.h());
            mj4Var.f462103n = 1;
            mj4Var.f462108s = i17;
            n17.m(mj4Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().A(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().Y2(i18, n17);
        if (this.f245932w != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUploadResult", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$customSnsUploadCallback$1");
            pm0.v.X(new ac4.a(false, i18));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUploadResult", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$customSnsUploadCallback$1");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onErrorServer", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(1:3)(1:75)|4|(1:74)(1:8)|9|(2:10|11)|(1:13)|14|(2:16|(10:18|(6:21|22|23|24|28|19)|51|52|53|54|55|(1:57)(2:61|(1:63))|58|59))|67|(1:69)|52|53|54|55|(0)(0)|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e0, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsUpload", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean L(java.lang.String r25, int r26, java.lang.String r27, int r28, java.lang.String r29, java.lang.String r30, r45.rl r31) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l3.L(java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, r45.rl):boolean");
    }

    public final boolean M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDoScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().n1(I());
        int f17 = n17.f() - n17.d();
        if (f17 > H()) {
            f17 = H();
        }
        int d17 = n17.d();
        this.f245917e = d17;
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(this.f245919g, d17, f17);
        if (N == null || N.length <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDoScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            return false;
        }
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(N);
        r45.za6 za6Var = this.f245920h;
        za6Var.f473396h = cu5Var;
        za6Var.f473393e = this.f245917e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDoScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cancel", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        super.mo9408xae7a2e7a();
        if (this.f245925p && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f245924o)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUpload", "cancel by cdn " + this.f245924o);
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(this.f245924o);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancel", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        this.f245923n = u0Var;
        if (!this.f245925p) {
            int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f245916d, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            return mo9409x10f9447a;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkUseCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        java.lang.String str = this.f245920h.f473397i;
        this.f245924o = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneSnsUpload", "cdntra genClientId failed not use cdn");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUseCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        } else {
            dn.m mVar = new dn.m();
            mVar.f323318d = "task_NetSceneSnsUpload_1";
            mVar.f323320f = this.f245933x;
            mVar.f69601xaca5bdda = this.f245924o;
            java.lang.String str2 = this.f245919g;
            mVar.f69595x6d25b0d9 = str2;
            mVar.f69619xe9ed65f6 = "";
            mVar.f69592xf1ebe47b = this.f245929t;
            mVar.f69618x114ef53e = "";
            mVar.f69609xd84b8349 = 2;
            mVar.f69606xccdbf540 = true;
            mVar.f69597x853bb235 = false;
            int i18 = this.f245931v;
            boolean z17 = this.f245926q;
            if (i18 != 0) {
                mVar.f69580x454032b6 = i18;
                i17 = 1;
            } else {
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.h2()) {
                    boolean i19 = pc4.d.f434943a.i();
                    if (i19) {
                        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str2, options);
                        int min = java.lang.Math.min(options.outWidth, options.outHeight);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMultiSpecLimit", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_image_spec_size_limit, 1680);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "getMultiSpecLimit:" + Ni);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMultiSpecLimit", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                        if (min < Ni) {
                            i19 = false;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUpload", "mIsSpecWxam:%b", java.lang.Boolean.valueOf(i19));
                    mVar.f69580x454032b6 = z17 ? i19 ? 117 : 114 : i19 ? 116 : 113;
                } else {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.k2()) {
                        mVar.f69580x454032b6 = z17 ? 108 : 107;
                    } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.X1()) {
                        mVar.f69580x454032b6 = z17 ? 108 : 107;
                    } else if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(64)) {
                        mVar.f69580x454032b6 = z17 ? 104 : 103;
                    } else {
                        mVar.f69580x454032b6 = z17 ? 101 : 100;
                    }
                }
                i17 = 1;
            }
            mVar.f69584x89a4c0cf = i17;
            java.lang.String concat = "is_single_media:".concat(z17 ? "0" : "1");
            mVar.N = concat;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUpload", "customHeader: %s", concat);
            if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUseCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsUpload", "cdntra addSendTask failed. clientid:%s", this.f245924o);
                this.f245924o = "";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUseCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return 207;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUpload", "netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        r45.ab6 ab6Var = (r45.ab6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        int i27 = this.f245930u;
        if (i18 == 4) {
            K(i19);
            if (i27 == 21) {
                ha4.b.a(12);
            }
            this.f245923n.mo815x76e0bfae(i18, i19, str, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            return;
        }
        if (i18 != 0 || i19 != 0) {
            J();
            if (i27 == 21) {
                ha4.b.a(13);
            }
            this.f245923n.mo815x76e0bfae(i18, i19, str, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().n1(I());
        int i28 = ab6Var.f451430d;
        if (i28 < 0 || (i28 > n17.f() && n17.f() > 0)) {
            J();
            if (i18 == 3) {
                ha4.b.a(14);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            return;
        }
        if (ab6Var.f451430d < n17.d()) {
            J();
            if (i18 == 3) {
                ha4.b.a(14);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUpload", " bufferUrl: " + ab6Var.f451433g.f467070d + " bufferUrlType: " + ab6Var.f451433g.f467071e + "  id:" + ab6Var.f451436m + " thumb Count: " + ab6Var.f451434h + "  type " + ab6Var.f451437n + " startPos : " + ab6Var.f451430d);
        n17.j(ab6Var.f451430d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().Y2(I(), n17);
        if (n17.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUpload", "uploadsns done pass: " + (java.lang.System.currentTimeMillis() - this.f245927r));
            java.util.LinkedList linkedList = ab6Var.f451435i;
            int size = linkedList.size();
            r45.za6 za6Var = this.f245920h;
            if (size == 0 || linkedList.size() <= 0) {
                r45.s76 s76Var = ab6Var.f451433g;
                L(s76Var.f467070d, s76Var.f467071e, "", 0, ab6Var.f451436m + "", za6Var.f473406u, null);
            } else {
                r45.s76 s76Var2 = ab6Var.f451433g;
                L(s76Var2.f467070d, s76Var2.f467071e, ((r45.s76) linkedList.get(0)).f467070d, ((r45.s76) linkedList.get(0)).f467071e, ab6Var.f451436m + "", za6Var.f473406u, null);
            }
            this.f245923n.mo815x76e0bfae(i18, i19, str, this);
        } else if (M() && mo807x6c193ac1(m47995xb7ba1aa7(), this.f245923n) < 0) {
            this.f245923n.mo815x76e0bfae(3, -1, "doScene failed", this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_image_http_upload_limit, 2500);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return Ni;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.p314xaae8f345.mm.p944x882e457a.o1 o1Var = com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return o1Var;
    }
}
