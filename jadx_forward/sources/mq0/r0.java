package mq0;

/* loaded from: classes7.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f412142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f412143f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412144g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, java.lang.String str2) {
        super(0);
        this.f412141d = str;
        this.f412142e = h0Var;
        this.f412143f = h0Var2;
        this.f412144g = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6722xd1bec45a c6722xd1bec45a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6722xd1bec45a();
        c6722xd1bec45a.p("thumbplayer_" + this.f412141d);
        c6722xd1bec45a.f140601d = c6722xd1bec45a.b("BizScene", (java.lang.String) this.f412142e.f391656d, true);
        c6722xd1bec45a.f140603f = 1;
        c6722xd1bec45a.f140606i = c6722xd1bec45a.b("TraceId", (java.lang.String) this.f412143f.f391656d, true);
        java.lang.String str = this.f412144g;
        if (str == null || str.length() == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.System.currentTimeMillis());
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            c6722xd1bec45a.q(r26.i0.t(jSONObject2, ",", ";", false));
        } else {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject(str);
            jSONObject3.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.System.currentTimeMillis());
            java.lang.String jSONObject4 = jSONObject3.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            c6722xd1bec45a.q(r26.i0.t(jSONObject4, ",", ";", false));
        }
        c6722xd1bec45a.f140607j = c6722xd1bec45a.b("ReportSource", "native", true);
        c6722xd1bec45a.k();
        java.lang.String n17 = c6722xd1bec45a.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_event", "thumbPlayerEvent, struct: ".concat(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, ", ", false)));
        return jz5.f0.f384359a;
    }
}
