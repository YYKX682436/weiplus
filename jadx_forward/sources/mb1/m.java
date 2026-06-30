package mb1;

/* loaded from: classes7.dex */
public class m extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f406861n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f406862o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Integer f406863p;

    /* renamed from: q, reason: collision with root package name */
    public final int f406864q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f406865r;

    public m(java.lang.String str, java.lang.String str2, java.lang.Integer num, int i17, java.lang.String str3) {
        this.f406861n = str;
        this.f406862o = str2;
        this.f406863p = num;
        this.f406864q = i17;
        this.f406865r = str3;
    }

    @Override // ob1.c, lb1.l
    public void g(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        java.lang.String a17 = ob1.h.a(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.Action", "action:%s onCharacteristicWrite status:%s", this, a17);
        if (i17 == 0) {
            p(ob1.m.f425551e);
        } else {
            p(ob1.m.b("status: " + a17));
        }
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
        if (!qb1.b.f(this.f406861n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, serviceId is illegal", this);
            p(ob1.m.f425556j);
            m();
            return;
        }
        android.bluetooth.BluetoothGattService service = bluetoothGatt.getService(java.util.UUID.fromString(this.f406861n));
        if (service == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, gattService is null", this);
            p(ob1.m.f425556j);
            m();
            return;
        }
        if (!qb1.b.f(this.f406862o)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", this);
            p(ob1.m.f425557k);
            m();
            return;
        }
        java.util.UUID fromString = java.util.UUID.fromString(this.f406862o);
        java.lang.Integer num = this.f406863p;
        if (num != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.Action", "action:%s, handle: %d", this, num);
            java.util.Iterator<android.bluetooth.BluetoothGattCharacteristic> it = service.getCharacteristics().iterator();
            while (true) {
                if (!it.hasNext()) {
                    characteristic = null;
                    break;
                }
                characteristic = it.next();
                if (fromString.equals(characteristic.getUuid()) && this.f406863p.intValue() == characteristic.getInstanceId()) {
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
        boolean z17 = (characteristic.getProperties() & 8) > 0;
        boolean z18 = (characteristic.getProperties() & 4) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s, writeType: %d, supportWrite: %b, supportWriteNoResponse: %b", this, java.lang.Integer.valueOf(this.f406864q), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (!z17 && !z18) {
            p(ob1.m.f425559m);
            m();
            return;
        }
        int i17 = this.f406864q;
        if ((1 == i17 && !z17) || (2 == i17 && !z18)) {
            p(ob1.m.f425570x);
            m();
            return;
        }
        int writeType = characteristic.getWriteType();
        int i18 = this.f406864q;
        if (i18 == 1) {
            characteristic.setWriteType(2);
        } else if (i18 == 2) {
            characteristic.setWriteType(1);
        }
        byte[] a17 = qb1.b.a(android.util.Base64.decode(this.f406865r, 2));
        characteristic.setValue(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Ble.Action", "dataToWrite's length:%d", java.lang.Integer.valueOf(a17.length));
        if (this.f425524f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.Action", "dataToWrite:%s", java.util.Arrays.toString(a17));
        }
        if (bluetoothGatt.writeCharacteristic(characteristic)) {
            characteristic.setWriteType(writeType);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.writeCharacteristic fail", this);
        characteristic.setWriteType(writeType);
        p(ob1.m.b("writeCharacteristic fail"));
        m();
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "WriteCharacteristicAction";
    }

    @Override // ob1.c
    /* renamed from: toString */
    public java.lang.String mo147104x9616526c() {
        return "WriteCharacteristicAction#" + this.f425531m + "{serviceId='" + this.f406861n + "', characteristicId='" + this.f406862o + "', value='" + this.f406865r + "', debug=" + this.f425524f + ", mainThread=" + this.f425525g + ", serial=" + this.f425526h + '}';
    }
}
