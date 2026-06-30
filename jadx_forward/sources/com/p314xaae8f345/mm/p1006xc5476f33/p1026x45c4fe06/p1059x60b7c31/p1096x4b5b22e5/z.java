package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public final class z extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34529x366c91de = 1306;

    /* renamed from: NAME */
    public static final java.lang.String f34530x24728b = "postMessageToReferrerMiniProgram";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        java.lang.String str;
        int i18;
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2;
        jz5.f0 f0Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y env = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.Object opt = data.opt(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        if (opt == null) {
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            java.lang.String str3 = str2 != null ? str2 : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            env.a(i17, u(str3, jSONObject));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = env.mo32091x9a3f0ba2();
        ze.n nVar = mo32091x9a3f0ba2 instanceof ze.n ? (ze.n) mo32091x9a3f0ba2 : null;
        if (nVar != null) {
            int i19 = nVar.u0().D.f158855d;
            f0Var = jz5.f0.f384359a;
            if (1 == i19) {
                try {
                    c11510xdd90c2f2 = nVar.B0();
                } catch (java.lang.IllegalAccessError unused) {
                    c11510xdd90c2f2 = nVar.f156337o;
                }
                if (c11510xdd90c2f2 != null) {
                    str = "";
                    i18 = 4;
                    c11510xdd90c2f2.I1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.y(c11510xdd90c2f2, nVar, opt, env, i17, this));
                    f0Var2 = f0Var;
                } else {
                    str = "";
                    i18 = 4;
                    f0Var2 = null;
                }
                if (f0Var2 == null) {
                    java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    if (str5 == null) {
                        str5 = str;
                    }
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", i18);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                    }
                    env.a(i17, u(str5, jSONObject2));
                    return;
                }
            } else {
                str = "";
                i18 = 4;
                java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? "fail:require miniprogram navigation" : null;
                if (str7 == null) {
                    str7 = str;
                }
                java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 301004);
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                }
                env.a(i17, u(str7, jSONObject3));
            }
        } else {
            str = "";
            i18 = 4;
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.String str9 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str9 == null) {
                str9 = str;
            }
            java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", i18);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            env.a(i17, u(str9, jSONObject4));
        }
    }
}
