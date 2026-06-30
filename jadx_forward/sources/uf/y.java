package uf;

/* loaded from: classes7.dex */
public final class y implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f508659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f508660b;

    public y(uf.o0 o0Var, int i17) {
        this.f508659a = o0Var;
        this.f508660b = i17;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play new fail");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f84020c) : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCastController", sb6.toString());
        uf.n nVar = uf.n.f508585m;
        uf.o0 o0Var = this.f508659a;
        uf.o0.a(o0Var, new uf.m(nVar, o0Var.f508601k));
    }

    @Override // z91.a
    public void b(aa1.e response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "play new success");
        uf.o0 o0Var = this.f508659a;
        o0Var.f508595e.c().f534187h = o0Var.f508600j;
        uf.c1 c1Var = o0Var.f508595e;
        c1Var.c().f534184e.f534196a = x91.j.Playing;
        c1Var.c().f();
        c1Var.c().g();
        int i17 = this.f508660b;
        if (i17 <= 0) {
            return;
        }
        o0Var.f508602l = new uf.b0(o0Var, i17);
    }
}
