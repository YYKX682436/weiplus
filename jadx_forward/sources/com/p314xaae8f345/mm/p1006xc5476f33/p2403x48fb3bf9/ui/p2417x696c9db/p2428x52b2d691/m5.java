package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class m5 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.m5 f267890d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.m5();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHideBizCustomSharePanel", "hideBizCustomSharePanel");
        android.content.Context context = env.f422393a;
        boolean z17 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d;
        nw4.g gVar = env.f422396d;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHideBizCustomSharePanel", "hideBizCustomSharePanel fail, webview ui is null");
            gVar.e(msg.f422546c, msg.f422552i + ":fail, webview ui is null", null);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).f265382q2;
        if (c6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHideBizCustomSharePanel", "hideBizCustomSharePanel fail, menuHelper is null");
            gVar.e(msg.f422546c, msg.f422552i + ":fail, menuHelper is null", null);
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x3 x3Var = c6Var.f265597u;
        x3Var.f269179f = false;
        rv.n2 n2Var = x3Var.f269180g;
        if (n2Var != null) {
            ((ss1.d) ((jz5.n) ((qs1.m) n2Var).f447766f).mo141623x754a37bb()).f();
        }
        gVar.e(msg.f422546c, msg.f422552i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 345;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "hideBizCustomSharePanel";
    }
}
