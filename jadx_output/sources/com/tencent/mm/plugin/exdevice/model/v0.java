package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class v0 implements com.tencent.mm.plugin.exdevice.model.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.z0 f99074a;

    public v0(com.tencent.mm.plugin.exdevice.model.z0 z0Var) {
        this.f99074a = z0Var;
    }

    @Override // com.tencent.mm.plugin.exdevice.model.b2
    public void a(int i17, java.lang.Object... objArr) {
        java.lang.String str;
        if (i17 != 12 || objArr == null || objArr.length < 2) {
            return;
        }
        java.lang.Object obj = objArr[0];
        if ((obj instanceof java.lang.Integer) && (objArr[1] instanceof byte[])) {
            int intValue = ((java.lang.Integer) obj).intValue();
            byte[] bArr = (byte[]) objArr[1];
            if (intValue <= 0 || (str = (java.lang.String) this.f99074a.P.get(java.lang.Integer.valueOf(intValue))) == null) {
                return;
            }
            try {
                java.lang.String str2 = new java.lang.String(bArr);
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                if (jSONObject.isNull("errcode") || jSONObject.getInt("errcode") == 0) {
                    com.tencent.mm.plugin.exdevice.model.p.l(str, "send_data_sucess");
                } else {
                    com.tencent.mm.plugin.exdevice.model.p.l(str, "send_data_failed");
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "send msg failed data %s", str2);
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "JSON decode mUseWCLanDeviceServiceCmdId failed %s", e17);
            }
        }
    }
}
