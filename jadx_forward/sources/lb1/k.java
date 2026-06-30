package lb1;

/* loaded from: classes7.dex */
public class k implements lb1.l {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f399247b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f399248c;

    /* renamed from: d, reason: collision with root package name */
    public volatile lb1.d f399249d;

    /* renamed from: e, reason: collision with root package name */
    public volatile android.bluetooth.BluetoothGatt f399250e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f399251f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.util.Map f399252g;

    /* renamed from: k, reason: collision with root package name */
    public final lb1.i f399256k;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399246a = "MicroMsg.Ble.BleConnectWorker#" + hashCode();

    /* renamed from: h, reason: collision with root package name */
    public volatile ob1.k f399253h = null;

    /* renamed from: i, reason: collision with root package name */
    public volatile ob1.j f399254i = null;

    /* renamed from: j, reason: collision with root package name */
    public volatile ob1.i f399255j = null;

    /* renamed from: l, reason: collision with root package name */
    public volatile int f399257l = -1;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.BroadcastReceiver f399258m = new lb1.j(this);

    public k(android.content.Context context, java.lang.String str, lb1.i iVar) {
        this.f399247b = context;
        this.f399248c = str;
        this.f399256k = iVar;
    }

    @Override // lb1.l
    public void a(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        java.lang.String str = this.f399246a;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : "";
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = ob1.h.a(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onMtuChanged]gatt deviceId:%s mtu:%d status:%s", objArr);
        if (bluetoothGatt == null) {
            return;
        }
        if (i18 == 0) {
            this.f399257l = i17;
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            ob1.i iVar = this.f399255j;
            if (iVar != null) {
                ib1.a0 a0Var = new ib1.a0(null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = ((ib1.x) iVar).f371624a;
                if (lVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOpenBluetoothAdapter", "dispatch#OnBLEMTUChangeEvent, service is null");
                } else {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("deviceId", address);
                        jSONObject.put("mtu", i17);
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOpenBluetoothAdapter", "dispatch#OnBLEMTUChangeEvent, put params fail since " + e17);
                    }
                    java.lang.String jSONObject2 = jSONObject.toString();
                    int mo50260x9f1221c2 = lVar.mo50260x9f1221c2();
                    a0Var.p(lVar);
                    a0Var.f163909h = mo50260x9f1221c2;
                    a0Var.f163907f = jSONObject2;
                    a0Var.m();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBluetoothAdapter", "dispatch#OnBLEMTUChangeEvent, paramsStr: " + jSONObject2);
                }
            }
        }
        lb1.d dVar = this.f399249d;
        if (dVar == null) {
            return;
        }
        dVar.a(bluetoothGatt, i17, i18);
    }

