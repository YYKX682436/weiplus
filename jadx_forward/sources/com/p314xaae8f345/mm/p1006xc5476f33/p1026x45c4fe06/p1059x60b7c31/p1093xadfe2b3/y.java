package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes.dex */
public class y implements q80.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f163093a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p794xb0fa9b5e.r f163094b;

    public y(java.lang.String str, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f163093a = str;
        this.f163094b = rVar;
    }

    @Override // q80.a0
    /* renamed from: onStoreSendResult */
    public void mo51023x884ffda7(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
    }

    @Override // q80.a0
    /* renamed from: onStoreSetData */
    public void mo51024x295aba8a(java.lang.String str, java.util.Map map) {
        if (this.f163093a.equals(str)) {
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
                jSONObject2.put(ya.b.f77502x92235c1b, jSONObject);
                jSONObject2.put("changes", jSONArray);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("type", "DISPATCH");
                jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject2);
                this.f163094b.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(jSONObject3.toString()));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppStoreListenerManager", "onStoreSetData JSONException: %s", e17.toString());
            }
        }
    }
}
