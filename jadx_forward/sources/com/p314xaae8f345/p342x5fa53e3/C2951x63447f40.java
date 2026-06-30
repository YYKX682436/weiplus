package com.p314xaae8f345.p342x5fa53e3;

/* renamed from: com.tencent.ilink.DeviceSession */
/* loaded from: classes15.dex */
public class C2951x63447f40 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p342x5fa53e3.C2951x63447f40.Destructor f10142x5751f3f9;

    /* renamed from: jniCaller */
    com.p314xaae8f345.p342x5fa53e3.C2961xb22898c7 f10143x3163df90 = new com.p314xaae8f345.p342x5fa53e3.C2961xb22898c7();

    /* renamed from: com.tencent.ilink.DeviceSession$Destructor */
    /* loaded from: classes15.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {
        private static final java.lang.String TAG = "DeviceSession.Destructor";

        /* renamed from: nativeHandler */
        long f10144xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f10145xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f10146xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "constructor DeviceSession Destructor()", new java.lang.Object[0]);
        }

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "destructor DeviceSession Destructor() id:" + this.f10145xb1c7f9d5 + "svrid: " + this.f10146xc2e4ffd6, new java.lang.Object[0]);
            com.p314xaae8f345.p342x5fa53e3.C2961xb22898c7.m22190xb22898c0(this.f10144xf042a733, this.f10145xb1c7f9d5, this.f10146xc2e4ffd6);
        }
    }

    /* renamed from: com.tencent.ilink.DeviceSession$LonglinkConnectedEvent */
    /* loaded from: classes15.dex */
    public interface LonglinkConnectedEvent {
        /* renamed from: event */
        void m22096x5c6729a();
    }

    /* renamed from: com.tencent.ilink.DeviceSession$LonglinkDisconnectedEvent */
    /* loaded from: classes15.dex */
    public interface LonglinkDisconnectedEvent {
        /* renamed from: event */
        void m22097x5c6729a();
    }

    /* renamed from: com.tencent.ilink.DeviceSession$SessionTimeoutEvent */
    /* loaded from: classes15.dex */
    public interface SessionTimeoutEvent {
        /* renamed from: event */
        void m22098x5c6729a();
    }

    public C2951x63447f40(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        this.f60635xfca6d453 = j17;
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7.m119551x9cf0d20b().m119552xeb57c8f5("ilink2", "ilink2");
        this.f10143x3163df90.m22195xb22898bf(this, this.f60636x11bb50fe, this.f60638xc2e4ffd6, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p342x5fa53e3.C2951x63447f40 m22083xa74f78c3(java.lang.String str, java.lang.String str2, long j17) {
        return new com.p314xaae8f345.p342x5fa53e3.C2951x63447f40(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2, j17);
    }

    /* renamed from: getAuthManager */
    public com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5 m22084xe18ce3af() {
        return (com.p314xaae8f345.p342x5fa53e3.C2949x6b2044c5) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119600x7553e47d(this.f10143x3163df90.m22196x9db8edfa(this.f60634xf042a733), new com.p314xaae8f345.p342x5fa53e3.C2947x627ba4a3());
    }

    /* renamed from: ident */
    public long m22085x5f6a1f0() {
        return this.f10143x3163df90.m22194x9db8edf9(this.f60634xf042a733);
    }

    /* renamed from: manualDestroy */
    public void m22086xd8e82554() {
        this.f10143x3163df90.m22200x9db8ee01(this.f60634xf042a733);
    }

    /* renamed from: newNetworkManager */
    public com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf m22087xfd0c3b5f() {
        return (com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119600x7553e47d(this.f10143x3163df90.m22197x9db8edfb(this.f60634xf042a733), new com.p314xaae8f345.p342x5fa53e3.C2946x627ba4a2());
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p342x5fa53e3.C2951x63447f40.Destructor destructor = new com.p314xaae8f345.p342x5fa53e3.C2951x63447f40.Destructor(this, this.f60634xf042a733);
        this.f10142x5751f3f9 = destructor;
        destructor.f10144xf042a733 = this.f60634xf042a733;
        destructor.f10145xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f10146xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: startSync */
    public void m22088x8115521d() {
        this.f10143x3163df90.m22198x9db8edfc(this.f60634xf042a733);
    }

    /* renamed from: subscribeLonglinkConnectedEvent */
    public void m22089xf835c111(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2951x63447f40.LonglinkConnectedEvent longlinkConnectedEvent) {
        this.f10143x3163df90.m22201xf835c111(str, longlinkConnectedEvent);
    }

    /* renamed from: subscribeLonglinkDisconnectedEvent */
    public void m22090xaaa74d1f(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2951x63447f40.LonglinkDisconnectedEvent longlinkDisconnectedEvent) {
        this.f10143x3163df90.m22202xaaa74d1f(str, longlinkDisconnectedEvent);
    }

    /* renamed from: subscribeSessionTimeoutEvent */
    public void m22091x870dd1c5(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2951x63447f40.SessionTimeoutEvent sessionTimeoutEvent) {
        this.f10143x3163df90.m22203x870dd1c5(str, sessionTimeoutEvent);
    }

    /* renamed from: unsubscribeLonglinkConnectedEvent */
    public void m22092x8a1f58(java.lang.String str) {
        this.f10143x3163df90.m22204x8a1f58(str);
    }

    /* renamed from: unsubscribeLonglinkDisconnectedEvent */
    public void m22093xfcae7578(java.lang.String str) {
        this.f10143x3163df90.m22205xfcae7578(str);
    }

    /* renamed from: unsubscribeSessionTimeoutEvent */
    public void m22094x964c70de(java.lang.String str) {
        this.f10143x3163df90.m22206x964c70de(str);
    }

    /* renamed from: updateSession */
    public void m22095x1d261d8d(byte[] bArr) {
        this.f10143x3163df90.m22199x9db8edfd(this.f60634xf042a733, bArr);
    }
}
