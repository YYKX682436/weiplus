package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class d8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f265633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f265634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f265635f;

    public d8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, nw4.n nVar, java.util.Map map) {
        this.f265633d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f265634e = nVar;
        this.f265635f = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f265633d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing()) {
            return;
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.mo54449x3f86539a((java.lang.String) null);
        nw4.n nVar = this.f265634e;
        if (nVar != null) {
            nVar.r0(this.f265635f);
        }
    }
}
