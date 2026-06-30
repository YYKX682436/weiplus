package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteAsyncCursor */
/* loaded from: classes12.dex */
public class C26933x23f77926 extends com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38 {

    /* renamed from: FACTORY */
    public static final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory f58071xe9b6bcea = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory() { // from class: com.tencent.wcdb.database.SQLiteAsyncCursor.1
        @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory
        /* renamed from: newCursor */
        public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 mo107385xc13ef116(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a interfaceC26946xca9816a, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26965xa5559cb8 abstractC26965xa5559cb8) {
            return new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926(interfaceC26946xca9816a, str, (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26934xd061b8f8) abstractC26965xa5559cb8);
        }

        @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory
        /* renamed from: newQuery */
        public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26965xa5559cb8 mo107386x51538308(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
            return new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26934xd061b8f8(c26948xabb259c7, str, objArr, c26987xeef691ab);
        }
    };

    /* renamed from: MAX_KEEP_CHUNKS */
    private static final int f58072x33c4ab25 = 32;

    /* renamed from: MAX_PREFETCH */
    private static final int f58073xfefaa692 = 256;

    /* renamed from: MIN_FETCH_ROWS */
    private static final int f58074xbcfa6c8b = 32;
    private static final java.lang.String TAG = "WCDB.SQLiteAsyncCursor";

    /* renamed from: mColumns */
    private final java.lang.String[] f58075xd6b44ab0;

    /* renamed from: mCount */
    private volatile int f58076xbde49ca2;

    /* renamed from: mCurrentRow */
    private long f58077x9b495dee;

    /* renamed from: mDriver */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a f58078x88bef5;

    /* renamed from: mQuery */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26934xd061b8f8 f58079xbeac645b;

    /* renamed from: mQueryThread */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.QueryThread f58080x5fee6e45;

    /* renamed from: mWaitLock */
    private final java.lang.Object f58081x3399afcd;

    /* renamed from: mWindow */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26928xf69f94b2 f58082x207802bd;

    /* renamed from: com.tencent.wcdb.database.SQLiteAsyncCursor$QueryThread */
    /* loaded from: classes12.dex */
    public class QueryThread extends java.lang.Thread {

        /* renamed from: mFetchPos */
        private int f58083x3320a8c7;

        /* renamed from: mMinPos */
        private int f58084xf67416f;

        /* renamed from: mRequestPos */
        private volatile int f58085xde680192;

        public QueryThread() {
            super("SQLiteAsyncCursor.QueryThread");
            this.f58085xde680192 = 0;
            this.f58084xf67416f = 0;
            this.f58083x3320a8c7 = 0;
        }

        /* renamed from: quit */
        public void m107387x35224f() {
            interrupt();
        }

        /* renamed from: requestPos */
        public void m107388x2360945(int i17) {
            synchronized (this) {
                this.f58085xde680192 = i17;
                notifyAll();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i17;
            int i18;
            int m107392xd48a71fc;
            try {
                int m107393x7444f759 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.this.f58079xbeac645b.m107393x7444f759();
                synchronized (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.this.f58081x3399afcd) {
                    com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.this.f58076xbde49ca2 = m107393x7444f759;
                    com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.this.f58081x3399afcd.notifyAll();
                }
                while (!java.lang.Thread.interrupted()) {
                    synchronized (this) {
                        while (this.f58085xde680192 + 256 <= this.f58083x3320a8c7 && this.f58085xde680192 >= this.f58084xf67416f) {
                            wait();
                        }
                        i17 = this.f58085xde680192;
                        i18 = i17 + 256;
                    }
                    if (i17 < this.f58084xf67416f) {
                        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.this.f58079xbeac645b.m107395x6761d4f();
                        this.f58083x3320a8c7 = 0;
                        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.this.f58082x207802bd.m107351x5a5b64d();
                        this.f58084xf67416f = 0;
                    }
                    if (this.f58083x3320a8c7 < i18) {
                        if (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.this.f58082x207802bd.m107360x2d0af816() > 32) {
                            long m107367xecf0ec49 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.this.f58082x207802bd.m107367xecf0ec49(this.f58084xf67416f);
                            if (m107367xecf0ec49 != -1) {
                                this.f58084xf67416f = (int) m107367xecf0ec49;
                            }
                        }
                        synchronized (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.this.f58081x3399afcd) {
                            m107392xd48a71fc = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.this.f58079xbeac645b.m107392xd48a71fc(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.this.f58082x207802bd, this.f58083x3320a8c7, 32);
                            int i19 = this.f58083x3320a8c7;
                            if (i19 <= i17 && i19 + m107392xd48a71fc > i17) {
                                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.this.f58081x3399afcd.notifyAll();
                            }
                        }
                        this.f58083x3320a8c7 += m107392xd48a71fc;
                    }
                }
            } catch (java.lang.InterruptedException unused) {
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.this.f58079xbeac645b.m107394x41012807();
                throw th6;
            }
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.this.f58079xbeac645b.m107394x41012807();
        }
    }

