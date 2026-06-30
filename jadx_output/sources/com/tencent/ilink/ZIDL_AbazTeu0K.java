package com.tencent.ilink;

/* loaded from: classes15.dex */
class ZIDL_AbazTeu0K {
    private static final java.lang.String TAG = "AppSessionK";
    private static final java.util.concurrent.atomic.AtomicLong taskId = new java.util.concurrent.atomic.AtomicLong(0);
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.AppSession.SessionTimeoutEvent> sessionTimeoutEventMap = new java.util.concurrent.ConcurrentHashMap<>();

    public static long GenTaskId() {
        return taskId.incrementAndGet();
    }

    public static native void ZIDL_AbazTeu0D(long j17, java.lang.String str, java.lang.String str2);

    private void ZIDL_FI() {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onSessionTimeoutEvent size: " + this.sessionTimeoutEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.AppSession.SessionTimeoutEvent> entry : this.sessionTimeoutEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onSessionTimeoutEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event();
        }
    }

    public native byte[] ZIDL_A(long j17);

    public native void ZIDL_AbazTeu0C(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);

    public native long ZIDL_B(long j17);

    public native com.tencent.wechat.zidl2.ZidlObjHolder2 ZIDL_C(long j17);

    public native com.tencent.wechat.zidl2.ZidlObjHolder2 ZIDL_D(long j17);

    public native void ZIDL_E(long j17);

    public native void ZIDL_G(long j17);

    public native void ZIDL_H(long j17);

    public void subscribeSessionTimeoutEvent(java.lang.String str, com.tencent.ilink.AppSession.SessionTimeoutEvent sessionTimeoutEvent) {
        this.sessionTimeoutEventMap.put(str, sessionTimeoutEvent);
    }

    public void unsubscribeSessionTimeoutEvent(java.lang.String str) {
        this.sessionTimeoutEventMap.remove(str);
    }
}
