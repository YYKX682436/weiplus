package uf;

/* loaded from: classes7.dex */
public final class x implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f508653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f508654b;

    public x(uf.o0 o0Var, int i17) {
        this.f508653a = o0Var;
        this.f508654b = i17;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCastController", "play fail");
        uf.n nVar = uf.n.f508585m;
        uf.o0 o0Var = this.f508653a;
        uf.o0.a(o0Var, new uf.m(nVar, o0Var.f508601k));
    }

    @Override // z91.a
    public void b(aa1.e response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        uf.o0 o0Var = this.f508653a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "play success, url = [%s]", ((uf.o1) o0Var.f508591a).f508609h);
        int i17 = this.f508654b;
        if (i17 <= 0) {
            return;
        }
        o0Var.f508602l = new uf.b0(o0Var, i17);
    }
}
