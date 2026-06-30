package jq1;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.UUID f382592i = java.util.UUID.fromString("e5b152ed-6b46-09e9-4678-665e9a972cbc");

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.UUID f382593j = java.util.UUID.fromString("e5b152ed-6b46-09e9-4678-665e9a972cbc");

    /* renamed from: a, reason: collision with root package name */
    public jq1.c f382594a;

    /* renamed from: b, reason: collision with root package name */
    public android.bluetooth.BluetoothAdapter f382595b;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f382597d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f382598e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f382600g = false;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.BroadcastReceiver f382601h = new jq1.a(this);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f382596c = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f382599f = new jq1.b(this);

    public e(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f382598e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(n3Var.mo50284xdd3e8650());
    }

    public boolean a() {
        iz5.a.g(null, this.f382600g);
        return this.f382595b != null;
    }

    public boolean b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothChatManager", "scanDevices".concat(z17 ? "true" : "false"));
        iz5.a.g(null, this.f382600g);
        if (!a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
            return false;
        }
        if (!z17) {
            return c();
        }
        if (this.f382595b.isDiscovering() && !c()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothChatManager", "[BluetoothTrace] start scan");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.BluetoothChatManager", new java.lang.Throwable(), "[BluetoothTrace] startDiscovery stacktrace", new java.lang.Object[0]);
        if (((java.lang.Boolean) yj0.a.j(this.f382595b, "com/tencent/mm/plugin/bluetooth/sdk/classic/BluetoothChatManager", "scanDevices", "(Z)Z", "android/bluetooth/BluetoothAdapter", "startDiscovery", "()Z")).booleanValue()) {
            this.f382598e.mo50297x7c4d7ca2(this.f382599f, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothChatManager", "mAdapter.startDiscovery() Failed");
        return false;
    }

    public final boolean c() {
        if (!this.f382595b.isDiscovering()) {
            return true;
        }
        if (this.f382595b.cancelDiscovery()) {
            this.f382598e.mo50300x3fa464aa(this.f382599f);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothChatManager", "mAdapter.cancelDiscovery Failed!!!");
        return false;
    }
}
