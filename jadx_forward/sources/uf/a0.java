package uf;

/* loaded from: classes7.dex */
public final class a0 implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f508500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f508501b;

    public a0(uf.o0 o0Var, int i17) {
        this.f508500a = o0Var;
        this.f508501b = i17;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop fail before play new");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f84020c) : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCastController", sb6.toString());
    }

    @Override // z91.a
    public void b(aa1.e response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "playNew: stop success");
        uf.o0 o0Var = this.f508500a;
        o0Var.f508595e.c().f534184e.f534196a = x91.j.Stopped;
        o0Var.f508595e.c().d(((uf.o1) o0Var.f508591a).f508609h, new uf.z(o0Var, this.f508501b));
    }
}
