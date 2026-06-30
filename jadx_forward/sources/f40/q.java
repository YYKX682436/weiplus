package f40;

/* loaded from: classes12.dex */
public final class q implements w65.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f340979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e40.y f340980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f340981f;

    public q(java.util.Map map, e40.y yVar, yz5.p pVar) {
        this.f340979d = map;
        this.f340980e = yVar;
        this.f340981f = pVar;
    }

    @Override // w65.o
    public void P2(w65.p event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.String str = this.f340980e.f329161a;
        java.util.Map map = this.f340979d;
        e40.b0 b0Var = (e40.b0) map.get(str);
        if (b0Var != null) {
            e40.a0 a17 = e40.a0.f329135e.a(event);
            if (a17 == null) {
                a17 = b0Var.f329145a;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<set-?>");
            b0Var.f329145a = a17;
            b0Var.f329146b = java.lang.Float.valueOf(event.f524898d);
        }
        yz5.p pVar = this.f340981f;
        if (pVar != null) {
            pVar.mo149xb9724478(map, java.lang.Boolean.FALSE);
        }
    }
}
