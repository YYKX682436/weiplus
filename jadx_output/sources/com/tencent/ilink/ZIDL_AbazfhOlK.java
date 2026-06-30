package com.tencent.ilink;

/* loaded from: classes15.dex */
class ZIDL_AbazfhOlK {
    private static final java.lang.String TAG = "AppDeviceSessionK";
    private static final java.util.concurrent.atomic.AtomicLong taskId = new java.util.concurrent.atomic.AtomicLong(0);
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.AppDeviceSession.SessionTimeoutEvent> sessionTimeoutEventMap = new java.util.concurrent.ConcurrentHashMap<>();

    public static long GenTaskId() {
        return taskId.incrementAndGet();
    }

    public static native void ZIDL_AbazfhOlD(long j17, java.lang.String str, java.lang.String str2);

    private void ZIDL_EI() {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onSessionTimeoutEvent size: " + this.sessionTimeoutEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.AppDeviceSession.SessionTimeoutEvent> entry : this.sessionTimeoutEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onSessionTimeoutEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event();
        }
    }

    public native byte[] ZIDL_A(long j17);

    public native void ZIDL_AbazfhOlC(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);

    public native long ZIDL_B(long j17);

    public native com.tencent.wechat.zidl2.ZidlObjHolder2 ZIDL_C(long j17);

    public native com.tencent.wechat.zidl2.ZidlObjHolder2 ZIDL_D(long j17);

    public native void ZIDL_F(long j17);

    public void subscribeSessionTimeoutEvent(java.lang.String str, com.tencent.ilink.AppDeviceSession.SessionTimeoutEvent sessionTimeoutEvent) {
        this.sessionTimeoutEventMap.put(str, sessionTimeoutEvent);
    }

    public void unsubscribeSessionTimeoutEvent(java.lang.String str) {
        this.sessionTimeoutEventMap.remove(str);
    }
}
