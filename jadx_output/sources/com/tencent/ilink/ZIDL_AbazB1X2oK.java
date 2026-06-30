package com.tencent.ilink;

/* loaded from: classes15.dex */
class ZIDL_AbazB1X2oK {
    private static final java.lang.String TAG = "DeviceSessionK";
    private static final java.util.concurrent.atomic.AtomicLong taskId = new java.util.concurrent.atomic.AtomicLong(0);
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.DeviceSession.SessionTimeoutEvent> sessionTimeoutEventMap = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.DeviceSession.LonglinkConnectedEvent> longlinkConnectedEventMap = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.DeviceSession.LonglinkDisconnectedEvent> longlinkDisconnectedEventMap = new java.util.concurrent.ConcurrentHashMap<>();

    public static long GenTaskId() {
        return taskId.incrementAndGet();
    }

    public static native void ZIDL_AbazB1X2oD(long j17, java.lang.String str, java.lang.String str2);

    private void ZIDL_FI() {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onSessionTimeoutEvent size: " + this.sessionTimeoutEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.DeviceSession.SessionTimeoutEvent> entry : this.sessionTimeoutEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onSessionTimeoutEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event();
        }
    }

    private void ZIDL_GI() {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onLonglinkConnectedEvent size: " + this.longlinkConnectedEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.DeviceSession.LonglinkConnectedEvent> entry : this.longlinkConnectedEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onLonglinkConnectedEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event();
        }
    }

    private void ZIDL_HI() {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onLonglinkDisconnectedEvent size: " + this.longlinkDisconnectedEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.DeviceSession.LonglinkDisconnectedEvent> entry : this.longlinkDisconnectedEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onLonglinkDisconnectedEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event();
        }
    }

    public native long ZIDL_A(long j17);

    public native void ZIDL_AbazB1X2oC(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);

    public native com.tencent.wechat.zidl2.ZidlObjHolder2 ZIDL_B(long j17);

    public native com.tencent.wechat.zidl2.ZidlObjHolder2 ZIDL_C(long j17);

    public native void ZIDL_D(long j17);

    public native void ZIDL_E(long j17, byte[] bArr);

    public native void ZIDL_I(long j17);

    public void subscribeLonglinkConnectedEvent(java.lang.String str, com.tencent.ilink.DeviceSession.LonglinkConnectedEvent longlinkConnectedEvent) {
        this.longlinkConnectedEventMap.put(str, longlinkConnectedEvent);
    }

    public void subscribeLonglinkDisconnectedEvent(java.lang.String str, com.tencent.ilink.DeviceSession.LonglinkDisconnectedEvent longlinkDisconnectedEvent) {
        this.longlinkDisconnectedEventMap.put(str, longlinkDisconnectedEvent);
    }

    public void subscribeSessionTimeoutEvent(java.lang.String str, com.tencent.ilink.DeviceSession.SessionTimeoutEvent sessionTimeoutEvent) {
        this.sessionTimeoutEventMap.put(str, sessionTimeoutEvent);
    }

    public void unsubscribeLonglinkConnectedEvent(java.lang.String str) {
        this.longlinkConnectedEventMap.remove(str);
    }

    public void unsubscribeLonglinkDisconnectedEvent(java.lang.String str) {
        this.longlinkDisconnectedEventMap.remove(str);
    }

    public void unsubscribeSessionTimeoutEvent(java.lang.String str) {
        this.sessionTimeoutEventMap.remove(str);
    }
}
