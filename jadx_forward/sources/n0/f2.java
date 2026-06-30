package n0;

/* loaded from: classes14.dex */
public final class f2 implements y0.b, java.lang.Iterable, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.g2 f415039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f415040e;

    public f2(n0.g2 g2Var, int i17) {
        this.f415039d = g2Var;
        this.f415040e = i17;
    }

    @Override // y0.a
    public java.lang.Iterable d() {
        return this;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        n0.g2 g2Var = this.f415039d;
        g2Var.b();
        n0.k4 k4Var = g2Var.f415044d;
        int i17 = this.f415040e;
        return new n0.g2(k4Var, i17 + 1, i17 + n0.l4.c(k4Var.f415123d, i17));
    }
}
