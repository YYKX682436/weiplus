package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.b1 f267279a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.b1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f267280b;

    static {
        i95.n0.c(qk.g9.class);
        f267280b = new java.util.HashMap();
    }

    public final void a(java.util.HashMap retValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(retValue, "retValue");
        b66.h hVar = b66.i.f99700d;
        b66.g gVar = (b66.g) p3380x6a61f93.p3382xf513feca.C30532x21b415b4.m169657x21ba281f("webSearchStandAlone");
        if (gVar == null) {
            return;
        }
        b66.i iVar = (b66.i) gVar;
        b66.n a17 = iVar.a();
        bw5.lp0 g17 = a17 != null ? ((b66.q) a17).g() : null;
        b66.n a18 = iVar.a();
        if (a18 == null || g17 == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String b17 = g17.b();
        if (b17 == null) {
            b17 = "";
        }
        jSONObject.put("srcId", b17);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        retValue.put("item", jSONObject2);
        retValue.put("currentTime", java.lang.Long.valueOf(a18.m()));
        retValue.put("buffered", java.lang.Long.valueOf(a18.E()));
        retValue.put("duration", java.lang.Long.valueOf(a18.k()));
        retValue.put("playRate", java.lang.Float.valueOf(a18.h()));
        retValue.put("status", rk4.m.f478367a.a(qk.ia.f445702e.a(a18.i())));
    }
}