    @Override // lb1.l
    public void b(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        java.lang.String str = this.f399246a;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : "";
        objArr[1] = bluetoothGattDescriptor != null ? bluetoothGattDescriptor.getUuid().toString().toUpperCase() : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onDescriptorRead]gatt deviceId:%s descriptorId:%s", objArr);
        lb1.d dVar = this.f399249d;
        if (dVar == null) {
            return;
        }
        dVar.b(bluetoothGatt, bluetoothGattDescriptor, i17);
    }

    @Override // lb1.l
    public void c(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        java.lang.String str = this.f399246a;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : "";
        objArr[1] = bluetoothGattDescriptor != null ? bluetoothGattDescriptor.getUuid().toString().toUpperCase() : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onDescriptorWrite]gatt deviceId:%s descriptorId:%s", objArr);
        lb1.d dVar = this.f399249d;
        if (dVar == null) {
            return;
        }
        dVar.c(bluetoothGatt, bluetoothGattDescriptor, i17);
    }

    @Override // lb1.l
    public void d(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        java.lang.String str = this.f399246a;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : "";
        objArr[1] = bluetoothGattCharacteristic != null ? bluetoothGattCharacteristic.getUuid().toString().toUpperCase() : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onCharacteristicChanged]gatt deviceId:%s characteristicId:%s", objArr);
        lb1.d dVar = this.f399249d;
        if (dVar == null) {
            return;
        }
        dVar.d(bluetoothGatt, bluetoothGattCharacteristic);
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null) {
            return;
        }
        ob1.j jVar = this.f399254i;
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f399246a, "[change] onBleCharacteristicValueChange is null", new java.lang.Object[0]);
            return;
        }
        java.lang.String str2 = new java.lang.String(android.util.Base64.encode(bluetoothGattCharacteristic.getValue(), 2));
        java.lang.String address = bluetoothGatt.getDevice().getAddress();
        java.lang.String upperCase = bluetoothGattCharacteristic.getService().getUuid().toString().toUpperCase();
        java.lang.String upperCase2 = bluetoothGattCharacteristic.getUuid().toString().toUpperCase();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399246a, "[change]deviceId %s, serviceId %s, characteristicId %s, value %s", address, upperCase, upperCase2, str2);
        jVar.a(address, upperCase, upperCase2, str2);
    }

    @Override // lb1.l
    public void e(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        java.lang.String str = this.f399246a;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : "";
        objArr[1] = bluetoothGattCharacteristic != null ? bluetoothGattCharacteristic.getUuid().toString().toUpperCase() : "";
        objArr[2] = ob1.h.a(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onCharacteristicRead]gatt deviceId:%s characteristicId:%s status:%s", objArr);
        lb1.d dVar = this.f399249d;
        if (dVar == null) {
            return;
        }
        dVar.e(bluetoothGatt, bluetoothGattCharacteristic, i17);
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || i17 != 0) {
            return;
        }
        ob1.j jVar = this.f399254i;
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f399246a, "[change] onBleCharacteristicValueChange is null", new java.lang.Object[0]);
            return;
        }
        java.lang.String str2 = new java.lang.String(android.util.Base64.encode(bluetoothGattCharacteristic.getValue(), 2));
        java.lang.String address = bluetoothGatt.getDevice().getAddress();
        java.lang.String upperCase = bluetoothGattCharacteristic.getService().getUuid().toString().toUpperCase();
        java.lang.String upperCase2 = bluetoothGattCharacteristic.getUuid().toString().toUpperCase();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399246a, "[read]deviceId %s, serviceId %s, characteristicId %s, value %s", address, upperCase, upperCase2, str2);
        jVar.a(address, upperCase, upperCase2, str2);
    }

    @Override // lb1.l
    public void f(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
        java.lang.String str = this.f399246a;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : "";
        objArr[1] = ob1.h.a(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onReliableWriteCompleted]gatt deviceId:%s status:%s", objArr);
        lb1.d dVar = this.f399249d;
        if (dVar == null) {
            return;
        }
        dVar.f(bluetoothGatt, i17);
    }

    @Override // lb1.l
    public void g(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        java.lang.String str = this.f399246a;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : "";
        objArr[1] = bluetoothGattCharacteristic != null ? bluetoothGattCharacteristic.getUuid().toString().toUpperCase() : "";
        objArr[2] = bluetoothGattCharacteristic != null ? java.util.Arrays.asList(bluetoothGattCharacteristic.getValue()) : "";
        objArr[3] = ob1.h.a(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onCharacteristicWrite]gatt deviceId:%s characteristicId:%s value:%s, status:%s", objArr);
        lb1.d dVar = this.f399249d;
        if (dVar == null) {
            return;
        }
        dVar.g(bluetoothGatt, bluetoothGattCharacteristic, i17);
    }

    @Override // lb1.l
    public void h(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        java.lang.String str = this.f399246a;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : "";
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = ob1.h.a(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onReadRemoteRssi]gatt deviceId:%s rssi:%d status:%s", objArr);
        lb1.d dVar = this.f399249d;
        if (dVar == null) {
            return;
        }
        dVar.h(bluetoothGatt, i17, i18);
    }

    @Override // lb1.l
    public void i(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        java.lang.String str = this.f399246a;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : "";
        objArr[1] = ob1.h.a(i17);
        objArr[2] = i18 == 2 ? "CONNECTED" : "DISCONNECTED";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onConnectionStateChange]gatt deviceId:%s gattStatus:%s, newState:%s", objArr);
        lb1.d dVar = this.f399249d;
        if (dVar == null) {
            return;
        }
        dVar.i(bluetoothGatt, i17, i18);
        if (i17 != 0) {
            k(true);
        } else if (i18 != 2 && i18 == 0) {
            k(true);
        }
    }

    @Override // lb1.l
    public void j(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
        java.lang.String str = this.f399246a;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = bluetoothGatt != null ? bluetoothGatt.getDevice().getAddress() : "";
        objArr[1] = ob1.h.a(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onServicesDiscovered]gatt deviceId:%s status:%s", objArr);
        lb1.d dVar = this.f399249d;
        if (dVar == null) {
            return;
        }
        dVar.j(bluetoothGatt, i17);
    }

    public synchronized void k(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399246a, "closeMyself deviceId:%s", this.f399248c);
        o(z17);
        lb1.d dVar = this.f399249d;
        if (dVar != null) {
            synchronized (dVar) {
                java.util.Queue queue = dVar.f399233a;
                if (queue != null) {
                    ((java.util.concurrent.ConcurrentLinkedQueue) queue).clear();
                    dVar.f399233a = null;
                }
                java.util.List list = dVar.f399235c;
                if (list != null) {
                    ((java.util.ArrayList) list).clear();
                    dVar.f399235c = null;
                }
            }
            this.f399249d = null;
        }
        java.util.List list2 = this.f399251f;
        if (list2 != null) {
            ((java.util.ArrayList) list2).clear();
            this.f399251f = null;
        }
        java.util.Map map = this.f399252g;
        if (map != null) {
            ((java.util.concurrent.ConcurrentHashMap) map).clear();
            this.f399252g = null;
        }
        lb1.i iVar = this.f399256k;
        java.lang.String str = this.f399248c;
        java.util.Map map2 = iVar.f399241b;
        if (map2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Ble.BleConnectMgr", "removeWorker, connectWorkers is null", new java.lang.Object[0]);
        } else {
            ((java.util.concurrent.ConcurrentHashMap) map2).remove(str);
        }
    }

    public final synchronized lb1.d l() {
        lb1.d dVar;
        dVar = this.f399249d;
        if (dVar == null) {
            dVar = new lb1.d();
            synchronized (dVar) {
                dVar.f399233a = new java.util.concurrent.ConcurrentLinkedQueue();
                dVar.f399235c = new java.util.ArrayList();
            }
            this.f399249d = dVar;
        }
        return dVar;
    }

    public synchronized java.util.List m() {
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f399250e;
        if (bluetoothGatt == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f399246a, "[getServices] bluetoothGatt is null, err", new java.lang.Object[0]);
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f399248c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f399246a, "[getServices] deviceId is null, err", new java.lang.Object[0]);
            return null;
        }
        if (this.f399251f == null) {
            java.util.List<android.bluetooth.BluetoothGattService> services = bluetoothGatt.getServices();
            if (services == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f399246a, "[getServices] bluetoothGattServices is null, err", new java.lang.Object[0]);
                return null;
            }
            this.f399251f = new java.util.ArrayList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.bluetooth.BluetoothGattService bluetoothGattService : services) {
                ob1.g gVar = new ob1.g();
                gVar.f425548a = bluetoothGattService.getUuid().toString().toUpperCase();
                gVar.f425549b = bluetoothGattService.getType() == 0;
                if (!gVar.f425548a.equals("00001800-0000-1000-8000-00805F9B34FB") && !gVar.f425548a.equals("00001801-0000-1000-8000-00805F9B34FB")) {
                    this.f399251f.add(gVar);
                }
                arrayList.add(gVar);
            }
            if (arrayList.size() > 0) {
                this.f399251f.addAll(arrayList);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399246a, "[getServices] use cache", new java.lang.Object[0]);
        }
        return new java.util.ArrayList(this.f399251f);
    }

    public synchronized void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399246a, "init deviceId:%s", this.f399248c);
        if (this.f399247b != null) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            this.f399247b.registerReceiver(this.f399258m, intentFilter);
        }
        this.f399249d = l();
        this.f399252g = new java.util.concurrent.ConcurrentHashMap();
    }

    public final synchronized void o(boolean z17) {
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f399250e;
        if (bluetoothGatt != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399246a, "deviceId:%s innerCloseMyself", this.f399248c);
            if (z17) {
                java.lang.String str = this.f399248c;
                ob1.k kVar = this.f399253h;
                if (kVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f399246a, "notifyConnectionStateChange, onBleConnectionStateChange is null", new java.lang.Object[0]);
                } else {
                    kVar.a(str, false);
                }
            }
            if (kb1.b.a().f387753d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399246a, "deviceId:%s refreshGattCache", this.f399248c);
                android.bluetooth.BluetoothGatt bluetoothGatt2 = this.f399250e;
                if (bluetoothGatt2 != null) {
                    try {
                        java.lang.reflect.Method method = android.bluetooth.BluetoothGatt.class.getMethod("refresh", new java.lang.Class[0]);
                        if (method != null) {
                            method.setAccessible(true);
                            ((java.lang.Boolean) method.invoke(bluetoothGatt2, new java.lang.Object[0])).booleanValue();
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            try {
                bluetoothGatt.disconnect();
                bluetoothGatt.close();
                this.f399250e = null;
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    public synchronized void p() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399246a, "uninit deviceId:%s", this.f399248c);
        android.content.Context context = this.f399247b;
        if (context != null) {
            context.unregisterReceiver(this.f399258m);
        }
        o(true);
        lb1.d dVar = this.f399249d;
        if (dVar != null) {
            synchronized (dVar) {
                java.util.Queue queue = dVar.f399233a;
                if (queue != null) {
                    ((java.util.concurrent.ConcurrentLinkedQueue) queue).clear();
                    dVar.f399233a = null;
                }
                java.util.List list = dVar.f399235c;
                if (list != null) {
                    ((java.util.ArrayList) list).clear();
                    dVar.f399235c = null;
                }
            }
            this.f399249d = null;
        }
        java.util.List list2 = this.f399251f;
        if (list2 != null) {
            ((java.util.ArrayList) list2).clear();
            this.f399251f = null;
        }
        java.util.Map map = this.f399252g;
        if (map != null) {
            ((java.util.concurrent.ConcurrentHashMap) map).clear();
            this.f399252g = null;
        }
        this.f399253h = null;
        this.f399254i = null;
        this.f399255j = null;
    }
}
