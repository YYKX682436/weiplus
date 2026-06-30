package c61;

/* loaded from: classes10.dex */
public final class v2 implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.l7 f120872d;

    public v2(c61.l7 l7Var) {
        this.f120872d = l7Var;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        c61.l7 l7Var = this.f120872d;
        ((c61.p2) l7Var.f120667x0).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommonService", "abandonAudioFocus not support!");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        pm0.v.X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s1.f206874d);
        ms5.f.f412691a.a("onAppBackground");
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85457y0).mo141623x754a37bb()).r()).intValue() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommonFeatureService", "onAppBackground start delay scan");
            c61.k4 k4Var = l7Var.f120671y1;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(k4Var);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(k4Var, 300000L);
        }
        gt2.d dVar = gt2.d.f356912b;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = dVar.f356913a;
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            ((gt2.a) entry.getValue()).f356908c = c01.id.c();
            dVar.b((java.lang.String) entry.getKey(), (gt2.a) entry.getValue(), "onAppBackground");
        }
        concurrentHashMap.clear();
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        c61.l7 l7Var = this.f120872d;
        if (!((c61.p2) l7Var.f120667x0).qj()) {
            if (!(((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).f529621h.size() > 0)) {
                if (!(((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).f529622i.size() > 0)) {
                    return;
                }
            }
        }
        ((c61.p2) l7Var.f120667x0).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommonService", "requestAudioFocus not support!");
    }
}
