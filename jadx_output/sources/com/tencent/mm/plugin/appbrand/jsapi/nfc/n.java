package com.tencent.mm.plugin.appbrand.jsapi.nfc;

/* loaded from: classes7.dex */
public class n implements com.tencent.mm.plugin.appbrand.jsapi.nfc.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.nfc.r f82417a;

    public n(com.tencent.mm.plugin.appbrand.jsapi.nfc.r rVar) {
        this.f82417a = rVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.nfc.f
    public void onResult(int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        final com.tencent.mm.plugin.appbrand.jsapi.nfc.r rVar = this.f82417a;
        if (i17 != 0) {
            fd1.c.a(rVar.f82423n.getAppId(), i17, -1);
            rVar.D(com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(rVar, i17, "fail: " + str, hashMap));
            return;
        }
        if (!(rVar.f82423n.getContext() instanceof android.app.Activity)) {
            rVar.D(rVar.o("fail: unknown error"));
            return;
        }
        android.app.Activity activity = (android.app.Activity) rVar.f82423n.getContext();
        rVar.f82421i = activity;
        rVar.f82422m = new com.tencent.mm.plugin.appbrand.jsapi.nfc.o(rVar);
        activity.getApplication().registerActivityLifecycleCallbacks(rVar.f82422m);
        final android.os.Handler createFreeHandler = com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper());
        android.os.ResultReceiver resultReceiver = new android.os.ResultReceiver(createFreeHandler) { // from class: com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE$3
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i18, android.os.Bundle bundle) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCEUI ResultReceiver resultCode: %d", java.lang.Integer.valueOf(i18));
                if (bundle == null || i18 != 10001) {
                    return;
                }
                int i19 = bundle.getInt("errCode", -1);
                java.lang.String string = bundle.getString("errMsg");
                com.tencent.mm.plugin.appbrand.jsapi.nfc.r rVar2 = com.tencent.mm.plugin.appbrand.jsapi.nfc.r.this;
                rVar2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCEUI onResult errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i19), string);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("errCode", java.lang.Integer.valueOf(i19));
                if (i19 != 0) {
                    fd1.c.a(rVar2.f82423n.getAppId(), i19, -1);
                    rVar2.D(com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(rVar2, i19, "fail: " + string, hashMap2));
                    return;
                }
                java.util.HashMap hashMap3 = new java.util.HashMap();
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                try {
                    org.json.JSONArray jSONArray = rVar2.f82425p.getJSONArray("aid_list");
                    int length = jSONArray.length();
                    boolean z17 = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "mData: %s, aidList: %s, length: %d", rVar2.f82425p.toString(), jSONArray.toString(), java.lang.Integer.valueOf(length));
                    for (int i27 = 0; i27 < length; i27++) {
                        arrayList.add(jSONArray.get(i27).toString());
                    }
                    java.util.List d17 = cd1.o.f40641n.d(rVar2.f82421i);
                    java.util.List b17 = cd1.p.b();
                    java.util.Iterator<java.lang.String> it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.String next = it.next();
                        if (((java.util.ArrayList) b17).contains(next)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiNFCStartHCE", "checkAidCanRegister fail, aid registered by liteapp payment, CANNOT regist with aid=%s", next);
                            z17 = false;
                            break;
                        }
                    }
                    if (!z17) {
                        rVar2.D(com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(rVar2, 13008, "fail: aid_list has registered by other apps", new java.util.HashMap()));
                        return;
                    }
                    if (d17 != null) {
                        arrayList.addAll(d17);
                    }
                    com.tencent.mm.plugin.appbrand.x0.a(rVar2.f82423n.getAppId(), new com.tencent.mm.plugin.appbrand.jsapi.nfc.p(rVar2));
                    android.content.Intent intent = new android.content.Intent(rVar2.f82421i, (java.lang.Class<?>) rVar2.f82420h);
                    intent.putExtra("HCE_Result_Receiver", rVar2.f82431v);
                    intent.putExtra("key_appid", rVar2.f82423n.getAppId());
                    intent.putExtra("key_time_limit", rVar2.f82426q);
                    intent.putStringArrayListExtra("key_aid_list", arrayList);
                    synchronized (com.tencent.mm.plugin.appbrand.jsapi.nfc.d.class) {
                        com.tencent.mm.plugin.appbrand.jsapi.nfc.d.f82400b = false;
                    }
                    rVar2.f82421i.startService(intent);
                    rVar2.f82427r = java.lang.System.currentTimeMillis();
                    rVar2.f82428s = ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.plugin.appbrand.jsapi.nfc.q(rVar2), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                } catch (java.lang.Exception unused) {
                    hashMap3.put("errCode", 13003);
                    rVar2.D(com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(rVar2, 13003, "fail: aid_list invalid", hashMap3));
                    fd1.c.a(rVar2.f82423n.getAppId(), 13003, -1);
                }
            }
        };
        cd1.i iVar = cd1.i.f40622l;
        android.app.Activity activity2 = rVar.f82421i;
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEActivityMgr", "setHceActivity");
        if (activity2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HCEActivityMgr", "setHceActivity hceActivity is null, or resultReceiver is null");
        }
        iVar.f40629g = activity2;
        iVar.f40630h = resultReceiver;
        iVar.f40625c = false;
        iVar.f40626d = false;
        iVar.f40624b = false;
        android.content.ComponentName componentName = new android.content.ComponentName(rVar.f82421i, com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService.class.getCanonicalName());
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEActivityMgr", "setPaymentServiceComponent");
        iVar.f40628f = componentName;
        iVar.a();
    }
}