    public C26933x23f77926(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a interfaceC26946xca9816a, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26934xd061b8f8 c26934xd061b8f8) {
        if (c26934xd061b8f8 == null) {
            throw new java.lang.IllegalArgumentException("query object cannot be null");
        }
        this.f58079xbeac645b = c26934xd061b8f8;
        this.f58078x88bef5 = interfaceC26946xca9816a;
        this.f58075xd6b44ab0 = c26934xd061b8f8.m107806xa71d005c();
        this.f58076xbde49ca2 = -1;
        this.f58081x3399afcd = new java.lang.Object();
        this.f58082x207802bd = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26928xf69f94b2(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.QueryThread queryThread = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.QueryThread();
        this.f58080x5fee6e45 = queryThread;
        queryThread.start();
    }

    /* renamed from: checkValidRow */
    private void m107381x3b35a166() {
        if (this.f58077x9b495dee != 0) {
            return;
        }
        if (!m107382x79b7283b(this.f57710x32c6a7)) {
            throw new com.p314xaae8f345.p3121x37984a.C26873x6901bdb1(this.f57710x32c6a7, this.f58076xbde49ca2);
        }
        throw new com.p314xaae8f345.p3121x37984a.C26894xe1ef88cc("Cannot get valid Row object");
    }

    /* renamed from: isValidPosition */
    private boolean m107382x79b7283b(int i17) {
        return i17 >= 0 && i17 < getCount();
    }

    /* renamed from: requestRow */
    private boolean m107383x23610cb() {
        if (this.f58082x207802bd == null || !m107382x79b7283b(this.f57710x32c6a7)) {
            return false;
        }
        this.f58080x5fee6e45.m107388x2360945(this.f57710x32c6a7);
        long m107362x3edea56a = this.f58082x207802bd.m107362x3edea56a(this.f57710x32c6a7);
        this.f58077x9b495dee = m107362x3edea56a;
        if (m107362x3edea56a == 0) {
            this.f58077x9b495dee = m107384xcd846626(this.f57710x32c6a7);
        }
        return this.f58077x9b495dee != 0;
    }

    /* renamed from: waitForRow */
    private long m107384xcd846626(int i17) {
        long m107362x3edea56a;
        try {
            synchronized (this.f58081x3399afcd) {
                while (true) {
                    m107362x3edea56a = this.f58082x207802bd.m107362x3edea56a(i17);
                    if (m107362x3edea56a == 0) {
                        if (!m107382x79b7283b(i17)) {
                            throw new com.p314xaae8f345.p3121x37984a.C26873x6901bdb1(this.f57710x32c6a7, this.f58076xbde49ca2);
                        }
                        this.f58081x3399afcd.wait();
                    }
                }
            }
            return m107362x3edea56a;
        } catch (java.lang.InterruptedException unused) {
            return 0L;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.f58079xbeac645b.close();
        this.f58078x88bef5.mo107609x7b4e8862();
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        this.f58078x88bef5.mo107610x9585813a();
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public byte[] getBlob(int i17) {
        m107381x3b35a166();
        return this.f58082x207802bd.m107355xe151c399(this.f58077x9b495dee, i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.f58075xd6b44ab0;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getCount() {
        if (this.f58076xbde49ca2 >= 0) {
            return this.f58076xbde49ca2;
        }
        if (this.f58082x207802bd == null) {
            return -1;
        }
        try {
            synchronized (this.f58081x3399afcd) {
                while (this.f58076xbde49ca2 < 0) {
                    this.f58081x3399afcd.wait();
                }
            }
        } catch (java.lang.InterruptedException unused) {
        }
        return this.f58076xbde49ca2;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public double getDouble(int i17) {
        m107381x3b35a166();
        return this.f58082x207802bd.m107357xa267f34d(this.f58077x9b495dee, i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public float getFloat(int i17) {
        return (float) getDouble(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getInt(int i17) {
        return (int) getLong(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public long getLong(int i17) {
        m107381x3b35a166();
        return this.f58082x207802bd.m107359xc99b7738(this.f58077x9b495dee, i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public short getShort(int i17) {
        return (short) getLong(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String getString(int i17) {
        m107381x3b35a166();
        return this.f58082x207802bd.m107364x68d9a78d(this.f58077x9b495dee, i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getType(int i17) {
        m107381x3b35a166();
        return this.f58082x207802bd.m107366x9c893976(this.f58077x9b495dee, i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean isNull(int i17) {
        return getType(i17) == 0;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean moveToPosition(int i17) {
        if (i17 < -1) {
            i17 = -1;
        }
        if (i17 != this.f57710x32c6a7) {
            this.f58082x207802bd.m107352x26ee9185(this.f58077x9b495dee);
            this.f58077x9b495dee = 0L;
        }
        int count = getCount();
        if (i17 >= count) {
            this.f57710x32c6a7 = count;
            return false;
        }
        this.f57710x32c6a7 = i17;
        return i17 >= 0 && m107383x23610cb();
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38
    /* renamed from: onDeactivateOrClose */
    public void mo106130x24edfea2() {
        long j17 = this.f58077x9b495dee;
        if (j17 != 0) {
            this.f58082x207802bd.m107352x26ee9185(j17);
            this.f58077x9b495dee = 0L;
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26933x23f77926.QueryThread queryThread = this.f58080x5fee6e45;
        if (queryThread != null) {
            queryThread.m107387x35224f();
            try {
                this.f58080x5fee6e45.join();
            } catch (java.lang.InterruptedException unused) {
            }
            this.f58080x5fee6e45 = null;
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26928xf69f94b2 c26928xf69f94b2 = this.f58082x207802bd;
        if (c26928xf69f94b2 != null) {
            c26928xf69f94b2.close();
            this.f58082x207802bd = null;
        }
        this.f58076xbde49ca2 = -1;
        this.f57710x32c6a7 = -1;
        super.mo106130x24edfea2();
    }
}
