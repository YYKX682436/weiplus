package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class mb extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.mb f267898d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.mb();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        boolean z17 = false;
        nw4.e3.a(msg.f422551h, false, null, (java.lang.String) ((java.util.HashMap) msg.f422323a).get("appId"));
        if (((java.util.HashMap) msg.f422323a).get("action") != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestWxPayKeyboard", "action: %s", ((java.util.HashMap) msg.f422323a).get("action"));
            java.lang.Object obj = ((java.util.HashMap) msg.f422323a).get("action");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            str = (java.lang.String) obj;
        } else {
            str = "";
        }
        android.content.Context context = env.f422393a;
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
            android.view.ViewGroup K7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).K7();
            switch (str.hashCode()) {
                case 48:
                    if (str.equals("0")) {
                        ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).getClass();
                        if (K7 instanceof com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) {
                            ((com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) K7).i();
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletService", "hideNumKeyboard error, kbView is not WcPayKeyboard");
                        }
                        z17 = true;
                        break;
                    }
                    break;
                case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                    if (str.equals("1")) {
                        ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).Ai(K7);
                        z17 = true;
                        break;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).getClass();
                        if (K7 instanceof com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) {
                            android.widget.EditText editText = ((com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) K7).f295354y;
                            if (editText != null) {
                                editText.setText("");
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletService", "resetKeyboardAmount error, kbView is not WcPayKeyboard");
                        }
                        ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).Ai(K7);
                        z17 = true;
                        break;
                    }
                    break;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestWxPayKeyboard", "env.context is not WebViewUI");
        }
        nw4.g gVar = env.f422396d;
        if (z17) {
            gVar.e(msg.f422546c, msg.f422552i + ":ok", null);
        } else {
            gVar.e(msg.f422546c, msg.f422552i + ":fail", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 484;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "requestWxPayKeyboard";
    }
}
