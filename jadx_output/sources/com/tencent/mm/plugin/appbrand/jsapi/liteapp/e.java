package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes.dex */
public class e implements q80.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f81537b;

    public e(com.tencent.mm.plugin.appbrand.jsapi.liteapp.f fVar, int i17, com.tencent.mm.ipcinvoker.r rVar) {
        this.f81536a = i17;
        this.f81537b = rVar;
    }

    @Override // q80.a0
    public void onStoreSendResult(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.r rVar = this.f81537b;
        if (this.f81536a == i17) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).ak(this);
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", str2);
                jSONObject.put("result", obj);
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject.toString()));
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiDispatchLiteAppAction", "onStoreSendResult JSONException: %s", e17.toString());
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString("{\"type\": \"error\"}"));
            }
        }
    }

    @Override // q80.a0
    public void onStoreSetData(java.lang.String str, java.util.Map map) {
    }
}
