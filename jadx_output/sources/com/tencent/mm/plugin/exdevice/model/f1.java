package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class f1 implements com.tencent.mm.plugin.exdevice.model.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.j1 f98886a;

    public f1(com.tencent.mm.plugin.exdevice.model.j1 j1Var) {
        this.f98886a = j1Var;
    }

    @Override // com.tencent.mm.plugin.exdevice.model.b2
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
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON decode failed in get device profile callback %s", e17);
                if (str != null) {
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "deviceType or deviceId is null in mWCLanGetDeviceProfileCallbackReceiver! ");
                return;
            }
            if (str != null || str2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "deviceType or deviceId is null in mWCLanGetDeviceProfileCallbackReceiver! ");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "get device deviceType =" + str + ",deviceId = " + str2);
            if (com.tencent.mm.plugin.exdevice.model.l3.Ui().P0(str2) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "hdInfo null, %s", str2);
                return;
            }
            com.tencent.mm.plugin.exdevice.model.j1 j1Var = this.f98886a;
            j1Var.f98933e.put(str2, jSONObject.toString().getBytes());
            com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent exDeviceLanDeviceScanResultEvent = new com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent();
            am.h6 h6Var = exDeviceLanDeviceScanResultEvent.f54147g;
            h6Var.f6824a = str2;
            java.util.HashMap hashMap = j1Var.f98935g;
            if (hashMap.containsKey(str2)) {
                java.lang.String str3 = (java.lang.String) hashMap.get(str2);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    h6Var.f6825b = str3.getBytes();
                }
                hashMap.remove(str2);
            }
            exDeviceLanDeviceScanResultEvent.e();
        }
    }
}
