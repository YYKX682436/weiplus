package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class s1 extends com.tencent.mm.plugin.appbrand.jsapi.auth.o1 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.o1
    public java.lang.Object K(com.tencent.mm.plugin.appbrand.y yVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        if (list.contains("scope.voip")) {
            d75.b.g(new com.tencent.mm.plugin.appbrand.jsapi.auth.p1(yVar));
        }
        return jz5.f0.f302826a;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.o1
    public boolean L(com.tencent.mm.plugin.appbrand.jsapi.ff invokeContext, com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = invokeContext.f81013b;
        com.tencent.mm.plugin.appbrand.wxassistant.q2 q2Var = (com.tencent.mm.plugin.appbrand.wxassistant.q2) ((com.tencent.mm.plugin.appbrand.y) lVar).t3().K1(com.tencent.mm.plugin.appbrand.wxassistant.q2.class);
        if (!(q2Var != null ? q2Var.g4() : false)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorizeNewImplWithWechatLogic", "invoke data:" + invokeContext.f81014c);
        int i17 = invokeContext.f81016e;
        jc1.d dVar = jc1.f.f298912a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("showedModal", 0);
        E((com.tencent.mm.plugin.appbrand.y) lVar, i17, "", dVar, jSONObject);
        if (oVar == null) {
            return true;
        }
        oVar.a();
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.o1
    public java.lang.Object M(com.tencent.mm.plugin.appbrand.y yVar, r45.lv5 lv5Var, kotlin.coroutines.Continuation continuation) {
        r45.mv5 risk_popup_info = lv5Var.f379859e;
        kotlin.jvm.internal.o.f(risk_popup_info, "risk_popup_info");
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo mMAuthScopeRiskInfo = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo(risk_popup_info);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        d75.b.g(new com.tencent.mm.plugin.appbrand.jsapi.auth.r1(this, yVar, mMAuthScopeRiskInfo, rVar));
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : jz5.f0.f302826a;
    }
}
