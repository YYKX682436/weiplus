package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.CursorWrapper */
/* loaded from: classes12.dex */
public class C26878x4994ec3d implements com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 {

    /* renamed from: mCursor */
    protected final com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 f57760xff023a23;

    public C26878x4994ec3d(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76) {
        this.f57760xff023a23 = interfaceC26872x78faff76;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f57760xff023a23.close();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
        this.f57760xff023a23.copyStringToBuffer(i17, charArrayBuffer);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void deactivate() {
        this.f57760xff023a23.deactivate();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public byte[] getBlob(int i17) {
        return this.f57760xff023a23.getBlob(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getColumnCount() {
        return this.f57760xff023a23.getColumnCount();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        return this.f57760xff023a23.getColumnIndex(str);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String str) {
        return this.f57760xff023a23.getColumnIndexOrThrow(str);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String getColumnName(int i17) {
        return this.f57760xff023a23.getColumnName(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.f57760xff023a23.getColumnNames();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getCount() {
        return this.f57760xff023a23.getCount();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public double getDouble(int i17) {
        return this.f57760xff023a23.getDouble(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public android.os.Bundle getExtras() {
        return this.f57760xff023a23.getExtras();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public float getFloat(int i17) {
        return this.f57760xff023a23.getFloat(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getInt(int i17) {
        return this.f57760xff023a23.getInt(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public long getLong(int i17) {
        return this.f57760xff023a23.getLong(i17);
    }

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
        return null;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getPosition() {
        return this.f57760xff023a23.getPosition();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public short getShort(int i17) {
        return this.f57760xff023a23.getShort(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String getString(int i17) {
        return this.f57760xff023a23.getString(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getType(int i17) {
        return this.f57760xff023a23.getType(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return this.f57760xff023a23.getWantsAllOnMoveCalls();
    }

    /* renamed from: getWrappedCursor */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m106222x50de0885() {
        return this.f57760xff023a23;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean isAfterLast() {
        return this.f57760xff023a23.isAfterLast();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean isBeforeFirst() {
        return this.f57760xff023a23.isBeforeFirst();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean isClosed() {
        return this.f57760xff023a23.isClosed();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean isFirst() {
        return this.f57760xff023a23.isFirst();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean isLast() {
        return this.f57760xff023a23.isLast();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean isNull(int i17) {
        return this.f57760xff023a23.isNull(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean move(int i17) {
        return this.f57760xff023a23.move(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean moveToFirst() {
        return this.f57760xff023a23.moveToFirst();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean moveToLast() {
        return this.f57760xff023a23.moveToLast();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean moveToNext() {
        return this.f57760xff023a23.moveToNext();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean moveToPosition(int i17) {
        return this.f57760xff023a23.moveToPosition(i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean moveToPrevious() {
        return this.f57760xff023a23.moveToPrevious();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
        this.f57760xff023a23.registerContentObserver(contentObserver);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.f57760xff023a23.registerDataSetObserver(dataSetObserver);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean requery() {
        return this.f57760xff023a23.requery();
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        return this.f57760xff023a23.respond(bundle);
    }

    @Override // android.database.Cursor
    public void setExtras(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        this.f57760xff023a23.setNotificationUri(contentResolver, uri);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
        this.f57760xff023a23.unregisterContentObserver(contentObserver);
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.f57760xff023a23.unregisterDataSetObserver(dataSetObserver);
    }
}
