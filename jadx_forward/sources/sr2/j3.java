package sr2;

/* loaded from: classes10.dex */
public final class j3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry2.r0 f493136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f493137f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6, ry2.r0 r0Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var) {
        super(0);
        this.f493135d = c14609xb4d6eef6;
        this.f493136e = r0Var;
        this.f493137f = g0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6 = this.f493135d;
        ry2.o k76 = c14609xb4d6eef6.k7();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c14609xb4d6eef6.m158354x19263085();
        java.lang.String T6 = c14609xb4d6eef6.F7().T6();
        ry2.r0 r0Var = this.f493136e;
        java.util.ArrayList c17 = c14609xb4d6eef6.F7().d7().b().c();
        aw2.a aVar = c14609xb4d6eef6.f204060s;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("activityWidget");
            throw null;
        }
        r45.xl2 m62018x7e2fdd15 = aVar.f96253g.m62018x7e2fdd15();
        java.util.LinkedList i76 = c14609xb4d6eef6.i7();
        long j17 = this.f493137f.f391654d;
        java.lang.String str = (java.lang.String) ((jz5.n) c14609xb4d6eef6.R).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "access$getVstId(...)");
        long b17 = k76.b(m158354x19263085, T6, r0Var, c17, m62018x7e2fdd15, i76, j17, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostUI", "ready to post");
        dq.b b18 = cq.k1.b();
        r45.t11 t11Var = this.f493136e.f483013r;
        b18.c(t11Var != null ? t11Var.m75945x2fec8307(0) : null);
        b18.b(null);
        if (!c14609xb4d6eef6.k7().R) {
            pm0.v.X(new sr2.s3(c14609xb4d6eef6, b17, 0L));
        }
        return jz5.f0.f384359a;
    }
}
