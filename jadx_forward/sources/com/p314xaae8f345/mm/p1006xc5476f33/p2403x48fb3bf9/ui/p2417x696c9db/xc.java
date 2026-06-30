package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class xc implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f269216a;

    public xc(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.AnonymousClass1 anonymousClass1) {
        this.f269216a = viewOnCreateContextMenuListenerC19337x37f3384d;
    }

    public void a(int i17) {
        int i18;
        if (i17 != 0) {
            switch (i17) {
                case 2:
                    i18 = 3;
                    break;
                case 3:
                    i18 = 4;
                    break;
                case 4:
                    i18 = 5;
                    break;
                case 5:
                    i18 = 6;
                    break;
                case 6:
                    i18 = 7;
                    break;
                case 7:
                    i18 = 8;
                    break;
                default:
                    i18 = 2;
                    break;
            }
        } else {
            i18 = 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f269216a;
        viewOnCreateContextMenuListenerC19337x37f3384d.L1.A1(i18);
        try {
            if (viewOnCreateContextMenuListenerC19337x37f3384d.K1.lb()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("WebViewFontUtil", 2, null);
                N.putBoolean("webview_key_font_has_set", true);
                N.putBoolean("webview_key_has_transfer_mp", true);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("WebViewFontUtil", 2, null).putBoolean("webview_key_font_use_system", false);
                viewOnCreateContextMenuListenerC19337x37f3384d.K1.Ui(16384, i18);
                viewOnCreateContextMenuListenerC19337x37f3384d.K1.Ui(16388, i18);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUI", "onCheckedChanged, ex = " + e17.getMessage());
        }
    }
}
