package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes7.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f78761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f78762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.advertise.o f78763f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f78764g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f78765h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f78766i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yz5.l lVar, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsapi.advertise.o oVar, int i17, yz5.a aVar, yz5.l lVar2) {
        super(1);
        this.f78761d = lVar;
        this.f78762e = jSONObject;
        this.f78763f = oVar;
        this.f78764g = i17;
        this.f78765h = aVar;
        this.f78766i = lVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) obj;
        if (e9Var == null) {
            this.f78761d.invoke("service_null");
        } else {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = e9Var.getRuntime();
            if (runtime == null || runtime.S || runtime.L0()) {
                this.f78761d.invoke("runtime_unavailable");
            } else {
                try {
                    java.lang.String optString = this.f78762e.optString("appId");
                    java.lang.String optString2 = this.f78762e.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, null);
                    int i17 = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.a(this.f78762e.optString("envVersion"), com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.RELEASE).f82194d;
                    com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d dVar = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d();
                    int i18 = this.f78764g;
                    org.json.JSONObject jSONObject = this.f78762e;
                    dVar.f82204a = i18;
                    dVar.f82205b = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
                    dVar.f82206c = jSONObject.optString("sceneNote");
                    dVar.f82207d = jSONObject.optInt("preScene", 0);
                    dVar.f82208e = jSONObject.optString("preSceneNote");
                    dVar.f82210g = jSONObject.optInt("sourcetype", 0);
                    dVar.f82209f = jSONObject.optString("agentId");
                    dVar.f82211h = jSONObject.optString("adInfo");
                    com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.q0.f82261b.c(e9Var, optString, i17, optString2, dVar, this.f78762e, this.f78763f.C(this.f78762e), new com.tencent.mm.plugin.appbrand.jsapi.advertise.l(this.f78765h, this.f78766i));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] navigate exception: " + e17.getMessage() + ", fallback to launchCommon2");
                    this.f78761d.invoke("exception:" + e17.getMessage());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
