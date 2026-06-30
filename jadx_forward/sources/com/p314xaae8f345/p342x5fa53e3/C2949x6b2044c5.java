package com.p314xaae8f345.p342x5fa53e3;

/* renamed from: com.tencent.ilink.AuthManager */
/* loaded from: classes16.dex */
public class C2949x6b2044c5 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.Destructor f10132x5751f3f9;

    /* renamed from: jniCaller */
    com.p314xaae8f345.p342x5fa53e3.C2963x9b40c610 f10133x3163df90 = new com.p314xaae8f345.p342x5fa53e3.C2963x9b40c610();

    /* renamed from: com.tencent.ilink.AuthManager$CancelOAuthCallback */
    /* loaded from: classes16.dex */
    public interface CancelOAuthCallback {
        /* renamed from: complete */
        void m22054xdc453139(int i17);
    }

    /* renamed from: com.tencent.ilink.AuthManager$CheckLoginQrCodeCallback */
    /* loaded from: classes16.dex */
    public interface CheckLoginQrCodeCallback {
        /* renamed from: complete */
        void m22055xdc453139(int i17, com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693 c2983xc39ed693);
    }

    /* renamed from: com.tencent.ilink.AuthManager$Destructor */
    /* loaded from: classes16.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {
        private static final java.lang.String TAG = "AuthManager.Destructor";

        /* renamed from: nativeHandler */
        long f10134xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f10135xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f10136xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "constructor AuthManager Destructor()", new java.lang.Object[0]);
        }

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "destructor AuthManager Destructor() id:" + this.f10135xb1c7f9d5 + "svrid: " + this.f10136xc2e4ffd6, new java.lang.Object[0]);
            com.p314xaae8f345.p342x5fa53e3.C2963x9b40c610.m22231x9b40c609(this.f10134xf042a733, this.f10135xb1c7f9d5, this.f10136xc2e4ffd6);
        }
    }

    /* renamed from: com.tencent.ilink.AuthManager$DeviceLoginCallback */
    /* loaded from: classes16.dex */
    public interface DeviceLoginCallback {
        /* renamed from: complete */
        void m22056xdc453139(int i17, com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2985x32ea4b51 c2985x32ea4b51);
    }

    /* renamed from: com.tencent.ilink.AuthManager$FaceExtVerifyCallback */
    /* loaded from: classes16.dex */
    public interface FaceExtVerifyCallback {
        /* renamed from: complete */
        void m22057xdc453139(int i17, com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b c2989x13a7437b);
    }

    /* renamed from: com.tencent.ilink.AuthManager$FaceRecognizeCallback */
    /* loaded from: classes16.dex */
    public interface FaceRecognizeCallback {
        /* renamed from: complete */
        void m22058xdc453139(int i17, com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f c2993xc42e560f);
    }

    /* renamed from: com.tencent.ilink.AuthManager$FaceRecognizeConfigCallback */
    /* loaded from: classes16.dex */
    public interface FaceRecognizeConfigCallback {
        /* renamed from: complete */
        void m22059xdc453139(int i17, com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2991x97c8c8f1 c2991x97c8c8f1);
    }

    /* renamed from: com.tencent.ilink.AuthManager$GetLoginQrCodeCallback */
    /* loaded from: classes16.dex */
    public interface GetLoginQrCodeCallback {
        /* renamed from: complete */
        void m22060xdc453139(int i17, com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2995xda809a45 c2995xda809a45);
    }

    /* renamed from: com.tencent.ilink.AuthManager$GetOAuthCodeCallback */
    /* loaded from: classes16.dex */
    public interface GetOAuthCodeCallback {
        /* renamed from: complete */
        void m22061xdc453139(int i17, com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552 c2997xddc00552);
    }

    /* renamed from: com.tencent.ilink.AuthManager$LoginCallback */
    /* loaded from: classes16.dex */
    public interface LoginCallback {
        /* renamed from: complete */
        void m22062xdc453139(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3003x55515dc0 enumC3003x55515dc0, int i17, com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7 c3000x821b2fc7);
    }

    /* renamed from: com.tencent.ilink.AuthManager$LogoutCallback */
    /* loaded from: classes16.dex */
    public interface LogoutCallback {
        /* renamed from: complete */
        void m22063xdc453139(int i17);
    }

    public C2949x6b2044c5(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        this.f60635xfca6d453 = j17;
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7.m119551x9cf0d20b().m119552xeb57c8f5("ilink2", "ilink2");
        this.f10133x3163df90.m22243x9b40c608(this, this.f60636x11bb50fe, this.f60638xc2e4ffd6, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5 m22036xa74f78c3(java.lang.String str, java.lang.String str2, long j17) {
        return new com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2, j17);
    }

    /* renamed from: cancelAllTask */
    public void m22037x187f76ec() {
        this.f10133x3163df90.m22258x9db8ee08(this.f60634xf042a733);
    }

    /* renamed from: cancelOAuthAsync */
    public void m22038x9a9e641f(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2981xd65f4c95 c2981xd65f4c95, com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.CancelOAuthCallback cancelOAuthCallback) {
        this.f10133x3163df90.m22257x1964d32f(this.f60634xf042a733, cancelOAuthCallback, c2981xd65f4c95.m75963xebb06ba0());
    }

    /* renamed from: checkLoginQrCodeAsync */
    public void m22039xdff7bd6d(com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.CheckLoginQrCodeCallback checkLoginQrCodeCallback) {
        this.f10133x3163df90.m22255x1964d2f1(this.f60634xf042a733, checkLoginQrCodeCallback);
    }

    /* renamed from: deviceLoginAsync */
    public void m22040x4571e389(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f c2984x1a50997f, com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.DeviceLoginCallback deviceLoginCallback) {
        this.f10133x3163df90.m22248x1964d218(this.f60634xf042a733, deviceLoginCallback, c2984x1a50997f.m75963xebb06ba0());
    }

    /* renamed from: faceExtVerifyAsync */
    public void m22041xa9cad85f(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415 c2988x5b5ef415, com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.FaceExtVerifyCallback faceExtVerifyCallback) {
        this.f10133x3163df90.m22253x1964d2b3(this.f60634xf042a733, faceExtVerifyCallback, c2988x5b5ef415.m75963xebb06ba0());
    }

    /* renamed from: faceRecognizeAsync */
    public void m22042xd3aee4b(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2992xa3213f01 c2992xa3213f01, com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.FaceRecognizeCallback faceRecognizeCallback) {
        this.f10133x3163df90.m22252x1964d294(this.f60634xf042a733, faceRecognizeCallback, c2992xa3213f01.m75963xebb06ba0());
    }

    /* renamed from: faceRecognizeConfigAsync */
    public void m22043xefdfdce9(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df c2990x46dbe7df, com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.FaceRecognizeConfigCallback faceRecognizeConfigCallback) {
        this.f10133x3163df90.m22251x1964d275(this.f60634xf042a733, faceRecognizeConfigCallback, c2990x46dbe7df.m75963xebb06ba0());
    }

    /* renamed from: getAuthRawData */
    public byte[] m22044xea7d9bf4() {
        return this.f10133x3163df90.m22259x9db8ee09(this.f60634xf042a733);
    }

    /* renamed from: getLoginQrCodeAsync */
    public void m22045xe1830bbb(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b c2994x27fa9c0b, com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.GetLoginQrCodeCallback getLoginQrCodeCallback) {
        this.f10133x3163df90.m22254x1964d2d2(this.f60634xf042a733, getLoginQrCodeCallback, c2994x27fa9c0b.m75963xebb06ba0());
    }

    /* renamed from: getOAuthCodeAsync */
    public void m22046xd94c988e(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2996xfecb1b5e c2996xfecb1b5e, com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.GetOAuthCodeCallback getOAuthCodeCallback) {
        this.f10133x3163df90.m22256x1964d310(this.f60634xf042a733, getOAuthCodeCallback, c2996xfecb1b5e.m75963xebb06ba0());
    }

    /* renamed from: getSession */
    public byte[] m22047xb41dbe60() {
        return this.f10133x3163df90.m22246x9db8edfc(this.f60634xf042a733);
    }

    /* renamed from: init */
    public void m22048x316510(com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d c3012x18ed172d) {
        this.f10133x3163df90.m22242x9db8edf9(this.f60634xf042a733, c3012x18ed172d.m75963xebb06ba0());
    }

    /* renamed from: loginAsync */
    public void m22049x962e5c93(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3003x55515dc0 enumC3003x55515dc0, com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 c2999xfbd64e49, com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.LoginCallback loginCallback) {
        this.f10133x3163df90.m22249x1964d237(this.f60634xf042a733, loginCallback, enumC3003x55515dc0.mo11476x276ffe3f(), c2999xfbd64e49.m75963xebb06ba0());
    }

    /* renamed from: logoutAsync */
    public void m22050x6573e312(com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.LogoutCallback logoutCallback) {
        this.f10133x3163df90.m22250x1964d256(this.f60634xf042a733, logoutCallback);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.Destructor destructor = new com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5.Destructor(this, this.f60634xf042a733);
        this.f10132x5751f3f9 = destructor;
        destructor.f10134xf042a733 = this.f60634xf042a733;
        destructor.f10135xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f10136xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: updateIlinkToken */
    public void m22051x842dd97f(java.lang.String str) {
        this.f10133x3163df90.m22244x9db8edfa(this.f60634xf042a733, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    /* renamed from: updateSession */
    public void m22052x1d261d8d(byte[] bArr) {
        this.f10133x3163df90.m22245x9db8edfb(this.f60634xf042a733, bArr);
    }

    /* renamed from: userInfo */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc m22053xf018e719() {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc.m22874x7c90cfc0(), this.f10133x3163df90.m22247x9db8edfd(this.f60634xf042a733));
    }
}
