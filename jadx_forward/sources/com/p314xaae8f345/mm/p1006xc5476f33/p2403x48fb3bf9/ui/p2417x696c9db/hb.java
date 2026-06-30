package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class hb implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f266344b;

    public hb(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, java.lang.String str) {
        this.f266344b = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f266343a = str;
    }

    @Override // db5.c1
    public void e(int i17) {
        java.lang.String str = this.f266343a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f266344b;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(viewOnCreateContextMenuListenerC19337x37f3384d.getApplicationContext(), str, str, null);
        } else {
            if (viewOnCreateContextMenuListenerC19337x37f3384d.L1.G(str)) {
                viewOnCreateContextMenuListenerC19337x37f3384d.p8(str, null, false);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.WebViewUI", "showLoadUrlMenu, canLoadUrl fail, url = " + str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "forceQuit");
            pm0.v.W(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ma(viewOnCreateContextMenuListenerC19337x37f3384d));
        }
    }
}
