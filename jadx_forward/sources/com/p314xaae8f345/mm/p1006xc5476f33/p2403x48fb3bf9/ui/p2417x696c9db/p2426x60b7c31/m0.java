package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class m0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f266796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266797e;

    public m0(nw4.k kVar, nw4.y2 y2Var) {
        this.f266796d = kVar;
        this.f266797e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("ret", "fail");
        nw4.k kVar = this.f266796d;
        nw4.g gVar = kVar.f422396d;
        nw4.y2 y2Var = this.f266797e;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ':' + string, null);
        if (bundle.getInt("closeWindow", 0) == 1) {
            android.content.Context context = kVar.f422393a;
            if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).finish();
            }
        }
    }
}
