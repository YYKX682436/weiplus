package com.tencent.ilink;

/* loaded from: classes16.dex */
public class AuthManager extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private com.tencent.ilink.AuthManager.Destructor destructor;
    com.tencent.ilink.ZIDL_AbazQF26K jniCaller = new com.tencent.ilink.ZIDL_AbazQF26K();

    /* loaded from: classes16.dex */
    public interface CancelOAuthCallback {
        void complete(int i17);
    }

    /* loaded from: classes16.dex */
    public interface CheckLoginQrCodeCallback {
        void complete(int i17, com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse ilinkCheckLoginQrCodeResponse);
    }

    /* loaded from: classes16.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        private static final java.lang.String TAG = "AuthManager.Destructor";
        long nativeHandler;
        public java.lang.String zidlIdentity;
        public java.lang.String zidlSvrIdentity;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            com.tencent.wechat.zlog.Zlog.a(TAG, "constructor AuthManager Destructor()", new java.lang.Object[0]);
        }

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            com.tencent.wechat.zlog.Zlog.a(TAG, "destructor AuthManager Destructor() id:" + this.zidlIdentity + "svrid: " + this.zidlSvrIdentity, new java.lang.Object[0]);
            com.tencent.ilink.ZIDL_AbazQF26K.ZIDL_AbazQF26D(this.nativeHandler, this.zidlIdentity, this.zidlSvrIdentity);
        }
    }

    /* loaded from: classes16.dex */
    public interface DeviceLoginCallback {
        void complete(int i17, com.tencent.ilink.auth.IlinkDeviceLoginResponse ilinkDeviceLoginResponse);
    }

    /* loaded from: classes16.dex */
    public interface FaceExtVerifyCallback {
        void complete(int i17, com.tencent.ilink.auth.IlinkFaceExtVerifyResponse ilinkFaceExtVerifyResponse);
    }

    /* loaded from: classes16.dex */
    public interface FaceRecognizeCallback {
        void complete(int i17, com.tencent.ilink.auth.IlinkFaceRecognizeResponse ilinkFaceRecognizeResponse);
    }

    /* loaded from: classes16.dex */
    public interface FaceRecognizeConfigCallback {
        void complete(int i17, com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse ilinkFaceRecognizeConfigResponse);
    }

    /* loaded from: classes16.dex */
    public interface GetLoginQrCodeCallback {
        void complete(int i17, com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse ilinkGetLoginQrCodeResponse);
    }

    /* loaded from: classes16.dex */
    public interface GetOAuthCodeCallback {
        void complete(int i17, com.tencent.ilink.auth.IlinkGetOAuthCodeResponse ilinkGetOAuthCodeResponse);
    }

    /* loaded from: classes16.dex */
    public interface LoginCallback {
        void complete(com.tencent.ilink.auth.IlinkLoginType ilinkLoginType, int i17, com.tencent.ilink.auth.IlinkLoginResponse ilinkLoginResponse);
    }

    /* loaded from: classes16.dex */
    public interface LogoutCallback {
        void complete(int i17);
    }

    public AuthManager(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("ilink2", "ilink2");
        this.jniCaller.ZIDL_AbazQF26C(this, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public static com.tencent.ilink.AuthManager buildZidlObjForHolder(java.lang.String str, java.lang.String str2, long j17) {
        return new com.tencent.ilink.AuthManager(new com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey(), str, str2, j17);
    }

    public void cancelAllTask() {
        this.jniCaller.ZIDL_P(this.nativeHandler);
    }

    public void cancelOAuthAsync(com.tencent.ilink.auth.IlinkCancelOAuthRequest ilinkCancelOAuthRequest, com.tencent.ilink.AuthManager.CancelOAuthCallback cancelOAuthCallback) {
        this.jniCaller.ZIDL_OV(this.nativeHandler, cancelOAuthCallback, ilinkCancelOAuthRequest.toByteArrayOrNull());
    }

    public void checkLoginQrCodeAsync(com.tencent.ilink.AuthManager.CheckLoginQrCodeCallback checkLoginQrCodeCallback) {
        this.jniCaller.ZIDL_MV(this.nativeHandler, checkLoginQrCodeCallback);
    }

    public void deviceLoginAsync(com.tencent.ilink.auth.IlinkDeviceLoginRequest ilinkDeviceLoginRequest, com.tencent.ilink.AuthManager.DeviceLoginCallback deviceLoginCallback) {
        this.jniCaller.ZIDL_FV(this.nativeHandler, deviceLoginCallback, ilinkDeviceLoginRequest.toByteArrayOrNull());
    }

    public void faceExtVerifyAsync(com.tencent.ilink.auth.IlinkFaceExtVerifyRequest ilinkFaceExtVerifyRequest, com.tencent.ilink.AuthManager.FaceExtVerifyCallback faceExtVerifyCallback) {
        this.jniCaller.ZIDL_KV(this.nativeHandler, faceExtVerifyCallback, ilinkFaceExtVerifyRequest.toByteArrayOrNull());
    }

    public void faceRecognizeAsync(com.tencent.ilink.auth.IlinkFaceRecognizeRequest ilinkFaceRecognizeRequest, com.tencent.ilink.AuthManager.FaceRecognizeCallback faceRecognizeCallback) {
        this.jniCaller.ZIDL_JV(this.nativeHandler, faceRecognizeCallback, ilinkFaceRecognizeRequest.toByteArrayOrNull());
    }

    public void faceRecognizeConfigAsync(com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest ilinkFaceRecognizeConfigRequest, com.tencent.ilink.AuthManager.FaceRecognizeConfigCallback faceRecognizeConfigCallback) {
        this.jniCaller.ZIDL_IV(this.nativeHandler, faceRecognizeConfigCallback, ilinkFaceRecognizeConfigRequest.toByteArrayOrNull());
    }

    public byte[] getAuthRawData() {
        return this.jniCaller.ZIDL_Q(this.nativeHandler);
    }

    public void getLoginQrCodeAsync(com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest ilinkGetLoginQrCodeRequest, com.tencent.ilink.AuthManager.GetLoginQrCodeCallback getLoginQrCodeCallback) {
        this.jniCaller.ZIDL_LV(this.nativeHandler, getLoginQrCodeCallback, ilinkGetLoginQrCodeRequest.toByteArrayOrNull());
    }

    public void getOAuthCodeAsync(com.tencent.ilink.auth.IlinkGetOAuthCodeRequest ilinkGetOAuthCodeRequest, com.tencent.ilink.AuthManager.GetOAuthCodeCallback getOAuthCodeCallback) {
        this.jniCaller.ZIDL_NV(this.nativeHandler, getOAuthCodeCallback, ilinkGetOAuthCodeRequest.toByteArrayOrNull());
    }

    public byte[] getSession() {
        return this.jniCaller.ZIDL_D(this.nativeHandler);
    }

    public void init(com.tencent.ilink.base.IlinkAuthConfig ilinkAuthConfig) {
        this.jniCaller.ZIDL_A(this.nativeHandler, ilinkAuthConfig.toByteArrayOrNull());
    }

    public void loginAsync(com.tencent.ilink.auth.IlinkLoginType ilinkLoginType, com.tencent.ilink.auth.IlinkLoginRequest ilinkLoginRequest, com.tencent.ilink.AuthManager.LoginCallback loginCallback) {
        this.jniCaller.ZIDL_GV(this.nativeHandler, loginCallback, ilinkLoginType.getNumber(), ilinkLoginRequest.toByteArrayOrNull());
    }

    public void logoutAsync(com.tencent.ilink.AuthManager.LogoutCallback logoutCallback) {
        this.jniCaller.ZIDL_HV(this.nativeHandler, logoutCallback);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.ilink.AuthManager.Destructor destructor = new com.tencent.ilink.AuthManager.Destructor(this, this.nativeHandler);
        this.destructor = destructor;
        destructor.nativeHandler = this.nativeHandler;
        destructor.zidlIdentity = this.zidlIdentity;
        destructor.zidlSvrIdentity = this.zidlSvrIdentity;
    }

    public void updateIlinkToken(java.lang.String str) {
        this.jniCaller.ZIDL_B(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void updateSession(byte[] bArr) {
        this.jniCaller.ZIDL_C(this.nativeHandler, bArr);
    }

    public com.tencent.ilink.auth.IlinkUserInfo userInfo() {
        return (com.tencent.ilink.auth.IlinkUserInfo) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.auth.IlinkUserInfo.getDefaultInstance(), this.jniCaller.ZIDL_E(this.nativeHandler));
    }
}
