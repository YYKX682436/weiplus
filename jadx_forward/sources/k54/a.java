package k54;

/* loaded from: classes7.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1 implements com.p314xaae8f345.p3210x3857dc.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ProgressBar f385944a;

    public a(android.widget.ProgressBar progressBar) {
        this.f385944a = progressBar;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public boolean a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("overScrollBy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdHalfScreenWebViewClientListener", "overScrollBy, deltaX is " + i17 + ", deltaY is " + i18 + ", scrollX is " + i19 + ", scrollY is " + i27 + ", scrollRangeX is " + i28 + ", scrollRangeY is " + i29 + ", maxOverScrollX is " + i37 + ", maxOverScrollY is " + i38 + ", isTouchEvent is " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("overScrollBy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onContentHeightChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onContentHeightChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdHalfScreenWebViewClientListener", "onScrollChanged, left is " + i17 + ", top is " + i18 + ", oldLeft is " + i19 + ", oldTop is " + i27);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOverScrolled", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdHalfScreenWebViewClientListener", "onOverScrolled, scrollX is " + i17 + ", scrollY is " + i18 + ", clampedX is " + z17 + ", clampedY is " + z18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOverScrolled", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void g(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPageFinished", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        android.widget.ProgressBar progressBar = this.f385944a;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdHalfScreenWebViewClientListener", "onPageFinished, url is " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPageFinished", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void h(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPageStarted", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdHalfScreenWebViewClientListener", "onPageStarted, url is " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPageStarted", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceivedError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdHalfScreenWebViewClientListener", "onPageFinished, url is " + str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceivedError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.AdHalfScreenWebViewClientListener");
    }
}
