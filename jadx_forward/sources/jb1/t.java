package jb1;

/* loaded from: classes7.dex */
public final class t extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f72392x366c91de = 727;

    /* renamed from: NAME */
    private static final java.lang.String f72393x24728b = "writeBLEPeripheralCharacteristicValue";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, org.json.JSONObject jSONObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        if (!qb1.b.b()) {
            qb1.a.a(this, i17, env, 10001, "fail:not available", null, 16, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.JsApiWriteBlePeripheralCharacteristicValue", "invoke: Ble is not available");
            return;
        }
        if (jSONObject == null || !jSONObject.has("serverId")) {
            qb1.a.a(this, i17, env, 10013, "fail:invalid data", null, 16, null);
            return;
        }
        jb1.a0 b17 = jb1.d0.f380238a.b(jSONObject.optInt("serverId"));
        if (b17 == null) {
            qb1.a.a(this, i17, env, 10020, "fail: no server", null, 16, null);
            return;
        }
        if (b17.f380221a != jb1.e0.f380245f) {
            qb1.a.a(this, i17, env, 10000, "fail:not init", null, 16, null);
            return;
        }
        try {
            java.lang.String optString = jSONObject.optString("serviceId", "");
            java.lang.String optString2 = jSONObject.optString("characteristicId", "");
            boolean optBoolean = jSONObject.optBoolean("needNotify", false);
            int optInt = jSONObject.optInt("callbackId", -1);
            java.lang.String optString3 = jSONObject.optString("value");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.JsApiWriteBlePeripheralCharacteristicValue", "invoke: write = " + optString3 + " serviceId = %s, characteristicId = %s, needNotify = %s, jCallbackId = %s", optString, optString2, java.lang.String.valueOf(optBoolean), java.lang.String.valueOf(optInt));
            java.util.UUID a17 = rb1.a.a(optString);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "fromString(...)");
            java.util.UUID a18 = rb1.a.a(optString2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "fromString(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
            b17.b(a17, a18, optBoolean, optInt, optString3);
            qb1.a.b(this, i17, env, null);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BLE.JsApiWriteBlePeripheralCharacteristicValue", "invoke: fail: " + e17);
            qb1.a.a(this, i17, env, 10013, "fail:invalid data", null, 16, null);
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BLE.JsApiWriteBlePeripheralCharacteristicValue", "invoke: fail: " + e18);
            qb1.a.a(this, i17, env, 10013, "fail:invalid data", null, 16, null);
        }
    }
}
