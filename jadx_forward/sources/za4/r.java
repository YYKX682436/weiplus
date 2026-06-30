package za4;

/* loaded from: classes4.dex */
public class r implements fe0.o3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za4.u f552719a;

    public r(za4.u uVar) {
        this.f552719a = uVar;
    }

    @Override // fe0.o3
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1");
        java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloadError, netType=");
        sb6.append(m40061x1de3608b);
        sb6.append(", url=");
        za4.u uVar = this.f552719a;
        sb6.append(uVar.f552691a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageDownloadCDNFileTask", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        uVar.b(uVar.f552731h);
        if (za4.u.a(uVar) != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new za4.p(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1");
    }

    @Override // fe0.o3
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1");
        if (za4.u.a(this.f552719a) != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new za4.q(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1");
    }
}
