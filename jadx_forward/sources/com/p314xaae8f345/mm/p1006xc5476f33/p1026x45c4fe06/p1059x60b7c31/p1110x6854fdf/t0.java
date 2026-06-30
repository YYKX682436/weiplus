package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f164766a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f164767b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f164768c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f164769d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f164770e;

    /* renamed from: f, reason: collision with root package name */
    public final int f164771f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f164772g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e f164773h;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 a1Var, org.json.JSONObject data, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y env) {
        com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e c11127xcc7d6e4e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        java.lang.String optString = data.optString("imagePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f164766a = optString;
        boolean optBoolean = data.optBoolean("needShowEntrance", false);
        this.f164767b = optBoolean;
        java.lang.String optString2 = data.optString("entrancePath");
        this.f164768c = optString2;
        java.lang.String optString3 = data.optString("chatroomUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
        this.f164769d = optString3;
        java.lang.String optString4 = data.optString("openId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "optString(...)");
        this.f164770e = optString4;
        java.lang.String optString5 = data.optString("quality", "compressed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString5, "optString(...)");
        this.f164771f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1.f164639h.a(optString5);
        if (env.t3() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) {
            if (optString2 == null || optString2.length() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = env.t3().x0().m52169xfdaa7672();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m52169xfdaa7672);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = m52169xfdaa7672.mo14682x9dee9c37();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo14682x9dee9c37, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.AppBrandPageViewWC");
                this.f164768c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.l0.e((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) mo14682x9dee9c37) ? m52169xfdaa7672.mo14683xad58292c() : "";
            }
            if (optBoolean) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = env.t3();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(t37, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) t37).E0();
                if ((E0 == null ? 1 : k91.a.f387059m.a(E0)) != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke fail, isPosterJumpBanned: true not show entrance");
                    this.f164767b = false;
                }
            }
        }
        if (this.f164767b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t38 = env.t3();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t38, "getRuntime(...)");
            java.lang.String str = this.f164768c;
            c11127xcc7d6e4e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.o2.a(t38, str != null ? str : "");
        } else {
            c11127xcc7d6e4e = null;
        }
        this.f164773h = c11127xcc7d6e4e;
    }

    /* renamed from: toString */
    public java.lang.String m51290x9616526c() {
        return "imagePath: " + this.f164766a + ", compressType: " + this.f164771f + " needEntrance: " + this.f164767b + ", entrancePath: " + this.f164768c + " chatroomUsername: " + this.f164769d + " openId: " + this.f164770e + " wxaInfo: " + this.f164773h;
    }
}
