package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f80046a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static android.content.BroadcastReceiver f80047b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f80048c;

    public static synchronized ob1.m a(java.lang.String str) {
        synchronized (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.class) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Ble.BleManager", "close appId:%s", str);
            java.util.Map map = f80046a;
            if (!((java.util.HashMap) map).containsKey(str)) {
                return ob1.m.f344018e;
            }
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e eVar = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e) ((java.util.HashMap) map).remove(str);
            com.tencent.mm.plugin.appbrand.x0.e(str, eVar);
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g.f80069a.b(str, eVar);
            if (eVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Ble.BleManager", "close, bleWorker is null");
            } else {
                synchronized (eVar) {
                    kb1.c cVar = eVar.f80058f;
                    if (cVar != null) {
                        cVar.b();
                        eVar.f80058f = null;
                    }
                    ((java.util.concurrent.CopyOnWriteArrayList) eVar.f80060h).clear();
                    ((java.util.concurrent.CopyOnWriteArrayList) eVar.f80059g).clear();
                    eVar.f80057e = false;
                }
            }
            if (((java.util.HashMap) map).size() == 0) {
                synchronized (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.class) {
                    if (f80047b != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Ble.BleManager", "bluetoothStateListener uninit");
                        com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(f80047b);
                        f80047b = null;
                    }
                }
            }
            return ob1.m.f344018e;
        }
    }

    public static synchronized com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e eVar;
        synchronized (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.class) {
            eVar = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e) ((java.util.HashMap) f80046a).get(str);
        }
        return eVar;
    }

    public static synchronized void c() {
        synchronized (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.class) {
            if (f80047b == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Ble.BleManager", "bluetoothStateListener init");
                f80047b = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.a();
                com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(f80047b, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                f80048c = qb1.b.b();
            }
        }
    }
}
