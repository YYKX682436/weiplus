package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* renamed from: com.tencent.shadow.dynamic.host.CopySoBloc */
/* loaded from: classes12.dex */
public class C25531x4018700f {

    /* renamed from: mLogger */
    private static final com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 f46672xe041c5d = com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25509x39e6a13a.m94647x23af1886("Shadow.CopySoBloc");

    /* renamed from: sLocks */
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> f46673xc8a03ff5 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: copySo */
    public static void m95541xaf40b0b1(java.io.File file, java.io.File file2, java.io.File file3, java.lang.String str) {
        java.util.zip.ZipFile zipFile;
        java.lang.String absolutePath = file.getAbsolutePath();
        java.lang.Object obj = f46673xc8a03ff5.get(absolutePath);
        if (obj == null) {
            obj = new java.lang.Object();
            f46673xc8a03ff5.put(absolutePath, obj);
        }
        synchronized (obj) {
            if (!android.text.TextUtils.isEmpty(str) && !file3.exists()) {
                if (file2.exists() && file2.isFile()) {
                    throw new java.lang.RuntimeException("soDir=" + file2.getAbsolutePath() + "已存在，但它是个文件，不敢贸然删除");
                }
                file2.mkdirs();
                java.util.zip.ZipFile zipFile2 = null;
                try {
                    try {
                        zipFile = new java.util.zip.ZipFile(file);
                    } catch (java.lang.Exception e17) {
                        e = e17;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
                try {
                    java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        java.util.zip.ZipEntry nextElement = entries.nextElement();
                        if (nextElement.getName().startsWith(str)) {
                            m95543x60cd71e0(zipFile, nextElement, file2, nextElement.getName().substring(str.length()));
                        }
                    }
                    try {
                        file3.createNewFile();
                        try {
                            zipFile.close();
                        } catch (java.io.IOException e18) {
                            f46672xe041c5d.mo46971x379286("zip关闭时出错忽略", (java.lang.Throwable) e18);
                        }
                    } catch (java.io.IOException e19) {
                        throw new java.lang.RuntimeException("创建so复制完毕 创建tag文件失败：" + file3.getAbsolutePath(), e19);
                    }
                } catch (java.lang.Exception e27) {
                    e = e27;
                    zipFile2 = zipFile;
                    throw new java.lang.RuntimeException("解压so 失败 apkFile:" + file.getAbsolutePath() + " abi:" + str, e);
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    zipFile2 = zipFile;
                    if (zipFile2 != null) {
                        try {
                            zipFile2.close();
                        } catch (java.io.IOException e28) {
                            f46672xe041c5d.mo46971x379286("zip关闭时出错忽略", (java.lang.Throwable) e28);
                        }
                    }
                    throw th;
                }
            }
        }
    }

    /* renamed from: writeOutInputStream */
    private static void m95542x657e817b(java.io.File file, java.lang.String str, java.io.InputStream inputStream) {
        java.io.BufferedOutputStream bufferedOutputStream = null;
        try {
            java.io.BufferedOutputStream bufferedOutputStream2 = new java.io.BufferedOutputStream(new java.io.FileOutputStream(new java.io.File(file, str)));
            try {
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 8192);
                    if (read < 0) {
                        bufferedOutputStream2.close();
                        return;
                    }
                    bufferedOutputStream2.write(bArr, 0, read);
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                bufferedOutputStream = bufferedOutputStream2;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: writeOutZipEntry */
    private static void m95543x60cd71e0(java.util.zip.ZipFile zipFile, java.util.zip.ZipEntry zipEntry, java.io.File file, java.lang.String str) {
        java.io.InputStream inputStream;
        try {
            inputStream = zipFile.getInputStream(zipEntry);
            try {
                m95542x657e817b(file, str, inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }
}
