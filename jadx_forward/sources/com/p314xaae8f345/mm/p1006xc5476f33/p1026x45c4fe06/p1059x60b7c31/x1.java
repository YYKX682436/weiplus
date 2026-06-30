package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public abstract class x1 {
    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y component, java.lang.Object jsRuntime, java.lang.String str) {
        java.lang.String sb6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsRuntime, "jsRuntime");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("reportCoverage(appId:");
        sb7.append(component.mo48798x74292566());
        sb7.append(", ");
        if (jsRuntime instanceof cl.q0) {
            sb6 = "Worker";
        } else if (jsRuntime instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Context(");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r) jsRuntime;
            sb8.append(rVar.l() ? "Main" : java.lang.String.valueOf(rVar.o()));
            sb8.append(')');
            sb6 = sb8.toString();
        } else {
            if (!(jsRuntime instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ed)) {
                throw new java.lang.IllegalStateException("Invalid jsRuntime".toString());
            }
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Page(");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ed) jsRuntime).f168112e;
            sb9.append(v5Var != null ? v5Var.X1() : null);
            sb9.append(')');
            sb6 = sb9.toString();
        }
        sb7.append(sb6);
        sb7.append(", data:");
        sb7.append(str);
        sb7.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JSCoverageUtils", sb7.toString());
        if ((str == null || str.length() == 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("null", str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("undefined", str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17 = component.x();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 u07 = component.mo32091x9a3f0ba2().u0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(u07, "null cannot be cast to non-null type com.tencent.luggage.sdk.config.AppBrandInitConfigLU");
        jSONObject.put("userUin", kk.v.a(((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) u07).f128812x0));
        jSONObject.put("platform", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        jSONObject.put("CoverageData", str);
        jSONObject.put("weapplibVersion", x17.W0());
        jSONObject.put("weapplibTime", x17.B7());
        java.lang.String mo48798x74292566 = component.mo48798x74292566();
        if (mo48798x74292566 == null) {
            mo48798x74292566 = "";
        }
        jSONObject.put("appId", mo48798x74292566);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w1(component, jSONObject2));
    }
}
