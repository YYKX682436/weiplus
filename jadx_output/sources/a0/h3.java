package a0;

/* loaded from: classes14.dex */
public final class h3 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.m3 f165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f166f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0.q1 f167g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f168h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(boolean z17, a0.m3 m3Var, boolean z18, b0.q1 q1Var, boolean z19) {
        super(3);
        this.f164d = z17;
        this.f165e = m3Var;
        this.f166f = z18;
        this.f167g = q1Var;
        this.f168h = z19;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(1478351300);
        b0.c2 a17 = b0.d.a(y0Var, 0);
        y0Var.U(773894976);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i17 = n0.o.f333629a;
        if (y17 == n0.n.f333620a) {
            n0.o1 o1Var = new n0.o1(n0.d2.i(oz5.m.f350329d, y0Var));
            y0Var.g0(o1Var);
            y17 = o1Var;
        }
        y0Var.o(false);
        kotlinx.coroutines.y0 y0Var2 = ((n0.o1) y17).f333631d;
        y0Var.o(false);
        int i18 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        z0.t b17 = y1.t.b(pVar, false, new a0.g3(this.f168h, this.f164d, this.f166f, this.f165e, y0Var2));
        boolean z17 = this.f164d;
        b0.y1 y1Var = z17 ? b0.y1.Vertical : b0.y1.Horizontal;
        boolean z18 = this.f168h;
        boolean z19 = !z18;
        if ((y0Var.i(androidx.compose.ui.platform.m2.f10652k) == p2.s.Rtl) && !z17) {
            z19 = !z19;
        }
        a0.m3 m3Var = this.f165e;
        z0.t k17 = a0.i3.b(b17, z17).k(b0.d3.b(pVar, m3Var, y1Var, a17, this.f166f, z19, this.f167g, m3Var.f228b)).k(new a0.o3(m3Var, z18, z17, a17));
        y0Var.o(false);
        return k17;
    }
}
