package jb1;

/* loaded from: classes7.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jb1.i f380253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f380254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f380255f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(jb1.i iVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        super(0);
        this.f380253d = iVar;
        this.f380254e = i17;
        this.f380255f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int c17;
        android.bluetooth.BluetoothGattServer bluetoothGattServer;
        java.util.HashMap hashMap = new java.util.HashMap();
        jb1.d0 d0Var = jb1.d0.f380238a;
        boolean z17 = false;
        if (((java.util.concurrent.ConcurrentHashMap) jb1.d0.f380239b).size() + 1 > 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.JsApiCreateBLEPeripheralServer", "invoke: out of bound");
            qb1.a.a(this.f380253d, this.f380254e, this.f380255f, 10008, "fail: servers count overflow", null, 16, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component = this.f380255f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
            synchronized (d0Var) {
                if (jb1.d0.f380240c == null) {
                    jb1.d0.f380240c = new jb1.b0();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(component.mo48798x74292566(), jb1.d0.f380240c);
                }
                if (jb1.d0.f380241d == null) {
                    jb1.d0.f380241d = new jb1.c0(component);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.g.f161602a.a(component.mo48798x74292566(), jb1.d0.f380241d);
                }
                if (jb1.d0.f380242e) {
                    c17 = -1;
                } else {
                    do {
                        c17 = qb1.a.c();
                    } while (((java.util.concurrent.ConcurrentHashMap) jb1.d0.f380239b).containsKey(java.lang.Integer.valueOf(c17)));
                    jb1.a0 a0Var = new jb1.a0();
                    android.bluetooth.BluetoothManager e17 = qb1.b.e();
                    boolean c18 = qb1.b.c() & true;
                    android.bluetooth.BluetoothAdapter d17 = qb1.b.d();
                    if (d17 != null) {
                        d17.isMultipleAdvertisementSupported();
                        d17.isOffloadedFilteringSupported();
                        d17.isOffloadedScanBatchingSupported();
                        d17.getBluetoothLeAdvertiser();
                        z17 = d17.getBluetoothLeAdvertiser() != null;
                    }
                    if ((!(c18 & z17) || !qb1.b.b()) || e17 == null) {
                        jb1.e0 e0Var = jb1.e0.f380243d;
                    } else {
                        a0Var.f380221a = jb1.e0.f380244e;
                        a0Var.f380223c = component;
                        a0Var.f380224d = c17;
                        jb1.b bVar = new jb1.b();
                        a0Var.f380227g = bVar;
                        try {
                            bluetoothGattServer = e17.openGattServer(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, bVar);
                        } catch (java.lang.SecurityException e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BLE.PeripheralBleServer", "openGattServer: " + e18.getMessage());
                            bluetoothGattServer = null;
                        }
                        if (bluetoothGattServer == null) {
                            a0Var.f380221a = jb1.e0.f380247h;
                        } else {
                            a0Var.f380222b = bluetoothGattServer;
                            jb1.b bVar2 = a0Var.f380227g;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar2);
                            bVar2.f380230c = a0Var;
                        }
                    }
                    ((java.util.concurrent.ConcurrentHashMap) jb1.d0.f380239b).put(java.lang.Integer.valueOf(c17), a0Var);
                }
            }
            jb1.a0 b17 = jb1.d0.f380238a.b(c17);
            if (b17 == null || b17.f380221a != jb1.e0.f380244e) {
                qb1.a.a(this.f380253d, this.f380254e, this.f380255f, 10001, "fail:not available", null, 16, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.JsApiCreateBLEPeripheralServer", "invoke: serverId = " + c17);
                hashMap.put("serverId", java.lang.Integer.valueOf(c17));
                qb1.a.b(this.f380253d, this.f380254e, this.f380255f, hashMap);
            }
        }
        return jz5.f0.f384359a;
    }
}
