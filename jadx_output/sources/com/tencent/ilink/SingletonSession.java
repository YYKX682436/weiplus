package com.tencent.ilink;

/* loaded from: classes15.dex */
public class SingletonSession extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.ilink.SingletonSession.Destructor destructor;
    com.tencent.ilink.ZIDL_AbazjmglK jniCaller = new com.tencent.ilink.ZIDL_AbazjmglK();

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        private static final java.lang.String TAG = "SingletonSession.Destructor";
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            com.tencent.wechat.zlog.Zlog.a(TAG, "constructor SingletonSession Destructor()", new java.lang.Object[0]);
        }

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            com.tencent.wechat.zlog.Zlog.a(TAG, "destructor SingletonSession Destructor() id:" + this.zidlIdentity + "svrid: " + this.zidlSvrIdentity, new java.lang.Object[0]);
            com.tencent.ilink.ZIDL_AbazjmglK.ZIDL_AbazjmglD(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    /* loaded from: classes15.dex */
    public interface RequireLoginEvent {
        void event(boolean z17);
    }

    public SingletonSession(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("ilink2", "ilink2");
        this.jniCaller.ZIDL_AbazjmglC(this, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public static com.tencent.ilink.SingletonSession buildZidlObjForHolder(java.lang.String str, java.lang.String str2, long j17) {
        return new com.tencent.ilink.SingletonSession(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2, j17);
    }

    public void config(java.lang.String str, boolean z17, com.tencent.ilink.base.IlinkAuthConfig ilinkAuthConfig) {
        this.jniCaller.ZIDL_A(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), z17, ilinkAuthConfig.toByteArrayOrNull());
    }

    public void login(com.tencent.ilink.auth.IlinkLoginType ilinkLoginType, com.tencent.ilink.auth.IlinkLoginRequest ilinkLoginRequest) {
        this.jniCaller.ZIDL_C(this.nativeHandler, ilinkLoginType.getNumber(), ilinkLoginRequest.toByteArrayOrNull());
    }

    public void logout() {
        this.jniCaller.ZIDL_E(this.nativeHandler);
    }

    public com.tencent.ilink.NetworkManager newNetworkManager() {
        return (com.tencent.ilink.NetworkManager) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.jniCaller.ZIDL_F(this.nativeHandler), new com.tencent.ilink.AppDeviceSession$$a());
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.ilink.SingletonSession.Destructor destructor = new com.tencent.ilink.SingletonSession.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public void subscribeRequireLoginEvent(java.lang.String str, com.tencent.ilink.SingletonSession.RequireLoginEvent requireLoginEvent) {
        this.jniCaller.subscribeRequireLoginEvent(str, requireLoginEvent);
    }

    public void unsubscribeRequireLoginEvent(java.lang.String str) {
        this.jniCaller.unsubscribeRequireLoginEvent(str);
    }

    public com.tencent.ilink.auth.IlinkUserInfo userInfo() {
        return (com.tencent.ilink.auth.IlinkUserInfo) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.auth.IlinkUserInfo.getDefaultInstance(), this.jniCaller.ZIDL_D(this.nativeHandler));
    }
}
