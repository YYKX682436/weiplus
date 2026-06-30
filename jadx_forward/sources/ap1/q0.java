package ap1;

/* loaded from: classes5.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.x0 f94262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j75.f f94263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ap1.w0 f94264f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(ap1.x0 x0Var, j75.f fVar, ap1.w0 w0Var) {
        super(1);
        this.f94262d = x0Var;
        this.f94263e = fVar;
        this.f94264f = w0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof ap1.a)) {
            ap1.x0 x0Var = this.f94262d;
            if (!x0Var.f94294d.isEmpty()) {
                this.f94263e.B3(new ap1.f2((ap1.p0) ((jz5.l) x0Var.f94294d.get(this.f94264f.f293480c)).f384367e, null, 2, null));
            }
        }
        return jz5.f0.f384359a;
    }
}
