package com.p314xaae8f345.p342x5fa53e3;

/* renamed from: com.tencent.ilink.CloudSession */
/* loaded from: classes15.dex */
public class C2950xf0971ac1 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.Destructor f10137x5751f3f9;

    /* renamed from: jniCaller */
    com.p314xaae8f345.p342x5fa53e3.C2962xb5b70648 f10138x3163df90 = new com.p314xaae8f345.p342x5fa53e3.C2962xb5b70648();

    /* renamed from: com.tencent.ilink.CloudSession$CancelCloudCgiRequestEvent */
    /* loaded from: classes15.dex */
    public interface CancelCloudCgiRequestEvent {
        /* renamed from: event */
        void m22079x5c6729a(int i17);
    }

    /* renamed from: com.tencent.ilink.CloudSession$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {
        private static final java.lang.String TAG = "CloudSession.Destructor";

        /* renamed from: nativeHandler */
        long f10139xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f10140xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f10141xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "constructor CloudSession Destructor()", new java.lang.Object[0]);
        }

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "destructor CloudSession Destructor() id:" + this.f10140xb1c7f9d5 + "svrid: " + this.f10141xc2e4ffd6, new java.lang.Object[0]);
            com.p314xaae8f345.p342x5fa53e3.C2962xb5b70648.m22209xb5b70641(this.f10139xf042a733, this.f10140xb1c7f9d5, this.f10141xc2e4ffd6);
        }
    }

    /* renamed from: com.tencent.ilink.CloudSession$LoginEvent */
    /* loaded from: classes15.dex */
    public interface LoginEvent {
        /* renamed from: event */
        void m22080x5c6729a();
    }

    /* renamed from: com.tencent.ilink.CloudSession$LogoutCallback */
    /* loaded from: classes15.dex */
    public interface LogoutCallback {
        /* renamed from: complete */
        void mo22081xdc453139(int i17);
    }

    /* renamed from: com.tencent.ilink.CloudSession$SendCloudCgiRequestEvent */
    /* loaded from: classes15.dex */
    public interface SendCloudCgiRequestEvent {
        /* renamed from: event */
        void mo22082x5c6729a(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f c3017xbcf84e3f);
    }

    public C2950xf0971ac1(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        this.f60635xfca6d453 = j17;
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7.m119551x9cf0d20b().m119552xeb57c8f5("ilink2", "ilink2");
        this.f10138x3163df90.m22215xb5b70640(this, this.f60636x11bb50fe, this.f60638xc2e4ffd6, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1 m22064xa74f78c3(java.lang.String str, java.lang.String str2, long j17) {
        return new com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2, j17);
    }

    /* renamed from: config */
    public void m22065xaf3f8342(java.lang.String str) {
        this.f10138x3163df90.m22214x9db8edf9(this.f60634xf042a733, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    /* renamed from: lockToUseCustomAuth */
    public byte[] m22066x60ffba3a() {
        return this.f10138x3163df90.m22219x9db8ee00(this.f60634xf042a733);
    }

    /* renamed from: logoutAsync */
    public void m22067x6573e312(com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.LogoutCallback logoutCallback) {
        this.f10138x3163df90.m22218x1964d237(this.f60634xf042a733, logoutCallback);
    }

    /* renamed from: manualDestroy */
    public void m22068xd8e82554() {
        this.f10138x3163df90.m22222x9db8ee03(this.f60634xf042a733);
    }

    /* renamed from: newNetworkManager */
    public com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf m22069xfd0c3b5f() {
        return (com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119600x7553e47d(this.f10138x3163df90.m22221x9db8ee02(this.f60634xf042a733), new com.p314xaae8f345.p342x5fa53e3.C2946x627ba4a2());
    }

    /* renamed from: notifyAuthResult */
    public void m22070x6b1d600e(int i17, byte[] bArr) {
        this.f10138x3163df90.m22220x9db8ee01(this.f60634xf042a733, i17, bArr);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.Destructor destructor = new com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.Destructor(this, this.f60634xf042a733);
        this.f10137x5751f3f9 = destructor;
        destructor.f10139xf042a733 = this.f60634xf042a733;
        destructor.f10140xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f10141xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: receiveCloudCgiResponse */
    public void m22071xd377b74(int i17, int i18, byte[] bArr) {
        this.f10138x3163df90.m22216x9db8edfc(this.f60634xf042a733, i17, i18, bArr);
    }

    /* renamed from: receiveCloudNotify */
    public void m22072xa82fbefb(byte[] bArr) {
        this.f10138x3163df90.m22217x9db8edfd(this.f60634xf042a733, bArr);
    }

    /* renamed from: subscribeCancelCloudCgiRequestEvent */
    public void m22073xb5b381ff(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.CancelCloudCgiRequestEvent cancelCloudCgiRequestEvent) {
        this.f10138x3163df90.m22223xb5b381ff(str, cancelCloudCgiRequestEvent);
    }

    /* renamed from: subscribeLoginEvent */
    public void m22074x5594f19b(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.LoginEvent loginEvent) {
        this.f10138x3163df90.m22224x5594f19b(str, loginEvent);
    }

    /* renamed from: subscribeSendCloudCgiRequestEvent */
    public void m22075x84f5428d(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.SendCloudCgiRequestEvent sendCloudCgiRequestEvent) {
        this.f10138x3163df90.m22225x84f5428d(str, sendCloudCgiRequestEvent);
    }

    /* renamed from: unsubscribeCancelCloudCgiRequestEvent */
    public void m22076xa49164c6(java.lang.String str) {
        this.f10138x3163df90.m22226xa49164c6(str);
    }

    /* renamed from: unsubscribeLoginEvent */
    public void m22077x9f074262(java.lang.String str) {
        this.f10138x3163df90.m22227x9f074262(str);
    }

    /* renamed from: unsubscribeSendCloudCgiRequestEvent */
    public void m22078xc9ab2b14(java.lang.String str) {
        this.f10138x3163df90.m22228xc9ab2b14(str);
    }
}
