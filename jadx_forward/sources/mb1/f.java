package mb1;

/* loaded from: classes7.dex */
public final class f extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f406839n = "MicroMsg.Ble.Action#" + hashCode();

    @Override // ob1.c, lb1.l
    public void h(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        java.lang.String a17 = ob1.h.a(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f406839n, "onReadRemoteRssi, rssi: %d, statusDesc: %s", java.lang.Integer.valueOf(i17), a17);
        if (i18 != 0) {
            p(ob1.m.a("status: " + a17));
            m();
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425519a.f399250e, bluetoothGatt)) {
            p(new ob1.m(0, "", jc1.f.f380445a, java.lang.Integer.valueOf(i17)));
            m();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f406839n, "bluetoothGatt is not match", new java.lang.Object[0]);
            p(new ob1.m(-1, "fail:internal error", jc1.f.f380448d, null));
            m();
        }
    }

    @Override // ob1.c
    public void l() {
        if (!qb1.b.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f406839n, "Bluetooth is not enable.", new java.lang.Object[0]);
            p(ob1.m.f425555i);
            m();
            return;
        }
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f425519a.f399250e;
        if (bluetoothGatt == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f406839n, "bluetoothGatt is null", new java.lang.Object[0]);
            p(ob1.m.f425558l);
            m();
        } else {
            if (bluetoothGatt.readRemoteRssi()) {
                return;
            }
            p(ob1.m.b("readRemoteRssi fail"));
            m();
        }
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "GetBLEDeviceRSSIAction";
    }
}
