package rv0;

/* loaded from: classes5.dex */
public final class b3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f481468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.r f481469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481471g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(rv0.o7 o7Var, ex0.r rVar, rv0.n1 n1Var, ex0.a0 a0Var) {
        super(0);
        this.f481468d = o7Var;
        this.f481469e = rVar;
        this.f481470f = n1Var;
        this.f481471g = a0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rv0.o7 o7Var = this.f481468d;
        o7Var.J();
        ex0.r rVar = this.f481469e;
        ex0.c cVar = rVar instanceof ex0.c ? (ex0.c) rVar : null;
        if (cVar != null) {
            boolean z17 = !cVar.D();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = cVar.f338652p;
            c4181x2248e1a3.getClass();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
            if (D != null) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.I0(c4181x2248e1a3, z17, D);
            }
            o7Var.m163194x2c5e279f(z17);
            ex0.a0 a0Var = this.f481471g;
            rv0.n1 n1Var = this.f481470f;
            rv0.a4.a(a0Var, n1Var);
            n1Var.p7().c7();
        }
        return jz5.f0.f384359a;
    }
}
