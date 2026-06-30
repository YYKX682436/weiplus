package d95;

/* loaded from: classes12.dex */
public class y implements android.database.Cursor, l75.h0 {

    /* renamed from: d, reason: collision with root package name */
    public android.database.Cursor f309245d;

    /* renamed from: e, reason: collision with root package name */
    public final d95.x f309246e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.CancellationSignal f309247f = new android.os.CancellationSignal();

    public y(d95.x xVar) {
        this.f309246e = xVar;
    }

    @Override // l75.h0
    public boolean a() {
        return this.f309247f.isCanceled();
    }

    public final void b() {
        if (this.f309245d == null) {
            d95.C28212x380127 c28212x380127 = (d95.C28212x380127) this.f309246e;
            com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7 c26914xabb259c7 = c28212x380127.f309256a.f309251a;
            java.lang.String[] strArr = c28212x380127.f309258c;
            java.lang.String str = c28212x380127.f309257b;
            android.database.Cursor m106508x1d3f4980 = c26914xabb259c7.m106508x1d3f4980(str, strArr, this.f309247f);
            d95.z.L(m106508x1d3f4980, str);
            this.f309245d = m106508x1d3f4980;
        }
    }

    @Override // l75.h0
    /* renamed from: cancel */
    public void mo123787xae7a2e7a() {
        this.f309247f.cancel();
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        android.database.Cursor cursor = this.f309245d;
        if (cursor != null) {
            cursor.close();
        }
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
        b();
        this.f309245d.copyStringToBuffer(i17, charArrayBuffer);
    }

    @Override // android.database.Cursor
    public void deactivate() {
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i17) {
        b();
        return this.f309245d.getBlob(i17);
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        b();
        return this.f309245d.getColumnCount();
    }

    @Override // android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        b();
        return this.f309245d.getColumnIndex(str);
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String str) {
        b();
        return this.f309245d.getColumnIndexOrThrow(str);
    }

    @Override // android.database.Cursor
    public java.lang.String getColumnName(int i17) {
        b();
        return this.f309245d.getColumnName(i17);
    }

    @Override // android.database.Cursor
    public java.lang.String[] getColumnNames() {
        b();
        return this.f309245d.getColumnNames();
    }

    @Override // android.database.Cursor
    public int getCount() {
        b();
        return this.f309245d.getCount();
    }

    @Override // android.database.Cursor
    public double getDouble(int i17) {
        b();
        return this.f309245d.getDouble(i17);
    }

    @Override // android.database.Cursor
    public android.os.Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public float getFloat(int i17) {
        b();
        return this.f309245d.getFloat(i17);
    }

    @Override // android.database.Cursor
    public int getInt(int i17) {
        b();
        return this.f309245d.getInt(i17);
    }

    @Override // android.database.Cursor
    public long getLong(int i17) {
        b();
        return this.f309245d.getLong(i17);
    }

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getPosition() {
        b();
        return this.f309245d.getPosition();
    }

    @Override // android.database.Cursor
    public short getShort(int i17) {
        b();
        return this.f309245d.getShort(i17);
    }

    @Override // android.database.Cursor
    public java.lang.String getString(int i17) {
        b();
        return this.f309245d.getString(i17);
    }

    @Override // android.database.Cursor
    public int getType(int i17) {
        b();
        return this.f309245d.getType(i17);
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        b();
        return this.f309245d.isAfterLast();
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        b();
        return this.f309245d.isBeforeFirst();
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        android.database.Cursor cursor = this.f309245d;
        if (cursor == null) {
            return true;
        }
        return cursor.isClosed();
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        b();
        return this.f309245d.isFirst();
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        b();
        return this.f309245d.isLast();
    }

    @Override // android.database.Cursor
    public boolean isNull(int i17) {
        b();
        return this.f309245d.isNull(i17);
    }

    @Override // android.database.Cursor
    public boolean move(int i17) {
        b();
        return this.f309245d.move(i17);
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        b();
        return this.f309245d.moveToFirst();
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        b();
        return this.f309245d.moveToLast();
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        b();
        return this.f309245d.moveToNext();
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i17) {
        b();
        return this.f309245d.moveToPosition(i17);
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        b();
        return this.f309245d.moveToPrevious();
    }

    @Override // android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public boolean requery() {
        return false;
    }

    @Override // android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        return null;
    }

    @Override // android.database.Cursor
    public void setExtras(android.os.Bundle bundle) {
    }

    @Override // android.database.Cursor
    public void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }
}
