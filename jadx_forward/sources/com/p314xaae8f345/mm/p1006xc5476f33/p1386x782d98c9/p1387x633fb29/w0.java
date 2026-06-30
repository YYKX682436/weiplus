package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes.dex */
public class w0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0 f180614a;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0 z0Var) {
        this.f180614a = z0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2
    public void a(int i17, java.lang.Object... objArr) {
        if (i17 != 13 || objArr == null || objArr.length < 2) {
            return;
        }
        java.lang.Object obj = objArr[0];
        if (obj instanceof java.lang.String) {
            java.lang.Object obj2 = objArr[1];
            if (obj2 instanceof java.lang.Integer) {
                java.lang.String str = (java.lang.String) obj;
                int intValue = ((java.lang.Integer) obj2).intValue();
                java.lang.String str2 = null;
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(str));
                    str2 = jSONObject.getString("deviceId");
                    jSONObject.getString("deviceType");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "JSON decode failed in device ConnState notify callback");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0 z0Var = this.f180614a;
                if (intValue == -2 || intValue == -1 || intValue == 0) {
                    z0Var.B.put(str2, java.lang.Boolean.FALSE);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "device not connect stateCode = " + intValue);
                    return;
                }
                if (intValue != 1) {
                    return;
                }
                z0Var.B.put(str2, java.lang.Boolean.TRUE);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "device connect");
            }
        }
    }
}
