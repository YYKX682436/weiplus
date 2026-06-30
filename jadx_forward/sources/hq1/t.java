package hq1;

/* loaded from: classes13.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final long f364712a;

    /* renamed from: b, reason: collision with root package name */
    public final android.bluetooth.BluetoothDevice f364713b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f364714c;

    /* renamed from: d, reason: collision with root package name */
    public android.bluetooth.BluetoothGatt f364715d;

    /* renamed from: e, reason: collision with root package name */
    public final hq1.j f364716e;

    /* renamed from: f, reason: collision with root package name */
    public android.bluetooth.BluetoothGattCharacteristic f364717f;

    /* renamed from: g, reason: collision with root package name */
    public android.bluetooth.BluetoothGattCharacteristic f364718g;

    /* renamed from: h, reason: collision with root package name */
    public final hq1.a f364719h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f364720i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f364721j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f364722k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Runnable f364723l;

    /* renamed from: p, reason: collision with root package name */
    public int f364727p;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f364725n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f364726o = false;

    /* renamed from: q, reason: collision with root package name */
    public final android.bluetooth.BluetoothGattCallback f364728q = new hq1.o(this);

    /* renamed from: m, reason: collision with root package name */
    public final hq1.t f364724m = this;

    public t(long j17, android.content.Context context, hq1.j jVar) {
        this.f364716e = jVar;
        this.f364714c = context;
        android.bluetooth.BluetoothAdapter adapter = ((android.bluetooth.BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        this.f364712a = j17;
        this.f364727p = 3;
        this.f364713b = adapter.getRemoteDevice(a42.i.f(j17));
        this.f364717f = null;
        this.f364718g = null;
        this.f364719h = new hq1.a(20);
        this.f364720i = new hq1.s(xu5.b.a("BluetoothLESession_handlerThread"), this);
        this.f364721j = new hq1.p(this);
        this.f364722k = new hq1.q(this);
        this.f364723l = new hq1.r(this);
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESession", "------close------");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f364720i;
        if (!n3Var.mo50308x2936bf5f(n3Var.mo50289x733c63a2(2))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 2);
        }
        n3Var.m77787xbe88f509();
    }

    public boolean b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESession", "------connect------");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f364720i;
        return n3Var.mo50308x2936bf5f(n3Var.mo50289x733c63a2(0));
    }

    public final void c() {
        if (this.f364725n.isEmpty()) {
            this.f364726o = false;
            return;
        }
        byte[] bArr = (byte[]) this.f364725n.pop();
        hq1.a aVar = this.f364719h;
        if (bArr == null) {
            aVar.f364610a = null;
            aVar.f364612c = 0;
            aVar.f364611b = 0;
        } else {
            aVar.getClass();
            byte[] bArr2 = new byte[bArr.length];
            aVar.f364610a = bArr2;
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            aVar.f364612c = bArr.length;
            aVar.f364611b = 0;
        }
        byte[] a17 = this.f364719h.a();
        a42.i.a(a17);
        this.f364718g.setValue(a17);
        this.f364720i.mo50297x7c4d7ca2(this.f364721j, 5000L);
        if (!this.f364715d.writeCharacteristic(this.f364718g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESession", "mBluetoothGatt.writeCharacteristic Failed!!!");
        }
        this.f364726o = true;
    }
}
