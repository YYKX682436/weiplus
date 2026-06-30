package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f161579a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static android.content.BroadcastReceiver f161580b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f161581c;

    public static synchronized ob1.m a(java.lang.String str) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.BleManager", "close appId:%s", str);
            java.util.Map map = f161579a;
            if (!((java.util.HashMap) map).containsKey(str)) {
                return ob1.m.f425551e;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e) ((java.util.HashMap) map).remove(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(str, eVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.g.f161602a.b(str, eVar);
            if (eVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.BleManager", "close, bleWorker is null");
            } else {
                synchronized (eVar) {
                    kb1.c cVar = eVar.f161591f;
                    if (cVar != null) {
                        cVar.b();
                        eVar.f161591f = null;
                    }
                    ((java.util.concurrent.CopyOnWriteArrayList) eVar.f161593h).clear();
                    ((java.util.concurrent.CopyOnWriteArrayList) eVar.f161592g).clear();
                    eVar.f161590e = false;
                }
            }
            if (((java.util.HashMap) map).size() == 0) {
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.class) {
                    if (f161580b != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.BleManager", "bluetoothStateListener uninit");
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(f161580b);
                        f161580b = null;
                    }
                }
            }
            return ob1.m.f425551e;
        }
    }

    public static synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e eVar;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.class) {
            eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e) ((java.util.HashMap) f161579a).get(str);
        }
        return eVar;
    }

    public static synchronized void c() {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.class) {
            if (f161580b == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.BleManager", "bluetoothStateListener init");
                f161580b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.a();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(f161580b, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                f161581c = qb1.b.b();
            }
        }
    }
}
