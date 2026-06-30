package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class b8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f265486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f265487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f265488f;

    public b8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, nw4.n nVar, int i17) {
        this.f265486d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f265487e = nVar;
        this.f265488f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f265486d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing() || (nVar = this.f265487e) == null) {
            return;
        }
        if (!nVar.f422428i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onNfcTouch fail, not ready");
            return;
        }
        int i17 = this.f265488f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onNfcTouch errCode=%d", java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.l0(nVar, nw4.x2.c("onNfcTouch", hashMap, nVar.f422436q, nVar.f422437r)));
    }
}
