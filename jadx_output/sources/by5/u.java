package by5;

/* loaded from: classes13.dex */
public abstract class u {
    public static boolean a(java.lang.String str, java.lang.String str2, boolean z17) {
        java.io.File file = new java.io.File(str2);
        if (!file.isDirectory() || !file.exists()) {
            file.mkdirs();
        }
        java.io.File[] listFiles = new java.io.File(str).listFiles();
        if (listFiles == null) {
            return false;
        }
        for (int i17 = 0; i17 < listFiles.length; i17++) {
            if (listFiles[i17].isFile()) {
                if (!b(listFiles[i17], new java.io.File(new java.io.File(str2).getAbsolutePath() + java.io.File.separator + listFiles[i17].getName()))) {
                    return false;
                }
            }
            if (listFiles[i17].isDirectory() && z17) {
                if (!a(str + "/" + listFiles[i17].getName(), str2 + "/" + listFiles[i17].getName(), z17)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(java.io.File file, java.io.File file2) {
        java.io.FileOutputStream fileOutputStream;
        java.io.FileInputStream fileInputStream = null;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                fileOutputStream = new java.io.FileOutputStream(file2);
                try {
                    boolean c17 = c(fileInputStream2, fileOutputStream);
                    l(fileInputStream2);
                    l(fileOutputStream);
                    return c17;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    fileInputStream = fileInputStream2;
                    try {
                        by5.c4.d("FileUtils", "copyFile error", th);
                        l(fileInputStream);
                        l(fileOutputStream);
                        return false;
                    } catch (java.lang.Throwable th7) {
                        l(fileInputStream);
                        l(fileOutputStream);
                        throw th7;
                    }
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                fileOutputStream = null;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            fileOutputStream = null;
        }
    }

    public static boolean c(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        try {
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        outputStream.flush();
                        l(inputStream);
                        l(outputStream);
                        return true;
                    }
                    outputStream.write(bArr, 0, read);
                }
            } catch (java.io.IOException e17) {
                by5.c4.d("FileUtils", "copyFile error", e17);
                l(inputStream);
                l(outputStream);
                return false;
            }
        } catch (java.lang.Throwable th6) {
            l(inputStream);
            l(outputStream);
            throw th6;
        }
    }

    public static boolean d(java.lang.String str, java.lang.String str2) {
        return b(new java.io.File(str), new java.io.File(str2));
    }

    public static boolean e(android.content.res.AssetFileDescriptor assetFileDescriptor, java.io.File file) {
        if (assetFileDescriptor == null || file == null) {
            by5.c4.c("FileUtils", "copyFileDescriptorToFile, invalid params");
            return false;
        }
        if (file.exists() && file.isFile()) {
            file.delete();
        }
        java.io.FileOutputStream fileOutputStream = null;
        try {
            java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
            try {
                c(assetFileDescriptor.createInputStream(), fileOutputStream2);
                l(fileOutputStream2);
                return true;
            } catch (java.lang.Throwable th6) {
                th = th6;
                fileOutputStream = fileOutputStream2;
                try {
                    by5.c4.d("FileUtils", "copyFileDescriptorToFile, error", th);
                    return false;
                } finally {
                    l(fileOutputStream);
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static boolean f(java.io.InputStream inputStream, java.io.File file) {
        if (inputStream == null || file == null) {
            by5.c4.c("FileUtils", "copyStreamToFile, invalid params");
            return false;
        }
        if (file.exists() && file.isFile()) {
            file.delete();
        }
        java.io.FileOutputStream fileOutputStream = null;
        try {
            java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
            try {
                c(inputStream, fileOutputStream2);
                l(fileOutputStream2);
                return true;
            } catch (java.lang.Throwable th6) {
                th = th6;
                fileOutputStream = fileOutputStream2;
                try {
                    by5.c4.d("FileUtils", "copyStreamToFile, error", th);
                    return false;
                } finally {
                    l(fileOutputStream);
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static void g(java.io.File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        if (file.isDirectory()) {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (java.io.File file2 : listFiles) {
                    if (file2 != null && file2.exists()) {
                        if (file2.isFile()) {
                            file2.delete();
                        } else {
                            g(file2);
                        }
                    }
                }
            }
            file.delete();
        }
    }

    public static boolean h(java.lang.String str) {
        try {
            g(new java.io.File(str));
            return true;
        } catch (java.lang.Throwable th6) {
            by5.c4.f("FileUtils", java.lang.String.format("deleteAll failed, path:%s, error:%s", str, th6));
            return false;
        }
    }

    public static boolean i(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (file.exists() && file.isFile()) {
            return file.delete();
        }
        return false;
    }

    public static long j(java.io.File file, boolean z17) {
        if (!file.isFile()) {
            java.io.File[] listFiles = file.listFiles();
            long j17 = 0;
            if (listFiles != null) {
                for (java.io.File file2 : listFiles) {
                    j17 += j(file2, z17);
                }
            }
            return j17;
        }
        long length = file.length();
        if (z17 && length > 1048576) {
            by5.c4.f("FileUtils", "getFileSize, size:" + k(length) + ", file:" + file.getName() + ", path:" + file.getAbsolutePath());
        }
        return length;
    }

    public static java.lang.String k(long j17) {
        long abs = j17 == Long.MIN_VALUE ? com.tencent.wcdb.core.Database.DictDefaultMatchValue : java.lang.Math.abs(j17);
        if (abs < 1024) {
            return j17 + " B";
        }
        java.text.StringCharacterIterator stringCharacterIterator = new java.text.StringCharacterIterator("KMGTPE");
        long j18 = abs;
        for (int i17 = 40; i17 >= 0 && abs > (1152865209611504844 >> i17); i17 -= 10) {
            j18 >>= 10;
            stringCharacterIterator.next();
        }
        return java.lang.String.format("%.1f %ciB", java.lang.Double.valueOf((j18 * java.lang.Long.signum(j17)) / 1024.0d), java.lang.Character.valueOf(stringCharacterIterator.current()));
    }

    public static void l(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.lang.Throwable th6) {
            by5.c4.d("FileUtils", "closeable close failed, error", th6);
        }
    }
}
