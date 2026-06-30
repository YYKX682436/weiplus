package e95;

/* loaded from: classes11.dex */
public class j extends com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38 implements e95.h {

    /* renamed from: d, reason: collision with root package name */
    public final android.database.DataSetObserver f331954d = new e95.i(this);

    /* renamed from: e, reason: collision with root package name */
    public e95.h f331955e;

    /* renamed from: f, reason: collision with root package name */
    public final e95.h[] f331956f;

    public j(e95.h[] hVarArr) {
        this.f331956f = hVarArr;
        int i17 = 0;
        this.f331955e = hVarArr[0];
        while (true) {
            e95.h[] hVarArr2 = this.f331956f;
            if (i17 >= hVarArr2.length) {
                return;
            }
            e95.h hVar = hVarArr2[i17];
            if (hVar != null) {
                hVar.registerDataSetObserver(this.f331954d);
            }
            i17++;
        }
    }

    @Override // e95.h
    public boolean I0(int i17) {
        boolean z17 = true;
        for (e95.h hVar : this.f331956f) {
            if (hVar != null && !hVar.I0(i17)) {
                z17 = false;
            }
        }
        return z17;
    }

    @Override // e95.h
    public void Y(e95.g gVar) {
        for (e95.h hVar : this.f331956f) {
            if (hVar != null) {
                hVar.Y(gVar);
            }
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        for (e95.h hVar : this.f331956f) {
            if (hVar != null) {
                hVar.close();
            }
        }
        super.close();
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void deactivate() {
        for (e95.h hVar : this.f331956f) {
            if (hVar != null) {
                hVar.deactivate();
            }
        }
        super.deactivate();
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public byte[] getBlob(int i17) {
        return this.f331955e.getBlob(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        e95.h hVar = this.f331955e;
        return hVar != null ? hVar.getColumnNames() : new java.lang.String[0];
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getCount() {
        int i17 = 0;
        for (e95.h hVar : this.f331956f) {
            if (hVar != null) {
                i17 += hVar.getCount();
            }
        }
        return i17;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public double getDouble(int i17) {
        return this.f331955e.getDouble(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public float getFloat(int i17) {
        return this.f331955e.getFloat(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getInt(int i17) {
        return this.f331955e.getInt(i17);
    }

    @Override // e95.h
    /* renamed from: getItem */
    public e95.a mo123785xfb80e389(int i17) {
        e95.h[] hVarArr = this.f331956f;
        int length = hVarArr.length;
        for (int i18 = 0; i18 < length; i18++) {
            int count = hVarArr[i18].getCount();
            if (i17 < count) {
                return hVarArr[i18].mo123785xfb80e389(i17);
            }
            i17 -= count;
        }
        return null;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public long getLong(int i17) {
        return this.f331955e.getLong(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public short getShort(int i17) {
        return this.f331955e.getShort(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String getString(int i17) {
        return this.f331955e.getString(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean isNull(int i17) {
        return this.f331955e.isNull(i17);
    }

    @Override // e95.h
    public boolean n0(java.lang.Object obj) {
        boolean z17 = false;
        for (e95.h hVar : this.f331956f) {
            if (hVar != null && hVar.n0(obj)) {
                z17 = true;
            }
        }
        return z17;
    }

    @Override // e95.h
    public android.util.SparseArray[] n1() {
        e95.h[] hVarArr = this.f331956f;
        int length = hVarArr.length;
        android.util.SparseArray[] sparseArrayArr = new android.util.SparseArray[length];
        for (int i17 = 0; i17 < length; i17++) {
            android.util.SparseArray[] n17 = hVarArr[i17].n1();
            sparseArrayArr[i17] = n17 != null ? n17[0] : null;
        }
        return sparseArrayArr;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26870x63710a65
    /* renamed from: onMove */
    public boolean mo106131xc39cb650(int i17, int i18) {
        this.f331955e = null;
        e95.h[] hVarArr = this.f331956f;
        int length = hVarArr.length;
        int i19 = 0;
        int i27 = 0;
        while (true) {
            if (i19 >= length) {
                break;
            }
            e95.h hVar = hVarArr[i19];
            if (hVar != null) {
                if (i18 < hVar.getCount() + i27) {
                    this.f331955e = hVarArr[i19];
                    break;
                }
                i27 += hVarArr[i19].getCount();
            }
            i19++;
        }
        e95.h hVar2 = this.f331955e;
        if (hVar2 != null) {
            return hVar2.moveToPosition(i18 - i27);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
        for (e95.h hVar : this.f331956f) {
            if (hVar != null) {
                hVar.registerContentObserver(contentObserver);
            }
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        for (e95.h hVar : this.f331956f) {
            if (hVar != null) {
                hVar.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean requery() {
        for (e95.h hVar : this.f331956f) {
            if (hVar != null && !hVar.requery()) {
                return false;
            }
        }
        return true;
    }

    @Override // e95.h
    public boolean t(java.lang.Object obj, e95.a aVar) {
        boolean z17 = false;
        for (e95.h hVar : this.f331956f) {
            if (hVar != null && hVar.t(obj, aVar)) {
                z17 = true;
            }
        }
        return z17;
    }

    @Override // e95.h
    public void u(boolean z17) {
        for (e95.h hVar : this.f331956f) {
            if (hVar != null) {
                hVar.u(z17);
            }
        }
    }

    @Override // e95.h
    public void u1(int i17) {
        for (e95.h hVar : this.f331956f) {
            if (hVar != null) {
                hVar.u1(i17);
            }
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
        for (e95.h hVar : this.f331956f) {
            if (hVar != null) {
                hVar.unregisterContentObserver(contentObserver);
            }
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        for (e95.h hVar : this.f331956f) {
            if (hVar != null) {
                hVar.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // e95.h
    public boolean y() {
        boolean z17 = true;
        for (e95.h hVar : this.f331956f) {
            if (hVar != null && !hVar.y()) {
                z17 = false;
            }
        }
        return z17;
    }
}
