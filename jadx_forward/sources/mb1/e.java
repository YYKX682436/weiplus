package mb1;

/* loaded from: classes7.dex */
public final class e extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f406838n;

    public e(java.lang.String deviceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        this.f406838n = deviceId;
    }

    @Override // ob1.c, lb1.l
    public void j(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
        java.lang.String a17 = ob1.h.a(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.Action", "[onServicesDiscovered] status:%s", a17);
        if (i17 == 0) {
            p(ob1.m.f425551e);
        } else {
            p(new ob1.m(10008, "fail:not found service, " + ("status: " + a17), jc1.c.f380413d, null));
        }
        m();
    }

    @Override // ob1.c
    public void l() {
        if (qb1.b.d() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Ble.Action", "action:%s, bluetoothAdapter is null", this);
            p(ob1.m.f425555i);
            m();
            return;
        }
        if (!qb1.b.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Ble.Action", "action:%s, bluetooth is not enable", this);
            p(ob1.m.f425555i);
            m();
            return;
        }
        if (!android.bluetooth.BluetoothAdapter.checkBluetoothAddress(this.f406838n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Ble.Action", "action:%s, unspecified deviceId", this);
            p(ob1.m.f425567u);
            m();
            return;
        }
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f425519a.f399250e;
        if (bluetoothGatt == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Ble.Action", "action:%s, gattService is null", this);
            p(ob1.m.f425558l);
            m();
        } else {
            if (bluetoothGatt.discoverServices()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Ble.Action", "action:%s, discoverServices fail", this);
            p(ob1.m.b("discoverServices fail"));
            m();
        }
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "DiscoverServicesAction";
    }
}
