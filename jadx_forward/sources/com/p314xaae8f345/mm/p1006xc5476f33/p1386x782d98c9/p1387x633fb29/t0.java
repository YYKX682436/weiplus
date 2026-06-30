package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class t0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0 f180597a;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0 z0Var) {
        this.f180597a = z0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2
    public void a(int i17, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0 z0Var = this.f180597a;
        if (i17 != 15 || objArr == null || objArr.length < 2) {
            return;
        }
        java.lang.Object obj = objArr[0];
        if ((obj instanceof java.lang.Integer) && (objArr[1] instanceof byte[])) {
            int intValue = ((java.lang.Integer) obj).intValue();
            try {
                int i18 = new org.json.JSONObject(new java.lang.String((byte[]) objArr[1])).getInt("progress");
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p.k((java.lang.String) z0Var.P.get(java.lang.Integer.valueOf(intValue)), i18);
                if (i18 >= 100) {
                    z0Var.P.remove(java.lang.Integer.valueOf(intValue));
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "JSON decode failed in file transfer update callback %s", e17);
            }
        }
    }
}
