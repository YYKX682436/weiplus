package wt1;

/* loaded from: classes13.dex */
public class t {

    /* renamed from: b, reason: collision with root package name */
    public android.bluetooth.BluetoothAdapter f530878b;

    /* renamed from: e, reason: collision with root package name */
    public android.content.BroadcastReceiver f530881e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wt1.p f530885i;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f530877a = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f530879c = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f530880d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final long f530882f = 3000;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f530883g = new wt1.u(this);

    /* renamed from: h, reason: collision with root package name */
    public final android.bluetooth.BluetoothAdapter.LeScanCallback f530884h = new wt1.w(this);

    public t(wt1.p pVar, wt1.q qVar) {
        this.f530885i = pVar;
    }

    public wt1.x a() {
        wt1.x xVar = new wt1.x("", -100, "", null);
        java.util.Map map = this.f530880d;
        if (((java.util.concurrent.ConcurrentHashMap) map).size() <= 0) {
            return xVar;
        }
        for (wt1.x xVar2 : ((java.util.concurrent.ConcurrentHashMap) map).values()) {
            if (xVar.f530896b < xVar2.f530896b) {
                xVar = xVar2;
            }
        }
        return xVar;
    }

    public void b() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (this.f530877a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "already start");
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f530880d).clear();
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            this.f530879c = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardLbsOrBluetooth", "bluetoothManager is null");
            return;
        }
        this.f530879c = true;
        android.bluetooth.BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.f530878b = adapter;
        if (adapter == null || !adapter.isEnabled()) {
            this.f530879c = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardLbsOrBluetooth", "bluetoothAdapter is null or bluetoothAdapter is disable");
            return;
        }
        wt1.p pVar = this.f530885i;
        final wt1.C30722x3546ed c30722x3546ed = new wt1.C30722x3546ed(this);
        pVar.getClass();
        if (i17 < 31) {
            c30722x3546ed.a(true);
            return;
        }
        if (((tb0.j) i95.n0.c(tb0.j.class)) == null) {
            c30722x3546ed.a(false);
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = pVar.f530852d;
        if (abstractActivityC21394xb3d2c0cf == null) {
            c30722x3546ed.a(false);
            return;
        }
        final java.lang.String[] strArr = {"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"};
        if (j35.u.h(abstractActivityC21394xb3d2c0cf, strArr)) {
            c30722x3546ed.a(true);
        } else {
            j35.u.j(abstractActivityC21394xb3d2c0cf, 144, new j35.b0() { // from class: wt1.p$$a
                @Override // j35.b0
                /* renamed from: onRequestPermissionsResult */
                public final void mo2413x953457f1(int i18, java.lang.String[] strArr2, int[] iArr) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "onRequestPermissionsResult, requestCode: %d, requestPermissions: %s, grantResults: %s", java.lang.Integer.valueOf(i18), java.util.Arrays.toString(strArr2), java.util.Arrays.toString(iArr));
                    if (144 != i18) {
                        return;
                    }
                    wt1.y yVar = wt1.y.this;
                    if (strArr2 == null) {
                        ((wt1.C30722x3546ed) yVar).a(false);
                        return;
                    }
                    java.util.List asList = java.util.Arrays.asList(strArr2);
                    for (java.lang.String str : strArr) {
                        int indexOf = asList.indexOf(str);
                        if (-1 == indexOf || iArr[indexOf] != 0) {
                            ((wt1.C30722x3546ed) yVar).a(false);
                            return;
                        }
                    }
                    ((wt1.C30722x3546ed) yVar).a(true);
                }
            }, strArr, "", "");
        }
    }

    public void c() {
        if (!this.f530877a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "not start");
            return;
        }
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.f530878b;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            this.f530879c = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardLbsOrBluetooth", "bluetoothAdapter is null or bluetoothAdapter is disable");
        } else {
            this.f530879c = true;
            this.f530878b.stopLeScan(this.f530884h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "stopLeScan");
            this.f530877a = false;
        }
    }
}
