package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes9.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 f203986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f203987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ev2 f203988f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var, android.content.Context context, r45.ev2 ev2Var) {
        super(1);
        this.f203986d = l0Var;
        this.f203987e = context;
        this.f203988f = ev2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        android.content.Context context = this.f203987e;
        r45.ev2 ev2Var = this.f203988f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var = this.f203986d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s(context, ev2Var, l0Var, username);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        ot0.q qVar = new ot0.q();
        qVar.f430199i = l0Var.w() ? 119 : 120;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        zy2.g gVar = new zy2.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev2Var, "<set-?>");
        gVar.f558916b = ev2Var;
        qVar.f(gVar);
        fc5.d dVar = new fc5.d();
        dVar.k(ot0.q.u(qVar, null, null));
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        n13.t tVar = new n13.t();
        tVar.f415666a = sVar;
        ((dk5.y) a0Var).wi(context, dVar, username, tVar);
        l0Var.x("quick_forward_avatar", true, username);
        return jz5.f0.f384359a;
    }
}
