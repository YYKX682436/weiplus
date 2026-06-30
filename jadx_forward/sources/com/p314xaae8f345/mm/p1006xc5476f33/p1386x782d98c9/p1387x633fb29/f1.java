package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class f1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.j1 f180419a;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.j1 j1Var) {
        this.f180419a = j1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2
    public void a(int i17, java.lang.Object... objArr) {
        java.lang.Exception e17;
        org.json.JSONObject jSONObject;
        java.lang.String str;
        if (i17 != 14 || objArr == null || objArr.length < 1) {
            return;
        }
        java.lang.Object obj = objArr[0];
        if (obj instanceof byte[]) {
            java.lang.String str2 = null;
            try {
                jSONObject = new org.json.JSONObject(new java.lang.String((byte[]) obj)).getJSONObject("deviceInfo");
                try {
                    str = jSONObject.getString("deviceType");
                } catch (java.lang.Exception e18) {
                    e17 = e18;
                    str = null;
                }
            } catch (java.lang.Exception e19) {
                e17 = e19;
                jSONObject = null;
                str = null;
            }
            try {
                str2 = jSONObject.getString("deviceId");
            } catch (java.lang.Exception e27) {
                e17 = e27;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON decode failed in get device profile callback %s", e17);
                if (str != null) {
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "deviceType or deviceId is null in mWCLanGetDeviceProfileCallbackReceiver! ");
                return;
            }
            if (str != null || str2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "deviceType or deviceId is null in mWCLanGetDeviceProfileCallbackReceiver! ");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "get device deviceType =" + str + ",deviceId = " + str2);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().P0(str2) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "hdInfo null, %s", str2);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.j1 j1Var = this.f180419a;
            j1Var.f180466e.put(str2, jSONObject.toString().getBytes());
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5354xdadf229a c5354xdadf229a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5354xdadf229a();
            am.h6 h6Var = c5354xdadf229a.f135680g;
            h6Var.f88357a = str2;
            java.util.HashMap hashMap = j1Var.f180468g;
            if (hashMap.containsKey(str2)) {
                java.lang.String str3 = (java.lang.String) hashMap.get(str2);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    h6Var.f88358b = str3.getBytes();
                }
                hashMap.remove(str2);
            }
            c5354xdadf229a.e();
        }
    }
}
