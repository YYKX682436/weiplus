package dy3;

/* loaded from: classes.dex */
public final class k implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy3.n f326116d;

    public k(dy3.n nVar) {
        this.f326116d = nVar;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        dy3.p data = (dy3.p) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String str = "";
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = data.f326129e;
        if (K0) {
            str = z3Var.f2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getDisplayNick(...)");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z3Var.t0(), "getAlias(...)");
        }
        java.lang.String d17 = z3Var.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        int i18 = dy3.n.C;
        dy3.n nVar = this.f326116d;
        nVar.dismiss();
        cy3.i iVar = (cy3.i) nVar.f326119r;
        iVar.getClass();
        iVar.f306311a.mo147xb9724478(java.lang.Boolean.valueOf(iVar.f306312b.f391645d), d17, iVar.f306313c.f391656d);
    }
}
