package a84;

/* loaded from: classes4.dex */
public class k implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f83856d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f83857e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f83858f;

    /* renamed from: g, reason: collision with root package name */
    public final za4.e0 f83859g;

    public k(java.lang.String str, java.lang.String str2, java.lang.String str3, za4.e0 e0Var) {
        this.f83856d = str;
        this.f83859g = e0Var;
        this.f83857e = str2;
        this.f83858f = str3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onImageFinish */
    public void mo852x876bfa6f(java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onImageFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, this.f83856d) && str.equals(this.f83856d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdCdnImageLoaderMM", "onImageFinish, mediaId=" + str + ", isOk=" + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().v(this);
            if (this.f83859g == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImageFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).B(new a84.j(this, z17));
            if (z17) {
                n74.t.b(0, 0, 1, this.f83858f);
                m44.d.d("AdCdnImageLoaderMM", this.f83858f, this.f83857e);
            } else {
                n74.t.b(1, 0, 1, this.f83858f);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImageFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onSetbg */
    public void mo853xb04a0d88(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSetbg", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSetbg", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onSightFinish */
    public void mo854x822e7131(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSightFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
        java.lang.String str2 = this.f83856d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, str2) && str.equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdCdnImageLoaderMM", "onSightFinish, mediaId=" + str + ", isOk=" + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().v(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onThumbFinish */
    public void mo855x8dbd7aaa(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onThumbFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
        java.lang.String str2 = this.f83856d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, str2) && str.equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdCdnImageLoaderMM", "onThumbFinish, mediaId=".concat(str));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().v(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onThumbFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
    }
}
