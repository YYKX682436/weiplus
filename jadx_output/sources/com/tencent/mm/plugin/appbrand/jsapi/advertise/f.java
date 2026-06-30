package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes7.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.advertise.o f78736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f78737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f78738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f78739g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f78740h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.appbrand.jsapi.advertise.o oVar, org.json.JSONObject jSONObject, java.util.Map map, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        super(3);
        this.f78736d = oVar;
        this.f78737e = jSONObject;
        this.f78738f = map;
        this.f78739g = lVar;
        this.f78740h = i17;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mq0.a action = (mq0.a) obj;
        java.util.Map extMap = (java.util.Map) obj2;
        java.lang.String resultMsg = (java.lang.String) obj3;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f78739g;
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(extMap, "extMap");
        kotlin.jvm.internal.o.g(resultMsg, "resultMsg");
        java.util.Map m17 = kz5.c1.m(extMap, this.f78738f);
        org.json.JSONObject jSONObject = this.f78737e;
        com.tencent.mm.plugin.appbrand.jsapi.advertise.o oVar = this.f78736d;
        oVar.F(jSONObject, action, m17);
        try {
            lVar.a(this.f78740h, oVar.o(resultMsg));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiNavigateToMiniProgram.MB", "appId[" + lVar.getAppId() + "], callback failed, env destroyed: " + e17.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
