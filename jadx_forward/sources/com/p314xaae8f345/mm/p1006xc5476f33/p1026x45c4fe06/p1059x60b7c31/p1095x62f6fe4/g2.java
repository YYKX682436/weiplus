package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class g2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f163347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.h2 f163348c;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.h2 h2Var) {
        this.f163346a = lVar;
        this.f163347b = i17;
        this.f163348c = h2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        java.lang.String str;
        java.lang.String str2;
        org.json.JSONArray jSONArray;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12158x43cb8db6 c12158x43cb8db6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12158x43cb8db6) abstractC11888x1a859600;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.h2 h2Var = this.f163348c;
        int i17 = this.f163347b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f163346a;
        if (c12158x43cb8db6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JSApiBizChooseImage", "chooseMedia fail, onReceiveResult result is null");
            h2Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, h2Var.u(str2, jSONObject));
            return;
        }
        if (c12158x43cb8db6.f163151d != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JSApiBizChooseImage", "select failed, onReceiveResult");
            h2Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 107);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, h2Var.u(str2, jSONObject2));
            return;
        }
        java.lang.String str5 = c12158x43cb8db6.f163152e;
        try {
            jSONArray = new org.json.JSONArray(c12158x43cb8db6.f163153f);
        } catch (org.json.JSONException e19) {
            java.lang.String message = e19.getMessage();
            if (message == null) {
                message = "null";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JSApiBizChooseImage", "parse json error = ".concat(message));
            jSONArray = null;
        }
        if (jSONArray != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("type", str5);
            hashMap.put("tempFiles", jSONArray);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JSApiBizChooseImage", "chooseMedia ok, type:%s, localIds:%s", str5, jSONArray);
            h2Var.getClass();
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            lVar.a(i17, h2Var.t("ok", hashMap));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JSApiBizChooseImage", "localIds is null");
        h2Var.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
        str2 = str != null ? str : "";
        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 107);
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        lVar.a(i17, h2Var.u(str2, jSONObject3));
    }
}
