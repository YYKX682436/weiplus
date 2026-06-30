package mb1;

/* loaded from: classes7.dex */
public final class j extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f406850n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f406851o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f406852p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f406853q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f406854r;

    /* renamed from: s, reason: collision with root package name */
    public mb1.i f406855s;

    public j(java.lang.String deviceId, byte[] bArr, long j17, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        this.f406850n = deviceId;
        this.f406851o = bArr;
        this.f406852p = z17;
        this.f406853q = z18;
        this.f406854r = "MicroMsg.Ble.Action#" + hashCode();
        this.f425527i = j17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (true == r1.contains(r0)) goto L22;
     */
    @Override // ob1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r5 = this;
            boolean r0 = qb1.b.b()
            java.lang.String r1 = "Bluetooth is not enable."
            java.lang.String r2 = r5.f406854r
            r3 = 0
            if (r0 != 0) goto L19
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r1, r0)
            ob1.m r0 = ob1.m.f425555i
            r5.p(r0)
            r5.m()
            return
        L19:
            java.lang.String r0 = r5.f406850n
            boolean r4 = android.bluetooth.BluetoothAdapter.checkBluetoothAddress(r0)
            if (r4 != 0) goto L31
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "Invalid deviceId"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r1, r0)
            ob1.m r0 = ob1.m.f425567u
            r5.p(r0)
            r5.m()
            return
        L31:
            android.bluetooth.BluetoothAdapter r4 = qb1.b.d()
            if (r4 != 0) goto L45
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r1, r0)
            ob1.m r0 = ob1.m.f425555i
            r5.p(r0)
            r5.m()
            return
        L45:
            android.bluetooth.BluetoothDevice r0 = r4.getRemoteDevice(r0)
            boolean r1 = r5.f406852p
            if (r1 != 0) goto L6e
            java.util.Set r1 = r4.getBondedDevices()
            if (r1 == 0) goto L5b
            boolean r1 = r1.contains(r0)
            r4 = 1
            if (r4 != r1) goto L5b
            goto L5c
        L5b:
            r4 = r3
        L5c:
            if (r4 == 0) goto L6e
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "already paired"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1, r0)
            ob1.m r0 = ob1.m.f425551e
            r5.p(r0)
            r5.m()
            return
        L6e:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = "createBond"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4, r1)
            boolean r1 = r0.createBond()
            if (r1 != 0) goto L90
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "startPairing is false"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r1, r0)
            java.lang.String r0 = "createBond fail"
            ob1.m r0 = ob1.m.b(r0)
            r5.p(r0)
            r5.m()
            return
        L90:
            lb1.k r1 = r5.f425519a
            android.content.Context r1 = r1.f399247b
            if (r1 != 0) goto Laf
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "context is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r1, r0)
            ob1.m r0 = new ob1.m
            jc1.d r1 = jc1.f.f380448d
            r2 = 0
            r3 = -1
            java.lang.String r4 = "fail:internal error"
            r0.<init>(r3, r4, r1, r2)
            r5.p(r0)
            r5.m()
            return
        Laf:
            mb1.i r2 = new mb1.i
            r2.<init>(r5, r1, r0)
            r5.f406855s = r2
            mb1.j r0 = r2.f406849c
            java.lang.String r0 = r0.f406854r
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r3 = "pairReceiver.registerSelf"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r3, r1)
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.bluetooth.device.action.PAIRING_REQUEST"
            r0.addAction(r1)
            java.lang.String r1 = "android.bluetooth.device.action.BOND_STATE_CHANGED"
            r0.addAction(r1)
            android.content.Context r1 = r2.f406847a
            r1.registerReceiver(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mb1.j.l():void");
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "PairAction";
    }

    @Override // ob1.c
    public void o(ob1.m mVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f406854r, "onDone, result: " + mVar, new java.lang.Object[0]);
        mb1.i iVar = this.f406855s;
        if (iVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f406849c.f406854r, "pairReceiver.unregisterSelf", new java.lang.Object[0]);
            iVar.f406847a.unregisterReceiver(iVar);
        }
        this.f406855s = null;
    }
}
