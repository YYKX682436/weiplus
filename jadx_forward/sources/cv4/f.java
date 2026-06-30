package cv4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv4/f;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke, reqData: ");
        sb6.append(jSONObject != null ? jSONObject.toString() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetExpConfig", sb6.toString());
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("key");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppJsApiGetExpConfig", e17, "invoke", new java.lang.Object[0]);
                this.f224976f.a("Error");
                return;
            }
        } else {
            optString = null;
        }
        java.lang.String j17 = optString != null ? j62.e.g().j(optString, jSONObject != null ? jSONObject.optString("defValue") : null, (jSONObject != null ? jSONObject.optInt("skipReport") : -1) <= 0, true) : null;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.putOpt("retCode", "0");
        jSONObject2.putOpt("configResult", j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetExpConfig", "invoke, expValue: " + j17);
        this.f224976f.c(jSONObject2, false);
    }
}
