package jb1;

/* loaded from: classes7.dex */
public final class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f72384x366c91de = 721;

    /* renamed from: NAME */
    private static final java.lang.String f72385x24728b = "createBLEPeripheralServer";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, org.json.JSONObject jSONObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        if (!qb1.b.b()) {
            qb1.a.a(this, i17, env, 10001, "fail:not available", null, 16, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.JsApiCreateBLEPeripheralServer", "invoke: Ble is not available");
            return;
        }
        jb1.h hVar = new jb1.h(this, i17, env);
        if (android.os.Build.VERSION.SDK_INT < 31) {
            hVar.mo152xb9724478();
            return;
        }
        java.lang.String[] strArr = {"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_ADVERTISE"};
        boolean z17 = true;
        for (int i18 = 0; i18 < 2; i18++) {
            z17 = b3.l.m9698x3fed0563(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, strArr[i18]) == 0;
        }
        if (z17) {
            hVar.mo152xb9724478();
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y.a(env), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.x(new jb1.g(env, i17, this, hVar), env, strArr, 144, "", "", null), 3, null);
        }
    }
}
