package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public class o1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f33859x366c91de = 54;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f33860x24728b = "authorize";

    public static final java.lang.Object J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o1 o1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, r45.h24 h24Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        o1Var.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        yVar.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n1(h24Var, yVar, rVar, o1Var));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0
    public final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff invokeContext, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o oVar) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        if (L(invokeContext, oVar)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) invokeContext.f162546b;
        int i17 = invokeContext.f162549e;
        org.json.JSONObject jSONObject = invokeContext.f162547c;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("scope");
        if (optJSONArray != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h1 h1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h1.f161101d;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            cf.f.b(optJSONArray, new cf.e(h1Var, linkedList2));
            linkedList = linkedList2;
        } else {
            linkedList = null;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("showedModal", 0);
        if (linkedList == null || linkedList.isEmpty()) {
            E(yVar, i17, "", jc1.f.f380452h, jSONObject2);
            return;
        }
        p3325xe03a0797.p3326xc267989b.y0 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y.a(yVar);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(a17, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g1(yVar, i17, this, jSONObject2, oVar, linkedList, jSONObject, null), 2, null);
    }

    public java.lang.Object K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return jz5.f0.f384359a;
    }

    public boolean L(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff invokeContext, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o oVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        return false;
    }

    public java.lang.Object M(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, r45.lv5 lv5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return jz5.f0.f384359a;
    }
}
