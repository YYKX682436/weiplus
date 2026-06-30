package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class cc extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.cc f267549d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.cc();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        android.content.Context context = env.f422393a;
        if (!(context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetBizCustomSharePanel", "setBizCustomSharePanel fail, webview ui is null");
            env.f422396d.e(msg.f422546c, msg.f422552i + ":fail, webview ui is null", null);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context;
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265382q2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetBizCustomSharePanel", "setBizCustomSharePanel fail, menuHelper is null");
            env.f422396d.e(msg.f422546c, msg.f422552i + ":fail, menuHelper is null", null);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetBizCustomSharePanel", "setBizCustomSharePanel");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = viewOnCreateContextMenuListenerC19337x37f3384d.f265382q2;
        java.util.Map map = msg.f422323a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x3 x3Var = c6Var.f265597u;
        synchronized (x3Var) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x3Var.f269177d, "updatePanelInfo");
            ((java.util.ArrayList) x3Var.f269181h).clear();
            ((java.util.LinkedHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x3.M).clear();
            if (map == null) {
                x3Var.f269182i = false;
                x3Var.f269183j = null;
            } else {
                java.lang.Object obj = map.get("actions");
                java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                x3Var.L = str;
                x3Var.f269183j = x3Var.k(str);
                if (x3Var.i()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x3Var.f269177d, "update panel info while showing, try to show again");
                    x3Var.m(x3Var.f269178e, x3Var.f269175b, x3Var.f269176c);
                }
            }
        }
        env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 345;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "setBizCustomSharePanel";
    }
}
