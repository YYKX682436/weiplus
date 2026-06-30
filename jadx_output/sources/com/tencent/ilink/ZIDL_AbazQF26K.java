package com.tencent.ilink;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class ZIDL_AbazQF26K {
    private static final java.lang.String TAG = "AuthManagerK";
    private static final java.util.concurrent.atomic.AtomicLong taskId = new java.util.concurrent.atomic.AtomicLong(0);

    public static long GenTaskId() {
        return taskId.incrementAndGet();
    }

    public static native void ZIDL_AbazQF26D(long j17, java.lang.String str, java.lang.String str2);

    private void ZIDL_FX(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.tencent.ilink.AuthManager.DeviceLoginCallback) obj).complete(i17, (com.tencent.ilink.auth.IlinkDeviceLoginResponse) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.auth.IlinkDeviceLoginResponse.getDefaultInstance(), bArr));
    }

    private void ZIDL_GX(java.lang.Object obj, int i17, int i18, byte[] bArr) {
        ((com.tencent.ilink.AuthManager.LoginCallback) obj).complete(com.tencent.ilink.auth.IlinkLoginType.forNumber(i17), i18, (com.tencent.ilink.auth.IlinkLoginResponse) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.auth.IlinkLoginResponse.getDefaultInstance(), bArr));
    }

    private void ZIDL_HX(java.lang.Object obj, int i17) {
        ((com.tencent.ilink.AuthManager.LogoutCallback) obj).complete(i17);
    }

    private void ZIDL_IX(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.tencent.ilink.AuthManager.FaceRecognizeConfigCallback) obj).complete(i17, (com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.auth.IlinkFaceRecognizeConfigResponse.getDefaultInstance(), bArr));
    }

    private void ZIDL_JX(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.tencent.ilink.AuthManager.FaceRecognizeCallback) obj).complete(i17, (com.tencent.ilink.auth.IlinkFaceRecognizeResponse) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.auth.IlinkFaceRecognizeResponse.getDefaultInstance(), bArr));
    }

    private void ZIDL_KX(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.tencent.ilink.AuthManager.FaceExtVerifyCallback) obj).complete(i17, (com.tencent.ilink.auth.IlinkFaceExtVerifyResponse) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.auth.IlinkFaceExtVerifyResponse.getDefaultInstance(), bArr));
    }

    private void ZIDL_LX(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.tencent.ilink.AuthManager.GetLoginQrCodeCallback) obj).complete(i17, (com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.auth.IlinkGetLoginQrCodeResponse.getDefaultInstance(), bArr));
    }

    private void ZIDL_MX(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.tencent.ilink.AuthManager.CheckLoginQrCodeCallback) obj).complete(i17, (com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse.getDefaultInstance(), bArr));
    }

    private void ZIDL_NX(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.tencent.ilink.AuthManager.GetOAuthCodeCallback) obj).complete(i17, (com.tencent.ilink.auth.IlinkGetOAuthCodeResponse) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.auth.IlinkGetOAuthCodeResponse.getDefaultInstance(), bArr));
    }

    private void ZIDL_OX(java.lang.Object obj, int i17) {
        ((com.tencent.ilink.AuthManager.CancelOAuthCallback) obj).complete(i17);
    }

    public native void ZIDL_A(long j17, byte[] bArr);

    public native void ZIDL_AbazQF26C(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);

    public native void ZIDL_B(long j17, byte[] bArr);

    public native void ZIDL_C(long j17, byte[] bArr);

    public native byte[] ZIDL_D(long j17);

    public native byte[] ZIDL_E(long j17);

    public native void ZIDL_FV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_GV(long j17, java.lang.Object obj, int i17, byte[] bArr);

    public native void ZIDL_HV(long j17, java.lang.Object obj);

    public native void ZIDL_IV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_JV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_KV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_LV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_MV(long j17, java.lang.Object obj);

    public native void ZIDL_NV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_OV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_P(long j17);

    public native byte[] ZIDL_Q(long j17);
}
