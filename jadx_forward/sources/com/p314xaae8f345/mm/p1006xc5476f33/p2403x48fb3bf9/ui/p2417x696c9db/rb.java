package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class rb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f268351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f268352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f268353f;

    public rb(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, int i17, int i18) {
        this.f268353f = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f268351d = i17;
        this.f268352e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268353f;
        nw4.n nVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265377p0;
        if (nVar != null) {
            nVar.L(this.f268351d, this.f268352e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c4 c4Var = viewOnCreateContextMenuListenerC19337x37f3384d.f265384r;
        if (c4Var != null) {
            c4Var.f265569g = false;
            c4Var.b();
        }
    }
}
