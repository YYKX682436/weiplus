package gx0;

/* loaded from: classes5.dex */
public final class wa implements fy0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f358661b;

    public wa(gx0.ac acVar, ex0.a0 a0Var) {
        this.f358660a = acVar;
        this.f358661b = a0Var;
    }

    @Override // fy0.b
    public void a(double d17, fy0.q source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        int ordinal = source.ordinal();
        gx0.ac acVar = this.f358660a;
        if (ordinal == 1 || ordinal == 2) {
            p3325xe03a0797.p3326xc267989b.l.d(acVar.m158345xefc66565(), null, null, new gx0.ua(this.f358660a, d17, this.f358661b, null), 3, null);
        } else if (ordinal == 3) {
            p3325xe03a0797.p3326xc267989b.l.d(acVar.m158345xefc66565(), null, null, new gx0.va(d17, this.f358661b, this.f358660a, null), 3, null);
        }
        cw0.d dVar = (cw0.d) acVar.f150773i;
        if (dVar != null) {
            dVar.C(d17);
        }
        acVar.i8();
    }
}
