package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class ca implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f265610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f265611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w f265612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265613g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f265614h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f265615i;

    public ca(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, nw4.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar, java.lang.String str, int i17, java.lang.Boolean bool) {
        this.f265610d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f265611e = nVar;
        this.f265612f = wVar;
        this.f265613g = str;
        this.f265614h = i17;
        this.f265615i = bool;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f265610d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing()) {
            return;
        }
        int i17 = this.f265614h;
        java.lang.String str = this.f265613g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar = this.f265612f;
        nw4.n nVar = this.f265611e;
        if (nVar != null && wVar != null) {
            wVar.c().getClass();
            nVar.t0(str, i17);
        } else {
            if (nVar != null && this.f265615i.booleanValue()) {
                nVar.t0(str, i17);
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(nVar == null);
            objArr[1] = java.lang.Boolean.valueOf(wVar == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewStubCallbackAIDLStub", "something null, %s, %s", objArr);
        }
    }
}
