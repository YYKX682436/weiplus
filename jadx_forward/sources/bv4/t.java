package bv4;

/* loaded from: classes8.dex */
public class t extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public t() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5848x86b8e43d c5848x86b8e43d = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5848x86b8e43d) abstractC20979x809547d1;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1.class);
                if (w1Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PreloadWebSearchDataLsn", "PluginWebSearch service is null, skip preGetData");
                } else {
                    su4.u0 Zi = w1Var.Zi();
                    am.qo qoVar = c5848x86b8e43d.f136156g;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0) Zi).e(qoVar.f89262e, qoVar.f89258a, qoVar.f89259b, qoVar.f89260c, qoVar.f89261d, qoVar.f89263f, qoVar.f89264g, qoVar.f89265h, qoVar.f89269l, qoVar.f89266i, qoVar.f89267j, qoVar.f89268k);
                }
                return false;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PreloadWebSearchDataLsn", "preGetData exception: %s", e17.getMessage());
                return false;
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("reqId", c5848x86b8e43d.f136156g.f89262e);
        am.qo qoVar2 = c5848x86b8e43d.f136156g;
        bundle.putString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, qoVar2.f89258a);
        bundle.putString("subSessionId", qoVar2.f89259b);
        bundle.putString("query", qoVar2.f89260c);
        bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, qoVar2.f89261d);
        bundle.putString("parentSearchID", qoVar2.f89263f);
        bundle.putString("sugId", qoVar2.f89264g);
        bundle.putInt("sceneActionType", qoVar2.f89265h);
        bundle.putInt("businessType", qoVar2.f89269l);
        bundle.putInt("chatSearch", qoVar2.f89266i);
        bundle.putString("reqKey", qoVar2.f89267j);
        bundle.putSerializable("extParams", qoVar2.f89268k != null ? new java.util.HashMap(qoVar2.f89268k) : null);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, bv4.s.class, null);
        return false;
    }
}
