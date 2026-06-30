package ob1;

/* loaded from: classes7.dex */
public abstract class c implements lb1.l {

    /* renamed from: a, reason: collision with root package name */
    public lb1.k f425519a;

    /* renamed from: b, reason: collision with root package name */
    public lb1.d f425520b;

    /* renamed from: c, reason: collision with root package name */
    public ob1.d f425521c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f425522d = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f425523e = new ob1.a(this);

    /* renamed from: f, reason: collision with root package name */
    public boolean f425524f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f425525g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f425526h;

    /* renamed from: i, reason: collision with root package name */
    public long f425527i;

    /* renamed from: j, reason: collision with root package name */
    public final long f425528j;

    /* renamed from: k, reason: collision with root package name */
    public ob1.m f425529k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f425530l;

    /* renamed from: m, reason: collision with root package name */
    public final int f425531m;

    public c() {
        kb1.b.a().getClass();
        this.f425524f = false;
        kb1.b.a().getClass();
        this.f425525g = true;
        kb1.b.a().getClass();
        this.f425526h = true;
        kb1.b.a().getClass();
        this.f425527i = 33000L;
        kb1.b.a().getClass();
        this.f425528j = 10;
        this.f425530l = false;
        this.f425531m = hashCode();
    }

    @Override // lb1.l
    public void a(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
    }

    @Override // lb1.l
    public void b(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
    }

    @Override // lb1.l
    public void c(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
    }

    @Override // lb1.l
    public void d(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    @Override // lb1.l
    public void e(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
    }

    @Override // lb1.l
    public void f(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
    }

    @Override // lb1.l
    public void g(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
    }

    @Override // lb1.l
    public void h(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
    }

    @Override // lb1.l
    public void i(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
    }

    @Override // lb1.l
    public void j(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
    }

    public void k() {
        iz5.a.d(null, this.f425519a);
        iz5.a.d(null, this.f425520b);
        iz5.a.d(null, this.f425521c);
        this.f425522d.postDelayed(this.f425523e, this.f425527i);
        l();
    }

    public abstract void l();

    public void m() {
        this.f425522d.removeCallbacks(this.f425523e);
        this.f425530l = true;
        o(this.f425529k);
        lb1.d dVar = this.f425520b;
        java.lang.Object obj = this.f425529k;
        dVar.getClass();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this;
        if (obj == null) {
            obj = "";
        }
        objArr[1] = obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.BleConnectDispatcher", "actionCompleteCallback action:%s result:%s", objArr);
        if (this.f425526h) {
            dVar.k();
            return;
        }
        java.util.List list = dVar.f399235c;
        if (list != null) {
            ((java.util.ArrayList) list).remove(this);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.BleConnectDispatcher", "actionCompleteCallback, runActions is null", new java.lang.Object[0]);
        }
    }

    public abstract java.lang.String n();

    public void o(ob1.m mVar) {
    }

    public void p(ob1.m mVar) {
        this.f425529k = mVar;
        if (this.f425525g) {
            this.f425522d.post(new ob1.b(this, mVar));
        } else {
            this.f425521c.a(mVar);
        }
    }

    /* renamed from: toString */
    public java.lang.String mo147104x9616526c() {
        return "Action#" + this.f425531m + "{action='" + n() + "', debug=" + this.f425524f + ", mainThread=" + this.f425525g + ", serial=" + this.f425526h + '}';
    }
}
