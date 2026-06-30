package w54;

/* loaded from: classes4.dex */
public class f implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w54.g f524571d;

    public f(w54.g gVar, w54.a aVar) {
        this.f524571d = gVar;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onProgress", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
        w54.g gVar = this.f524571d;
        if (w54.g.f(gVar) != null && w54.g.g(gVar).equals(str)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new w54.d(this, str, j17, j18));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onProgress", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinish", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
        w54.g gVar = this.f524571d;
        if (w54.g.f(gVar) != null && w54.g.g(gVar).equals(str)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new w54.e(this, str, i17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDataAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
        w54.g gVar = this.f524571d;
        if (w54.g.f(gVar) != null && w54.g.g(gVar).equals(str)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new w54.c(this, str, j17, j18));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDataAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onM3U8Ready", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onM3U8Ready", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMoovReady", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
        w54.g gVar = this.f524571d;
        if (w54.g.f(gVar) != null && w54.g.g(gVar).equals(str)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new w54.b(this, str, j17, j18, videoInfo));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMoovReady", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
    }
}
