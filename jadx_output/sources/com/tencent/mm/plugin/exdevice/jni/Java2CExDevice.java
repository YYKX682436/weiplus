package com.tencent.mm.plugin.exdevice.jni;

/* loaded from: classes13.dex */
public final class Java2CExDevice {
    private static final java.lang.String TAG = "Java2CExDevice";

    /* loaded from: classes13.dex */
    public static class AccessoryCmd {
        public long channelID;
        public int reqCmdID;
        public int respCmdID;
    }

    /* loaded from: classes13.dex */
    public static class LongWrapper {
        public long value;
    }

    private static native void cancelWCLanDeviceTask(int i17);

    public static void cancelWCLanDeviceTaskV2(int i17) {
        if (init()) {
            cancelWCLanDeviceTask(i17);
        }
    }

    private static native void closeBluetoothAccessoryLib();

    public static void closeBluetoothAccessoryLibV2() {
        if (init()) {
            closeBluetoothAccessoryLib();
        }
    }

    private static native int connectWCLanDevice(byte[] bArr, boolean z17);

    public static int connectWCLanDeviceV2(byte[] bArr, boolean z17) {
        if (init()) {
            return connectWCLanDevice(bArr, z17);
        }
        return -1;
    }

    private static native int createChannel(long j17, com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.LongWrapper longWrapper);

    public static int createChannelV2(long j17, com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.LongWrapper longWrapper) {
        if (init()) {
            return createChannel(j17, longWrapper);
        }
        return -1;
    }

    private static native void destroyChannel(long j17);

    public static void destroyChannelV2(long j17) {
        if (init()) {
            destroyChannel(j17);
        }
    }

    private static native int disconnectWCLanDevice(byte[] bArr);

    public static int disconnectWCLanDeviceV2(byte[] bArr) {
        if (init()) {
            return disconnectWCLanDevice(bArr);
        }
        return -1;
    }

    private static native int getWCLanDeviceService(byte[] bArr, byte[] bArr2);

    public static int getWCLanDeviceServiceV2(byte[] bArr, byte[] bArr2) {
        if (init()) {
            return getWCLanDeviceService(bArr, bArr2);
        }
        return -1;
    }

