package com.tencent.mm.plugin.exdevice.jni;

/* loaded from: classes13.dex */
public final class C2JavaExDevice {
    private static final java.lang.String TAG = "MicroMsg.exdevice.C2JavaExDevice";

    public static void C2Java_onStateChange(long j17, int i17, int i18, int i19) {
        iz5.a.d(null, u32.i.f424303h);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "onStateChange channelId = " + j17 + " oldState = " + i17 + " newState = " + i18 + " errCode = " + i19);
        long e17 = u32.i.f424303h.e(j17);
        if (-1 == e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId by channelId");
            return;
        }
        u32.e eVar = new u32.e(null);
        eVar.f424285a = e17;
        eVar.f424288d = i19;
        eVar.f424287c = i18;
        eVar.f424286b = i17;
        com.tencent.mm.sdk.platformtools.n3 n3Var = u32.i.f424303h.f424306f;
        iz5.a.g(null, n3Var.sendMessage(n3Var.obtainMessage(4, 0, 0, eVar)));
    }

    public static void C2Java_onTaskEnd(long j17, int i17, int i18, java.lang.String str, byte[] bArr) {
        iz5.a.d(null, u32.i.f424303h);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "onTaskEnd taskId = " + j17 + " errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        u32.f fVar = new u32.f();
        fVar.f424291a = j17;
        fVar.f424293c = i18;
        fVar.f424292b = i17;
        fVar.f424294d = str;
        com.tencent.mm.sdk.platformtools.n3 n3Var = u32.i.f424303h.f424306f;
        iz5.a.g(null, n3Var.sendMessage(n3Var.obtainMessage(3, 0, 0, fVar)));
    }

    public static boolean connect(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---connect--- aSessionId = %d", java.lang.Long.valueOf(j17));
        u32.p b17 = u32.p.b();
        boolean post = b17.f424344e.post(new u32.n(b17, j17));
        if (!post) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "connect: instance.mHandler.post failed!!!");
        }
        return post;
    }

    public static void createSession(long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---createSession--- aDeviceId = %d, aChannelId = %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        u32.p b17 = u32.p.b();
        if (b17.f424344e.post(new u32.l(b17, j17, j18))) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "createSession: instance.mHandler.post failed!!!");
    }

    public static void destroySession(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---destroySession--- aSessionId = %d", java.lang.Long.valueOf(j17));
        u32.p b17 = u32.p.b();
        if (b17.f424344e.post(new u32.o(b17, j17))) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "destroySession: instance.mHandler.post failed!!!");
    }

    public static void onAirKissCallback(int i17, int i18) {
        com.tencent.mm.plugin.exdevice.model.c2.a().b(0, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public static void onDeviceRequest(long j17, short s17, short s18, byte[] bArr, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Long.valueOf(j17);
        objArr[1] = java.lang.Short.valueOf(s17);
        objArr[2] = java.lang.Short.valueOf(s18);
        objArr[3] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
        objArr[4] = java.lang.Integer.valueOf(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "onDeviceRequest channelId = %d, seq = %d, cmdId =%d, datain len = %d, errCode = %d", objArr);
        iz5.a.d(null, u32.i.f424303h);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "onDeviceRequest channelId = " + j17 + " seq = " + ((int) s17) + "cmdId = " + ((int) s18) + "errCode = " + i17);
        long e17 = u32.i.f424303h.e(j17);
        if (-1 == e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId by channelId");
            return;
        }
        u32.c cVar = new u32.c(null);
        cVar.f424277a = e17;
        cVar.f424280d = bArr;
        cVar.f424279c = s18;
        cVar.f424278b = s17;
        com.tencent.mm.sdk.platformtools.n3 n3Var = u32.i.f424303h.f424306f;
        iz5.a.g(null, n3Var.sendMessage(n3Var.obtainMessage(5, i17, 0, cVar)));
    }

    public static void onReceiveWCLanDeviceDiscPackage(byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(bArr == null ? 0 : bArr.length);
        com.tencent.mars.xlog.Log.i(TAG, "onReceiveWCLanDeviceDiscPackage, dataLen(%d).", objArr);
        com.tencent.mm.plugin.exdevice.model.c2.a().b(10, bArr);
    }

    public static void onReceiveWCLanDeviceProfile(byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(bArr == null ? 0 : bArr.length);
        com.tencent.mars.xlog.Log.i(TAG, "onReceiveWCLanDeviceProfile, data(%d).", objArr);
        com.tencent.mm.plugin.exdevice.model.c2.a().b(14, bArr);
    }

    public static void onWCLanDeviceConnectStateNotify(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i(TAG, "onWCLanDeviceConnectStateNotify, devclassinfo(%s), stateCode(%d).", str, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.exdevice.model.c2.a().b(13, str, java.lang.Integer.valueOf(i17));
    }

    public static void onWCLanDeviceUdpError(int i17) {
        com.tencent.mars.xlog.Log.i(TAG, "onWCLanDeviceUdpError, errCode(%d).", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.exdevice.model.c2.a().b(11, java.lang.Integer.valueOf(i17));
    }

    public static void onWCLanFileTransferUpdate(int i17, byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(bArr != null ? bArr.length : 0);
        com.tencent.mars.xlog.Log.i(TAG, "onWCLanFileTransferUpdate, cmdId(%d), data(%d).", objArr);
        com.tencent.mm.plugin.exdevice.model.c2.a().b(15, java.lang.Integer.valueOf(i17), bArr);
    }

    public static void onWCLanReceiveNotify(java.lang.String str, byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(bArr != null ? bArr.length : 0);
        com.tencent.mars.xlog.Log.i(TAG, "onWCLanReceiveNotify, devclassinfo(%s), data(%d).", objArr);
        com.tencent.mm.plugin.exdevice.model.c2.a().b(16, str, bArr);
    }

    public static void onWCLanReceiveResponse(int i17, byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(bArr != null ? bArr.length : 0);
        com.tencent.mars.xlog.Log.i(TAG, "onWCLanReceiveResponse, cmdId(%d), data(%d).", objArr);
        com.tencent.mm.plugin.exdevice.model.c2.a().b(12, java.lang.Integer.valueOf(i17), bArr);
    }

    public static boolean sendData(long j17, byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Long.valueOf(j17);
        objArr[1] = java.lang.Integer.valueOf(bArr != null ? bArr.length : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "----sendData---- aSessionId = %d, datalength = %d", objArr);
        iz5.a.d(null, bArr);
        u32.p b17 = u32.p.b();
        boolean post = b17.f424344e.post(new u32.m(b17, j17, bArr));
        if (!post) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "sendData: instance.mHandler.post failed!!!");
        }
        return post;
    }
}
