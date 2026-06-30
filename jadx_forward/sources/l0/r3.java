package l0;

/* loaded from: classes14.dex */
public final class r3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f396029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f396030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0.n f396031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0.m3 f396032g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f396033h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f396034i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(boolean z17, boolean z18, c0.n nVar, l0.m3 m3Var, float f17, float f18) {
        super(3);
        this.f396029d = z17;
        this.f396030e = z18;
        this.f396031f = nVar;
        this.f396032g = m3Var;
        this.f396033h = f17;
        this.f396034i = f18;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(1398930845);
        n0.e5 a17 = l0.t3.a(this.f396029d, this.f396030e, this.f396031f, this.f396032g, this.f396033h, this.f396034i, y0Var, 0);
        int i17 = z0.t.f550455q1;
        z0.p pVar = z0.p.f550454d;
        a0.k indicatorBorder = (a0.k) a17.mo128745x754a37bb();
        float f17 = l0.m4.f395913a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(indicatorBorder, "indicatorBorder");
        z0.t c17 = b1.j.c(pVar, new l0.l4(indicatorBorder.f81725a, indicatorBorder));
        y0Var.o(false);
        return c17;
    }
}
