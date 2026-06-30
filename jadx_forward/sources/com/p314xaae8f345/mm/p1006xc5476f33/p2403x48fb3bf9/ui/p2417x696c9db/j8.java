package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class j8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f266396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f266397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266398f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f266399g;

    public j8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, nw4.n nVar, java.lang.String str, boolean z17) {
        this.f266396d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f266397e = nVar;
        this.f266398f = str;
        this.f266399g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f266396d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing() || (nVar = this.f266397e) == null) {
            return;
        }
        if (!nVar.f422428i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onWXDeviceBindStateChange fail, not ready");
            return;
        }
        boolean z17 = this.f266399g;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.String str = this.f266398f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onWXDeviceBindStateChange: device id = %s, isBound = %s", str, valueOf);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "parameter error!!!");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("deviceId", str);
        if (z17) {
            hashMap.put("state", "bind");
        } else {
            hashMap.put("state", "unbind");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.t(nVar, nw4.x2.c("onWXDeviceBindStateChange", hashMap, nVar.f422436q, nVar.f422437r)));
    }
}
