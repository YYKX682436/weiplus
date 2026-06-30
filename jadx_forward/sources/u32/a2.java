package u32;

/* loaded from: classes13.dex */
public final class a2 extends u32.z implements u32.x, gq1.a, kq1.b {

    /* renamed from: e, reason: collision with root package name */
    public final u32.i f505792e;

    /* renamed from: v, reason: collision with root package name */
    public hq1.a0 f505806v;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.RemoteCallbackList f505793f = new android.os.RemoteCallbackList();

    /* renamed from: g, reason: collision with root package name */
    public final android.os.RemoteCallbackList f505794g = new android.os.RemoteCallbackList();

    /* renamed from: h, reason: collision with root package name */
    public final android.os.RemoteCallbackList f505795h = new android.os.RemoteCallbackList();

    /* renamed from: i, reason: collision with root package name */
    public final android.os.RemoteCallbackList f505796i = new android.os.RemoteCallbackList();

    /* renamed from: m, reason: collision with root package name */
    public final android.os.RemoteCallbackList f505797m = new android.os.RemoteCallbackList();

    /* renamed from: n, reason: collision with root package name */
    public final android.os.RemoteCallbackList f505798n = new android.os.RemoteCallbackList();

    /* renamed from: o, reason: collision with root package name */
    public final u32.z1 f505799o = new u32.z1(null);

    /* renamed from: r, reason: collision with root package name */
    public final android.os.RemoteCallbackList f505802r = new android.os.RemoteCallbackList();

    /* renamed from: s, reason: collision with root package name */
    public final android.os.RemoteCallbackList f505803s = new android.os.RemoteCallbackList();

    /* renamed from: t, reason: collision with root package name */
    public final android.os.RemoteCallbackList f505804t = new android.os.RemoteCallbackList();

    /* renamed from: u, reason: collision with root package name */
    public final android.os.RemoteCallbackList f505805u = new android.os.RemoteCallbackList();

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f505800p = new u32.o1(this, u32.i1.a().f505843b.mo50284xdd3e8650());

    /* renamed from: q, reason: collision with root package name */
    public final gq1.o f505801q = new gq1.o(this);

    public a2() {
        this.f505792e = null;
        this.f505792e = new u32.i(this);
        new kq1.c(this);
        u32.l1 l1Var = new u32.l1(this);
        if (fp.h.c(18)) {
            this.f505806v = new hq1.a0(l1Var);
        }
    }

