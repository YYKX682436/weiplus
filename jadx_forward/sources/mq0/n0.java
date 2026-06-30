package mq0;

/* loaded from: classes7.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq0.a f412120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f412122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f412123g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(mq0.a aVar, java.lang.String str, int i17, java.util.Map map) {
        super(0);
        this.f412120d = aVar;
        this.f412121e = str;
        this.f412122f = i17;
        this.f412123g = map;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6722xd1bec45a c6722xd1bec45a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6722xd1bec45a();
        mq0.a aVar = this.f412120d;
        c6722xd1bec45a.p(aVar.name());
        c6722xd1bec45a.f140601d = c6722xd1bec45a.b("BizScene", this.f412121e, true);
        c6722xd1bec45a.f140603f = aVar != mq0.a.f412046e ? 0 : 1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("GroupId", this.f412122f);
        for (java.util.Map.Entry entry : this.f412123g.entrySet()) {
            jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6722xd1bec45a.q(r26.i0.t(jSONObject2, ",", ";", false));
        c6722xd1bec45a.l();
        java.lang.String n17 = c6722xd1bec45a.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicCardIndexSystemReporter", "expt struct: ".concat(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, ", ", false)));
        return jz5.f0.f384359a;
    }
}
