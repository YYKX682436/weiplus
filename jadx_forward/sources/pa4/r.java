package pa4;

/* loaded from: classes4.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa4.s f434599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434601f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f434602g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434603h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f434604i;

    public r(pa4.s sVar, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18) {
        this.f434599d = sVar;
        this.f434600e = str;
        this.f434601f = str2;
        this.f434602g = i17;
        this.f434603h = str3;
        this.f434604i = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$onPostScene$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2 Hj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj();
        pa4.s sVar = this.f434599d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 n17 = Hj.n1(pa4.s.c(sVar));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload ok ");
        java.lang.String str = this.f434600e;
        sb6.append(str);
        sb6.append("  ");
        sb6.append(this.f434601f);
        sb6.append("  ");
        int i17 = this.f434602g;
        sb6.append(i17);
        sb6.append(" thread: ");
        sb6.append(java.lang.Thread.currentThread().getName());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoVideoUpload", sb6.toString());
        r45.cj4 cj4Var = new r45.cj4();
        cj4Var.f453129e = i17;
        cj4Var.f453128d = str;
        pa4.s.b(sVar).f462099g = cj4Var;
        pa4.s.b(sVar).f462103n = 0;
        r45.mj4 b17 = pa4.s.b(sVar);
        sx.a0 a0Var = (sx.a0) i95.n0.c(sx.a0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getVideoPath$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getVideoPath$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        b17.A = ((rx.a) a0Var).Di(sVar.f434613i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "onPostScene videoMd5 %s", pa4.s.b(sVar).A);
        java.lang.String str2 = this.f434603h;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            r45.cj4 cj4Var2 = new r45.cj4();
            cj4Var2.f453129e = this.f434604i;
            cj4Var2.f453128d = str2;
            pa4.s.b(sVar).f462101i.add(cj4Var2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        r45.mj4 b18 = pa4.s.b(sVar);
        r45.mj4 mj4Var = sVar.f434606b;
        mj4Var.D = b18;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            n17.m(mj4Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsLivePhotoVideoUpload", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        ((pa4.i) sVar.f434609e).a(true, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$onPostScene$1");
    }
}
