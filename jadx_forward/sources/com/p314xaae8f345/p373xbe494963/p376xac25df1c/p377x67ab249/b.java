package com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249;

/* loaded from: classes14.dex */
public final class b implements android.bluetooth.BluetoothProfile.ServiceListener {

    /* renamed from: a, reason: collision with root package name */
    final android.bluetooth.BluetoothAdapter f127805a;

    /* renamed from: b, reason: collision with root package name */
    android.bluetooth.BluetoothProfile f127806b = null;

    /* renamed from: c, reason: collision with root package name */
    final java.lang.Object f127807c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    private final android.content.Context f127808d;

    /* renamed from: e, reason: collision with root package name */
    private android.media.AudioManager f127809e;

    public b(android.content.Context context) {
        this.f127808d = context;
        android.bluetooth.BluetoothAdapter c17 = c();
        this.f127805a = c17;
        if (c17 != null) {
            try {
                c17.getProfileProxy(context, this, 1);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w("BluetoothHeadsetListener", "Get profile proxy exception " + th6.getMessage(), new java.lang.Object[0]);
            }
        } else {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("BluetoothHeadsetListener", "Bluetooth adapter is null", new java.lang.Object[0]);
        }
        this.f127809e = (android.media.AudioManager) this.f127808d.getSystemService("audio");
    }

    private static android.bluetooth.BluetoothAdapter c() {
        try {
            return android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w("BluetoothHeadsetListener", "Get default adapter exception " + th6.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    private java.util.List<android.bluetooth.BluetoothDevice> d() {
        try {
            return this.f127806b.getConnectedDevices();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w("BluetoothHeadsetListener", "Get connected devices exception " + th6.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    private boolean e() {
        try {
            return this.f127805a.isEnabled();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w("BluetoothHeadsetListener", "Get bluetooth adapter status exception " + th6.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        if (r2.size() > 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r9 = this;
            android.bluetooth.BluetoothAdapter r0 = r9.f127805a
            r1 = 0
            if (r0 == 0) goto Lc5
            boolean r0 = r9.e()
            if (r0 != 0) goto Ld
            goto Lc5
        Ld:
            java.lang.Object r0 = r9.f127807c
            monitor-enter(r0)
            android.bluetooth.BluetoothProfile r2 = r9.f127806b     // Catch: java.lang.Throwable -> Lc2
            if (r2 != 0) goto L56
            java.lang.String r2 = "BluetoothHeadsetListener"
            java.lang.String r3 = "mBluetoothHeadsetProfile is null ,wait for 1000ms"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L25
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(r2, r3, r4)     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r9.f127807c     // Catch: java.lang.Throwable -> L25
            r3 = 1000(0x3e8, double:4.94E-321)
            r2.wait(r3)     // Catch: java.lang.Throwable -> L25
            goto L3f
        L25:
            r2 = move-exception
            java.lang.String r3 = "BluetoothHeadsetListener"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r5 = "Wait exception "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> Lc2
            r4.append(r2)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lc2
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w(r3, r2, r4)     // Catch: java.lang.Throwable -> Lc2
        L3f:
            android.bluetooth.BluetoothProfile r2 = r9.f127806b     // Catch: java.lang.Throwable -> Lc2
            if (r2 != 0) goto L4d
            java.lang.String r2 = "BluetoothHeadsetListener"
            java.lang.String r3 = "mBluetoothHeadsetProfile is still null"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lc2
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(r2, r3, r4)     // Catch: java.lang.Throwable -> Lc2
            goto L56
        L4d:
            java.lang.String r2 = "BluetoothHeadsetListener"
            java.lang.String r3 = "mBluetoothHeadsetProfile service is connected now"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lc2
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(r2, r3, r4)     // Catch: java.lang.Throwable -> Lc2
        L56:
            int r2 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0()     // Catch: java.lang.Throwable -> L94
            r3 = 30
            r4 = 1
            if (r2 <= r3) goto L7f
            android.media.AudioManager r2 = r9.f127809e     // Catch: java.lang.Throwable -> L94
            r3 = 2
            android.media.AudioDeviceInfo[] r2 = r2.getDevices(r3)     // Catch: java.lang.Throwable -> L94
            int r3 = r2.length     // Catch: java.lang.Throwable -> L94
            r5 = r1
        L68:
            if (r5 >= r3) goto Lae
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L94
            int r7 = r6.getType()     // Catch: java.lang.Throwable -> L94
            r8 = 8
            if (r7 == r8) goto Laf
            int r6 = r6.getType()     // Catch: java.lang.Throwable -> L94
            r7 = 7
            if (r6 != r7) goto L7c
            goto Laf
        L7c:
            int r5 = r5 + 1
            goto L68
        L7f:
            android.content.Context r2 = r9.f127808d     // Catch: java.lang.Throwable -> L94
            boolean r2 = a(r2)     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto Lae
            java.util.List r2 = r9.d()     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto Lae
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L94
            if (r2 <= 0) goto Lae
            goto Laf
        L94:
            r2 = move-exception
            java.lang.String r3 = "BluetoothHeadsetListener"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r5 = "get connected bluetooth devices failed."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> Lc2
            r4.append(r2)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lc2
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(r3, r2, r4)     // Catch: java.lang.Throwable -> Lc2
        Lae:
            r4 = r1
        Laf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "BluetoothHeadsetListener"
            java.lang.String r2 = "find bluetooth device "
            java.lang.String r3 = java.lang.String.valueOf(r4)
            java.lang.String r2 = r2.concat(r3)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(r0, r2, r1)
            return r4
        Lc2:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc2
            throw r1
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.b.a():boolean");
    }

    public final void b() {
        try {
            this.f127805a.closeProfileProxy(1, this.f127806b);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w("BluetoothHeadsetListener", "Close profile proxy exception " + th6.getMessage(), new java.lang.Object[0]);
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i17, android.bluetooth.BluetoothProfile bluetoothProfile) {
        android.bluetooth.BluetoothProfile bluetoothProfile2;
        if (i17 != 1) {
            return;
        }
        synchronized (this.f127807c) {
            if (this.f127805a != null && (bluetoothProfile2 = this.f127806b) != null) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("BluetoothHeadsetListener", "Bluetooth Headset proxy changed from %s to %s", bluetoothProfile2, bluetoothProfile);
                b();
            }
            this.f127806b = bluetoothProfile;
            this.f127807c.notifyAll();
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i17) {
        if (i17 != 1) {
            return;
        }
        synchronized (this.f127807c) {
            if (this.f127805a != null && this.f127806b != null) {
                b();
                this.f127806b = null;
            }
        }
    }

    public static boolean a(android.content.Context context) {
        if (context == null || com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 31) {
            return true;
        }
        try {
            return context.checkPermission("android.permission.BLUETOOTH_CONNECT", android.os.Process.myPid(), android.os.Process.myUid()) == 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w("BluetoothHeadsetListener", "checkPermission exception " + th6.getMessage(), new java.lang.Object[0]);
            return true;
        }
    }
}
