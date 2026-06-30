package xd4;

/* loaded from: classes4.dex */
public final class f0 implements fk4.p {

    /* renamed from: a, reason: collision with root package name */
    public final r45.jj4 f535169a;

    /* renamed from: b, reason: collision with root package name */
    public final int f535170b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535171c;

    /* renamed from: d, reason: collision with root package name */
    public final int f535172d;

    public f0(r45.jj4 media, int i17, java.lang.String localId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localId, "localId");
        this.f535169a = media;
        this.f535170b = i17;
        this.f535171c = localId;
        this.f535172d = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoFullDownloadPercent", 101);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoCommonDownloadTask", "createTime=" + i17 + ", localId=" + localId + ", createTime=" + i17 + ", needFinish=" + d());
    }

    @Override // fk4.p
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refresh", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refresh", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
    }

    @Override // fk4.p
    public java.lang.Long c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLocalMsgId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalMsgId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return null;
    }

    @Override // fk4.p
    public int d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMinRemainPercent", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMinRemainPercent", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return this.f535172d;
    }

    @Override // fk4.p
    public java.lang.String e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFilename", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        java.lang.String str = this.f535169a.F;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFilename", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return str;
    }

    @Override // fk4.p
    public void f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeCdnTaskMode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeCdnTaskMode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
    }

    @Override // fk4.p
    public boolean g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOriginVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOriginVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return false;
    }

    @Override // fk4.p
    /* renamed from: getLength */
    public long mo79594x23255ddc() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        r45.jj4 jj4Var = this.f535169a;
        java.lang.String str = jj4Var.f459388d;
        java.lang.String str2 = jj4Var.U;
        java.lang.String str3 = this.f535171c;
        t21.v2 i17 = t21.d3.i(str3, str, str2);
        if (i17 != null) {
            long j17 = i17.f496548m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
            return j17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsVideoCommonDownloadTask", "Couldn't find video info for " + str3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return 0L;
    }

    @Override // fk4.p
    public boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDownloading", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        boolean s17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj().s(this.f535169a, this.f535170b, this.f535171c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDownloading", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return s17;
    }

    @Override // fk4.p
    public java.lang.String i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.c(this.f535170b, this.f535169a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return c17;
    }

    @Override // fk4.p
    /* renamed from: isFinished */
    public boolean mo79595xa89067bc() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFinished", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.i(this.f535171c, this.f535169a);
        boolean z17 = !(i17 == null || i17.length() == 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFinished", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return z17;
    }

    @Override // fk4.p
    public java.lang.String j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSavedPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.p(this.f535169a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSavedPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return p17;
    }

    @Override // fk4.p
    public java.lang.String k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDownloadFlag", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloadFlag", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return null;
    }

    @Override // fk4.p
    public void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finishRemaining", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsVideoCommonDownloadTask", "finishRemaining: savedPath=" + j() + ", mediaId=" + i());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj().m(this.f535169a, this.f535170b, this.f535171c, false, true, 36, i());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finishRemaining", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
    }

    @Override // fk4.p
    /* renamed from: start */
    public boolean mo79596x68ac462() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoCommonDownloadTask", "start: savedPath=" + j() + ", mediaId=" + i());
        java.lang.String j17 = j();
        if (!(j17 == null || j17.length() == 0)) {
            java.lang.String i17 = i();
            if (!(i17 == null || i17.length() == 0)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 Pj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj();
                r45.jj4 jj4Var = this.f535169a;
                int i18 = this.f535170b;
                java.lang.String str = this.f535171c;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDownloadScene", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloadScene", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
                Pj.m(jj4Var, i18, str, false, true, 40, i());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return false;
    }

    @Override // fk4.p
    /* renamed from: stop */
    public void mo79597x360802() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsVideoCommonDownloadTask", "stop: savedPath=" + j() + ", mediaId=" + i());
        java.lang.String i17 = i();
        if (!(i17 == null || i17.length() == 0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj().u(i(), null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
    }
}
