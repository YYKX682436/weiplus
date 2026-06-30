package com.p314xaae8f345.p342x5fa53e3;

/* renamed from: com.tencent.ilink.ZIDL_AbazD3jM7K */
/* loaded from: classes15.dex */
class C2962xb5b70648 {
    private static final java.lang.String TAG = "CloudSessionK";

    /* renamed from: taskId */
    private static final java.util.concurrent.atomic.AtomicLong f10165xcb7ef180 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: sendCloudCgiRequestEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.SendCloudCgiRequestEvent> f10168x6794b739 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: cancelCloudCgiRequestEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.CancelCloudCgiRequestEvent> f10166xb8bfa807 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: loginEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.LoginEvent> f10167xd94656eb = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: GenTaskId */
    public static long m22208x6aa2d0d0() {
        return f10165xcb7ef180.incrementAndGet();
    }

    /* renamed from: ZIDL_AbazD3jM7D */
    public static native void m22209xb5b70641(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: ZIDL_BI */
    private void m22210x1964d18f(byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onSendCloudCgiRequestEvent size: " + this.f10168x6794b739.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.SendCloudCgiRequestEvent> entry : this.f10168x6794b739.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onSendCloudCgiRequestEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().mo22082x5c6729a((com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f.m23105x7c90cfc0(), bArr));
        }
    }

    /* renamed from: ZIDL_CI */
    private void m22211x1964d1ae(int i17) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onCancelCloudCgiRequestEvent size: " + this.f10166xb8bfa807.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.CancelCloudCgiRequestEvent> entry : this.f10166xb8bfa807.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onCancelCloudCgiRequestEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().m22079x5c6729a(i17);
        }
    }

    /* renamed from: ZIDL_FI */
    private void m22212x1964d20b() {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onLoginEvent size: " + this.f10167xd94656eb.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.LoginEvent> entry : this.f10167xd94656eb.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onLoginEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().m22080x5c6729a();
        }
    }

    /* renamed from: ZIDL_GX */
    private void m22213x1964d239(java.lang.Object obj, int i17) {
        ((com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.LogoutCallback) obj).mo22081xdc453139(i17);
    }

    /* renamed from: ZIDL_A */
    public native void m22214x9db8edf9(long j17, byte[] bArr);

    /* renamed from: ZIDL_AbazD3jM7C */
    public native void m22215xb5b70640(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);

    /* renamed from: ZIDL_D */
    public native void m22216x9db8edfc(long j17, int i17, int i18, byte[] bArr);

    /* renamed from: ZIDL_E */
    public native void m22217x9db8edfd(long j17, byte[] bArr);

    /* renamed from: ZIDL_GV */
    public native void m22218x1964d237(long j17, java.lang.Object obj);

    /* renamed from: ZIDL_H */
    public native byte[] m22219x9db8ee00(long j17);

    /* renamed from: ZIDL_I */
    public native void m22220x9db8ee01(long j17, int i17, byte[] bArr);

    /* renamed from: ZIDL_J */
    public native com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 m22221x9db8ee02(long j17);

    /* renamed from: ZIDL_K */
    public native void m22222x9db8ee03(long j17);

    /* renamed from: subscribeCancelCloudCgiRequestEvent */
    public void m22223xb5b381ff(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.CancelCloudCgiRequestEvent cancelCloudCgiRequestEvent) {
        this.f10166xb8bfa807.put(str, cancelCloudCgiRequestEvent);
    }

    /* renamed from: subscribeLoginEvent */
    public void m22224x5594f19b(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.LoginEvent loginEvent) {
        this.f10167xd94656eb.put(str, loginEvent);
    }

    /* renamed from: subscribeSendCloudCgiRequestEvent */
    public void m22225x84f5428d(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1.SendCloudCgiRequestEvent sendCloudCgiRequestEvent) {
        this.f10168x6794b739.put(str, sendCloudCgiRequestEvent);
    }

    /* renamed from: unsubscribeCancelCloudCgiRequestEvent */
    public void m22226xa49164c6(java.lang.String str) {
        this.f10166xb8bfa807.remove(str);
    }

    /* renamed from: unsubscribeLoginEvent */
    public void m22227x9f074262(java.lang.String str) {
        this.f10167xd94656eb.remove(str);
    }

    /* renamed from: unsubscribeSendCloudCgiRequestEvent */
    public void m22228xc9ab2b14(java.lang.String str) {
        this.f10168x6794b739.remove(str);
    }
}
