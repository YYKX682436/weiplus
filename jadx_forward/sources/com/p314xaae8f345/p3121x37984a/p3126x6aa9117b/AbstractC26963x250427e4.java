package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteOpenHelper */
/* loaded from: classes12.dex */
public abstract class AbstractC26963x250427e4 {

    /* renamed from: DEBUG_STRICT_READONLY */
    private static final boolean f58304x1cbaccec = false;
    private static final java.lang.String TAG = "WCDB.SQLiteOpenHelper";

    /* renamed from: mCipher */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 f58305xfe580cd8;

    /* renamed from: mContext */
    private final android.content.Context f58306xd6cfe882;

    /* renamed from: mDatabase */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 f58307x8fa6b908;

    /* renamed from: mEnableWriteAheadLogging */
    private boolean f58308x1235d56d;

    /* renamed from: mErrorHandler */
    private final com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d f58309xcfad5d2f;

    /* renamed from: mFactory */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory f58310x5d03e3dd;

    /* renamed from: mForcedSingleConnection */
    private boolean f58311xdbf0570c;

    /* renamed from: mIsInitializing */
    private boolean f58312xc1794064;

    /* renamed from: mMode */
    private int f58313x624afb0;

    /* renamed from: mName */
    private final java.lang.String f58314x624f098;

    /* renamed from: mNeedMode */
    private boolean f58315x5893a2e6;

    /* renamed from: mNewVersion */
    private final int f58316x1499ef65;

    /* renamed from: mPassword */
    private byte[] f58317x6d876228;

    static {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26961x60ffeeef.m107775x141073bf();
    }

    public AbstractC26963x250427e4(android.content.Context context, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, int i17) {
        this(context, str, cursorFactory, i17, null);
    }

