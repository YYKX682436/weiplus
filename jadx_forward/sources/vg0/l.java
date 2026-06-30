package vg0;

/* loaded from: classes8.dex */
public final class l implements ou4.c0 {
    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.Object obj = map != null ? map.get("json") : null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebSearchApiHandlers", "storeGetSearchDataParams, " + jSONObject);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putString("sos_fts_search_data_tmp", jSONObject.toString());
            ou4.b0.c(callback, null, 1, null);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WebSearchApiHandlers", e17, "storeGetSearchDataParams fail: invalid json", new java.lang.Object[0]);
            java.lang.String message = e17.getMessage();
            if (message == null) {
                message = "invalid json";
            }
            callback.b("JSON_ERROR", message);
        }
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return "storeGetSearchDataParams";
    }
}
