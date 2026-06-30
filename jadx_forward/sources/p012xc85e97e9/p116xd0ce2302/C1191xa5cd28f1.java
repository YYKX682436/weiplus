package p012xc85e97e9.p116xd0ce2302;

/* renamed from: androidx.webkit.DropDataContentProvider */
/* loaded from: classes13.dex */
public final class C1191xa5cd28f1 extends android.content.ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public org.p3343x72743996.p3360x5ff5cf14.InterfaceC29647xe902b3e f93975d;

    public final org.p3343x72743996.p3360x5ff5cf14.InterfaceC29647xe902b3e a() {
        if (this.f93975d == null) {
            org.p3343x72743996.p3360x5ff5cf14.InterfaceC29647xe902b3e mo178383x2f110bc0 = z4.g0.f551600a.mo178383x2f110bc0();
            this.f93975d = mo178383x2f110bc0;
            mo178383x2f110bc0.m154338x3e5a77bb();
        }
        return this.f93975d;
    }

    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        return a().m154335x2e7a5e(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("delete method is not supported.");
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return a().m154337xfb85f7b0(uri);
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException("Insert method is not supported.");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) {
        return a().m154340xe1e55ae6(this, uri);
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return a().m154341x66f18c8(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("update method is not supported.");
    }
}
