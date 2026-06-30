package k54;

/* loaded from: classes8.dex */
public final class k extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zg0.q2 f385968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f385969c;

    public k(zg0.q2 q2Var, android.content.Context context) {
        this.f385968b = q2Var;
        this.f385969c = context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void e() {
        zg0.q2 q2Var = this.f385968b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBinded", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$create$5$1$1");
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).e0().rg(new k54.v(q2Var, this.f385969c), ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).U());
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.WebView", "bind web view callback failed");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBinded", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$create$5$1$1");
    }
}
