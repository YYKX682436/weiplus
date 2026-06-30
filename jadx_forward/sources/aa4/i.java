package aa4;

/* loaded from: classes4.dex */
public final class i implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f84186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84187c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa4.l f84188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f84189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f84190f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84191g;

    public i(java.lang.String str, long j17, java.lang.String str2, aa4.l lVar, int i17, boolean z17, java.lang.String str3) {
        this.f84185a = str;
        this.f84186b = j17;
        this.f84187c = str2;
        this.f84188d = lVar;
        this.f84189e = i17;
        this.f84190f = z17;
        this.f84191g = str3;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onImageDownload", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$1");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a2 Bj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bj();
            java.lang.String str = this.f84185a;
            long j17 = this.f84186b;
            java.lang.String str2 = this.f84187c;
            Bj.J0(str, j17, str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            this.f84188d.f(str2, this.f84189e, this.f84190f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCoverFadeImageView", "downloadImage error:" + this.f84191g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImageDownload", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$setImagePath$1");
    }
}
