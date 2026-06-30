package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public final class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34970x366c91de = 1377;

    /* renamed from: NAME */
    public static final java.lang.String f34971x24728b = "operateWebRTCVoiceRecord";

    /* renamed from: g, reason: collision with root package name */
    public mi1.w0 f165381g;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("operate") : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "start")) {
            this.f165381g = mi1.c.a(c0Var != null ? c0Var.t3() : null).h(mi1.d.VOICE);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "stop")) {
            mi1.w0 w0Var = this.f165381g;
            if (w0Var != null) {
                w0Var.mo147359x63a3b28a();
            }
            this.f165381g = null;
        } else {
            if (c0Var != null) {
                java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 101);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                c0Var.a(i17, u(str, jSONObject2));
            }
            mi1.w0 w0Var2 = this.f165381g;
            if (w0Var2 != null) {
                w0Var2.mo147359x63a3b28a();
            }
            this.f165381g = null;
        }
        if (c0Var != null) {
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            java.lang.String str4 = str3 != null ? str3 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var.a(i17, u(str4, jSONObject3));
        }
    }
}
