package e95;

/* loaded from: classes12.dex */
public class m extends com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38 implements e95.h {

    /* renamed from: r, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory f331958r = new e95.l();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f331959d;

    /* renamed from: e, reason: collision with root package name */
    public final e95.p f331960e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a f331961f;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Map f331963h;

    /* renamed from: m, reason: collision with root package name */
    public e95.g f331965m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f331966n;

    /* renamed from: o, reason: collision with root package name */
    public e95.b f331967o;

    /* renamed from: p, reason: collision with root package name */
    public e95.f f331968p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f331969q;

    /* renamed from: g, reason: collision with root package name */
    public int f331962g = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f331964i = 3000;

    public m(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a interfaceC26946xca9816a, java.lang.String str, e95.p pVar) {
        if (pVar == null) {
            throw new java.lang.IllegalArgumentException("query object cannot be null");
        }
        this.f331961f = interfaceC26946xca9816a;
        this.f331963h = null;
        this.f331960e = pVar;
        java.lang.String[] m107806xa71d005c = pVar.m107806xa71d005c();
        this.f331959d = m107806xa71d005c;
        this.f57711xc27989d4 = com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106259x88d6720(m107806xa71d005c);
    }

    @Override // e95.h
    public boolean I0(int i17) {
        if (!this.f331966n) {
            return false;
        }
        this.f331967o.getClass();
        return i17 <= 50;
    }

    @Override // e95.h
    public void Y(e95.g gVar) {
        this.f331965m = gVar;
    }

    public final int a(int i17) {
        boolean z17 = this.f331966n;
        e95.p pVar = this.f331960e;
        if (!z17) {
            if (this.f331968p == null) {
                this.f331968p = new e95.f(this.f331959d);
            }
            return pVar.b(this.f331968p, i17, this.f331964i);
        }
        if (this.f331967o == null) {
            this.f331967o = new e95.k(this, true);
        }
        this.f331967o.getClass();
        return pVar.a(this.f331967o, i17, this.f331964i);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38
    /* renamed from: checkPosition */
    public void mo106123xbc7f5a51() {
        super.mo106123xbc7f5a51();
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        synchronized (this) {
            this.f331960e.close();
            this.f331961f.mo107609x7b4e8862();
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        this.f331961f.mo107610x9585813a();
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38
    /* renamed from: finalize */
    public void mo106125xd764dc1e() {
        try {
            if (this.f331967o != null) {
                close();
            }
        } finally {
            super.mo106125xd764dc1e();
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public byte[] getBlob(int i17) {
        if (this.f331966n) {
            return null;
        }
        return this.f331968p.getBlob(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        if (this.f331963h == null) {
            java.lang.String[] strArr = this.f331959d;
            int length = strArr.length;
            java.util.HashMap hashMap = new java.util.HashMap(length, 1.0f);
            for (int i17 = 0; i17 < length; i17++) {
                hashMap.put(strArr[i17], java.lang.Integer.valueOf(i17));
            }
            this.f331963h = hashMap;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e("WCDB.SQLiteNewCursor", "requesting column name with table name -- ".concat(str), new java.lang.Exception());
            str = str.substring(lastIndexOf + 1);
        }
        java.lang.Integer num = (java.lang.Integer) this.f331963h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.f331959d;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getCount() {
        if (this.f331962g == -1) {
            int a17 = a(0);
            this.f331962g = a17;
            e95.b bVar = this.f331967o;
            if (bVar != null) {
                this.f331969q = a17 != -1 && a17 == bVar.f();
            }
        }
        if (!this.f331966n || !this.f331969q) {
            return this.f331962g;
        }
        e95.b bVar2 = this.f331967o;
        if (bVar2 == null) {
            return 0;
        }
        return bVar2.f();
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public double getDouble(int i17) {
        if (this.f331966n) {
            return 0.0d;
        }
        return this.f331968p.getDouble(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public float getFloat(int i17) {
        if (this.f331966n) {
            return 0.0f;
        }
        return this.f331968p.getFloat(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getInt(int i17) {
        if (this.f331966n) {
            return 0;
        }
        return this.f331968p.getInt(i17);
    }

    @Override // e95.h
    /* renamed from: getItem */
    public e95.a mo123785xfb80e389(int i17) {
        e95.b bVar = this.f331967o;
        if (bVar != null) {
            return bVar.m127199xfb80e389(i17);
        }
        return null;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public long getLong(int i17) {
        if (this.f331966n) {
            return 0L;
        }
        return this.f331968p.getLong(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public short getShort(int i17) {
        if (this.f331966n) {
            return (short) 0;
        }
        return this.f331968p.getShort(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String getString(int i17) {
        if (this.f331966n) {
            return null;
        }
        return this.f331968p.getString(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean isNull(int i17) {
        if (this.f331966n) {
            return false;
        }
        return this.f331968p.isNull(i17);
    }

    @Override // e95.h
    public boolean n0(java.lang.Object obj) {
        e95.b bVar;
        if (this.f331966n && (bVar = this.f331967o) != null) {
            return bVar.n0(obj);
        }
        return false;
    }

    @Override // e95.h
    public android.util.SparseArray[] n1() {
        if (this.f331966n) {
            return new android.util.SparseArray[]{this.f331967o.f331928d};
        }
        return null;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26870x63710a65
    /* renamed from: onMove */
    public boolean mo106131xc39cb650(int i17, int i18) {
        if (this.f331966n) {
            e95.b bVar = this.f331967o;
            if (bVar != null && bVar.b(i18)) {
                return true;
            }
            int i19 = this.f331964i;
            a((i18 / i19) * i19);
            return true;
        }
        e95.f fVar = this.f331968p;
        if (fVar == null && fVar == null) {
            this.f331968p = new e95.f(this.f331959d);
        }
        if (!this.f331968p.b(i18)) {
            int i27 = this.f331964i;
            a((i18 / i27) * i27);
        }
        this.f331968p.moveToPosition(i18);
        return true;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            if (!this.f331960e.m107808xe6834ef1().m107697xb9a70294()) {
                return false;
            }
            e95.b bVar = this.f331967o;
            if (bVar != null) {
                bVar.a();
            }
            this.f57710x32c6a7 = -1;
            this.f331962g = -1;
            this.f331961f.mo107611x9e09670e(this);
            try {
                return super.requery();
            } catch (java.lang.IllegalStateException e17) {
                com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.w("WCDB.SQLiteNewCursor", "requery() failed " + e17.getMessage(), e17);
                return false;
            }
        }
    }

    @Override // e95.h
    public boolean t(java.lang.Object obj, e95.a aVar) {
        e95.b bVar;
        boolean z17 = this.f331966n;
        if (!z17 || (bVar = this.f331967o) == null) {
            if (!z17) {
                this.f331968p.a();
            }
            return false;
        }
        if (!this.f331969q && (obj instanceof java.lang.Object[]) && bVar.n0(obj)) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            this.f331962g -= objArr.length;
            this.f331964i -= objArr.length;
        }
        this.f331967o.t(obj, aVar);
        return false;
    }

    @Override // e95.h
    public void u(boolean z17) {
        this.f331966n = z17;
    }

    @Override // e95.h
    public void u1(int i17) {
        if (i17 > 15000 || i17 < 2000) {
            return;
        }
        this.f331964i = i17;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    @Override // e95.h
    public boolean y() {
        return this.f331969q;
    }
}
