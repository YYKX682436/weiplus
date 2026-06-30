package a0;

/* loaded from: classes14.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0.f f303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f304g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f305h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c0.o f306i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(kotlinx.coroutines.y0 y0Var, n0.v2 v2Var, g0.f fVar, n0.v2 v2Var2, n0.v2 v2Var3, c0.o oVar) {
        super(1);
        this.f301d = y0Var;
        this.f302e = v2Var;
        this.f303f = fVar;
        this.f304g = v2Var2;
        this.f305h = v2Var3;
        this.f306i = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        c1.i0 it = (c1.i0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((c1.j0) it).i());
        n0.v2 v2Var = this.f302e;
        v2Var.setValue(valueOf);
        boolean a17 = a0.v0.a(v2Var);
        c0.o oVar = this.f306i;
        n0.v2 v2Var2 = this.f305h;
        if (a17) {
            kotlinx.coroutines.l.d(this.f301d, null, kotlinx.coroutines.a1.UNDISPATCHED, new a0.r0(this.f303f, this.f304g, null), 1, null);
            kotlinx.coroutines.l.d(this.f301d, null, null, new a0.s0(v2Var2, oVar, null), 3, null);
        } else {
            kotlinx.coroutines.l.d(this.f301d, null, null, new a0.t0(v2Var2, oVar, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
