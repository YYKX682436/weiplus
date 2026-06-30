package a0;

/* loaded from: classes14.dex */
public final class h3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f81697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.m3 f81698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f81699f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0.q1 f81700g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f81701h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(boolean z17, a0.m3 m3Var, boolean z18, b0.q1 q1Var, boolean z19) {
        super(3);
        this.f81697d = z17;
        this.f81698e = m3Var;
        this.f81699f = z18;
        this.f81700g = q1Var;
        this.f81701h = z19;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(1478351300);
        b0.c2 a17 = b0.d.a(y0Var, 0);
        y0Var.U(773894976);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i17 = n0.o.f415162a;
        if (y17 == n0.n.f415153a) {
            n0.o1 o1Var = new n0.o1(n0.d2.i(oz5.m.f431862d, y0Var));
            y0Var.g0(o1Var);
            y17 = o1Var;
        }
        y0Var.o(false);
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = ((n0.o1) y17).f415164d;
        y0Var.o(false);
        int i18 = z0.t.f550455q1;
        z0.p pVar = z0.p.f550454d;
        z0.t b17 = y1.t.b(pVar, false, new a0.g3(this.f81701h, this.f81697d, this.f81699f, this.f81698e, y0Var2));
        boolean z17 = this.f81697d;
        b0.y1 y1Var = z17 ? b0.y1.Vertical : b0.y1.Horizontal;
        boolean z18 = this.f81701h;
        boolean z19 = !z18;
        if ((y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k) == p2.s.Rtl) && !z17) {
            z19 = !z19;
        }
        a0.m3 m3Var = this.f81698e;
        z0.t k17 = a0.i3.b(b17, z17).k(b0.d3.b(pVar, m3Var, y1Var, a17, this.f81699f, z19, this.f81700g, m3Var.f81761b)).k(new a0.o3(m3Var, z18, z17, a17));
        y0Var.o(false);
        return k17;
    }
}
