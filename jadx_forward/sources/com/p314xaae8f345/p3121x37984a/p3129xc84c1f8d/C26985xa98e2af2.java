package com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d;

/* renamed from: com.tencent.wcdb.repair.RecoverKit */
/* loaded from: classes12.dex */
public class C26985xa98e2af2 implements com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.OnCancelListener {

    /* renamed from: RESULT_CANCELED */
    public static final int f58390x14383a7b = 1;

    /* renamed from: RESULT_FAILED */
    public static final int f58391x122f5e9f = -1;

    /* renamed from: RESULT_OK */
    public static final int f58392x39a4613e = 0;
    static final java.lang.String TAG = "WCDB.DBBackup";
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 mDB;

    /* renamed from: mFailedCount */
    private int f58393xbd6efc25;

    /* renamed from: mLastError */
    private java.lang.String f58394xf148c725 = null;

    /* renamed from: mNativePtr */
    private long f58395x3e9ea96a;

    /* renamed from: mSuccessCount */
    private int f58396x6f2ac3d9;

    public C26985xa98e2af2(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, byte[] bArr) {
        this.mDB = c26948xabb259c7;
        long m107940xb90145c7 = m107940xb90145c7(str, bArr);
        this.f58395x3e9ea96a = m107940xb90145c7;
        if (m107940xb90145c7 == 0) {
            throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183("Failed initialize recover context.");
        }
    }

    /* renamed from: nativeCancel */
    private static native void m107937x72d4bd71(long j17);

    /* renamed from: nativeFailureCount */
    private static native int m107938x4af6cf5c(long j17);

    /* renamed from: nativeFinish */
    private static native void m107939x78641b8a(long j17);

    /* renamed from: nativeInit */
    private static native long m107940xb90145c7(java.lang.String str, byte[] bArr);

    /* renamed from: nativeLastError */
    private static native java.lang.String m107941x5cf476bb(long j17);

    /* renamed from: nativeRun */
    private static native int m107942xc3e766f4(long j17, long j18, boolean z17);

    /* renamed from: nativeSuccessCount */
    private static native int m107943x2f70e483(long j17);

    /* renamed from: failureCount */
    public int m107944xf31b95a5() {
        return this.f58393xbd6efc25;
    }

    /* renamed from: finalize */
    public void m107945xd764dc1e() {
        m107947x41012807();
        super.finalize();
    }

    /* renamed from: lastError */
    public java.lang.String m107946x76917d12() {
        return this.f58394xf148c725;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.OnCancelListener
    /* renamed from: onCancel */
    public void mo82492x3d6f0539() {
        long j17 = this.f58395x3e9ea96a;
        if (j17 != 0) {
            m107937x72d4bd71(j17);
        }
    }

    /* renamed from: release */
    public void m107947x41012807() {
        long j17 = this.f58395x3e9ea96a;
        if (j17 != 0) {
            m107939x78641b8a(j17);
            this.f58395x3e9ea96a = 0L;
        }
    }

    public int run(boolean z17) {
        if (this.f58395x3e9ea96a != 0) {
            long m107657x12386953 = this.mDB.m107657x12386953("recover", false, false);
            int m107942xc3e766f4 = m107942xc3e766f4(this.f58395x3e9ea96a, m107657x12386953, z17);
            this.mDB.m107714x63db387c(m107657x12386953, null);
            this.f58396x6f2ac3d9 = m107943x2f70e483(this.f58395x3e9ea96a);
            this.f58393xbd6efc25 = m107938x4af6cf5c(this.f58395x3e9ea96a);
            this.f58394xf148c725 = m107941x5cf476bb(this.f58395x3e9ea96a);
            m107939x78641b8a(this.f58395x3e9ea96a);
            this.f58395x3e9ea96a = 0L;
            return m107942xc3e766f4;
        }
        throw new java.lang.IllegalStateException("RecoverKit not initialized.");
    }

    /* renamed from: successCount */
    public int m107948xd795aacc() {
        return this.f58396x6f2ac3d9;
    }

    public int run(boolean z17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (c26987xeef691ab.m108008xc9602be3()) {
            return 1;
        }
        c26987xeef691ab.m108009x57c2e18f(this);
        int run = run(z17);
        c26987xeef691ab.m108009x57c2e18f(null);
        return run;
    }
}
