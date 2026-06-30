package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public class u implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f163804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f163805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f163806c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.s f163807d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, org.json.JSONObject jSONObject) {
        this.f163807d = sVar;
        this.f163804a = yVar;
        this.f163805b = i17;
        this.f163806c = jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g
    public void a(boolean z17, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        org.json.JSONObject jSONObject = this.f163806c;
        int i17 = this.f163805b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f163804a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.s sVar = this.f163807d;
        if (z17) {
            sVar.getClass();
            str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, sVar.u(str3, jSONObject2));
            sVar.H(jSONObject, ya.b.f77504xbb80cbe3, "");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail");
        if (android.text.TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = " " + str;
        }
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        sVar.getClass();
        str3 = android.text.TextUtils.isEmpty(null) ? sb7 : null;
        java.lang.String str5 = str3 != null ? str3 : "";
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        yVar.a(i17, sVar.u(str5, jSONObject3));
        sVar.H(jSONObject, "fail", sb7);
    }
}
