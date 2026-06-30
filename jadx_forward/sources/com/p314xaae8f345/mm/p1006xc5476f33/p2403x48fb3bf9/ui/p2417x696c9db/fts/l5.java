package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class l5 extends q35.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.m5 f266043g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.n5 f266044h;

    public l5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.n5 n5Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.m5 m5Var) {
        this.f266044h = n5Var;
        this.f266043g = m5Var;
    }

    @Override // q35.c
    public void a() {
    }

    @Override // q35.c
    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebSearchShakeCheckingManager", "onShake");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.n5 n5Var = this.f266044h;
        long j17 = n5Var.f266076b;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (n5Var.f266077c) {
            if (elapsedRealtime < 1000) {
                return;
            }
        } else if (elapsedRealtime < 1200) {
            return;
        }
        n5Var.f266076b = android.os.SystemClock.elapsedRealtime();
        n5Var.f266077c = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.m5 m5Var = this.f266043g;
        if (m5Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startCheck , deviceMotionMonitor onshake. uiWebView = ");
            qx4.d0 d0Var = ((qx4.l) m5Var).f448954a;
            av4.j jVar = d0Var.f95859a;
            sb6.append(jVar != null ? jVar.mo9090x86b9ebe3() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApi", sb6.toString());
            av4.j jVar2 = d0Var.f95859a;
            if (jVar2 == null || (mo9090x86b9ebe3 = jVar2.mo9090x86b9ebe3()) == null) {
                return;
            }
            qx4.k kVar = new qx4.k(mo9090x86b9ebe3, nw4.x2.c(d0Var.f448933i, null, false, mo9090x86b9ebe3.m81403xce19f7b8()), d0Var);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                kVar.run();
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(kVar);
            }
        }
    }
}
