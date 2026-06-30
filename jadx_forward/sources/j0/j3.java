package j0;

/* loaded from: classes14.dex */
public final class j3 implements n0.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final j0.f5 f377915d;

    /* renamed from: e, reason: collision with root package name */
    public j0.l3 f377916e;

    /* renamed from: f, reason: collision with root package name */
    public final s1.t0 f377917f;

    /* renamed from: g, reason: collision with root package name */
    public final z0.t f377918g;

    /* renamed from: h, reason: collision with root package name */
    public z0.t f377919h;

    /* renamed from: i, reason: collision with root package name */
    public z0.t f377920i;

    public j3(j0.f5 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f377915d = state;
        this.f377917f = new j0.g3(this);
        z0.p pVar = z0.p.f550454d;
        this.f377918g = s1.h1.a(b1.j.a(e1.d0.b(pVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65535, null), new j0.e3(this)), new j0.b3(this));
        this.f377919h = y1.t.b(pVar, false, new j0.d3(state.f377821a.f377936a, this));
        this.f377920i = pVar;
    }

    public static final boolean a(j0.j3 j3Var, long j17, long j18) {
        a2.k1 k1Var = j3Var.f377915d.f377825e;
        if (k1Var != null) {
            int length = k1Var.f82298a.f82287a.f82214d.length();
            int l17 = k1Var.l(j17);
            int l18 = k1Var.l(j18);
            int i17 = length - 1;
            if (l17 >= i17 && l18 >= i17) {
                return true;
            }
            if (l17 < 0 && l18 < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.e4
    public void b() {
    }

    @Override // n0.e4
    public void c() {
        this.f377915d.getClass();
    }

    @Override // n0.e4
    public void d() {
        this.f377915d.getClass();
    }

    public final void e(k0.i0 i0Var) {
        z0.t tVar = z0.p.f550454d;
        if (i0Var != null) {
            j0.h3 h3Var = new j0.h3(this, i0Var);
            this.f377916e = h3Var;
            tVar = p1.x0.b(tVar, h3Var, new j0.i3(this, null));
        }
        this.f377920i = tVar;
    }
}
