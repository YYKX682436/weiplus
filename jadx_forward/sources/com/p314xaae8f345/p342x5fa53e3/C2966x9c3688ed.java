package com.p314xaae8f345.p342x5fa53e3;

/* renamed from: com.tencent.ilink.ZIDL_AbazarEPK */
/* loaded from: classes15.dex */
class C2966x9c3688ed {
    private static final java.lang.String TAG = "IlinkLogManagerK";

    /* renamed from: taskId */
    private static final java.util.concurrent.atomic.AtomicLong f10178xcb7ef180 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: writeLogEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2958x76e037ec.WriteLogEvent> f10180x7aa3fe67 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: filterLogEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2958x76e037ec.FilterLogEvent> f10179x4c13812e = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: GenTaskId */
    public static long m22325x6aa2d0d0() {
        return f10178xcb7ef180.incrementAndGet();
    }

    /* renamed from: ZIDL_FI */
    private void m22326x1964d20b(int i17, byte[] bArr, byte[] bArr2, byte[] bArr3, int i18, byte[] bArr4, long j17, long j18, long j19) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onWriteLogEvent size: " + this.f10180x7aa3fe67.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2958x76e037ec.WriteLogEvent> entry : this.f10180x7aa3fe67.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onWriteLogEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().m22131x5c6729a(i17, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8), i18, new java.lang.String(bArr4, java.nio.charset.StandardCharsets.UTF_8), j17, j18, j19);
        }
    }

    /* renamed from: ZIDL_GI */
    private void m22327x1964d22a(int i17, byte[] bArr, byte[] bArr2, byte[] bArr3, int i18, byte[] bArr4, long j17, long j18, long j19) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onFilterLogEvent size: " + this.f10179x4c13812e.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2958x76e037ec.FilterLogEvent> entry : this.f10179x4c13812e.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onFilterLogEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().m22130x5c6729a(i17, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8), i18, new java.lang.String(bArr4, java.nio.charset.StandardCharsets.UTF_8), j17, j18, j19);
        }
    }

    /* renamed from: ZIDL_A */
    public native void m22328x9db8edf9(long j17, byte[] bArr);

    /* renamed from: ZIDL_AbazarEPC */
    public native void m22329x9c3688e5(java.lang.Object obj, java.lang.String str, java.lang.String str2);

    /* renamed from: ZIDL_B */
    public native void m22330x9db8edfa(long j17, byte[] bArr, byte[] bArr2);

    /* renamed from: ZIDL_C */
    public native void m22331x9db8edfb(long j17, int i17, byte[] bArr, byte[] bArr2, byte[] bArr3, int i18, byte[] bArr4, long j18, long j19, long j27);

    /* renamed from: ZIDL_D */
    public native void m22332x9db8edfc(long j17);

    /* renamed from: ZIDL_E */
    public native void m22333x9db8edfd(long j17);

    /* renamed from: subscribeFilterLogEvent */
    public void m22334xd3722138(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2958x76e037ec.FilterLogEvent filterLogEvent) {
        this.f10179x4c13812e.put(str, filterLogEvent);
    }

    /* renamed from: subscribeWriteLogEvent */
    public void m22335x6f06718b(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2958x76e037ec.WriteLogEvent writeLogEvent) {
        this.f10180x7aa3fe67.put(str, writeLogEvent);
    }

    /* renamed from: unsubscribeFilterLogEvent */
    public void m22336x8630b67f(java.lang.String str) {
        this.f10179x4c13812e.remove(str);
    }

    /* renamed from: unsubscribeWriteLogEvent */
    public void m22337x7d0c9764(java.lang.String str) {
        this.f10180x7aa3fe67.remove(str);
    }
}
