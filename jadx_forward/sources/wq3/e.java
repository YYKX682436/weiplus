package wq3;

/* loaded from: classes15.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5853x49a21022 c5853x49a21022 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5853x49a21022) abstractC20979x809547d1;
        if (c5853x49a21022.f136159g.f89558a == 1) {
            wq3.j Ai = vq3.e.wi().Ai();
            am.to toVar = c5853x49a21022.f136159g;
            am.uo uoVar = c5853x49a21022.f136160h;
            if (Ai == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MallProductListener", "error, xml[%s] can not parse", toVar.f89560c);
                uoVar.f89651a = false;
            } else {
                wq3.t c17 = wq3.t.c(null, toVar.f89560c);
                Ai.u(c17, null);
                uoVar.f89652b = Ai.p();
                uoVar.f89653c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.a()) ? null : com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o.m(c17.a());
                uoVar.f89651a = true;
            }
        }
        return false;
    }
}
