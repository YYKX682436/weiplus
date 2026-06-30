package ta4;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f498236a;

    /* renamed from: b, reason: collision with root package name */
    public final int f498237b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f498238c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f498239d;

    /* renamed from: e, reason: collision with root package name */
    public ta4.j f498240e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f498241f;

    /* renamed from: g, reason: collision with root package name */
    public int f498242g;

    /* renamed from: h, reason: collision with root package name */
    public final org.json.JSONObject f498243h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f498244i;

    /* renamed from: j, reason: collision with root package name */
    public final ta4.l f498245j;

    /* renamed from: k, reason: collision with root package name */
    public final ta4.l f498246k;

    /* renamed from: l, reason: collision with root package name */
    public final ta4.l f498247l;

    /* renamed from: m, reason: collision with root package name */
    public final ta4.l f498248m;

    /* renamed from: n, reason: collision with root package name */
    public final ta4.l f498249n;

    /* renamed from: o, reason: collision with root package name */
    public long f498250o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f498251p;

    public a(java.lang.String mediaId, int i17, java.lang.String fromScene, boolean z17, ta4.j stage, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromScene, "fromScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stage, "stage");
        this.f498236a = mediaId;
        this.f498237b = i17;
        this.f498238c = fromScene;
        this.f498239d = z17;
        this.f498240e = stage;
        this.f498241f = str;
        this.f498242g = -1;
        this.f498243h = new org.json.JSONObject();
        this.f498245j = new ta4.l(0, 0, 0, 7, null);
        this.f498246k = new ta4.l(0, 0, 0, 7, null);
        this.f498247l = new ta4.l(0, 0, 0, 7, null);
        this.f498248m = new ta4.l(0, 0, 0, 7, null);
        this.f498249n = new ta4.l(0, 0, 0, 7, null);
        this.f498251p = "";
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaId", "com.tencent.mm.plugin.sns.report.Data");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaId", "com.tencent.mm.plugin.sns.report.Data");
        return this.f498236a;
    }

    public final ta4.j b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStage", "com.tencent.mm.plugin.sns.report.Data");
        ta4.j jVar = this.f498240e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStage", "com.tencent.mm.plugin.sns.report.Data");
        return jVar;
    }

    /* renamed from: equals */
    public boolean m166045xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.report.Data");
        if (!(obj instanceof ta4.a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.report.Data");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ta4.a) obj).f498236a, this.f498236a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.report.Data");
        return b17;
    }

    /* renamed from: hashCode */
    public int m166046x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.report.Data");
        int hashCode = ((((((((this.f498236a.hashCode() * 31) + java.lang.Integer.hashCode(this.f498237b)) * 31) + this.f498238c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f498239d)) * 31) + this.f498240e.hashCode()) * 31;
        java.lang.String str = this.f498241f;
        int hashCode2 = hashCode + (str == null ? 0 : str.hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.report.Data");
        return hashCode2;
    }

    /* renamed from: toString */
    public java.lang.String m166047x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.report.Data");
        java.lang.String str = "mediaId:" + this.f498236a + ", requestType:" + this.f498237b + ", from:" + this.f498238c + ", batchDownload:" + this.f498239d + ", stage:" + this.f498240e + ", stageCost:" + this.f498243h + ", startImageLoaderQueueSize:" + this.f498248m.a() + ", finishedImageLoaderQueueSize:" + this.f498249n.a() + ", enqueueQueueSize:" + this.f498245j + ", startDownloadQueueSize:" + this.f498246k + ", callbackUIQueueSize:" + this.f498247l + ", cdnRet:" + this.f498242g + ", isAd:" + this.f498244i + ", session:" + this.f498251p + " snsId:" + this.f498241f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.report.Data");
        return str;
    }
}
