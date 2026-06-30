package uf;

/* loaded from: classes7.dex */
public final class t implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f508635a;

    public t(uf.o0 o0Var) {
        this.f508635a = o0Var;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "getMediaInfo fail");
        this.f508635a.f508597g = true;
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        java.util.Map map;
        aa1.a aVar;
        uf.o0 o0Var = this.f508635a;
        if (o0Var.f508597g) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf((eVar == null || (map = eVar.f84022b) == null || (aVar = (aa1.a) map.get("CurrentURI")) == null) ? null : aVar.f84014a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "getMediaInfo: currentUrl = ".concat(valueOf));
        if (r26.n0.N(r26.n0.u0(valueOf).toString()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, "null") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, ((uf.o1) o0Var.f508591a).f508609h)) {
            return;
        }
        o0Var.f508592b.i();
    }
}
