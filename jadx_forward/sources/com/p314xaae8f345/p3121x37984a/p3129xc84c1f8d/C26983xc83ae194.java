package com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d;

/* renamed from: com.tencent.wcdb.repair.BackupKit */
/* loaded from: classes12.dex */
public class C26983xc83ae194 implements com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.OnCancelListener {

    /* renamed from: FLAG_FIX_CORRUPTION */
    public static final int f58378x24aa2298 = 4;

    /* renamed from: FLAG_INCREMENTAL */
    public static final int f58379x769e9f67 = 16;

    /* renamed from: FLAG_NO_CIPHER */
    public static final int f58380xcb9a1d36 = 1;

    /* renamed from: FLAG_NO_COMPRESS */
    public static final int f58381x8644ffcd = 2;

    /* renamed from: FLAG_NO_CREATE_TABLE */
    public static final int f58382x29bf8596 = 8;

    /* renamed from: RESULT_CANCELED */
    public static final int f58383x14383a7b = 1;

    /* renamed from: RESULT_FAILED */
    public static final int f58384x122f5e9f = -1;

    /* renamed from: RESULT_OK */
    public static final int f58385x39a4613e = 0;
    static final java.lang.String TAG = "WCDB.DBBackup";
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 mDB;

    /* renamed from: mLastError */
    private java.lang.String f58386xf148c725 = null;

    /* renamed from: mNativePtr */
    private long f58387x3e9ea96a;

    /* renamed from: mStatementCount */
    private int f58388xf55bcead;

    /* renamed from: mTableDesc */
    private java.lang.String[] f58389x4296192;

    public C26983xc83ae194(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, byte[] bArr, int i17, java.lang.String[] strArr) {
        this.mDB = c26948xabb259c7;
        this.f58389x4296192 = strArr != null ? (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length) : null;
        if (str == null) {
            throw new java.lang.IllegalArgumentException();
        }
        long m107921xb90145c7 = m107921xb90145c7(str, bArr, i17);
        this.f58387x3e9ea96a = m107921xb90145c7;
        if (m107921xb90145c7 == 0) {
            throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183("Failed initialize backup context.");
        }
    }

    /* renamed from: nativeCancel */
    private static native void m107919x72d4bd71(long j17);

    /* renamed from: nativeFinish */
    private static native void m107920x78641b8a(long j17);

    /* renamed from: nativeInit */
    private static native long m107921xb90145c7(java.lang.String str, byte[] bArr, int i17);

    /* renamed from: nativeLastError */
    private static native java.lang.String m107922x5cf476bb(long j17);

    /* renamed from: nativeRun */
    private static native int m107923xc3e766f4(long j17, long j18, java.lang.String[] strArr);

    /* renamed from: nativeStatementCount */
    private static native int m107924xbc9c6cd7(long j17);

    /* renamed from: finalize */
    public void m107925xd764dc1e() {
        m107927x41012807();
        super.finalize();
    }

    /* renamed from: lastError */
    public java.lang.String m107926x76917d12() {
        return this.f58386xf148c725;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.OnCancelListener
    /* renamed from: onCancel */
    public void mo82492x3d6f0539() {
        long j17 = this.f58387x3e9ea96a;
        if (j17 != 0) {
            m107919x72d4bd71(j17);
        }
    }

    /* renamed from: release */
    public void m107927x41012807() {
        long j17 = this.f58387x3e9ea96a;
        if (j17 != 0) {
            m107920x78641b8a(j17);
            this.f58387x3e9ea96a = 0L;
        }
    }

    public int run() {
        if (this.f58387x3e9ea96a != 0) {
            long m107657x12386953 = this.mDB.m107657x12386953("backup", false, false);
            int m107923xc3e766f4 = m107923xc3e766f4(this.f58387x3e9ea96a, m107657x12386953, this.f58389x4296192);
            this.mDB.m107714x63db387c(m107657x12386953, null);
            this.f58388xf55bcead = m107924xbc9c6cd7(this.f58387x3e9ea96a);
            this.f58386xf148c725 = m107922x5cf476bb(this.f58387x3e9ea96a);
            m107920x78641b8a(this.f58387x3e9ea96a);
            this.f58387x3e9ea96a = 0L;
            return m107923xc3e766f4;
        }
        throw new java.lang.IllegalStateException("BackupKit not initialized.");
    }

    /* renamed from: statementCount */
    public int m107928xeea8c4e0() {
        return this.f58388xf55bcead;
    }

    public int run(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (c26987xeef691ab.m108008xc9602be3()) {
            return 1;
        }
        c26987xeef691ab.m108009x57c2e18f(this);
        int run = run();
        c26987xeef691ab.m108009x57c2e18f(null);
        return run;
    }
}
