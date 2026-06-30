package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteCursor */
/* loaded from: classes12.dex */
public class C26945x5aacfea2 extends com.p314xaae8f345.p3121x37984a.AbstractC26865x49c349a7 {

    /* renamed from: FACTORY */
    public static final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory f58198xe9b6bcea = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory() { // from class: com.tencent.wcdb.database.SQLiteCursor.1
        @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory
        /* renamed from: newCursor */
        public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 mo107385xc13ef116(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a interfaceC26946xca9816a, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26965xa5559cb8 abstractC26965xa5559cb8) {
            return new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26945x5aacfea2(interfaceC26946xca9816a, str, (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26966xda6793fc) abstractC26965xa5559cb8);
        }

        @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory
        /* renamed from: newQuery */
        public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26965xa5559cb8 mo107386x51538308(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
            return new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26966xda6793fc(c26948xabb259c7, str, objArr, c26987xeef691ab);
        }
    };

    /* renamed from: NO_COUNT */
    static final int f58199x9f99b0f1 = -1;
    static final java.lang.String TAG = "WCDB.SQLiteCursor";

    /* renamed from: mColumnNameMap */
    private java.util.Map<java.lang.String, java.lang.Integer> f58200xf18c232e;

    /* renamed from: mColumns */
    private final java.lang.String[] f58201xd6b44ab0;

    /* renamed from: mCount */
    private int f58202xbde49ca2;

    /* renamed from: mCursorWindowCapacity */
    private int f58203x77d371cd;

    /* renamed from: mDriver */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a f58204x88bef5;

    /* renamed from: mQuery */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26966xda6793fc f58205xbeac645b;

    @java.lang.Deprecated
    public C26945x5aacfea2(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a interfaceC26946xca9816a, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26966xda6793fc c26966xda6793fc) {
        this(interfaceC26946xca9816a, str, c26966xda6793fc);
    }

    /* renamed from: fillWindow */
    private void m107606xe3e54f53(int i17) {
        m106132x1ac4593c(m107607xe6834ef1().m107682xfb83cc9b());
        try {
            if (this.f58202xbde49ca2 != -1) {
                this.f58205xbeac645b.m107813xe3e54f53(this.f57717x207802bd, com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106242xed291081(i17, this.f58203x77d371cd), i17, false);
            } else {
                this.f58202xbde49ca2 = this.f58205xbeac645b.m107813xe3e54f53(this.f57717x207802bd, com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106242xed291081(i17, 0), i17, true);
                this.f58203x77d371cd = this.f57717x207802bd.m106203xc688aa49();
            }
        } catch (java.lang.RuntimeException e17) {
            m106133x10864c08();
            throw e17;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        synchronized (this) {
            this.f58205xbeac645b.close();
            this.f58204x88bef5.mo107609x7b4e8862();
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        this.f58204x88bef5.mo107610x9585813a();
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38
    /* renamed from: finalize */
    public void mo106125xd764dc1e() {
        try {
            if (this.f57717x207802bd != null) {
                close();
            }
        } finally {
            super.mo106125xd764dc1e();
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        if (this.f58200xf18c232e == null) {
            java.lang.String[] strArr = this.f58201xd6b44ab0;
            int length = strArr.length;
            java.util.HashMap hashMap = new java.util.HashMap(length, 1.0f);
            for (int i17 = 0; i17 < length; i17++) {
                hashMap.put(strArr[i17], java.lang.Integer.valueOf(i17));
            }
            this.f58200xf18c232e = hashMap;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "requesting column name with table name -- ".concat(str), new java.lang.Exception());
            str = str.substring(lastIndexOf + 1);
        }
        java.lang.Integer num = this.f58200xf18c232e.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.f58201xd6b44ab0;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getCount() {
        if (this.f58202xbde49ca2 == -1) {
            m107606xe3e54f53(0);
        }
        return this.f58202xbde49ca2;
    }

    /* renamed from: getDatabase */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107607xe6834ef1() {
        return this.f58205xbeac645b.m107808xe6834ef1();
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean moveToPosition(int i17) {
        if (!super.moveToPosition(i17)) {
            return false;
        }
        int count = getCount();
        if (i17 < count) {
            return true;
        }
        this.f57710x32c6a7 = count;
        return false;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26870x63710a65
    /* renamed from: onMove */
    public boolean mo106131xc39cb650(int i17, int i18) {
        com.p314xaae8f345.p3121x37984a.C26876xa70fd706 c26876xa70fd706 = this.f57717x207802bd;
        if (c26876xa70fd706 != null && i18 >= c26876xa70fd706.m106205xf185fbf5() && i18 < this.f57717x207802bd.m106205xf185fbf5() + this.f57717x207802bd.m106203xc688aa49()) {
            return true;
        }
        m107606xe3e54f53(i18);
        int m106205xf185fbf5 = this.f57717x207802bd.m106205xf185fbf5() + this.f57717x207802bd.m106203xc688aa49();
        if (i18 < m106205xf185fbf5) {
            return true;
        }
        this.f58202xbde49ca2 = m106205xf185fbf5;
        return true;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            if (!this.f58205xbeac645b.m107808xe6834ef1().m107697xb9a70294()) {
                return false;
            }
            com.p314xaae8f345.p3121x37984a.C26876xa70fd706 c26876xa70fd706 = this.f57717x207802bd;
            if (c26876xa70fd706 != null) {
                c26876xa70fd706.m106193x5a5b64d();
            }
            this.f57710x32c6a7 = -1;
            this.f58202xbde49ca2 = -1;
            this.f58204x88bef5.mo107611x9e09670e(this);
            try {
                return super.requery();
            } catch (java.lang.IllegalStateException e17) {
                com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.w(TAG, "requery() failed " + e17.getMessage(), e17);
                return false;
            }
        }
    }

    /* renamed from: setSelectionArguments */
    public void m107608x8107092c(java.lang.String[] strArr) {
        this.f58204x88bef5.mo107613x2b4f0c57(strArr);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26865x49c349a7
    /* renamed from: setWindow */
    public void mo106139x295832f2(com.p314xaae8f345.p3121x37984a.C26876xa70fd706 c26876xa70fd706) {
        super.mo106139x295832f2(c26876xa70fd706);
        this.f58202xbde49ca2 = -1;
    }

    public C26945x5aacfea2(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a interfaceC26946xca9816a, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26966xda6793fc c26966xda6793fc) {
        this.f58202xbde49ca2 = -1;
        if (c26966xda6793fc != null) {
            this.f58204x88bef5 = interfaceC26946xca9816a;
            this.f58200xf18c232e = null;
            this.f58205xbeac645b = c26966xda6793fc;
            java.lang.String[] m107806xa71d005c = c26966xda6793fc.m107806xa71d005c();
            this.f58201xd6b44ab0 = m107806xa71d005c;
            this.f57711xc27989d4 = com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106259x88d6720(m107806xa71d005c);
            return;
        }
        throw new java.lang.IllegalArgumentException("query object cannot be null");
    }
}
