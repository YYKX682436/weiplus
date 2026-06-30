package v6;

/* loaded from: classes13.dex */
public class c implements v6.f {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f514909b = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final android.content.ContentResolver f514910a;

    public c(android.content.ContentResolver contentResolver) {
        this.f514910a = contentResolver;
    }

    @Override // v6.f
    public android.database.Cursor a(android.net.Uri uri) {
        return this.f514910a.query(android.provider.MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f514909b, "kind = 1 AND image_id = ?", new java.lang.String[]{uri.getLastPathSegment()}, null);
    }
}
