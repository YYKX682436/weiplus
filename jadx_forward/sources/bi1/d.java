package bi1;

/* loaded from: classes7.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final bi1.e a(java.lang.String jsonStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonStr, "jsonStr");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(jsonStr);
            java.lang.String string = jSONObject.getString("mimeType");
            java.lang.String string2 = jSONObject.getString("materialPath");
            java.lang.String optString = jSONObject.optString("materialName", "");
            int optInt = jSONObject.optInt("materialSize", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            return new bi1.e(string, string2, optString, optInt);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialNativeExtraData", "fromJsonString fail since " + e17);
            return null;
        }
    }
}
