package pa4;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f434583a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 f434584b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f434585c;

    /* renamed from: d, reason: collision with root package name */
    public final int f434586d;

    /* renamed from: e, reason: collision with root package name */
    public volatile r45.mj4 f434587e;

    /* renamed from: f, reason: collision with root package name */
    public final pa4.o f434588f;

    /* renamed from: g, reason: collision with root package name */
    public final pa4.i f434589g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f434590h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f434591i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f434592j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f434593k;

    public l(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 snsMedia, boolean z17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsMedia, "snsMedia");
        this.f434583a = i17;
        this.f434584b = snsMedia;
        this.f434585c = z17;
        this.f434586d = i18;
        this.f434588f = new pa4.o();
        this.f434589g = new pa4.i(this);
        this.f434590h = jz5.h.b(pa4.h.f434579d);
        this.f434591i = jz5.h.b(new pa4.g(this));
        this.f434592j = jz5.h.b(new pa4.k(this));
        this.f434593k = jz5.h.b(new pa4.f(this));
    }

    public static final java.lang.String a(pa4.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLivePhotoUUId", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        lVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivePhotoUUId", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        java.lang.String str = (java.lang.String) ((jz5.n) lVar.f434590h).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivePhotoUUId", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLivePhotoUUId", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        return str;
    }

    public static final /* synthetic */ int b(pa4.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLocalId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        int i17 = lVar.f434583a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLocalId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        return i17;
    }

    public static final void c(pa4.l lVar, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$updateSnsMedia", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        lVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSnsMedia", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LivePhotoUpload", "updateSnsMedia >> needResetOffset: " + z17 + " needUnSetUpload: " + z18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2 Hj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj();
        int i17 = lVar.f434583a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 n17 = Hj.n1((long) i17);
        try {
            n17.m(lVar.d().mo14344x5f01b1f6());
            if (z17) {
                n17.j(0);
            }
            if (z18) {
                n17.n();
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LivePhotoUpload", "upload callback is update snsMedia error");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().A(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().Y2(i17, n17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSnsMedia", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$updateSnsMedia", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
    }

    public final r45.mj4 d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUploadInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        r45.mj4 mj4Var = this.f434587e;
        if (mj4Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUploadInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
            return mj4Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uploadInfo");
        throw null;
    }
}
