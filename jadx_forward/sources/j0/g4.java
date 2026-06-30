package j0;

/* loaded from: classes14.dex */
public final class g4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f377834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f377835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f377836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f377837g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f377838h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g2.v f377839i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j0.h5 f377840m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f377841n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(j0.c5 c5Var, k0.y0 y0Var, g2.e0 e0Var, boolean z17, boolean z18, g2.v vVar, j0.h5 h5Var, yz5.l lVar) {
        super(3);
        this.f377834d = c5Var;
        this.f377835e = y0Var;
        this.f377836f = e0Var;
        this.f377837g = z17;
        this.f377838h = z18;
        this.f377839i = vVar;
        this.f377840m = h5Var;
        this.f377841n = lVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(58482146);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        if (y17 == n0.n.f415153a) {
            y17 = new k0.i1();
            y0Var.g0(y17);
        }
        y0Var.o(false);
        j0.e4 e4Var = new j0.e4(this.f377834d, this.f377835e, this.f377836f, this.f377837g, this.f377838h, (k0.i1) y17, this.f377839i, this.f377840m, null, this.f377841n, 256, null);
        z0.p pVar = z0.p.f550454d;
        j0.f4 f4Var = new j0.f4(e4Var);
        t1.f fVar = n1.f.f415569a;
        z0.t a17 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.a(pVar, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d, new n1.d(f4Var, null));
        y0Var.o(false);
        return a17;
    }
}
