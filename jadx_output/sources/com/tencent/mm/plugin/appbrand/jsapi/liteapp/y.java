package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes.dex */
public class y implements q80.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f81560a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ipcinvoker.r f81561b;

    public y(java.lang.String str, com.tencent.mm.ipcinvoker.r rVar) {
        this.f81560a = str;
        this.f81561b = rVar;
    }

    @Override // q80.a0
    public void onStoreSendResult(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
    }

    @Override // q80.a0
    public void onStoreSetData(java.lang.String str, java.util.Map map) {
        if (this.f81560a.equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("appId", str);
                final org.json.JSONArray jSONArray = new org.json.JSONArray();
                map.forEach(new java.util.function.BiConsumer() { // from class: com.tencent.mm.plugin.appbrand.jsapi.liteapp.y$$a
                    @Override // java.util.function.BiConsumer
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        org.json.JSONArray jSONArray2 = jSONArray;
                        java.lang.String str2 = (java.lang.String) obj;
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        try {
                            jSONObject2.put(str2, obj2);
                            jSONArray2.put(jSONObject2);
                        } catch (org.json.JSONException unused) {
                        }
                    }
                });
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(ya.b.SOURCE, jSONObject);
                jSONObject2.put("changes", jSONArray);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("type", "DISPATCH");
                jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject2);
                this.f81561b.a(new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject3.toString()));
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppStoreListenerManager", "onStoreSetData JSONException: %s", e17.toString());
            }
        }
    }
}
