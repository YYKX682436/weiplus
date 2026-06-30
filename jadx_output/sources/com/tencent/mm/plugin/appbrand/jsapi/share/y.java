package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class y implements com.tencent.mm.plugin.appbrand.jsapi.share.s {

    /* renamed from: a, reason: collision with root package name */
    public int f83312a;

    /* renamed from: b, reason: collision with root package name */
    public int f83313b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f83314c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f83315d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f83316e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f83317f;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void a(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject) {
        this.f83312a = jSONObject.optInt("appBrandPriority", -1);
        this.f83315d = jSONObject.optString("liteAppId");
        this.f83316e = jSONObject.optString("liteAppPath");
        this.f83317f = jSONObject.optString("liteAppQuery");
        this.f83314c = jSONObject.optString("liteAppBizData");
        this.f83313b = jSONObject.optInt("liteAppPriority", 0);
        uVar.I.put("is_native_game_card", java.lang.Boolean.TRUE);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void b(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask sendAppMessageTask, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        com.tencent.mm.plugin.appbrand.config.AppBrandCustomLoadingConfig appBrandCustomLoadingConfig;
        sendAppMessageTask.B = 6;
        if (k01.j.f303039a.b(null, uVar.f83276v) && (appBrandCustomLoadingConfig = (u07 = c0Var.t3().u0()).C1) != null && !com.tencent.mm.sdk.platformtools.t8.K0(appBrandCustomLoadingConfig.f77204e)) {
            sendAppMessageTask.E1 = u07.C1.f77204e;
        }
        sendAppMessageTask.F1 = this.f83312a;
        sendAppMessageTask.B1 = this.f83315d;
        sendAppMessageTask.C1 = this.f83316e;
        sendAppMessageTask.D1 = this.f83317f;
        sendAppMessageTask.H1 = this.f83313b;
        sendAppMessageTask.G1 = this.f83314c;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void c(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public void d(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, android.content.Intent intent) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.s
    public boolean e(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar) {
        return false;
    }
}
