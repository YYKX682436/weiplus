package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2 f180462a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2 f180463b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2 f180464c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2 f180465d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f180466e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f180467f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f180468g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f180469h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.BroadcastReceiver f180470i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f180471j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f180472k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f180473l;

    /* renamed from: m, reason: collision with root package name */
    public int f180474m;

    public j1() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f180466e = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        this.f180467f = hashMap2;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        this.f180468g = hashMap3;
        this.f180469h = null;
        this.f180473l = false;
        this.f180471j = true;
        this.f180472k = true;
        hashMap.clear();
        hashMap2.clear();
        hashMap3.clear();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        this.f180469h = context;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        if (this.f180470i == null) {
            this.f180470i = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil$LanStateChangeReceiver
                @Override // android.content.BroadcastReceiver
                public void onReceive(android.content.Context context2, android.content.Intent intent) {
                    android.os.Parcelable parcelableExtra;
                    if (!"android.net.wifi.STATE_CHANGE".equals(intent.getAction()) || (parcelableExtra = intent.getParcelableExtra("networkInfo")) == null) {
                        return;
                    }
                    boolean z17 = ((android.net.NetworkInfo) parcelableExtra).getState() == android.net.NetworkInfo.State.CONNECTED;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.j1.this;
                    if (j1Var.f180472k || j1Var.f180471j != z17) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5355x1af9e9df c5355x1af9e9df = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5355x1af9e9df();
                        c5355x1af9e9df.f135681g.f88447a = z17;
                        c5355x1af9e9df.e();
                        j1Var.f180472k = false;
                        j1Var.f180471j = z17;
                    }
                }
            };
        }
        context.registerReceiver(this.f180470i, intentFilter);
        this.f180462a = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.e1(this);
        this.f180465d = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.f1(this);
        this.f180463b = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.g1(this);
        this.f180464c = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.h1(this);
    }

    public boolean a(boolean z17, java.lang.String str) {
        if (str != null) {
            java.util.HashMap hashMap = this.f180466e;
            if (hashMap.containsKey(str)) {
                byte[] bArr = (byte[]) hashMap.get(str);
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "open device!");
                        jSONObject.put("cmd", "open");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "close device!");
                        jSONObject.put("cmd", "close");
                    }
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("wxmsg_jsapi", jSONObject);
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cm.a_, jSONObject2);
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55044x275c3375(bArr, jSONObject3.toString().getBytes()) != 0) {
                        return true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "openOrCloseDevice error!");
                    return true;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON encode failed in openOrCloseDevice");
                    return false;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "mDevClassInfo is null in openOrCloseDevice");
        return false;
    }
}
