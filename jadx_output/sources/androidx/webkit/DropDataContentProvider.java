package androidx.webkit;

/* loaded from: classes13.dex */
public final class DropDataContentProvider extends android.content.ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface f12442d;

    public final org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface a() {
        if (this.f12442d == null) {
            org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface dropDataProvider = z4.g0.f470067a.getDropDataProvider();
            this.f12442d = dropDataProvider;
            dropDataProvider.onCreate();
        }
        return this.f12442d;
    }

    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        return a().call(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("delete method is not supported.");
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return a().getType(uri);
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
        return a().openFile(this, uri);
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return a().query(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("update method is not supported.");
    }
}
