package xd4;

/* loaded from: classes4.dex */
public final class i0 implements fk4.p {

    /* renamed from: a, reason: collision with root package name */
    public final r45.jj4 f535180a;

    /* renamed from: b, reason: collision with root package name */
    public final int f535181b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535182c;

    /* renamed from: d, reason: collision with root package name */
    public final ok4.c f535183d;

    /* renamed from: e, reason: collision with root package name */
    public final xd4.g0 f535184e;

    /* renamed from: f, reason: collision with root package name */
    public int f535185f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f535186g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f535187h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f535188i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f535189j;

    /* renamed from: k, reason: collision with root package name */
    public final int f535190k;

    public i0(r45.jj4 media, int i17, java.lang.String localId, ok4.c reporter, xd4.g0 provider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localId, "localId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reporter, "reporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        this.f535180a = media;
        this.f535181b = i17;
        this.f535182c = localId;
        this.f535183d = reporter;
        this.f535184e = provider;
        this.f535187h = media.F;
        this.f535188i = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.c(i17, media);
        this.f535189j = media.U;
        this.f535190k = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoFullDownloadPercent", 101);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadTask", "createTime=" + i17 + ", localId=" + localId + ", createTime=" + i17 + ", preloadSec=" + ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoPreloadSec", 5) + " downloadSec=" + ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoDownloadSec", 1) + "], needFinish=" + d() + ',');
    }

    @Override // fk4.p
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refresh", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refresh", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }

    @Override // fk4.p
    public fk4.o b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stat", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 Pj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj();
        java.lang.String str = this.f535182c;
        java.lang.String i17 = i();
        Pj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z7 z7Var = Pj.f245841a;
        if (z7Var == null || android.text.TextUtils.isEmpty(z7Var.f246346b) || android.text.TextUtils.isEmpty(z7Var.f246350f) || !z7Var.f246346b.equals(i17) || !z7Var.f246350f.equals(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            z7Var = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        }
        if (z7Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stat", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            return null;
        }
        fk4.o oVar = new fk4.o(z7Var.f246352h, z7Var.f246353i, z7Var.f246354j, z7Var.f246355k);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stat", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return oVar;
    }

    @Override // fk4.p
    public java.lang.Long c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLocalMsgId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalMsgId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return null;
    }

    @Override // fk4.p
    public int d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMinRemainPercent", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMinRemainPercent", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return this.f535190k;
    }

    @Override // fk4.p
    public java.lang.String e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFilename", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFilename", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return this.f535187h;
    }

    @Override // fk4.p
    public void f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeCdnTaskMode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeCdnTaskMode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }

    @Override // fk4.p
    public boolean g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOriginVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOriginVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return false;
    }

    @Override // fk4.p
    /* renamed from: getLength */
    public long mo79594x23255ddc() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        r45.jj4 jj4Var = this.f535180a;
        java.lang.String str = jj4Var.f459388d;
        java.lang.String str2 = jj4Var.U;
        java.lang.String str3 = this.f535182c;
        t21.v2 i17 = t21.d3.i(str3, str, str2);
        if (i17 != null) {
            long j17 = i17.f496548m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            return j17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsVideoDownloadTask", "Couldn't find video info for " + str3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return 0L;
    }

    @Override // fk4.p
    public boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDownloading", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        boolean s17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj().s(this.f535180a, this.f535181b, this.f535182c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDownloading", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return s17;
    }

    @Override // fk4.p
    public java.lang.String i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return this.f535188i;
    }

    @Override // fk4.p
    /* renamed from: isFinished */
    public boolean mo79595xa89067bc() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFinished", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.i(this.f535182c, this.f535180a);
        boolean z17 = !(i17 == null || i17.length() == 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFinished", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return z17;
    }

    @Override // fk4.p
    public java.lang.String j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSavedPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.p(this.f535180a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSavedPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return p17;
    }

    @Override // fk4.p
    public java.lang.String k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDownloadFlag", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloadFlag", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return this.f535189j;
    }

    @Override // fk4.p
    public void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finishRemaining", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsVideoDownloadTask", "finishRemaining: savedPath=" + j() + ", mediaId=" + i());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj().m(this.f535180a, this.f535181b, this.f535182c, false, false, 36, i());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finishRemaining", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }

    public final void m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rptVideoPause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        ((ku5.t0) ku5.t0.f394148d).h(new xd4.h0(this), "rptVideoPause");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rptVideoPause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }

    public final void n(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDownloadScene", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        this.f535185f = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDownloadScene", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }

    public final void o(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPlayMode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        this.f535186g = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPlayMode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }

    @Override // fk4.p
    /* renamed from: start */
    public boolean mo79596x68ac462() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadTask", "start: savedPath=" + j() + ", mediaId=" + i());
        java.lang.String j17 = j();
        if (!(j17 == null || j17.length() == 0)) {
            java.lang.String i17 = i();
            if (!(i17 == null || i17.length() == 0)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj().m(this.f535180a, this.f535181b, this.f535182c, this.f535186g, true, this.f535185f, i());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return false;
    }

    @Override // fk4.p
    /* renamed from: stop */
    public void mo79597x360802() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b bVar;
        long j17;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsVideoDownloadTask", "stop: savedPath=" + j() + ", mediaId=" + i());
        java.lang.String i18 = i();
        if (i18 == null || i18.length() == 0) {
            str = "stop";
            m();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 Pj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj();
            java.lang.String i19 = i();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildReportData", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            ok4.b v17 = this.f535183d.v();
            xd4.g0 g0Var = this.f535184e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.VideoRptStruct b17 = g0Var.b();
            try {
                bVar = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(j(), true);
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsVideoDownloadTask", "Failed to getMediaInfo");
                bVar = null;
            }
            int i27 = v17.f427507i;
            boolean z17 = (i27 & 1) != 0;
            boolean z18 = (i27 & 2) != 0;
            if (bVar == null || (i17 = bVar.f243915a) == 0) {
                str = "stop";
                j17 = 0;
            } else if (v17.f427509k) {
                str = "stop";
                j17 = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
            } else {
                str = "stop";
                j17 = java.lang.Math.min(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, (v17.f427508j * 10000) / i17);
            }
            java.lang.Object[] objArr = new java.lang.Object[22];
            objArr[0] = java.lang.Integer.valueOf(v17.f427499a);
            objArr[1] = java.lang.Integer.valueOf(v17.f427500b);
            int i28 = 2;
            objArr[2] = java.lang.Integer.valueOf(v17.f427501c);
            objArr[3] = java.lang.Integer.valueOf(v17.f427502d);
            objArr[4] = java.lang.Integer.valueOf(v17.f427503e);
            objArr[5] = java.lang.Integer.valueOf(v17.f427504f);
            objArr[6] = java.lang.Integer.valueOf(v17.f427505g);
            objArr[7] = java.lang.Integer.valueOf(b17.f248089c);
            java.lang.String sessionId = b17.f248088b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sessionId, "sessionId");
            objArr[8] = sessionId;
            objArr[9] = java.lang.Long.valueOf(b17.f248087a);
            java.lang.String snsId = b17.f248090d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsId, "snsId");
            objArr[10] = snsId;
            java.lang.String snsUrl = b17.f248091e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsUrl, "snsUrl");
            objArr[11] = snsUrl;
            java.lang.String filePath = b17.f248092f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath, "filePath");
            objArr[12] = filePath;
            objArr[13] = java.lang.Long.valueOf(g0Var.c());
            objArr[14] = java.lang.Integer.valueOf(bVar != null ? bVar.f243917c : 0);
            objArr[15] = java.lang.Integer.valueOf(bVar != null ? bVar.f243918d : 0);
            objArr[16] = java.lang.Integer.valueOf(bVar != null ? bVar.f243919e : 0);
            objArr[17] = java.lang.Long.valueOf(v17.f427506h);
            if (z17 && z18) {
                i28 = 3;
            } else if (z17) {
                i28 = 1;
            } else if (!z18) {
                i28 = 0;
            }
            objArr[18] = java.lang.Integer.valueOf(i28);
            objArr[19] = java.lang.Long.valueOf(j17);
            objArr[20] = java.lang.Integer.valueOf(b17.f248097k);
            java.lang.String sns_video_multi_spec = b17.f248098l;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sns_video_multi_spec, "sns_video_multi_spec");
            objArr[21] = sns_video_multi_spec;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildReportData", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            Pj.u(i19, objArr);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rptStopDownload", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 203L, 1L, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rptStopDownload", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }
}
