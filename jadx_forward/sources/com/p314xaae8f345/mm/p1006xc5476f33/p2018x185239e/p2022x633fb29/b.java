package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public abstract class b {
    public static r45.vq0 a(org.json.JSONObject jSONObject) {
        r45.vq0 vq0Var = new r45.vq0();
        vq0Var.f469978s = jSONObject.optString("business_receipt_no");
        vq0Var.f469980u = jSONObject.optString("extend_str");
        vq0Var.f469972m = jSONObject.optString("fav_desc");
        vq0Var.f469970h = jSONObject.optLong("fav_id", 0L);
        vq0Var.f469971i = jSONObject.optString("fav_name");
        vq0Var.f469975p = jSONObject.optString("fav_price");
        vq0Var.f469968f = jSONObject.optLong("fav_property", 0L);
        vq0Var.f469977r = jSONObject.optInt("fav_scope_type", 0);
        vq0Var.f469967e = jSONObject.optLong("fav_sub_type", 0L);
        vq0Var.f469966d = jSONObject.optLong("fav_type", 0L);
        vq0Var.f469974o = jSONObject.optString("favor_remarks");
        vq0Var.f469969g = jSONObject.optString("favor_type_desc");
        vq0Var.f469973n = jSONObject.optString("favor_use_manual");
        vq0Var.f469976q = jSONObject.optString("real_fav_fee");
        vq0Var.f469979t = jSONObject.optInt("unavailable");
        return vq0Var;
    }

    public static java.util.LinkedList b(org.json.JSONArray jSONArray) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (jSONArray == null) {
            return linkedList;
        }
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            try {
                linkedList.add(a(jSONArray.getJSONObject(i17)));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiFavorInfoParser", e17, "", new java.lang.Object[0]);
            }
        }
        return linkedList;
    }
}
