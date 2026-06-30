package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class ja implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f246824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246826f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f246827g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 f246828h;

    public ja(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var) {
        this.f246824d = context;
        this.f246825e = str;
        this.f246826f = str2;
        this.f246827g = i17;
        this.f246828h = a5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$3");
        android.content.Intent launchIntentForPackage = this.f246824d.getPackageManager().getLaunchIntentForPackage(this.f246825e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LandingPageUtil", "openApp, default, launchAppByWeChat, intent=" + launchIntentForPackage + ", appName=" + this.f246826f + ", showType=" + this.f246827g);
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(this.f246824d, launchIntentForPackage, this.f246826f, this.f246827g, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ia(this), null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$3");
    }
}
