package l0;

/* loaded from: classes14.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f395688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f395689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f395690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f395691g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(java.lang.Object obj, l0.a3 a3Var, yz5.l lVar, n0.v2 v2Var) {
        super(1);
        this.f395688d = obj;
        this.f395689e = a3Var;
        this.f395690f = lVar;
        this.f395691g = v2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        l0.a3 a3Var = this.f395689e;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f395688d, a3Var.b())) {
            this.f395690f.mo146xb9724478(a3Var.b());
            this.f395691g.mo148714x53d8522f(java.lang.Boolean.valueOf(!((java.lang.Boolean) r3.mo128745x754a37bb()).booleanValue()));
        }
        return new l0.d2();
    }
}
