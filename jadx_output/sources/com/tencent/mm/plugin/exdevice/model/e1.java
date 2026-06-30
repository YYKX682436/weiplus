package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class e1 implements com.tencent.mm.plugin.exdevice.model.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.j1 f98881a;

    public e1(com.tencent.mm.plugin.exdevice.model.j1 j1Var) {
        this.f98881a = j1Var;
    }

    @Override // com.tencent.mm.plugin.exdevice.model.b2
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
            com.tencent.mm.plugin.exdevice.model.j1 j1Var = this.f98881a;
            if (!isNull) {
                j1Var.f98935g.put(str3, jSONObject.getString("manufacturerData"));
            }
            com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent exDeviceLanDeviceScanResultEvent = new com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent();
            am.h6 h6Var = exDeviceLanDeviceScanResultEvent.f54147g;
            h6Var.f6824a = str3;
            if (j1Var.f98935g.containsKey(str3)) {
                java.util.HashMap hashMap = j1Var.f98935g;
                java.lang.String str4 = (java.lang.String) hashMap.get(str3);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    h6Var.f6825b = str4.getBytes();
                }
                hashMap.remove(str3);
            }
            exDeviceLanDeviceScanResultEvent.e();
        } catch (java.lang.Exception e18) {
            e = e18;
            str = str3;
            str3 = str2;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", e, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "json decode failed in disc package callback!");
            str2 = str3;
            str3 = str;
            if (str2 != null) {
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "deviceType or deviceId is null in mWCLanDeviceDiscPackageCallbackReceiver! ");
        }
        if (str2 != null || str3 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "deviceType or deviceId is null in mWCLanDeviceDiscPackageCallbackReceiver! ");
        }
    }
}
