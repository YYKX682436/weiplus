package u32;

/* loaded from: classes13.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u32.p f505863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f505864e;

    public n(u32.p pVar, long j17) {
        this.f505863d = pVar;
        this.f505864e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String name;
        boolean b17;
        u32.p pVar = this.f505863d;
        long j17 = this.f505864e;
        iz5.a.g(null, pVar.f505876d.containsKey(java.lang.Long.valueOf(j17)));
        kq1.n nVar = pVar.f505873a;
        int intValue = ((java.lang.Integer) pVar.f505876d.get(java.lang.Long.valueOf(j17))).intValue();
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***connect*** aSessionId = " + j17 + " aBluetoothVersion = " + intValue);
        boolean z17 = true;
        if (intValue != 0) {
            if (intValue != 1) {
                iz5.a.g(null, false);
            } else {
                jq1.e eVar = nVar.f392789c;
                if (eVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothChatManager", "connect, session id = %d, secure = %s", java.lang.Long.valueOf(j17), java.lang.String.valueOf(true));
                    iz5.a.g(null, eVar.f382600g);
                    if (!eVar.a()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
                    } else if (lq1.a.b() || android.os.Build.VERSION.SDK_INT < 31) {
                        jq1.f fVar = (jq1.f) eVar.f382596c.get(java.lang.Long.valueOf(j17));
                        iz5.a.g(null, fVar != null);
                        fVar.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothChatSession", "connect");
                        long j18 = fVar.f382603b;
                        android.bluetooth.BluetoothDevice bluetoothDevice = fVar.f382607f;
                        if (bluetoothDevice == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothChatSession", "Can not found remote device(" + a42.i.f(fVar.f382602a) + ")");
                            eVar.f382594a.b(j18, 7, "Device not found");
                        } else {
                            jq1.h hVar = fVar.f382604c;
                            if (hVar != null) {
                                hVar.a();
                                fVar.f382604c = null;
                            }
                            jq1.h hVar2 = new jq1.h(fVar, eVar, bluetoothDevice, true);
                            fVar.f382604c = hVar2;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ConnectThread", "------connect------");
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = hVar2.f382615g;
                            if (!n3Var.mo50308x2936bf5f(n3Var.mo50289x733c63a2(0))) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ConnectThread", "sendMessage = %d failed!!!", 0);
                                eVar.f382594a.a(j18, false);
                            }
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothChatManager", "BC ConnectPermission is disabled");
                    }
                }
            }
            z17 = false;
        } else {
            hq1.j jVar = nVar.f392788b;
            if (jVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "------connect------ sessionId = %d ", java.lang.Long.valueOf(j17));
                iz5.a.g(null, jVar.f364674g);
                if (!jVar.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
                } else if (lq1.a.b() || android.os.Build.VERSION.SDK_INT < 31) {
                    hq1.t tVar = (hq1.t) jVar.f364670c.get(java.lang.String.valueOf(j17));
                    iz5.a.g(null, tVar != null);
                    android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) jVar.f364669b.getSystemService("bluetooth");
                    if (bluetoothManager == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEManager", "null == bluetoothManager");
                    } else {
                        java.util.List<android.bluetooth.BluetoothDevice> connectedDevices = bluetoothManager.getConnectedDevices(8);
                        if (connectedDevices == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "null == list, may be no device is connected phone now");
                        } else {
                            java.util.Iterator<android.bluetooth.BluetoothDevice> it = connectedDevices.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    android.bluetooth.BluetoothDevice next = it.next();
                                    long h17 = a42.i.h(next.getAddress());
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "get connected device: mac = %s, long of mac =%d, name = %s", next.getAddress(), java.lang.Long.valueOf(h17), next.getName());
                                    if (j17 == h17) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "This device is connected to phone now, start connecting without scan...");
                                        b17 = tVar.b();
                                        break;
                                    }
                                } else {
                                    java.lang.String str = android.os.Build.VERSION.RELEASE;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "Android version realse code: %s", str);
                                    if (!fp.h.c(23) || com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a() || str.equalsIgnoreCase("6.0") || str.equalsIgnoreCase("6.0.0")) {
                                        java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = bluetoothManager.getAdapter().getBondedDevices();
                                        if (bondedDevices != null) {
                                            java.util.Iterator<android.bluetooth.BluetoothDevice> it6 = bondedDevices.iterator();
                                            loop1: while (true) {
                                                if (!it6.hasNext()) {
                                                    break;
                                                }
                                                android.bluetooth.BluetoothDevice next2 = it6.next();
                                                long h18 = a42.i.h(next2.getAddress());
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "get paired device: mac = %s, long of mac =%d, name = %s", next2.getAddress(), java.lang.Long.valueOf(h18), next2.getName());
                                                if (j17 == h18) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "This HID device is paired to phone now, check if it is connected...");
                                                    android.hardware.input.InputManager inputManager = (android.hardware.input.InputManager) jVar.f364669b.getSystemService("input");
                                                    int[] inputDeviceIds = inputManager.getInputDeviceIds();
                                                    if (inputDeviceIds == null) {
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "get input devices failed");
                                                        break;
                                                    }
                                                    for (int i17 : inputDeviceIds) {
                                                        android.view.InputDevice inputDevice = inputManager.getInputDevice(i17);
                                                        if (inputDevice != null && (name = inputDevice.getName()) != null && name.equals(next2.getName())) {
                                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "This HID deivce has connected to phone as a input device");
                                                            b17 = tVar.b();
                                                            break loop1;
                                                        }
                                                    }
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "This HID device hasn't been connected...");
                                                }
                                            }
                                        } else {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "null == pairedDevices,get paired devices failed");
                                        }
                                    } else {
                                        b17 = tVar.b();
                                    }
                                }
                            }
                            z17 = b17;
                        }
                    }
                    jVar.f364677j.add(java.lang.Long.valueOf(j17));
                    b17 = jVar.d(true, new int[0]);
                    z17 = b17;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEManager", "BLE ConnectPermission is disabled");
                }
            }
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "mBTSDKMrg.connect failed!!!");
            pVar.c(j17, false);
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.connectImp failed!!!");
    }
}
