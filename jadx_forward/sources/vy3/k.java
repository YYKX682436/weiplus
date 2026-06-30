package vy3;

/* loaded from: classes.dex */
public final class k extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.k f523007e = new vy3.k();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("open_url");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) msg.f422323a.get("a8keyScene");
        if (str2 == null) {
            str2 = "";
        }
        int y17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y1(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWebView", "ScanJsApi-Call doOpenWebView open_url: " + str + "  a8keyScene:" + y17);
        boolean N = r26.n0.N(str);
        nw4.g gVar = env.f422396d;
        if (N) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenWebView", "ScanJsApi-Call doOpenWebView param is empty");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("ret", "1");
            gVar.e(msg.f422546c, msg.f422552i + ":param invalid", hashMap);
        } else {
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str);
                if (y17 > 0) {
                    intent.putExtra("geta8key_scene", y17);
                }
                intent.putExtra("key_enable_teen_mode_check", true);
                intent.putExtra("key_enable_fts_quick", true);
                j45.l.j(env.f422393a, "webview", ".ui.tools.WebViewUI", intent, null);
                z17 = true;
            } catch (java.lang.Exception e17) {
                z17 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenWebView", e17, "", new java.lang.Object[0]);
            }
            if (z17) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("ret", "0");
                gVar.e(msg.f422546c, msg.f422552i + ":ok", hashMap2);
            } else {
                java.util.HashMap hashMap3 = new java.util.HashMap();
                hashMap3.put("ret", "1");
                gVar.e(msg.f422546c, msg.f422552i + ":fail", hashMap3);
            }
        }
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openWebView";
    }
}
