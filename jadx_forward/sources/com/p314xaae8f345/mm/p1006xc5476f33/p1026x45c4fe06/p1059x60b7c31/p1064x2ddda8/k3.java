package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class k3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n3 {

    /* renamed from: e, reason: collision with root package name */
    public final r45.n24 f161154e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f161155f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h4 sharedContext, r45.n24 n24Var, boolean z17) {
        super(sharedContext, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sharedContext, "sharedContext");
        this.f161154e = n24Var;
        this.f161155f = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n3
    public void d() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h4 h4Var = this.f161072d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j4 j4Var = h4Var.f161103d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff invokeContext = h4Var.f161104e;
        j4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        r45.n24 n24Var = this.f161154e;
        r45.j14 j14Var = n24Var != null ? n24Var.f462548d : null;
        int i17 = invokeContext.f162549e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = invokeContext.f162546b;
        if (j14Var == null) {
            if (this.f161155f) {
                str = android.text.TextUtils.isEmpty("fail:confirm cgi fail") ? "fail:cgi failed for response null" : "fail:confirm cgi fail";
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 109);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                lVar.a(i17, j4Var.u(str, jSONObject));
                return;
            }
            str = android.text.TextUtils.isEmpty("fail:cgi fail") ? "fail:cgi failed for response null" : "fail:cgi fail";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 109);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, j4Var.u(str, jSONObject2));
            return;
        }
        int i18 = j14Var.f459024d;
        java.lang.String str5 = j14Var.f459025e;
        if (str5 == null || str5.length() == 0) {
            str2 = "fail:login error " + i18;
        } else {
            str2 = "fail:" + str5;
        }
        int i19 = j14Var.f459026f;
        if (i19 == 0) {
            i19 = 1000;
        }
        java.lang.String str6 = android.text.TextUtils.isEmpty(str2) ? null : str2;
        if (str6 == null) {
            str6 = "";
        }
        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", i19);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        lVar.a(i17, j4Var.u(str6, jSONObject3));
    }
}
