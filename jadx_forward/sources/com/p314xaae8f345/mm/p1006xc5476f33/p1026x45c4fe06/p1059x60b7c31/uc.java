package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class uc extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34908x366c91de = 1155;

    /* renamed from: NAME */
    public static final java.lang.String f34909x24728b = "rtosWatchQuickReply";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        java.util.Objects.toString(jSONObject);
        java.lang.Integer valueOf = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("action")) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRtosWatchQuickReply", "save quick reply.");
            com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(jSONObject != null ? jSONObject.toString() : null), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.tc.class);
            if (c10756x2a5d7b2d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRtosWatchQuickReply", "invoke save fail.");
                if (d0Var != null) {
                    android.text.TextUtils.isEmpty("fail");
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", -1);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    d0Var.a(i17, u("fail", jSONObject2));
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRtosWatchQuickReply", "invoke save ok.");
            if (d0Var != null) {
                java.lang.String m46222x9616526c = c10756x2a5d7b2d.m46222x9616526c();
                java.lang.String str2 = c10756x2a5d7b2d.f149939d;
                if (android.text.TextUtils.isEmpty(m46222x9616526c)) {
                    m46222x9616526c = str2;
                }
                if (m46222x9616526c == null) {
                    m46222x9616526c = "";
                }
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 0);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                d0Var.a(i17, u(m46222x9616526c, jSONObject3));
                return;
            }
            return;
        }
        if (valueOf == null || valueOf.intValue() != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRtosWatchQuickReply", "unknown_action.");
            if (d0Var != null) {
                android.text.TextUtils.isEmpty("fail");
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                try {
                    jSONObject4.put("errno", -1);
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                }
                d0Var.a(i17, u("fail", jSONObject4));
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRtosWatchQuickReply", "get quick reply.");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d2 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.sc.class);
        if (c10756x2a5d7b2d2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10756x2a5d7b2d2.f149939d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRtosWatchQuickReply", "invoke get replyList fail");
            if (d0Var != null) {
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                android.text.TextUtils.isEmpty("fail");
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                try {
                    jSONObject5.put("errno", -1);
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                }
                d0Var.a(i17, u("fail", jSONObject5));
                return;
            }
            return;
        }
        try {
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            jSONObject6.put("replyList", new org.json.JSONArray(c10756x2a5d7b2d2.m46222x9616526c()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRtosWatchQuickReply", "invoke get replyList ok.");
            if (d0Var != null) {
                android.text.TextUtils.isEmpty("ok");
                java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                try {
                    jSONObject6.put("errno", 0);
                } catch (java.lang.Exception e28) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
                }
                d0Var.a(i17, u("ok", jSONObject6));
            }
        } catch (java.lang.Exception e29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiRtosWatchQuickReply", e29, "invoke get replyList fail.", new java.lang.Object[0]);
            if (d0Var != null) {
                org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                java.lang.String str7 = android.text.TextUtils.isEmpty("fail") ? "decode json fail" : "fail";
                java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                try {
                    jSONObject7.put("errno", -1);
                } catch (java.lang.Exception e37) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e37);
                }
                d0Var.a(i17, u(str7, jSONObject7));
            }
        }
    }
}
