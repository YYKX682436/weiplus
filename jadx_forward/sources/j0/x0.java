package j0;

/* loaded from: classes14.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.g0 f378163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f378164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f378165f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(g2.g0 g0Var, j0.c5 c5Var, k0.y0 y0Var) {
        super(1);
        this.f378163d = g0Var;
        this.f378164e = c5Var;
        this.f378165f = y0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.z it = (s1.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        g2.g0 g0Var = this.f378163d;
        j0.c5 c5Var = this.f378164e;
        if (g0Var != null) {
            c5Var.f377771f = it;
            j0.v1 a17 = c5Var.a();
            j0.v1 v1Var = j0.v1.Selection;
            k0.y0 y0Var = this.f378165f;
            if (a17 == v1Var) {
                if (c5Var.f377774i) {
                    y0Var.n();
                } else {
                    y0Var.k();
                }
                boolean b17 = k0.c1.b(y0Var, true);
                ((n0.q4) c5Var.f377775j).mo148714x53d8522f(java.lang.Boolean.valueOf(b17));
                boolean b18 = k0.c1.b(y0Var, false);
                ((n0.q4) c5Var.f377776k).mo148714x53d8522f(java.lang.Boolean.valueOf(b18));
            } else if (c5Var.a() == j0.v1.Cursor) {
                boolean b19 = k0.c1.b(y0Var, true);
                ((n0.q4) c5Var.f377777l).mo148714x53d8522f(java.lang.Boolean.valueOf(b19));
            }
        }
        j0.d5 d5Var = c5Var.f377772g;
        if (d5Var != null) {
            d5Var.f377799b = it;
        }
        return jz5.f0.f384359a;
    }
}
