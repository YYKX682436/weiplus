package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class v0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0 f180607a;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0 z0Var) {
        this.f180607a = z0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2
    public void a(int i17, java.lang.Object... objArr) {
        java.lang.String str;
        if (i17 != 12 || objArr == null || objArr.length < 2) {
            return;
        }
        java.lang.Object obj = objArr[0];
        if ((obj instanceof java.lang.Integer) && (objArr[1] instanceof byte[])) {
            int intValue = ((java.lang.Integer) obj).intValue();
            byte[] bArr = (byte[]) objArr[1];
            if (intValue <= 0 || (str = (java.lang.String) this.f180607a.P.get(java.lang.Integer.valueOf(intValue))) == null) {
                return;
            }
            try {
                java.lang.String str2 = new java.lang.String(bArr);
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                if (jSONObject.isNull("errcode") || jSONObject.getInt("errcode") == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p.l(str, "send_data_sucess");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p.l(str, "send_data_failed");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "send msg failed data %s", str2);
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "JSON decode mUseWCLanDeviceServiceCmdId failed %s", e17);
            }
        }
    }
}
