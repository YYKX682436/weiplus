package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class h1 implements com.tencent.mm.plugin.exdevice.model.b2 {
    public h1(com.tencent.mm.plugin.exdevice.model.j1 j1Var) {
    }

    @Override // com.tencent.mm.plugin.exdevice.model.b2
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
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", e, "", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON decode failed in receive notify callback");
                    com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "receive data = ".concat(new java.lang.String(bArr)));
                    com.tencent.mm.autogen.events.ExDeviceLanDeviceRecvDataEvent exDeviceLanDeviceRecvDataEvent = new com.tencent.mm.autogen.events.ExDeviceLanDeviceRecvDataEvent();
                    am.g6 g6Var = exDeviceLanDeviceRecvDataEvent.f54146g;
                    g6Var.f6741b = str2;
                    g6Var.f6742c = bArr;
                    g6Var.f6740a = str;
                    exDeviceLanDeviceRecvDataEvent.e();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "receive data = ".concat(new java.lang.String(bArr)));
                com.tencent.mm.autogen.events.ExDeviceLanDeviceRecvDataEvent exDeviceLanDeviceRecvDataEvent2 = new com.tencent.mm.autogen.events.ExDeviceLanDeviceRecvDataEvent();
                am.g6 g6Var2 = exDeviceLanDeviceRecvDataEvent2.f54146g;
                g6Var2.f6741b = str2;
                g6Var2.f6742c = bArr;
                g6Var2.f6740a = str;
                exDeviceLanDeviceRecvDataEvent2.e();
            }
        }
    }
}
