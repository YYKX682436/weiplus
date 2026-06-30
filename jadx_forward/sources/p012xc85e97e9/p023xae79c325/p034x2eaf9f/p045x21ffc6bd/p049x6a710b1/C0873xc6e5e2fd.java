package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1;

/* renamed from: androidx.camera.core.internal.utils.VideoUtil */
/* loaded from: classes5.dex */
public final class C0873xc6e5e2fd {
    private static final java.lang.String TAG = "VideoUtil";

    private C0873xc6e5e2fd() {
    }

    /* renamed from: getAbsolutePathFromUri */
    public static java.lang.String m6244x891c8450(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new java.lang.String[]{"_data"}, null, null, null);
                cursor.getClass();
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
                cursor.moveToFirst();
                java.lang.String string = cursor.getString(columnIndexOrThrow);
                cursor.close();
                return string;
            } catch (java.lang.RuntimeException e17) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, java.lang.String.format("Failed in getting absolute path for Uri %s with Exception %s", uri.toString(), e17.toString()));
                if (cursor != null) {
                    cursor.close();
                }
                return "";
            }
        } catch (java.lang.Throwable th6) {
            if (cursor != null) {
                cursor.close();
            }
            throw th6;
        }
    }
}
