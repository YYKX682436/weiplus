package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class i5 extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 36;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "chooseVideo";

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.media.a5 f81851g;

    public i5() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_choosevideo_new, 1) > 0) {
            return;
        }
        this.f81851g = new com.tencent.mm.plugin.appbrand.jsapi.media.a5();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        kotlin.jvm.internal.o.d(lVar);
        kotlin.jvm.internal.o.d(jSONObject);
        com.tencent.mm.plugin.appbrand.jsapi.media.a5 a5Var = this.f81851g;
        if (a5Var != null) {
            kotlin.jvm.internal.o.d(a5Var);
            a5Var.A(lVar, jSONObject, i17);
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("compressed", true);
        com.tencent.mm.plugin.appbrand.jsapi.media.o7.f81966e.getClass();
        int i18 = com.tencent.mm.plugin.appbrand.jsapi.media.l7.f81930s0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String lowerCase = "ALBUM".toLowerCase();
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        sb6.append(lowerCase);
        sb6.append(", ");
        java.lang.String lowerCase2 = "CAMERA".toLowerCase();
        kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
        sb6.append(lowerCase2);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.appbrand.jsapi.media.o7[] enums = com.tencent.mm.plugin.appbrand.jsapi.media.o7.values();
        kotlin.jvm.internal.o.g(sb7, "default");
        kotlin.jvm.internal.o.g(enums, "enums");
        java.lang.String optString = jSONObject.optString("sourceType", sb7);
        int i19 = 0;
        for (com.tencent.mm.plugin.appbrand.jsapi.media.o7 o7Var : enums) {
            kotlin.jvm.internal.o.d(optString);
            java.lang.String lowerCase3 = o7Var.getName().toLowerCase();
            kotlin.jvm.internal.o.f(lowerCase3, "toLowerCase(...)");
            if (r26.n0.B(optString, lowerCase3, false)) {
                i19 |= o7Var.h();
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.k7.f81904e.getClass();
        int i27 = com.tencent.mm.plugin.appbrand.jsapi.media.l7.f81930s0;
        java.lang.String lowerCase4 = "BACK".toLowerCase();
        kotlin.jvm.internal.o.f(lowerCase4, "toLowerCase(...)");
        com.tencent.mm.plugin.appbrand.jsapi.media.k7[] enums2 = com.tencent.mm.plugin.appbrand.jsapi.media.k7.values();
        kotlin.jvm.internal.o.g(enums2, "enums");
        java.lang.String optString2 = jSONObject.optString("camera", lowerCase4);
        int i28 = 0;
        for (com.tencent.mm.plugin.appbrand.jsapi.media.k7 k7Var : enums2) {
            kotlin.jvm.internal.o.d(optString2);
            java.lang.String lowerCase5 = k7Var.getName().toLowerCase();
            kotlin.jvm.internal.o.f(lowerCase5, "toLowerCase(...)");
            if (r26.n0.B(optString2, lowerCase5, false)) {
                i28 |= k7Var.h();
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.m7[] m7VarArr = com.tencent.mm.plugin.appbrand.jsapi.media.m7.f81942e;
        int optInt = jSONObject.optInt("maxDuration", 60);
        if (optInt <= 0) {
            lVar.a(i17, o("fail invalid maxDuration"));
            return;
        }
        pq5.g h17 = pq5.h.a().h(new com.tencent.mm.plugin.appbrand.jsapi.media.s0(new com.tencent.mm.plugin.appbrand.jsapi.media.t0(lVar, i19, i28, 2, !optBoolean, optInt, 1)));
        kotlin.jvm.internal.o.f(h17, "$ui(...)");
        h17.K(new com.tencent.mm.plugin.appbrand.jsapi.media.g5(lVar, i17, this, optBoolean));
        h17.s(new com.tencent.mm.plugin.appbrand.jsapi.media.h5(lVar, i17, this));
    }
}
