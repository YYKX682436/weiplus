package mb1;

/* loaded from: classes7.dex */
public class k extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f406856n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f406857o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Integer f406858p;

    public k(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        this.f406856n = str;
        this.f406857o = str2;
        this.f406858p = num;
    }

    @Override // ob1.c, lb1.l
    public void e(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.Action", "action:%s onCharacteristicRead status:%s", this, ob1.h.a(i17));
        m();
    }

    @Override // ob1.c
    public void l() {
        android.bluetooth.BluetoothGattCharacteristic characteristic;
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f425519a.f399250e;
        if (bluetoothGatt == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, bluetoothGatt is null", this);
            p(ob1.m.f425558l);
            m();
            return;
        }
        if (!qb1.b.f(this.f406856n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, serviceId is illegal", this);
            p(ob1.m.f425556j);
            m();
            return;
        }
        android.bluetooth.BluetoothGattService service = bluetoothGatt.getService(java.util.UUID.fromString(this.f406856n));
        if (service == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, gattService is null", this);
            p(ob1.m.f425556j);
            m();
            return;
        }
        if (!qb1.b.f(this.f406857o)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", this);
            p(ob1.m.f425557k);
            m();
            return;
        }
        java.util.UUID fromString = java.util.UUID.fromString(this.f406857o);
        java.lang.Integer num = this.f406858p;
        if (num != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.Action", "action:%s, handle: %d", this, num);
            java.util.Iterator<android.bluetooth.BluetoothGattCharacteristic> it = service.getCharacteristics().iterator();
            while (true) {
                if (!it.hasNext()) {
                    characteristic = null;
                    break;
                }
                characteristic = it.next();
                if (fromString.equals(characteristic.getUuid()) && this.f406858p.intValue() == characteristic.getInstanceId()) {
                    break;
                }
            }
        } else {
            characteristic = service.getCharacteristic(fromString);
        }
        if (characteristic == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, gattCharacteristic is null", this);
            p(ob1.m.f425557k);
            m();
            return;
        }
        if (!((characteristic.getProperties() & 2) > 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, not support read", this);
            p(ob1.m.f425559m);
            m();
        } else {
            if (bluetoothGatt.readCharacteristic(characteristic)) {
                p(ob1.m.f425551e);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.readCharacteristic fail", this);
            p(ob1.m.b("readCharacteristic fail"));
            m();
        }
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "ReadCharacteristicAction";
    }

    @Override // ob1.c
    /* renamed from: toString */
    public java.lang.String mo147104x9616526c() {
        return "ReadCharacteristicAction#" + this.f425531m + "{serviceId='" + this.f406856n + "', characteristicId='" + this.f406857o + "', debug=" + this.f425524f + ", mainThread=" + this.f425525g + ", serial=" + this.f425526h + '}';
    }
}
