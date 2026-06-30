package pg0;

/* loaded from: classes9.dex */
public final class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5294x85240676 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5294x85240676) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p75.n0 n0Var = dm.ec.f318246p;
        p75.m0 i17 = dm.ec.f318251u.i(java.lang.Long.valueOf(event.f135615g.f89584a));
        p75.n0 n0Var2 = dm.ec.f318246p;
        n0Var2.getClass();
        if (n0Var2 instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var2.b();
        p75.h hVar = (p75.h) i17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(xs4.b.class);
        }
        l75.k0 Q4 = ((xs4.b) a17).Q4();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedger", "try delete record msgId:%s ret:%s", java.lang.Long.valueOf(event.f135615g.f89584a), java.lang.Integer.valueOf(Q4 != null ? Q4.mo70514xb06685ab(table, b17, e17) : -1));
        return true;
    }
}
