package u6;

/* loaded from: classes7.dex */
public final class a extends u6.r {
    @Override // u6.e
    public java.lang.Class a() {
        return android.content.res.AssetFileDescriptor.class;
    }

    @Override // u6.r
    public void c(java.lang.Object obj) {
        ((android.content.res.AssetFileDescriptor) obj).close();
    }

    @Override // u6.r
    public java.lang.Object d(android.net.Uri uri, android.content.ContentResolver contentResolver) {
        android.content.res.AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new java.io.FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
