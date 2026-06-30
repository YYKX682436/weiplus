package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes8.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f246665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w f246666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zg0.v2 f246667f;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.e0 e0Var, android.os.Bundle bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar, zg0.v2 v2Var) {
        this.f246665d = bundle;
        this.f246666e = wVar;
        this.f246667f = v2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = this.f246665d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback$2");
        try {
            boolean containsKey = bundle.containsKey("jsapi_preverify_fun_list");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar = this.f246666e;
            if (!containsKey || wVar == null) {
                boolean z17 = true;
                java.lang.Object[] objArr = new java.lang.Object[1];
                if (wVar == null) {
                    z17 = false;
                }
                objArr[0] = java.lang.Boolean.valueOf(z17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFloatWebView", "has JSAPI_CONTROL_BYTES wvPerm %b", objArr);
            } else {
                wVar.i(bundle);
            }
            ((nw4.n) this.f246667f).q();
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFloatWebView", "In onCallback method, it happens something unwanted!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback$2");
    }
}
