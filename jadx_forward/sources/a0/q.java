package a0;

/* loaded from: classes14.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f81802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y1.i f81804f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f81805g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z17, java.lang.String str, y1.i iVar, yz5.a aVar) {
        super(3);
        this.f81802d = z17;
        this.f81803e = str;
        this.f81804f = iVar;
        this.f81805g = aVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-756081143);
        int i17 = z0.t.f550455q1;
        z0.p pVar = z0.p.f550454d;
        a0.r1 r1Var = (a0.r1) y0Var.i(a0.v1.f81852a);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i18 = n0.o.f415162a;
        if (y17 == n0.n.f415153a) {
            y17 = new c0.p();
            y0Var.g0(y17);
        }
        y0Var.o(false);
        z0.t b17 = a0.d0.b(pVar, (c0.o) y17, r1Var, this.f81802d, this.f81803e, this.f81804f, this.f81805g);
        y0Var.o(false);
        return b17;
    }
}
