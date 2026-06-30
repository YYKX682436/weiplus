package fp;

/* loaded from: classes12.dex */
public abstract class r {
    public static final void a(android.content.Context context, java.io.File file, java.lang.String name, java.lang.String mimeType) {
        java.io.OutputStream fileOutputStream;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(file, "file");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mimeType, "mimeType");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("relative_path", android.os.Environment.DIRECTORY_DOWNLOADS);
            contentValues.put("_display_name", name);
            contentValues.put("mime_type", mimeType);
            android.content.ContentResolver contentResolver = context.getContentResolver();
            android.net.Uri insert = contentResolver.insert(android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
            fileOutputStream = insert != null ? contentResolver.openOutputStream(insert) : null;
            if (fileOutputStream == null) {
                throw new java.lang.RuntimeException("Cannot create stream for inserting file with content resolver");
            }
        } else {
            fileOutputStream = new java.io.FileOutputStream(new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS), name));
        }
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                vz5.a.b(fileInputStream, fileOutputStream, 0, 2, null);
                vz5.b.a(fileInputStream, null);
                vz5.b.a(fileOutputStream, null);
            } finally {
            }
        } finally {
        }
    }
}
