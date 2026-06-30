package jb1;

/* loaded from: classes7.dex */
public final class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f72382x366c91de = 722;

    /* renamed from: NAME */
    private static final java.lang.String f72383x24728b = "closeBLEPeripheralServer";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, org.json.JSONObject jSONObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        if (jSONObject == null || !jSONObject.has("serverId")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BLE.JsApiCloseBlePeripheralServer", "createBLEPeripheralServer data is invalid");
            qb1.a.a(this, i17, env, 10013, "fail:invalid data", null, 16, null);
            return;
        }
        int optInt = jSONObject.optInt("serverId");
        jb1.d0 d0Var = jb1.d0.f380238a;
        boolean z17 = false;
        if (!jb1.d0.f380242e) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) jb1.d0.f380239b;
            jb1.a0 a0Var = (jb1.a0) concurrentHashMap.get(java.lang.Integer.valueOf(optInt));
            if (a0Var != null) {
                a0Var.c();
                if (concurrentHashMap.remove(java.lang.Integer.valueOf(optInt)) != null) {
                    z17 = true;
                }
            }
        }
        if (z17) {
            qb1.a.b(this, i17, env, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.JsApiCloseBlePeripheralServer", "invoke: fail: #" + optInt + " server is not exists");
        qb1.a.a(this, i17, env, 10020, "fail: no server", null, 16, null);
    }
}
