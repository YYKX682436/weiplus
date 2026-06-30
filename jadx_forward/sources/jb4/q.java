package jb4;

/* loaded from: classes4.dex */
public class q implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f380367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f380368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f380369c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f380370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jb4.v f380371e;

    public q(jb4.v vVar, java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f380371e = vVar;
        this.f380367a = str;
        this.f380368b = i17;
        this.f380369c = i18;
        this.f380370d = str2;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereImageLoader", "onDownloadError");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new jb4.p(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereImageLoader", "onStartDownload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereImageLoader", "loadImage onDownloaded, path=" + str);
        new jb4.r(this.f380371e, this.f380367a, this.f380368b, this.f380369c, this.f380370d).execute(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
    }
}
