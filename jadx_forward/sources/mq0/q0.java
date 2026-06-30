package mq0;

/* loaded from: classes7.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq0.a f412133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mq0.s0 f412134e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412135f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412136g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412137h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f412138i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412139m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f412140n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(mq0.a aVar, mq0.s0 s0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String str4, java.util.Map map) {
        super(0);
        this.f412133d = aVar;
        this.f412134e = s0Var;
        this.f412135f = str;
        this.f412136g = str2;
        this.f412137h = str3;
        this.f412138i = z17;
        this.f412139m = str4;
        this.f412140n = map;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mq0.a aVar = mq0.a.f412047f;
        java.lang.String str = this.f412135f;
        mq0.s0 s0Var = this.f412134e;
        mq0.a aVar2 = this.f412133d;
        if ((aVar2 != aVar || !s0Var.f412148d.containsKey(str)) && (aVar2 != mq0.a.f412048g || s0Var.f412148d.containsKey(str))) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6722xd1bec45a c6722xd1bec45a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6722xd1bec45a();
            c6722xd1bec45a.p(aVar2.name());
            c6722xd1bec45a.f140601d = c6722xd1bec45a.b("BizScene", this.f412136g, true);
            c6722xd1bec45a.f140602e = c6722xd1bec45a.b("BizSubScene", this.f412137h, true);
            c6722xd1bec45a.f140603f = this.f412138i ? 1 : 0;
            c6722xd1bec45a.f140606i = c6722xd1bec45a.b("TraceId", this.f412139m, true);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : this.f412140n.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            c6722xd1bec45a.q(r26.i0.t(jSONObject2, ",", ";", false));
            c6722xd1bec45a.l();
            if (aVar2 == mq0.a.f412047f) {
                s0Var.f412148d.put(str, c6722xd1bec45a);
            } else if (aVar2 == mq0.a.f412048g) {
                s0Var.f412148d.remove(str);
            }
            java.lang.String n17 = c6722xd1bec45a.n();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicCardIndexSystemReporter", "report struct: ".concat(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, ", ", false)));
        }
        return jz5.f0.f384359a;
    }
}
