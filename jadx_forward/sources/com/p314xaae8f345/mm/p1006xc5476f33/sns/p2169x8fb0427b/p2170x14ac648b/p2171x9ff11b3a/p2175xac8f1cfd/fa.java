package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class fa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f246723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f246724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f246726g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 f246727h;

    public fa(android.content.Context context, android.content.Intent intent, java.lang.String str, int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var) {
        this.f246723d = context;
        this.f246724e = intent;
        this.f246725f = str;
        this.f246726g = i17;
        this.f246727h = a5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$1");
        android.content.Context context = this.f246723d;
        android.content.Intent intent = this.f246724e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(context, intent, true, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LandingPageUtil", "openApp, launchAppByWeChat, targetIntent=" + intent + ", appName=" + this.f246725f + ", showType=" + this.f246726g);
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(this.f246723d, this.f246724e, this.f246725f, this.f246726g, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ea(this), null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LandingPageUtil", "openApp, isIntentAvailable==false, intent=" + intent);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$1");
    }
}
