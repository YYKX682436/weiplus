package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae;

/* loaded from: classes7.dex */
public class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f161589d;

    /* renamed from: f, reason: collision with root package name */
    public kb1.c f161591f;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f161590e = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f161592g = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f161593h = new java.util.concurrent.CopyOnWriteArrayList();

    public e(java.lang.String str) {
        this.f161589d = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.o
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.f fVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ble.BleWorker", "onAuthorizeStateChange, newState: " + fVar, new java.lang.Object[0]);
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.a(this.f161589d);
        } else if (ordinal == 1) {
            this.f161590e = false;
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f161590e = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.a(this.f161589d);
    }

    public void h(java.lang.String str, ob1.c cVar, ob1.d dVar) {
        lb1.k kVar;
        kb1.c i17 = i();
        if (i17 != null) {
            lb1.i iVar = i17.f387755a;
            synchronized (iVar) {
                java.util.Map map = iVar.f399241b;
                if (map == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Ble.BleConnectMgr", "getWorker, connectWorkers is null", new java.lang.Object[0]);
                    kVar = null;
                } else {
                    lb1.k kVar2 = (lb1.k) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
                    if (kVar2 == null) {
                        kVar2 = new lb1.k(iVar.f399240a, str, iVar);
                        kVar2.n();
                        kVar2.f399254i = new lb1.e(iVar);
                        kVar2.f399253h = new lb1.f(iVar);
                        kVar2.f399255j = iVar.f399244e;
                        ((java.util.concurrent.ConcurrentHashMap) iVar.f399241b).put(str, kVar2);
                    }
                    kVar = kVar2;
                }
            }
            if (kVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f399246a, "deviceId:%s aciton:%s", kVar.f399248c, cVar);
                lb1.d dVar2 = kVar.f399249d;
                if (dVar2 == null) {
                    return;
                }
                cVar.f425519a = kVar;
                cVar.f425520b = dVar2;
                cVar.f425521c = dVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.BleConnectDispatcher", "doAction %s", cVar);
                if (!cVar.f425526h) {
                    if (cVar.f425525g) {
                        dVar2.f399236d.postDelayed(new lb1.b(dVar2, cVar), cVar.f425528j);
                        return;
                    } else {
                        cVar.k();
                        return;
                    }
                }
                java.util.Queue queue = dVar2.f399233a;
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
        cVar = this.f161591f;
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ble.BleWorker", "getBleManager, bleManager is null", new java.lang.Object[0]);
        }
        return cVar;
    }

    public java.util.List j(java.lang.String str, boolean z17) {
        kb1.c i17 = i();
        if (i17 == null) {
            return null;
        }
        java.util.Map map = i17.f387755a.f399241b;
        if (map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Ble.BleConnectMgr", "getServices, connectWorkers is null", new java.lang.Object[0]);
            return null;
        }
        lb1.k kVar = (lb1.k) map.get(str);
        if (kVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Ble.BleConnectMgr", "getServices, connectWorker is null", new java.lang.Object[0]);
            return null;
        }
        if (z17) {
            return kVar.m();
        }
        synchronized (kVar) {
            android.bluetooth.BluetoothGatt bluetoothGatt = kVar.f399250e;
            if (bluetoothGatt == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(kVar.f399246a, "[getServicesNoCache] bluetoothGatt is null, err", new java.lang.Object[0]);
                return null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f399248c)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(kVar.f399246a, "[getServicesNoCache] deviceId is null, err", new java.lang.Object[0]);
                return null;
            }
            java.util.List<android.bluetooth.BluetoothGattService> services = bluetoothGatt.getServices();
            if (services == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(kVar.f399246a, "[getServicesNoCache] bluetoothGattServices is null, err", new java.lang.Object[0]);
                return null;
            }
            kVar.f399251f = new java.util.ArrayList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.bluetooth.BluetoothGattService bluetoothGattService : services) {
                ob1.g gVar = new ob1.g();
                gVar.f425548a = bluetoothGattService.getUuid().toString().toUpperCase();
                gVar.f425549b = bluetoothGattService.getType() == 0;
                if (!gVar.f425548a.equals("00001800-0000-1000-8000-00805F9B34FB") && !gVar.f425548a.equals("00001801-0000-1000-8000-00805F9B34FB")) {
                    kVar.f399251f.add(gVar);
                }
                arrayList.add(gVar);
            }
            if (arrayList.size() > 0) {
                kVar.f399251f.addAll(arrayList);
            }
            return new java.util.ArrayList(kVar.f399251f);
        }
    }
}
