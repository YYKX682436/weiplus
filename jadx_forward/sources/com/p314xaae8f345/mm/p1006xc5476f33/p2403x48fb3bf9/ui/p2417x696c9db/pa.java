package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class pa implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f268288a;

    public pa(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        this.f268288a = viewOnCreateContextMenuListenerC19337x37f3384d;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268288a;
        int color = viewOnCreateContextMenuListenerC19337x37f3384d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aak);
        java.lang.String str2 = "";
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.f265333y3.matcher(str).matches()) {
            java.lang.String[] split = str.replaceAll("\"", "").replaceFirst("rgba", "").replaceFirst("\\(", "").replaceFirst("\\)", "").split(",");
            if (split.length != 4) {
                return;
            }
            try {
                java.lang.String str3 = split[0];
                if (str3 == null) {
                    str3 = "";
                }
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3.trim(), 0);
                java.lang.String str4 = split[1];
                if (str4 == null) {
                    str4 = "";
                }
                int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str4.trim(), 0);
                java.lang.String str5 = split[2];
                if (str5 == null) {
                    str5 = "";
                }
                int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str5.trim(), 0);
                java.lang.String str6 = split[3];
                if (str6 != null) {
                    str2 = str6;
                }
                color = android.graphics.Color.argb(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str2.trim(), 0), P, P2, P3);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUI", "handle bgColor from html, bgColor = %s, exception = %s", str, e17);
                return;
            }
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.f265334z3.matcher(str).matches()) {
            java.lang.String[] split2 = str.replaceAll("\"", "").replaceFirst("rgb", "").replaceFirst("\\(", "").replaceFirst("\\)", "").split(",");
            if (split2.length != 3) {
                return;
            }
            try {
                java.lang.String str7 = split2[0];
                if (str7 == null) {
                    str7 = "";
                }
                int P4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str7.trim(), 0);
                java.lang.String str8 = split2[1];
                if (str8 == null) {
                    str8 = "";
                }
                int P5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str8.trim(), 0);
                java.lang.String str9 = split2[2];
                if (str9 != null) {
                    str2 = str9;
                }
                color = android.graphics.Color.argb(255, P4, P5, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str2.trim(), 0));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUI", "handle bgColor from html, bgColor = %s, exception = %s", str, e18);
                return;
            }
        }
        android.view.View view = viewOnCreateContextMenuListenerC19337x37f3384d.f265337a3.f268392m;
        if (view != null) {
            view.setBackgroundColor(color);
        }
    }
}
