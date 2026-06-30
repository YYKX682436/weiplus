package kq1;

/* loaded from: classes13.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f392787a;

    /* renamed from: b, reason: collision with root package name */
    public final hq1.j f392788b;

    /* renamed from: c, reason: collision with root package name */
    public final jq1.e f392789c;

    /* renamed from: d, reason: collision with root package name */
    public final kq1.o f392790d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f392791e = new java.util.HashSet();

    public n(android.content.Context context, kq1.o oVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f392787a = null;
        this.f392788b = null;
        this.f392789c = null;
        this.f392790d = null;
        jq1.e eVar = new jq1.e(n3Var);
        this.f392789c = eVar;
        hq1.j jVar = new hq1.j(n3Var.mo50284xdd3e8650());
        this.f392788b = jVar;
        kq1.e eVar2 = new kq1.e(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "------init------");
        iz5.a.d(null, context);
        iz5.a.d(null, eVar2);
        if (!jVar.f364674g) {
            jVar.f364674g = true;
            jVar.f364669b = context;
            jVar.f364668a = eVar2;
            hq1.n nVar = hq1.n.f364700i;
            if (nVar == null) {
                nVar = new hq1.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                hq1.n.f364700i = nVar;
            }
            jVar.f364675h = nVar;
            if (fp.h.c(21)) {
                hq1.m0 m0Var = hq1.m0.f364693g;
                if (m0Var == null) {
                    m0Var = new hq1.m0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    hq1.m0.f364693g = m0Var;
                }
                jVar.f364676i = m0Var;
            }
            if (jVar.c()) {
                ((android.bluetooth.BluetoothManager) jVar.f364669b.getSystemService("bluetooth")).getAdapter();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport!!!");
            }
        }
        kq1.d dVar = new kq1.d(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothChatManager", "------init------");
        iz5.a.d(null, context);
        iz5.a.d(null, dVar);
        if (!eVar.f382600g) {
            eVar.f382600g = true;
            eVar.f382594a = dVar;
            eVar.f382597d = context;
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
            intentFilter.addAction("android.bluetooth.device.action.FOUND");
            intentFilter.addAction("android.bluetooth.adapter.action.SCAN_MODE_CHANGED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            eVar.f382597d.registerReceiver(eVar.f382601h, intentFilter);
            eVar.f382595b = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        }
        this.f392787a = new kq1.f(u32.i1.a().f505843b.mo50284xdd3e8650(), this);
        this.f392790d = oVar;
    }

    public static boolean a(kq1.n nVar, int i17, int i18, int i19, java.lang.Object obj) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = nVar.f392787a;
        return n3Var.mo50308x2936bf5f(n3Var.mo50291x733c63a2(i17, i18, i19, obj));
    }

    public void b(long j17, long j18, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***createSession*** deviceId = " + j17 + "aBluetoothVersion = " + i17);
        if (i17 == 0) {
            hq1.j jVar = this.f392788b;
            if (jVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
                return;
            }
            jVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "------createSession------ macAddr = %d channelId = %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            iz5.a.g(null, jVar.f364674g);
            if (jVar.c()) {
                iz5.a.g(null, jVar.f364671d.mo50293x3498a0(new hq1.i(jVar, j17, j18)));
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
                return;
            }
        }
        if (i17 != 1) {
            iz5.a.g(null, false);
            return;
        }
        jq1.e eVar = this.f392789c;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
            return;
        }
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothChatManager", "createSession");
        iz5.a.g(null, eVar.f382600g);
        if (eVar.a()) {
            iz5.a.g(null, eVar.f382598e.mo50293x3498a0(new jq1.d(eVar, j17, j18)));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
        }
    }

    public boolean c(int i17, int... iArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "---scan--- aBluetoothVersion = " + i17);
        if (i17 == 0) {
            hq1.j jVar = this.f392788b;
            if (jVar != null) {
                return iArr == null ? jVar.d(true, new int[0]) : jVar.d(true, iArr);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
            return false;
        }
        if (i17 != 1) {
            iz5.a.g(null, false);
            return false;
        }
        jq1.e eVar = this.f392789c;
        if (eVar != null) {
            return eVar.b(true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
        return false;
    }
}
