package com.p314xaae8f345.p342x5fa53e3;

/* renamed from: com.tencent.ilink.SingletonSession */
/* loaded from: classes15.dex */
public class C2960x75b7d42b extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p342x5fa53e3.C2960x75b7d42b.Destructor f10156x5751f3f9;

    /* renamed from: jniCaller */
    com.p314xaae8f345.p342x5fa53e3.C2968x9cb399a1 f10157x3163df90 = new com.p314xaae8f345.p342x5fa53e3.C2968x9cb399a1();

    /* renamed from: com.tencent.ilink.SingletonSession$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {
        private static final java.lang.String TAG = "SingletonSession.Destructor";

        /* renamed from: nativeHandler */
        long f10158xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f10159xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f10160xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "constructor SingletonSession Destructor()", new java.lang.Object[0]);
        }

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "destructor SingletonSession Destructor() id:" + this.f10159xb1c7f9d5 + "svrid: " + this.f10160xc2e4ffd6, new java.lang.Object[0]);
            com.p314xaae8f345.p342x5fa53e3.C2968x9cb399a1.m22352x9cb3999a(this.f10158xf042a733, this.f10159xb1c7f9d5, this.f10160xc2e4ffd6);
        }
    }

    /* renamed from: com.tencent.ilink.SingletonSession$RequireLoginEvent */
    /* loaded from: classes15.dex */
    public interface RequireLoginEvent {
        /* renamed from: event */
        void m22187x5c6729a(boolean z17);
    }

    public C2960x75b7d42b(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        this.f60635xfca6d453 = j17;
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7.m119551x9cf0d20b().m119552xeb57c8f5("ilink2", "ilink2");
        this.f10157x3163df90.m22355x9cb39999(this, this.f60636x11bb50fe, this.f60638xc2e4ffd6, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p342x5fa53e3.C2960x75b7d42b m22179xa74f78c3(java.lang.String str, java.lang.String str2, long j17) {
        return new com.p314xaae8f345.p342x5fa53e3.C2960x75b7d42b(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2, j17);
    }

    /* renamed from: config */
    public void m22180xaf3f8342(java.lang.String str, boolean z17, com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d c3012x18ed172d) {
        this.f10157x3163df90.m22354x9db8edf9(this.f60634xf042a733, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), z17, c3012x18ed172d.m75963xebb06ba0());
    }

    /* renamed from: login */
    public void m22181x625ef69(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3003x55515dc0 enumC3003x55515dc0, com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 c2999xfbd64e49) {
        this.f10157x3163df90.m22356x9db8edfb(this.f60634xf042a733, enumC3003x55515dc0.mo11476x276ffe3f(), c2999xfbd64e49.m75963xebb06ba0());
    }

    /* renamed from: logout */
    public void m22182xbe98158a() {
        this.f10157x3163df90.m22358x9db8edfd(this.f60634xf042a733);
    }

    /* renamed from: newNetworkManager */
    public com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf m22183xfd0c3b5f() {
        return (com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119600x7553e47d(this.f10157x3163df90.m22359x9db8edfe(this.f60634xf042a733), new com.p314xaae8f345.p342x5fa53e3.C2946x627ba4a2());
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p342x5fa53e3.C2960x75b7d42b.Destructor destructor = new com.p314xaae8f345.p342x5fa53e3.C2960x75b7d42b.Destructor(this, this.f60634xf042a733);
        this.f10156x5751f3f9 = destructor;
        destructor.f10158xf042a733 = this.f60634xf042a733;
        destructor.f10159xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f10160xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: subscribeRequireLoginEvent */
    public void m22184xbd0b4fcc(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2960x75b7d42b.RequireLoginEvent requireLoginEvent) {
        this.f10157x3163df90.m22360xbd0b4fcc(str, requireLoginEvent);
    }

    /* renamed from: unsubscribeRequireLoginEvent */
    public void m22185x6d68e125(java.lang.String str) {
        this.f10157x3163df90.m22361x6d68e125(str);
    }

    /* renamed from: userInfo */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc m22186xf018e719() {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc.m22874x7c90cfc0(), this.f10157x3163df90.m22357x9db8edfc(this.f60634xf042a733));
    }
}
