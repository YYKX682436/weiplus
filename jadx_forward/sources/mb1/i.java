package mb1;

/* loaded from: classes7.dex */
public final class i extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f406847a;

    /* renamed from: b, reason: collision with root package name */
    public final android.bluetooth.BluetoothDevice f406848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mb1.j f406849c;

    public i(mb1.j jVar, android.content.Context context, android.bluetooth.BluetoothDevice device) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        this.f406849c = jVar;
        this.f406847a = context;
        this.f406848b = device;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.os.Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE") : null;
        android.bluetooth.BluetoothDevice bluetoothDevice = this.f406848b;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bluetoothDevice, parcelableExtra)) {
            mb1.j jVar = this.f406849c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f406854r, "onReceive, intent: " + intent, new java.lang.Object[0]);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android.bluetooth.device.action.PAIRING_REQUEST", intent.getAction())) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android.bluetooth.device.action.BOND_STATE_CHANGED", intent.getAction())) {
                    if (!intent.hasExtra("android.bluetooth.device.extra.BOND_STATE")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(jVar.f406854r, "Cannot find EXTRA_BOND_STATE", new java.lang.Object[0]);
                        return;
                    }
                    switch (intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1)) {
                        case 10:
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f406854r, "BOND_NONE, reason: " + intent.getIntExtra("android.bluetooth.device.extra.REASON", -1), new java.lang.Object[0]);
                            jVar.p(ob1.m.a(null));
                            jVar.m();
                            return;
                        case 11:
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f406854r, "BOND_BONDING", new java.lang.Object[0]);
                            return;
                        case 12:
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f406854r, "BOND_BONDED", new java.lang.Object[0]);
                            jVar.p(ob1.m.f425551e);
                            jVar.m();
                            return;
                        default:
                            return;
                    }
                }
                return;
            }
            if (!intent.hasExtra("android.bluetooth.device.extra.PAIRING_VARIANT")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(jVar.f406854r, "Cannot find EXTRA_PAIRING_VARIANT", new java.lang.Object[0]);
                return;
            }
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", -1);
            if (intExtra != 0) {
                if (intExtra != 2) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f406854r, "PAIRING_VARIANT_PASSKEY_CONFIRMATION", new java.lang.Object[0]);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f406854r, "PAIRING_VARIANT_PIN", new java.lang.Object[0]);
            if (jVar.f406851o == null) {
                jVar.p(ob1.m.f425568v);
                jVar.m();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f406854r, "setPin", new java.lang.Object[0]);
            if (!bluetoothDevice.setPin(jVar.f406851o) || jVar.f406853q) {
                return;
            }
            jVar.p(ob1.m.f425551e);
            jVar.m();
        }
    }
}
