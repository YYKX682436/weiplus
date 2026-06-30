package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public final class r1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f164192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s1 f164194c;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s1 s1Var) {
        this.f164192a = d0Var;
        this.f164193b = i17;
        this.f164194c = s1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12209xfce2a9ed c12209xfce2a9ed = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12209xfce2a9ed) abstractC11888x1a859600;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s1 s1Var = this.f164194c;
        int i17 = this.f164193b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f164192a;
        if (c12209xfce2a9ed == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestMedicalInsurancePay", "onReceiveResult get NULL result");
            s1Var.getClass();
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            d0Var.a(i17, s1Var.u(str, jSONObject));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestMedicalInsurancePay", "onReceiveResult result:" + c12209xfce2a9ed.f164089d + " data:" + c12209xfce2a9ed.f164090e);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c12209xfce2a9ed.f164089d, ya.b.f77504xbb80cbe3)) {
            org.json.JSONObject jSONObject2 = c12209xfce2a9ed.f164090e;
            s1Var.getClass();
            java.lang.String str4 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str = str4 != null ? str4 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (jSONObject2 == null) {
                jSONObject2 = new org.json.JSONObject();
            }
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            d0Var.a(i17, s1Var.u(str, jSONObject2));
            return;
        }
        org.json.JSONObject jSONObject3 = c12209xfce2a9ed.f164090e;
        if (jSONObject3 != null) {
            java.lang.String str6 = c12209xfce2a9ed.f164089d;
            s1Var.getClass();
            str2 = android.text.TextUtils.isEmpty(str6) ? "fail:internal error" : str6;
            str = str2 != null ? str2 : "";
            java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            d0Var.a(i17, s1Var.u(str, jSONObject3));
            return;
        }
        java.lang.String str8 = c12209xfce2a9ed.f164089d;
        s1Var.getClass();
        str2 = android.text.TextUtils.isEmpty(str8) ? "fail:internal error" : str8;
        str = str2 != null ? str2 : "";
        java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("errno", 4);
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        d0Var.a(i17, s1Var.u(str, jSONObject4));
    }
}
