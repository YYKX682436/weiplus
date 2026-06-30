package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class h2 implements com.tencent.mm.plugin.appbrand.jsapi.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f86657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u65.a f86659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.y1 f86660e;

    public h2(com.tencent.mm.plugin.appbrand.page.y1 y1Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, long j17, java.lang.String str, u65.a aVar) {
        this.f86660e = y1Var;
        this.f86656a = v5Var;
        this.f86657b = j17;
        this.f86658c = str;
        this.f86659d = aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a0
    public void onReady() {
        this.f86656a.G(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMultiplePage", "Tab[%s][%s] onReady received, time: %d", this.f86660e.getAppId(), this.f86658c, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f86657b));
        this.f86659d.b();
    }
}
