package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni;

/* renamed from: com.tencent.mm.plugin.exdevice.jni.Java2CExDevice */
/* loaded from: classes13.dex */
public final class C13411x69f9c21c {
    private static final java.lang.String TAG = "Java2CExDevice";

    /* renamed from: com.tencent.mm.plugin.exdevice.jni.Java2CExDevice$AccessoryCmd */
    /* loaded from: classes13.dex */
    public static class AccessoryCmd {

        /* renamed from: channelID */
        public long f35461x5720515e;

        /* renamed from: reqCmdID */
        public int f35462xe5d22dd7;

        /* renamed from: respCmdID */
        public int f35463x88beb9e5;
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.jni.Java2CExDevice$LongWrapper */
    /* loaded from: classes13.dex */
    public static class LongWrapper {

        /* renamed from: value */
        public long f35464x6ac9171;
    }

    /* renamed from: cancelWCLanDeviceTask */
    private static native void m54986x3209e4e(int i17);

    /* renamed from: cancelWCLanDeviceTaskV2 */
    public static void m54987xbd724d6a(int i17) {
        if (m55000x316510()) {
            m54986x3209e4e(i17);
        }
    }

    /* renamed from: closeBluetoothAccessoryLib */
    private static native void m54988xebc988c9();

    /* renamed from: closeBluetoothAccessoryLibV2 */
    public static void m54989x1f8a8525() {
        if (m55000x316510()) {
            m54988xebc988c9();
        }
    }

    /* renamed from: connectWCLanDevice */
    private static native int m54990x7b0380b9(byte[] bArr, boolean z17);

    /* renamed from: connectWCLanDeviceV2 */
    public static int m54991xc8264115(byte[] bArr, boolean z17) {
        if (m55000x316510()) {
            return m54990x7b0380b9(bArr, z17);
        }
        return -1;
    }

    /* renamed from: createChannel */
    private static native int m54992xb1f2a067(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.LongWrapper longWrapper);

    /* renamed from: createChannelV2 */
    public static int m54993xffcc2d43(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.LongWrapper longWrapper) {
        if (m55000x316510()) {
            return m54992xb1f2a067(j17, longWrapper);
        }
        return -1;
    }

    /* renamed from: destroyChannel */
    private static native void m54994xfbd567a9(long j17);

    /* renamed from: destroyChannelV2 */
    public static void m54995x5c1a2c05(long j17) {
        if (m55000x316510()) {
            m54994xfbd567a9(j17);
        }
    }

    /* renamed from: disconnectWCLanDevice */
    private static native int m54996xcbae3dc7(byte[] bArr);

    /* renamed from: disconnectWCLanDeviceV2 */
    public static int m54997x9915f2a3(byte[] bArr) {
        if (m55000x316510()) {
            return m54996xcbae3dc7(bArr);
        }
        return -1;
    }

    /* renamed from: getWCLanDeviceService */
    private static native int m54998x3971f28(byte[] bArr, byte[] bArr2);

    /* renamed from: getWCLanDeviceServiceV2 */
    public static int m54999x7a4bffc4(byte[] bArr, byte[] bArr2) {
        if (m55000x316510()) {
            return m54998x3971f28(bArr, bArr2);
        }
        return -1;
    }

