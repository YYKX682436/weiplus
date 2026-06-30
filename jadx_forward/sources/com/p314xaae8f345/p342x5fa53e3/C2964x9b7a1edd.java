package com.p314xaae8f345.p342x5fa53e3;

/* renamed from: com.tencent.ilink.ZIDL_AbazTeu0K */
/* loaded from: classes15.dex */
class C2964x9b7a1edd {
    private static final java.lang.String TAG = "AppSessionK";

    /* renamed from: taskId */
    private static final java.util.concurrent.atomic.AtomicLong f10170xcb7ef180 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: sessionTimeoutEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2948x30a30555.SessionTimeoutEvent> f10171x8cd4336d = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: GenTaskId */
    public static long m22261x6aa2d0d0() {
        return f10170xcb7ef180.incrementAndGet();
    }

    /* renamed from: ZIDL_AbazTeu0D */
    public static native void m22262x9b7a1ed6(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: ZIDL_FI */
    private void m22263x1964d20b() {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onSessionTimeoutEvent size: " + this.f10171x8cd4336d.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2948x30a30555.SessionTimeoutEvent> entry : this.f10171x8cd4336d.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onSessionTimeoutEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().m22035x5c6729a();
        }
    }

    /* renamed from: ZIDL_A */
    public native byte[] m22264x9db8edf9(long j17);

    /* renamed from: ZIDL_AbazTeu0C */
    public native void m22265x9b7a1ed5(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);

    /* renamed from: ZIDL_B */
    public native long m22266x9db8edfa(long j17);

    /* renamed from: ZIDL_C */
    public native com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 m22267x9db8edfb(long j17);

    /* renamed from: ZIDL_D */
    public native com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 m22268x9db8edfc(long j17);

    /* renamed from: ZIDL_E */
    public native void m22269x9db8edfd(long j17);

    /* renamed from: ZIDL_G */
    public native void m22270x9db8edff(long j17);

    /* renamed from: ZIDL_H */
    public native void m22271x9db8ee00(long j17);

    /* renamed from: subscribeSessionTimeoutEvent */
    public void m22272x870dd1c5(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2948x30a30555.SessionTimeoutEvent sessionTimeoutEvent) {
        this.f10171x8cd4336d.put(str, sessionTimeoutEvent);
    }

    /* renamed from: unsubscribeSessionTimeoutEvent */
    public void m22273x964c70de(java.lang.String str) {
        this.f10171x8cd4336d.remove(str);
    }
}
