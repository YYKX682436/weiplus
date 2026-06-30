package com.tencent.ilink;

/* loaded from: classes15.dex */
class ZIDL_AbazjmglK {
    private static final java.lang.String TAG = "SingletonSessionK";
    private static final java.util.concurrent.atomic.AtomicLong taskId = new java.util.concurrent.atomic.AtomicLong(0);
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.SingletonSession.RequireLoginEvent> requireLoginEventMap = new java.util.concurrent.ConcurrentHashMap<>();

    public static long GenTaskId() {
        return taskId.incrementAndGet();
    }

    public static native void ZIDL_AbazjmglD(long j17, java.lang.String str, java.lang.String str2);

    private void ZIDL_BI(boolean z17) {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onRequireLoginEvent size: " + this.requireLoginEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.SingletonSession.RequireLoginEvent> entry : this.requireLoginEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onRequireLoginEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event(z17);
        }
    }

    public native void ZIDL_A(long j17, byte[] bArr, boolean z17, byte[] bArr2);

    public native void ZIDL_AbazjmglC(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);

    public native void ZIDL_C(long j17, int i17, byte[] bArr);

    public native byte[] ZIDL_D(long j17);

    public native void ZIDL_E(long j17);

    public native com.tencent.wechat.zidl2.ZidlObjHolder2 ZIDL_F(long j17);

    public void subscribeRequireLoginEvent(java.lang.String str, com.tencent.ilink.SingletonSession.RequireLoginEvent requireLoginEvent) {
        this.requireLoginEventMap.put(str, requireLoginEvent);
    }

    public void unsubscribeRequireLoginEvent(java.lang.String str) {
        this.requireLoginEventMap.remove(str);
    }
}
