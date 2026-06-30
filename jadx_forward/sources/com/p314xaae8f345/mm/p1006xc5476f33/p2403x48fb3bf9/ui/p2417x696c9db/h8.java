package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class h8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f266334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f266335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f266337g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f266338h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f266339i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w f266340m;

    public h8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, nw4.n nVar, java.lang.String str, byte[] bArr, boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar) {
        this.f266334d = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f266335e = nVar;
        this.f266336f = str;
        this.f266337g = bArr;
        this.f266338h = z17;
        this.f266339i = z18;
        this.f266340m = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f266334d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing()) {
            return;
        }
        nw4.n nVar = this.f266335e;
        if (nVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubCallbackAIDLStub", "hakon can not call onScanWXDeviceResult, %s, %s", nVar, this.f266340m);
            return;
        }
        boolean z17 = this.f266339i;
        if (!nVar.f422428i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onScanWXDeviceResult fail, not ready");
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z18 = false;
        java.lang.String str = this.f266336f;
        objArr[0] = str;
        boolean z19 = this.f266338h;
        objArr[1] = java.lang.Boolean.valueOf(z19);
        byte[] bArr = this.f266337g;
        objArr[2] = java.lang.Integer.valueOf(bArr == null ? 0 : bArr.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onScanWXDeviceResult: device id = %s, isCompleted = %s, %s", objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "parameter error!!!");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("deviceId", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2406x60b7c31.p2407x782d98c9.b.d().getClass();
            if (bArr != null && bArr.length >= 9 && bArr[bArr.length - 7] == 1 && bArr[bArr.length - 8] == 1 && bArr[bArr.length - 9] == -2) {
                z18 = true;
            }
            if (z18 || (bArr != null && z17)) {
                jSONObject2.put("base64BroadcastData", android.util.Base64.encodeToString(bArr, 2));
            }
            jSONArray.put(jSONObject2);
            jSONObject.put("devices", jSONArray);
            if (z19) {
                jSONObject.put("isCompleted", "1");
            } else {
                jSONObject.put("isCompleted", "0");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "Ex in onScanWXDeviceResult, %s", e17.getMessage());
        }
        java.lang.String d17 = nw4.x2.d("onScanWXDeviceResult", jSONObject, nVar.f422436q, nVar.f422437r);
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "hakon onScanWXDeviceResult, %s", d17);
            nVar.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + d17 + ")", null);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiHandler", "onScanWXDeviceResult, %s", e18.getMessage());
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2406x60b7c31.p2407x782d98c9.b.d().getClass();
    }
}
