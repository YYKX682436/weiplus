package a0;

/* loaded from: classes14.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f81646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.a1 f81647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1.r f81648f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(float f17, e1.a1 a1Var, e1.r rVar) {
        super(3);
        this.f81646d = f17;
        this.f81647e = a1Var;
        this.f81648f = rVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-1498088849);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i17 = n0.o.f415162a;
        if (y17 == n0.n.f415153a) {
            y17 = new u1.y1();
            y0Var.g0(y17);
        }
        y0Var.o(false);
        int i18 = z0.t.f550455q1;
        z0.p pVar = z0.p.f550454d;
        e1.r rVar = this.f81648f;
        z0.t k17 = composed.k(b1.j.b(pVar, new a0.d(this.f81646d, this.f81647e, (u1.y1) y17, rVar)));
        y0Var.o(false);
        return k17;
    }
}
