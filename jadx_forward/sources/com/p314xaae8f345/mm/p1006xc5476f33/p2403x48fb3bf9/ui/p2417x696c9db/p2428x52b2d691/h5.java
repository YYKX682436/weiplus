package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class h5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f267762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f267763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267765g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f267762d = z17;
        this.f267763e = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f267764f = kVar;
        this.f267765g = y2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show ting entry ");
        boolean z17 = this.f267762d;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f267763e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.l1 l1Var = viewOnCreateContextMenuListenerC19337x37f3384d.B2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d2 = l1Var.f264850a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(viewOnCreateContextMenuListenerC19337x37f3384d2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (viewOnCreateContextMenuListenerC19337x37f3384d2.mo78514x143f1b92().E(101) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTingEntryHelper", "menuInfo == null, can add!");
                l1Var.f264850a.m78481x84f07bce(101, com.p314xaae8f345.mm.R.C30867xcad56011.n3h, com.p314xaae8f345.mm.R.raw.f81406x9e8567e7, false, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.k1(l1Var));
            }
            viewOnCreateContextMenuListenerC19337x37f3384d2.mo78514x143f1b92().L0(false, 101, true);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d3 = viewOnCreateContextMenuListenerC19337x37f3384d.B2.f264850a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(viewOnCreateContextMenuListenerC19337x37f3384d3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (viewOnCreateContextMenuListenerC19337x37f3384d3.mo78514x143f1b92().E(101) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTingEntryHelper", "menuInfo == null, can remove!");
                viewOnCreateContextMenuListenerC19337x37f3384d3.m78551x8f8ecf18(101);
            }
        }
        nw4.g gVar = this.f267764f.f422396d;
        nw4.y2 y2Var = this.f267765g;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        return jz5.f0.f384359a;
    }
}
