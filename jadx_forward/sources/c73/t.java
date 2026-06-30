package c73;

/* loaded from: classes11.dex */
public final class t implements c01.y8 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c73.u f121157d;

    public t(c73.u uVar) {
        this.f121157d = uVar;
    }

    @Override // c01.y8
    public final void a0() {
        l90.k kVar = (l90.k) i95.n0.c(l90.k.class);
        c73.u uVar = this.f121157d;
        l90.j jVar = uVar.f121159e;
        ((k90.l) kVar).getClass();
        ug3.i.f509079t = jVar;
        java.lang.String str = "webwx online status: " + gm0.j1.b().t();
        java.lang.String str2 = uVar.f121158d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6 b6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6.class);
        if (b6Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11815xcf47e362 c11815xcf47e362 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11815xcf47e362();
            com.p314xaae8f345.mm.p957x53236a1b.t tVar = (com.p314xaae8f345.mm.p957x53236a1b.t) b6Var;
            c11815xcf47e362.f158886f = c01.d9.b().F();
            java.util.ArrayList arrayList = (java.util.ArrayList) tVar.wi();
            if (arrayList.contains(1)) {
                c11815xcf47e362.f158884d = 1;
            } else if (arrayList.contains(2)) {
                c11815xcf47e362.f158884d = 2;
            } else {
                c11815xcf47e362.f158884d = -1;
            }
            c11815xcf47e362.f158885e = ug3.i.f509076q;
            c11815xcf47e362.f158887g = tVar.Bi();
            c11815xcf47e362.f158888h = tVar.Di();
            if (c11815xcf47e362.f158884d == -1 || c11815xcf47e362.f158885e == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "invalid login: " + c11815xcf47e362);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).K7("Common_IPC_appid", c11815xcf47e362);
                ((d73.i) i95.n0.c(d73.i.class)).Ti(c11815xcf47e362);
            }
        }
        if (gm0.j1.b().t()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "webwx is online, send alllist");
            g73.o0.f350844d.k8();
        }
    }
}
