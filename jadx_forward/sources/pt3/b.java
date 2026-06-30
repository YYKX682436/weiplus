package pt3;

/* loaded from: classes4.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a() {
        pt3.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1985xb098552e.p1986xc52405f1.C16990x6bb3f96.f237182g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeSeeProvider", "delete fun");
        l75.k0 k0Var = gm0.j1.u().f354686f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k0Var, "getDataDB(...)");
        pt3.a aVar = new pt3.a(k0Var);
        int mo78086x7444f759 = aVar.mo78086x7444f759();
        if (mo78086x7444f759 == 0) {
            return;
        }
        if (mo78086x7444f759 > 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeSeeProvider", "delete count error, count: " + mo78086x7444f759 + ' ');
        }
        aVar.mo70496xb06685ab(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1985xb098552e.p1986xc52405f1.C16990x6bb3f96.f237188p);
    }

    public final void b(java.lang.String weSeeUri, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weSeeUri, "weSeeUri");
        pt3.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1985xb098552e.p1986xc52405f1.C16990x6bb3f96.f237182g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeSeeProvider", "insert fun");
        l75.k0 k0Var = gm0.j1.u().f354686f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k0Var, "getDataDB(...)");
        pt3.a aVar = new pt3.a(k0Var);
        pt3.c cVar = new pt3.c();
        cVar.f68093xd9a4fe2c = weSeeUri;
        cVar.f68092x2261f6f2 = j17;
        if (aVar.mo78086x7444f759() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeSeeProvider", "insert weseeProvider:" + weSeeUri + ", time:" + j17);
            aVar.mo880xb970c2b9(cVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeSeeProvider", "update weseeProvider:" + weSeeUri + ", time:" + j17);
        aVar.mo11261xce0038c9((long) com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1985xb098552e.p1986xc52405f1.C16990x6bb3f96.f237188p, cVar);
    }
}
