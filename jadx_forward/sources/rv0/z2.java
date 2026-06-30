package rv0;

/* loaded from: classes5.dex */
public final class z2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.r f481884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f481886f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(ex0.r rVar, rv0.n1 n1Var, rv0.o7 o7Var) {
        super(0);
        this.f481884d = rVar;
        this.f481885e = n1Var;
        this.f481886f = o7Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ex0.r rVar = this.f481884d;
        ex0.c cVar = rVar instanceof ex0.c ? (ex0.c) rVar : null;
        if (cVar != null) {
            yy0.m7 m7Var = (yy0.m7) this.f481885e.R6().O6();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.p3(m7Var, null), 3, null);
            float C = cVar.C() * 100;
            if (C < 0.0f) {
                C = 0.0f;
            }
            if (C > 100.0f) {
                C = 100.0f;
            }
            rv0.o7 o7Var = this.f481886f;
            o7Var.m163199x27f73e1c(C);
            o7Var.m163194x2c5e279f(cVar.D());
        }
        return jz5.f0.f384359a;
    }
}
