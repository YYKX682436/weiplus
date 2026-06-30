package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class i7 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f266726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266728c;

    public i7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, boolean z17, nw4.y2 y2Var) {
        this.f266728c = c1Var;
        this.f266726a = z17;
        this.f266727b = y2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i
    public void a() {
        if (this.f266726a) {
            return;
        }
        nw4.y2 y2Var = this.f266727b;
        if (y2Var.f422323a.get("url") == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "webview recent share: onContentClick: url is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", y2Var.f422323a.get("url").toString());
        intent.putExtra("hide_option_menu", true);
        j45.l.j(this.f266728c.f266508d, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
