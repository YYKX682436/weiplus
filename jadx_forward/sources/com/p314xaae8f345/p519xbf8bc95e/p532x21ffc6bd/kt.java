package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class kt {

    /* renamed from: a, reason: collision with root package name */
    private static final int f131723a = 4096;

    public static final void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static byte[] b(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        if (inputStream == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        } catch (java.lang.Throwable unused) {
            byteArrayOutputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr, 0, 4096);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    a(byteArrayOutputStream);
                    return byteArray;
                }
            }
        } catch (java.lang.Throwable unused2) {
            a(byteArrayOutputStream);
            return null;
        }
    }

    public static boolean c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        java.util.Stack stack = new java.util.Stack();
        stack.push(str);
        while (!stack.isEmpty()) {
            java.io.File file = new java.io.File((java.lang.String) stack.peek());
            if (file.exists()) {
                if (file.isDirectory()) {
                    java.io.File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        if (listFiles.length == 0) {
                            file.delete();
                            stack.pop();
                        } else {
                            for (java.io.File file2 : listFiles) {
                                if (file2.isDirectory()) {
                                    stack.push(file2.getAbsolutePath());
                                } else {
                                    file2.delete();
                                }
                            }
                        }
                    }
                } else {
                    file.delete();
                    stack.pop();
                }
            } else {
                stack.pop();
            }
        }
        return true;
    }

    public static byte[] a(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        if (inputStream == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        } catch (java.lang.Throwable unused) {
            byteArrayOutputStream = null;
        }
        try {
            byte[] bArr = new byte[102400];
            do {
                int read = inputStream.read(bArr, 0, 102400);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } while (byteArrayOutputStream.size() < 102400);
            byteArrayOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            a(byteArrayOutputStream);
            return byteArray;
        } catch (java.lang.Throwable unused2) {
            a(byteArrayOutputStream);
            return null;
        }
    }

    public static final java.io.InputStream b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(new java.io.File(str));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static final long a(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        if (inputStream == null) {
            return -1L;
        }
        try {
            byte[] bArr = new byte[4096];
            long j17 = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    return j17;
                }
                outputStream.write(bArr, 0, read);
                j17 += read;
            }
        } catch (java.io.IOException unused) {
            return -1L;
        }
    }

    private static int a(byte[] bArr, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return 0;
        }
        return a(bArr, new java.io.File(str));
    }

    public static int a(byte[] bArr, java.io.File file) {
        if (bArr != null && bArr.length != 0 && !file.isDirectory()) {
            java.io.FileOutputStream fileOutputStream = null;
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file, false);
                try {
                    fileOutputStream2.write(bArr);
                    fileOutputStream2.flush();
                    int length = bArr.length;
                    a(fileOutputStream2);
                    return length;
                } catch (java.io.IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    a(fileOutputStream);
                    return 0;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    fileOutputStream = fileOutputStream2;
                    a(fileOutputStream);
                    throw th;
                }
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }
        return 0;
    }

    private static boolean c(java.io.InputStream inputStream) {
        if (inputStream != null) {
            try {
                if (inputStream.available() > 0) {
                    return true;
                }
            } catch (java.io.IOException unused) {
            }
        }
        return false;
    }

    public static boolean a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            java.io.File file = new java.io.File(str);
            if (file.exists() && file.isDirectory()) {
                return true;
            }
            if (file.exists() && file.isFile()) {
                file.delete();
            }
            return file.mkdirs();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static final java.io.InputStream a(java.io.File file) {
        try {
            if (file.exists() && file.isFile() && file.canRead()) {
                return new java.io.FileInputStream(file);
            }
            return null;
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    private static boolean a(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            return file.renameTo(new java.io.File(str2));
        }
        return false;
    }

    public static void a(android.graphics.Bitmap... bitmapArr) {
        if (bitmapArr != null) {
            for (android.graphics.Bitmap bitmap : bitmapArr) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
    }

    private static void a(byte[] bArr, java.io.OutputStream outputStream) {
        if (bArr != null && bArr.length != 0 && outputStream != null) {
            try {
                outputStream.write(bArr);
            } catch (java.io.IOException unused) {
            }
        }
    }
}
