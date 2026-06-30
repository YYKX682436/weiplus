package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class hc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f266345d;

    public hc(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        this.f266345d = viewOnCreateContextMenuListenerC19337x37f3384d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f266345d;
        viewOnCreateContextMenuListenerC19337x37f3384d.L1.E(viewOnCreateContextMenuListenerC19337x37f3384d.f265380p3);
        viewOnCreateContextMenuListenerC19337x37f3384d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "resetFloatBallInfo");
        nw4.n nVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265377p0;
        if (nVar != null && nVar.f422428i) {
            viewOnCreateContextMenuListenerC19337x37f3384d.R8(true, true);
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.f265337a3.f(viewOnCreateContextMenuListenerC19337x37f3384d.L1.Z());
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.x xVar = viewOnCreateContextMenuListenerC19337x37f3384d.L1.Y0;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xVar.f265770b)) {
            viewOnCreateContextMenuListenerC19337x37f3384d.mo54450xbf7c1df6(xVar.f265770b);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265399w2;
        if (ldVar != null) {
            ldVar.n();
        }
        try {
            xVar.f265769a = false;
            java.util.Iterator it = xVar.f265771c.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.e) it.next();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7) viewOnCreateContextMenuListenerC19337x37f3384d.N2).i(eVar.f265727a, eVar.f265728b);
            }
            xVar.f265769a = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "resetFloatBallInfo ex = %s ", e17.getMessage());
        }
    }
}
