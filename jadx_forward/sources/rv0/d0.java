package rv0;

/* loaded from: classes5.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481498e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ex0.a0 a0Var, rv0.n1 n1Var) {
        super(1);
        this.f481497d = a0Var;
        this.f481498e = n1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ex0.j0 transitionVM = (ex0.j0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transitionVM, "transitionVM");
        ex0.a0 a0Var = this.f481497d;
        return java.lang.Boolean.valueOf((a0Var.r() == ax0.e.f96510f || a0Var.r() == ax0.e.f96511g) ? ((java.util.ArrayList) this.f481498e.A).contains(transitionVM) : false);
    }
}
