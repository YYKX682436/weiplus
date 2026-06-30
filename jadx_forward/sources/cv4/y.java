package cv4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv4/y;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class y extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiSavePermanentData", jSONObject != null ? jSONObject.toString() : null);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("key", "");
            } catch (java.lang.Exception unused) {
                jSONObject2.put("retCode", -1);
            }
        } else {
            optString = null;
        }
        if (((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D(optString, jSONObject != null ? jSONObject.optString("value", "") : null)) {
            jSONObject2.put("retCode", 0);
        } else {
            jSONObject2.put("retCode", -1);
        }
        this.f224976f.c(jSONObject2, false);
    }
}
