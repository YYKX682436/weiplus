package za4;

/* loaded from: classes4.dex */
public class l0 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab4.z f552679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ za4.o0 f552680b;

    public l0(za4.o0 o0Var, ab4.z zVar) {
        this.f552680b = o0Var;
        this.f552679a = zVar;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pre download sight by cdn error:");
        ab4.z zVar = this.f552679a;
        sb6.append(zVar.F);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageResPreloader", sb6.toString());
        za4.o0.a(this.f552680b, zVar.F);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
        za4.o0.a(this.f552680b, this.f552679a.F);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1720, 10);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
    }
}
