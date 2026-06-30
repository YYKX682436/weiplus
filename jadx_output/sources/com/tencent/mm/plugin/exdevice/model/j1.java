package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.model.b2 f98929a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.model.b2 f98930b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.model.b2 f98931c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.model.b2 f98932d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f98933e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f98934f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f98935g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f98936h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.BroadcastReceiver f98937i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f98938j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f98939k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f98940l;

    /* renamed from: m, reason: collision with root package name */
    public int f98941m;

    public j1() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f98933e = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        this.f98934f = hashMap2;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        this.f98935g = hashMap3;
        this.f98936h = null;
        this.f98940l = false;
        this.f98938j = true;
        this.f98939k = true;
        hashMap.clear();
        hashMap2.clear();
        hashMap3.clear();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        this.f98936h = context;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        if (this.f98937i == null) {
            this.f98937i = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil$LanStateChangeReceiver
                @Override // android.content.BroadcastReceiver
                public void onReceive(android.content.Context context2, android.content.Intent intent) {
                    android.os.Parcelable parcelableExtra;
                    if (!"android.net.wifi.STATE_CHANGE".equals(intent.getAction()) || (parcelableExtra = intent.getParcelableExtra("networkInfo")) == null) {
                        return;
                    }
                    boolean z17 = ((android.net.NetworkInfo) parcelableExtra).getState() == android.net.NetworkInfo.State.CONNECTED;
                    com.tencent.mm.plugin.exdevice.model.j1 j1Var = com.tencent.mm.plugin.exdevice.model.j1.this;
                    if (j1Var.f98939k || j1Var.f98938j != z17) {
                        com.tencent.mm.autogen.events.ExDeviceLanDeviceStateChangeEvent exDeviceLanDeviceStateChangeEvent = new com.tencent.mm.autogen.events.ExDeviceLanDeviceStateChangeEvent();
                        exDeviceLanDeviceStateChangeEvent.f54148g.f6914a = z17;
                        exDeviceLanDeviceStateChangeEvent.e();
                        j1Var.f98939k = false;
                        j1Var.f98938j = z17;
                    }
                }
            };
        }
        context.registerReceiver(this.f98937i, intentFilter);
        this.f98929a = new com.tencent.mm.plugin.exdevice.model.e1(this);
        this.f98932d = new com.tencent.mm.plugin.exdevice.model.f1(this);
        this.f98930b = new com.tencent.mm.plugin.exdevice.model.g1(this);
        this.f98931c = new com.tencent.mm.plugin.exdevice.model.h1(this);
    }

    public boolean a(boolean z17, java.lang.String str) {
        if (str != null) {
            java.util.HashMap hashMap = this.f98933e;
            if (hashMap.containsKey(str)) {
                byte[] bArr = (byte[]) hashMap.get(str);
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "open device!");
                        jSONObject.put("cmd", "open");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "close device!");
                        jSONObject.put("cmd", "close");
                    }
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("wxmsg_jsapi", jSONObject);
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put(com.tencent.mapsdk.internal.cm.a_, jSONObject2);
                    if (com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.useWCLanDeviceServiceV2(bArr, jSONObject3.toString().getBytes()) != 0) {
                        return true;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "openOrCloseDevice error!");
                    return true;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", e17, "", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON encode failed in openOrCloseDevice");
                    return false;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "mDevClassInfo is null in openOrCloseDevice");
        return false;
    }
}
