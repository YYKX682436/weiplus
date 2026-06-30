package com.tencent.ilink;

/* loaded from: classes15.dex */
public class CloudSession extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.ilink.CloudSession.Destructor destructor;
    com.tencent.ilink.ZIDL_AbazD3jM7K jniCaller = new com.tencent.ilink.ZIDL_AbazD3jM7K();

    /* loaded from: classes15.dex */
    public interface CancelCloudCgiRequestEvent {
        void event(int i17);
    }

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        private static final java.lang.String TAG = "CloudSession.Destructor";
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            com.tencent.wechat.zlog.Zlog.a(TAG, "constructor CloudSession Destructor()", new java.lang.Object[0]);
        }

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            com.tencent.wechat.zlog.Zlog.a(TAG, "destructor CloudSession Destructor() id:" + this.zidlIdentity + "svrid: " + this.zidlSvrIdentity, new java.lang.Object[0]);
            com.tencent.ilink.ZIDL_AbazD3jM7K.ZIDL_AbazD3jM7D(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    /* loaded from: classes15.dex */
    public interface LoginEvent {
        void event();
    }

    /* loaded from: classes15.dex */
    public interface LogoutCallback {
        void complete(int i17);
    }

    /* loaded from: classes15.dex */
    public interface SendCloudCgiRequestEvent {
        void event(com.tencent.ilink.network.CloudCgiRequest cloudCgiRequest);
    }

    public CloudSession(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("ilink2", "ilink2");
        this.jniCaller.ZIDL_AbazD3jM7C(this, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public static com.tencent.ilink.CloudSession buildZidlObjForHolder(java.lang.String str, java.lang.String str2, long j17) {
        return new com.tencent.ilink.CloudSession(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2, j17);
    }

    public void config(java.lang.String str) {
        this.jniCaller.ZIDL_A(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public byte[] lockToUseCustomAuth() {
        return this.jniCaller.ZIDL_H(this.nativeHandler);
    }

    public void logoutAsync(com.tencent.ilink.CloudSession.LogoutCallback logoutCallback) {
        this.jniCaller.ZIDL_GV(this.nativeHandler, logoutCallback);
    }

    public void manualDestroy() {
        this.jniCaller.ZIDL_K(this.nativeHandler);
    }

    public com.tencent.ilink.NetworkManager newNetworkManager() {
        return (com.tencent.ilink.NetworkManager) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.jniCaller.ZIDL_J(this.nativeHandler), new com.tencent.ilink.AppDeviceSession$$a());
    }

    public void notifyAuthResult(int i17, byte[] bArr) {
        this.jniCaller.ZIDL_I(this.nativeHandler, i17, bArr);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.ilink.CloudSession.Destructor destructor = new com.tencent.ilink.CloudSession.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public void receiveCloudCgiResponse(int i17, int i18, byte[] bArr) {
        this.jniCaller.ZIDL_D(this.nativeHandler, i17, i18, bArr);
    }

    public void receiveCloudNotify(byte[] bArr) {
        this.jniCaller.ZIDL_E(this.nativeHandler, bArr);
    }

    public void subscribeCancelCloudCgiRequestEvent(java.lang.String str, com.tencent.ilink.CloudSession.CancelCloudCgiRequestEvent cancelCloudCgiRequestEvent) {
        this.jniCaller.subscribeCancelCloudCgiRequestEvent(str, cancelCloudCgiRequestEvent);
    }

    public void subscribeLoginEvent(java.lang.String str, com.tencent.ilink.CloudSession.LoginEvent loginEvent) {
        this.jniCaller.subscribeLoginEvent(str, loginEvent);
    }

    public void subscribeSendCloudCgiRequestEvent(java.lang.String str, com.tencent.ilink.CloudSession.SendCloudCgiRequestEvent sendCloudCgiRequestEvent) {
        this.jniCaller.subscribeSendCloudCgiRequestEvent(str, sendCloudCgiRequestEvent);
    }

    public void unsubscribeCancelCloudCgiRequestEvent(java.lang.String str) {
        this.jniCaller.unsubscribeCancelCloudCgiRequestEvent(str);
    }

    public void unsubscribeLoginEvent(java.lang.String str) {
        this.jniCaller.unsubscribeLoginEvent(str);
    }

    public void unsubscribeSendCloudCgiRequestEvent(java.lang.String str) {
        this.jniCaller.unsubscribeSendCloudCgiRequestEvent(str);
    }
}
