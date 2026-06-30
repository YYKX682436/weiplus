package j41;

/* loaded from: classes11.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f379150a = "";

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f379151b = new java.util.LinkedList();

    public j41.d0 a(org.json.JSONObject jSONObject) {
        this.f379150a = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("detail");
        if (optJSONArray == null) {
            return this;
        }
        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
            org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
            j41.e0 e0Var = new j41.e0();
            java.util.List list = this.f379151b;
            e0Var.f379152a = jSONObject2.optString("icon");
            e0Var.f379153b = jSONObject2.optString("desc");
            e0Var.f379154c = jSONObject2.optInt("desc_type");
            e0Var.f379155d = jSONObject2.optInt("action");
            e0Var.f379156e = jSONObject2.optString("action_param");
            e0Var.f379160i = jSONObject2.optJSONArray("image_url");
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(e0Var.f379156e);
                e0Var.f379157f = jSONObject3.optInt("iconwidth");
                e0Var.f379158g = jSONObject3.optInt("iconheight");
                e0Var.f379159h = jSONObject3.optString("ecsjumpinfo");
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenIMCustomDetail", e17, "OpenIMCustomDetail parse error", new java.lang.Object[0]);
            }
            ((java.util.LinkedList) list).add(e0Var);
        }
        return this;
    }
}
