package mb1;

/* loaded from: classes7.dex */
public class h extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f406843n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f406844o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Integer f406845p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f406846q;

    public h(java.lang.String str, java.lang.String str2, java.lang.Integer num, boolean z17) {
        this.f406843n = str;
        this.f406844o = str2;
        this.f406845p = num;
        this.f406846q = z17;
    }

    @Override // ob1.c, lb1.l
    public void c(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.Action", "action:%s onDescriptorWrite status:%s", this, ob1.h.a(i17));
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
        if (!qb1.b.f(this.f406843n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, serviceId is illegal", this);
            p(ob1.m.f425556j);
            m();
            return;
        }
        android.bluetooth.BluetoothGattService service = bluetoothGatt.getService(java.util.UUID.fromString(this.f406843n));
        if (service == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, gattService is null", this);
            p(ob1.m.f425556j);
            m();
            return;
        }
        if (!qb1.b.f(this.f406844o)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", this);
            p(ob1.m.f425557k);
            m();
            return;
        }
        java.util.UUID fromString = java.util.UUID.fromString(this.f406844o);
        java.lang.Integer num = this.f406845p;
        if (num != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.Action", "action:%s, handle: %d", this, num);
            java.util.Iterator<android.bluetooth.BluetoothGattCharacteristic> it = service.getCharacteristics().iterator();
            while (true) {
                if (!it.hasNext()) {
                    characteristic = null;
                    break;
                }
                characteristic = it.next();
                if (fromString.equals(characteristic.getUuid()) && this.f406845p.intValue() == characteristic.getInstanceId()) {
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
        if (!((characteristic.getProperties() & 16) > 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, not support notify", this);
            p(ob1.m.f425559m);
            m();
            return;
        }
        if (!bluetoothGatt.setCharacteristicNotification(characteristic, this.f406846q)) {
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
        if (!descriptor.setValue(this.f406846q ? android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
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
        return "NotifyCharacteristicAction";
    }

    @Override // ob1.c
    /* renamed from: toString */
    public java.lang.String mo147104x9616526c() {
        return "NotifyCharacteristicAction#" + this.f425531m + "{serviceId='" + this.f406843n + "', characteristicId='" + this.f406844o + "', enable=" + this.f406846q + ", debug=" + this.f425524f + ", mainThread=" + this.f425525g + ", serial=" + this.f425526h + '}';
    }
}
