package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc;

/* loaded from: classes7.dex */
public class r extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.h {

    /* renamed from: CTRL_INDEX */
    public static final int f34562x366c91de = 352;

    /* renamed from: NAME */
    public static final java.lang.String f34563x24728b = "startHCE";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Class f163953h;

    /* renamed from: p, reason: collision with root package name */
    public org.json.JSONObject f163958p;

    /* renamed from: q, reason: collision with root package name */
    public int f163959q;

    /* renamed from: s, reason: collision with root package name */
    public java.util.concurrent.Future f163961s;

    /* renamed from: v, reason: collision with root package name */
    public final android.os.ResultReceiver f163964v;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Activity f163954i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.app.Application.ActivityLifecycleCallbacks f163955m = null;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163956n = null;

    /* renamed from: o, reason: collision with root package name */
    public int f163957o = -1;

    /* renamed from: r, reason: collision with root package name */
    public long f163960r = -1;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Object f163962t = new java.lang.Object();

    /* renamed from: u, reason: collision with root package name */
    public boolean f163963u = false;

    public r(java.lang.Class cls) {
        final android.os.Handler m77777x504cd8a2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper());
        this.f163964v = new android.os.ResultReceiver(m77777x504cd8a2) { // from class: com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE$6
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                boolean z17;
                boolean z18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "mHCEServiceResultReceiver resultCode: %d", java.lang.Integer.valueOf(i17));
                if (bundle == null || i17 != 10002) {
                    return;
                }
                int i18 = bundle.getInt("key_event_type", -1);
                java.lang.String string = bundle.getString("key_appid");
                int i19 = bundle.getInt("errCode", -1);
                java.lang.String string2 = bundle.getString("errMsg");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "mHCEServiceResultReceiver onReceiveResult eventType: %d, appId: %s", java.lang.Integer.valueOf(i18), string);
                if (i18 != 12) {
                    if (i18 == 31 || i18 == 41) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r.this.f163956n;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.a.f163931i;
                        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.a.class) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EventOnHCEMessageReceived", "EventOnHCEMessageReceived dispatch appId: %s, eventType: %d", lVar.mo48798x74292566(), java.lang.Integer.valueOf(i18));
                            if (i18 == 31) {
                                java.lang.String string3 = bundle.getString("key_apdu_command");
                                java.util.HashMap hashMap = new java.util.HashMap();
                                hashMap.put("messageType", 1);
                                hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, string3);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.a aVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.a.f163931i;
                                aVar2.p(lVar);
                                aVar2.t(hashMap);
                                aVar2.m();
                            } else if (i18 == 41) {
                                java.util.HashMap hashMap2 = new java.util.HashMap();
                                hashMap2.put("messageType", 2);
                                hashMap2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, java.lang.Integer.valueOf(bundle.getInt("key_on_deactivated_reason")));
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.a aVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.a.f163931i;
                                aVar3.p(lVar);
                                aVar3.t(hashMap2);
                                aVar3.m();
                            }
                        }
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r.this;
                synchronized (rVar.f163962t) {
                    z17 = rVar.f163963u;
                    if (!z17) {
                        rVar.f163963u = true;
                    }
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCE onStartHCEFinish has finished, return");
                    return;
                }
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.class) {
                    z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.f163933b;
                }
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCE onStartHCEOvertime has stop, return");
                    return;
                }
                java.util.HashMap hashMap3 = new java.util.HashMap();
                int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - rVar.f163960r);
                java.util.concurrent.Future future = rVar.f163961s;
                if (future != null) {
                    future.cancel(false);
                    rVar.f163961s = null;
                }
                if (string != null && !string.equals(rVar.f163956n.mo48798x74292566())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiNFCStartHCE", "start HCESevice callback appId invalid, appId: %s", string);
                    hashMap3.put("errCode", 13010);
                    fd1.c.a(rVar.f163956n.mo48798x74292566(), 13010, currentTimeMillis);
                    rVar.D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(rVar, 13010, "fail: unknown error", hashMap3));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "HCE start HCEService callback onRefreshed errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i19), string2);
                if (i19 == 0) {
                    java.lang.String mo48798x74292566 = rVar.f163956n.mo48798x74292566();
                    java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.f163932a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 v0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.f163934c;
                    if (str != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEEventLogic", "remove HCELifeCycleListener before add, appId: %s", str);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.f163932a, v0Var);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.f163932a = mo48798x74292566;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(mo48798x74292566, v0Var);
                    hashMap3.put("errCode", java.lang.Integer.valueOf(i19));
                    rVar.D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(rVar, i19, "ok", hashMap3));
                } else {
                    hashMap3.put("errCode", java.lang.Integer.valueOf(i19));
                    rVar.D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(rVar, i19, "fail: " + string2, hashMap3));
                }
                fd1.c.a(rVar.f163956n.mo48798x74292566(), i19, currentTimeMillis);
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.class) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.f163933b = true;
                }
            }
        };
        if (cls == null) {
            this.f163953h = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.hce.C12193x5bbe54ab.class;
        } else {
            this.f163953h = cls;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "appbrand start HCE, data: %s", jSONObject.toString());
        this.f163956n = lVar;
        this.f163957o = i17;
        this.f163958p = jSONObject;
        synchronized (this.f163962t) {
            this.f163963u = false;
        }
        this.f163959q = this.f163958p.optInt("time_limit", 1500);
        C(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.n(this), false);
    }

    public final void D(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCE callback result: %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f163956n;
        if (lVar != null) {
            lVar.a(this.f163957o, str);
        }
        if (this.f163954i == null || this.f163955m == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCE callback unregister lifecycle callback");
        this.f163954i.getApplication().unregisterActivityLifecycleCallbacks(this.f163955m);
    }
}
