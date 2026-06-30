package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class i5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f267782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f267783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267785g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f267782d = z17;
        this.f267783e = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f267784f = kVar;
        this.f267785g = y2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switch publishImageEntry Button to ");
        boolean z17 = this.f267782d;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f267783e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z0 z0Var = viewOnCreateContextMenuListenerC19337x37f3384d.D2;
            if (z0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d2 = z0Var.f264909a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(viewOnCreateContextMenuListenerC19337x37f3384d2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = viewOnCreateContextMenuListenerC19337x37f3384d2.mo78514x143f1b92();
                if ((mo78514x143f1b92 != null ? mo78514x143f1b92.E(102) : null) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPublishImageEntryHelper", "addIconOptionMenu");
                    z0Var.f264909a.m78481x84f07bce(102, ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui() ? com.p314xaae8f345.mm.R.C30867xcad56011.pgw : com.p314xaae8f345.mm.R.C30867xcad56011.ooj, com.p314xaae8f345.mm.R.raw.f80864x3d22abcb, false, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.y0(z0Var));
                }
                com.p314xaae8f345.mm.ui.ga mo78514x143f1b922 = viewOnCreateContextMenuListenerC19337x37f3384d2.mo78514x143f1b92();
                if (mo78514x143f1b922 != null) {
                    mo78514x143f1b922.L0(false, 102, true);
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z0 z0Var2 = viewOnCreateContextMenuListenerC19337x37f3384d.D2;
            if (z0Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d3 = z0Var2.f264909a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(viewOnCreateContextMenuListenerC19337x37f3384d3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.p314xaae8f345.mm.ui.ga mo78514x143f1b923 = viewOnCreateContextMenuListenerC19337x37f3384d3.mo78514x143f1b92();
                if ((mo78514x143f1b923 != null ? mo78514x143f1b923.E(102) : null) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPublishImageEntryHelper", "removeOptionMenu invoke");
                    viewOnCreateContextMenuListenerC19337x37f3384d3.m78551x8f8ecf18(102);
                }
            }
        }
        nw4.g gVar = this.f267784f.f422396d;
        nw4.y2 y2Var = this.f267785g;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        return jz5.f0.f384359a;
    }
}
