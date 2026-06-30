package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes7.dex */
public final class o implements com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f85622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f85623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f85624c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.p f85625d;

    public o(org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.p pVar) {
        this.f85622a = jSONObject;
        this.f85623b = yVar;
        this.f85624c = i17;
        this.f85625d = pVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FunctionalJsApiNavigateToMiniProgram", "onNavigateResult, navigateToAppId:" + this.f85622a.optString("appId") + " ok:" + z17 + ", reason:" + str);
        if (z17) {
            return;
        }
        if (str == null) {
            str = "";
        }
        this.f85623b.a(this.f85624c, this.f85625d.o("fail: navigate error ".concat(str)));
    }
}
