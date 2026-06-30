package com.tencent.ilink;

/* loaded from: classes15.dex */
class ZIDL_AbazD3jM7K {
    private static final java.lang.String TAG = "CloudSessionK";
    private static final java.util.concurrent.atomic.AtomicLong taskId = new java.util.concurrent.atomic.AtomicLong(0);
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.CloudSession.SendCloudCgiRequestEvent> sendCloudCgiRequestEventMap = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.CloudSession.CancelCloudCgiRequestEvent> cancelCloudCgiRequestEventMap = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.CloudSession.LoginEvent> loginEventMap = new java.util.concurrent.ConcurrentHashMap<>();

    public static long GenTaskId() {
        return taskId.incrementAndGet();
    }

    public static native void ZIDL_AbazD3jM7D(long j17, java.lang.String str, java.lang.String str2);

    private void ZIDL_BI(byte[] bArr) {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onSendCloudCgiRequestEvent size: " + this.sendCloudCgiRequestEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.CloudSession.SendCloudCgiRequestEvent> entry : this.sendCloudCgiRequestEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onSendCloudCgiRequestEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event((com.tencent.ilink.network.CloudCgiRequest) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.network.CloudCgiRequest.getDefaultInstance(), bArr));
        }
    }

    private void ZIDL_CI(int i17) {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onCancelCloudCgiRequestEvent size: " + this.cancelCloudCgiRequestEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.CloudSession.CancelCloudCgiRequestEvent> entry : this.cancelCloudCgiRequestEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onCancelCloudCgiRequestEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event(i17);
        }
    }

    private void ZIDL_FI() {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onLoginEvent size: " + this.loginEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.CloudSession.LoginEvent> entry : this.loginEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onLoginEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event();
        }
    }

    private void ZIDL_GX(java.lang.Object obj, int i17) {
        ((com.tencent.ilink.CloudSession.LogoutCallback) obj).complete(i17);
    }

    public native void ZIDL_A(long j17, byte[] bArr);

    public native void ZIDL_AbazD3jM7C(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);

    public native void ZIDL_D(long j17, int i17, int i18, byte[] bArr);

    public native void ZIDL_E(long j17, byte[] bArr);

    public native void ZIDL_GV(long j17, java.lang.Object obj);

    public native byte[] ZIDL_H(long j17);

    public native void ZIDL_I(long j17, int i17, byte[] bArr);

    public native com.tencent.wechat.zidl2.ZidlObjHolder2 ZIDL_J(long j17);

    public native void ZIDL_K(long j17);

    public void subscribeCancelCloudCgiRequestEvent(java.lang.String str, com.tencent.ilink.CloudSession.CancelCloudCgiRequestEvent cancelCloudCgiRequestEvent) {
        this.cancelCloudCgiRequestEventMap.put(str, cancelCloudCgiRequestEvent);
    }

    public void subscribeLoginEvent(java.lang.String str, com.tencent.ilink.CloudSession.LoginEvent loginEvent) {
        this.loginEventMap.put(str, loginEvent);
    }

    public void subscribeSendCloudCgiRequestEvent(java.lang.String str, com.tencent.ilink.CloudSession.SendCloudCgiRequestEvent sendCloudCgiRequestEvent) {
        this.sendCloudCgiRequestEventMap.put(str, sendCloudCgiRequestEvent);
    }

    public void unsubscribeCancelCloudCgiRequestEvent(java.lang.String str) {
        this.cancelCloudCgiRequestEventMap.remove(str);
    }

    public void unsubscribeLoginEvent(java.lang.String str) {
        this.loginEventMap.remove(str);
    }

    public void unsubscribeSendCloudCgiRequestEvent(java.lang.String str) {
        this.sendCloudCgiRequestEventMap.remove(str);
    }
}
