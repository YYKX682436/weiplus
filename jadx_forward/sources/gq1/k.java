package gq1;

/* loaded from: classes13.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.UUID f356039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gq1.o f356040e;

    public k(gq1.o oVar, java.util.UUID uuid) {
        this.f356040e = oVar;
        this.f356039d = uuid;
    }

    @Override // java.lang.Runnable
    public void run() {
        gq1.o oVar = this.f356040e;
        java.util.UUID uuid = this.f356039d;
        oVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.IBeaconServer", "startRanging");
        boolean z17 = false;
        if (uuid == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.IBeaconServer", "error parameter: aUUID is null");
        } else {
            if (!oVar.f356055f.contains(uuid)) {
                oVar.f356055f.add(uuid);
            }
            synchronized (oVar) {
                if (oVar.f356067u.e()) {
                    oVar.f356067u.c(2000L, 2000L);
                }
                if (gq1.o.f356052x && oVar.f356066t.e()) {
                    oVar.f356066t.c(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                }
                if (oVar.f356068v.e()) {
                    if (gq1.o.f356052x) {
                        oVar.f356068v.c(1800000L, 1800000L);
                    } else {
                        oVar.f356068v.c(u04.d.f505010c, u04.d.f505010c);
                    }
                }
                if (!gq1.o.f356051w) {
                    oVar.f356059m = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.IBeaconServer", "[BluetoothTrace] start scan");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.IBeaconServer", new java.lang.Throwable(), "[BluetoothTrace] ble scan stacktrace", new java.lang.Object[0]);
                    android.bluetooth.BluetoothAdapter bluetoothAdapter = oVar.f356057h;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(oVar);
                    java.util.Collections.reverse(arrayList);
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((java.lang.Boolean) yj0.a.k(bluetoothAdapter, arrayList.toArray(), "com/tencent/mm/plugin/bluetooth/sdk/IBeacon/IBeaconServer", "startScan", "()V", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue());
                    if (valueOf.booleanValue() || gq1.o.f356051w) {
                        oVar.f356056g = true;
                        gq1.o.f356051w = true;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.IBeaconServer", "[shakezb]start ibeacon range successful");
                    } else {
                        int i17 = 0;
                        while (!valueOf.booleanValue() && i17 < 3 && !gq1.o.f356051w) {
                            i17++;
                            oVar.f356057h.stopLeScan(oVar);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.IBeaconServer", "start IBEACON BLE scan failed,retry no " + i17 + " time");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.IBeaconServer", "[BluetoothTrace] start scan");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.IBeaconServer", new java.lang.Throwable(), "[BluetoothTrace] ble scan stacktrace", new java.lang.Object[0]);
                            android.bluetooth.BluetoothAdapter bluetoothAdapter2 = oVar.f356057h;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(oVar);
                            java.util.Collections.reverse(arrayList2);
                            valueOf = java.lang.Boolean.valueOf(((java.lang.Boolean) yj0.a.k(bluetoothAdapter2, arrayList2.toArray(), "com/tencent/mm/plugin/bluetooth/sdk/IBeacon/IBeaconServer", "startScan", "()V", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue());
                            if (valueOf.booleanValue()) {
                                gq1.o.f356051w = true;
                                oVar.f356056g = true;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.IBeaconServer", "[shakezb]start ibeacon range successful");
                            }
                        }
                    }
                }
            }
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.IBeaconServer", "startRanging failed!!!");
    }
}
