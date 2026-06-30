package v54;

/* loaded from: classes4.dex */
public class b implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f514898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514899b;

    public b(java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f514898a = weakReference;
        this.f514899b = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void a(java.lang.Object obj) {
        java.lang.String optString;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LandingPageOpenSdkBackHelper", "getOpenSdkAppInfo, ret=" + obj);
        if (obj instanceof java.lang.String) {
            try {
                optString = new org.json.JSONObject((java.lang.String) obj).optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            } catch (java.lang.Exception unused) {
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new v54.a(this, optString));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1");
        }
        optString = "";
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new v54.a(this, optString));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper$1");
    }
}