    /* renamed from: getDatabaseLocked */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107779x3309b55b(boolean z17) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107634xfef9b1e5;
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f58307x8fa6b908;
        if (c26948xabb259c7 != null) {
            if (!c26948xabb259c7.m107697xb9a70294()) {
                this.f58307x8fa6b908 = null;
            } else if (!z17 || !this.f58307x8fa6b908.m107698x9cffd9ac()) {
                return this.f58307x8fa6b908;
            }
        }
        if (this.f58312xc1794064) {
            throw new java.lang.IllegalStateException("getDatabase called recursively");
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c72 = this.f58307x8fa6b908;
        try {
            this.f58312xc1794064 = true;
            if (c26948xabb259c72 == null) {
                java.lang.String str = this.f58314x624f098;
                if (str == null) {
                    m107634xfef9b1e5 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.m107618xaf65a0fc(null);
                } else {
                    boolean z18 = this.f58311xdbf0570c;
                    try {
                        this.f58315x5893a2e6 = true;
                        int i17 = this.f58308x1235d56d ? 8 : 0;
                        this.f58313x624afb0 = i17;
                        m107634xfef9b1e5 = com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26988x9befcd8f.m108021xa5e841c4(this.f58306xd6cfe882, str, this.f58317x6d876228, this.f58305xfe580cd8, i17, this.f58310x5d03e3dd, this.f58309xcfad5d2f, z18 ? 1 : 0);
                    } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
                        if (z17) {
                            throw e17;
                        }
                        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Couldn't open " + this.f58314x624f098 + " for writing (will try read-only):", e17);
                        m107634xfef9b1e5 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.m107634xfef9b1e5(this.f58306xd6cfe882.getDatabasePath(this.f58314x624f098).getPath(), this.f58317x6d876228, this.f58305xfe580cd8, this.f58310x5d03e3dd, 1, this.f58309xcfad5d2f);
                    }
                }
                c26948xabb259c72 = m107634xfef9b1e5;
            } else if (z17 && c26948xabb259c72.m107698x9cffd9ac()) {
                c26948xabb259c72.m107715xd329e56c();
            }
            return m107780x824d9691(c26948xabb259c72);
        } finally {
            this.f58312xc1794064 = false;
            if (c26948xabb259c72 != null && c26948xabb259c72 != this.f58307x8fa6b908) {
                c26948xabb259c72.close();
            }
        }
    }

    /* renamed from: getDatabaseLockedLast */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107780x824d9691(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7) {
        m107785xce379fc7(c26948xabb259c7);
        int m107688x52c258a2 = c26948xabb259c7.m107688x52c258a2();
        if (m107688x52c258a2 != this.f58316x1499ef65) {
            if (c26948xabb259c7.m107698x9cffd9ac()) {
                throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183("Can't upgrade read-only database from version " + c26948xabb259c7.m107688x52c258a2() + " to " + this.f58316x1499ef65 + ": " + this.f58314x624f098);
            }
            c26948xabb259c7.m107659xb2c12e75();
            try {
                if (m107688x52c258a2 == 0) {
                    m107786x3e5a77bb(c26948xabb259c7);
                } else {
                    int i17 = this.f58316x1499ef65;
                    if (m107688x52c258a2 > i17) {
                        m107787x4c236d56(c26948xabb259c7, m107688x52c258a2, i17);
                    } else {
                        m107789x41de9b3d(c26948xabb259c7, m107688x52c258a2, i17);
                    }
                }
                c26948xabb259c7.m107730xc633a616(this.f58316x1499ef65);
                c26948xabb259c7.m107729x576b60d6();
            } finally {
                c26948xabb259c7.m107670x7d3c6b03();
            }
        }
        m107788xc39da0c9(c26948xabb259c7);
        if (c26948xabb259c7.m107698x9cffd9ac()) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.w(TAG, "Opened " + this.f58314x624f098 + " in read-only mode");
        }
        this.f58307x8fa6b908 = c26948xabb259c7;
        return c26948xabb259c7;
    }

    /* renamed from: close */
    public synchronized void m107781x5a5ddf8() {
        if (this.f58312xc1794064) {
            throw new java.lang.IllegalStateException("Closed during initialization");
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f58307x8fa6b908;
        if (c26948xabb259c7 != null && c26948xabb259c7.m107697xb9a70294()) {
            this.f58307x8fa6b908.close();
            this.f58307x8fa6b908 = null;
        }
    }

    /* renamed from: getDatabaseName */
    public java.lang.String m107782x45955d1c() {
        return this.f58314x624f098;
    }

    /* renamed from: getReadableDatabase */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107783x34f12101() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107779x3309b55b;
        synchronized (this) {
            m107779x3309b55b = m107779x3309b55b(false);
        }
        return m107779x3309b55b;
    }

    /* renamed from: getWritableDatabase */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107784x240d90b1() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107779x3309b55b;
        synchronized (this) {
            m107779x3309b55b = m107779x3309b55b(true);
        }
        return m107779x3309b55b;
    }

    /* renamed from: onConfigure */
    public void m107785xce379fc7(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7) {
    }

    /* renamed from: onCreate */
    public abstract void m107786x3e5a77bb(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7);

    /* renamed from: onDowngrade */
    public void m107787x4c236d56(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, int i17, int i18) {
        throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183("Can't downgrade database from version " + i17 + " to " + i18);
    }

    /* renamed from: onOpen */
    public void m107788xc39da0c9(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7) {
    }

    /* renamed from: onUpgrade */
    public abstract void m107789x41de9b3d(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, int i17, int i18);

    /* renamed from: setForcedSingleConnection */
    public void m107790xb19b7d41(boolean z17) {
        synchronized (this) {
            this.f58311xdbf0570c = z17;
        }
    }

    /* renamed from: setWriteAheadLoggingEnabled */
    public void m107791xfbbea326(boolean z17) {
        synchronized (this) {
            if (this.f58308x1235d56d != z17) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f58307x8fa6b908;
                if (c26948xabb259c7 != null && c26948xabb259c7.m107697xb9a70294() && !this.f58307x8fa6b908.m107698x9cffd9ac()) {
                    if (z17) {
                        this.f58307x8fa6b908.m107669xbbf289a();
                    } else {
                        this.f58307x8fa6b908.m107666x45be01d5();
                    }
                }
                this.f58308x1235d56d = z17;
            }
        }
    }

    public AbstractC26963x250427e4(android.content.Context context, java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, int i17, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d) {
        if (i17 >= 1) {
            this.f58306xd6cfe882 = context;
            this.f58314x624f098 = str;
            this.f58310x5d03e3dd = cursorFactory;
            this.f58316x1499ef65 = i17;
            this.f58309xcfad5d2f = interfaceC26879x4f347d5d;
            this.f58317x6d876228 = bArr;
            this.f58305xfe580cd8 = c26940xf23b9b2 == null ? null : new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2(c26940xf23b9b2);
            this.f58315x5893a2e6 = false;
            return;
        }
        throw new java.lang.IllegalArgumentException("Version must be >= 1, was " + i17);
    }

    public AbstractC26963x250427e4(android.content.Context context, java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, int i17, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d) {
        this(context, str, bArr, null, cursorFactory, i17, interfaceC26879x4f347d5d);
    }

    public AbstractC26963x250427e4(android.content.Context context, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, int i17, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d interfaceC26879x4f347d5d) {
        this(context, str, null, null, cursorFactory, i17, interfaceC26879x4f347d5d);
    }
}