    public static boolean init() {
        boolean z17;
        java.util.HashMap hashMap = (java.util.HashMap) x32.g.f451605a;
        if (hashMap.containsKey("ilinkres_099f9dd6#wechataccessory") && hashMap.get("ilinkres_099f9dd6#wechataccessory") != null && java.lang.Boolean.TRUE.equals(hashMap.get("ilinkres_099f9dd6#wechataccessory"))) {
            return true;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        k32.a aVar = new k32.a(countDownLatch);
        synchronized (x32.g.class) {
            com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_099f9dd6", "wechataccessory");
            if (Ui != null) {
                java.lang.String path = Ui.getPath();
                int i17 = (int) Ui.f217590e;
                rk0.c.c("LibraryHelper", "[LoadLibrary] get res from local, path: %s, version: %d, target version: %d", path, java.lang.Integer.valueOf(i17), 2);
                if (i17 == 2) {
                    x32.g.a("ilinkres_099f9dd6", "wechataccessory", path, aVar);
                    z17 = true;
                }
            }
            x32.e eVar = new x32.e(2, aVar);
            com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
            qVar.c("ilinkres_099f9dd6");
            ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Di(qVar, eVar);
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
    public static native void initBluetoothAccessoryLib();

    private static native void initWCLanDeviceLib();

    public static void initWCLanDeviceLibV2() {
        if (init()) {
            initWCLanDeviceLib();
        }
    }

    private static native void onBluetoothConnected(long j17);

    public static void onBluetoothConnectedV2(long j17) {
        if (init()) {
            onBluetoothConnected(j17);
        }
    }

    private static native void onBluetoothDisconnected(long j17);

    public static void onBluetoothDisconnectedV2(long j17) {
        if (init()) {
            onBluetoothDisconnected(j17);
        }
    }

    private static native void onBluetoothError(long j17, int i17);

    public static void onBluetoothErrorV2(long j17, int i17) {
        if (init()) {
            onBluetoothError(j17, i17);
        }
    }

    private static native void onBluetoothRecvData(long j17, byte[] bArr);

    public static void onBluetoothRecvDataV2(long j17, byte[] bArr) {
        if (init()) {
            onBluetoothRecvData(j17, bArr);
        }
    }

    private static native void onBluetoothSendDataCompleted(long j17);

    public static void onBluetoothSendDataCompletedV2(long j17) {
        if (init()) {
            onBluetoothSendDataCompleted(j17);
        }
    }

    private static native void onBluetoothSessionCreated(long j17, long j18, long j19);

    public static void onBluetoothSessionCreatedV2(long j17, long j18, long j19) {
        if (init()) {
            onBluetoothSessionCreated(j17, j18, j19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onCreate();

    private static native int readFileDataFromWCLanDevice(byte[] bArr, byte[] bArr2);

    public static int readFileDataFromWCLanDeviceV2(byte[] bArr, byte[] bArr2) {
        if (init()) {
            return readFileDataFromWCLanDevice(bArr, bArr2);
        }
        return -1;
    }

    private static native void releaseWCLanDeviceLib();

    public static void releaseWCLanDeviceLibV2() {
        if (init()) {
            releaseWCLanDeviceLib();
        }
    }

    private static native int sendFileToWCLanDevice(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static int sendFileToWCLanDeviceV2(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (init()) {
            return sendFileToWCLanDevice(bArr, bArr2, bArr3);
        }
        return -1;
    }

    private static native void setChannelSessionKey(long j17, byte[] bArr);

    public static void setChannelSessionKeyV2(long j17, byte[] bArr) {
        if (init()) {
            setChannelSessionKey(j17, bArr);
        }
    }

    private static native int startAirKiss(java.lang.String str, java.lang.String str2, byte[] bArr, long j17);

    public static int startAirKissV2(java.lang.String str, java.lang.String str2, byte[] bArr, long j17) {
        if (init()) {
            return startAirKiss(str, str2, bArr, j17);
        }
        return -1;
    }

    private static native int startAirKissWithInter(java.lang.String str, java.lang.String str2, byte[] bArr, long j17, int i17, int i18);

    public static int startAirKissWithInterV2(java.lang.String str, java.lang.String str2, byte[] bArr, long j17, int i17, int i18) {
        if (init()) {
            return startAirKissWithInter(str, str2, bArr, j17, i17, i18);
        }
        return -1;
    }

    private static native int startChannelService(long j17);

    public static int startChannelServiceV2(long j17) {
        if (init()) {
            return startChannelService(j17);
        }
        return -1;
    }

    private static native void startScanWCLanDevice(byte[] bArr, int i17);

    public static void startScanWCLanDeviceV2(byte[] bArr, int i17) {
        if (init()) {
            startScanWCLanDevice(bArr, i17);
        }
    }

    private static native int startTask(long j17, short s17, com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.AccessoryCmd accessoryCmd, byte[] bArr);

    public static int startTaskV2(long j17, short s17, com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.AccessoryCmd accessoryCmd, byte[] bArr) {
        if (init()) {
            return startTask(j17, s17, accessoryCmd, bArr);
        }
        return -1;
    }

    private static native void stopAirKiss();

    public static void stopAirKissV2() {
        if (init()) {
            stopAirKiss();
        }
    }

    private static native void stopChannelService(long j17);

    public static void stopChannelServiceV2(long j17) {
        if (init()) {
            stopChannelService(j17);
        }
    }

    private static native void stopScanWCLanDevice();

    public static void stopScanWCLanDeviceV2() {
        if (init()) {
            stopScanWCLanDevice();
        }
    }

    private static native void stopTask(long j17);

    public static void stopTaskV2(long j17) {
        if (init()) {
            stopTask(j17);
        }
    }

    private static native int useWCLanDeviceService(byte[] bArr, byte[] bArr2);

    public static int useWCLanDeviceServiceV2(byte[] bArr, byte[] bArr2) {
        if (init()) {
            return useWCLanDeviceService(bArr, bArr2);
        }
        return -1;
    }

    private static native int writeFileDataToWCLanDevice(byte[] bArr, byte[] bArr2);

    public static int writeFileDataToWCLanDeviceV2(byte[] bArr, byte[] bArr2) {
        if (init()) {
            return writeFileDataToWCLanDevice(bArr, bArr2);
        }
        return -1;
    }
}
