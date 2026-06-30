package jq1;

/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public android.bluetooth.BluetoothSocket f382609a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f382610b;

    /* renamed from: c, reason: collision with root package name */
    public final jq1.f f382611c;

    /* renamed from: d, reason: collision with root package name */
    public final jq1.e f382612d;

    /* renamed from: f, reason: collision with root package name */
    public final android.bluetooth.BluetoothDevice f382614f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f382613e = false;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f382615g = new jq1.g(xu5.b.a("BluetoothChatThreads_handlerThread"), this);

    public h(jq1.f fVar, jq1.e eVar, android.bluetooth.BluetoothDevice bluetoothDevice, boolean z17) {
        this.f382612d = eVar;
        this.f382611c = fVar;
        this.f382610b = z17;
        this.f382614f = bluetoothDevice;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ConnectThread", "------disconnect------");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f382615g;
        if (!n3Var.mo50308x2936bf5f(n3Var.mo50289x733c63a2(1))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ConnectThread", "sendMessage = %d failed!!!", 1);
        }
        n3Var.m77787xbe88f509();
    }
}
