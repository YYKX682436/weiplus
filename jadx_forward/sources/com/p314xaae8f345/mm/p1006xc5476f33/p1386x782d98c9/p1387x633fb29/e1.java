package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class e1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.j1 f180414a;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.j1 j1Var) {
        this.f180414a = j1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2
    public void a(int i17, java.lang.Object... objArr) {
        java.lang.String str;
        java.lang.String str2;
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        if (i17 != 10 || objArr == null) {
            return;
        }
        java.lang.String str3 = null;
        try {
            jSONObject = new org.json.JSONObject(new java.lang.String((byte[]) objArr[0]));
            jSONObject2 = jSONObject.getJSONObject("deviceInfo");
            str2 = jSONObject2.getString("deviceType");
        } catch (java.lang.Exception e17) {
            e = e17;
            str = null;
        }
        try {
            str3 = jSONObject2.getString("deviceId");
            boolean isNull = jSONObject.isNull("manufacturerData");
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.j1 j1Var = this.f180414a;
            if (!isNull) {
                j1Var.f180468g.put(str3, jSONObject.getString("manufacturerData"));
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5354xdadf229a c5354xdadf229a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5354xdadf229a();
            am.h6 h6Var = c5354xdadf229a.f135680g;
            h6Var.f88357a = str3;
            if (j1Var.f180468g.containsKey(str3)) {
                java.util.HashMap hashMap = j1Var.f180468g;
                java.lang.String str4 = (java.lang.String) hashMap.get(str3);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    h6Var.f88358b = str4.getBytes();
                }
                hashMap.remove(str3);
            }
            c5354xdadf229a.e();
        } catch (java.lang.Exception e18) {
            e = e18;
            str = str3;
            str3 = str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", e, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "json decode failed in disc package callback!");
            str2 = str3;
            str3 = str;
            if (str2 != null) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "deviceType or deviceId is null in mWCLanDeviceDiscPackageCallbackReceiver! ");
        }
        if (str2 != null || str3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "deviceType or deviceId is null in mWCLanDeviceDiscPackageCallbackReceiver! ");
        }
    }
}
