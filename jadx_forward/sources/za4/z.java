package za4;

/* loaded from: classes4.dex */
public class z implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za4.e0 f552764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f552766c;

    public z(za4.e0 e0Var, java.lang.String str, int i17) {
        this.f552764a = e0Var;
        this.f552765b = str;
        this.f552766c = i17;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
        java.lang.String str = this.f552765b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageDownloadFileHelper", " download error for small file %s", str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new za4.x(this));
        if (this.f552766c == 41) {
            n74.t.b(1, 0, 0, str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new za4.w(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
        java.lang.String str2 = this.f552765b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageDownloadFileHelper", " download success for small file %s", str2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new za4.y(this, str));
        if (this.f552766c == 41) {
            n74.t.b(0, 0, 0, str2);
            m44.d.d("AdLandingPageDownloadFileHelper_HTTP", str2, str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
    }
}
