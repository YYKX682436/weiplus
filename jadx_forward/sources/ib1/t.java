package ib1;

/* loaded from: classes7.dex */
public class t extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f69911x366c91de = 173;

    /* renamed from: NAME */
    public static final java.lang.String f69912x24728b = "openBluetoothAdapter";

    /* renamed from: g, reason: collision with root package name */
    public boolean f371616g = false;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, final org.json.JSONObject jSONObject, final int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(0);
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBluetoothAdapter", "appid:%s openBluetoothAdapter!", mo48798x74292566);
        if (android.os.Build.VERSION.SDK_INT < 31) {
            C(lVar, jSONObject, i17, mo48798x74292566);
        } else if (this.f371616g) {
            D(nf.t.b(lVar.mo50352x76847179(), lVar, "android.permission.BLUETOOTH_CONNECT") ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4.f172012e : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4.f172013f, lVar, jSONObject, i17);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y.b(lVar, "android.permission.BLUETOOTH_CONNECT", 144, "", "", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3() { // from class: ib1.t$$a
                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3
                public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4 i4Var) {
                    ib1.t tVar = ib1.t.this;
                    tVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBluetoothAdapter", "onRequestPermissionResult, result: %s", i4Var);
                    tVar.f371616g = true;
                    tVar.D(i4Var, lVar, jSONObject, i17);
                }
            });
        }
    }

    public final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17, java.lang.String str) {
        ob1.m mVar;
        ib1.u uVar = new ib1.u(this, lVar);
        ib1.v vVar = new ib1.v(this, lVar);
        ib1.w wVar = new ib1.w(this, lVar);
        ib1.x xVar = new ib1.x(this, lVar);
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.f161579a;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.BleManager", "open appId:%s", str);
            if (qb1.b.c()) {
                java.util.Map map2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.f161579a;
                if (((java.util.HashMap) map2).containsKey(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.BleManager", "already open appId:%s", str);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e(str);
                    synchronized (eVar) {
                        kb1.c cVar = new kb1.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        eVar.f161591f = cVar;
                        cVar.a();
                        eVar.f161591f.f387755a.f399242c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.c(eVar);
                    }
                    ((java.util.concurrent.CopyOnWriteArrayList) eVar.f161592g).add(uVar);
                    ((java.util.concurrent.CopyOnWriteArrayList) eVar.f161593h).add(vVar);
                    kb1.c i18 = eVar.i();
                    if (i18 != null) {
                        i18.f387755a.f399243d = wVar;
                    }
                    kb1.c i19 = eVar.i();
                    if (i19 != null) {
                        i19.f387755a.f399244e = xVar;
                    }
                    ((java.util.HashMap) map2).put(str, eVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(str, eVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.g.f161602a.a(str, eVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.c();
                }
                if (qb1.b.b()) {
                    mVar = ob1.m.f425551e;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.BleManager", "bluetooth not enable, err");
                    mVar = ob1.m.f425555i;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.BleManager", "api version is below 18");
                mVar = ob1.m.f425561o;
            }
        }
        ob1.m E = E(lVar, mVar);
        java.util.HashMap hashMap = new java.util.HashMap();
        int i27 = E.f425571a;
        if (i27 == 0) {
            if (jSONObject != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBluetoothAdapter", "doSomeGlobalConfigAfterOpenBluetoothAdapter, data: " + jSONObject);
                if (jSONObject.has("refreshCache")) {
                    try {
                        boolean z17 = jSONObject.getBoolean("refreshCache");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.BleConfig", "setDefaultRefreshCache, defaultRefreshCache: " + z17);
                        kb1.b.f387749g = z17;
                    } catch (org.json.JSONException unused) {
                    }
                }
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            lVar.a(i17, t("ok", hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(1);
            return;
        }
        if (i27 == 10001) {
            hashMap.put("errCode", 10001);
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 1500102);
            lVar.a(i17, t("fail:not available", hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(2, 7);
            return;
        }
        if (i27 != 10009) {
            hashMap.put("errCode", java.lang.Integer.valueOf(i27));
            lVar.a(i17, q(E.f425572b, E.f425573c, hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(2);
        } else {
            hashMap.put("errCode", 10009);
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 1500105);
            lVar.a(i17, t("fail:system not support", hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(2, 8);
        }
    }

    public final void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4 i4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        int ordinal = i4Var.ordinal();
        if (ordinal == 0) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str2, jSONObject2));
            return;
        }
        if (ordinal == 1) {
            C(lVar, jSONObject, i17, lVar.mo48798x74292566());
            return;
        }
        if (ordinal != 2) {
            return;
        }
        str = android.text.TextUtils.isEmpty(null) ? "fail:system permission denied" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 3);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i17, u(str2, jSONObject3));
    }

    public ob1.m E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, ob1.m mVar) {
        return mVar;
    }
}
