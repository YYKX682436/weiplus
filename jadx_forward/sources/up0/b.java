package up0;

/* loaded from: classes7.dex */
public final class b extends tp0.c {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f511303f = jz5.h.b(new up0.a(this));

    @Override // lc3.c0
    public java.lang.String f() {
        return "insertPagView";
    }

    @Override // tp0.c
    public void z(org.json.JSONObject data, jc3.m coverViewDelegate, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverViewDelegate, "coverViewDelegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (((lc3.s) this.f399423a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiInsertPagView", "hy: no activity provided! fail to insert PAG View");
            callback.mo146xb9724478(null);
            return;
        }
        lc3.e eVar = this.f399423a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        android.content.Context B0 = ((lc3.s) eVar).B0();
        if (B0 == null) {
            B0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(B0);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(B0);
        c22789xd23e9a9b.o(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20314x9f127b51()) == 1);
        up0.k.f511324a.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) ((jz5.n) this.f511303f).mo141623x754a37bb(), data, c22789xd23e9a9b);
        callback.mo146xb9724478(c22789xd23e9a9b);
    }
}
