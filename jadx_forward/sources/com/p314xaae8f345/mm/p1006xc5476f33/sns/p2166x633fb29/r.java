package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class r implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f246154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e f246155e;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e binderC17870x451d307e, java.lang.String str) {
        this.f246155e = binderC17870x451d307e;
        this.f246154d = str;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
        if (str.equals(this.f246154d)) {
            this.f246155e.m142013x77b46a52("onCdnVideoProgress", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
        if (str.equals(this.f246154d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 30);
            this.f246155e.m142013x77b46a52("onCdnVideoFinish", str, java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
        if (str.equals(this.f246154d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 28);
            this.f246155e.m142013x77b46a52("onCdnVideoDataAvailable", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onM3U8Ready", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onM3U8Ready", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMoovReady", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
        if (str.equals(this.f246154d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 26);
            this.f246155e.m142013x77b46a52("onCdnVideoMoovReady", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), videoInfo != null ? videoInfo.f18114x9330627b : "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMoovReady", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$CDNVideoDownloadCallback");
    }
}
