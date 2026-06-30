package mb1;

/* loaded from: classes7.dex */
public final class l extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Integer f406859n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f406860o;

    public l(java.lang.Integer num, java.lang.String str) {
        this.f406859n = num;
        this.f406860o = str;
    }

    @Override // ob1.c, lb1.l
    public void a(android.bluetooth.BluetoothGatt gatt, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gatt, "gatt");
        java.lang.String a17 = ob1.h.a(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.Action", "onMtuChanged: mtu = %d, status = %s", java.lang.Integer.valueOf(i17), a17);
        if (i18 == 0) {
            java.lang.Integer num = this.f406859n;
            if (num != null && i17 == num.intValue()) {
                p(new ob1.m(0, "", jc1.f.f380445a, java.lang.Integer.valueOf(i17)));
            } else {
                p(new ob1.m(-1, "fail:internal error", jc1.c.f380413d, java.lang.Integer.valueOf(i17)));
            }
        } else {
            p(ob1.m.a("status: " + a17));
        }
        m();
    }

    @Override // ob1.c
    public void l() {
        if (qb1.b.d() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, bluetoothAdapter is null", this);
            p(ob1.m.f425555i);
            m();
            return;
        }
        java.lang.String str = this.f406860o;
        if (str == null || !android.bluetooth.BluetoothAdapter.checkBluetoothAddress(str) || this.f406859n == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Ble.Action", "action:%s, unspecified deviceId", this);
            p(ob1.m.f425567u);
            m();
            return;
        }
        if (!qb1.b.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "bluetooth is not enable.", new java.lang.Object[0]);
            p(ob1.m.f425555i);
            m();
            return;
        }
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f425519a.f399250e;
        if (bluetoothGatt == null) {
            p(ob1.m.f425558l);
            m();
            return;
        }
        int intValue = this.f406859n.intValue();
        jc1.d dVar = jc1.f.f380452h;
        if (intValue > 512) {
            p(new ob1.m(10013, "fail:invalid data, DEFAULT_MAX_MTU = 512", dVar, null));
            m();
            return;
        }
        if (this.f406859n.intValue() < 23) {
            p(new ob1.m(10013, "fail:invalid data, DEFAULT_MIN_MTU = 23", dVar, null));
            m();
            return;
        }
        int i17 = this.f425519a.f399257l;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.Action", "action:" + this + ", mtuSize: " + this.f406859n + ", curMtu: " + i17, new java.lang.Object[0]);
        java.lang.Integer num = this.f406859n;
        if (num != null && num.intValue() == i17) {
            p(new ob1.m(0, "", jc1.f.f380445a, java.lang.Integer.valueOf(i17)));
            m();
        } else {
            if (bluetoothGatt.requestMtu(this.f406859n.intValue())) {
                return;
            }
            p(ob1.m.b("requestMtu fail"));
            m();
        }
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "SetMtuAction";
    }
}
