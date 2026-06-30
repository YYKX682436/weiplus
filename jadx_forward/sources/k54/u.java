package k54;

/* loaded from: classes8.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zg0.v2 f385986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f385989g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f385990h;

    public u(zg0.v2 v2Var, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f385986d = v2Var;
        this.f385987e = str;
        this.f385988f = str2;
        this.f385989g = bundle;
        this.f385990h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback$onHandleEnd$1");
        try {
            zg0.v2 v2Var = this.f385986d;
            if (v2Var != null) {
                ((nw4.n) v2Var).O(this.f385987e, this.f385988f, nw4.a.a(this.f385989g), this.f385990h);
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.WebViewStubCallback", "In jsapi onHandleEnd method, it happens something unwanted!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback$onHandleEnd$1");
    }
}
