package com.p314xaae8f345.p342x5fa53e3;

/* renamed from: com.tencent.ilink.AppDeviceSession */
/* loaded from: classes15.dex */
public class C2945xca5486df extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p342x5fa53e3.C2945xca5486df.Destructor f10122x5751f3f9;

    /* renamed from: jniCaller */
    com.p314xaae8f345.p342x5fa53e3.C2967x9c789baa f10123x3163df90 = new com.p314xaae8f345.p342x5fa53e3.C2967x9c789baa();

    /* renamed from: com.tencent.ilink.AppDeviceSession$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {
        private static final java.lang.String TAG = "AppDeviceSession.Destructor";

        /* renamed from: nativeHandler */
        long f10124xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f10125xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f10126xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "constructor AppDeviceSession Destructor()", new java.lang.Object[0]);
        }

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "destructor AppDeviceSession Destructor() id:" + this.f10125xb1c7f9d5 + "svrid: " + this.f10126xc2e4ffd6, new java.lang.Object[0]);
            com.p314xaae8f345.p342x5fa53e3.C2967x9c789baa.m22340x9c789ba3(this.f10124xf042a733, this.f10125xb1c7f9d5, this.f10126xc2e4ffd6);
        }
    }

    /* renamed from: com.tencent.ilink.AppDeviceSession$SessionTimeoutEvent */
    /* loaded from: classes15.dex */
    public interface SessionTimeoutEvent {
        /* renamed from: event */
        void m22024x5c6729a();
    }

    public C2945xca5486df(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        this.f60635xfca6d453 = j17;
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7.m119551x9cf0d20b().m119552xeb57c8f5("ilink2", "ilink2");
        this.f10123x3163df90.m22343x9c789ba2(this, this.f60636x11bb50fe, this.f60638xc2e4ffd6, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p342x5fa53e3.C2945xca5486df m22013xa74f78c3(java.lang.String str, java.lang.String str2, long j17) {
        return new com.p314xaae8f345.p342x5fa53e3.C2945xca5486df(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2, j17);
    }

    /* renamed from: appId */
    public java.lang.String m22014x58b7f1c() {
        return new java.lang.String(this.f10123x3163df90.m22342x9db8edf9(this.f60634xf042a733), java.nio.charset.StandardCharsets.UTF_8);
    }

    /* renamed from: getAuthManager */
    public com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5 m22015xe18ce3af() {
        return (com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119600x7553e47d(this.f10123x3163df90.m22345x9db8edfb(this.f60634xf042a733), new com.p314xaae8f345.p342x5fa53e3.C2947x627ba4a3());
    }

    /* renamed from: ident */
    public long m22016x5f6a1f0() {
        return this.f10123x3163df90.m22344x9db8edfa(this.f60634xf042a733);
    }

    /* renamed from: manualDestroy */
    public void m22017xd8e82554() {
        this.f10123x3163df90.m22347x9db8edfe(this.f60634xf042a733);
    }

    /* renamed from: newNetworkManager */
    public com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf m22018xfd0c3b5f() {
        return (com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119600x7553e47d(this.f10123x3163df90.m22346x9db8edfc(this.f60634xf042a733), new com.p314xaae8f345.p342x5fa53e3.C2946x627ba4a2());
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p342x5fa53e3.C2945xca5486df.Destructor destructor = new com.p314xaae8f345.p342x5fa53e3.C2945xca5486df.Destructor(this, this.f60634xf042a733);
        this.f10122x5751f3f9 = destructor;
        destructor.f10124xf042a733 = this.f60634xf042a733;
        destructor.f10125xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f10126xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: subscribeSessionTimeoutEvent */
    public void m22020x870dd1c5(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2945xca5486df.SessionTimeoutEvent sessionTimeoutEvent) {
        this.f10123x3163df90.m22348x870dd1c5(str, sessionTimeoutEvent);
    }

    /* renamed from: unsubscribeSessionTimeoutEvent */
    public void m22021x964c70de(java.lang.String str) {
        this.f10123x3163df90.m22349x964c70de(str);
    }
}
