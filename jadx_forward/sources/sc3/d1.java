package sc3;

/* loaded from: classes7.dex */
public final class d1 implements yg.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487971b;

    public d1(sc3.k1 k1Var, java.lang.String str) {
        this.f487970a = k1Var;
        this.f487971b = str;
    }

    @Override // yg.a0
    public void a(java.lang.String exception, java.lang.String stack, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exception, "exception");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stack, "stack");
        this.f487970a.X0(exception, stack, this.f487971b);
    }

    @Override // yg.a0
    public void c(java.lang.String output) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(output, "output");
        this.f487970a.H0().Ke(r26.p0.E0(output, 500000));
    }
}
