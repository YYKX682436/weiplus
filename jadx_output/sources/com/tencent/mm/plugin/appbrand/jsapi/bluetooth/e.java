package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public class e extends com.tencent.mm.plugin.appbrand.v0 implements com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f80056d;

    /* renamed from: f, reason: collision with root package name */
    public kb1.c f80058f;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f80057e = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f80059g = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f80060h = new java.util.concurrent.CopyOnWriteArrayList();

    public e(java.lang.String str) {
        this.f80056d = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o
    public void a(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f fVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ble.BleWorker", "onAuthorizeStateChange, newState: " + fVar, new java.lang.Object[0]);
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.a(this.f80056d);
        } else if (ordinal == 1) {
            this.f80057e = false;
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f80057e = true;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.a(this.f80056d);
    }

    public void h(java.lang.String str, ob1.c cVar, ob1.d dVar) {
        lb1.k kVar;
        kb1.c i17 = i();
        if (i17 != null) {
            lb1.i iVar = i17.f306222a;
            synchronized (iVar) {
                java.util.Map map = iVar.f317708b;
                if (map == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Ble.BleConnectMgr", "getWorker, connectWorkers is null", new java.lang.Object[0]);
                    kVar = null;
                } else {
                    lb1.k kVar2 = (lb1.k) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
                    if (kVar2 == null) {
                        kVar2 = new lb1.k(iVar.f317707a, str, iVar);
                        kVar2.n();
                        kVar2.f317721i = new lb1.e(iVar);
                        kVar2.f317720h = new lb1.f(iVar);
                        kVar2.f317722j = iVar.f317711e;
                        ((java.util.concurrent.ConcurrentHashMap) iVar.f317708b).put(str, kVar2);
                    }
                    kVar = kVar2;
                }
            }
            if (kVar != null) {
                com.tencent.mars.xlog.Log.i(kVar.f317713a, "deviceId:%s aciton:%s", kVar.f317715c, cVar);
                lb1.d dVar2 = kVar.f317716d;
                if (dVar2 == null) {
                    return;
                }
                cVar.f343986a = kVar;
                cVar.f343987b = dVar2;
                cVar.f343988c = dVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.Ble.BleConnectDispatcher", "doAction %s", cVar);
                if (!cVar.f343993h) {
                    if (cVar.f343992g) {
                        dVar2.f317703d.postDelayed(new lb1.b(dVar2, cVar), cVar.f343995j);
                        return;
                    } else {
                        cVar.k();
                        return;
                    }
                }
                java.util.Queue queue = dVar2.f317700a;
                if (queue == null) {
                    return;
                }
                ((java.util.concurrent.ConcurrentLinkedQueue) queue).add(cVar);
                dVar2.k();
            }
        }
    }

    public final synchronized kb1.c i() {
        kb1.c cVar;
        cVar = this.f80058f;
        if (cVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ble.BleWorker", "getBleManager, bleManager is null", new java.lang.Object[0]);
        }
        return cVar;
    }

    public java.util.List j(java.lang.String str, boolean z17) {
        kb1.c i17 = i();
        if (i17 == null) {
            return null;
        }
        java.util.Map map = i17.f306222a.f317708b;
        if (map == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Ble.BleConnectMgr", "getServices, connectWorkers is null", new java.lang.Object[0]);
            return null;
        }
        lb1.k kVar = (lb1.k) map.get(str);
        if (kVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Ble.BleConnectMgr", "getServices, connectWorker is null", new java.lang.Object[0]);
            return null;
        }
        if (z17) {
            return kVar.m();
        }
        synchronized (kVar) {
            android.bluetooth.BluetoothGatt bluetoothGatt = kVar.f317717e;
            if (bluetoothGatt == null) {
                com.tencent.mars.xlog.Log.e(kVar.f317713a, "[getServicesNoCache] bluetoothGatt is null, err", new java.lang.Object[0]);
                return null;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(kVar.f317715c)) {
                com.tencent.mars.xlog.Log.e(kVar.f317713a, "[getServicesNoCache] deviceId is null, err", new java.lang.Object[0]);
                return null;
            }
            java.util.List<android.bluetooth.BluetoothGattService> services = bluetoothGatt.getServices();
            if (services == null) {
                com.tencent.mars.xlog.Log.w(kVar.f317713a, "[getServicesNoCache] bluetoothGattServices is null, err", new java.lang.Object[0]);
                return null;
            }
            kVar.f317718f = new java.util.ArrayList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.bluetooth.BluetoothGattService bluetoothGattService : services) {
                ob1.g gVar = new ob1.g();
                gVar.f344015a = bluetoothGattService.getUuid().toString().toUpperCase();
                gVar.f344016b = bluetoothGattService.getType() == 0;
                if (!gVar.f344015a.equals("00001800-0000-1000-8000-00805F9B34FB") && !gVar.f344015a.equals("00001801-0000-1000-8000-00805F9B34FB")) {
                    kVar.f317718f.add(gVar);
                }
                arrayList.add(gVar);
            }
            if (arrayList.size() > 0) {
                kVar.f317718f.addAll(arrayList);
            }
            return new java.util.ArrayList(kVar.f317718f);
        }
    }
}
