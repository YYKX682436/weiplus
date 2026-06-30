package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class h1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2 {
    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.j1 j1Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2
    public void a(int i17, java.lang.Object... objArr) {
        java.lang.String str;
        org.json.JSONObject jSONObject;
        if (i17 != 16 || objArr == null || objArr.length < 2) {
            return;
        }
        java.lang.Object obj = objArr[0];
        if (obj instanceof java.lang.String) {
            java.lang.Object obj2 = objArr[1];
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                java.lang.String str2 = null;
                try {
                    jSONObject = new org.json.JSONObject(new java.lang.String((java.lang.String) obj));
                    str = jSONObject.getString("deviceType");
                } catch (java.lang.Exception e17) {
                    e = e17;
                    str = null;
                }
                try {
                    str2 = jSONObject.getString("deviceId");
                } catch (java.lang.Exception e18) {
                    e = e18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", e, "", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON decode failed in receive notify callback");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "receive data = ".concat(new java.lang.String(bArr)));
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5353xe5d9c124 c5353xe5d9c124 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5353xe5d9c124();
                    am.g6 g6Var = c5353xe5d9c124.f135679g;
                    g6Var.f88274b = str2;
                    g6Var.f88275c = bArr;
                    g6Var.f88273a = str;
                    c5353xe5d9c124.e();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "receive data = ".concat(new java.lang.String(bArr)));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5353xe5d9c124 c5353xe5d9c1242 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5353xe5d9c124();
                am.g6 g6Var2 = c5353xe5d9c1242.f135679g;
                g6Var2.f88274b = str2;
                g6Var2.f88275c = bArr;
                g6Var2.f88273a = str;
                c5353xe5d9c1242.e();
            }
        }
    }
}
