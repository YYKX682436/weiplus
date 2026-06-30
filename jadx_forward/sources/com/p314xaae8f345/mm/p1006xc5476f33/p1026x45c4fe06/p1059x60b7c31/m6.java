package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class m6 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f163131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f163132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n6 f163133f;

    public m6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n6 n6Var) {
        this.f163131d = e9Var;
        this.f163132e = i17;
        this.f163133f = n6Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11919x694eb55 c11919x694eb55 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11919x694eb55) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n6 n6Var = this.f163133f;
        int i17 = this.f163132e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f163131d;
        if (c11919x694eb55 == null) {
            n6Var.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 107);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, n6Var.u(str, jSONObject));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int i18 = c11919x694eb55.f160056d;
        hashMap.put("showType", java.lang.Integer.valueOf(i18));
        java.lang.String str3 = c11919x694eb55.f160057e;
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str3);
        hashMap.put("iconUrl", c11919x694eb55.f160058f);
        int i19 = c11919x694eb55.f160059g;
        hashMap.put("tipsId", java.lang.Integer.valueOf(i19));
        java.lang.String str4 = c11919x694eb55.f160060h;
        hashMap.put("uniqueId", str4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWeAppNewTipsInfo", "showType:%d, title%s, tipsId:%d, uniqueId:%s", java.lang.Integer.valueOf(i18), str3, java.lang.Integer.valueOf(i19), str4);
        n6Var.getClass();
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", 0);
        e9Var.a(i17, n6Var.t("ok", hashMap));
    }
}
