package jb1;

/* loaded from: classes7.dex */
public final class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f72388x366c91de = 725;

    /* renamed from: NAME */
    private static final java.lang.String f72389x24728b = "startBLEPeripheralAdvertising";

    /* renamed from: g, reason: collision with root package name */
    public static final jb1.n f380275g = new jb1.n(null);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, org.json.JSONObject jSONObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        if (!qb1.b.b()) {
            qb1.a.a(this, i17, env, 10001, "fail:not available", null, 16, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.JsApiStartBlePeripheralAdvertising", "invoke: Ble is not available");
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new jb1.o(this, jSONObject, i17, env), "MicroMsg.BLE.Peripheral");
        }
    }
}
