package rv0;

/* loaded from: classes5.dex */
public final class r6 implements fy0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f481757a;

    public r6(rv0.z6 z6Var) {
        this.f481757a = z6Var;
    }

    @Override // fy0.b
    public void a(double d17, fy0.q source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        rv0.z6 z6Var = this.f481757a;
        z6Var.o7().invalidate();
        if (source == fy0.q.f348753d) {
            return;
        }
        boolean z17 = source == fy0.q.f348755f;
        rv0.z6 z6Var2 = this.f481757a;
        pf5.e.m158344xbe96bc24(z6Var2, null, null, new rv0.q6(z6Var2, z17, null), 3, null);
        rv0.z6.k7(z6Var);
        rv0.o5 o5Var = (rv0.o5) z6Var.f150773i;
        if (o5Var != null) {
            o5Var.J();
        }
    }
}
