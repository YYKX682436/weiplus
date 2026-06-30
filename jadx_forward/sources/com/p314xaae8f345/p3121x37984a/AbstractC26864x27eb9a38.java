package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.AbstractCursor */
/* loaded from: classes12.dex */
public abstract class AbstractC26864x27eb9a38 implements com.p314xaae8f345.p3121x37984a.InterfaceC26870x63710a65 {
    private static final java.lang.String TAG = "Cursor";

    /* renamed from: mClosed */
    protected boolean f57703xfe820839;

    /* renamed from: mContentResolver */
    protected android.content.ContentResolver f57705x4bcbfb72;

    /* renamed from: mNotifyUri */
    private android.net.Uri f57709xec16cf76;

    /* renamed from: mSelfObserver */
    private android.database.ContentObserver f57712x57e934f;

    /* renamed from: mSelfObserverRegistered */
    private boolean f57714xc92f731;

    /* renamed from: mSelfObserverLock */
    private final java.lang.Object f57713x327a8d1a = new java.lang.Object();

    /* renamed from: mDataSetObservable */
    private final android.database.DataSetObservable f57707x303706ce = new android.database.DataSetObservable();

    /* renamed from: mContentObservable */
    private final android.database.ContentObservable f57704xe84e09af = new android.database.ContentObservable();

    /* renamed from: mExtras */
    private android.os.Bundle f57708x2971530 = android.os.Bundle.EMPTY;

    /* renamed from: mPos */
    protected int f57710x32c6a7 = -1;

    /* renamed from: mRowIdColumnIndex */
    @java.lang.Deprecated
    protected int f57711xc27989d4 = -1;

    /* renamed from: mCurrentRowID */
    @java.lang.Deprecated
    protected java.lang.Long f57706xee69a389 = null;

    /* renamed from: mUpdatedRows */
    @java.lang.Deprecated
    protected java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> f57715x88161287 = new java.util.HashMap<>();

    /* renamed from: com.tencent.wcdb.AbstractCursor$SelfContentObserver */
    /* loaded from: classes12.dex */
    public static class SelfContentObserver extends android.database.ContentObserver {

        /* renamed from: mCursor */
        java.lang.ref.WeakReference<com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38> f57716xff023a23;

        public SelfContentObserver(com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38 abstractC26864x27eb9a38) {
            super(null);
            this.f57716xff023a23 = new java.lang.ref.WeakReference<>(abstractC26864x27eb9a38);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return false;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z17) {
            com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38 abstractC26864x27eb9a38 = this.f57716xff023a23.get();
            if (abstractC26864x27eb9a38 != null) {
                abstractC26864x27eb9a38.m106129x3dcbea6f(false);
            }
        }
    }

