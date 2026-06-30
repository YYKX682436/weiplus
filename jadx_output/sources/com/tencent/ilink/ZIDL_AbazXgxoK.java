package com.tencent.ilink;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class ZIDL_AbazXgxoK {
    private static final java.lang.String TAG = "NetworkManagerK";
    private static final java.util.concurrent.atomic.AtomicLong taskId = new java.util.concurrent.atomic.AtomicLong(0);
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.NetworkManager.RequestUploadLogEvent> requestUploadLogEventMap = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.NetworkManager.ReceiveNotifyEvent> receiveNotifyEventMap = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.NetworkManager.ReceiveSyncMessageEvent> receiveSyncMessageEventMap = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.NetworkManager.ReceiveAppMessageEvent> receiveAppMessageEventMap = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.NetworkManager.AppSessionTimeoutEvent> appSessionTimeoutEventMap = new java.util.concurrent.ConcurrentHashMap<>();

    public static long GenTaskId() {
        return taskId.incrementAndGet();
    }

    private void ZIDL_AX(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.tencent.ilink.NetworkManager.SendRequestCallback) obj).complete(i17, bArr);
    }

    public static native void ZIDL_AbazXgxoD(long j17, java.lang.String str, java.lang.String str2);

    private void ZIDL_BX(java.lang.Object obj, int i17, byte[] bArr, int i18) {
        ((com.tencent.ilink.NetworkManager.UpdatePushTokenCallback) obj).complete(i17, bArr, i18);
    }

    private void ZIDL_CU(java.lang.Object obj, long j17, long j18) {
        ((com.tencent.ilink.NetworkManager.C2CUploadProgressCallback) obj).onProgress(j17, j18);
    }

    private void ZIDL_CX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.ilink.NetworkManager.C2CUploadCallback) obj).complete((com.tencent.ilink.network.IlinkC2CUploadResult) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.network.IlinkC2CUploadResult.getDefaultInstance(), bArr));
    }

    private void ZIDL_DU(java.lang.Object obj, long j17, long j18) {
        ((com.tencent.ilink.NetworkManager.C2CDownloadProgressCallback) obj).onProgress(j17, j18);
    }

    private void ZIDL_DX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.ilink.NetworkManager.C2CDownloadCallback) obj).complete((com.tencent.ilink.network.IlinkC2CDownloadResult) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.network.IlinkC2CDownloadResult.getDefaultInstance(), bArr));
    }

    private void ZIDL_SI(byte[] bArr) {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onRequestUploadLogEvent size: " + this.requestUploadLogEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.NetworkManager.RequestUploadLogEvent> entry : this.requestUploadLogEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onRequestUploadLogEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event(bArr);
        }
    }

    private void ZIDL_TI(int i17, byte[] bArr) {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onReceiveNotifyEvent size: " + this.receiveNotifyEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.NetworkManager.ReceiveNotifyEvent> entry : this.receiveNotifyEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onReceiveNotifyEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event(i17, bArr);
        }
    }

    private void ZIDL_UI(int i17, byte[] bArr) {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onReceiveSyncMessageEvent size: " + this.receiveSyncMessageEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.NetworkManager.ReceiveSyncMessageEvent> entry : this.receiveSyncMessageEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onReceiveSyncMessageEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event(i17, bArr);
        }
    }

    private void ZIDL_VI(byte[] bArr) {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onReceiveAppMessageEvent size: " + this.receiveAppMessageEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.NetworkManager.ReceiveAppMessageEvent> entry : this.receiveAppMessageEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onReceiveAppMessageEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event((com.tencent.ilink.network.IlinkBypassMsgList) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.network.IlinkBypassMsgList.getDefaultInstance(), bArr));
        }
    }

    private void ZIDL_WI() {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onAppSessionTimeoutEvent size: " + this.appSessionTimeoutEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.NetworkManager.AppSessionTimeoutEvent> entry : this.appSessionTimeoutEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onAppSessionTimeoutEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event();
        }
    }

    private void ZIDL_XX(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.tencent.ilink.NetworkManager.RequestCheckResourceCallback) obj).complete(i17, bArr);
    }

    private void ZIDL_YU(java.lang.Object obj, long j17, long j18) {
        ((com.tencent.ilink.NetworkManager.C2CDownloadOriginProgressCallback) obj).onProgress(j17, j18);
    }

    private void ZIDL_YX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.ilink.NetworkManager.C2CDownloadOriginCallback) obj).complete((com.tencent.ilink.network.IlinkC2CDownloadOriginResult) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.network.IlinkC2CDownloadOriginResult.getDefaultInstance(), bArr));
    }

    public native void ZIDL_AB(long j17);

    public native void ZIDL_AV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_AbazXgxoC(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);

    public native void ZIDL_BV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_CV(long j17, java.lang.Object obj, java.lang.Object obj2, byte[] bArr);

    public native void ZIDL_DV(long j17, java.lang.Object obj, java.lang.Object obj2, byte[] bArr);

    public native void ZIDL_E(long j17);

    public native long ZIDL_F(long j17);

    public native long ZIDL_G(long j17);

    public native long ZIDL_H(long j17);

    public native void ZIDL_I(long j17, int[] iArr);

    public native void ZIDL_J(long j17, int[] iArr);

    public native void ZIDL_K(long j17, int[] iArr);

    public native void ZIDL_L(long j17, int[] iArr);

    public native void ZIDL_M(long j17, byte[] bArr);

    public native void ZIDL_N(long j17, int i17);

    public native void ZIDL_O(long j17, byte[] bArr);

    public native void ZIDL_P(long j17);

    public native void ZIDL_Q(long j17, byte[] bArr, int i17);

    public native void ZIDL_R(long j17, int i17, int i18);

    public native void ZIDL_XV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_YV(long j17, java.lang.Object obj, java.lang.Object obj2, byte[] bArr, int i17);

    public native void ZIDL_Z(long j17, byte[] bArr);

    public void subscribeAppSessionTimeoutEvent(java.lang.String str, com.tencent.ilink.NetworkManager.AppSessionTimeoutEvent appSessionTimeoutEvent) {
        this.appSessionTimeoutEventMap.put(str, appSessionTimeoutEvent);
    }

    public void subscribeReceiveAppMessageEvent(java.lang.String str, com.tencent.ilink.NetworkManager.ReceiveAppMessageEvent receiveAppMessageEvent) {
        this.receiveAppMessageEventMap.put(str, receiveAppMessageEvent);
    }

    public void subscribeReceiveNotifyEvent(java.lang.String str, com.tencent.ilink.NetworkManager.ReceiveNotifyEvent receiveNotifyEvent) {
        this.receiveNotifyEventMap.put(str, receiveNotifyEvent);
    }

    public void subscribeReceiveSyncMessageEvent(java.lang.String str, com.tencent.ilink.NetworkManager.ReceiveSyncMessageEvent receiveSyncMessageEvent) {
        this.receiveSyncMessageEventMap.put(str, receiveSyncMessageEvent);
    }

    public void subscribeRequestUploadLogEvent(java.lang.String str, com.tencent.ilink.NetworkManager.RequestUploadLogEvent requestUploadLogEvent) {
        this.requestUploadLogEventMap.put(str, requestUploadLogEvent);
    }

    public void unsubscribeAppSessionTimeoutEvent(java.lang.String str) {
        this.appSessionTimeoutEventMap.remove(str);
    }

    public void unsubscribeReceiveAppMessageEvent(java.lang.String str) {
        this.receiveAppMessageEventMap.remove(str);
    }

    public void unsubscribeReceiveNotifyEvent(java.lang.String str) {
        this.receiveNotifyEventMap.remove(str);
    }

    public void unsubscribeReceiveSyncMessageEvent(java.lang.String str) {
        this.receiveSyncMessageEventMap.remove(str);
    }

    public void unsubscribeRequestUploadLogEvent(java.lang.String str) {
        this.requestUploadLogEventMap.remove(str);
    }
}
