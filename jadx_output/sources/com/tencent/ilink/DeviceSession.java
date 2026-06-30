package com.tencent.ilink;

/* loaded from: classes15.dex */
public class DeviceSession extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.ilink.DeviceSession.Destructor destructor;
    com.tencent.ilink.ZIDL_AbazB1X2oK jniCaller = new com.tencent.ilink.ZIDL_AbazB1X2oK();

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        private static final java.lang.String TAG = "DeviceSession.Destructor";
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            com.tencent.wechat.zlog.Zlog.a(TAG, "constructor DeviceSession Destructor()", new java.lang.Object[0]);
        }

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            com.tencent.wechat.zlog.Zlog.a(TAG, "destructor DeviceSession Destructor() id:" + this.zidlIdentity + "svrid: " + this.zidlSvrIdentity, new java.lang.Object[0]);
            com.tencent.ilink.ZIDL_AbazB1X2oK.ZIDL_AbazB1X2oD(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    /* loaded from: classes15.dex */
    public interface LonglinkConnectedEvent {
        void event();
    }

    /* loaded from: classes15.dex */
    public interface LonglinkDisconnectedEvent {
        void event();
    }

    /* loaded from: classes15.dex */
    public interface SessionTimeoutEvent {
        void event();
    }

    public DeviceSession(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("ilink2", "ilink2");
        this.jniCaller.ZIDL_AbazB1X2oC(this, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public static com.tencent.ilink.DeviceSession buildZidlObjForHolder(java.lang.String str, java.lang.String str2, long j17) {
        return new com.tencent.ilink.DeviceSession(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2, j17);
    }

    public com.tencent.ilink.AuthManager getAuthManager() {
        return (com.tencent.ilink.AuthManager) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.jniCaller.ZIDL_B(this.nativeHandler), new com.tencent.ilink.AppDeviceSession$$b());
    }

    public long ident() {
        return this.jniCaller.ZIDL_A(this.nativeHandler);
    }

    public void manualDestroy() {
        this.jniCaller.ZIDL_I(this.nativeHandler);
    }

    public com.tencent.ilink.NetworkManager newNetworkManager() {
        return (com.tencent.ilink.NetworkManager) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.jniCaller.ZIDL_C(this.nativeHandler), new com.tencent.ilink.AppDeviceSession$$a());
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.ilink.DeviceSession.Destructor destructor = new com.tencent.ilink.DeviceSession.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public void startSync() {
        this.jniCaller.ZIDL_D(this.nativeHandler);
    }

    public void subscribeLonglinkConnectedEvent(java.lang.String str, com.tencent.ilink.DeviceSession.LonglinkConnectedEvent longlinkConnectedEvent) {
        this.jniCaller.subscribeLonglinkConnectedEvent(str, longlinkConnectedEvent);
    }

    public void subscribeLonglinkDisconnectedEvent(java.lang.String str, com.tencent.ilink.DeviceSession.LonglinkDisconnectedEvent longlinkDisconnectedEvent) {
        this.jniCaller.subscribeLonglinkDisconnectedEvent(str, longlinkDisconnectedEvent);
    }

    public void subscribeSessionTimeoutEvent(java.lang.String str, com.tencent.ilink.DeviceSession.SessionTimeoutEvent sessionTimeoutEvent) {
        this.jniCaller.subscribeSessionTimeoutEvent(str, sessionTimeoutEvent);
    }

    public void unsubscribeLonglinkConnectedEvent(java.lang.String str) {
        this.jniCaller.unsubscribeLonglinkConnectedEvent(str);
    }

    public void unsubscribeLonglinkDisconnectedEvent(java.lang.String str) {
        this.jniCaller.unsubscribeLonglinkDisconnectedEvent(str);
    }

    public void unsubscribeSessionTimeoutEvent(java.lang.String str) {
        this.jniCaller.unsubscribeSessionTimeoutEvent(str);
    }

    public void updateSession(byte[] bArr) {
        this.jniCaller.ZIDL_E(this.nativeHandler, bArr);
    }
}
