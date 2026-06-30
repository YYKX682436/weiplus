package mw3;

/* loaded from: classes9.dex */
public class t extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public t() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5881x7dc1b82c c5881x7dc1b82c = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5881x7dc1b82c) abstractC20979x809547d1;
        kw3.p Ai = kw3.p.Ai();
        Ai.getClass();
        java.lang.Long valueOf = java.lang.Long.valueOf(c5881x7dc1b82c.f136189g.f89928b);
        am.xp xpVar = c5881x7dc1b82c.f136189g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "do insert transfer record: %s, %s", valueOf, xpVar.f89927a);
        ot0.q qVar = xpVar.f89930d;
        if (qVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "do insert transfer paysubtype: %s", java.lang.Integer.valueOf(qVar.I0));
            int i17 = xpVar.f89930d.I0;
            if (i17 == 5 || i17 == 25) {
                rw3.a aVar = new rw3.a();
                aVar.f67195x297eb4f7 = xpVar.f89928b;
                aVar.f67196x5231a6cb = xpVar.f89927a;
                kw3.p.Ai().Bi().mo880xb970c2b9(aVar);
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(xpVar.f89929c, xpVar.f89928b);
            rw3.c y07 = Ai.Ni().y0(xpVar.f89927a);
            if (y07 != null) {
                y07.f68618xd3086e30 = xpVar.f89930d.I0;
                Ai.Ni().mo11260x413cb2b4(y07);
                if (!Li.Q0().equals(c01.z1.r())) {
                    Ai.Vi(Li.Q0(), Li, null);
                }
            } else if (!Li.Q0().equals(c01.z1.r())) {
                rw3.c cVar = new rw3.c();
                cVar.f68617x512156d6 = xpVar.f89928b;
                ot0.q qVar2 = xpVar.f89930d;
                cVar.f68622x5231a6cb = qVar2.L0;
                cVar.f68618xd3086e30 = qVar2.I0;
                cVar.f68616xff7bdab7 = false;
                cVar.f68621x114ef53e = Li.Q0();
                cVar.f68615x32fdc97f = xpVar.f89930d.M0;
                cVar.f68619xee5f688b = Li.mo78012x3fdd41df();
                ot0.q v17 = ot0.q.v(Li.j());
                if (v17 != null) {
                    cVar.f68620xdf27f83f = ((ot0.n) v17.y(ot0.n.class)).f430127c;
                }
                Ai.Ni().mo11260x413cb2b4(cVar);
                Ai.Vi(Li.Q0(), Li, null);
            }
        }
        return false;
    }
}
