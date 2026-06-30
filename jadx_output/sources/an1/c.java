package an1;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final an1.c f8833a = new an1.c();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f8834b = false;

    /* renamed from: c, reason: collision with root package name */
    public static int f8835c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f8836d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f8837e;

    public static final boolean c(java.util.Stack mDeviceQueue) {
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(mDeviceQueue, "mDeviceQueue");
        com.tencent.mars.xlog.Log.i("MicroMsg.BluetoothUtil", "request the bluetooth resource");
        if (!mDeviceQueue.isEmpty() && (num = (java.lang.Integer) mDeviceQueue.lastElement()) != null && num.intValue() == 4) {
            return true;
        }
        if (!f8833a.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BluetoothUtil", "current bluetooth can not use ");
            return false;
        }
        if (mDeviceQueue.contains(4)) {
            mDeviceQueue.removeElement(4);
        }
        mDeviceQueue.push(4);
        return true;
    }

    public static final int d(android.media.AudioManager audioManager) {
        kotlin.jvm.internal.o.g(audioManager, "audioManager");
        if (!f8833a.b() || !f8836d) {
            return -1;
        }
        ym1.e eVar = ym1.f.f463134h;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BluetoothUtil", "dkbt begin tryStartBluetooth %s", eVar.f());
        boolean z17 = false;
        if (!audioManager.isBluetoothScoAvailableOffCall()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BluetoothUtil", "start bluetooth failed by isBluetoothScoAvailableOffCall false");
        } else if (!com.tencent.mm.sdk.platformtools.l5.Bi()) {
            if (!mm1.g.a(audioManager)) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.i("MicroMsg.BluetoothUtil", "BluetoothUtil am.isBluetoothScoOn is false and startBluetoothSco, stack: %s", new com.tencent.mm.sdk.platformtools.z3());
                yj0.a.c(audioManager, "com/tencent/mm/plugin/audio/util/BluetoothUtil", "doStartBluetooth", "(Landroid/media/AudioManager;)Z", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
                audioManager.startBluetoothSco();
                yj0.a.f(audioManager, "com/tencent/mm/plugin/audio/util/BluetoothUtil", "doStartBluetooth", "(Landroid/media/AudioManager;)Z", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
            }
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BluetoothUtil", "dkbt end tryStartBluetooth %s ret:%s", eVar.f(), java.lang.Boolean.valueOf(z17));
        if (!z17) {
            return -1;
        }
        eVar.f();
        boolean i17 = eVar.i();
        if (i17) {
            audioManager.setBluetoothScoOn(true);
            f8834b = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BluetoothUtil", "isBluetoothOn: %b", java.lang.Boolean.valueOf(i17));
        return i17 ? 1 : 0;
    }

    public final boolean a() {
        if (fp.h.a(31)) {
            return true;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar).getClass();
        return j35.u.d(context, "android.permission.BLUETOOTH_CONNECT", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[Catch: Exception -> 0x009d, TryCatch #1 {Exception -> 0x009d, blocks: (B:3:0x0005, B:14:0x0038, B:16:0x0048, B:19:0x004f, B:21:0x0055, B:23:0x005b, B:25:0x0061, B:28:0x0068, B:29:0x006c, B:31:0x0072, B:36:0x0085, B:38:0x008b, B:43:0x0097, B:50:0x0030, B:9:0x000d, B:45:0x0014), top: B:2:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[Catch: Exception -> 0x009d, TryCatch #1 {Exception -> 0x009d, blocks: (B:3:0x0005, B:14:0x0038, B:16:0x0048, B:19:0x004f, B:21:0x0055, B:23:0x005b, B:25:0x0061, B:28:0x0068, B:29:0x006c, B:31:0x0072, B:36:0x0085, B:38:0x008b, B:43:0x0097, B:50:0x0030, B:9:0x000d, B:45:0x0014), top: B:2:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.BluetoothUtil"
            java.lang.String r1 = "dkbt isConnectHeadset() = "
            r2 = 0
            boolean r3 = r8.a()     // Catch: java.lang.Exception -> L9d
            if (r3 != 0) goto Lc
            return r2
        Lc:
            r3 = 1
            boolean r4 = r8.a()     // Catch: java.lang.Exception -> L30
            if (r4 != 0) goto L14
            goto L2e
        L14:
            android.bluetooth.BluetoothAdapter r4 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch: java.lang.Exception -> L30
            int r4 = r4.getProfileConnectionState(r3)     // Catch: java.lang.Exception -> L30
            java.lang.String r5 = "isConnectHeadset getProfileConnectionState: %s"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L30
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L30
            r6[r2] = r7     // Catch: java.lang.Exception -> L30
            com.tencent.mars.xlog.Log.i(r0, r5, r6)     // Catch: java.lang.Exception -> L30
            r5 = 2
            if (r4 != r5) goto L2e
            r4 = r3
            goto L36
        L2e:
            r4 = r2
            goto L36
        L30:
            java.lang.String r4 = "dkbt exception in isConnectDevice()"
            com.tencent.mars.xlog.Log.e(r0, r4)     // Catch: java.lang.Exception -> L9d
            goto L2e
        L36:
            if (r4 != 0) goto L48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9d
            r3.<init>(r1)     // Catch: java.lang.Exception -> L9d
            r3.append(r4)     // Catch: java.lang.Exception -> L9d
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L9d
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> L9d
            return r2
        L48:
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch: java.lang.Exception -> L9d
            if (r1 != 0) goto L4f
            return r2
        L4f:
            boolean r4 = r1.isEnabled()     // Catch: java.lang.Exception -> L9d
            if (r4 != 0) goto L5b
            java.lang.String r1 = "dkbt !adp.isEnabled()"
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> L9d
            return r2
        L5b:
            java.util.Set r1 = r1.getBondedDevices()     // Catch: java.lang.Exception -> L9d
            if (r1 == 0) goto L97
            int r4 = r1.size()     // Catch: java.lang.Exception -> L9d
            if (r4 != 0) goto L68
            goto L97
        L68:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L9d
        L6c:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Exception -> L9d
            if (r4 == 0) goto L82
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Exception -> L9d
            android.bluetooth.BluetoothDevice r4 = (android.bluetooth.BluetoothDevice) r4     // Catch: java.lang.Exception -> L9d
            int r4 = r4.getBondState()     // Catch: java.lang.Exception -> L9d
            r5 = 12
            if (r4 != r5) goto L6c
            r1 = r3
            goto L83
        L82:
            r1 = r2
        L83:
            if (r1 != 0) goto L8b
            java.lang.String r1 = "dkbt hasBond == false"
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> L9d
            return r2
        L8b:
            java.lang.String r1 = "isBluetoothCanUse: %b"
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L9d
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L9d
            r4[r2] = r5     // Catch: java.lang.Exception -> L9d
            com.tencent.mars.xlog.Log.i(r0, r1, r4)     // Catch: java.lang.Exception -> L9d
            return r3
        L97:
            java.lang.String r1 = "dkbt setDev == null || setDev.size() == 0"
            com.tencent.mars.xlog.Log.e(r0, r1)     // Catch: java.lang.Exception -> L9d
            return r2
        L9d:
            r1 = move-exception
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r1, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: an1.c.b():boolean");
    }
}
