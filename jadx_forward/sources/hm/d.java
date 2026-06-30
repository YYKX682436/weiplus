package hm;

/* loaded from: classes12.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f363677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 f363678e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hm.f f363679f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, hm.f fVar) {
        super(0);
        this.f363677d = f9Var;
        this.f363678e = c16564xb55e1d5;
        this.f363679f = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f363677d;
        if (f9Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = this.f363678e;
            f9Var = c16564xb55e1d5 != null ? pt0.f0.f439742b1.k(c16564xb55e1d5.a(), c16564xb55e1d5.f231013d) : null;
        }
        if (f9Var != null) {
            hm.f fVar = this.f363679f;
            if (((java.util.HashSet) ((jz5.n) fVar.f363683g).mo141623x754a37bb()).add(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()))) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6303x2a97adbd c6303x2a97adbd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6303x2a97adbd();
                for (im.g gVar : kz5.c0.i(new im.b(), new im.i(), new im.a(), new im.h())) {
                    if (gVar.b(f9Var)) {
                        gVar.a(f9Var, c6303x2a97adbd);
                    }
                }
                pi3.a aVar = (pi3.a) fVar.T6().get(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var.m124847x74d37ac6(), f9Var.Q0()).m66995x9616526c());
                if (aVar != null) {
                    if (aVar.k() == 1) {
                        c6303x2a97adbd.f136615i = -99999;
                    } else if (aVar.m158574xe591acbc() == 0) {
                        c6303x2a97adbd.f136615i = aVar.j();
                    } else {
                        c6303x2a97adbd.f136615i = aVar.m158574xe591acbc();
                    }
                    c6303x2a97adbd.f136616j = c6303x2a97adbd.b("ErrMsg", aVar.m158575x17ec12d2(), true);
                }
                c6303x2a97adbd.f136619m = 2;
                c6303x2a97adbd.k();
                c6303x2a97adbd.o();
            }
        }
        return jz5.f0.f384359a;
    }
}
