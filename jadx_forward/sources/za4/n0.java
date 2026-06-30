package za4;

/* loaded from: classes4.dex */
public class n0 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ za4.o0 f552689c;

    public n0(za4.o0 o0Var, java.lang.String str, java.lang.String str2) {
        this.f552689c = o0Var;
        this.f552687a = str;
        this.f552688b = str2;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("predownload img err, compType=");
        sb6.append(this.f552687a);
        sb6.append(", url=");
        java.lang.String str = this.f552688b;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageResPreloader", sb6.toString());
        za4.o0.a(this.f552689c, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
        za4.o0.a(this.f552689c, this.f552688b);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 34);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
    }
}