    @Override // u32.a0
    public boolean Di(u32.d0 d0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registOnDeviceRequest");
        boolean register = this.f505796i.register(d0Var);
        if (!register) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnDeviceReq.register Failed!!!");
        }
        g32.c.c(g32.b.INVOKE_ONCE);
        return register;
    }

    @Override // u32.a0
    public boolean Hg(long j17) {
        if (j17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", java.lang.Long.valueOf(j17));
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f505800p;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(8, java.lang.Long.valueOf(j17)))) {
            g32.c.c(g32.b.SIMPLE_BLUETOOTH_DISCONNECT);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 8);
        return false;
    }

    @Override // u32.a0
    public long L1(u32.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "startTask");
        if (w0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == aTask");
            return -1L;
        }
        u32.z1 z1Var = this.f505799o;
        if (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 == z1Var.f505935a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TaskId", "TaskId Data-overrun!!!");
            z1Var.f505935a = 0L;
        }
        long j17 = z1Var.f505935a;
        z1Var.f505935a = 1 + j17;
        u32.y1 y1Var = new u32.y1(j17, w0Var);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f505800p;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(0, y1Var))) {
            g32.c.c(g32.b.INVOKE_ONCE);
            return j17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!! messsage what  = %d", 0);
        return -1L;
    }

    @Override // u32.a0
    public long[] N3() {
        g32.c.c(g32.b.INVOKE_ONCE);
        this.f505792e.getClass();
        return v32.a.b("conneted_device");
    }

    public void N6(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19, byte[] bArr) {
        android.os.RemoteCallbackList remoteCallbackList = this.f505795h;
        int beginBroadcast = remoteCallbackList.beginBroadcast();
        for (int i27 = 0; i27 < beginBroadcast; i27++) {
            try {
                ((u32.g0) remoteCallbackList.getBroadcastItem(i27)).N6(i17, i18, str, str2, str3, i19, bArr);
                if (2 == i17) {
                    try {
                        if (!remoteCallbackList.unregister((u32.g0) remoteCallbackList.getBroadcastItem(i27))) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onScanCallback: mCBListOnScanCallback.unregister failed!!!");
                        }
                    } catch (android.os.RemoteException e17) {
                        e = e17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onScanCallback Exception i = " + i27);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RemoteBTDeviceAdapter", e, "", new java.lang.Object[0]);
                    }
                }
            } catch (android.os.RemoteException e18) {
                e = e18;
            }
        }
        remoteCallbackList.finishBroadcast();
    }

    @Override // u32.a0
    public boolean N9(java.lang.String str, boolean z17, u32.z0 z0Var) {
        boolean mo50293x3498a0;
        gq1.o oVar = this.f505801q;
        if (oVar == null) {
            return false;
        }
        boolean hasSystemFeature = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (hasSystemFeature && defaultAdapter != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "ranging, uuid = %s, op = %s", str, java.lang.String.valueOf(z17));
            android.os.RemoteCallbackList remoteCallbackList = this.f505797m;
            if (!remoteCallbackList.register(z0Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIBeaconCallback.register failed!!!");
                return false;
            }
            try {
                java.util.UUID fromString = java.util.UUID.fromString(str);
                oVar.getClass();
                gq1.o.f356052x = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("com.tencent.mm_exdevice_ibeacon_isNewScanning", 4).getBoolean("isNewScanning", false);
                if (fromString != null) {
                    fromString.toString();
                }
                java.lang.String.valueOf(z17);
                if (fromString == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.IBeaconServer", "error parameter: aUUID is null");
                    mo50293x3498a0 = false;
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = oVar.f356058i;
                    mo50293x3498a0 = z17 ? n3Var.mo50293x3498a0(new gq1.k(oVar, fromString)) : n3Var.mo50293x3498a0(new gq1.l(oVar, fromString));
                }
                if (mo50293x3498a0) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mIBeaconServer.ranging failed!!!");
                if (!remoteCallbackList.unregister(z0Var)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIBeaconCallback.unregister failed!!!");
                }
                return false;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "UUID.fromString failed!!!, (%s)", e17.getMessage());
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    @Override // u32.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b5(int r13, u32.g0 r14) {
        /*
            r12 = this;
            r0 = 0
            java.lang.String r1 = "MicroMsg.exdevice.RemoteBTDeviceAdapter"
            if (r14 != 0) goto Lc
            java.lang.String r13 = "scan callback is null. just return"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r13)
            return r0
        Lc:
            if (r13 == 0) goto L15
            java.lang.String r13 = "this is not ble scan cmd"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r13)
            return r0
        L15:
            android.os.RemoteCallbackList r13 = r12.f505802r
            boolean r2 = r13.register(r14)
            if (r2 == 0) goto L1e
            goto L24
        L1e:
            java.lang.String r3 = "regist simple ble scan callback fail"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r3)
        L24:
            hq1.a0 r3 = r12.f505806v
            r4 = 1
            if (r3 == 0) goto L96
            hq1.n r5 = r3.f364614a
            if (r5 == 0) goto L2f
            r6 = r4
            goto L30
        L2f:
            r6 = r0
        L30:
            r7 = 0
            iz5.a.g(r7, r6)
            boolean r6 = r3.a()
            java.lang.String r7 = "MicroMsg.exdevice.BluetoothLESimpleManager"
            if (r6 != 0) goto L43
            java.lang.String r3 = "BLE Unsupport"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r7, r3)
        L41:
            r5 = r0
            goto L62
        L43:
            boolean r6 = lq1.a.a()
            if (r6 != 0) goto L55
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 31
            if (r6 < r8) goto L55
            java.lang.String r3 = "BLE connect and scan permission is disabled"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r7, r3)
            goto L41
        L55:
            hq1.m r6 = r3.f364620g
            boolean r5 = r5.b(r4, r6)
            if (r5 == 0) goto L62
            java.util.HashSet r3 = r3.f364621h
            r3.clear()
        L62:
            if (r5 != 0) goto L96
            java.lang.String r3 = "simple ble scan fail"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r3)
            r5 = 0
            r6 = -1
            java.lang.String r7 = "simpleBLE.scan failed!!!"
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            r10 = 0
            r11 = 0
            r4 = r14
            r4.N6(r5, r6, r7, r8, r9, r10, r11)     // Catch: android.os.RemoteException -> L7a
            goto L90
        L7a:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "simpleBLE.scan callback failed!!!, %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r5, r4)
            java.lang.String r4 = ""
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r3, r4, r5)
        L90:
            if (r2 == 0) goto L95
            r13.unregister(r14)
        L95:
            return r0
        L96:
            g32.b r13 = g32.b.SIMPLE_BLUETOOTH_SCAN
            g32.c.c(r13)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u32.a2.b5(int, u32.g0):boolean");
    }

    @Override // u32.a0
    public boolean b7(long j17, int i17, u32.j0 j0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "startChannel deviceId = %d, bluetoothVersion = %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == callback");
            return false;
        }
        if (j17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", java.lang.Long.valueOf(j17));
            return false;
        }
        if (1 != i17 && i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid bluetooth version = %d", java.lang.Integer.valueOf(i17));
            return false;
        }
        u32.x1 x1Var = new u32.x1(j17, i17, j0Var);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f505800p;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(3, x1Var))) {
            g32.c.c(g32.b.START_CHANNEL_SERVICE);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!! message what = %d", 3);
        return false;
    }

    @Override // gq1.a
    public void d(double d17, gq1.b bVar) {
        android.os.RemoteCallbackList remoteCallbackList = this.f505797m;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aContext is null");
            return;
        }
        gq1.q qVar = bVar.f356027a.f356033b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onRangingCallback, distance = %f, uuid = %s, major = %d, minor = %d ,minor&0xFFFF = %d", java.lang.Double.valueOf(d17), a42.i.a(qVar.f356070c), java.lang.Short.valueOf(qVar.f356071d), java.lang.Short.valueOf(qVar.f356072e), java.lang.Integer.valueOf(qVar.f356072e & 65535));
        try {
            try {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i17 = 0; i17 < beginBroadcast; i17++) {
                    try {
                        ((u32.z0) remoteCallbackList.getBroadcastItem(i17)).di(d17, qVar.f356071d, qVar.f356072e, qVar.f356070c, bVar.f356028b, bVar.f356027a.f356033b.f356073f, bVar.f356029c);
                    } catch (android.os.RemoteException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIBeaconCallback.getBroadcastItem failed!!!, i = %d, (%s)", java.lang.Integer.valueOf(i17), e17.toString());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RemoteBTDeviceAdapter", e17, "", new java.lang.Object[0]);
                    }
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "[shakezb] beginBroadcast fail!", e18.toString());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RemoteBTDeviceAdapter", e18, "", new java.lang.Object[0]);
            }
        } finally {
            remoteCallbackList.finishBroadcast();
        }
    }

    public final android.os.IInterface e(long j17, android.os.RemoteCallbackList remoteCallbackList, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "findCallbackbyId, Id = %d, count = %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        for (int i18 = 0; i18 < i17; i18++) {
            java.util.HashMap hashMap = (java.util.HashMap) remoteCallbackList.getBroadcastCookie(i18);
            if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
                return (android.os.IInterface) hashMap.get(java.lang.Long.valueOf(j17));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Can not find id in the callback list");
        return null;
    }

    public void g(long j17, int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onStateChange deviceId = " + j17 + " oldState" + i17 + " newState = " + i18 + " errCode = " + i19);
        u32.q1 q1Var = new u32.q1(null);
        q1Var.f505884a = j17;
        q1Var.f505885b = i17;
        q1Var.f505886c = i18;
        q1Var.f505887d = i19;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f505800p;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(5, q1Var))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, messagewhat = %d", 5);
    }

    @Override // u32.a0
    public boolean gi(int i17, u32.g0 g0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "---stopScan--- aBluetoothVersion = " + i17);
        if (g0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback");
            return false;
        }
        boolean mo50293x3498a0 = this.f505800p.mo50293x3498a0(new u32.n1(this, i17, g0Var));
        if (mo50293x3498a0) {
            g32.c.c(g32.b.STOP_SCANNING);
        }
        if (!mo50293x3498a0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopScan: mHandler.post failed!!!");
        }
        return mo50293x3498a0;
    }

    public void j(long j17, int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onTaskEnd taskId = %d, errTpye = %d, errCode = %d, errMsg = %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        u32.r1 r1Var = new u32.r1();
        r1Var.f505893a = j17;
        r1Var.f505894b = i17;
        r1Var.f505895c = i18;
        r1Var.f505896d = str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f505800p;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(2, r1Var))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, MessageWhat = %d", 2);
    }

    public final void k(long j17, int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onTaskEndImp taskId = %d, errType = %d, errCode =%d, errMsg = %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.os.RemoteCallbackList remoteCallbackList = this.f505794g;
        int beginBroadcast = remoteCallbackList.beginBroadcast();
        u32.w0 w0Var = (u32.w0) e(j17, remoteCallbackList, beginBroadcast);
        if (w0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Cannot find Callback By taskId = " + j17);
            remoteCallbackList.finishBroadcast();
            return;
        }
        try {
            w0Var.Ia().wh(j17, i17, i18, str, w0Var);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback.onTaskEnd Error!!!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RemoteBTDeviceAdapter", e17, "", new java.lang.Object[0]);
        }
        if (!p(remoteCallbackList, j17, w0Var, beginBroadcast)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegisterRemoteCB failed!!!");
        }
        remoteCallbackList.finishBroadcast();
    }

    public final boolean l(android.os.RemoteCallbackList remoteCallbackList, long j17, android.os.IInterface iInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registerRemoteCB, ID = %d", java.lang.Long.valueOf(j17));
        if (remoteCallbackList == null || iInterface == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == aCallbackList || null == aCallback");
            return false;
        }
        int beginBroadcast = remoteCallbackList.beginBroadcast();
        do {
            beginBroadcast--;
            if (beginBroadcast < 0) {
                break;
            }
        } while (!remoteCallbackList.getBroadcastItem(beginBroadcast).asBinder().equals(iInterface.asBinder()));
        if (beginBroadcast < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Register a new process in callback list.");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(java.lang.Long.valueOf(j17), iInterface);
            remoteCallbackList.register(iInterface, hashMap);
            remoteCallbackList.finishBroadcast();
            return true;
        }
        java.util.HashMap hashMap2 = (java.util.HashMap) remoteCallbackList.getBroadcastCookie(beginBroadcast);
        if (hashMap2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == map");
            remoteCallbackList.finishBroadcast();
            return false;
        }
        hashMap2.put(java.lang.Long.valueOf(j17), iInterface);
        remoteCallbackList.finishBroadcast();
        return true;
    }

    @Override // u32.a0
    public void ma(long j17, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "---setChannelSessionKey--- deviceId = %d", java.lang.Long.valueOf(j17));
        u32.i iVar = this.f505792e;
        iVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "------setChannelSessionKey------ deviceId = %d", java.lang.Long.valueOf(j17));
        u32.g gVar = new u32.g(j17, bArr);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = iVar.f505839f;
        if (!n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(10, gVar))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "mHandler.sendMessage failed!!! messageWhat = %d", 10);
        }
        g32.c.c(g32.b.INVOKE_ONCE);
    }

    @Override // u32.a0
    public boolean n6(long j17, byte[] bArr, u32.g1 g1Var) {
        if (0 > j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mac < 0");
            return false;
        }
        if (bArr == null || bArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "data is empty");
            return false;
        }
        if (g1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback is null");
            return false;
        }
        u32.w1 w1Var = new u32.w1(null);
        w1Var.f505924a = j17;
        w1Var.f505925b = bArr;
        w1Var.f505926c = g1Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f505800p;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(10, w1Var))) {
            g32.c.c(g32.b.INVOKE_ONCE);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 10);
        return false;
    }

    @Override // u32.a0
    public boolean n7(int i17, u32.g0 g0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "---scan--- aBluetoothVersion = " + i17);
        if (g0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback !!!");
            return false;
        }
        boolean mo50293x3498a0 = this.f505800p.mo50293x3498a0(new u32.m1(this, i17, g0Var));
        if (mo50293x3498a0) {
            g32.c.c(g32.b.SCANNING);
        }
        if (!mo50293x3498a0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "scan: mHandler.post failed!!!");
        }
        return mo50293x3498a0;
    }

    @Override // u32.a0
    public boolean oe(long j17, int i17, u32.j0 j0Var) {
        if (j0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback is null");
            return false;
        }
        if (j17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", java.lang.Long.valueOf(j17));
            return false;
        }
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid bluetooth version = %d", java.lang.Integer.valueOf(i17));
            return false;
        }
        u32.s1 s1Var = new u32.s1(null);
        s1Var.f505898a = j17;
        s1Var.f505899b = j0Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f505800p;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(7, s1Var))) {
            g32.c.c(g32.b.SIMPLE_BLUETOOTH_CONNECT);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 7);
        return false;
    }

    public final boolean p(android.os.RemoteCallbackList remoteCallbackList, long j17, android.os.IInterface iInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegisterRemoteCB, device id = %d, aCount = %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        if (remoteCallbackList == null || iInterface == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == aCallbackList || null == aCallback");
            return false;
        }
        do {
            i17--;
            if (i17 < 0) {
                break;
            }
        } while (!remoteCallbackList.getBroadcastItem(i17).asBinder().equals(iInterface.asBinder()));
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Can not find callback in callback list");
            return false;
        }
        java.util.HashMap hashMap = (java.util.HashMap) remoteCallbackList.getBroadcastCookie(i17);
        if (hashMap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == map");
            return false;
        }
        if (((android.os.IInterface) hashMap.remove(java.lang.Long.valueOf(j17))) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Cannot find id in the map");
            return false;
        }
        if (!hashMap.isEmpty()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "No id is in the map, unregister this process");
        boolean unregister = remoteCallbackList.unregister(iInterface);
        if (!unregister) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aCallbackList.unregister failed!!!");
        }
        return unregister;
    }

    @Override // u32.a0
    public boolean rc(int i17, u32.g0 g0Var) {
        boolean b17;
        if (g0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stop scan callback is null. just return");
            return false;
        }
        hq1.a0 a0Var = this.f505806v;
        if (a0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stop scan mBLESimpleMgr is null. just return");
            return false;
        }
        hq1.n nVar = a0Var.f364614a;
        iz5.a.g(null, nVar != null);
        if (a0Var.a()) {
            a0Var.f364618e.mo50300x3fa464aa(a0Var.f364619f);
            b17 = nVar.b(false, a0Var.f364620g);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESimpleManager", "BLE Unsupport");
            b17 = false;
        }
        if (!b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.stopScan Failed!!!");
            try {
                g0Var.N6(0, -1, "simpleBLE.stopScan failed!!!", "", "", 0, null);
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBLE.onScanCallback failed!!!, %s", e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RemoteBTDeviceAdapter", e17, "", new java.lang.Object[0]);
            }
        }
        g32.c.c(g32.b.SIMPLE_BLUETOOTH_STOP_SCAN);
        return b17;
    }

    @Override // u32.a0
    public boolean vf(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopChannel deviceId = %d", java.lang.Long.valueOf(j17));
        if (j17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", java.lang.Long.valueOf(j17));
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f505800p;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(4, java.lang.Long.valueOf(j17)))) {
            g32.c.c(g32.b.STOP_CHANNEL_SERVICE);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!! message what = %d", 4);
        return false;
    }

    @Override // u32.a0
    public boolean wi(u32.d1 d1Var) {
        if (d1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback is null");
            return false;
        }
        boolean register = this.f505804t.register(d1Var);
        if (!register) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBluetoothRegistOnRecv error");
        }
        g32.c.c(g32.b.INVOKE_ONCE);
        return register;
    }

    @Override // u32.a0
    public void xc(u32.q0 q0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registExDeviceInvokerHandler");
        if (!this.f505798n.register(q0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIExDeviceInvoker.register failed!!!");
        }
        g32.c.c(g32.b.INVOKE_ONCE);
    }
}
