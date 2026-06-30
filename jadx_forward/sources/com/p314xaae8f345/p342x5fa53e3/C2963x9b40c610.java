package com.p314xaae8f345.p342x5fa53e3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.ilink.ZIDL_AbazQF26K */
/* loaded from: classes16.dex */
public class C2963x9b40c610 {
    private static final java.lang.String TAG = "AuthManagerK";

    /* renamed from: taskId */
    private static final java.util.concurrent.atomic.AtomicLong f10169xcb7ef180 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: GenTaskId */
    public static long m22230x6aa2d0d0() {
        return f10169xcb7ef180.incrementAndGet();
    }

    /* renamed from: ZIDL_AbazQF26D */
    public static native void m22231x9b40c609(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: ZIDL_FX */
    private void m22232x1964d21a(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.DeviceLoginCallback) obj).m22056xdc453139(i17, (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2985x32ea4b51) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2985x32ea4b51.m22586x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_GX */
    private void m22233x1964d239(java.lang.Object obj, int i17, int i18, byte[] bArr) {
        ((com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.LoginCallback) obj).m22062xdc453139(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3003x55515dc0.m22862x382ad972(i17), i18, (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7.m22833x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_HX */
    private void m22234x1964d258(java.lang.Object obj, int i17) {
        ((com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.LogoutCallback) obj).m22063xdc453139(i17);
    }

    /* renamed from: ZIDL_IX */
    private void m22235x1964d277(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.FaceRecognizeConfigCallback) obj).m22059xdc453139(i17, (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2991x97c8c8f1) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2991x97c8c8f1.m22688x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_JX */
    private void m22236x1964d296(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.FaceRecognizeCallback) obj).m22058xdc453139(i17, (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f.m22728x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_KX */
    private void m22237x1964d2b5(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.FaceExtVerifyCallback) obj).m22057xdc453139(i17, (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b.m22651x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_LX */
    private void m22238x1964d2d4(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.GetLoginQrCodeCallback) obj).m22060xdc453139(i17, (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2995xda809a45) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2995xda809a45.m22759x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_MX */
    private void m22239x1964d2f3(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.CheckLoginQrCodeCallback) obj).m22055xdc453139(i17, (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693.m22537x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_NX */
    private void m22240x1964d312(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.GetOAuthCodeCallback) obj).m22061xdc453139(i17, (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552.m22781x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_OX */
    private void m22241x1964d331(java.lang.Object obj, int i17) {
        ((com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.CancelOAuthCallback) obj).m22054xdc453139(i17);
    }

    /* renamed from: ZIDL_A */
    public native void m22242x9db8edf9(long j17, byte[] bArr);

    /* renamed from: ZIDL_AbazQF26C */
    public native void m22243x9b40c608(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);

    /* renamed from: ZIDL_B */
    public native void m22244x9db8edfa(long j17, byte[] bArr);

    /* renamed from: ZIDL_C */
    public native void m22245x9db8edfb(long j17, byte[] bArr);

    /* renamed from: ZIDL_D */
    public native byte[] m22246x9db8edfc(long j17);

    /* renamed from: ZIDL_E */
    public native byte[] m22247x9db8edfd(long j17);

    /* renamed from: ZIDL_FV */
    public native void m22248x1964d218(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_GV */
    public native void m22249x1964d237(long j17, java.lang.Object obj, int i17, byte[] bArr);

    /* renamed from: ZIDL_HV */
    public native void m22250x1964d256(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_IV */
    public native void m22251x1964d275(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_JV */
    public native void m22252x1964d294(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_KV */
    public native void m22253x1964d2b3(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_LV */
    public native void m22254x1964d2d2(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_MV */
    public native void m22255x1964d2f1(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_NV */
    public native void m22256x1964d310(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_OV */
    public native void m22257x1964d32f(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_P */
    public native void m22258x9db8ee08(long j17);

    /* renamed from: ZIDL_Q */
    public native byte[] m22259x9db8ee09(long j17);
}
