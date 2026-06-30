package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteDirectCursor */
/* loaded from: classes12.dex */
public class C26954x879c8aeb extends com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38 {

    /* renamed from: FACTORY */
    public static final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory f58282xe9b6bcea = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory() { // from class: com.tencent.wcdb.database.SQLiteDirectCursor.1
        @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory
        /* renamed from: newCursor */
        public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 mo107385xc13ef116(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a interfaceC26946xca9816a, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26965xa5559cb8 abstractC26965xa5559cb8) {
            return new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb(interfaceC26946xca9816a, str, (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26956xf4a0da93) abstractC26965xa5559cb8);
        }

        @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory
        /* renamed from: newQuery */
        public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26965xa5559cb8 mo107386x51538308(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
            return new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26956xf4a0da93(c26948xabb259c7, str, objArr, c26987xeef691ab);
        }
    };
    private static final java.lang.String TAG = "WCDB.SQLiteDirectCursor";

    /* renamed from: mColumns */
    private final java.lang.String[] f58283xd6b44ab0;

    /* renamed from: mCount */
    private int f58284xbde49ca2;

    /* renamed from: mCountFinished */
    private boolean f58285xfc89ff34;

    /* renamed from: mDriver */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a f58286x88bef5;

    /* renamed from: mQuery */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26956xf4a0da93 f58287xbeac645b;

    public C26954x879c8aeb(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a interfaceC26946xca9816a, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26956xf4a0da93 c26956xf4a0da93) {
        if (c26956xf4a0da93 == null) {
            throw new java.lang.IllegalArgumentException("query object cannot be null");
        }
        this.f58287xbeac645b = c26956xf4a0da93;
        this.f58286x88bef5 = interfaceC26946xca9816a;
        this.f58283xd6b44ab0 = c26956xf4a0da93.m107806xa71d005c();
        this.f58284xbde49ca2 = -1;
        this.f58285xfc89ff34 = false;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.f58287xbeac645b.close();
        this.f58286x88bef5.mo107609x7b4e8862();
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        this.f58286x88bef5.mo107610x9585813a();
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public byte[] getBlob(int i17) {
        return this.f58287xbeac645b.m107767xfb7d9813(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.f58283xd6b44ab0;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getCount() {
        if (!this.f58285xfc89ff34) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.w(TAG, "Count query on SQLiteDirectCursor is slow. Iterate through the end to get count or use other implementations.");
            this.f58284xbde49ca2 = this.f57710x32c6a7 + this.f58287xbeac645b.m107773x3606cc(Integer.MAX_VALUE) + 1;
            this.f58285xfc89ff34 = true;
            this.f58287xbeac645b.m107772x6761d4f(false);
            this.f57710x32c6a7 = this.f58287xbeac645b.m107773x3606cc(this.f57710x32c6a7 + 1) - 1;
        }
        return this.f58284xbde49ca2;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public double getDouble(int i17) {
        return this.f58287xbeac645b.m107768x160e9ec7(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public float getFloat(int i17) {
        return (float) this.f58287xbeac645b.m107768x160e9ec7(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getInt(int i17) {
        return (int) this.f58287xbeac645b.m107769xfb822ef2(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public long getLong(int i17) {
        return this.f58287xbeac645b.m107769xfb822ef2(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public short getShort(int i17) {
        return (short) this.f58287xbeac645b.m107769xfb822ef2(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String getString(int i17) {
        return this.f58287xbeac645b.m107770x2fec8307(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getType(int i17) {
        return this.f58287xbeac645b.m107771xfb85f7b0(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean isNull(int i17) {
        return getType(i17) == 0;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean moveToPosition(int i17) {
        int m107773x3606cc;
        int i18;
        if (i17 < 0) {
            this.f58287xbeac645b.m107772x6761d4f(false);
            this.f57710x32c6a7 = -1;
            return false;
        }
        if (this.f58285xfc89ff34 && i17 >= (i18 = this.f58284xbde49ca2)) {
            this.f57710x32c6a7 = i18;
            return false;
        }
        int i19 = this.f57710x32c6a7;
        if (i17 < i19) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.w(TAG, "Moving backward on SQLiteDirectCursor is slow. Get rid of backward movement or use other implementations.");
            this.f58287xbeac645b.m107772x6761d4f(false);
            m107773x3606cc = this.f58287xbeac645b.m107773x3606cc(i17 + 1) - 1;
        } else {
            if (i17 == i19) {
                return true;
            }
            m107773x3606cc = i19 + this.f58287xbeac645b.m107773x3606cc(i17 - i19);
        }
        if (m107773x3606cc < i17) {
            int i27 = m107773x3606cc + 1;
            this.f58284xbde49ca2 = i27;
            this.f58285xfc89ff34 = true;
            this.f57710x32c6a7 = i27;
        } else {
            this.f57710x32c6a7 = m107773x3606cc;
            if (m107773x3606cc >= this.f58284xbde49ca2) {
                this.f58284xbde49ca2 = m107773x3606cc + 1;
                this.f58285xfc89ff34 = false;
            }
        }
        return this.f57710x32c6a7 < this.f58284xbde49ca2;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            if (!this.f58287xbeac645b.m107808xe6834ef1().m107697xb9a70294()) {
                return false;
            }
            this.f57710x32c6a7 = -1;
            this.f58285xfc89ff34 = false;
            this.f58284xbde49ca2 = -1;
            this.f58286x88bef5.mo107611x9e09670e(this);
            this.f58287xbeac645b.m107772x6761d4f(false);
            try {
                return super.requery();
            } catch (java.lang.IllegalStateException e17) {
                com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.w(TAG, "requery() failed " + e17.getMessage(), e17);
                return false;
            }
        }
    }
}
