package ty0;

/* loaded from: classes14.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f504398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f504399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f504400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f504401g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f504402h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z17, n0.v2 v2Var, yz5.q qVar, n0.v2 v2Var2, long j17) {
        super(2);
        this.f504398d = z17;
        this.f504399e = v2Var;
        this.f504400f = qVar;
        this.f504401g = v2Var2;
        this.f504402h = j17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        s1.l2 l2Var;
        n0.v2 v2Var;
        s1.l2 SubcomposeLayout = (s1.l2) obj;
        long j17 = ((p2.c) obj2).f432910a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(SubcomposeLayout, "$this$SubcomposeLayout");
        long a17 = p2.c.a(j17, 0, Integer.MAX_VALUE, 0, 0, 13, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        ty0.d dVar = ty0.d.f504345d;
        yz5.q qVar = this.f504400f;
        s1.l0 l0Var = (s1.l0) SubcomposeLayout;
        s1.o1 m17 = ((s1.r0) kz5.n0.X(l0Var.b(dVar, u0.j.c(-1839527020, true, new ty0.k(qVar))))).m(a17);
        h0Var.f391656d = m17;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        boolean z17 = this.f504398d;
        n0.v2 v2Var2 = this.f504401g;
        n0.v2 v2Var3 = this.f504399e;
        if (!z17 || m17.f483583d > p2.c.h(j17)) {
            int h17 = (p2.c.h(j17) * 2) / 3;
            l2Var = SubcomposeLayout;
            v2Var3.mo148714x53d8522f(new ty0.j1(((s1.o1) h0Var.f391656d).f483583d + h17, p2.c.h(j17)));
            int intValue = ((s1.o1) h0Var.f391656d).f483583d + ((java.lang.Number) v2Var2.mo128745x754a37bb()).intValue() + h17;
            if (p2.c.h(j17) - intValue > 0) {
                h0Var3.f391656d = new jz5.l(((s1.r0) kz5.n0.X(l0Var.b(ty0.d.f504346e, u0.j.c(-1548098074, true, new ty0.h(qVar))))).m(a17), java.lang.Integer.valueOf(intValue));
            }
            v2Var = v2Var2;
            h0Var2.f391656d = ((s1.r0) kz5.n0.X(l0Var.b(ty0.d.f504347f, u0.j.c(1354852161, true, new ty0.i(this.f504402h))))).m(p2.c.a(j17, 0, 0, 0, ((s1.o1) h0Var.f391656d).f483584e, 7, null));
        } else {
            h0Var.f391656d = ((s1.r0) kz5.n0.X(l0Var.b(ty0.d.f504346e, u0.j.c(549271310, true, new ty0.g(qVar))))).m(j17);
            v2Var3.mo148714x53d8522f(null);
            l2Var = SubcomposeLayout;
            v2Var = v2Var2;
        }
        return s1.v0.b(l2Var, p2.c.h(j17), ((s1.o1) h0Var.f391656d).f483584e, null, new ty0.j(h0Var, h0Var3, h0Var2, v2Var), 4, null);
    }
}
