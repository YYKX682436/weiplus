package mb1;

/* loaded from: classes7.dex */
public class g extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f406840n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f406841o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f406842p;

    public g(java.lang.String str, java.lang.String str2, boolean z17) {
        this.f406840n = str;
        this.f406841o = str2;
        this.f406842p = z17;
    }

    @Override // ob1.c, lb1.l
    public void c(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.Action", "action:%s onDescriptorWrite status:%s", this, ob1.h.a(i17));
        m();
    }

    @Override // ob1.c
    public void l() {
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f425519a.f399250e;
        if (bluetoothGatt == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, bluetoothGatt is null", this);
            p(ob1.m.f425558l);
            m();
            return;
        }
        android.bluetooth.BluetoothGattService service = bluetoothGatt.getService(java.util.UUID.fromString(this.f406840n));
        if (service == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, gattService is null", this);
            p(ob1.m.f425556j);
            m();
            return;
        }
        if (!qb1.b.f(this.f406841o)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", this);
            p(ob1.m.f425557k);
            m();
            return;
        }
        android.bluetooth.BluetoothGattCharacteristic characteristic = service.getCharacteristic(java.util.UUID.fromString(this.f406841o));
        if (characteristic == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, gattCharacteristic is null", this);
            p(ob1.m.f425557k);
            m();
            return;
        }
        if (!((characteristic.getProperties() & 32) > 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, not support indicate", this);
            p(ob1.m.f425559m);
            m();
            return;
        }
        if (!bluetoothGatt.setCharacteristicNotification(characteristic, this.f406842p)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.setCharacteristicNotification fail", this);
            p(ob1.m.b("setCharacteristicNotification fail"));
            m();
            return;
        }
        android.bluetooth.BluetoothGattDescriptor descriptor = characteristic.getDescriptor(nb1.a.f417565a);
        if (descriptor == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s gattCharacteristic.getDescriptor fail", this);
            p(ob1.m.f425562p);
            m();
            return;
        }
        if (!descriptor.setValue(this.f406842p ? android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE : android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s gattDescriptor.setValue fail", this);
            p(ob1.m.f425563q);
            m();
        } else {
            if (bluetoothGatt.writeDescriptor(descriptor)) {
                p(ob1.m.f425551e);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.writeDescriptor fail", this);
            p(ob1.m.f425564r);
            m();
        }
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "IndicateCharacteristicAction";
    }

    @Override // ob1.c
    /* renamed from: toString */
    public java.lang.String mo147104x9616526c() {
        return "IndicateCharacteristicAction#" + this.f425531m + "{serviceId='" + this.f406840n + "', characteristicId='" + this.f406841o + "', enable=" + this.f406842p + ", debug=" + this.f425524f + ", mainThread=" + this.f425525g + ", serial=" + this.f425526h + '}';
    }
}
