package rv0;

/* loaded from: classes5.dex */
public final class s3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.r f481768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f481769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.f f481770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481771g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(ex0.r rVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, rv0.f fVar, rv0.n1 n1Var) {
        super(1);
        this.f481768d = rVar;
        this.f481769e = c4128x879fba0a;
        this.f481770f = fVar;
        this.f481771g = n1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = this.f481768d.f338700a;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e c4188xeef5596e = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e) c4190xd8dd3713 : null;
        if (c4188xeef5596e != null) {
            c4188xeef5596e.u0(this.f481769e);
        }
        this.f481770f.H();
        rv0.n1 n1Var = this.f481771g;
        p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.r3(n1Var, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
