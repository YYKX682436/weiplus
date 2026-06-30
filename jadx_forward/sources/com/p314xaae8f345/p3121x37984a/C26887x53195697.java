package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.MatrixCursor */
/* loaded from: classes12.dex */
public class C26887x53195697 extends com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38 {

    /* renamed from: columnCount */
    private final int f57813xccb23359;

    /* renamed from: columnNames */
    private final java.lang.String[] f57814xcd46b992;

    /* renamed from: data */
    private java.lang.Object[] f57815x2eefaa;

    /* renamed from: rowCount */
    private int f57816x10ebf55;

    /* renamed from: com.tencent.wcdb.MatrixCursor$RowBuilder */
    /* loaded from: classes12.dex */
    public class RowBuilder {

        /* renamed from: endIndex */
        private final int f57817x65a100b7;

        /* renamed from: index */
        private int f57818x5fb28d2;

        public RowBuilder(int i17, int i18) {
            this.f57818x5fb28d2 = i17;
            this.f57817x65a100b7 = i18;
        }

        public com.p314xaae8f345.p3121x37984a.C26887x53195697.RowBuilder add(java.lang.Object obj) {
            if (this.f57818x5fb28d2 == this.f57817x65a100b7) {
                throw new com.p314xaae8f345.p3121x37984a.C26873x6901bdb1("No more columns left.");
            }
            java.lang.Object[] objArr = com.p314xaae8f345.p3121x37984a.C26887x53195697.this.f57815x2eefaa;
            int i17 = this.f57818x5fb28d2;
            this.f57818x5fb28d2 = i17 + 1;
            objArr[i17] = obj;
            return this;
        }
    }

    public C26887x53195697(java.lang.String[] strArr, int i17) {
        this.f57816x10ebf55 = 0;
        this.f57814xcd46b992 = strArr;
        int length = strArr.length;
        this.f57813xccb23359 = length;
        this.f57815x2eefaa = new java.lang.Object[length * (i17 < 1 ? 1 : i17)];
    }

    /* renamed from: ensureCapacity */
    private void m106322x61a3f718(int i17) {
        java.lang.Object[] objArr = this.f57815x2eefaa;
        if (i17 > objArr.length) {
            int length = objArr.length * 2;
            if (length >= i17) {
                i17 = length;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[i17];
            this.f57815x2eefaa = objArr2;
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
    }

    private java.lang.Object get(int i17) {
        int i18;
        if (i17 < 0 || i17 >= (i18 = this.f57813xccb23359)) {
            throw new com.p314xaae8f345.p3121x37984a.C26873x6901bdb1("Requested column: " + i17 + ", # of columns: " + this.f57813xccb23359);
        }
        int i19 = this.f57710x32c6a7;
        if (i19 < 0) {
            throw new com.p314xaae8f345.p3121x37984a.C26873x6901bdb1("Before first row.");
        }
        if (i19 < this.f57816x10ebf55) {
            return this.f57815x2eefaa[(i19 * i18) + i17];
        }
        throw new com.p314xaae8f345.p3121x37984a.C26873x6901bdb1("After last row.");
    }

    /* renamed from: addRow */
    public void m106324xab35f979(java.lang.Object[] objArr) {
        int length = objArr.length;
        int i17 = this.f57813xccb23359;
        if (length == i17) {
            int i18 = this.f57816x10ebf55;
            this.f57816x10ebf55 = i18 + 1;
            int i19 = i18 * i17;
            m106322x61a3f718(i17 + i19);
            java.lang.System.arraycopy(objArr, 0, this.f57815x2eefaa, i19, this.f57813xccb23359);
            return;
        }
        throw new java.lang.IllegalArgumentException("columnNames.length = " + this.f57813xccb23359 + ", columnValues.length = " + objArr.length);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public byte[] getBlob(int i17) {
        return (byte[]) get(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.f57814xcd46b992;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getCount() {
        return this.f57816x10ebf55;
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
    public int getType(int i17) {
        return com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106265x4b494bc6(get(i17));
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean isNull(int i17) {
        return get(i17) == null;
    }

    /* renamed from: newRow */
    public com.p314xaae8f345.p3121x37984a.C26887x53195697.RowBuilder m106325xc17bb41a() {
        int i17 = this.f57816x10ebf55 + 1;
        this.f57816x10ebf55 = i17;
        int i18 = i17 * this.f57813xccb23359;
        m106322x61a3f718(i18);
        return new com.p314xaae8f345.p3121x37984a.C26887x53195697.RowBuilder(i18 - this.f57813xccb23359, i18);
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

    public C26887x53195697(java.lang.String[] strArr) {
        this(strArr, 16);
    }

    /* renamed from: addRow */
    public void m106323xab35f979(java.lang.Iterable<?> iterable) {
        int i17 = this.f57816x10ebf55;
        int i18 = this.f57813xccb23359;
        int i19 = i17 * i18;
        int i27 = i18 + i19;
        m106322x61a3f718(i27);
        if (iterable instanceof java.util.ArrayList) {
            m106321xab35f979((java.util.ArrayList) iterable, i19);
            return;
        }
        java.lang.Object[] objArr = this.f57815x2eefaa;
        for (java.lang.Object obj : iterable) {
            if (i19 != i27) {
                objArr[i19] = obj;
                i19++;
            } else {
                throw new java.lang.IllegalArgumentException("columnValues.size() > columnNames.length");
            }
        }
        if (i19 == i27) {
            this.f57816x10ebf55++;
            return;
        }
        throw new java.lang.IllegalArgumentException("columnValues.size() < columnNames.length");
    }

    /* renamed from: addRow */
    private void m106321xab35f979(java.util.ArrayList<?> arrayList, int i17) {
        int size = arrayList.size();
        if (size == this.f57813xccb23359) {
            this.f57816x10ebf55++;
            java.lang.Object[] objArr = this.f57815x2eefaa;
            for (int i18 = 0; i18 < size; i18++) {
                objArr[i17 + i18] = arrayList.get(i18);
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("columnNames.length = " + this.f57813xccb23359 + ", columnValues.size() = " + size);
    }
}
