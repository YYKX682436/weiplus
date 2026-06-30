package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class v1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "jumpToBizProfile";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("tousername");
            java.lang.String optString2 = jSONObject.optString("extmsg");
            java.lang.String optString3 = jSONObject.optString("currentUrl");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("toUserName", optString);
            intent.putExtra("extInfo", optString2);
            intent.putExtra("fromURL", optString3);
            intent.putExtra(ya.b.f77502x92235c1b, 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.u1 u1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.u1(this, q5Var);
            o25.t1 t1Var = dw4.a.f325830a;
            int hashCode = hashCode() & 65535;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
            ((com.p314xaae8f345.mm.app.y7) t1Var).getClass();
            if (abstractActivityC21394xb3d2c0cf != null) {
                intent.setClassName(abstractActivityC21394xb3d2c0cf, "com.tencent.mm.ui.CheckCanSubscribeBizUI");
                abstractActivityC21394xb3d2c0cf.m78546x70d84175((com.p314xaae8f345.mm.ui.da) u1Var, intent, hashCode);
            }
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiJumpToBizProfile", "parase json fail");
            q5Var.a("fail", null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
