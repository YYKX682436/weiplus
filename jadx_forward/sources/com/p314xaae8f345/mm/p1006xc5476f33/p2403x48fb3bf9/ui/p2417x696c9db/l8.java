package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class l8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f267174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f267175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f267176f;

    public l8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, nw4.n nVar, boolean z17) {
        this.f267174d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f267175e = nVar;
        this.f267176f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f267174d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing() || (nVar = this.f267175e) == null) {
            return;
        }
        if (!nVar.f422428i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onWXDeviceLanStateChange fail, not ready");
            return;
        }
        boolean z17 = this.f267176f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onWXDeviceLanStateChange: state = %s", java.lang.Boolean.valueOf(z17));
        java.util.HashMap hashMap = new java.util.HashMap();
        if (z17) {
            hashMap.put("state", "on");
        } else {
            hashMap.put("state", "off");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.v(nVar, nw4.x2.c("onWXDeviceLanStateChange", hashMap, nVar.f422436q, nVar.f422437r)));
    }
}
