package hq1;

/* loaded from: classes13.dex */
public final class h0 {

    /* renamed from: t, reason: collision with root package name */
    public static int f364642t;

    /* renamed from: a, reason: collision with root package name */
    public final long f364643a;

    /* renamed from: b, reason: collision with root package name */
    public final android.bluetooth.BluetoothDevice f364644b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f364645c;

    /* renamed from: d, reason: collision with root package name */
    public android.bluetooth.BluetoothGatt f364646d;

    /* renamed from: e, reason: collision with root package name */
    public hq1.f0 f364647e;

    /* renamed from: f, reason: collision with root package name */
    public final hq1.a f364648f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f364649g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f364650h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f364651i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f364652j;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f364656n;

    /* renamed from: r, reason: collision with root package name */
    public boolean f364660r;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f364654l = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f364655m = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f364657o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public long f364658p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f364659q = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final android.bluetooth.BluetoothGattCallback f364661s = new hq1.b0(this);

    /* renamed from: k, reason: collision with root package name */
    public final hq1.h0 f364653k = this;

    public h0(long j17, android.content.Context context, hq1.f0 f0Var) {
        this.f364647e = f0Var;
        this.f364645c = context;
        android.bluetooth.BluetoothAdapter adapter = ((android.bluetooth.BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        this.f364643a = j17;
        this.f364656n = 3;
        this.f364644b = adapter.getRemoteDevice(a42.i.f(j17));
        this.f364648f = new hq1.a(20);
        this.f364660r = false;
        this.f364649g = new hq1.g0(xu5.b.a("BluetoothLESimpleSession_handlerThread"), this);
        this.f364650h = new hq1.c0(this);
        this.f364651i = new hq1.d0(this);
        this.f364652j = new hq1.e0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(hq1.h0 r25, android.bluetooth.BluetoothGattCharacteristic r26) {
        /*
            Method dump skipped, instructions count: 1331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hq1.h0.a(hq1.h0, android.bluetooth.BluetoothGattCharacteristic):void");
    }

    public boolean b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------connect------, mac=%s, name=%s", a42.i.f(this.f364643a), lq1.a.c(this.f364644b));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f364649g;
        return n3Var.mo50308x2936bf5f(n3Var.mo50289x733c63a2(0));
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "markSessionDisconnected, mac=%s, name=%s", a42.i.f(this.f364643a), lq1.a.c(this.f364644b));
        this.f364656n = 2;
        this.f364649g.mo50300x3fa464aa(this.f364651i);
        this.f364649g.mo50300x3fa464aa(this.f364652j);
        d();
        e();
    }

    public final void d() {
        hq1.f0 f0Var = this.f364647e;
        android.bluetooth.BluetoothDevice bluetoothDevice = this.f364644b;
        long j17 = this.f364643a;
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------notifySessionClose------ don't need to notify, mac=%s, name=%s", a42.i.f(j17), lq1.a.c(bluetoothDevice));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------notifySessionClose------, mac=%s, name=%s", a42.i.f(j17), lq1.a.c(bluetoothDevice));
        hq1.f0 f0Var2 = this.f364647e;
        if (f0Var2 != null) {
            f0Var2.a(this.f364643a, false, this.f364658p);
        }
        this.f364647e = null;
    }

    public final void e() {
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f364646d;
        android.bluetooth.BluetoothDevice bluetoothDevice = this.f364644b;
        long j17 = this.f364643a;
        if (bluetoothGatt == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------releaseResources------ nothing to release, objid=%d, mac=%s, name=%s", java.lang.Integer.valueOf(hashCode()), a42.i.f(j17), lq1.a.c(bluetoothDevice));
            return;
        }
        f364642t--;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------releaseResources------, objid=%d, resourceCount=%d, mac=%s, name=%s", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(f364642t), a42.i.f(j17), lq1.a.c(bluetoothDevice));
        this.f364660r = false;
        this.f364646d.close();
        this.f364649g.m77787xbe88f509();
        this.f364646d = null;
    }

    public final void f() {
        if (this.f364654l.isEmpty()) {
            this.f364655m = false;
            return;
        }
        iq1.a b17 = iq1.a.b((byte[]) this.f364654l.pop());
        byte[] a17 = b17.a();
        java.lang.String str = b17.f375201e;
        int i17 = b17.f375202f;
        java.lang.String b18 = iq1.f.b(b17.f375200d);
        java.util.HashMap hashMap = (java.util.HashMap) this.f364657o.get(b18);
        if (hashMap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "service(%s) not found, mac=%s, name=%s", b18, a42.i.f(this.f364643a), lq1.a.c(this.f364644b));
            hq1.f0 f0Var = this.f364647e;
            if (f0Var != null) {
                f0Var.b(this.f364643a, false);
                return;
            }
            return;
        }
        android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic = (android.bluetooth.BluetoothGattCharacteristic) hashMap.get(str);
        if (bluetoothGattCharacteristic == null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (str == null) {
                str = "null";
            }
            objArr[0] = str;
            objArr[1] = a42.i.f(this.f364643a);
            objArr[2] = lq1.a.c(this.f364644b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "characteristic(%s) not found, mac=%s, name=%s", objArr);
            hq1.f0 f0Var2 = this.f364647e;
            if (f0Var2 != null) {
                f0Var2.b(this.f364643a, false);
                return;
            }
            return;
        }
        if (i17 != 8) {
            a42.i.f(this.f364643a);
            lq1.a.c(this.f364644b);
            hq1.f0 f0Var3 = this.f364647e;
            if (f0Var3 != null) {
                f0Var3.b(this.f364643a, false);
                return;
            }
            return;
        }
        hq1.a aVar = this.f364648f;
        aVar.f364613d = bluetoothGattCharacteristic;
        if (a17 == null) {
            aVar.f364610a = null;
            aVar.f364612c = 0;
            aVar.f364611b = 0;
        } else {
            byte[] bArr = new byte[a17.length];
            aVar.f364610a = bArr;
            java.lang.System.arraycopy(a17, 0, bArr, 0, a17.length);
            aVar.f364612c = a17.length;
            aVar.f364611b = 0;
        }
        byte[] a18 = this.f364648f.a();
        a42.i.a(a18);
        a42.i.f(this.f364643a);
        lq1.a.c(this.f364644b);
        bluetoothGattCharacteristic.setValue(a18);
        this.f364649g.mo50297x7c4d7ca2(this.f364650h, 5000L);
        if (this.f364646d.writeCharacteristic(bluetoothGattCharacteristic)) {
            this.f364655m = true;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "mBluetoothGatt.writeCharacteristic Failed!!!, mac=%s, name=%s", a42.i.f(this.f364643a), lq1.a.c(this.f364644b));
        hq1.f0 f0Var4 = this.f364647e;
        if (f0Var4 != null) {
            f0Var4.b(this.f364643a, false);
        }
    }
}
