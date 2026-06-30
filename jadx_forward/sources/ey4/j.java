package ey4;

/* loaded from: classes8.dex */
public class j implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb f339154d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb c19494x6eecdedb) {
        this.f339154d = c19494x6eecdedb;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb c19494x6eecdedb = this.f339154d;
        ey4.u uVar = c19494x6eecdedb.f268825d;
        if (uVar != null) {
            java.lang.String text = c19494x6eecdedb.f268833o.getText().toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "keyboard onTextSend, text = %s", text);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ua) uVar).f268481a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = viewOnCreateContextMenuListenerC19337x37f3384d.L1;
            if (e3Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "controller == null");
            } else {
                nw4.n jsApiHandler = e3Var.g0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiHandler, "jsApiHandler");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ed.f267602e == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowKeyBoard", "callbackID == null, return");
                } else {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, text);
                    jsApiHandler.e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ed.f267602e, "showKeyboard:ok", hashMap);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ed.f267602e = null;
                }
            }
            if (viewOnCreateContextMenuListenerC19337x37f3384d.F != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "keyboard hide onWebPlusKeyBoardTextSent");
                viewOnCreateContextMenuListenerC19337x37f3384d.F.b();
            }
        }
        c19494x6eecdedb.f268833o.clearComposingText();
        c19494x6eecdedb.f268833o.setText("");
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
    }
}
