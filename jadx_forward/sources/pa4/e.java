package pa4;

/* loaded from: classes4.dex */
public final class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 f434559d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.mj4 f434560e;

    /* renamed from: f, reason: collision with root package name */
    public final pa4.m f434561f;

    /* renamed from: g, reason: collision with root package name */
    public final int f434562g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f434563h;

    /* renamed from: i, reason: collision with root package name */
    public final pa4.o f434564i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f434565m;

    /* renamed from: n, reason: collision with root package name */
    public r45.za6 f434566n;

    /* renamed from: o, reason: collision with root package name */
    public int f434567o;

    /* renamed from: p, reason: collision with root package name */
    public int f434568p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f434569q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f434570r;

    /* renamed from: s, reason: collision with root package name */
    public long f434571s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f434572t;

    /* renamed from: u, reason: collision with root package name */
    public int f434573u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f434574v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f434575w;

    /* renamed from: x, reason: collision with root package name */
    public final dn.k f434576x;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 snsMedia, r45.mj4 uploadInfo, pa4.m uploadCallback, int i17, int i18, boolean z17, java.lang.String livePhotoUUId, pa4.o workHelper) {
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsMedia, "snsMedia");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uploadInfo, "uploadInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uploadCallback, "uploadCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(livePhotoUUId, "livePhotoUUId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workHelper, "workHelper");
        this.f434559d = snsMedia;
        this.f434560e = uploadInfo;
        this.f434561f = uploadCallback;
        this.f434562g = i18;
        this.f434563h = z17;
        this.f434564i = workHelper;
        this.f434569q = "";
        this.f434572t = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        this.f434571s = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.za6();
        lVar.f152198b = new r45.ab6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnsupload";
        lVar.f152200d = 207;
        lVar.f152201e = 95;
        lVar.f152202f = 1000000095;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f434565m = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsUploadRequest");
        this.f434566n = (r45.za6) fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", "start sns upload netScene localId " + i18 + "  offset " + snsMedia.d() + " path " + snsMedia.e() + " totalLen " + snsMedia.f());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.c(i18);
        if (!z17) {
            r45.za6 za6Var = this.f434566n;
            if (za6Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
                throw null;
            }
            za6Var.f473405t = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", "this is single upload");
        }
        java.lang.String X = ca4.z0.X(snsMedia.e());
        this.f434569q = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), snsMedia.e()) + X;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", "path: " + this.f434569q + " temPicName: " + X + " tmpPath: " + snsMedia.e());
        this.f434568p = (int) com.p314xaae8f345.mm.vfs.w6.k(this.f434569q);
        this.f434570r = ca4.z0.k0(this.f434569q);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", "totaLen " + this.f434568p + " isLongPic: " + this.f434570r + " livePhotoUUId: " + livePhotoUUId + " uploadInfoLivePhotoUUId: " + uploadInfo.E);
        java.lang.String str = uploadInfo.f462105p;
        boolean z19 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            byte[] bytes = ("" + android.os.SystemClock.elapsedRealtime()).getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            str = kk.k.g(bytes);
            uploadInfo.f462105p = str;
            z18 = true;
        } else {
            z18 = false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uploadInfo.E)) {
            uploadInfo.E = livePhotoUUId;
            z18 = true;
        }
        if (z18) {
            try {
                snsMedia.m(uploadInfo.mo14344x5f01b1f6());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().Y2(snsMedia.c(), snsMedia);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsLivePhotoImgUpload", e17, "", new java.lang.Object[0]);
            }
        }
        r45.za6 za6Var2 = this.f434566n;
        if (za6Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
            throw null;
        }
        za6Var2.f473395g = this.f434568p;
        za6Var2.f473393e = snsMedia.d();
        r45.za6 za6Var3 = this.f434566n;
        if (za6Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
            throw null;
        }
        za6Var3.f473397i = str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        this.f434572t = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", "filter style " + uploadInfo.f462096d);
        r45.za6 za6Var4 = this.f434566n;
        if (za6Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
            throw null;
        }
        za6Var4.f473398m = uploadInfo.f462096d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", "syncWeibo " + uploadInfo.f462097e);
        r45.za6 za6Var5 = this.f434566n;
        if (za6Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
            throw null;
        }
        za6Var5.f473400o = uploadInfo.f462104o + "";
        r45.za6 za6Var6 = this.f434566n;
        if (za6Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
            throw null;
        }
        za6Var6.f473399n = uploadInfo.f462097e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", "request upload type " + snsMedia.g() + " md5: " + uploadInfo.f462112w + " appid " + uploadInfo.f462113x + " contenttype " + uploadInfo.f462114y);
        r45.za6 za6Var7 = this.f434566n;
        if (za6Var7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
            throw null;
        }
        za6Var7.f473392d = snsMedia.g();
        r45.kq6 kq6Var = new r45.kq6();
        kq6Var.f460439d = uploadInfo.f462106q;
        kq6Var.f460440e = uploadInfo.f462107r;
        r45.za6 za6Var8 = this.f434566n;
        if (za6Var8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
            throw null;
        }
        za6Var8.f473403r = kq6Var;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uploadInfo.f462112w)) {
            r45.za6 za6Var9 = this.f434566n;
            if (za6Var9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
                throw null;
            }
            za6Var9.f473406u = uploadInfo.f462112w;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uploadInfo.f462113x)) {
            r45.za6 za6Var10 = this.f434566n;
            if (za6Var10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
                throw null;
            }
            za6Var10.f473404s = uploadInfo.f462113x;
        }
        r45.za6 za6Var11 = this.f434566n;
        if (za6Var11 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
            throw null;
        }
        za6Var11.f473407v = uploadInfo.f462114y;
        if (x51.o1.f533581d) {
            za6Var11.f473392d = 0;
        }
        this.f434573u = 20201;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUserCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(32)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsLivePhotoImgUpload", "cdn tra not use cdn");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUserCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        } else if (x51.o1.B == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUserCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        } else {
            java.lang.String ClientId = za6Var11.f473397i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ClientId, "ClientId");
            this.f434572t = ClientId;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ClientId)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsLivePhotoImgUpload", "cdntra genClientId failed not use cdn");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUserCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUserCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
                z19 = true;
            }
        }
        if (z19) {
            this.f434574v = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        } else if (P()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        } else {
            M();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        }
        this.f434576x = new pa4.a(this);
    }

    public static final /* synthetic */ int H(pa4.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLocalId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        int i17 = eVar.f434562g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLocalId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return i17;
    }

    public static final /* synthetic */ java.lang.String I(pa4.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPath$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        java.lang.String str = eVar.f434569q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPath$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return str;
    }

    public static final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 J(pa4.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSnsMedia$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 l2Var = eVar.f434559d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSnsMedia$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return l2Var;
    }

    public static final /* synthetic */ r45.mj4 K(pa4.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        r45.mj4 mj4Var = eVar.f434560e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return mj4Var;
    }

    public static final /* synthetic */ java.lang.String L(pa4.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUseCdnTransClientId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        java.lang.String str = eVar.f434572t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUseCdnTransClientId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return str;
    }

    public final void M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        this.f434564i.a("ImageOnError", new pa4.b(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
    }

    public final void N(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        this.f434564i.a("ImageOnErrorServer", new pa4.c(i17, this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
    }

    public final void O(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        this.f434564i.a("ImageOnPostScene", new pa4.d(str, str3, i17, str2, str4, this, i18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
    }

    public final boolean P() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDoScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 l2Var = this.f434559d;
        int f17 = l2Var.f() - l2Var.d();
        if (f17 > com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l3.H()) {
            f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l3.H();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", "onPreDoScene >> dataLen: " + f17 + " offset: " + l2Var.d());
        int d17 = l2Var.d();
        this.f434567o = d17;
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(this.f434569q, d17, f17);
        if (N != null) {
            if (!(N.length == 0)) {
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(N);
                r45.za6 za6Var = this.f434566n;
                if (za6Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
                    throw null;
                }
                za6Var.f473396h = cu5Var;
                if (za6Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
                    throw null;
                }
                za6Var.f473393e = this.f434567o;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDoScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDoScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        this.f434575w = u0Var;
        if (!this.f434574v) {
            int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f434565m, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            return mo9409x10f9447a;
        }
        r45.za6 za6Var = this.f434566n;
        if (za6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkUseCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        java.lang.String ClientId = za6Var.f473397i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ClientId, "ClientId");
        this.f434572t = ClientId;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ClientId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsLivePhotoImgUpload", "cdntra genClientId failed not use cdn");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUseCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        } else {
            dn.m mVar = new dn.m();
            mVar.f323318d = "task_NetSceneSnsUpload_1";
            mVar.f323320f = this.f434576x;
            mVar.f69601xaca5bdda = this.f434572t;
            mVar.f69595x6d25b0d9 = this.f434569q;
            mVar.f69619xe9ed65f6 = "";
            mVar.f69592xf1ebe47b = this.f434573u;
            mVar.f69618x114ef53e = "";
            mVar.f69609xd84b8349 = 2;
            mVar.f69606xccdbf540 = true;
            mVar.f69597x853bb235 = false;
            boolean h27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.h2();
            boolean z17 = this.f434563h;
            if (h27) {
                mVar.f69580x454032b6 = z17 ? 114 : 113;
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
            mVar.f69584x89a4c0cf = 1;
            mVar.N = "live_photo_uuid:" + this.f434560e.E + "\r\nis_single_media:" + (z17 ? "0" : "1");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("customHeader: ");
            sb6.append(mVar.N);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", sb6.toString());
            if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUseCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsLivePhotoImgUpload", "cdntra addSendTask failed. clientid:%s", this.f434572t);
                this.f434572t = "";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUseCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return 207;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", "onGYNetEnd >> netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(v0Var, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsUploadResponse");
        r45.ab6 ab6Var = (r45.ab6) fVar;
        int i27 = this.f434562g;
        if (i18 == 4) {
            N(i19);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.a(i27, i18, i19);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            return;
        }
        if (i18 != 0 || i19 != 0) {
            M();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.a(i27, i18, i19);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            return;
        }
        int i28 = ab6Var.f451430d;
        if (i28 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 l2Var = this.f434559d;
            if (i28 <= l2Var.f() || l2Var.f() <= 0) {
                if (ab6Var.f451430d < l2Var.d()) {
                    M();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", " bufferUrl: " + ab6Var.f451433g.f467070d + " bufferUrlType: " + ab6Var.f451433g.f467071e + "  id:" + ab6Var.f451436m + " thumb Count: " + ab6Var.f451434h + "  type " + ab6Var.f451437n + " startPos : " + ab6Var.f451430d);
                l2Var.j(ab6Var.f451430d);
                if (l2Var.i()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", "upload sns done pass: " + (java.lang.System.currentTimeMillis() - this.f434571s));
                    java.util.LinkedList linkedList = ab6Var.f451435i;
                    if (linkedList.size() == 0 || linkedList.size() <= 0) {
                        java.lang.String Url = ab6Var.f451433g.f467070d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url, "Url");
                        int i29 = ab6Var.f451433g.f467071e;
                        java.lang.String str2 = ab6Var.f451436m + "";
                        r45.za6 za6Var = this.f434566n;
                        if (za6Var == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
                            throw null;
                        }
                        O(Url, i29, "", 0, str2, za6Var.f473406u);
                    } else {
                        java.lang.String Url2 = ab6Var.f451433g.f467070d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url2, "Url");
                        int i37 = ab6Var.f451433g.f467071e;
                        java.lang.String Url3 = ((r45.s76) linkedList.get(0)).f467070d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url3, "Url");
                        int i38 = ((r45.s76) linkedList.get(0)).f467071e;
                        java.lang.String str3 = ab6Var.f451436m + "";
                        r45.za6 za6Var2 = this.f434566n;
                        if (za6Var2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("req");
                            throw null;
                        }
                        O(Url2, i37, Url3, i38, str3, za6Var2.f473406u);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.a(i27, i18, i19);
                } else if (P() && mo807x6c193ac1(m47995xb7ba1aa7(), this.f434575w) < 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.a(i27, 3, -1);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
                return;
            }
        }
        M();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("securityLimitCount", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_image_http_upload_limit, 2500);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("securityLimitCount", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return Ni;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        com.p314xaae8f345.mm.p944x882e457a.o1 o1Var = com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return o1Var;
    }
}
