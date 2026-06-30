package tp5;

/* loaded from: classes12.dex */
public final class b implements android.database.Cursor {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f502690i = {0, 1, 2, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public final tp5.c f502691d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Iterator f502692e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String[] f502693f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f502694g = -1;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 f502695h = null;

    public b(tp5.c cVar) {
        this.f502691d = cVar;
        this.f502692e = cVar.iterator();
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f502691d.close();
        this.f502695h = null;
        this.f502694g = -2;
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
        java.lang.String string = getString(i17);
        if (string == null) {
            charArrayBuffer.sizeCopied = 0;
            return;
        }
        char[] cArr = charArrayBuffer.data;
        if (cArr == null || cArr.length < string.length()) {
            charArrayBuffer.data = string.toCharArray();
        } else {
            string.getChars(0, string.length(), cArr, 0);
        }
        charArrayBuffer.sizeCopied = string.length();
    }

    @Override // android.database.Cursor
    public void deactivate() {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i17) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = this.f502695h;
        if (c26923xdf786992 != null) {
            return c26923xdf786992.m107054xfb7d1bf3(i17);
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f502694g);
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        return getColumnNames().length;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        if (this.f502693f == null) {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = this.f502691d.f502701f;
            int m107057xa6887a23 = c26923xdf786992.m107057xa6887a23();
            java.lang.String[] strArr = new java.lang.String[m107057xa6887a23];
            for (int i17 = 0; i17 < m107057xa6887a23; i17++) {
                strArr[i17] = c26923xdf786992.m107058x70bedef7(i17);
            }
            this.f502693f = strArr;
        }
        int length = this.f502693f.length;
        for (int i18 = 0; i18 < length; i18++) {
            if (this.f502693f[i18].equalsIgnoreCase(str)) {
                return i18;
            }
        }
        return -1;
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new java.lang.IllegalArgumentException("column '" + str + "' does not exist");
    }

    @Override // android.database.Cursor
    public java.lang.String getColumnName(int i17) {
        return getColumnNames()[i17];
    }

    @Override // android.database.Cursor
    public java.lang.String[] getColumnNames() {
        if (this.f502693f == null) {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = this.f502691d.f502701f;
            int m107057xa6887a23 = c26923xdf786992.m107057xa6887a23();
            java.lang.String[] strArr = new java.lang.String[m107057xa6887a23];
            for (int i17 = 0; i17 < m107057xa6887a23; i17++) {
                strArr[i17] = c26923xdf786992.m107058x70bedef7(i17);
            }
            this.f502693f = strArr;
        }
        return this.f502693f;
    }

    @Override // android.database.Cursor
    public int getCount() {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public double getDouble(int i17) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = this.f502695h;
        if (c26923xdf786992 != null) {
            return c26923xdf786992.m107061x160e9ec7(i17);
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f502694g);
    }

    @Override // android.database.Cursor
    public android.os.Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public float getFloat(int i17) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = this.f502695h;
        if (c26923xdf786992 != null) {
            return c26923xdf786992.m107062x746dc8a6(i17);
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f502694g);
    }

    @Override // android.database.Cursor
    public int getInt(int i17) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = this.f502695h;
        if (c26923xdf786992 != null) {
            return c26923xdf786992.m107063xb58848b9(i17);
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f502694g);
    }

    @Override // android.database.Cursor
    public long getLong(int i17) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = this.f502695h;
        if (c26923xdf786992 != null) {
            return c26923xdf786992.m107064xfb822ef2(i17);
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f502694g);
    }

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.f502694g;
    }

    @Override // android.database.Cursor
    public short getShort(int i17) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = this.f502695h;
        if (c26923xdf786992 != null) {
            return c26923xdf786992.m107077x75232ac6(i17);
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f502694g);
    }

    @Override // android.database.Cursor
    public java.lang.String getString(int i17) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = this.f502695h;
        if (c26923xdf786992 != null) {
            return c26923xdf786992.m107078xfb85ada3(i17);
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f502694g);
    }

    @Override // android.database.Cursor
    public int getType(int i17) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = this.f502695h;
        if (c26923xdf786992 != null) {
            return f502690i[c26923xdf786992.m107060x70c1f3a6(i17).ordinal()];
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f502694g);
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return this.f502694g >= 0 && this.f502695h == null;
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return this.f502694g == -1;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return this.f502694g == -2;
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.f502694g == 0 && this.f502695h != null;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public boolean isNull(int i17) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = this.f502695h;
        if (c26923xdf786992 != null) {
            return c26923xdf786992.m107060x70c1f3a6(i17) == com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Null;
        }
        throw new android.database.CursorIndexOutOfBoundsException("Cursor pointed to an invalid position: " + this.f502694g);
    }

    @Override // android.database.Cursor
    public boolean move(int i17) {
        if (i17 < 0) {
            throw new java.lang.AssertionError();
        }
        if (this.f502694g < -1) {
            throw new java.lang.IllegalStateException("Cursor is already closed");
        }
        for (int i18 = 0; i18 < i17; i18++) {
            this.f502694g++;
            tp5.e eVar = (tp5.e) this.f502692e;
            if (!eVar.hasNext()) {
                this.f502695h = null;
                return false;
            }
            this.f502695h = (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992) eVar.next();
        }
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        return moveToPosition(0);
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        return move(1);
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i17) {
        return move(i17 - this.f502694g);
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public boolean requery() {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public void setExtras(android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
        throw new java.lang.AssertionError();
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        throw new java.lang.AssertionError();
    }
}
