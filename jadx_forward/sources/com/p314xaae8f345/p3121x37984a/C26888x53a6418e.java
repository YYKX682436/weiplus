package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.MergeCursor */
/* loaded from: classes12.dex */
public class C26888x53a6418e extends com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38 {

    /* renamed from: mCursor */
    private com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 f57820xff023a23;

    /* renamed from: mCursors */
    private com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76[] f57821xe1450ab0;

    /* renamed from: mObserver */
    private android.database.DataSetObserver f57822x39c4fa63 = new android.database.DataSetObserver() { // from class: com.tencent.wcdb.MergeCursor.1
        @Override // android.database.DataSetObserver
        public void onChanged() {
            com.p314xaae8f345.p3121x37984a.C26888x53a6418e.this.f57710x32c6a7 = -1;
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            com.p314xaae8f345.p3121x37984a.C26888x53a6418e.this.f57710x32c6a7 = -1;
        }
    };

    public C26888x53a6418e(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76[] interfaceC26872x78faff76Arr) {
        this.f57821xe1450ab0 = interfaceC26872x78faff76Arr;
        int i17 = 0;
        this.f57820xff023a23 = interfaceC26872x78faff76Arr[0];
        while (true) {
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76[] interfaceC26872x78faff76Arr2 = this.f57821xe1450ab0;
            if (i17 >= interfaceC26872x78faff76Arr2.length) {
                return;
            }
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76 = interfaceC26872x78faff76Arr2[i17];
            if (interfaceC26872x78faff76 != null) {
                interfaceC26872x78faff76.registerDataSetObserver(this.f57822x39c4fa63);
            }
            i17++;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int length = this.f57821xe1450ab0.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76 = this.f57821xe1450ab0[i17];
            if (interfaceC26872x78faff76 != null) {
                interfaceC26872x78faff76.close();
            }
        }
        super.close();
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void deactivate() {
        int length = this.f57821xe1450ab0.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76 = this.f57821xe1450ab0[i17];
            if (interfaceC26872x78faff76 != null) {
                interfaceC26872x78faff76.deactivate();
            }
        }
        super.deactivate();
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public byte[] getBlob(int i17) {
        return this.f57820xff023a23.getBlob(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76 = this.f57820xff023a23;
        return interfaceC26872x78faff76 != null ? interfaceC26872x78faff76.getColumnNames() : new java.lang.String[0];
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getCount() {
        int length = this.f57821xe1450ab0.length;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76 = this.f57821xe1450ab0[i18];
            if (interfaceC26872x78faff76 != null) {
                i17 += interfaceC26872x78faff76.getCount();
            }
        }
        return i17;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public double getDouble(int i17) {
        return this.f57820xff023a23.getDouble(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public float getFloat(int i17) {
        return this.f57820xff023a23.getFloat(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getInt(int i17) {
        return this.f57820xff023a23.getInt(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public long getLong(int i17) {
        return this.f57820xff023a23.getLong(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public short getShort(int i17) {
        return this.f57820xff023a23.getShort(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String getString(int i17) {
        return this.f57820xff023a23.getString(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getType(int i17) {
        return this.f57820xff023a23.getType(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean isNull(int i17) {
        return this.f57820xff023a23.isNull(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26870x63710a65
    /* renamed from: onMove */
    public boolean mo106131xc39cb650(int i17, int i18) {
        this.f57820xff023a23 = null;
        int length = this.f57821xe1450ab0.length;
        int i19 = 0;
        int i27 = 0;
        while (true) {
            if (i19 >= length) {
                break;
            }
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76 = this.f57821xe1450ab0[i19];
            if (interfaceC26872x78faff76 != null) {
                if (i18 < interfaceC26872x78faff76.getCount() + i27) {
                    this.f57820xff023a23 = this.f57821xe1450ab0[i19];
                    break;
                }
                i27 += this.f57821xe1450ab0[i19].getCount();
            }
            i19++;
        }
        com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff762 = this.f57820xff023a23;
        if (interfaceC26872x78faff762 != null) {
            return interfaceC26872x78faff762.moveToPosition(i18 - i27);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
        int length = this.f57821xe1450ab0.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76 = this.f57821xe1450ab0[i17];
            if (interfaceC26872x78faff76 != null) {
                interfaceC26872x78faff76.registerContentObserver(contentObserver);
            }
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        int length = this.f57821xe1450ab0.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76 = this.f57821xe1450ab0[i17];
            if (interfaceC26872x78faff76 != null) {
                interfaceC26872x78faff76.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean requery() {
        int length = this.f57821xe1450ab0.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76 = this.f57821xe1450ab0[i17];
            if (interfaceC26872x78faff76 != null && !interfaceC26872x78faff76.requery()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
        int length = this.f57821xe1450ab0.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76 = this.f57821xe1450ab0[i17];
            if (interfaceC26872x78faff76 != null) {
                interfaceC26872x78faff76.unregisterContentObserver(contentObserver);
            }
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        int length = this.f57821xe1450ab0.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76 = this.f57821xe1450ab0[i17];
            if (interfaceC26872x78faff76 != null) {
                interfaceC26872x78faff76.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }
}
