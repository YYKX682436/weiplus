package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public abstract class a {
    public static org.json.JSONArray a(java.util.List list, r45.vq0 vq0Var) {
        if (list == null) {
            return new org.json.JSONArray();
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            java.util.Iterator it = list.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                jSONArray.put(i17, d((r45.vq0) it.next()));
                i17++;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiF2FFavorHelper", e17, "", new java.lang.Object[0]);
        }
        return jSONArray;
    }

    public static org.json.JSONObject b(r45.k6 k6Var) {
        if (k6Var == null) {
            return new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("channel", k6Var.f459949f);
            jSONObject.put("favor_compose_info", c(k6Var.f459953m));
            jSONObject.put("f2f_id", k6Var.f459947d);
            jSONObject.put("payok_checksign", k6Var.f459952i);
            jSONObject.put("receiver_openid", k6Var.f459955o);
            jSONObject.put("receiver_username", k6Var.f459954n);
            jSONObject.put("scan_scene", k6Var.f459950g);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, k6Var.f459951h);
            jSONObject.put("total_amount", k6Var.f459956p);
            jSONObject.put("trans_id", k6Var.f459948e);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiF2FFavorHelper", e17, "", new java.lang.Object[0]);
        }
        return jSONObject;
    }

    public static org.json.JSONObject c(r45.uq0 uq0Var) {
        if (uq0Var == null) {
            return new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("favor_compose_id", uq0Var.f469097d);
            jSONObject.put("favor_info_list,", a(uq0Var.f469098e, new r45.vq0()));
            jSONObject.put("show_favor_amount,", uq0Var.f469099f);
            jSONObject.put("show_pay_amount,", uq0Var.f469100g);
            jSONObject.put("total_favor_amount,", uq0Var.f469101h);
            jSONObject.put("favor_desc", uq0Var.f469102i);
            jSONObject.put("compose_sort_flag", uq0Var.f469103m);
            jSONObject.put("extend_str", uq0Var.f469104n);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiF2FFavorHelper", e17, "", new java.lang.Object[0]);
        }
        return jSONObject;
    }

    public static org.json.JSONObject d(r45.vq0 vq0Var) {
        if (vq0Var == null) {
            return new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("fav_type", vq0Var.f469966d);
            jSONObject.put("fav_sub_type", vq0Var.f469967e);
            jSONObject.put("fav_property", vq0Var.f469968f);
            jSONObject.put("favor_type_desc", vq0Var.f469969g);
            jSONObject.put("fav_id", vq0Var.f469970h);
            jSONObject.put("fav_name", vq0Var.f469971i);
            jSONObject.put("fav_desc", vq0Var.f469972m);
            jSONObject.put("favor_use_manual", vq0Var.f469973n);
            jSONObject.put("favor_remarks", vq0Var.f469974o);
            jSONObject.put("fav_price", vq0Var.f469975p);
            jSONObject.put("real_fav_fee", vq0Var.f469976q);
            jSONObject.put("fav_scope_type", vq0Var.f469977r);
            jSONObject.put("business_receipt_no", vq0Var.f469978s);
            jSONObject.put("unavailable", vq0Var.f469979t);
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BusiF2FFavorHelper", e17, "", new java.lang.Object[0]);
            return jSONObject;
        }
    }
}
