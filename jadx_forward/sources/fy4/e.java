package fy4;

/* loaded from: classes8.dex */
public final class e implements com.p314xaae8f345.mm.ui.z7, p94.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f348792d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f348793e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d webviewUI) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webviewUI, "webviewUI");
        this.f348792d = webviewUI;
    }

    @Override // p94.u0
    public void a() {
        nw4.n nVar = this.f348792d.f265377p0;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 2);
        nVar.i0("onReceiveWXKBEvent", null, jSONObject);
    }

    @Override // p94.u0
    public void b(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewInputConnectionHelper", "onReceiveImeEmoji, emojiInfo md5 = " + emojiInfo.mo42933xb5885648());
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class))).ij(emojiInfo, false, new fy4.d(this, emojiInfo, fy4.f.f348794a.b(emojiInfo)));
    }

    @Override // p94.u0
    public void c(java.lang.String imgPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        nw4.n nVar = this.f348792d.f265377p0;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("localData", fy4.f.f348794a.a(imgPath, 2));
        nVar.i0("onGetImageInfo", null, jSONObject);
    }

    @Override // p94.u0
    public void d() {
        nw4.n nVar = this.f348792d.f265377p0;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1);
        nVar.i0("onReceiveWXKBEvent", null, jSONObject);
    }
}
