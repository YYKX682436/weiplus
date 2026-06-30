package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f266363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f266364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266365f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f266366g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266367h;

    public i8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, nw4.n nVar, java.lang.String str, byte[] bArr, java.lang.String str2) {
        this.f266363d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f266364e = nVar;
        this.f266365f = str;
        this.f266366g = bArr;
        this.f266367h = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        byte[] bArr;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f266363d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing() || (nVar = this.f266364e) == null) {
            return;
        }
        if (!nVar.f422428i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onReceiveDataFromWXDevice fail, not ready");
            return;
        }
        java.lang.String str = this.f266365f;
        java.lang.String str2 = this.f266367h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onReceiveDataFromWXDevice: device id = %s, brandName = %s", str, str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || (bArr = this.f266366g) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "parameter error!!!");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("deviceId", str);
        hashMap.put("base64Data", android.util.Base64.encodeToString(bArr, 2));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.s(nVar, nw4.x2.c("onReceiveDataFromWXDevice", hashMap, nVar.f422436q, nVar.f422437r)));
    }
}
