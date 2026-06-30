package com.p314xaae8f345.p342x5fa53e3;

/* renamed from: com.tencent.ilink.ZIDL_AbazfhOlK */
/* loaded from: classes15.dex */
class C2967x9c789baa {
    private static final java.lang.String TAG = "AppDeviceSessionK";

    /* renamed from: taskId */
    private static final java.util.concurrent.atomic.AtomicLong f10181xcb7ef180 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: sessionTimeoutEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2945xca5486df.SessionTimeoutEvent> f10182x8cd4336d = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: GenTaskId */
    public static long m22339x6aa2d0d0() {
        return f10181xcb7ef180.incrementAndGet();
    }

    /* renamed from: ZIDL_AbazfhOlD */
    public static native void m22340x9c789ba3(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: ZIDL_EI */
    private void m22341x1964d1ec() {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onSessionTimeoutEvent size: " + this.f10182x8cd4336d.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2945xca5486df.SessionTimeoutEvent> entry : this.f10182x8cd4336d.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onSessionTimeoutEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().m22024x5c6729a();
        }
    }

    /* renamed from: ZIDL_A */
    public native byte[] m22342x9db8edf9(long j17);

    /* renamed from: ZIDL_AbazfhOlC */
    public native void m22343x9c789ba2(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);

    /* renamed from: ZIDL_B */
    public native long m22344x9db8edfa(long j17);

    /* renamed from: ZIDL_C */
    public native com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 m22345x9db8edfb(long j17);

    /* renamed from: ZIDL_D */
    public native com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 m22346x9db8edfc(long j17);

    /* renamed from: ZIDL_F */
    public native void m22347x9db8edfe(long j17);

    /* renamed from: subscribeSessionTimeoutEvent */
    public void m22348x870dd1c5(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2945xca5486df.SessionTimeoutEvent sessionTimeoutEvent) {
        this.f10182x8cd4336d.put(str, sessionTimeoutEvent);
    }

    /* renamed from: unsubscribeSessionTimeoutEvent */
    public void m22349x964c70de(java.lang.String str) {
        this.f10182x8cd4336d.remove(str);
    }
}
