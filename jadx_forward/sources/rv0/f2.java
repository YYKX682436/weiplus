package rv0;

/* loaded from: classes5.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.r f481527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f481528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.d f481529f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481530g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(ex0.r rVar, float f17, rv0.d dVar, rv0.n1 n1Var) {
        super(1);
        this.f481527d = rVar;
        this.f481528e = f17;
        this.f481529f = dVar;
        this.f481530g = n1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ex0.r rVar = this.f481527d;
        ex0.o oVar = rVar instanceof ex0.o ? (ex0.o) rVar : null;
        if (oVar != null) {
            oVar.E(this.f481528e);
        }
        this.f481529f.H();
        rv0.n1 n1Var = this.f481530g;
        p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.e2(n1Var, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
