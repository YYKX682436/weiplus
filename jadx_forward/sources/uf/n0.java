package uf;

/* loaded from: classes7.dex */
public final class n0 implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f508587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f508588b;

    public n0(uf.o0 o0Var, yz5.l lVar) {
        this.f508587a = o0Var;
        this.f508588b = lVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop fail");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f84020c) : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCastController", sb6.toString());
        this.f508588b.mo146xb9724478(new uf.h2(false));
    }

    @Override // z91.a
    public void b(aa1.e response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "stop success");
        uf.o0 o0Var = this.f508587a;
        o0Var.f508595e.c().f534184e.f534196a = x91.j.Stopped;
        o0Var.f();
        o0Var.f508599i.d();
        this.f508588b.mo146xb9724478(new uf.h2(true));
    }
}