    /* renamed from: init */
    public static boolean m55000x316510() {
        boolean z17;
        java.util.HashMap hashMap = (java.util.HashMap) x32.g.f533138a;
        if (hashMap.containsKey("ilinkres_099f9dd6#wechataccessory") && hashMap.get("ilinkres_099f9dd6#wechataccessory") != null && java.lang.Boolean.TRUE.equals(hashMap.get("ilinkres_099f9dd6#wechataccessory"))) {
            return true;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        k32.a aVar = new k32.a(countDownLatch);
        synchronized (x32.g.class) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_099f9dd6", "wechataccessory");
            if (Ui != null) {
                java.lang.String m117639xfb83cc9b = Ui.m117639xfb83cc9b();
                int i17 = (int) Ui.f299123e;
                rk0.c.c("LibraryHelper", "[LoadLibrary] get res from local, path: %s, version: %d, target version: %d", m117639xfb83cc9b, java.lang.Integer.valueOf(i17), 2);
                if (i17 == 2) {
                    x32.g.a("ilinkres_099f9dd6", "wechataccessory", m117639xfb83cc9b, aVar);
                    z17 = true;
                }
            }
            x32.e eVar = new x32.e(2, aVar);
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
            qVar.c("ilinkres_099f9dd6");
            ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Di(qVar, eVar);
            z17 = false;
        }
        if (z17) {
            return true;
        }
        boolean z18 = java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread();
        if (!z18) {
            try {
                z17 = countDownLatch.await(10L, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.Throwable th6) {
                rk0.c.b(TAG, "ex:" + th6, new java.lang.Object[0]);
            }
        }
        rk0.c.c(TAG, "cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", success:" + z17 + ", isMainThread:" + z18, new java.lang.Object[0]);
        return z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initBluetoothAccessoryLib */
    public static native void m55001xa811e0b1();

    /* renamed from: initWCLanDeviceLib */
    private static native void m55002xd7a374b2();

    /* renamed from: initWCLanDeviceLibV2 */
    public static void m55003x7c991ace() {
        if (m55000x316510()) {
            m55002xd7a374b2();
        }
    }

    /* renamed from: onBluetoothConnected */
    private static native void m55004x329c243a(long j17);

    /* renamed from: onBluetoothConnectedV2 */
    public static void m55005xfc240856(long j17) {
        if (m55000x316510()) {
            m55004x329c243a(j17);
        }
    }

    /* renamed from: onBluetoothDisconnected */
    private static native void m55006xc3a4236a(long j17);

    /* renamed from: onBluetoothDisconnectedV2 */
    public static void m55007x6b28fb86(long j17) {
        if (m55000x316510()) {
            m55006xc3a4236a(j17);
        }
    }

    /* renamed from: onBluetoothError */
    private static native void m55008x3ac943b9(long j17, int i17);

    /* renamed from: onBluetoothErrorV2 */
    public static void m55009xad874415(long j17, int i17) {
        if (m55000x316510()) {
            m55008x3ac943b9(j17, i17);
        }
    }

    /* renamed from: onBluetoothRecvData */
    private static native void m55010x80d4bf5f(long j17, byte[] bArr);

    /* renamed from: onBluetoothRecvDataV2 */
    public static void m55011x9ea26e3b(long j17, byte[] bArr) {
        if (m55000x316510()) {
            m55010x80d4bf5f(j17, bArr);
        }
    }

    /* renamed from: onBluetoothSendDataCompleted */
    private static native void m55012xfa5734a(long j17);

    /* renamed from: onBluetoothSendDataCompletedV2 */
    public static void m55013xbc15d366(long j17) {
        if (m55000x316510()) {
            m55012xfa5734a(j17);
        }
    }

    /* renamed from: onBluetoothSessionCreated */
    private static native void m55014x282284e1(long j17, long j18, long j19);

    /* renamed from: onBluetoothSessionCreatedV2 */
    public static void m55015xa994db3d(long j17, long j18, long j19) {
        if (m55000x316510()) {
            m55014x282284e1(j17, j18, j19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate */
    public static native void m55016x3e5a77bb();

    /* renamed from: readFileDataFromWCLanDevice */
    private static native int m55017x9d9075d(byte[] bArr, byte[] bArr2);

    /* renamed from: readFileDataFromWCLanDeviceV2 */
    public static int m55018xf7b4aeb9(byte[] bArr, byte[] bArr2) {
        if (m55000x316510()) {
            return m55017x9d9075d(bArr, bArr2);
        }
        return -1;
    }

    /* renamed from: releaseWCLanDeviceLib */
    private static native void m55019xfb6b3b69();

    /* renamed from: releaseWCLanDeviceLibV2 */
    public static void m55020xcd8a0fc5() {
        if (m55000x316510()) {
            m55019xfb6b3b69();
        }
    }

    /* renamed from: sendFileToWCLanDevice */
    private static native int m55021x8370ebc4(byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: sendFileToWCLanDeviceV2 */
    public static int m55022x6ae51560(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (m55000x316510()) {
            return m55021x8370ebc4(bArr, bArr2, bArr3);
        }
        return -1;
    }

    /* renamed from: setChannelSessionKey */
    private static native void m55023x4ceb590a(long j17, byte[] bArr);

    /* renamed from: setChannelSessionKeyV2 */
    public static void m55024xbf794926(long j17, byte[] bArr) {
        if (m55000x316510()) {
            m55023x4ceb590a(j17, bArr);
        }
    }

    /* renamed from: startAirKiss */
    private static native int m55025xbccff5e6(java.lang.String str, java.lang.String str2, byte[] bArr, long j17);

    /* renamed from: startAirKissV2 */
    public static int m55026xc8aa1f02(java.lang.String str, java.lang.String str2, byte[] bArr, long j17) {
        if (m55000x316510()) {
            return m55025xbccff5e6(str, str2, bArr, j17);
        }
        return -1;
    }

    /* renamed from: startAirKissWithInter */
    private static native int m55027xabefbc70(java.lang.String str, java.lang.String str2, byte[] bArr, long j17, int i17, int i18);

    /* renamed from: startAirKissWithInterV2 */
    public static int m55028x6ef26b0c(java.lang.String str, java.lang.String str2, byte[] bArr, long j17, int i17, int i18) {
        if (m55000x316510()) {
            return m55027xabefbc70(str, str2, bArr, j17, i17, i18);
        }
        return -1;
    }

    /* renamed from: startChannelService */
    private static native int m55029x3a470534(long j17);

    /* renamed from: startChannelServiceV2 */
    public static int m55030xc49a92d0(long j17) {
        if (m55000x316510()) {
            return m55029x3a470534(j17);
        }
        return -1;
    }

    /* renamed from: startScanWCLanDevice */
    private static native void m55031x23206c84(byte[] bArr, int i17);

    /* renamed from: startScanWCLanDeviceV2 */
    public static void m55032xdcb76620(byte[] bArr, int i17) {
        if (m55000x316510()) {
            m55031x23206c84(bArr, i17);
        }
    }

    /* renamed from: startTask */
    private static native int m55033x81156d07(long j17, short s17, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.AccessoryCmd accessoryCmd, byte[] bArr);

    /* renamed from: startTaskV2 */
    public static int m55034x916e51e3(long j17, short s17, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.AccessoryCmd accessoryCmd, byte[] bArr) {
        if (m55000x316510()) {
            return m55033x81156d07(j17, s17, accessoryCmd, bArr);
        }
        return -1;
    }

    /* renamed from: stopAirKiss */
    private static native void m55035x783f5e46();

    /* renamed from: stopAirKissV2 */
    public static void m55036x65e0ef62() {
        if (m55000x316510()) {
            m55035x783f5e46();
        }
    }

    /* renamed from: stopChannelService */
    private static native void m55037x2a370d4(long j17);

    /* renamed from: stopChannelServiceV2 */
    public static void m55038xe78a9670(long j17) {
        if (m55000x316510()) {
            m55037x2a370d4(j17);
        }
    }

    /* renamed from: stopScanWCLanDevice */
    private static native void m55039x665174e4();

    /* renamed from: stopScanWCLanDeviceV2 */
    public static void m55040x17c7d680() {
        if (m55000x316510()) {
            m55039x665174e4();
        }
    }

    /* renamed from: stopTask */
    private static native void m55041x6635e0a7(long j17);

    /* renamed from: stopTaskV2 */
    public static void m55042xb0405d83(long j17) {
        if (m55000x316510()) {
            m55041x6635e0a7(j17);
        }
    }

    /* renamed from: useWCLanDeviceService */
    private static native int m55043x51d28b19(byte[] bArr, byte[] bArr2);

    /* renamed from: useWCLanDeviceServiceV2 */
    public static int m55044x275c3375(byte[] bArr, byte[] bArr2) {
        if (m55000x316510()) {
            return m55043x51d28b19(bArr, bArr2);
        }
        return -1;
    }

    /* renamed from: writeFileDataToWCLanDevice */
    private static native int m55045x753b5643(byte[] bArr, byte[] bArr2);

    /* renamed from: writeFileDataToWCLanDeviceV2 */
    public static int m55046x13bedc1f(byte[] bArr, byte[] bArr2) {
        if (m55000x316510()) {
            return m55045x753b5643(bArr, bArr2);
        }
        return -1;
    }
}
