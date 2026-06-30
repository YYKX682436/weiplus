package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class sb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f268404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f268405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f268406f;

    public sb(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, int i17, int i18) {
        this.f268406f = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f268404d = i17;
        this.f268405e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268406f;
        nw4.n nVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265377p0;
        if (nVar != null) {
            nVar.L(this.f268404d, this.f268405e);
        }
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265384r == null || !viewOnCreateContextMenuListenerC19337x37f3384d.t8()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c4 c4Var = viewOnCreateContextMenuListenerC19337x37f3384d.f265384r;
        c4Var.f265569g = true;
        c4Var.c();
    }
}
