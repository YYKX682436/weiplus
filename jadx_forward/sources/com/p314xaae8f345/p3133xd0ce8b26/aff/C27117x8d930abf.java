package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.ZIDL_SoYkO8DQK */
/* loaded from: classes15.dex */
public class C27117x8d930abf {
    private static final java.lang.String TAG = "IlinkAuthKeeperK";

    /* renamed from: taskId */
    private static final java.util.concurrent.atomic.AtomicLong f59252xcb7ef180 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: GenTaskId */
    public static long m110579x6aa2d0d0() {
        return f59252xcb7ef180.incrementAndGet();
    }

    /* renamed from: ZIDL_EX */
    private void m110580x1964d1fb(java.lang.Object obj, int i17, long j17) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.TryAutoLoginCallback) obj).m109169xdc453139(i17, j17);
    }

    /* renamed from: ZIDL_FX */
    private void m110581x1964d21a(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.RequestLoginQrcodeCallback) obj).m109167xdc453139(i17, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
    }

    /* renamed from: ZIDL_GX */
    private void m110582x1964d239(java.lang.Object obj, int i17, int i18) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.CheckLoginQrCodeCallback) obj).m109163xdc453139(i17, i18);
    }

    /* renamed from: ZIDL_HX */
    private void m110583x1964d258(java.lang.Object obj, int i17, long j17) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.LoginCallback) obj).m109165xdc453139(i17, j17);
    }

    /* renamed from: ZIDL_IX */
    private void m110584x1964d277(java.lang.Object obj, int i17) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.LogoutCallback) obj).m109166xdc453139(i17);
    }

    /* renamed from: ZIDL_MU */
    private void m110585x1964d2f0(java.lang.Object obj, long j17, long j18, long j19) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.C2CUploadProgressCallback) obj).m109162x696ee52c(j17, j18, j19);
    }

    /* renamed from: ZIDL_MX */
    private void m110586x1964d2f3(java.lang.Object obj, long j17, byte[] bArr) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.C2CUploadCallback) obj).m109161xdc453139(j17, (com.p314xaae8f345.p3133xd0ce8b26.aff.C27088x1280f34f) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.C27088x1280f34f.m110045x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_OU */
    private void m110587x1964d32e(java.lang.Object obj, long j17, long j18, long j19) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.C2CDownloadProgressCallback) obj).m109160x696ee52c(j17, j18, j19);
    }

    /* renamed from: ZIDL_OX */
    private void m110588x1964d331(java.lang.Object obj, long j17, byte[] bArr) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.C2CDownloadCallback) obj).m109157xdc453139(j17, (com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56.m109841x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_QU */
    private void m110589x1964d36c(java.lang.Object obj, long j17, long j18, long j19) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.C2CDownloadOriginProgressCallback) obj).m109159x696ee52c(j17, j18, j19);
    }

    /* renamed from: ZIDL_QX */
    private void m110590x1964d36f(java.lang.Object obj, long j17, byte[] bArr) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.C2CDownloadOriginCallback) obj).m109158xdc453139(j17, (com.p314xaae8f345.p3133xd0ce8b26.aff.C27078xc657945c) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.C27078xc657945c.m109582x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_SX */
    private void m110591x1964d3ad(java.lang.Object obj, int i17) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.EnsureAuthCallback) obj).m109164xdc453139(i17);
    }

    /* renamed from: ZIDL_A */
    public native void m110592x9db8edf9(long j17, byte[] bArr, int i17, int i18);

    /* renamed from: ZIDL_B */
    public native void m110593x9db8edfa(long j17);

    /* renamed from: ZIDL_D */
    public native void m110594x9db8edfc(long j17, int i17, byte[] bArr);

    /* renamed from: ZIDL_EV */
    public native void m110595x1964d1f9(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_FV */
    public native void m110596x1964d218(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_GV */
    public native void m110597x1964d237(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_HV */
    public native void m110598x1964d256(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_IV */
    public native void m110599x1964d275(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_J */
    public native void m110600x9db8ee02(long j17, int i17, int i18);

    /* renamed from: ZIDL_L */
    public native long m110601x9db8ee04(long j17);

    /* renamed from: ZIDL_MV */
    public native void m110602x1964d2f1(long j17, java.lang.Object obj, java.lang.Object obj2, long j18, byte[] bArr);

    /* renamed from: ZIDL_N */
    public native void m110603x9db8ee06(long j17, long j18);

    /* renamed from: ZIDL_OV */
    public native void m110604x1964d32f(long j17, java.lang.Object obj, java.lang.Object obj2, long j18, byte[] bArr);

    /* renamed from: ZIDL_P */
    public native void m110605x9db8ee08(long j17, long j18);

    /* renamed from: ZIDL_QV */
    public native void m110606x1964d36d(long j17, java.lang.Object obj, java.lang.Object obj2, long j18, byte[] bArr, int i17);

    /* renamed from: ZIDL_R */
    public native void m110607x9db8ee0a(long j17, long j18);

    /* renamed from: ZIDL_SV */
    public native void m110608x1964d3ab(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_SoYkO8DQC */
    public native void m110609x8d930ab7(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2);
}
