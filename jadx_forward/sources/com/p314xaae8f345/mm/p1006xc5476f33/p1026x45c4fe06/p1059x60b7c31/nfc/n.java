package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc;

/* loaded from: classes7.dex */
public class n implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r f163950a;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r rVar) {
        this.f163950a = rVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.f
    /* renamed from: onResult */
    public void mo51151x57429edc(int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r rVar = this.f163950a;
        if (i17 != 0) {
            fd1.c.a(rVar.f163956n.mo48798x74292566(), i17, -1);
            rVar.D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(rVar, i17, "fail: " + str, hashMap));
            return;
        }
        if (!(rVar.f163956n.mo50352x76847179() instanceof android.app.Activity)) {
            rVar.D(rVar.o("fail: unknown error"));
            return;
        }
        android.app.Activity activity = (android.app.Activity) rVar.f163956n.mo50352x76847179();
        rVar.f163954i = activity;
        rVar.f163955m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.o(rVar);
        activity.getApplication().registerActivityLifecycleCallbacks(rVar.f163955m);
        final android.os.Handler m77777x504cd8a2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper());
        android.os.ResultReceiver resultReceiver = new android.os.ResultReceiver(m77777x504cd8a2) { // from class: com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE$3
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i18, android.os.Bundle bundle) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCEUI ResultReceiver resultCode: %d", java.lang.Integer.valueOf(i18));
                if (bundle == null || i18 != 10001) {
                    return;
                }
                int i19 = bundle.getInt("errCode", -1);
                java.lang.String string = bundle.getString("errMsg");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r rVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r.this;
                rVar2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCEUI onResult errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i19), string);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("errCode", java.lang.Integer.valueOf(i19));
                if (i19 != 0) {
                    fd1.c.a(rVar2.f163956n.mo48798x74292566(), i19, -1);
                    rVar2.D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(rVar2, i19, "fail: " + string, hashMap2));
                    return;
                }
                java.util.HashMap hashMap3 = new java.util.HashMap();
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                try {
                    org.json.JSONArray jSONArray = rVar2.f163958p.getJSONArray("aid_list");
                    int length = jSONArray.length();
                    boolean z17 = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "mData: %s, aidList: %s, length: %d", rVar2.f163958p.toString(), jSONArray.toString(), java.lang.Integer.valueOf(length));
                    for (int i27 = 0; i27 < length; i27++) {
                        arrayList.add(jSONArray.get(i27).toString());
                    }
                    java.util.List d17 = cd1.o.f122174n.d(rVar2.f163954i);
                    java.util.List b17 = cd1.p.b();
                    java.util.Iterator<java.lang.String> it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.String next = it.next();
                        if (((java.util.ArrayList) b17).contains(next)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiNFCStartHCE", "checkAidCanRegister fail, aid registered by liteapp payment, CANNOT regist with aid=%s", next);
                            z17 = false;
                            break;
                        }
                    }
                    if (!z17) {
                        rVar2.D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(rVar2, 13008, "fail: aid_list has registered by other apps", new java.util.HashMap()));
                        return;
                    }
                    if (d17 != null) {
                        arrayList.addAll(d17);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(rVar2.f163956n.mo48798x74292566(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.p(rVar2));
                    android.content.Intent intent = new android.content.Intent(rVar2.f163954i, (java.lang.Class<?>) rVar2.f163953h);
                    intent.putExtra("HCE_Result_Receiver", rVar2.f163964v);
                    intent.putExtra("key_appid", rVar2.f163956n.mo48798x74292566());
                    intent.putExtra("key_time_limit", rVar2.f163959q);
                    intent.putStringArrayListExtra("key_aid_list", arrayList);
                    synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.class) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.f163933b = false;
                    }
                    rVar2.f163954i.startService(intent);
                    rVar2.f163960r = java.lang.System.currentTimeMillis();
                    rVar2.f163961s = ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.q(rVar2), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                } catch (java.lang.Exception unused) {
                    hashMap3.put("errCode", 13003);
                    rVar2.D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(rVar2, 13003, "fail: aid_list invalid", hashMap3));
                    fd1.c.a(rVar2.f163956n.mo48798x74292566(), 13003, -1);
                }
            }
        };
        cd1.i iVar = cd1.i.f122155l;
        android.app.Activity activity2 = rVar.f163954i;
        iVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEActivityMgr", "setHceActivity");
        if (activity2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HCEActivityMgr", "setHceActivity hceActivity is null, or resultReceiver is null");
        }
        iVar.f122162g = activity2;
        iVar.f122163h = resultReceiver;
        iVar.f122158c = false;
        iVar.f122159d = false;
        iVar.f122157b = false;
        android.content.ComponentName componentName = new android.content.ComponentName(rVar.f163954i, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.hce.C12193x5bbe54ab.class.getCanonicalName());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEActivityMgr", "setPaymentServiceComponent");
        iVar.f122161f = componentName;
        iVar.a();
    }
}
