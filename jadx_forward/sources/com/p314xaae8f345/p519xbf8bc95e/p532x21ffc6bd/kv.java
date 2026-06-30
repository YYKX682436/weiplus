package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes12.dex */
public final class kv {

    /* renamed from: a, reason: collision with root package name */
    private static final int f131725a = 49152;

    public static java.io.File a(java.io.File file, java.lang.String str) {
        if (file == null || !file.exists()) {
            return null;
        }
        java.io.File file2 = new java.io.File(str, file.getName() + ".zip");
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
        java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(fileOutputStream);
        try {
            if (file.isDirectory()) {
                java.io.File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (java.io.File file3 : listFiles) {
                        a(file3, zipOutputStream, file.getName());
                    }
                }
            } else {
                a(file, zipOutputStream, (java.lang.String) null);
            }
            fileOutputStream.flush();
            zipOutputStream.finish();
            return file2;
        } finally {
            fileOutputStream.close();
            zipOutputStream.close();
        }
    }

    public static void b(java.io.File file, java.lang.String str) {
        a(file, str, (java.io.FilenameFilter) null);
    }

    private static void c(java.io.File file, java.lang.String str) {
        try {
            a(new java.io.FileInputStream(file), new java.io.File(str));
        } catch (java.lang.Exception unused) {
        }
    }

    private static byte[] b(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    private static byte[] c(byte[] bArr) {
        return a(new java.io.ByteArrayInputStream(bArr));
    }

    private static void a(java.io.File file, java.util.zip.ZipOutputStream zipOutputStream, java.lang.String str) {
        java.lang.String str2;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (java.io.File file2 : listFiles) {
                    if (!file2.isDirectory()) {
                        str2 = str;
                    } else if (android.text.TextUtils.isEmpty(str)) {
                        str2 = file2.getName();
                    } else {
                        str2 = str + java.io.File.separator + file2.getName();
                    }
                    a(file2, zipOutputStream, str2);
                }
                return;
            }
            return;
        }
        byte[] bArr = new byte[f131725a];
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        zipOutputStream.setLevel(9);
        zipOutputStream.setMethod(8);
        zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(android.text.TextUtils.isEmpty(str) ? file.getName() : str + java.io.File.separator + file.getName()));
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read != -1) {
                zipOutputStream.write(bArr, 0, read);
            } else {
                zipOutputStream.closeEntry();
                fileInputStream.close();
                return;
            }
        }
    }

    public static void a(java.io.File file, java.lang.String str, java.io.FilenameFilter filenameFilter) {
        java.io.File file2 = new java.io.File(str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(file);
        byte[] bArr = new byte[f131725a];
        java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            java.util.zip.ZipEntry nextElement = entries.nextElement();
            java.lang.String name = nextElement.getName();
            if (name == null || (!name.contains("../") && !name.contains("..") && !name.startsWith("/"))) {
                if (filenameFilter == null || filenameFilter.accept(file2, nextElement.getName())) {
                    if (nextElement.isDirectory()) {
                        new java.io.File(str + java.io.File.separator + nextElement.getName()).mkdir();
                    } else {
                        java.io.InputStream inputStream = zipFile.getInputStream(nextElement);
                        java.io.File file3 = new java.io.File(str + java.io.File.separator + nextElement.getName());
                        if (!file3.exists()) {
                            java.io.File parentFile = file3.getParentFile();
                            if (!parentFile.exists()) {
                                parentFile.mkdirs();
                            }
                            file3.createNewFile();
                        }
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file3);
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, read);
                            }
                        }
                        fileOutputStream.flush();
                        inputStream.close();
                        fileOutputStream.close();
                    }
                }
            }
        }
        zipFile.close();
    }

    private static byte[] a(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream);
        try {
            deflaterOutputStream.write(bArr, 0, bArr.length);
            deflaterOutputStream.finish();
            deflaterOutputStream.flush();
            deflaterOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static byte[] a(byte[] bArr, int i17) {
        int read;
        java.util.zip.InflaterInputStream inflaterInputStream = new java.util.zip.InflaterInputStream(new java.io.ByteArrayInputStream(bArr, 0, i17));
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        do {
            try {
                try {
                    read = inflaterInputStream.read(bArr2);
                    if (read > 0) {
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                } catch (java.io.IOException unused) {
                    inflaterInputStream.close();
                    return null;
                }
            } catch (java.io.IOException unused2) {
                return null;
            }
        } while (read > 0);
        inflaterInputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (java.io.IOException unused3) {
        }
        return byteArray;
    }

    public static void a(java.io.InputStream inputStream, java.io.File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(inputStream);
        byte[] bArr = new byte[f131725a];
        java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
        while (nextEntry != null) {
            java.lang.String name = nextEntry.getName();
            if (name == null || (!name.contains("../") && !name.contains("..") && !name.startsWith("/"))) {
                if (nextEntry.isDirectory()) {
                    new java.io.File(file + java.io.File.separator + nextEntry.getName().substring(0, r2.length() - 1)).mkdir();
                } else {
                    java.io.File file2 = new java.io.File(file, java.io.File.separator + nextEntry.getName());
                    if (!file2.exists()) {
                        java.io.File parentFile = file2.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        file2.createNewFile();
                    }
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, read);
                        }
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
        }
        inputStream.close();
        zipInputStream.close();
    }

    public static boolean a(java.io.File[] fileArr, java.io.File file, java.lang.String str) {
        if (fileArr == null || fileArr.length <= 0) {
            return false;
        }
        java.io.File a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file, str);
        for (java.io.File file2 : fileArr) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file2, a17);
        }
        try {
            a(a17, file.getAbsolutePath());
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f(a17);
            return true;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f(a17);
            return false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f(a17);
            throw th6;
        }
    }

    private static byte[] a(java.lang.String str) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.util.zip.GZIPOutputStream gZIPOutputStream = null;
        try {
        } catch (java.io.IOException unused) {
            byteArrayOutputStream = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
            byteArrayOutputStream = null;
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                java.util.zip.GZIPOutputStream gZIPOutputStream2 = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(str.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                    gZIPOutputStream2.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(gZIPOutputStream2);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(byteArrayOutputStream);
                    return byteArray;
                } catch (java.io.IOException unused2) {
                    gZIPOutputStream = gZIPOutputStream2;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(gZIPOutputStream);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(byteArrayOutputStream);
                    return new byte[0];
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    gZIPOutputStream = gZIPOutputStream2;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(gZIPOutputStream);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(byteArrayOutputStream);
                    throw th;
                }
            } catch (java.io.IOException unused3) {
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) null);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) null);
            return new byte[0];
        }
    }

    public static byte[] a(java.io.InputStream inputStream) {
        java.util.zip.GZIPInputStream gZIPInputStream = null;
        if (inputStream != null) {
            try {
                java.util.zip.GZIPInputStream gZIPInputStream2 = new java.util.zip.GZIPInputStream(inputStream);
                try {
                    byte[] b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.b(gZIPInputStream2);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) gZIPInputStream2);
                    return b17;
                } catch (java.io.IOException unused) {
                    gZIPInputStream = gZIPInputStream2;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    gZIPInputStream = gZIPInputStream2;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) gZIPInputStream);
                    throw th;
                }
            } catch (java.io.IOException unused2) {
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) gZIPInputStream);
        return new byte[0];
    }
}
