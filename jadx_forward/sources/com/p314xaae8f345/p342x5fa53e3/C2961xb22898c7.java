package com.p314xaae8f345.p342x5fa53e3;

/* renamed from: com.tencent.ilink.ZIDL_AbazB1X2oK */
/* loaded from: classes15.dex */
class C2961xb22898c7 {
    private static final java.lang.String TAG = "DeviceSessionK";

    /* renamed from: taskId */
    private static final java.util.concurrent.atomic.AtomicLong f10161xcb7ef180 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: sessionTimeoutEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2951x63447f40.SessionTimeoutEvent> f10164x8cd4336d = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: longlinkConnectedEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2951x63447f40.LonglinkConnectedEvent> f10162x63b45cb5 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: longlinkDisconnectedEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2951x63447f40.LonglinkDisconnectedEvent> f10163x19f5953 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: GenTaskId */
    public static long m22189x6aa2d0d0() {
        return f10161xcb7ef180.incrementAndGet();
    }

    /* renamed from: ZIDL_AbazB1X2oD */
    public static native void m22190xb22898c0(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: ZIDL_FI */
    private void m22191x1964d20b() {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onSessionTimeoutEvent size: " + this.f10164x8cd4336d.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2951x63447f40.SessionTimeoutEvent> entry : this.f10164x8cd4336d.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onSessionTimeoutEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().m22098x5c6729a();
        }
    }

    /* renamed from: ZIDL_GI */
    private void m22192x1964d22a() {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onLonglinkConnectedEvent size: " + this.f10162x63b45cb5.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2951x63447f40.LonglinkConnectedEvent> entry : this.f10162x63b45cb5.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onLonglinkConnectedEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().m22096x5c6729a();
        }
    }

    /* renamed from: ZIDL_HI */
    private void m22193x1964d249() {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onLonglinkDisconnectedEvent size: " + this.f10163x19f5953.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2951x63447f40.LonglinkDisconnectedEvent> entry : this.f10163x19f5953.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onLonglinkDisconnectedEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().m22097x5c6729a();
        }
    }

    /* renamed from: ZIDL_A */
    public native long m22194x9db8edf9(long j17);

    /* renamed from: ZIDL_AbazB1X2oC */
    public native void m22195xb22898bf(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);

    /* renamed from: ZIDL_B */
    public native com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 m22196x9db8edfa(long j17);

    /* renamed from: ZIDL_C */
    public native com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 m22197x9db8edfb(long j17);

    /* renamed from: ZIDL_D */
    public native void m22198x9db8edfc(long j17);

    /* renamed from: ZIDL_E */
    public native void m22199x9db8edfd(long j17, byte[] bArr);

    /* renamed from: ZIDL_I */
    public native void m22200x9db8ee01(long j17);

    /* renamed from: subscribeLonglinkConnectedEvent */
    public void m22201xf835c111(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2951x63447f40.LonglinkConnectedEvent longlinkConnectedEvent) {
        this.f10162x63b45cb5.put(str, longlinkConnectedEvent);
    }

    /* renamed from: subscribeLonglinkDisconnectedEvent */
    public void m22202xaaa74d1f(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2951x63447f40.LonglinkDisconnectedEvent longlinkDisconnectedEvent) {
        this.f10163x19f5953.put(str, longlinkDisconnectedEvent);
    }

    /* renamed from: subscribeSessionTimeoutEvent */
    public void m22203x870dd1c5(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2951x63447f40.SessionTimeoutEvent sessionTimeoutEvent) {
        this.f10164x8cd4336d.put(str, sessionTimeoutEvent);
    }

    /* renamed from: unsubscribeLonglinkConnectedEvent */
    public void m22204x8a1f58(java.lang.String str) {
        this.f10162x63b45cb5.remove(str);
    }

    /* renamed from: unsubscribeLonglinkDisconnectedEvent */
    public void m22205xfcae7578(java.lang.String str) {
        this.f10163x19f5953.remove(str);
    }

    /* renamed from: unsubscribeSessionTimeoutEvent */
    public void m22206x964c70de(java.lang.String str) {
        this.f10164x8cd4336d.remove(str);
    }
}
