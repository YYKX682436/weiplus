package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class k8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f267144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f267145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f267146f;

    public k8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, nw4.n nVar, boolean z17) {
        this.f267144d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f267145e = nVar;
        this.f267146f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f267144d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing() || (nVar = this.f267145e) == null) {
            return;
        }
        if (!nVar.f422428i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onWXDeviceBTStateChange fail, not ready");
            return;
        }
        boolean z17 = this.f267146f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onWXDeviceBTStateChange: state = %s", java.lang.Boolean.valueOf(z17));
        java.util.HashMap hashMap = new java.util.HashMap();
        if (z17) {
            hashMap.put("state", "on");
        } else {
            hashMap.put("state", "off");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.u(nVar, nw4.x2.c("onWXDeviceBluetoothStateChange", hashMap, nVar.f422436q, nVar.f422437r)));
    }
}
