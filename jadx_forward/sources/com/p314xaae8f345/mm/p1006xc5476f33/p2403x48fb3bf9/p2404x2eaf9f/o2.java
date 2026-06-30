package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class o2 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f263434a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f263435b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f263436c;

    public o2(java.lang.ref.WeakReference weakController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakController, "weakController");
        this.f263434a = weakController;
    }

    public void a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f263435b;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        if (u3Var != null) {
            u3Var.setCancelMessage(null);
        }
        if (u3Var != null) {
            u3Var.setDismissMessage(null);
        }
        this.f263435b = null;
    }

    public void b(java.lang.String url, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) this.f263434a.get();
        if (e3Var == null) {
            return;
        }
        e3Var.V0(url, true, i17);
        ex4.a aVar = e3Var.f263333b1;
        if (!(aVar != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) aVar).E.f338760c) || aVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) aVar;
        ex4.o oVar = viewOnCreateContextMenuListenerC19337x37f3384d.E;
        oVar.getClass();
        if (!oVar.f338760c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewSnapshotHelper", "exitSnapshotMode not in snap shot mode now");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewSnapshotHelper", "exitSnapshotMode");
        oVar.f338760c = false;
        viewOnCreateContextMenuListenerC19337x37f3384d.mo78514x143f1b92().D0(0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = viewOnCreateContextMenuListenerC19337x37f3384d.f265348f;
        if (c22633x83752a59 != null) {
            c22633x83752a59.setVisibility(0);
        }
        android.view.ViewGroup viewGroup = oVar.f338761d;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        oVar.b();
    }

    public java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) this.f263434a.get();
        if (e3Var == null) {
            return "";
        }
        java.lang.String Z = e3Var.Z();
        return !(Z == null || r26.n0.N(Z)) ? e3Var.Z() : e3Var.i();
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) this.f263434a.get();
        if (e3Var == null) {
            return;
        }
        java.util.Iterator it = e3Var.Z.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3) it.next()).i();
        }
    }

    public boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) this.f263434a.get();
        if (e3Var == null || e3Var.f263333b1 == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.q1 q1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.s1.f263505a;
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().getInt("openSnapOauth", 1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewCommand", "openSnapOauth = " + z17);
        return z17;
    }
}
