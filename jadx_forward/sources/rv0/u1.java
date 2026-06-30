package rv0;

/* loaded from: classes5.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv0.g f481801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f481803f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(xv0.g gVar, rv0.n1 n1Var, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3) {
        super(1);
        this.f481801d = gVar;
        this.f481802e = n1Var;
        this.f481803f = c4181x2248e1a3;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        xv0.g gVar = this.f481801d;
        boolean m160994x67ad68cc = gVar.m160994x67ad68cc();
        rv0.n1 n1Var = this.f481802e;
        if (m160994x67ad68cc) {
            gx0.kh q76 = n1Var.q7();
            java.lang.String string = gVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574041lm2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
        gVar.D = false;
        du0.v0 R6 = n1Var.R6();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f481803f;
        R6.T6(c4181x2248e1a3.p1(), c4181x2248e1a3.r1(), c4181x2248e1a3.t1(), c4181x2248e1a3.w1(), c4181x2248e1a3.y1(), c4181x2248e1a3.u1());
        return java.lang.Boolean.TRUE;
    }
}
