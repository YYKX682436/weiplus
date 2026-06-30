package sg0;

/* loaded from: classes8.dex */
public final class y1 implements q80.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg0.a2 f489398a;

    public y1(sg0.a2 a2Var) {
        this.f489398a = a2Var;
    }

    @Override // q80.a0
    /* renamed from: onStoreSendResult */
    public void mo51023x884ffda7(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", str == null ? "" : str);
        jSONObject.put("type", str2 == null ? "type" : str2);
        jSONObject.put("result", obj);
        jSONObject.put("err_code", 0);
        jSONObject.put("err_msg", "callLiteApp:ok");
        pm0.v.X(new sg0.v1(this.f489398a, jSONObject));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onStoreSendResult, callbackId: " + i17 + ", appId: " + str + ", type: " + str2 + ", result: " + obj);
    }

    @Override // q80.a0
    /* renamed from: onStoreSetData */
    public void mo51024x295aba8a(java.lang.String str, java.util.Map map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", str == null ? "" : str);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(str2, value);
                jSONArray.put(jSONObject2);
            }
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("err_code", 0);
        jSONObject3.put("err_msg", "onLiteAppSetData:ok");
        jSONObject3.put(ya.b.f77502x92235c1b, jSONObject);
        jSONObject3.put("changes", jSONArray);
        java.lang.String jSONObject4 = jSONObject3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        if (jSONObject4.length() > 102400) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onSetData error, dataSize: " + jSONObject4.length());
            jSONObject3.put("err_code", -2);
            jSONObject3.put("err_msg", "onLiteAppSetData:fail,data is too large!");
            jSONObject3.put("changes", new org.json.JSONArray());
        }
        pm0.v.X(new sg0.x1(this.f489398a, jSONObject3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onStoreSetData, appId: " + str + ", result: " + jSONObject4);
    }
}
