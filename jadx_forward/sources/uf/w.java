package uf;

/* loaded from: classes7.dex */
public final class w implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f508649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f508650b;

    public w(uf.o0 o0Var, yz5.l lVar) {
        this.f508649a = o0Var;
        this.f508650b = lVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pause fail");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f84020c) : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCastController", sb6.toString());
        this.f508650b.mo146xb9724478(new uf.h2(false));
    }

    @Override // z91.a
    public void b(aa1.e response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "pause success");
        this.f508649a.f508595e.c().f534184e.f534196a = x91.j.Paused;
        this.f508650b.mo146xb9724478(new uf.h2(true));
    }
}
