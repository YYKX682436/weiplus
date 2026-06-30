package ib2;

/* loaded from: classes9.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.w f371677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ev2 f371678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ib2.w wVar, r45.ev2 ev2Var) {
        super(1);
        this.f371677d = wVar;
        this.f371678e = ev2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        ib2.w wVar = this.f371677d;
        r45.ev2 ev2Var = this.f371678e;
        ib2.m mVar = new ib2.m(wVar, ev2Var, username);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        ot0.q qVar = new ot0.q();
        qVar.f430199i = 120;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        zy2.g gVar = new zy2.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev2Var, "<set-?>");
        gVar.f558916b = ev2Var;
        qVar.f(gVar);
        fc5.d dVar = new fc5.d();
        dVar.k(ot0.q.u(qVar, null, null));
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        android.app.Activity m80379x76847179 = wVar.m80379x76847179();
        n13.t tVar = new n13.t();
        tVar.f415666a = mVar;
        ((dk5.y) a0Var).wi(m80379x76847179, dVar, username, tVar);
        java.util.Map P6 = wVar.P6(username);
        if (P6 != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("quick_forward_avatar", "view_clk", P6, 1, false);
        }
        return jz5.f0.f384359a;
    }
}
