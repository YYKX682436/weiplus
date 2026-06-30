package ap1;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.x0 f12729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j75.f f12730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ap1.w0 f12731f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(ap1.x0 x0Var, j75.f fVar, ap1.w0 w0Var) {
        super(1);
        this.f12729d = x0Var;
        this.f12730e = fVar;
        this.f12731f = w0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof ap1.a)) {
            ap1.x0 x0Var = this.f12729d;
            if (!x0Var.f12761d.isEmpty()) {
                this.f12730e.B3(new ap1.f2((ap1.p0) ((jz5.l) x0Var.f12761d.get(this.f12731f.f211947c)).f302834e, null, 2, null));
            }
        }
        return jz5.f0.f302826a;
    }
}
