package com.p314xaae8f345.p342x5fa53e3;

/* renamed from: com.tencent.ilink.ZIDL_AbazjmglK */
/* loaded from: classes15.dex */
class C2968x9cb399a1 {
    private static final java.lang.String TAG = "SingletonSessionK";

    /* renamed from: taskId */
    private static final java.util.concurrent.atomic.AtomicLong f10183xcb7ef180 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: requireLoginEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2960x75b7d42b.RequireLoginEvent> f10184x9a40b186 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: GenTaskId */
    public static long m22351x6aa2d0d0() {
        return f10183xcb7ef180.incrementAndGet();
    }

    /* renamed from: ZIDL_AbazjmglD */
    public static native void m22352x9cb3999a(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: ZIDL_BI */
    private void m22353x1964d18f(boolean z17) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onRequireLoginEvent size: " + this.f10184x9a40b186.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2960x75b7d42b.RequireLoginEvent> entry : this.f10184x9a40b186.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onRequireLoginEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().m22187x5c6729a(z17);
        }
    }

    /* renamed from: ZIDL_A */
    public native void m22354x9db8edf9(long j17, byte[] bArr, boolean z17, byte[] bArr2);

    /* renamed from: ZIDL_AbazjmglC */
    public native void m22355x9cb39999(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);

    /* renamed from: ZIDL_C */
    public native void m22356x9db8edfb(long j17, int i17, byte[] bArr);

    /* renamed from: ZIDL_D */
    public native byte[] m22357x9db8edfc(long j17);

    /* renamed from: ZIDL_E */
    public native void m22358x9db8edfd(long j17);

    /* renamed from: ZIDL_F */
    public native com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 m22359x9db8edfe(long j17);

    /* renamed from: subscribeRequireLoginEvent */
    public void m22360xbd0b4fcc(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2960x75b7d42b.RequireLoginEvent requireLoginEvent) {
        this.f10184x9a40b186.put(str, requireLoginEvent);
    }

    /* renamed from: unsubscribeRequireLoginEvent */
    public void m22361x6d68e125(java.lang.String str) {
        this.f10184x9a40b186.remove(str);
    }
}
