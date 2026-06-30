package bi1;

/* loaded from: classes7.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final bi1.e a(java.lang.String jsonStr) {
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(jsonStr);
            java.lang.String string = jSONObject.getString("mimeType");
            java.lang.String string2 = jSONObject.getString("materialPath");
            java.lang.String optString = jSONObject.optString("materialName", "");
            int optInt = jSONObject.optInt("materialSize", 0);
            kotlin.jvm.internal.o.d(string);
            kotlin.jvm.internal.o.d(string2);
            kotlin.jvm.internal.o.d(optString);
            return new bi1.e(string, string2, optString, optInt);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialNativeExtraData", "fromJsonString fail since " + e17);
            return null;
        }
    }
}
