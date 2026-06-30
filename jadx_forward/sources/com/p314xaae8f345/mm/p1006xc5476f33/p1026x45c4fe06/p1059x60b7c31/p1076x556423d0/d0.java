package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

/* loaded from: classes7.dex */
public class d0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f33994x366c91de = 1065;

    /* renamed from: NAME */
    private static final java.lang.String f33995x24728b = "openChannelsTopic";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, org.json.JSONObject jSONObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        android.content.Context mo50352x76847179 = env.mo50352x76847179();
        if (mo50352x76847179 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsTopic", "invoke, context is null");
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            env.a(i17, u(str, jSONObject2));
            return;
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("entryScene", 15);
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("appid", env.mo48798x74292566());
            jSONObject4.put("appname", C(env));
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, jSONObject4);
            jSONObject.put("KEY_JSAPI_SOURCE_TYPE", 1);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsTopic", "invoke, put report info fail since " + e18);
        }
        jSONObject3.put("extInfo", jSONObject);
        java.lang.String jSONObject5 = jSONObject3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject5, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsTopic", "invoke, openChannelsParams: ".concat(jSONObject5));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12056x6c6f0fda c12056x6c6f0fda = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12056x6c6f0fda(jSONObject5);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.c0 c0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.c0(env, i17, this);
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(mo50352x76847179, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12056x6c6f0fda, c0Var, null);
    }

    public java.lang.String C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        return "";
    }
}
