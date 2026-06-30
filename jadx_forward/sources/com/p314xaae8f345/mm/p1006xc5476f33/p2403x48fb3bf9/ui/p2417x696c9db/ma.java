package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class ma implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f267232d;

    public ma(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        this.f267232d = viewOnCreateContextMenuListenerC19337x37f3384d;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.webkit.WebSettings.RenderPriority renderPriority = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.f265330v3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f267232d;
        viewOnCreateContextMenuListenerC19337x37f3384d.getClass();
        try {
            viewOnCreateContextMenuListenerC19337x37f3384d.f265337a3.d();
            viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.mo120194xc77ccada();
            viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.removeAllViews();
            viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.mo120135xb4407692();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUI", "forceQuit, ex = " + e17.getMessage());
        }
        nw4.n nVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265377p0;
        if (nVar != null) {
            nVar.n();
        }
        try {
            viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.mo52095x5cd39ffa();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUI", "forceQuit, viewWV destroy, ex = %s", e18.getMessage());
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.finish();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
    }
}
