package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31;

/* loaded from: classes7.dex */
public final class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f34131x366c91de = 1526;

    /* renamed from: NAME */
    public static final java.lang.String f34132x24728b = "handleEcsActionSync";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String b17;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (c0Var == null) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SurfaceApp.JsApiHandleEcsAction", "JsApiHandleEcsAction env null", null);
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            java.lang.String u17 = u(str2, jSONObject2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "makeReturnJson(...)");
            return u17;
        }
        this.f162871e = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.k.f162338a;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsActionHandlerDispatcher", "dispatchSync data null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            java.lang.String u18 = u(str2, jSONObject3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u18, "makeReturnJson(...)");
            return u18;
        }
        c00.r3 r3Var = (c00.r3) i95.n0.c(c00.r3.class);
        android.app.Activity Z0 = c0Var.Z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.i(this);
        b00.m2 m2Var = (b00.m2) r3Var;
        m2Var.getClass();
        java.lang.String optString = jSONObject.optString("action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEcsHandleEcsActionService", "handleEcsActionSync action:" + optString + " inScene:1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        java.util.Map map = (java.util.Map) m2Var.f98253e.get(1);
        t00.s0 s0Var = map == null ? null : (t00.s0) map.get(optString);
        if (s0Var != null && (b17 = s0Var.b(1, Z0, jSONObject, iVar)) != null) {
            return b17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMEcsHandleEcsActionService", "handleEcsActionSync not support action: ".concat(optString));
        return iVar.a(null);
    }
}
