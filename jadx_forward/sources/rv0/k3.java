package rv0;

/* loaded from: classes5.dex */
public final class k3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.f f481612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f481613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e f481614g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f481615h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f481616i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(rv0.n1 n1Var, rv0.f fVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e c4188xeef5596e, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2) {
        super(0);
        this.f481611d = n1Var;
        this.f481612e = fVar;
        this.f481613f = c4128x879fba0a;
        this.f481614g = c4188xeef5596e;
        this.f481615h = c4129xdee64553;
        this.f481616i = c4128x879fba0a2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rv0.n1 n1Var = this.f481611d;
        p012xc85e97e9.p093xedfae76a.g0 g0Var = ((gx0.gf) ((jz5.n) n1Var.f481668w).mo141623x754a37bb()).f358006f;
        p012xc85e97e9.p093xedfae76a.y W6 = n1Var.W6();
        rv0.f fVar = this.f481612e;
        g0Var.mo7806x9d92d11c(W6, new rv0.i3(fVar));
        fVar.m163158x2d0e9bc6(this.f481613f);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e c4188xeef5596e = this.f481614g;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 N1 = c4188xeef5596e.N1();
        if (N1 != null) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m34000xe1b2217e = c4188xeef5596e.B().m34000xe1b2217e(this.f481615h);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34000xe1b2217e, "calcIntersection(...)");
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = this.f481616i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4128x879fba0a);
            fVar.M = m34000xe1b2217e;
            fVar.N = c4128x879fba0a;
            android.widget.TextView textView = fVar.K;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("songNameTv");
                throw null;
            }
            textView.setText(N1.m33858xd75a8eb6());
        }
        p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.j3(n1Var, c4188xeef5596e, fVar, null), 3, null);
        return jz5.f0.f384359a;
    }
}
