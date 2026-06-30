package e95;

/* loaded from: classes12.dex */
public class f extends com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f331948d;

    /* renamed from: f, reason: collision with root package name */
    public final int f331950f;

    /* renamed from: h, reason: collision with root package name */
    public int f331952h;

    /* renamed from: g, reason: collision with root package name */
    public final int f331951g = 3000;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f331949e = new android.util.SparseArray();

    public f(java.lang.String[] strArr) {
        this.f331948d = strArr;
        this.f331950f = strArr.length;
    }

    public void a() {
        this.f57710x32c6a7 = 0;
        this.f331949e.clear();
    }

    public boolean b(int i17) {
        int i18 = this.f331951g;
        int i19 = i17 / i18;
        android.util.SparseArray sparseArray = this.f331949e;
        if (sparseArray.indexOfKey(i19) < 0) {
            return false;
        }
        return ((java.lang.Object[]) sparseArray.get(i19))[(i17 % i18) * this.f331950f] != null;
    }

    public e95.e c(int i17) {
        java.lang.Object[] objArr;
        int i18 = this.f331951g;
        int i19 = i17 / i18;
        android.util.SparseArray sparseArray = this.f331949e;
        int indexOfKey = sparseArray.indexOfKey(i19);
        int i27 = this.f331950f;
        if (indexOfKey < 0) {
            objArr = new java.lang.Object[i18 * i27];
            sparseArray.put(i19, objArr);
        } else {
            objArr = (java.lang.Object[]) sparseArray.get(i19);
        }
        int i28 = (i17 % i18) * i27;
        int i29 = i27 + i28;
        int i37 = i17 + 1;
        int i38 = this.f331952h;
        if (i37 <= i38) {
            i37 = i38;
        }
        this.f331952h = i37;
        return new e95.e(this, i28, i29, objArr);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
    }

    public final java.lang.Object get(int i17) {
        int i18 = this.f331950f;
        if (i17 < 0 || i17 >= i18) {
            throw new android.database.CursorIndexOutOfBoundsException("Requested column: " + i17 + ", # of columns: " + i18);
        }
        int i19 = this.f57710x32c6a7;
        if (i19 < 0) {
            throw new android.database.CursorIndexOutOfBoundsException("Before first row.");
        }
        if (i19 >= this.f331952h) {
            throw new android.database.CursorIndexOutOfBoundsException("After last row.");
        }
        int i27 = this.f331951g;
        return ((java.lang.Object[]) this.f331949e.get(i19 / i27))[((i19 % i27) * i18) + i17];
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public byte[] getBlob(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return null;
        }
        return (byte[]) obj;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.f331948d;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getCount() {
        return this.f331952h;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public double getDouble(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return 0.0d;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).doubleValue() : java.lang.Double.parseDouble(obj.toString());
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public float getFloat(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return 0.0f;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getInt(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return 0;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public long getLong(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return 0L;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).longValue() : java.lang.Long.parseLong(obj.toString());
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public short getShort(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return (short) 0;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).shortValue() : java.lang.Short.parseShort(obj.toString());
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String getString(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean isNull(int i17) {
        return get(i17) == null;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }
}
