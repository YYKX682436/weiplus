package org.p3343x72743996.p3344x2e06d1;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "base::android")
/* renamed from: org.chromium.base.FileUtils */
/* loaded from: classes12.dex */
public class C29305x28705875 {

    /* renamed from: DELETE_ALL */
    public static java.util.function.Function<java.lang.String, java.lang.Boolean> f73287x862ad8ed = new org.p3343x72743996.p3344x2e06d1.C29306xe9c6634c();
    private static final java.lang.String TAG = "FileUtils";

    /* renamed from: _hellAccFlag_ */
    private byte f73288x7f11beae;

    /* renamed from: org.chromium.base.FileUtils$Natives */
    /* loaded from: classes12.dex */
    public interface Natives {
        /* renamed from: getAbsoluteFilePath */
        java.lang.String mo152425xbb4d21ce(java.lang.String str);
    }

    /* renamed from: batchDeleteFiles */
    public static void m152414x3a76fff2(java.util.List<java.lang.String> list, java.util.function.Function<java.lang.String, java.lang.Boolean> function) {
        for (java.lang.String str : list) {
            if (function == null || function.apply(str).booleanValue()) {
                if (org.p3343x72743996.p3344x2e06d1.AbstractC29295x1589a61e.m152338x912f96fd(str)) {
                    org.p3343x72743996.p3344x2e06d1.AbstractC29295x1589a61e.m152331xb06685ab(str);
                } else {
                    java.io.File file = new java.io.File(str);
                    if (file.exists()) {
                        m152424x2ea0e866(file, function);
                    }
                }
            }
        }
    }

    /* renamed from: copyStream */
    public static void m152415xc9a2bf55(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    /* renamed from: copyStreamToFile */
    public static void m152416x745dda4c(java.io.InputStream inputStream, java.io.File file) {
        java.io.File file2 = new java.io.File(file.getPath() + ".tmp");
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
        try {
            org.p3343x72743996.p3344x2e06d1.Log.i(TAG, "Writing to %s", file);
            m152415xc9a2bf55(inputStream, fileOutputStream);
            fileOutputStream.close();
            if (!file2.renameTo(file)) {
                throw new java.io.IOException();
            }
        } catch (java.lang.Throwable th6) {
            try {
                fileOutputStream.close();
            } catch (java.lang.Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }

    /* renamed from: getAbsoluteFilePath */
    public static java.lang.String m152417xbb4d21ce(java.lang.String str) {
        return org.p3343x72743996.p3344x2e06d1.C29307xe9c6faf0.get().mo152425xbb4d21ce(str);
    }

    /* renamed from: getExtension */
    public static java.lang.String m152418xdaea8d89(java.lang.String str) {
        int lastIndexOf = str.lastIndexOf(47);
        int lastIndexOf2 = str.lastIndexOf(46);
        return lastIndexOf >= lastIndexOf2 ? "" : str.substring(lastIndexOf2 + 1).toLowerCase(java.util.Locale.US);
    }

    /* renamed from: getFileSizeBytes */
    public static long m152419xb25e1b18(java.io.File file) {
        long j17 = 0;
        if (file == null) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0L;
        }
        for (java.io.File file2 : listFiles) {
            j17 += m152419xb25e1b18(file2);
        }
        return j17;
    }

    /* renamed from: getUriForFile */
    public static android.net.Uri m152420x706c42cf(java.io.File file) {
        android.net.Uri uri;
        try {
            uri = org.p3343x72743996.p3344x2e06d1.AbstractC29295x1589a61e.m152333x8d2d198f(file);
        } catch (java.lang.IllegalArgumentException e17) {
            org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Could not create content uri: " + e17);
            uri = null;
        }
        return uri == null ? android.net.Uri.fromFile(file) : uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$static$0 */
    public static /* synthetic */ java.lang.Boolean m152421xdec287b7(java.lang.String str) {
        return java.lang.Boolean.TRUE;
    }

    /* renamed from: queryBitmapFromContentProvider */
    public static android.graphics.Bitmap m152422xedc5f6e9(android.content.Context context, android.net.Uri uri) {
        try {
            android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            try {
                if (openFileDescriptor == null) {
                    org.p3343x72743996.p3344x2e06d1.Log.w(TAG, "Null ParcelFileDescriptor from uri " + uri);
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                java.io.FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                if (fileDescriptor == null) {
                    org.p3343x72743996.p3344x2e06d1.Log.w(TAG, "Null FileDescriptor from uri " + uri);
                    openFileDescriptor.close();
                    return null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(fileDescriptor);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "org/chromium/base/FileUtils", "queryBitmapFromContentProvider", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeFileDescriptor = android.graphics.BitmapFactory.decodeFileDescriptor((java.io.FileDescriptor) arrayList.get(0));
                yj0.a.e(obj, decodeFileDescriptor, "org/chromium/base/FileUtils", "queryBitmapFromContentProvider", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;");
                if (decodeFileDescriptor != null) {
                    openFileDescriptor.close();
                    return decodeFileDescriptor;
                }
                org.p3343x72743996.p3344x2e06d1.Log.w(TAG, "Failed to decode image from uri " + uri);
                openFileDescriptor.close();
                return null;
            } finally {
            }
        } catch (java.io.IOException unused) {
            org.p3343x72743996.p3344x2e06d1.Log.w(TAG, "IO exception when reading uri " + uri);
            return null;
        }
    }

    /* renamed from: readStream */
    public static byte[] m152423xe22f8cb6(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        m152415xc9a2bf55(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: recursivelyDeleteFile */
    public static boolean m152424x2ea0e866(java.io.File file, java.util.function.Function<java.lang.String, java.lang.Boolean> function) {
        java.io.File[] listFiles;
        if (!file.exists()) {
            file.delete();
            return true;
        }
        if (function != null && !function.apply(file.getPath()).booleanValue()) {
            return true;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (java.io.File file2 : listFiles) {
                m152424x2ea0e866(file2, function);
            }
        }
        boolean delete = file.delete();
        if (!delete) {
            org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Failed to delete: %s", file);
        }
        return delete;
    }
}
