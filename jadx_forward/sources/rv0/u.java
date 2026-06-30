package rv0;

/* loaded from: classes5.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 f481796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.j f481797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.c f481798g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(rv0.n1 n1Var, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 c4132xa482ea73, rv0.j jVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.c cVar) {
        super(0);
        this.f481795d = n1Var;
        this.f481796e = c4132xa482ea73;
        this.f481797f = jVar;
        this.f481798g = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mv0.b bVar;
        rv0.n1 n1Var = this.f481795d;
        n1Var.o7().q7((float) this.f481796e.f129896b, this.f481797f.mo47066x10b53b15());
        ex0.a0 s76 = n1Var.s7();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.c cVar = (s76 == null || (bVar = s76.f338628e) == null) ? null : bVar.f413063a;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.c cVar2 = this.f481798g;
        mv0.b bVar2 = new mv0.b(cVar2, cVar2 == cVar);
        gx0.kh q76 = n1Var.q7();
        q76.getClass();
        ex0.a0 a0Var = q76.f358175r;
        if (a0Var != null) {
            a0Var.f338636m = bVar2;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 a17 = com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73.a(bVar2.f413063a);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o76 = q76.o7();
        if (o76 != null) {
            o76.C(a17);
        }
        p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.t(n1Var, null), 3, null);
        return jz5.f0.f384359a;
    }
}
