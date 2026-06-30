package m92;

/* loaded from: classes12.dex */
public final class k implements android.database.Cursor {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.ContentValues f406543d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f406544e;

    public k(android.content.ContentValues cv6, l75.e0 info, java.util.List coverFields) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cv6, "cv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverFields, "coverFields");
        this.f406543d = cv6;
        this.f406544e = coverFields;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public void deactivate() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i17) {
        return this.f406543d.getAsByteArray((java.lang.String) this.f406544e.get(i17));
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        return this.f406544e.size();
    }

    @Override // android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String str) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public java.lang.String getColumnName(int i17) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return (java.lang.String[]) this.f406544e.toArray(new java.lang.String[0]);
    }

    @Override // android.database.Cursor
    public int getCount() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public double getDouble(int i17) {
        java.lang.Double asDouble = this.f406543d.getAsDouble((java.lang.String) this.f406544e.get(i17));
        if (asDouble == null) {
            return 0.0d;
        }
        return asDouble.doubleValue();
    }

    @Override // android.database.Cursor
    public android.os.Bundle getExtras() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public float getFloat(int i17) {
        java.lang.Float asFloat = this.f406543d.getAsFloat((java.lang.String) this.f406544e.get(i17));
        if (asFloat == null) {
            return 0.0f;
        }
        return asFloat.floatValue();
    }

    @Override // android.database.Cursor
    public int getInt(int i17) {
        java.lang.Integer asInteger = this.f406543d.getAsInteger((java.lang.String) this.f406544e.get(i17));
        if (asInteger == null) {
            return 0;
        }
        return asInteger.intValue();
    }

    @Override // android.database.Cursor
    public long getLong(int i17) {
        java.lang.Long asLong = this.f406543d.getAsLong((java.lang.String) this.f406544e.get(i17));
        if (asLong == null) {
            return 0L;
        }
        return asLong.longValue();
    }

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public int getPosition() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public short getShort(int i17) {
        java.lang.Short asShort = this.f406543d.getAsShort((java.lang.String) this.f406544e.get(i17));
        if (asShort == null) {
            return (short) 0;
        }
        return asShort.shortValue();
    }

    @Override // android.database.Cursor
    public java.lang.String getString(int i17) {
        return this.f406543d.getAsString((java.lang.String) this.f406544e.get(i17));
    }

    @Override // android.database.Cursor
    public int getType(int i17) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public boolean isNull(int i17) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public boolean move(int i17) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i17) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public boolean requery() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public void setExtras(android.os.Bundle bundle) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ k(android.content.ContentValues r1, l75.e0 r2, java.util.List r3, int r4, p3321xbce91901.jvm.p3324x21ffc6bd.i r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto Lf
            java.lang.String[] r3 = r2.f398487c
            java.lang.String r4 = "columns"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            java.util.List r3 = kz5.z.z0(r3)
        Lf:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m92.k.<init>(android.content.ContentValues, l75.e0, java.util.List, int, kotlin.jvm.internal.i):void");
    }
}
