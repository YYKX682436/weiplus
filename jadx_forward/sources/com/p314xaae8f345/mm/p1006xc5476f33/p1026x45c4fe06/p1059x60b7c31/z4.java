package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class z4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f35032x366c91de = 627;

    /* renamed from: NAME */
    public static final java.lang.String f35033x24728b = "chooseShareGroup";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (jSONObject == null) {
            c0Var.a(i17, o("fail:invalid data"));
            return;
        }
        android.app.Activity r07 = c0Var.t3().r0();
        if (r07 == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        try {
            java.lang.String string = jSONObject.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            boolean optBoolean = jSONObject.has("public") ? jSONObject.optBoolean("public") : true;
            boolean optBoolean2 = jSONObject.has("private") ? jSONObject.optBoolean("private") : true;
            boolean optBoolean3 = jSONObject.has("visible") ? jSONObject.optBoolean("visible") : true;
            boolean optBoolean4 = jSONObject.has("invisible") ? jSONObject.optBoolean("invisible") : true;
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("labelList");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                strArr = null;
            } else {
                strArr = new java.lang.String[optJSONArray.length()];
                for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                    strArr[i18] = optJSONArray.getString(i18);
                }
            }
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("userList");
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                str = "fail:invalid data";
                strArr2 = null;
            } else {
                strArr2 = new java.lang.String[optJSONArray2.length()];
                str = "fail:invalid data";
                for (int i19 = 0; i19 < optJSONArray2.length(); i19++) {
                    try {
                        strArr2[i19] = optJSONArray2.getString(i19);
                    } catch (org.json.JSONException e17) {
                        e = e17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseShareGroup", "parse data failed by %s, appId:%s, callbackId:%d", e, c0Var.mo48798x74292566(), java.lang.Integer.valueOf(i17));
                        c0Var.a(i17, o(str));
                        return;
                    }
                }
            }
            java.lang.String optString = jSONObject.optString("group");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("k_select_group", optString);
            intent.putExtra("k_title", string);
            intent.putExtra("k_show_public", optBoolean);
            intent.putExtra("k_show_private", optBoolean2);
            intent.putExtra("k_show_include", optBoolean3);
            intent.putExtra("k_show_exclude", optBoolean4);
            if (strArr != null) {
                intent.putExtra("Klabel_name_list", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(java.util.Arrays.asList(strArr), ","));
            }
            if (strArr2 != null) {
                intent.putExtra("Kother_user_name_list", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(java.util.Arrays.asList(strArr2), ","));
            }
            intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            try {
                nf.g.a(r07).j(intent, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y4(this, c0Var, i17));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiChooseShareGroup", e18, "", new java.lang.Object[0]);
                c0Var.a(i17, o("fail"));
            }
        } catch (org.json.JSONException e19) {
            e = e19;
            str = "fail:invalid data";
        }
    }
}
