package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class da implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f265638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f265639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265640f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f265641g;

    public da(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, nw4.n nVar, java.lang.String str, int i17) {
        this.f265638d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f265639e = nVar;
        this.f265640f = str;
        this.f265641g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f265638d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing() || (nVar = this.f265639e) == null) {
            return;
        }
        if (!nVar.f422428i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onMediaFileUploadProgress fail, not ready");
            return;
        }
        int i17 = this.f265641g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str = this.f265640f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onMediaFileUploadProgress, local id : %s, percent : %d", str, valueOf);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.f66867x2a5c95c7, str);
        hashMap.put("percent", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.b0(nVar, nw4.x2.c("onMediaFileUploadProgress", hashMap, nVar.f422436q, nVar.f422437r)));
    }
}
