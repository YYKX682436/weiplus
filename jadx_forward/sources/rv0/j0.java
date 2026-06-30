package rv0;

/* loaded from: classes5.dex */
public final class j0 implements fy0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481587b;

    public j0(rv0.n1 n1Var, ex0.a0 a0Var) {
        this.f481586a = n1Var;
        this.f481587b = a0Var;
    }

    @Override // fy0.b
    public void a(double d17, fy0.q source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        source.toString();
        int ordinal = source.ordinal();
        rv0.n1 n1Var = this.f481586a;
        if (ordinal == 1 || ordinal == 2) {
            p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.h0(this.f481586a, d17, this.f481587b, null), 3, null);
        } else if (ordinal == 3) {
            p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.i0(d17, this.f481587b, this.f481586a, null), 3, null);
        }
        rv0.j jVar = (rv0.j) n1Var.f150773i;
        if (jVar != null) {
            jVar.B((int) n1Var.r7().m47133x989ddf15());
        }
    }
}
