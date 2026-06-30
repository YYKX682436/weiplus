package rx4;

/* loaded from: classes8.dex */
public final class k {
    public k(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final rx4.l a(org.json.JSONObject parentObj, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentObj, "parentObj");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.lang.String optString = jSONObject != null ? jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "") : null;
        if (optString == null) {
            optString = "";
        }
        jSONObject2.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, optString);
        jSONObject2.put("parenttype", parentObj.optInt("parenttype", 68));
        jSONObject2.put("bgImage", parentObj.optString("bgImage", ""));
        jSONObject2.put("bgImageDark", parentObj.optString("bgImageDark", ""));
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("list") : null;
        if (optJSONArray == null) {
            optJSONArray = new org.json.JSONArray();
        }
        jSONObject2.put("items", optJSONArray);
        return new rx4.l(jSONObject2);
    }
}
