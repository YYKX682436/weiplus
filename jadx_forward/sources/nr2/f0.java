package nr2;

/* loaded from: classes9.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.j0 f420719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ev2 f420720e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(nr2.j0 j0Var, r45.ev2 ev2Var) {
        super(1);
        this.f420719d = j0Var;
        this.f420720e = ev2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        nr2.j0 j0Var = this.f420719d;
        r45.ev2 ev2Var = this.f420720e;
        nr2.e0 e0Var = new nr2.e0(j0Var, ev2Var, userName);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        ot0.q qVar = new ot0.q();
        qVar.f430199i = 119;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        zy2.g gVar = new zy2.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev2Var, "<set-?>");
        gVar.f558916b = ev2Var;
        qVar.f(gVar);
        fc5.d dVar = new fc5.d();
        dVar.k(ot0.q.u(qVar, null, null));
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        android.app.Activity m80379x76847179 = j0Var.m80379x76847179();
        n13.t tVar = new n13.t();
        tVar.f415666a = e0Var;
        ((dk5.y) a0Var).wi(m80379x76847179, dVar, userName, tVar);
        return jz5.f0.f384359a;
    }
}
