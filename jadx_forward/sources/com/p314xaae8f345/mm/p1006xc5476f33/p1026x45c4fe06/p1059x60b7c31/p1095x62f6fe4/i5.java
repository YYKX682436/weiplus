package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class i5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f34485x366c91de = 36;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f34486x24728b = "chooseVideo";

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a5 f163384g;

    public i5() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_choosevideo_new, 1) > 0) {
            return;
        }
        this.f163384g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a5 a5Var = this.f163384g;
        if (a5Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a5Var);
            a5Var.A(lVar, jSONObject, i17);
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("compressed", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o7.f163499e.getClass();
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l7.f163463s0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String lowerCase = "ALBUM".toLowerCase();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        sb6.append(lowerCase);
        sb6.append(", ");
        java.lang.String lowerCase2 = "CAMERA".toLowerCase();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase2, "toLowerCase(...)");
        sb6.append(lowerCase2);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o7[] enums = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o7.m51099xcee59d22();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb7, "default");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enums, "enums");
        java.lang.String optString = jSONObject.optString("sourceType", sb7);
        int i19 = 0;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o7 o7Var : enums) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            java.lang.String lowerCase3 = o7Var.mo51085xfb82e301().toLowerCase();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase3, "toLowerCase(...)");
            if (r26.n0.B(optString, lowerCase3, false)) {
                i19 |= o7Var.h();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.k7.f163437e.getClass();
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l7.f163463s0;
        java.lang.String lowerCase4 = "BACK".toLowerCase();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase4, "toLowerCase(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.k7[] enums2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.k7.m51084xcee59d22();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enums2, "enums");
        java.lang.String optString2 = jSONObject.optString("camera", lowerCase4);
        int i28 = 0;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.k7 k7Var : enums2) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            java.lang.String lowerCase5 = k7Var.mo51085xfb82e301().toLowerCase();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase5, "toLowerCase(...)");
            if (r26.n0.B(optString2, lowerCase5, false)) {
                i28 |= k7Var.h();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.m7[] m7VarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.m7.f163475e;
        int optInt = jSONObject.optInt("maxDuration", 60);
        if (optInt <= 0) {
            lVar.a(i17, o("fail invalid maxDuration"));
            return;
        }
        pq5.g h17 = pq5.h.a().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t0(lVar, i19, i28, 2, !optBoolean, optInt, 1)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "$ui(...)");
        h17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.g5(lVar, i17, this, optBoolean));
        h17.s(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.h5(lVar, i17, this));
    }
}
