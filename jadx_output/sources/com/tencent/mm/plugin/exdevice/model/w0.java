package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes.dex */
public class w0 implements com.tencent.mm.plugin.exdevice.model.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.z0 f99081a;

    public w0(com.tencent.mm.plugin.exdevice.model.z0 z0Var) {
        this.f99081a = z0Var;
    }

    @Override // com.tencent.mm.plugin.exdevice.model.b2
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
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", e17, "", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "JSON decode failed in device ConnState notify callback");
                }
                com.tencent.mm.plugin.exdevice.model.z0 z0Var = this.f99081a;
                if (intValue == -2 || intValue == -1 || intValue == 0) {
                    z0Var.B.put(str2, java.lang.Boolean.FALSE);
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "device not connect stateCode = " + intValue);
                    return;
                }
                if (intValue != 1) {
                    return;
                }
                z0Var.B.put(str2, java.lang.Boolean.TRUE);
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "device connect");
            }
        }
    }
}
