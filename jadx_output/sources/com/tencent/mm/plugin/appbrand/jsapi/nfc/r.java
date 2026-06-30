package com.tencent.mm.plugin.appbrand.jsapi.nfc;

/* loaded from: classes7.dex */
public class r extends com.tencent.mm.plugin.appbrand.jsapi.nfc.h {
    public static final int CTRL_INDEX = 352;
    public static final java.lang.String NAME = "startHCE";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Class f82420h;

    /* renamed from: p, reason: collision with root package name */
    public org.json.JSONObject f82425p;

    /* renamed from: q, reason: collision with root package name */
    public int f82426q;

    /* renamed from: s, reason: collision with root package name */
    public java.util.concurrent.Future f82428s;

    /* renamed from: v, reason: collision with root package name */
    public final android.os.ResultReceiver f82431v;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Activity f82421i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.app.Application.ActivityLifecycleCallbacks f82422m = null;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f82423n = null;

    /* renamed from: o, reason: collision with root package name */
    public int f82424o = -1;

    /* renamed from: r, reason: collision with root package name */
    public long f82427r = -1;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Object f82429t = new java.lang.Object();

    /* renamed from: u, reason: collision with root package name */
    public boolean f82430u = false;

    public r(java.lang.Class cls) {
        final android.os.Handler createFreeHandler = com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper());
        this.f82431v = new android.os.ResultReceiver(createFreeHandler) { // from class: com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE$6
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                boolean z17;
                boolean z18;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "mHCEServiceResultReceiver resultCode: %d", java.lang.Integer.valueOf(i17));
                if (bundle == null || i17 != 10002) {
                    return;
                }
                int i18 = bundle.getInt("key_event_type", -1);
                java.lang.String string = bundle.getString("key_appid");
                int i19 = bundle.getInt("errCode", -1);
                java.lang.String string2 = bundle.getString("errMsg");
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "mHCEServiceResultReceiver onReceiveResult eventType: %d, appId: %s", java.lang.Integer.valueOf(i18), string);
                if (i18 != 12) {
                    if (i18 == 31 || i18 == 41) {
                        com.tencent.mm.plugin.appbrand.jsapi.l lVar = com.tencent.mm.plugin.appbrand.jsapi.nfc.r.this.f82423n;
                        com.tencent.mm.plugin.appbrand.jsapi.nfc.a aVar = com.tencent.mm.plugin.appbrand.jsapi.nfc.a.f82398i;
                        synchronized (com.tencent.mm.plugin.appbrand.jsapi.nfc.a.class) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.EventOnHCEMessageReceived", "EventOnHCEMessageReceived dispatch appId: %s, eventType: %d", lVar.getAppId(), java.lang.Integer.valueOf(i18));
                            if (i18 == 31) {
                                java.lang.String string3 = bundle.getString("key_apdu_command");
                                java.util.HashMap hashMap = new java.util.HashMap();
                                hashMap.put("messageType", 1);
                                hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, string3);
                                com.tencent.mm.plugin.appbrand.jsapi.nfc.a aVar2 = com.tencent.mm.plugin.appbrand.jsapi.nfc.a.f82398i;
                                aVar2.p(lVar);
                                aVar2.t(hashMap);
                                aVar2.m();
                            } else if (i18 == 41) {
                                java.util.HashMap hashMap2 = new java.util.HashMap();
                                hashMap2.put("messageType", 2);
                                hashMap2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, java.lang.Integer.valueOf(bundle.getInt("key_on_deactivated_reason")));
                                com.tencent.mm.plugin.appbrand.jsapi.nfc.a aVar3 = com.tencent.mm.plugin.appbrand.jsapi.nfc.a.f82398i;
                                aVar3.p(lVar);
                                aVar3.t(hashMap2);
                                aVar3.m();
                            }
                        }
                        return;
                    }
                    return;
                }
                com.tencent.mm.plugin.appbrand.jsapi.nfc.r rVar = com.tencent.mm.plugin.appbrand.jsapi.nfc.r.this;
                synchronized (rVar.f82429t) {
                    z17 = rVar.f82430u;
                    if (!z17) {
                        rVar.f82430u = true;
                    }
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCE onStartHCEFinish has finished, return");
                    return;
                }
                synchronized (com.tencent.mm.plugin.appbrand.jsapi.nfc.d.class) {
                    z18 = com.tencent.mm.plugin.appbrand.jsapi.nfc.d.f82400b;
                }
                if (z18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCE onStartHCEOvertime has stop, return");
                    return;
                }
                java.util.HashMap hashMap3 = new java.util.HashMap();
                int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - rVar.f82427r);
                java.util.concurrent.Future future = rVar.f82428s;
                if (future != null) {
                    future.cancel(false);
                    rVar.f82428s = null;
                }
                if (string != null && !string.equals(rVar.f82423n.getAppId())) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiNFCStartHCE", "start HCESevice callback appId invalid, appId: %s", string);
                    hashMap3.put("errCode", 13010);
                    fd1.c.a(rVar.f82423n.getAppId(), 13010, currentTimeMillis);
                    rVar.D(com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(rVar, 13010, "fail: unknown error", hashMap3));
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "HCE start HCEService callback onRefreshed errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i19), string2);
                if (i19 == 0) {
                    java.lang.String appId = rVar.f82423n.getAppId();
                    java.lang.String str = com.tencent.mm.plugin.appbrand.jsapi.nfc.d.f82399a;
                    com.tencent.mm.plugin.appbrand.v0 v0Var = com.tencent.mm.plugin.appbrand.jsapi.nfc.d.f82401c;
                    if (str != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.HCEEventLogic", "remove HCELifeCycleListener before add, appId: %s", str);
                        com.tencent.mm.plugin.appbrand.x0.e(com.tencent.mm.plugin.appbrand.jsapi.nfc.d.f82399a, v0Var);
                    }
                    com.tencent.mm.plugin.appbrand.jsapi.nfc.d.f82399a = appId;
                    com.tencent.mm.plugin.appbrand.x0.a(appId, v0Var);
                    hashMap3.put("errCode", java.lang.Integer.valueOf(i19));
                    rVar.D(com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(rVar, i19, "ok", hashMap3));
                } else {
                    hashMap3.put("errCode", java.lang.Integer.valueOf(i19));
                    rVar.D(com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(rVar, i19, "fail: " + string2, hashMap3));
                }
                fd1.c.a(rVar.f82423n.getAppId(), i19, currentTimeMillis);
                synchronized (com.tencent.mm.plugin.appbrand.jsapi.nfc.d.class) {
                    com.tencent.mm.plugin.appbrand.jsapi.nfc.d.f82400b = true;
                }
            }
        };
        if (cls == null) {
            this.f82420h = com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService.class;
        } else {
            this.f82420h = cls;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "appbrand start HCE, data: %s", jSONObject.toString());
        this.f82423n = lVar;
        this.f82424o = i17;
        this.f82425p = jSONObject;
        synchronized (this.f82429t) {
            this.f82430u = false;
        }
        this.f82426q = this.f82425p.optInt("time_limit", 1500);
        C(new com.tencent.mm.plugin.appbrand.jsapi.nfc.n(this), false);
    }

    public final void D(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCE callback result: %s", str);
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82423n;
        if (lVar != null) {
            lVar.a(this.f82424o, str);
        }
        if (this.f82421i == null || this.f82422m == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCE callback unregister lifecycle callback");
        this.f82421i.getApplication().unregisterActivityLifecycleCallbacks(this.f82422m);
    }
}
