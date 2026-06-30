package mq0;

/* loaded from: classes7.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq0.s0 f412125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mq0.g0 f412126e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(mq0.s0 s0Var, mq0.g0 g0Var) {
        super(0);
        this.f412125d = s0Var;
        this.f412126e = g0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Collection values = this.f412125d.f412148d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6722xd1bec45a c6722xd1bec45a = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6722xd1bec45a) kz5.n0.Y(values);
        if (c6722xd1bec45a != null) {
            c6722xd1bec45a.p("JumpTo");
            java.lang.String str = c6722xd1bec45a.f140605h;
            if (str == null || str.length() == 0) {
                c6722xd1bec45a.q("");
            }
            java.lang.String str2 = c6722xd1bec45a.f140605h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getExtraJson(...)");
            org.json.JSONObject jSONObject = new org.json.JSONObject(r26.i0.t(str2, ";", ",", false));
            jSONObject.put("JumpTo", this.f412126e.name());
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            c6722xd1bec45a.q(r26.i0.t(jSONObject2, ",", ";", false));
            c6722xd1bec45a.l();
            java.lang.String n17 = c6722xd1bec45a.n();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicCardIndexSystemReporter", "jump, struct: ".concat(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, ", ", false)));
        }
        return jz5.f0.f384359a;
    }
}
