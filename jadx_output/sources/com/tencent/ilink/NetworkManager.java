package com.tencent.ilink;

/* loaded from: classes16.dex */
public class NetworkManager extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.ilink.NetworkManager.Destructor destructor;
    com.tencent.ilink.ZIDL_AbazXgxoK jniCaller = new com.tencent.ilink.ZIDL_AbazXgxoK();

    /* loaded from: classes16.dex */
    public interface AppSessionTimeoutEvent {
        void event();
    }

    /* loaded from: classes16.dex */
    public interface C2CDownloadCallback {
        void complete(com.tencent.ilink.network.IlinkC2CDownloadResult ilinkC2CDownloadResult);
    }

    /* loaded from: classes16.dex */
    public interface C2CDownloadOriginCallback {
        void complete(com.tencent.ilink.network.IlinkC2CDownloadOriginResult ilinkC2CDownloadOriginResult);
    }

    /* loaded from: classes15.dex */
    public interface C2CDownloadOriginProgressCallback {
        void onProgress(long j17, long j18);
    }

    /* loaded from: classes15.dex */
    public interface C2CDownloadProgressCallback {
        void onProgress(long j17, long j18);
    }

    /* loaded from: classes16.dex */
    public interface C2CUploadCallback {
        void complete(com.tencent.ilink.network.IlinkC2CUploadResult ilinkC2CUploadResult);
    }

    /* loaded from: classes15.dex */
    public interface C2CUploadProgressCallback {
        void onProgress(long j17, long j18);
    }

    /* loaded from: classes16.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        private static final java.lang.String TAG = "NetworkManager.Destructor";
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            com.tencent.wechat.zlog.Zlog.a(TAG, "constructor NetworkManager Destructor()", new java.lang.Object[0]);
        }

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            com.tencent.wechat.zlog.Zlog.a(TAG, "destructor NetworkManager Destructor() id:" + this.zidlIdentity + "svrid: " + this.zidlSvrIdentity, new java.lang.Object[0]);
            com.tencent.ilink.ZIDL_AbazXgxoK.ZIDL_AbazXgxoD(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    /* loaded from: classes15.dex */
    public interface ReceiveAppMessageEvent {
        void event(com.tencent.ilink.network.IlinkBypassMsgList ilinkBypassMsgList);
    }

    /* loaded from: classes15.dex */
    public interface ReceiveNotifyEvent {
        void event(int i17, byte[] bArr);
    }

    /* loaded from: classes15.dex */
    public interface ReceiveSyncMessageEvent {
        void event(int i17, byte[] bArr);
    }

    /* loaded from: classes15.dex */
    public interface RequestCheckResourceCallback {
        void complete(int i17, byte[] bArr);
    }

    /* loaded from: classes15.dex */
    public interface RequestUploadLogEvent {
        void event(byte[] bArr);
    }

    /* loaded from: classes15.dex */
    public interface SendRequestCallback {
        void complete(int i17, byte[] bArr);
    }

    /* loaded from: classes16.dex */
    public interface UpdatePushTokenCallback {
        void complete(int i17, byte[] bArr, int i18);
    }

    public NetworkManager(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("ilink2", "ilink2");
        this.jniCaller.ZIDL_AbazXgxoC(this, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public static com.tencent.ilink.NetworkManager buildZidlObjForHolder(java.lang.String str, java.lang.String str2, long j17) {
        return new com.tencent.ilink.NetworkManager(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2, j17);
    }

    public void c2CDownloadAsync(com.tencent.ilink.network.IlinkC2CDownload ilinkC2CDownload, com.tencent.ilink.NetworkManager.C2CDownloadProgressCallback c2CDownloadProgressCallback, com.tencent.ilink.NetworkManager.C2CDownloadCallback c2CDownloadCallback) {
        this.jniCaller.ZIDL_DV(this.nativeHandler, c2CDownloadProgressCallback, c2CDownloadCallback, ilinkC2CDownload.toByteArrayOrNull());
    }

    public void c2CDownloadOriginAsync(com.tencent.ilink.network.IlinkC2CDownloadOrigin ilinkC2CDownloadOrigin, int i17, com.tencent.ilink.NetworkManager.C2CDownloadOriginProgressCallback c2CDownloadOriginProgressCallback, com.tencent.ilink.NetworkManager.C2CDownloadOriginCallback c2CDownloadOriginCallback) {
        this.jniCaller.ZIDL_YV(this.nativeHandler, c2CDownloadOriginProgressCallback, c2CDownloadOriginCallback, ilinkC2CDownloadOrigin.toByteArrayOrNull(), i17);
    }

    public void c2CUploadAsync(com.tencent.ilink.network.IlinkC2CUpload ilinkC2CUpload, com.tencent.ilink.NetworkManager.C2CUploadProgressCallback c2CUploadProgressCallback, com.tencent.ilink.NetworkManager.C2CUploadCallback c2CUploadCallback) {
        this.jniCaller.ZIDL_CV(this.nativeHandler, c2CUploadProgressCallback, c2CUploadCallback, ilinkC2CUpload.toByteArrayOrNull());
    }

    public void cancelAllTask() {
        this.jniCaller.ZIDL_E(this.nativeHandler);
    }

    public void cancelC2CTask(java.lang.String str) {
        this.jniCaller.ZIDL_Z(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public long genTaskId() {
        return this.jniCaller.ZIDL_F(this.nativeHandler);
    }

    public void manualDestroy() {
        this.jniCaller.ZIDL_AB(this.nativeHandler);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.ilink.NetworkManager.Destructor destructor = new com.tencent.ilink.NetworkManager.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public long realUin() {
        return this.jniCaller.ZIDL_G(this.nativeHandler);
    }

    public void requestCheckResourceAsync(com.tencent.ilink.network.ResourceRequestInfo resourceRequestInfo, com.tencent.ilink.NetworkManager.RequestCheckResourceCallback requestCheckResourceCallback) {
        this.jniCaller.ZIDL_XV(this.nativeHandler, requestCheckResourceCallback, resourceRequestInfo.toByteArrayOrNull());
    }

    public void requestUploadLog(int i17, int i18) {
        this.jniCaller.ZIDL_R(this.nativeHandler, i17, i18);
    }

    public void sendRequestAsync(com.tencent.ilink.network.IlinkRequestInfo ilinkRequestInfo, com.tencent.ilink.NetworkManager.SendRequestCallback sendRequestCallback) {
        this.jniCaller.ZIDL_AV(this.nativeHandler, sendRequestCallback, ilinkRequestInfo.toByteArrayOrNull());
    }

    public void setSmcBaseInfo(com.tencent.ilink.network.IlinkSmcBaseInfo ilinkSmcBaseInfo) {
        this.jniCaller.ZIDL_M(this.nativeHandler, ilinkSmcBaseInfo.toByteArrayOrNull());
    }

    public void setSmcUin(int i17) {
        this.jniCaller.ZIDL_N(this.nativeHandler, i17);
    }

    public long showUin() {
        return this.jniCaller.ZIDL_H(this.nativeHandler);
    }

    public void smcFlush() {
        this.jniCaller.ZIDL_P(this.nativeHandler);
    }

    public void subscribeAppSessionTimeoutEvent(java.lang.String str, com.tencent.ilink.NetworkManager.AppSessionTimeoutEvent appSessionTimeoutEvent) {
        this.jniCaller.subscribeAppSessionTimeoutEvent(str, appSessionTimeoutEvent);
    }

    public void subscribeNotify(java.util.ArrayList<java.lang.Integer> arrayList) {
        this.jniCaller.ZIDL_I(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.intListToArray(arrayList));
    }

    public void subscribeReceiveAppMessageEvent(java.lang.String str, com.tencent.ilink.NetworkManager.ReceiveAppMessageEvent receiveAppMessageEvent) {
        this.jniCaller.subscribeReceiveAppMessageEvent(str, receiveAppMessageEvent);
    }

    public void subscribeReceiveNotifyEvent(java.lang.String str, com.tencent.ilink.NetworkManager.ReceiveNotifyEvent receiveNotifyEvent) {
        this.jniCaller.subscribeReceiveNotifyEvent(str, receiveNotifyEvent);
    }

    public void subscribeReceiveSyncMessageEvent(java.lang.String str, com.tencent.ilink.NetworkManager.ReceiveSyncMessageEvent receiveSyncMessageEvent) {
        this.jniCaller.subscribeReceiveSyncMessageEvent(str, receiveSyncMessageEvent);
    }

    public void subscribeRequestUploadLogEvent(java.lang.String str, com.tencent.ilink.NetworkManager.RequestUploadLogEvent requestUploadLogEvent) {
        this.jniCaller.subscribeRequestUploadLogEvent(str, requestUploadLogEvent);
    }

    public void subscribeSyncMessage(java.util.ArrayList<java.lang.Integer> arrayList) {
        this.jniCaller.ZIDL_K(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.intListToArray(arrayList));
    }

    public void unsubscribeAppSessionTimeoutEvent(java.lang.String str) {
        this.jniCaller.unsubscribeAppSessionTimeoutEvent(str);
    }

    public void unsubscribeNotify(java.util.ArrayList<java.lang.Integer> arrayList) {
        this.jniCaller.ZIDL_J(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.intListToArray(arrayList));
    }

    public void unsubscribeReceiveAppMessageEvent(java.lang.String str) {
        this.jniCaller.unsubscribeReceiveAppMessageEvent(str);
    }

    public void unsubscribeReceiveNotifyEvent(java.lang.String str) {
        this.jniCaller.unsubscribeReceiveNotifyEvent(str);
    }

    public void unsubscribeReceiveSyncMessageEvent(java.lang.String str) {
        this.jniCaller.unsubscribeReceiveSyncMessageEvent(str);
    }

    public void unsubscribeRequestUploadLogEvent(java.lang.String str) {
        this.jniCaller.unsubscribeRequestUploadLogEvent(str);
    }

    public void unsubscribeSyncMessage(java.util.ArrayList<java.lang.Integer> arrayList) {
        this.jniCaller.ZIDL_L(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.intListToArray(arrayList));
    }

    public void updateAppSession(byte[] bArr, com.tencent.ilink.network.IlinkAppSessionType ilinkAppSessionType) {
        this.jniCaller.ZIDL_Q(this.nativeHandler, bArr, ilinkAppSessionType.getNumber());
    }

    public void updatePushTokenAsync(byte[] bArr, com.tencent.ilink.NetworkManager.UpdatePushTokenCallback updatePushTokenCallback) {
        this.jniCaller.ZIDL_BV(this.nativeHandler, updatePushTokenCallback, bArr);
    }

    public void writeKvData(com.tencent.ilink.network.IlinkKvReportInfo ilinkKvReportInfo) {
        this.jniCaller.ZIDL_O(this.nativeHandler, ilinkKvReportInfo.toByteArrayOrNull());
    }
}
