package com.tencent.ilink;

/* loaded from: classes15.dex */
public class AppSession extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.ilink.AppSession.Destructor destructor;
    com.tencent.ilink.ZIDL_AbazTeu0K jniCaller = new com.tencent.ilink.ZIDL_AbazTeu0K();

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        private static final java.lang.String TAG = "AppSession.Destructor";
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            com.tencent.wechat.zlog.Zlog.a(TAG, "constructor AppSession Destructor()", new java.lang.Object[0]);
        }

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            com.tencent.wechat.zlog.Zlog.a(TAG, "destructor AppSession Destructor() id:" + this.zidlIdentity + "svrid: " + this.zidlSvrIdentity, new java.lang.Object[0]);
            com.tencent.ilink.ZIDL_AbazTeu0K.ZIDL_AbazTeu0D(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    /* loaded from: classes15.dex */
    public interface SessionTimeoutEvent {
        void event();
    }

    public AppSession(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("ilink2", "ilink2");
        this.jniCaller.ZIDL_AbazTeu0C(this, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public static com.tencent.ilink.AppSession buildZidlObjForHolder(java.lang.String str, java.lang.String str2, long j17) {
        return new com.tencent.ilink.AppSession(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2, j17);
    }

    public java.lang.String appId() {
        return new java.lang.String(this.jniCaller.ZIDL_A(this.nativeHandler), java.nio.charset.StandardCharsets.UTF_8);
    }

    public void disableAppMsgBypass() {
        this.jniCaller.ZIDL_G(this.nativeHandler);
    }

    public com.tencent.ilink.AuthManager getAuthManager() {
        return (com.tencent.ilink.AuthManager) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.jniCaller.ZIDL_C(this.nativeHandler), new com.tencent.ilink.AppDeviceSession$$b());
    }

    public long ident() {
        return this.jniCaller.ZIDL_B(this.nativeHandler);
    }

    public void manualDestroy() {
        this.jniCaller.ZIDL_H(this.nativeHandler);
    }

    public com.tencent.ilink.NetworkManager newNetworkManager() {
        return (com.tencent.ilink.NetworkManager) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.jniCaller.ZIDL_D(this.nativeHandler), new com.tencent.ilink.AppDeviceSession$$a());
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.ilink.AppSession.Destructor destructor = new com.tencent.ilink.AppSession.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public void startSync() {
        this.jniCaller.ZIDL_E(this.nativeHandler);
    }

    public void subscribeSessionTimeoutEvent(java.lang.String str, com.tencent.ilink.AppSession.SessionTimeoutEvent sessionTimeoutEvent) {
        this.jniCaller.subscribeSessionTimeoutEvent(str, sessionTimeoutEvent);
    }

    public void unsubscribeSessionTimeoutEvent(java.lang.String str) {
        this.jniCaller.unsubscribeSessionTimeoutEvent(str);
    }
}
