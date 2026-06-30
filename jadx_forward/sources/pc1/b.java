package pc1;

/* loaded from: classes7.dex */
public class b implements android.bluetooth.BluetoothAdapter.LeScanCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc1.d f434872d;

    public b(pc1.d dVar) {
        this.f434872d = dVar;
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        java.util.Iterator it;
        boolean z17;
        double pow;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BeaconManager", "valueByte is null or nil");
            return;
        }
        java.util.Map map = pc1.e.f434881a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BeaconManager", "handleScanDataV2, device: " + bluetoothDevice);
        pb1.z a17 = pb1.z.a(bArr);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BeaconManager", "handleScanDataV2, scanRecordCompat is null");
        } else {
            java.util.LinkedHashMap linkedHashMap = a17.f434699c;
            if (linkedHashMap == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BeaconManager", "handleScanDataV2, id2ManufacturerData is null");
            } else {
                java.util.Iterator it6 = linkedHashMap.values().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    byte[] bArr2 = (byte[]) it6.next();
                    if (bArr2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BeaconManager", "handleScanDataV2, manufacturerData is null");
                        break;
                    }
                    if (22 >= bArr2.length) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BeaconManager", "handleManufacturerData, manufacturerData is too short");
                    } else if ((bArr2[0] & 255) == 2 && (bArr2[1] & 255) == 21) {
                        byte[] bArr3 = new byte[16];
                        java.lang.System.arraycopy(bArr2, 2, bArr3, 0, 16);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        for (int i18 = 0; i18 < 16; i18++) {
                            int i19 = bArr3[i18] & 255;
                            if (i19 < 16) {
                                sb6.append("0");
                            }
                            sb6.append(java.lang.Integer.toHexString(i19));
                        }
                        java.lang.String upperCase = sb6.toString().toUpperCase(java.util.Locale.US);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(upperCase)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BeaconManager", "handleManufacturerData, hexString is null, err");
                        } else {
                            java.lang.String str = upperCase.substring(0, 8) + "-" + upperCase.substring(8, 12) + "-" + upperCase.substring(12, 16) + "-" + upperCase.substring(16, 20) + "-" + upperCase.substring(20, 32);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BeaconManager", "handleManufacturerData, strUuid %s", str);
                            java.util.UUID fromString = java.util.UUID.fromString(str);
                            pc1.d dVar = this.f434872d;
                            java.util.UUID[] uuidArr = dVar.f434875c;
                            java.util.Map map2 = dVar.f434879g;
                            int length = uuidArr.length;
                            int i27 = 0;
                            while (true) {
                                if (i27 >= length) {
                                    z17 = false;
                                    break;
                                } else {
                                    if (uuidArr[i27].equals(fromString)) {
                                        z17 = true;
                                        break;
                                    }
                                    i27++;
                                }
                            }
                            if (z17) {
                                int i28 = ((bArr2[18] & 255) * 256) + (bArr2[19] & 255);
                                int i29 = ((bArr2[20] & 255) * 256) + (bArr2[21] & 255);
                                byte b17 = bArr2[22];
                                double d17 = i17;
                                if (d17 == 0.0d) {
                                    pow = -1.0d;
                                    it = it6;
                                } else {
                                    it = it6;
                                    double d18 = (d17 * 1.0d) / b17;
                                    pow = d18 < 1.0d ? java.lang.Math.pow(d18, 10.0d) : 0.54992d + (java.lang.Math.pow(d18, 9.9476d) * 0.92093d);
                                }
                                java.lang.String address = bluetoothDevice.getAddress();
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                try {
                                    jSONObject.put("uuid", fromString);
                                    jSONObject.put("major", i28);
                                    jSONObject.put("minor", i29);
                                    jSONObject.put("proximity", 0);
                                    jSONObject.put("accuracy", pow);
                                    jSONObject.put("rssi", i17);
                                    ((java.util.concurrent.ConcurrentHashMap) dVar.f434874b).put(address, jSONObject);
                                    ((java.util.concurrent.ConcurrentHashMap) map2).put(address, jSONObject);
                                } catch (org.json.JSONException e17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BeaconManager", "handleManufacturerData, put JSON data error : %s", e17);
                                }
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                if (currentTimeMillis - dVar.f434878f > 500) {
                                    pc1.c cVar = dVar.f434876d;
                                    if (cVar != null) {
                                        pc1.h hVar = (pc1.h) cVar;
                                        org.json.JSONArray jSONArray = new org.json.JSONArray();
                                        for (org.json.JSONObject jSONObject2 : ((java.util.concurrent.ConcurrentHashMap) map2).values()) {
                                            if (jSONObject2 != null) {
                                                jSONArray.put(jSONObject2);
                                            }
                                        }
                                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                        try {
                                            jSONObject3.put("beacons", jSONArray);
                                        } catch (org.json.JSONException e18) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartBeaconDiscovery", "put res JSON data error : %s", e18);
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = hVar.f434892c;
                                        int mo50260x9f1221c2 = lVar.mo50260x9f1221c2();
                                        pc1.k kVar = hVar.f434890a;
                                        kVar.p(lVar);
                                        kVar.f163909h = mo50260x9f1221c2;
                                        kVar.f163907f = jSONObject3.toString();
                                        kVar.m();
                                    }
                                    dVar.f434878f = currentTimeMillis;
                                    ((java.util.concurrent.ConcurrentHashMap) map2).clear();
                                }
                                it6 = it;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BeaconManager", "handleManufacturerData, not found beacon!");
                            }
                        }
                    }
                    it = it6;
                    it6 = it;
                }
            }
        }
    }
}
