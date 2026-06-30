package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class o1 extends com.tencent.mm.plugin.appbrand.jsapi.auth.n0 implements com.tencent.mm.plugin.appbrand.jsapi.auth.w {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 54;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "authorize";

    public static final java.lang.Object J(com.tencent.mm.plugin.appbrand.jsapi.auth.o1 o1Var, com.tencent.mm.plugin.appbrand.y yVar, r45.h24 h24Var, kotlin.coroutines.Continuation continuation) {
        o1Var.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        yVar.m(new com.tencent.mm.plugin.appbrand.jsapi.auth.n1(h24Var, yVar, rVar, o1Var));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.n0
    public final void C(com.tencent.mm.plugin.appbrand.jsapi.ff invokeContext, com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        if (L(invokeContext, oVar)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) invokeContext.f81013b;
        int i17 = invokeContext.f81016e;
        org.json.JSONObject jSONObject = invokeContext.f81014c;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("scope");
        if (optJSONArray != null) {
            com.tencent.mm.plugin.appbrand.jsapi.auth.h1 h1Var = com.tencent.mm.plugin.appbrand.jsapi.auth.h1.f79568d;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            cf.f.b(optJSONArray, new cf.e(h1Var, linkedList2));
            linkedList = linkedList2;
        } else {
            linkedList = null;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("showedModal", 0);
        if (linkedList == null || linkedList.isEmpty()) {
            E(yVar, i17, "", jc1.f.f298919h, jSONObject2);
            return;
        }
        kotlinx.coroutines.y0 a17 = com.tencent.mm.plugin.appbrand.utils.y.a(yVar);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(a17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new com.tencent.mm.plugin.appbrand.jsapi.auth.g1(yVar, i17, this, jSONObject2, oVar, linkedList, jSONObject, null), 2, null);
    }

    public java.lang.Object K(com.tencent.mm.plugin.appbrand.y yVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        return jz5.f0.f302826a;
    }

    public boolean L(com.tencent.mm.plugin.appbrand.jsapi.ff invokeContext, com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        return false;
    }

    public java.lang.Object M(com.tencent.mm.plugin.appbrand.y yVar, r45.lv5 lv5Var, kotlin.coroutines.Continuation continuation) {
        return jz5.f0.f302826a;
    }
}
