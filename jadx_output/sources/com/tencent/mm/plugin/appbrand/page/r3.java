package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class r3 implements com.tencent.mm.plugin.appbrand.jsapi.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f87053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wd f87054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87055c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f87056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u65.a f87057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f87058f;

    public r3(com.tencent.mm.plugin.appbrand.page.i3 i3Var, long j17, com.tencent.mm.plugin.appbrand.page.wd wdVar, java.lang.String str, com.tencent.mm.plugin.appbrand.page.v5 v5Var, u65.a aVar) {
        this.f87058f = i3Var;
        this.f87053a = j17;
        this.f87054b = wdVar;
        this.f87055c = str;
        this.f87056d = v5Var;
        this.f87057e = aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a0
    public void onReady() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.Long valueOf = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f87053a);
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f87058f;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "navigateToNext, onReady cost[%dms], appId[%s] type[%s], url[%s]", valueOf, i3Var.getAppId(), this.f87054b, this.f87055c);
        this.f87056d.G(this);
        this.f87057e.b();
        i3Var.I();
    }
}
