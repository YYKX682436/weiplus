package mb1;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothGatt f406827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mb1.d f406829f;

    public b(mb1.d dVar, android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
        this.f406829f = dVar;
        this.f406827d = bluetoothGatt;
        this.f406828e = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r10 = this;
            mb1.d r0 = r10.f406829f
            java.lang.String r1 = r0.f406836r
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto La
            goto L37
        La:
            int r5 = r1.hashCode()
            r6 = 2
            r7 = -1
            switch(r5) {
                case -1924829944: goto L2a;
                case -1837176303: goto L1f;
                case 3202466: goto L14;
                default: goto L13;
            }
        L13:
            goto L34
        L14:
            java.lang.String r5 = "high"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L1d
            goto L34
        L1d:
            r7 = r6
            goto L34
        L1f:
            java.lang.String r5 = "lowPower"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L28
            goto L34
        L28:
            r7 = r3
            goto L34
        L2a:
            java.lang.String r5 = "balanced"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L33
            goto L34
        L33:
            r7 = r4
        L34:
            switch(r7) {
                case 0: goto L43;
                case 1: goto L3e;
                case 2: goto L39;
                default: goto L37;
            }
        L37:
            r1 = r2
            goto L47
        L39:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            goto L47
        L3e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            goto L47
        L43:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
        L47:
            android.bluetooth.BluetoothGatt r5 = r10.f406827d
            java.lang.String r6 = "MicroMsg.Ble.ConnectAction"
            if (r1 == 0) goto L71
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Attempting to requestConnectionPriority, "
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r8 = new java.lang.Object[r4]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r7, r8)
            int r1 = r1.intValue()
            boolean r1 = r5.requestConnectionPriority(r1)
            if (r1 != 0) goto L71
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r7 = "requestConnectionPriority fail"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r6, r7, r1)
        L71:
            boolean r1 = r0.f406837s
            if (r1 == 0) goto L80
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "Attempting to start service discovery"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r1, r0)
            r5.discoverServices()
            goto Lca
        L80:
            int r1 = r10.f406828e
            if (r1 != 0) goto L8a
            ob1.m r2 = ob1.m.f425551e
            r0.p(r2)
            goto La4
        L8a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "fail:connection fail status:"
            r6.<init>(r7)
            r6.append(r1)
            ob1.m r7 = new ob1.m
            java.lang.String r6 = r6.toString()
            jc1.d r8 = jc1.c.I
            r9 = 10003(0x2713, float:1.4017E-41)
            r7.<init>(r9, r6, r8, r2)
            r0.p(r7)
        La4:
            r0.m()
            lb1.k r0 = r0.f425519a
            r0.getClass()
            if (r5 != 0) goto Laf
            goto Lca
        Laf:
            if (r1 != 0) goto Lca
            android.bluetooth.BluetoothDevice r1 = r5.getDevice()
            java.lang.String r1 = r1.getAddress()
            ob1.k r2 = r0.f399253h
            if (r2 != 0) goto Lc7
            java.lang.String r0 = r0.f399246a
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "notifyConnectionStateChange, onBleConnectionStateChange is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r2, r1)
            goto Lca
        Lc7:
            r2.a(r1, r3)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mb1.b.run():void");
    }
}
