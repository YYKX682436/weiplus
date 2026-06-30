package rv0;

/* loaded from: classes5.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.d f481481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.r f481482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481483f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(rv0.d dVar, ex0.r rVar, rv0.n1 n1Var) {
        super(1);
        this.f481481d = dVar;
        this.f481482e = rVar;
        this.f481483f = n1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        this.f481481d.J();
        ex0.r rVar = this.f481482e;
        ex0.o oVar = rVar instanceof ex0.o ? (ex0.o) rVar : null;
        if (oVar != null) {
            oVar.E(floatValue);
            this.f481483f.p7().c7();
        }
        return jz5.f0.f384359a;
    }
}
