package gg1;

/* loaded from: classes7.dex */
public final class c0 implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353067a;

    public c0(gg1.c1 c1Var) {
        this.f353067a = c1Var;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastController", "getMediaInfo fail");
        this.f353067a.f353082o = true;
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        java.util.Map map;
        aa1.a aVar;
        gg1.c1 c1Var = this.f353067a;
        if (c1Var.f353082o) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf((eVar == null || (map = eVar.f84022b) == null || (aVar = (aa1.a) map.get("CurrentURI")) == null) ? null : aVar.f84014a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastController", "getMediaInfo: currentUrl = ".concat(valueOf));
        if (r26.n0.N(r26.n0.u0(valueOf).toString()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, "null") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, c1Var.f353070c.f343432e)) {
            return;
        }
        fg1.g gVar = (fg1.g) c1Var.f353069b;
        gVar.getClass();
        try {
            gVar.a(new uf.e2(), gVar.b());
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onXWebCastingInterrupt fail", e17);
        }
    }
}
