package mq0;

/* loaded from: classes7.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f412128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f412129f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412130g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, java.lang.String str2) {
        super(0);
        this.f412127d = str;
        this.f412128e = h0Var;
        this.f412129f = h0Var2;
        this.f412130g = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6722xd1bec45a c6722xd1bec45a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6722xd1bec45a();
        c6722xd1bec45a.p(this.f412127d);
        c6722xd1bec45a.f140601d = c6722xd1bec45a.b("BizScene", (java.lang.String) this.f412128e.f391656d, true);
        c6722xd1bec45a.f140603f = 2;
        c6722xd1bec45a.f140606i = c6722xd1bec45a.b("TraceId", (java.lang.String) this.f412129f.f391656d, true);
        java.lang.String str = this.f412130g;
        c6722xd1bec45a.q(str != null ? r26.i0.t(str, ",", ";", false) : null);
        c6722xd1bec45a.f140607j = c6722xd1bec45a.b("ReportSource", "native", true);
        c6722xd1bec45a.k();
        java.lang.String n17 = c6722xd1bec45a.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicCardIndexSystemReporter", "mediaEvent, struct: ".concat(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, ", ", false)));
        return jz5.f0.f384359a;
    }
}
