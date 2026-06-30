package k54;

/* loaded from: classes8.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f385983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w f385984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zg0.v2 f385985f;

    public t(android.os.Bundle bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar, zg0.v2 v2Var) {
        this.f385983d = bundle;
        this.f385984e = wVar;
        this.f385985f = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback$onCallback$1");
        android.os.Bundle bundle = this.f385983d;
        if (bundle != null) {
            try {
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.WebViewStubCallback", "In onCallback method, it happens something unwanted!");
            }
            if (bundle.containsKey("jsapi_preverify_fun_list") && (wVar = this.f385984e) != null) {
                wVar.i(bundle);
                ((nw4.n) this.f385985f).q();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback$onCallback$1");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.WebViewStubCallback", "has JSAPI_CONTROL_BYTES wvPerm");
        ((nw4.n) this.f385985f).q();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback$onCallback$1");
    }
}
