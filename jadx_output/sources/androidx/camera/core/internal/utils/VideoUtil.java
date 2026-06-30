package androidx.camera.core.internal.utils;

/* loaded from: classes5.dex */
public final class VideoUtil {
    private static final java.lang.String TAG = "VideoUtil";

    private VideoUtil() {
    }

    public static java.lang.String getAbsolutePathFromUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
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
                androidx.camera.core.Logger.e(TAG, java.lang.String.format("Failed in getting absolute path for Uri %s with Exception %s", uri.toString(), e17.toString()));
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
