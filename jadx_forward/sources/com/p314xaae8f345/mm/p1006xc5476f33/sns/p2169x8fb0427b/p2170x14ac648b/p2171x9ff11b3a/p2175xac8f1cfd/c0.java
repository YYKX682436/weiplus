package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zg0.v2 f246643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246645f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f246646g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f246647h;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.e0 e0Var, zg0.v2 v2Var, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f246643d = v2Var;
        this.f246644e = str;
        this.f246645f = str2;
        this.f246646g = bundle;
        this.f246647h = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback$1");
        try {
            zg0.v2 v2Var = this.f246643d;
            if (v2Var != null) {
                ((nw4.n) v2Var).O(this.f246644e, this.f246645f, nw4.a.a(this.f246646g), this.f246647h);
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFloatWebView", "In jsapi onHandleEnd method, it happens something unwanted!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$AdWebViewStubCallback$1");
    }
}
