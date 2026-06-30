package n3;

/* loaded from: classes14.dex */
public class d3 {

    /* renamed from: b, reason: collision with root package name */
    public static final n3.g3 f415861b;

    /* renamed from: a, reason: collision with root package name */
    public final n3.g3 f415862a;

    static {
        int i17 = android.os.Build.VERSION.SDK_INT;
        f415861b = (i17 >= 30 ? new n3.w2() : i17 >= 29 ? new n3.v2() : new n3.u2()).b().f415871a.a().f415871a.b().f415871a.c();
    }

    public d3(n3.g3 g3Var) {
        this.f415862a = g3Var;
    }

    public n3.g3 a() {
        return this.f415862a;
    }

    public n3.g3 b() {
        return this.f415862a;
    }

    public n3.g3 c() {
        return this.f415862a;
    }

    public void d(android.view.View view) {
    }

    public void e(n3.g3 g3Var) {
    }

    /* renamed from: equals */
    public boolean mo148918xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3.d3)) {
            return false;
        }
        n3.d3 d3Var = (n3.d3) obj;
        return o() == d3Var.o() && n() == d3Var.n() && m3.c.a(l(), d3Var.l()) && m3.c.a(j(), d3Var.j()) && m3.c.a(f(), d3Var.f());
    }

    public n3.l f() {
        return null;
    }

    public e3.d g(int i17) {
        return e3.d.f328576e;
    }

    public e3.d h(int i17) {
        if ((i17 & 8) == 0) {
            return e3.d.f328576e;
        }
        throw new java.lang.IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    /* renamed from: hashCode */
    public int mo148919x8cdac1b() {
        return m3.c.b(java.lang.Boolean.valueOf(o()), java.lang.Boolean.valueOf(n()), l(), j(), f());
    }

    public e3.d i() {
        return l();
    }

    public e3.d j() {
        return e3.d.f328576e;
    }

    public e3.d k() {
        return l();
    }

    public e3.d l() {
        return e3.d.f328576e;
    }

    public e3.d m() {
        return l();
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i17) {
        return true;
    }

    public void q(e3.d[] dVarArr) {
    }

    public void r(e3.d dVar) {
    }

    public void s(n3.g3 g3Var) {
    }

    public void t(e3.d dVar) {
    }
}
