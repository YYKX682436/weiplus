package com.p314xaae8f345.p342x5fa53e3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.ilink.ZIDL_AbazXgxoK */
/* loaded from: classes16.dex */
public class C2965x9bb37883 {
    private static final java.lang.String TAG = "NetworkManagerK";

    /* renamed from: taskId */
    private static final java.util.concurrent.atomic.AtomicLong f10172xcb7ef180 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: requestUploadLogEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.RequestUploadLogEvent> f10177x6615c36 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: receiveNotifyEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.ReceiveNotifyEvent> f10175xe09b148e = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: receiveSyncMessageEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.ReceiveSyncMessageEvent> f10176x9297c98b = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: receiveAppMessageEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.ReceiveAppMessageEvent> f10174x995dd6b = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: appSessionTimeoutEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.AppSessionTimeoutEvent> f10173x88cb9aee = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: GenTaskId */
    public static long m22275x6aa2d0d0() {
        return f10172xcb7ef180.incrementAndGet();
    }

    /* renamed from: ZIDL_AX */
    private void m22276x1964d17f(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.SendRequestCallback) obj).m22177xdc453139(i17, bArr);
    }

    /* renamed from: ZIDL_AbazXgxoD */
    public static native void m22277x9bb3787c(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: ZIDL_BX */
    private void m22278x1964d19e(java.lang.Object obj, int i17, byte[] bArr, int i18) {
        ((com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.UpdatePushTokenCallback) obj).m22178xdc453139(i17, bArr, i18);
    }

    /* renamed from: ZIDL_CU */
    private void m22279x1964d1ba(java.lang.Object obj, long j17, long j18) {
        ((com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.C2CUploadProgressCallback) obj).m22171x696ee52c(j17, j18);
    }

    /* renamed from: ZIDL_CX */
    private void m22280x1964d1bd(java.lang.Object obj, byte[] bArr) {
        ((com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.C2CUploadCallback) obj).m22170xdc453139((com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f.m24116x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_DU */
    private void m22281x1964d1d9(java.lang.Object obj, long j17, long j18) {
        ((com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.C2CDownloadProgressCallback) obj).m22169x696ee52c(j17, j18);
    }

    /* renamed from: ZIDL_DX */
    private void m22282x1964d1dc(java.lang.Object obj, byte[] bArr) {
        ((com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.C2CDownloadCallback) obj).m22166xdc453139((com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3039xcdc73c56) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3039xcdc73c56.m23994x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_SI */
    private void m22283x1964d39e(byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onRequestUploadLogEvent size: " + this.f10177x6615c36.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.RequestUploadLogEvent> entry : this.f10177x6615c36.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onRequestUploadLogEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().m22176x5c6729a(bArr);
        }
    }

    /* renamed from: ZIDL_TI */
    private void m22284x1964d3bd(int i17, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onReceiveNotifyEvent size: " + this.f10175xe09b148e.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.ReceiveNotifyEvent> entry : this.f10175xe09b148e.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onReceiveNotifyEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().m22173x5c6729a(i17, bArr);
        }
    }

    /* renamed from: ZIDL_UI */
    private void m22285x1964d3dc(int i17, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onReceiveSyncMessageEvent size: " + this.f10176x9297c98b.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.ReceiveSyncMessageEvent> entry : this.f10176x9297c98b.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onReceiveSyncMessageEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().m22174x5c6729a(i17, bArr);
        }
    }

    /* renamed from: ZIDL_VI */
    private void m22286x1964d3fb(byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onReceiveAppMessageEvent size: " + this.f10174x995dd6b.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.ReceiveAppMessageEvent> entry : this.f10174x995dd6b.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onReceiveAppMessageEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().mo22172x5c6729a((com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3033x6ae4bab4) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3033x6ae4bab4.m23405x7c90cfc0(), bArr));
        }
    }

    /* renamed from: ZIDL_WI */
    private void m22287x1964d41a() {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onAppSessionTimeoutEvent size: " + this.f10173x88cb9aee.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.AppSessionTimeoutEvent> entry : this.f10173x88cb9aee.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onAppSessionTimeoutEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().m22165x5c6729a();
        }
    }

    /* renamed from: ZIDL_XX */
    private void m22288x1964d448(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.RequestCheckResourceCallback) obj).mo22175xdc453139(i17, bArr);
    }

    /* renamed from: ZIDL_YU */
    private void m22289x1964d464(java.lang.Object obj, long j17, long j18) {
        ((com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.C2CDownloadOriginProgressCallback) obj).m22168x696ee52c(j17, j18);
    }

    /* renamed from: ZIDL_YX */
    private void m22290x1964d467(java.lang.Object obj, byte[] bArr) {
        ((com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.C2CDownloadOriginCallback) obj).m22167xdc453139((com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3038xc657945c) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3038xc657945c.m23741x7c90cfc0(), bArr));
    }

    /* renamed from: ZIDL_AB */
    public native void m22291x1964d169(long j17);

    /* renamed from: ZIDL_AV */
    public native void m22292x1964d17d(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_AbazXgxoC */
    public native void m22293x9bb3787b(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);

    /* renamed from: ZIDL_BV */
    public native void m22294x1964d19c(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_CV */
    public native void m22295x1964d1bb(long j17, java.lang.Object obj, java.lang.Object obj2, byte[] bArr);

    /* renamed from: ZIDL_DV */
    public native void m22296x1964d1da(long j17, java.lang.Object obj, java.lang.Object obj2, byte[] bArr);

    /* renamed from: ZIDL_E */
    public native void m22297x9db8edfd(long j17);

    /* renamed from: ZIDL_F */
    public native long m22298x9db8edfe(long j17);

    /* renamed from: ZIDL_G */
    public native long m22299x9db8edff(long j17);

    /* renamed from: ZIDL_H */
    public native long m22300x9db8ee00(long j17);

    /* renamed from: ZIDL_I */
    public native void m22301x9db8ee01(long j17, int[] iArr);

    /* renamed from: ZIDL_J */
    public native void m22302x9db8ee02(long j17, int[] iArr);

    /* renamed from: ZIDL_K */
    public native void m22303x9db8ee03(long j17, int[] iArr);

    /* renamed from: ZIDL_L */
    public native void m22304x9db8ee04(long j17, int[] iArr);

    /* renamed from: ZIDL_M */
    public native void m22305x9db8ee05(long j17, byte[] bArr);

    /* renamed from: ZIDL_N */
    public native void m22306x9db8ee06(long j17, int i17);

    /* renamed from: ZIDL_O */
    public native void m22307x9db8ee07(long j17, byte[] bArr);

    /* renamed from: ZIDL_P */
    public native void m22308x9db8ee08(long j17);

    /* renamed from: ZIDL_Q */
    public native void m22309x9db8ee09(long j17, byte[] bArr, int i17);

    /* renamed from: ZIDL_R */
    public native void m22310x9db8ee0a(long j17, int i17, int i18);

    /* renamed from: ZIDL_XV */
    public native void m22311x1964d446(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_YV */
    public native void m22312x1964d465(long j17, java.lang.Object obj, java.lang.Object obj2, byte[] bArr, int i17);

    /* renamed from: ZIDL_Z */
    public native void m22313x9db8ee12(long j17, byte[] bArr);

    /* renamed from: subscribeAppSessionTimeoutEvent */
    public void m22314xd604d578(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.AppSessionTimeoutEvent appSessionTimeoutEvent) {
        this.f10173x88cb9aee.put(str, appSessionTimeoutEvent);
    }

    /* renamed from: subscribeReceiveAppMessageEvent */
    public void m22315xef84ec1b(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.ReceiveAppMessageEvent receiveAppMessageEvent) {
        this.f10174x995dd6b.put(str, receiveAppMessageEvent);
    }

    /* renamed from: subscribeReceiveNotifyEvent */
    public void m22316xadc44d8(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.ReceiveNotifyEvent receiveNotifyEvent) {
        this.f10175xe09b148e.put(str, receiveNotifyEvent);
    }

    /* renamed from: subscribeReceiveSyncMessageEvent */
    public void m22317x7fb40567(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.ReceiveSyncMessageEvent receiveSyncMessageEvent) {
        this.f10176x9297c98b.put(str, receiveSyncMessageEvent);
    }

    /* renamed from: subscribeRequestUploadLogEvent */
    public void m22318x8e3a481c(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.RequestUploadLogEvent requestUploadLogEvent) {
        this.f10177x6615c36.put(str, requestUploadLogEvent);
    }

    /* renamed from: unsubscribeAppSessionTimeoutEvent */
    public void m22319xde5933bf(java.lang.String str) {
        this.f10173x88cb9aee.remove(str);
    }

    /* renamed from: unsubscribeReceiveAppMessageEvent */
    public void m22320xf7d94a62(java.lang.String str) {
        this.f10174x995dd6b.remove(str);
    }

    /* renamed from: unsubscribeReceiveNotifyEvent */
    public void m22321x6630de9f(java.lang.String str) {
        this.f10175xe09b148e.remove(str);
    }

    /* renamed from: unsubscribeReceiveSyncMessageEvent */
    public void m22322x81eb7000(java.lang.String str) {
        this.f10176x9297c98b.remove(str);
    }

    /* renamed from: unsubscribeRequestUploadLogEvent */
    public void m22323xc84d84f5(java.lang.String str) {
        this.f10177x6615c36.remove(str);
    }
}
