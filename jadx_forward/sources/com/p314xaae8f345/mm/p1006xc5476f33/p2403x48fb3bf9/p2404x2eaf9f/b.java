package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class b implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f263293a;

    public b(java.lang.ref.WeakReference weakController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakController, "weakController");
        this.f263293a = weakController;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.y0
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x0 conn) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conn, "conn");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) this.f263293a.get();
        if (r0Var == null) {
            return;
        }
        if (r0Var.v0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0Var.T(), "WebView-Trace onConnected when destroyCalled");
            return;
        }
        zw4.n.f558467a.b(zw4.a.f558418m, r0Var.f263461g);
        r0Var.G0 = conn;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.k3) conn).f263397d.f263413g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v0Var);
        r0Var.A = v0Var;
        r0Var.g0().f422432m = r0Var.e0();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 e07 = r0Var.e0();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) r0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.o1(), "onServiceConnected, invoker == null ? %b", java.lang.Boolean.FALSE);
        try {
            e07.rg(e3Var.j1(), e3Var.j1().e());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e3Var.o1(), "addCallback fail, ex = %s", e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0Var.T(), "WebView-Trace tryBindService#" + r0Var.U() + " checkStatus CONTROLLER_INVOKER_READY");
        hy4.l0 l0Var = r0Var.f263467j;
        if (l0Var != null) {
            l0Var.f367692i = java.lang.System.currentTimeMillis();
        }
        if (r0Var.E0.contains(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.C19234x74a7035d.class).g())) {
            r0Var.C0();
        } else {
            r0Var.I(r0Var.f263464h0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.y0
    public boolean b() {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) this.f263293a.get();
        if (r0Var == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) r0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.o1(), "edw onServiceDisconnected");
        java.util.Iterator it = e3Var.X.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3) it.next()).u()) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            z18 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.o1(), "maybe mm process crash, try rebind service");
            z18 = true;
        }
        return z18;
    }
}
