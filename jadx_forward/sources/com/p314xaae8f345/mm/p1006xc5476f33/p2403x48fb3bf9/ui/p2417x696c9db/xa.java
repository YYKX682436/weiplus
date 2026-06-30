package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class xa implements android.webkit.WebView.FindListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f269214a;

    public xa(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        this.f269214a = viewOnCreateContextMenuListenerC19337x37f3384d;
    }

    @Override // android.webkit.WebView.FindListener
    public void onFindResultReceived(int i17, int i18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f269214a;
        if (z17 && !viewOnCreateContextMenuListenerC19337x37f3384d.I && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnCreateContextMenuListenerC19337x37f3384d.H.m74816x448ef5fb())) {
            if (i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(480L, 3L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(480L, 2L, 1L, false);
            }
            viewOnCreateContextMenuListenerC19337x37f3384d.I = true;
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.H.d(i17, i18, z17);
    }
}
