package com.p314xaae8f345.p342x5fa53e3;

/* renamed from: com.tencent.ilink.AppSession */
/* loaded from: classes15.dex */
public class C2948x30a30555 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p342x5fa53e3.C2948x30a30555.Destructor f10127x5751f3f9;

    /* renamed from: jniCaller */
    com.p314xaae8f345.p342x5fa53e3.C2964x9b7a1edd f10128x3163df90 = new com.p314xaae8f345.p342x5fa53e3.C2964x9b7a1edd();

    /* renamed from: com.tencent.ilink.AppSession$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {
        private static final java.lang.String TAG = "AppSession.Destructor";

        /* renamed from: nativeHandler */
        long f10129xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f10130xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f10131xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "constructor AppSession Destructor()", new java.lang.Object[0]);
        }

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "destructor AppSession Destructor() id:" + this.f10130xb1c7f9d5 + "svrid: " + this.f10131xc2e4ffd6, new java.lang.Object[0]);
            com.p314xaae8f345.p342x5fa53e3.C2964x9b7a1edd.m22262x9b7a1ed6(this.f10129xf042a733, this.f10130xb1c7f9d5, this.f10131xc2e4ffd6);
        }
    }

    /* renamed from: com.tencent.ilink.AppSession$SessionTimeoutEvent */
    /* loaded from: classes15.dex */
    public interface SessionTimeoutEvent {
        /* renamed from: event */
        void m22035x5c6729a();
    }

    public C2948x30a30555(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        this.f60635xfca6d453 = j17;
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7.m119551x9cf0d20b().m119552xeb57c8f5("ilink2", "ilink2");
        this.f10128x3163df90.m22265x9b7a1ed5(this, this.f60636x11bb50fe, this.f60638xc2e4ffd6, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p342x5fa53e3.C2948x30a30555 m22025xa74f78c3(java.lang.String str, java.lang.String str2, long j17) {
        return new com.p314xaae8f345.p342x5fa53e3.C2948x30a30555(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2, j17);
    }

    /* renamed from: appId */
    public java.lang.String m22026x58b7f1c() {
        return new java.lang.String(this.f10128x3163df90.m22264x9db8edf9(this.f60634xf042a733), java.nio.charset.StandardCharsets.UTF_8);
    }

    /* renamed from: disableAppMsgBypass */
    public void m22027x6f5f71b0() {
        this.f10128x3163df90.m22270x9db8edff(this.f60634xf042a733);
    }

    /* renamed from: getAuthManager */
    public com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5 m22028xe18ce3af() {
        return (com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119600x7553e47d(this.f10128x3163df90.m22267x9db8edfb(this.f60634xf042a733), new com.p314xaae8f345.p342x5fa53e3.C2947x627ba4a3());
    }

    /* renamed from: ident */
    public long m22029x5f6a1f0() {
        return this.f10128x3163df90.m22266x9db8edfa(this.f60634xf042a733);
    }

    /* renamed from: manualDestroy */
    public void m22030xd8e82554() {
        this.f10128x3163df90.m22271x9db8ee00(this.f60634xf042a733);
    }

    /* renamed from: newNetworkManager */
    public com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf m22031xfd0c3b5f() {
        return (com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119600x7553e47d(this.f10128x3163df90.m22268x9db8edfc(this.f60634xf042a733), new com.p314xaae8f345.p342x5fa53e3.C2946x627ba4a2());
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p342x5fa53e3.C2948x30a30555.Destructor destructor = new com.p314xaae8f345.p342x5fa53e3.C2948x30a30555.Destructor(this, this.f60634xf042a733);
        this.f10127x5751f3f9 = destructor;
        destructor.f10129xf042a733 = this.f60634xf042a733;
        destructor.f10130xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f10131xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: startSync */
    public void m22032x8115521d() {
        this.f10128x3163df90.m22269x9db8edfd(this.f60634xf042a733);
    }

    /* renamed from: subscribeSessionTimeoutEvent */
    public void m22033x870dd1c5(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2948x30a30555.SessionTimeoutEvent sessionTimeoutEvent) {
        this.f10128x3163df90.m22272x870dd1c5(str, sessionTimeoutEvent);
    }

    /* renamed from: unsubscribeSessionTimeoutEvent */
    public void m22034x964c70de(java.lang.String str) {
        this.f10128x3163df90.m22273x964c70de(str);
    }
}
