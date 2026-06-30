package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public class s1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o1 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o1
    public java.lang.Object K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        if (list.contains("scope.voip")) {
            d75.b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1(yVar));
        }
        return jz5.f0.f384359a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o1
    public boolean L(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff invokeContext, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o oVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = invokeContext.f162546b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2 q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar).t3().K1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2.class);
        if (!(q2Var != null ? q2Var.g4() : false)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAuthorizeNewImplWithWechatLogic", "invoke data:" + invokeContext.f162547c);
        int i17 = invokeContext.f162549e;
        jc1.d dVar = jc1.f.f380445a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("showedModal", 0);
        E((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar, i17, "", dVar, jSONObject);
        if (oVar == null) {
            return true;
        }
        oVar.a();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o1
    public java.lang.Object M(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, r45.lv5 lv5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.mv5 risk_popup_info = lv5Var.f461392e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(risk_popup_info, "risk_popup_info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12005x7bdc009 c12005x7bdc009 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12005x7bdc009(risk_popup_info);
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        d75.b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.r1(this, yVar, c12005x7bdc009, rVar));
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f440719d ? j17 : jz5.f0.f384359a;
    }
}
