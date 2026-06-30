package jb1;

/* loaded from: classes7.dex */
public final class s extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f72390x366c91de = 726;

    /* renamed from: NAME */
    private static final java.lang.String f72391x24728b = "stopBLEPeripheralAdvertising";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, org.json.JSONObject jSONObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        if (jSONObject == null || !jSONObject.has("serverId")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BLE.JsApiStopBlePeripheralAdvertising", "createBLEPeripheralServer data is invalid");
            qb1.a.a(this, i17, env, 10013, "fail:invalid data", null, 16, null);
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new jb1.r(jSONObject, this, i17, env), "MicroMsg.BLE.Peripheral");
        }
    }
}
