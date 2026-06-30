package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.Cursor */
/* loaded from: classes12.dex */
public interface InterfaceC26872x78faff76 extends android.database.Cursor {

    /* renamed from: FIELD_TYPE_BLOB */
    public static final int f57731x8713a85d = 4;

    /* renamed from: FIELD_TYPE_FLOAT */
    public static final int f57732x5b99c17c = 2;

    /* renamed from: FIELD_TYPE_INTEGER */
    public static final int f57733x7e93d45e = 1;

    /* renamed from: FIELD_TYPE_NULL */
    public static final int f57734x87193e47 = 0;

    /* renamed from: FIELD_TYPE_STRING */
    public static final int f57735x2e3fa4d1 = 3;

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // android.database.Cursor
    void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer);

    @Override // android.database.Cursor
    void deactivate();

    @Override // android.database.Cursor
    byte[] getBlob(int i17);

    @Override // android.database.Cursor
    int getColumnCount();

    @Override // android.database.Cursor
    int getColumnIndex(java.lang.String str);

    @Override // android.database.Cursor
    int getColumnIndexOrThrow(java.lang.String str);

    @Override // android.database.Cursor
    java.lang.String getColumnName(int i17);

    @Override // android.database.Cursor
    java.lang.String[] getColumnNames();

    @Override // android.database.Cursor
    int getCount();

    @Override // android.database.Cursor
    double getDouble(int i17);

    @Override // android.database.Cursor
    android.os.Bundle getExtras();

    @Override // android.database.Cursor
    float getFloat(int i17);

    @Override // android.database.Cursor
    int getInt(int i17);

    @Override // android.database.Cursor
    long getLong(int i17);

    @Override // android.database.Cursor
    int getPosition();

    @Override // android.database.Cursor
    short getShort(int i17);

    @Override // android.database.Cursor
    java.lang.String getString(int i17);

    @Override // android.database.Cursor
    int getType(int i17);

    @Override // android.database.Cursor
    boolean getWantsAllOnMoveCalls();

    @Override // android.database.Cursor
    boolean isAfterLast();

    @Override // android.database.Cursor
    boolean isBeforeFirst();

    @Override // android.database.Cursor
    boolean isClosed();

    @Override // android.database.Cursor
    boolean isFirst();

    @Override // android.database.Cursor
    boolean isLast();

    @Override // android.database.Cursor
    boolean isNull(int i17);

    @Override // android.database.Cursor
    boolean move(int i17);

    @Override // android.database.Cursor
    boolean moveToFirst();

    @Override // android.database.Cursor
    boolean moveToLast();

    @Override // android.database.Cursor
    boolean moveToNext();

    @Override // android.database.Cursor
    boolean moveToPosition(int i17);

    @Override // android.database.Cursor
    boolean moveToPrevious();

    @Override // android.database.Cursor
    void registerContentObserver(android.database.ContentObserver contentObserver);

    @Override // android.database.Cursor
    void registerDataSetObserver(android.database.DataSetObserver dataSetObserver);

    @Override // android.database.Cursor
    @java.lang.Deprecated
    boolean requery();

    @Override // android.database.Cursor
    android.os.Bundle respond(android.os.Bundle bundle);

    @Override // android.database.Cursor
    void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri);

    @Override // android.database.Cursor
    void unregisterContentObserver(android.database.ContentObserver contentObserver);

    @Override // android.database.Cursor
    void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver);
}
