package pc1;

/* loaded from: classes7.dex */
public class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76398x366c91de = 221;

    /* renamed from: NAME */
    private static final java.lang.String f76399x24728b = "startBeaconDiscovery";

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 f434884g = null;

    /* renamed from: h, reason: collision with root package name */
    public pc1.c f434885h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, final org.json.JSONObject jSONObject, final int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartBeaconDiscovery", "startBeaconDiscovery data %s", jSONObject);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y.b(lVar, "android.permission.BLUETOOTH_SCAN", 144, "", "", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3() { // from class: pc1.g$$a
                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3
                public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4 i4Var) {
                    java.lang.String str;
                    java.lang.String str2;
                    pc1.g gVar = pc1.g.this;
                    gVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartBeaconDiscovery", "onRequestPermissionResult, result: %s", i4Var);
                    int ordinal = i4Var.ordinal();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = lVar;
                    int i18 = i17;
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
                        lVar2.a(i18, gVar.u(str2, jSONObject2));
                        return;
                    }
                    if (ordinal == 1) {
                        gVar.C(lVar2, jSONObject, i18);
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
                    lVar2.a(i18, gVar.u(str2, jSONObject3));
                }
            });
        } else {
            C(lVar, jSONObject, i17);
        }
    }

    public final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        nm5.b c17;
        java.util.UUID[] uuidArr = null;
        if (jSONObject.has("uuids")) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("uuids"));
                uuidArr = new java.util.UUID[jSONArray.length()];
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    uuidArr[i18] = java.util.UUID.fromString(jSONArray.getString(i18));
                }
            } catch (org.json.JSONException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartBeaconDiscovery", "get uuid error!");
            }
        }
        if (uuidArr == null || uuidArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartBeaconDiscovery", "serviceUuids is empty");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 11006);
            lVar.a(i17, p("fail:invalid data", hashMap));
            return;
        }
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        java.lang.String mo48798x742925662 = lVar.mo48798x74292566();
        java.util.Map map = pc1.e.f434881a;
        pc1.d dVar = (pc1.d) ((java.util.concurrent.ConcurrentHashMap) map).get(mo48798x742925662);
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartBeaconDiscovery", "beaconWorker init");
            dVar = new pc1.d();
            ((java.util.concurrent.ConcurrentHashMap) map).put(mo48798x74292566, dVar);
            if (pc1.e.f434882b == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BeaconManager", "bluetoothStateListener init");
                pc1.e.f434882b = new pc1.a();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(pc1.e.f434882b, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            }
        }
        if (this.f434885h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartBeaconDiscovery", "onBeaconScanCallback init");
            this.f434885h = new pc1.h(this, lVar);
        }
        if (this.f434884g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartBeaconDiscovery", "listener init");
            this.f434884g = new pc1.i(this, lVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(lVar.mo48798x74292566(), this.f434884g);
        }
        dVar.f434875c = uuidArr;
        dVar.f434876d = this.f434885h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BeaconManager", "BeaconWorker:%d start", java.lang.Integer.valueOf(dVar.hashCode()));
        synchronized (dVar) {
            z17 = dVar.f434877e;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BeaconManager", "BeaconWorker:%d, already start", java.lang.Integer.valueOf(dVar.hashCode()));
            c17 = nm5.j.c(11003, "fail:already start");
        } else if (fp.h.a(18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BeaconManager", "API version is below 18!");
            c17 = nm5.j.c(11000, "fail:not support");
        } else {
            android.bluetooth.BluetoothAdapter bluetoothAdapter = dVar.f434873a;
            if (bluetoothAdapter == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BeaconManager", "bluetoothAdapter is null!");
                c17 = nm5.j.c(11001, "fail:bluetooth service is unavailable");
            } else if (!bluetoothAdapter.isEnabled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BeaconManager", "bluetoothAdapter is not enabled!");
                c17 = nm5.j.c(11001, "fail:bluetooth service is unavailable");
            } else if (dVar.f434873a.isDiscovering()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BeaconManager", "bluetoothAdapter is Discovering!");
                c17 = nm5.j.c(11003, "fail:already start");
            } else {
                ((java.util.concurrent.ConcurrentHashMap) dVar.f434874b).clear();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BeaconManager", "[BluetoothTrace] start scan");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BeaconManager", new java.lang.Throwable(), "[BluetoothTrace] ble scan stacktrace", new java.lang.Object[0]);
                android.bluetooth.BluetoothAdapter bluetoothAdapter2 = dVar.f434873a;
                android.bluetooth.BluetoothAdapter.LeScanCallback leScanCallback = dVar.f434880h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(leScanCallback);
                java.util.Collections.reverse(arrayList);
                boolean booleanValue = ((java.lang.Boolean) yj0.a.k(bluetoothAdapter2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/ibeacon/BeaconManager$BeaconWorker", "start", "()Lcom/tencent/mm/vending/tuple/Tuple2;", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BeaconManager", "startLeScan:%b", java.lang.Boolean.valueOf(booleanValue));
                if (booleanValue) {
                    dVar.f434877e = true;
                    c17 = nm5.j.c(0, "");
                } else {
                    c17 = nm5.j.c(11005, "fail:system error");
                }
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("errCode", c17.a(0));
        lVar.a(i17, p(((java.lang.Integer) c17.a(0)).intValue() == 0 ? "ok" : (java.lang.String) c17.a(1), hashMap2));
    }
}
