package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class z0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getBrandWCPayRequest";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBrandWCPayRequest", "invokeInOwn");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488143d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("url", ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).u());
            jSONObject.put("pay_scene", 3);
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62(bVar.f488130b.f426039c);
        c19761xc2874b62.A = 1;
        c19761xc2874b62.f273675t = 3;
        c19761xc2874b62.H = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488190n.getString("ad_ux_info_for_jsapi_pay");
        c19761xc2874b62.I = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488190n.getString("common_ux_info_for_jsapi_pay");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBrandWCPayRequest", "pay channel: %s, scene: %s, adUxInfo: %s, %s", java.lang.Integer.valueOf(c19761xc2874b62.f273677v), java.lang.Integer.valueOf(c19761xc2874b62.f273675t), c19761xc2874b62.H, c19761xc2874b62.I);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.y0(this, bVar);
        og0.o oVar = (og0.o) i95.n0.c(og0.o.class);
        int hashCode = hashCode() & 65535;
        ((ng0.q) oVar).getClass();
        if (h45.a0.d(abstractActivityC21394xb3d2c0cf, c19761xc2874b62, hashCode, y0Var)) {
            return;
        }
        bVar.c("fail", null);
    }
}
