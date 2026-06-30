package mb1;

/* loaded from: classes7.dex */
public class d extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f406832n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f406833o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f406834p = "LE";

    /* renamed from: q, reason: collision with root package name */
    public long f406835q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f406836r = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f406837s = true;

    public d(java.lang.String str) {
        this.f406832n = str;
    }

    @Override // ob1.c, lb1.l
    public void i(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.toString() : "";
        objArr[1] = ob1.h.a(i17);
        objArr[2] = i18 == 2 ? "CONNECTED" : "DISCONNECTED";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.ConnectAction", "[onConnectionStateChange]gatt:%s gattStatus:%s, newState:%s", objArr);
        this.f425519a.f399250e = bluetoothGatt;
        if (i18 != 2) {
            if (i18 == 0) {
                this.f425522d.post(new mb1.c(this, i17));
            }
        } else {
            if (bluetoothGatt == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Ble.ConnectAction", "[onConnectionStateChange] gatt is null", new java.lang.Object[0]);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.ConnectAction", "[onConnectionStateChange] discoverServicesDelayMills: " + this.f406835q, new java.lang.Object[0]);
            this.f425522d.postDelayed(new mb1.b(this, bluetoothGatt, i17), this.f406835q);
        }
    }

    @Override // ob1.c, lb1.l
    public void j(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
        java.lang.String a17 = ob1.h.a(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.ConnectAction", "[onServicesDiscovered] status:%s", a17);
        this.f425519a.f399250e = bluetoothGatt;
        if (i17 == 0) {
            p(ob1.m.f425551e);
        } else {
            p(new ob1.m(10008, "fail:not found service, " + ("status: " + a17), jc1.c.f380413d, null));
        }
        m();
        lb1.k kVar = this.f425519a;
        kVar.getClass();
        if (bluetoothGatt != null && i17 == 0) {
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            ob1.k kVar2 = kVar.f399253h;
            if (kVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(kVar.f399246a, "notifyConnectionStateChange, onBleConnectionStateChange is null", new java.lang.Object[0]);
            } else {
                kVar2.a(address, true);
            }
        }
    }

    @Override // ob1.c
    public void l() {
        android.bluetooth.BluetoothGatt connectGatt;
        android.bluetooth.BluetoothAdapter d17 = qb1.b.d();
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.ConnectAction", "action:%s, bluetoothAdapter is null", this);
            p(ob1.m.f425555i);
            m();
            return;
        }
        java.lang.String str = this.f406832n;
        if (str == null || !android.bluetooth.BluetoothAdapter.checkBluetoothAddress(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Ble.ConnectAction", "action:%s, unspecified deviceId", this);
            p(ob1.m.f425567u);
            m();
            return;
        }
        if (!qb1.b.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.ConnectAction", "bluetooth is not enable.", new java.lang.Object[0]);
            p(ob1.m.f425555i);
            m();
            return;
        }
        if (this.f425519a.f399250e != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Ble.ConnectAction", "already connect, please close", new java.lang.Object[0]);
            p(ob1.m.f425566t);
            m();
            return;
        }
        android.bluetooth.BluetoothDevice remoteDevice = d17.getRemoteDevice(this.f406832n);
        if (remoteDevice == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.ConnectAction", "Device not found, deviceId=%s", this.f406832n);
            p(ob1.m.f425553g);
            m();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.ConnectAction", "autoConnect:%b transport:%s", java.lang.Boolean.valueOf(this.f406833o), this.f406834p);
        java.lang.String upperCase = this.f406834p.toUpperCase();
        upperCase.getClass();
        char c17 = 65535;
        switch (upperCase.hashCode()) {
            case 2425:
                if (upperCase.equals("LE")) {
                    c17 = 0;
                    break;
                }
                break;
            case 2020783:
                if (upperCase.equals("AUTO")) {
                    c17 = 1;
                    break;
                }
                break;
            case 63463747:
                if (upperCase.equals("BREDR")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                connectGatt = remoteDevice.connectGatt(this.f425519a.f399247b, this.f406833o, new lb1.a(this.f425519a), 2);
                break;
            case 1:
                connectGatt = remoteDevice.connectGatt(this.f425519a.f399247b, this.f406833o, new lb1.a(this.f425519a), 0);
                break;
            case 2:
                connectGatt = remoteDevice.connectGatt(this.f425519a.f399247b, this.f406833o, new lb1.a(this.f425519a), 1);
                break;
            default:
                connectGatt = remoteDevice.connectGatt(this.f425519a.f399247b, this.f406833o, new lb1.a(this.f425519a), 2);
                break;
        }
        if (connectGatt != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.ConnectAction", "mBluetoothGatt:%s", connectGatt);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = this.f406832n;
            objArr[1] = java.lang.Boolean.valueOf(java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.ConnectAction", "create a new connection deviceId=%s mainthread:%b", objArr);
            this.f425519a.f399250e = connectGatt;
            return;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = this.f406832n;
        objArr2[1] = java.lang.Boolean.valueOf(java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.ConnectAction", "Get Gatt fail!, deviceId=%s mainthread:%b", objArr2);
        p(ob1.m.a("gatt is null"));
        m();
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "ConnectAction";
    }

    @Override // ob1.c
    public void o(ob1.m mVar) {
        if (mVar.f425571a != 10012) {
            return;
        }
        this.f425519a.k(false);
    }

    @Override // ob1.c
    /* renamed from: toString */
    public java.lang.String mo147104x9616526c() {
        return "ConnectAction#" + this.f425531m + "{deviceId='" + this.f406832n + "', debug=" + this.f425524f + ", mainThread=" + this.f425525g + ", serial=" + this.f425526h + '}';
    }
}
