package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class r8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f268344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f268345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f268347g;

    public r8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, nw4.n nVar, java.lang.String str, int i17) {
        this.f268344d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f268345e = nVar;
        this.f268346f = str;
        this.f268347g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268344d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing() || (nVar = this.f268345e) == null) {
            return;
        }
        if (!nVar.f422428i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "not ready");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("postId", this.f268346f);
        hashMap.put("result", java.lang.Integer.valueOf(this.f268347g));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.d2(nVar, nw4.x2.c("onPublishHaowanEnd", hashMap, nVar.f422436q, nVar.f422437r)));
    }
}
