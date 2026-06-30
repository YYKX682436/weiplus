package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni;

/* renamed from: com.tencent.mm.plugin.exdevice.jni.C2JavaExDevice */
/* loaded from: classes13.dex */
public final class C13410x63d9af1a {
    private static final java.lang.String TAG = "MicroMsg.exdevice.C2JavaExDevice";

    /* renamed from: C2Java_onStateChange */
    public static void m54969x4b71e394(long j17, int i17, int i18, int i19) {
        iz5.a.d(null, u32.i.f505836h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "onStateChange channelId = " + j17 + " oldState = " + i17 + " newState = " + i18 + " errCode = " + i19);
        long e17 = u32.i.f505836h.e(j17);
        if (-1 == e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId by channelId");
            return;
        }
        u32.e eVar = new u32.e(null);
        eVar.f505818a = e17;
        eVar.f505821d = i19;
        eVar.f505820c = i18;
        eVar.f505819b = i17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = u32.i.f505836h.f505839f;
        iz5.a.g(null, n3Var.mo50308x2936bf5f(n3Var.mo50291x733c63a2(4, 0, 0, eVar)));
    }

    /* renamed from: C2Java_onTaskEnd */
    public static void m54970xd199b289(long j17, int i17, int i18, java.lang.String str, byte[] bArr) {
        iz5.a.d(null, u32.i.f505836h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "onTaskEnd taskId = " + j17 + " errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        u32.f fVar = new u32.f();
        fVar.f505824a = j17;
        fVar.f505826c = i18;
        fVar.f505825b = i17;
        fVar.f505827d = str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = u32.i.f505836h.f505839f;
        iz5.a.g(null, n3Var.mo50308x2936bf5f(n3Var.mo50291x733c63a2(3, 0, 0, fVar)));
    }

    /* renamed from: connect */
    public static boolean m54971x38b478ea(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---connect--- aSessionId = %d", java.lang.Long.valueOf(j17));
        u32.p b17 = u32.p.b();
        boolean mo50293x3498a0 = b17.f505877e.mo50293x3498a0(new u32.n(b17, j17));
        if (!mo50293x3498a0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "connect: instance.mHandler.post failed!!!");
        }
        return mo50293x3498a0;
    }

    /* renamed from: createSession */
    public static void m54972xfc37a5fa(long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---createSession--- aDeviceId = %d, aChannelId = %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        u32.p b17 = u32.p.b();
        if (b17.f505877e.mo50293x3498a0(new u32.l(b17, j17, j18))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "createSession: instance.mHandler.post failed!!!");
    }

    /* renamed from: destroySession */
    public static void m54973x461a6d3c(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---destroySession--- aSessionId = %d", java.lang.Long.valueOf(j17));
        u32.p b17 = u32.p.b();
        if (b17.f505877e.mo50293x3498a0(new u32.o(b17, j17))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "destroySession: instance.mHandler.post failed!!!");
    }

    /* renamed from: onAirKissCallback */
    public static void m54974x3586212e(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c2.a().b(0, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    /* renamed from: onDeviceRequest */
    public static void m54975x31b2a3ba(long j17, short s17, short s18, byte[] bArr, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Long.valueOf(j17);
        objArr[1] = java.lang.Short.valueOf(s17);
        objArr[2] = java.lang.Short.valueOf(s18);
        objArr[3] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
        objArr[4] = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "onDeviceRequest channelId = %d, seq = %d, cmdId =%d, datain len = %d, errCode = %d", objArr);
        iz5.a.d(null, u32.i.f505836h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "onDeviceRequest channelId = " + j17 + " seq = " + ((int) s17) + "cmdId = " + ((int) s18) + "errCode = " + i17);
        long e17 = u32.i.f505836h.e(j17);
        if (-1 == e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId by channelId");
            return;
        }
        u32.c cVar = new u32.c(null);
        cVar.f505810a = e17;
        cVar.f505813d = bArr;
        cVar.f505812c = s18;
        cVar.f505811b = s17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = u32.i.f505836h.f505839f;
        iz5.a.g(null, n3Var.mo50308x2936bf5f(n3Var.mo50291x733c63a2(5, i17, 0, cVar)));
    }

    /* renamed from: onReceiveWCLanDeviceDiscPackage */
    public static void m54976xc97b3212(byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(bArr == null ? 0 : bArr.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onReceiveWCLanDeviceDiscPackage, dataLen(%d).", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c2.a().b(10, bArr);
    }

    /* renamed from: onReceiveWCLanDeviceProfile */
    public static void m54977x1666374a(byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(bArr == null ? 0 : bArr.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onReceiveWCLanDeviceProfile, data(%d).", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c2.a().b(14, bArr);
    }

    /* renamed from: onWCLanDeviceConnectStateNotify */
    public static void m54978x766c3bb4(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onWCLanDeviceConnectStateNotify, devclassinfo(%s), stateCode(%d).", str, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c2.a().b(13, str, java.lang.Integer.valueOf(i17));
    }

    /* renamed from: onWCLanDeviceUdpError */
    public static void m54979xf4717f8b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onWCLanDeviceUdpError, errCode(%d).", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c2.a().b(11, java.lang.Integer.valueOf(i17));
    }

    /* renamed from: onWCLanFileTransferUpdate */
    public static void m54980x82cb067e(int i17, byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(bArr != null ? bArr.length : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onWCLanFileTransferUpdate, cmdId(%d), data(%d).", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c2.a().b(15, java.lang.Integer.valueOf(i17), bArr);
    }

    /* renamed from: onWCLanReceiveNotify */
    public static void m54981x49bfd9fe(java.lang.String str, byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(bArr != null ? bArr.length : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onWCLanReceiveNotify, devclassinfo(%s), data(%d).", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c2.a().b(16, str, bArr);
    }

    /* renamed from: onWCLanReceiveResponse */
    public static void m54982x66697db6(int i17, byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(bArr != null ? bArr.length : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onWCLanReceiveResponse, cmdId(%d), data(%d).", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c2.a().b(12, java.lang.Integer.valueOf(i17), bArr);
    }

    /* renamed from: sendData */
    public static boolean m54983x4a532f52(long j17, byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Long.valueOf(j17);
        objArr[1] = java.lang.Integer.valueOf(bArr != null ? bArr.length : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "----sendData---- aSessionId = %d, datalength = %d", objArr);
        iz5.a.d(null, bArr);
        u32.p b17 = u32.p.b();
        boolean mo50293x3498a0 = b17.f505877e.mo50293x3498a0(new u32.m(b17, j17, bArr));
        if (!mo50293x3498a0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "sendData: instance.mHandler.post failed!!!");
        }
        return mo50293x3498a0;
    }
}
