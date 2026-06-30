package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class t0 implements com.tencent.mm.plugin.exdevice.model.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.z0 f99064a;

    public t0(com.tencent.mm.plugin.exdevice.model.z0 z0Var) {
        this.f99064a = z0Var;
    }

    @Override // com.tencent.mm.plugin.exdevice.model.b2
    public void a(int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.exdevice.model.z0 z0Var = this.f99064a;
        if (i17 != 15 || objArr == null || objArr.length < 2) {
            return;
        }
        java.lang.Object obj = objArr[0];
        if ((obj instanceof java.lang.Integer) && (objArr[1] instanceof byte[])) {
            int intValue = ((java.lang.Integer) obj).intValue();
            try {
                int i18 = new org.json.JSONObject(new java.lang.String((byte[]) objArr[1])).getInt("progress");
                com.tencent.mm.plugin.exdevice.model.p.k((java.lang.String) z0Var.P.get(java.lang.Integer.valueOf(intValue)), i18);
                if (i18 >= 100) {
                    z0Var.P.remove(java.lang.Integer.valueOf(intValue));
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "JSON decode failed in file transfer update callback %s", e17);
            }
        }
    }
}
