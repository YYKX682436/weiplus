package a0;

/* loaded from: classes14.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f81834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f81835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0.f f81836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f81837g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f81838h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c0.o f81839i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(p3325xe03a0797.p3326xc267989b.y0 y0Var, n0.v2 v2Var, g0.f fVar, n0.v2 v2Var2, n0.v2 v2Var3, c0.o oVar) {
        super(1);
        this.f81834d = y0Var;
        this.f81835e = v2Var;
        this.f81836f = fVar;
        this.f81837g = v2Var2;
        this.f81838h = v2Var3;
        this.f81839i = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        c1.i0 it = (c1.i0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((c1.j0) it).i());
        n0.v2 v2Var = this.f81835e;
        v2Var.mo148714x53d8522f(valueOf);
        boolean a17 = a0.v0.a(v2Var);
        c0.o oVar = this.f81839i;
        n0.v2 v2Var2 = this.f81838h;
        if (a17) {
            p3325xe03a0797.p3326xc267989b.l.d(this.f81834d, null, p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED, new a0.r0(this.f81836f, this.f81837g, null), 1, null);
            p3325xe03a0797.p3326xc267989b.l.d(this.f81834d, null, null, new a0.s0(v2Var2, oVar, null), 3, null);
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(this.f81834d, null, null, new a0.t0(v2Var2, oVar, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
