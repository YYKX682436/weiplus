package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class hb0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f194326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f194327e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb0(java.lang.String str, int i17) {
        super(0);
        this.f194326d = str;
        this.f194327e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String q07 = r26.n0.q0(this.f194326d, ".flv?", "no flv!");
        new cz2.h();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6589xda6addba c6589xda6addba = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6589xda6addba();
        c6589xda6addba.f139405d = 8;
        c6589xda6addba.f139406e = 10002L;
        c6589xda6addba.f139407f = c6589xda6addba.b("actionName", "finderlive_switchstream", true);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("ver", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g);
        jSONObject.put("ver_init", lp0.a.f401782c);
        java.lang.String format = java.lang.String.format("%08x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f424562g)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        jSONObject.put("CLIENT_VERSION", format);
        jSONObject.put("tag", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a);
        jSONObject.put("rev", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
        jSONObject.put("switchUrl", q07);
        jSONObject.put("switchRet", this.f194327e);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6589xda6addba.f139408g = c6589xda6addba.b("actionExt", r26.i0.t(jSONObject2, ",", ";", false), true);
        c6589xda6addba.f139414m = c01.id.a();
        c6589xda6addba.f139409h = 0;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.a();
        jSONObject3.put("result", a17 != null ? r26.i0.t(a17, "\n", ";", false) : null);
        java.lang.String jSONObject4 = jSONObject3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        c6589xda6addba.f139410i = c6589xda6addba.b("resultExt", r26.i0.t(jSONObject4, ",", ";", false), true);
        c6589xda6addba.f139411j = 0;
        c6589xda6addba.f139413l = 0L;
        m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
        if (I1 == null || (str = I1.f68710x21f9b213) == null) {
            str = "";
        }
        c6589xda6addba.f139412k = c6589xda6addba.b("snn", str, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cz2.h.f306539b, "report value " + c6589xda6addba.n());
        c6589xda6addba.k();
        return jz5.f0.f384359a;
    }
}
