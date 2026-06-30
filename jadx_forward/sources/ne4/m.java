package ne4;

/* loaded from: classes9.dex */
public class m implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public d50.o f418099a;

    /* renamed from: b, reason: collision with root package name */
    public final int f418100b;

    public m(d50.o oVar, int i17) {
        this.f418099a = oVar;
        this.f418100b = i17;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.a aVar = (eu5.a) eVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SOTER_AUTHORIZE_FAILURE_INT_SYNC;
        int intValue = ((java.lang.Integer) c17.m(u3Var, 0)).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterManager", "request authorize result: %s, %s, %s", java.lang.Integer.valueOf(aVar.f557138a), aVar.f557139b, java.lang.Integer.valueOf(intValue));
        if (aVar.a()) {
            gm0.j1.u().c().x(u3Var, 0);
            d50.o oVar = this.f418099a;
            if (oVar != null) {
                oVar.b(aVar);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24610, "5", "3", java.lang.String.valueOf(aVar.f557138a), aVar.f557139b, java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.C() ? 1 : 0), "", java.lang.Integer.valueOf(j65.e.b() ? 1 : 0), java.lang.Integer.valueOf(i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) > 1.0f ? 1 : 0));
            int i17 = aVar.f557138a;
            if (i17 == 1007 || i17 == 1027 || i17 == 1018) {
                cu5.b.f(this.f418100b);
                int i18 = intValue + 1;
                if (i18 >= 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterManager", "authorize need remove ask");
                    wt5.a.r();
                }
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(i18));
            }
            d50.o oVar2 = this.f418099a;
            if (oVar2 != null) {
                oVar2.c(0, aVar);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17805, java.lang.Integer.valueOf(aVar.f557138a), aVar.f557139b);
    }
}
