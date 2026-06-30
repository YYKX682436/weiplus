package a0;

/* loaded from: classes14.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y1.i f271f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f272g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z17, java.lang.String str, y1.i iVar, yz5.a aVar) {
        super(3);
        this.f269d = z17;
        this.f270e = str;
        this.f271f = iVar;
        this.f272g = aVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-756081143);
        int i17 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        a0.r1 r1Var = (a0.r1) y0Var.i(a0.v1.f319a);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i18 = n0.o.f333629a;
        if (y17 == n0.n.f333620a) {
            y17 = new c0.p();
            y0Var.g0(y17);
        }
        y0Var.o(false);
        z0.t b17 = a0.d0.b(pVar, (c0.o) y17, r1Var, this.f269d, this.f270e, this.f271f, this.f272g);
        y0Var.o(false);
        return b17;
    }
}
