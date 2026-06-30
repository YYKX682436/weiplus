package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class s8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f268398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f268399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f268401g;

    public s8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, nw4.n nVar, java.lang.String str, float f17) {
        this.f268398d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f268399e = nVar;
        this.f268400f = str;
        this.f268401g = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268398d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing() || (nVar = this.f268399e) == null) {
            return;
        }
        if (!nVar.f422428i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "not ready");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("postId", this.f268400f);
        hashMap.put("percent", java.lang.Float.valueOf(this.f268401g));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.e2(nVar, nw4.x2.c("onPublishHaowanProgress", hashMap, nVar.f422436q, nVar.f422437r)));
    }
}
