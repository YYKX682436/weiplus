package u1;

/* loaded from: classes14.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final u1.w f505206a;

    /* renamed from: b, reason: collision with root package name */
    public n0.v2 f505207b;

    /* renamed from: c, reason: collision with root package name */
    public s1.t0 f505208c;

    public v(u1.w layoutNode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutNode, "layoutNode");
        this.f505206a = layoutNode;
    }

    public final s1.t0 a() {
        n0.v2 v2Var = this.f505207b;
        if (v2Var == null) {
            s1.t0 t0Var = this.f505208c;
            if (t0Var == null) {
                throw new java.lang.IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
            }
            v2Var = n0.s4.c(t0Var, null, 2, null);
        }
        this.f505207b = v2Var;
        return (s1.t0) v2Var.mo128745x754a37bb();
    }
}
