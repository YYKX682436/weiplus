package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class ka implements z41.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f267148a;

    public ka(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        this.f267148a = viewOnCreateContextMenuListenerC19337x37f3384d;
    }

    @Override // z41.b
    public void a(z41.a aVar, z41.a aVar2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "OrientationListener lastOrientation:" + aVar.name() + "; newOrientation:" + aVar2.name());
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f267148a;
        viewOnCreateContextMenuListenerC19337x37f3384d.A = 4;
        viewOnCreateContextMenuListenerC19337x37f3384d.mo50393x3c0b42ee();
        z41.c cVar = viewOnCreateContextMenuListenerC19337x37f3384d.D;
        if (cVar != null) {
            cVar.disable();
        }
    }
}
