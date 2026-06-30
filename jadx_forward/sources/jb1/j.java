package jb1;

/* loaded from: classes7.dex */
public final class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f72386x366c91de = 724;

    /* renamed from: NAME */
    private static final java.lang.String f72387x24728b = "removeBLEPeripheralService";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, org.json.JSONObject jSONObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        if (!qb1.b.b()) {
            qb1.a.a(this, i17, env, 10001, "fail:not available", null, 16, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.JsApiRemoveBlePeripheralService", "invoke: Ble is not available");
            return;
        }
        if (jSONObject == null || !jSONObject.has("serverId") || !jSONObject.has("serviceId")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BLE.JsApiRemoveBlePeripheralService", "invoke data is invalid");
            qb1.a.a(this, i17, env, 10013, "fail:invalid data", null, 16, null);
            return;
        }
        jb1.a0 b17 = jb1.d0.f380238a.b(jSONObject.optInt("serverId"));
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.JsApiRemoveBlePeripheralService", "invoke: retrieve a null server");
            qb1.a.a(this, i17, env, 10020, "fail: no server", null, 16, null);
            return;
        }
        try {
            java.util.UUID a17 = rb1.a.a(jSONObject.optString("serviceId"));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "fromString(...)");
            android.bluetooth.BluetoothGattService service = b17.a().getService(a17);
            if (service == null) {
                qb1.a.a(this, i17, env, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261, "fail:no service", null, 16, null);
                return;
            }
            if (!qb1.a.d("android.permission.BLUETOOTH_CONNECT")) {
                qb1.a.a(this, i17, env, 3, "fail:system permission denied", null, 16, null);
                return;
            }
            try {
                if (b17.a().removeService(service)) {
                    qb1.a.b(this, i17, env, null);
                } else {
                    qb1.a.a(this, i17, env, 10008, "fail: remove #" + a17 + " service fail", null, 16, null);
                }
            } catch (java.lang.SecurityException unused) {
                qb1.a.a(this, i17, env, 3, "fail:system permission denied", null, 16, null);
            }
        } catch (java.lang.Exception unused2) {
            qb1.a.a(this, i17, env, 10013, "fail:invalid data", null, 16, null);
        }
    }
}
