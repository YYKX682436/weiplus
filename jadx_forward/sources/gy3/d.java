package gy3;

/* loaded from: classes13.dex */
public final class d implements gy3.a, gy3.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f359086a;

    /* renamed from: b, reason: collision with root package name */
    public final android.bluetooth.BluetoothAdapter f359087b;

    /* renamed from: c, reason: collision with root package name */
    public gy3.j f359088c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f359089d;

    /* renamed from: e, reason: collision with root package name */
    public gy3.k f359090e;

    /* renamed from: f, reason: collision with root package name */
    public long f359091f;

    /* renamed from: g, reason: collision with root package name */
    public final gy3.c f359092g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f359093h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f359094i;

    /* renamed from: j, reason: collision with root package name */
    public final gy3.b f359095j;

    /* renamed from: k, reason: collision with root package name */
    public android.content.BroadcastReceiver f359096k;

    public d(android.content.Context mContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f359086a = mContext;
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(defaultAdapter, "getDefaultAdapter(...)");
        this.f359087b = defaultAdapter;
        this.f359089d = "";
        this.f359092g = new gy3.c(this);
        this.f359095j = new gy3.b();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        if (this.f359096k == null) {
            android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver(this) { // from class: com.tencent.mm.plugin.rtos.bluetooth.RtosBCChannel$RtosBCReceiver

                /* renamed from: a, reason: collision with root package name */
                public final java.lang.ref.WeakReference f240114a;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this, "rtosBCChannel");
                    this.f240114a = new java.lang.ref.WeakReference(this);
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(android.content.Context context, android.content.Intent intent) {
                    java.lang.String action = intent != null ? intent.getAction() : null;
                    gy3.d dVar = (gy3.d) this.f240114a.get();
                    if (dVar == null || action == null) {
                        return;
                    }
                    int hashCode = action.hashCode();
                    gy3.c cVar = dVar.f359092g;
                    switch (hashCode) {
                        case -1530327060:
                            if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
                                int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", 10);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "------ACTION_STATE_CHANGED------ from " + intExtra2 + " -> " + intExtra);
                                if ((intExtra2 == 11 || intExtra2 == 10) && intExtra == 12) {
                                    cVar.mo50308x2936bf5f(cVar.mo50289x733c63a2(7));
                                }
                                if ((intExtra2 == 13 || intExtra2 == 12) && intExtra == 10) {
                                    cVar.mo50308x2936bf5f(cVar.mo50289x733c63a2(8));
                                    return;
                                }
                                return;
                            }
                            return;
                        case -301431627:
                            if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                                android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bluetoothDevice);
                                java.lang.String address = bluetoothDevice.getAddress();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "------ACTION_ACL_CONNECTED------ device name = " + bluetoothDevice.getName() + ", device Mac = " + address);
                                if (!r26.i0.p(dVar.f359089d, address, true) || dVar.f359094i || dVar.f359093h || !dVar.e()) {
                                    return;
                                }
                                dVar.f359095j.a();
                                dVar.b();
                                return;
                            }
                            return;
                        case 1821585647:
                            if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                                android.bluetooth.BluetoothDevice bluetoothDevice2 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bluetoothDevice2);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "------ACTION_ACL_DISCONNECTED------ device name = " + bluetoothDevice2.getName() + ", device Mac = " + bluetoothDevice2.getAddress());
                                return;
                            }
                            return;
                        case 2116862345:
                            if (action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                                android.bluetooth.BluetoothDevice bluetoothDevice3 = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bluetoothDevice3);
                                java.lang.String address2 = bluetoothDevice3.getAddress();
                                int intExtra3 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", 10);
                                int intExtra4 = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "------ACTION_BOND_STATE_CHANGED------ device name = " + bluetoothDevice3.getName() + ", device Mac = " + address2 + ", from " + intExtra3 + " -> " + intExtra4);
                                if (r26.i0.p(dVar.f359089d, address2, true) && intExtra3 == 12 && intExtra4 == 10 && cVar != null) {
                                    cVar.mo50308x2936bf5f(cVar != null ? cVar.mo50289x733c63a2(3) : null);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            };
            this.f359096k = broadcastReceiver;
            mContext.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "clear");
        this.f359089d = "";
        this.f359090e = null;
        gy3.c cVar = this.f359092g;
        cVar.mo50303x856b99f0(1);
        cVar.mo50303x856b99f0(2);
        this.f359095j.a();
    }

    public void b() {
        if (this.f359089d.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosBCChannel", "device mac is empty");
            return;
        }
        if (this.f359093h || this.f359094i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosBCChannel", "Remoto device is aready connect or connecting, just leave");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "begin establish socket");
        this.f359094i = true;
        gy3.c cVar = this.f359092g;
        cVar.mo50303x856b99f0(1);
        cVar.mo50303x856b99f0(2);
        if (android.os.Build.VERSION.SDK_INT < 31 || b3.l.m9698x3fed0563(this.f359086a, "android.permission.BLUETOOTH_SCAN") == 0) {
            this.f359087b.cancelDiscovery();
        }
        if (this.f359089d.length() > 0) {
            android.bluetooth.BluetoothDevice remoteDevice = android.bluetooth.BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.f359089d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remoteDevice, "getRemoteDevice(...)");
            gy3.j jVar = this.f359088c;
            if (jVar != null) {
                gy3.f fVar = jVar.f359115b;
                if (fVar != null) {
                    fVar.a();
                }
                jVar.f359115b = null;
                gy3.f fVar2 = new gy3.f(jVar, remoteDevice);
                jVar.f359115b = fVar2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBluetoothThreads", "------connect------");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = fVar2.f359101d;
                if (!n3Var.mo50308x2936bf5f(n3Var.mo50289x733c63a2(0))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "sendMessage = %d failed!!!", 0);
                    ((gy3.d) fVar2.f359098a.f359114a).g();
                }
            }
            gy3.b bVar = this.f359095j;
            if (bVar.f359084c > 0) {
                cVar.mo50311x7ab51103(cVar.mo50289x733c63a2(1), bVar.f359084c);
            }
        }
    }

    public java.lang.String c() {
        java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices;
        if (this.f359089d.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "getDeviceName mac is empty");
            return "";
        }
        if ((android.os.Build.VERSION.SDK_INT < 31 || b3.l.m9698x3fed0563(this.f359086a, "android.permission.BLUETOOTH_CONNECT") == 0) && (bondedDevices = this.f359087b.getBondedDevices()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "Found " + bondedDevices.size() + " devices when getting device name");
            java.util.Iterator<android.bluetooth.BluetoothDevice> it = bondedDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                android.bluetooth.BluetoothDevice next = it.next();
                if (r26.i0.p(next.getAddress(), this.f359089d, true)) {
                    if (next.getName() != null) {
                        java.lang.String name = next.getName();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
                        return name;
                    }
                }
            }
        }
        return "";
    }

    public boolean d(java.lang.String mac) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mac, "mac");
        if (this.f359089d.length() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosBCChannel", "try init mac but not null");
            return true;
        }
        java.lang.String upperCase = mac.toUpperCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase, "toUpperCase(...)");
        this.f359089d = upperCase;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "BC channel init with mac " + this.f359089d);
        this.f359095j.a();
        this.f359088c = new gy3.j(this.f359089d, this);
        this.f359091f = a42.i.h(this.f359089d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "channel is " + this.f359091f);
        return this.f359091f != 0;
    }

    public boolean e() {
        java.lang.String mac = this.f359089d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mac, "mac");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "checkDeviceBonded ".concat(mac));
        if (mac.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "checkDeviceBonded mac is empty");
        } else {
            android.bluetooth.BluetoothAdapter bluetoothAdapter = this.f359087b;
            if (bluetoothAdapter.isEnabled()) {
                if (android.os.Build.VERSION.SDK_INT < 31 || b3.l.m9698x3fed0563(this.f359086a, "android.permission.BLUETOOTH_CONNECT") == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "Permission check passed, attempting to get bonded devices");
                    java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
                    if (bondedDevices != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "Found " + bondedDevices.size() + " bonded devices");
                        for (android.bluetooth.BluetoothDevice bluetoothDevice : bondedDevices) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bluetoothDevice);
                            if (r26.i0.p(bluetoothDevice.getAddress(), mac, true)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "device " + mac + " was bonded!");
                                return true;
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "No matching device found in bonded devices list");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosBCChannel", "bondedDevices is null");
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosBCChannel", "BLUETOOTH_CONNECT permission not granted");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosBCChannel", "no bondedDevices or device not found");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosBCChannel", "Bluetooth is not enabled, cannot get bonded devices");
            }
        }
        return false;
    }

    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "onConnecting");
        this.f359094i = true;
        this.f359093h = false;
    }

    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "onDisconnected");
        boolean z17 = false;
        this.f359094i = false;
        this.f359093h = false;
        gy3.c cVar = this.f359092g;
        cVar.mo50308x2936bf5f(cVar.mo50289x733c63a2(6));
        if (!e() || cVar.mo50285x8fc9be06(2)) {
            return;
        }
        android.os.Message mo50289x733c63a2 = cVar.mo50289x733c63a2(2);
        gy3.b bVar = this.f359095j;
        long j17 = bVar.f359082a + bVar.f359083b;
        bVar.f359082a = j17;
        long j18 = 30000;
        if (11000 <= j17 && j17 < 30000) {
            z17 = true;
        }
        if (z17) {
            bVar.f359083b = 3000L;
            bVar.f359084c = 8000L;
        }
        if (j17 >= 30000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "enter long delay reconnect strategy");
            bVar.f359082a = 30000L;
            bVar.f359083b = 0L;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "reconnect delay " + bVar.f359082a);
            j18 = bVar.f359082a;
        }
        cVar.mo50311x7ab51103(mo50289x733c63a2, j18);
    }

    public void h(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "channel onError, " + str);
    }

    public void i(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "--------send, data size = " + i17 + ", result = " + z17);
    }
}