    /* renamed from: checkPosition */
    public void mo106123xbc7f5a51() {
        if (-1 == this.f57710x32c6a7 || getCount() == this.f57710x32c6a7) {
            throw new com.p314xaae8f345.p3121x37984a.C26873x6901bdb1(this.f57710x32c6a7, getCount());
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f57703xfe820839 = true;
        this.f57704xe84e09af.unregisterAll();
        mo106130x24edfea2();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
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

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void deactivate() {
        mo106130x24edfea2();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26870x63710a65
    /* renamed from: fillWindow */
    public void mo106124xe3e54f53(int i17, com.p314xaae8f345.p3121x37984a.C26876xa70fd706 c26876xa70fd706) {
        com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106234x4e58b49(this, i17, c26876xa70fd706);
    }

    /* renamed from: finalize */
    public void mo106125xd764dc1e() {
        android.database.ContentObserver contentObserver = this.f57712x57e934f;
        if (contentObserver != null && this.f57714xc92f731) {
            this.f57705x4bcbfb72.unregisterContentObserver(contentObserver);
        }
        try {
            if (this.f57703xfe820839) {
                return;
            }
            close();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public byte[] getBlob(int i17) {
        throw new java.lang.UnsupportedOperationException("getBlob is not supported");
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getColumnCount() {
        return getColumnNames().length;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "requesting column name with table name -- ".concat(str), new java.lang.Exception());
            str = str.substring(lastIndexOf + 1);
        }
        java.lang.String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (columnNames[i17].equalsIgnoreCase(str)) {
                return i17;
            }
        }
        return -1;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new java.lang.IllegalArgumentException("column '" + str + "' does not exist");
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String getColumnName(int i17) {
        return getColumnNames()[i17];
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public abstract java.lang.String[] getColumnNames();

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public abstract int getCount();

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public abstract double getDouble(int i17);

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public android.os.Bundle getExtras() {
        return this.f57708x2971530;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public abstract float getFloat(int i17);

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public abstract int getInt(int i17);

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public abstract long getLong(int i17);

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
        return this.f57709xec16cf76;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public final int getPosition() {
        return this.f57710x32c6a7;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public abstract short getShort(int i17);

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public abstract java.lang.String getString(int i17);

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getType(int i17) {
        return 3;
    }

    @java.lang.Deprecated
    /* renamed from: getUpdatedField */
    public java.lang.Object m106126x435d9f75(int i17) {
        return null;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26870x63710a65
    /* renamed from: getWindow */
    public com.p314xaae8f345.p3121x37984a.C26876xa70fd706 mo106127x3622fee6() {
        return null;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public final boolean isAfterLast() {
        return getCount() == 0 || this.f57710x32c6a7 == getCount();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public final boolean isBeforeFirst() {
        return getCount() == 0 || this.f57710x32c6a7 == -1;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean isClosed() {
        return this.f57703xfe820839;
    }

    @java.lang.Deprecated
    /* renamed from: isFieldUpdated */
    public boolean m106128xcc419cab(int i17) {
        return false;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public final boolean isFirst() {
        return this.f57710x32c6a7 == 0 && getCount() != 0;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public final boolean isLast() {
        int count = getCount();
        return this.f57710x32c6a7 == count + (-1) && count != 0;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public abstract boolean isNull(int i17);

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public final boolean move(int i17) {
        return moveToPosition(this.f57710x32c6a7 + i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public final boolean moveToNext() {
        return moveToPosition(this.f57710x32c6a7 + 1);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean moveToPosition(int i17) {
        int count = getCount();
        if (i17 >= count) {
            this.f57710x32c6a7 = count;
            return false;
        }
        if (i17 < 0) {
            this.f57710x32c6a7 = -1;
            return false;
        }
        int i18 = this.f57710x32c6a7;
        if (i17 == i18) {
            return true;
        }
        boolean mo106131xc39cb650 = mo106131xc39cb650(i18, i17);
        if (mo106131xc39cb650) {
            this.f57710x32c6a7 = i17;
            int i19 = this.f57711xc27989d4;
            if (i19 != -1) {
                this.f57706xee69a389 = java.lang.Long.valueOf(getLong(i19));
            }
        } else {
            this.f57710x32c6a7 = -1;
        }
        return mo106131xc39cb650;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public final boolean moveToPrevious() {
        return moveToPosition(this.f57710x32c6a7 - 1);
    }

    /* renamed from: onChange */
    public void m106129x3dcbea6f(boolean z17) {
        synchronized (this.f57713x327a8d1a) {
            this.f57704xe84e09af.dispatchChange(z17);
            android.net.Uri uri = this.f57709xec16cf76;
            if (uri != null && z17) {
                this.f57705x4bcbfb72.notifyChange(uri, this.f57712x57e934f);
            }
        }
    }

    /* renamed from: onDeactivateOrClose */
    public void mo106130x24edfea2() {
        android.database.ContentObserver contentObserver = this.f57712x57e934f;
        if (contentObserver != null) {
            this.f57705x4bcbfb72.unregisterContentObserver(contentObserver);
            this.f57714xc92f731 = false;
        }
        this.f57707x303706ce.notifyInvalidated();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26870x63710a65
    /* renamed from: onMove */
    public boolean mo106131xc39cb650(int i17, int i18) {
        return true;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
        this.f57704xe84e09af.registerObserver(contentObserver);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.f57707x303706ce.registerObserver(dataSetObserver);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean requery() {
        android.database.ContentObserver contentObserver = this.f57712x57e934f;
        if (contentObserver != null && !this.f57714xc92f731) {
            this.f57705x4bcbfb72.registerContentObserver(this.f57709xec16cf76, true, contentObserver);
            this.f57714xc92f731 = true;
        }
        this.f57707x303706ce.notifyChanged();
        return true;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        return android.os.Bundle.EMPTY;
    }

    @Override // android.database.Cursor
    public void setExtras(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = android.os.Bundle.EMPTY;
        }
        this.f57708x2971530 = bundle;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        synchronized (this.f57713x327a8d1a) {
            this.f57709xec16cf76 = uri;
            this.f57705x4bcbfb72 = contentResolver;
            android.database.ContentObserver contentObserver = this.f57712x57e934f;
            if (contentObserver != null) {
                contentResolver.unregisterContentObserver(contentObserver);
            }
            com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38.SelfContentObserver selfContentObserver = new com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38.SelfContentObserver(this);
            this.f57712x57e934f = selfContentObserver;
            this.f57705x4bcbfb72.registerContentObserver(this.f57709xec16cf76, true, selfContentObserver);
            this.f57714xc92f731 = true;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
        if (this.f57703xfe820839) {
            return;
        }
        this.f57704xe84e09af.unregisterObserver(contentObserver);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.f57707x303706ce.unregisterObserver(dataSetObserver);
    }
}
