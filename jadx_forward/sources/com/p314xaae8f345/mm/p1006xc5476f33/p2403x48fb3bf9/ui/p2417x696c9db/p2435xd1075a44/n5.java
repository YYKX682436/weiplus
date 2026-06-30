package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes9.dex */
public final class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 f268979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f268980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f268981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268982g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f268983h;

    public n5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var, int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f268979d = z5Var;
        this.f268980e = i17;
        this.f268981f = i18;
        this.f268982g = str;
        this.f268983h = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw4.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var = this.f268979d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = z5Var.m74886x86b9ebe3().T2;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        if (z5Var.m74885xb93408ad().get() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var2 = z5Var.m74885xb93408ad().get();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(z5Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.widget.MPWriteCommentLayout");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var3 = z5Var2;
            com.p314xaae8f345.mm.p944x882e457a.o rr6 = this.f268983h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rr6, "$rr");
            int i17 = this.f268981f;
            if (i17 != 0) {
                java.lang.String str = this.f268982g;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    db5.e1.y(z5Var3.getContext(), str, "", z5Var3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), null);
                    return;
                }
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = rr6.f152243a.f152217a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgLikeCommentReq");
            r45.k9 k9Var = (r45.k9) fVar;
            if (this.f268980e == 0 && i17 == 0) {
                int i18 = k9Var.f460035h;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = z5Var3.f269161v;
                if (i18 != 1) {
                    if (i18 == 2 && (nVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265377p0) != null) {
                        nVar.S("praiseComment", k9Var.f460032e, "", k9Var.f460036i, k9Var.f460034g);
                        return;
                    }
                    return;
                }
                nw4.n nVar2 = viewOnCreateContextMenuListenerC19337x37f3384d.f265377p0;
                if (nVar2 != null) {
                    nVar2.S("praiseComment", k9Var.f460032e, "", 0, k9Var.f460034g);
                }
            }
        }
    }
}
