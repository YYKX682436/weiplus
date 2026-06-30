package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.SharePatchFileUtil */
/* loaded from: classes13.dex */
public class C26637x8fe39687 {
    private static final java.lang.String TAG = "Tinker.PatchFileUtil";

    /* renamed from: hexDigits */
    private static char[] f55891x7d912be1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: checkIfMd5Valid */
    public static boolean m104663xd528d483(java.lang.String str) {
        return str != null && str.length() == 32;
    }

    /* renamed from: checkResourceArscMd5 */
    public static boolean m104664xe6b79167(java.io.File file, java.lang.String str) {
        java.util.zip.ZipFile zipFile;
        java.util.zip.ZipEntry entry;
        java.util.zip.ZipFile zipFile2 = null;
        java.io.InputStream inputStream = null;
        try {
            zipFile = new java.util.zip.ZipFile(file);
            try {
                entry = zipFile.getEntry(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55713x1b2a16a0);
            } catch (java.lang.Throwable th6) {
                th = th6;
                zipFile2 = zipFile;
                try {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "checkResourceArscMd5 throwable:" + th.getMessage(), new java.lang.Object[0]);
                    return false;
                } finally {
                    m104667x41231e09(zipFile2);
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
        if (entry == null) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "checkResourceArscMd5 resources.arsc not found", new java.lang.Object[0]);
            m104667x41231e09(zipFile);
            return false;
        }
        try {
            inputStream = zipFile.getInputStream(entry);
            java.lang.String m104677xb5885268 = m104677xb5885268(inputStream);
            if (m104677xb5885268 != null) {
                if (m104677xb5885268.equals(str)) {
                    m104667x41231e09(zipFile);
                    return true;
                }
            }
            m104667x41231e09(zipFile);
            return false;
        } finally {
            m104666xd71209a9(inputStream);
        }
    }

    /* renamed from: checkTinkerLastUncaughtCrash */
    public static java.lang.String m104665x9fa1ddd5(android.content.Context context) {
        java.io.BufferedReader bufferedReader;
        java.io.File m104682x8e55de5b = m104682x8e55de5b(context);
        java.io.BufferedReader bufferedReader2 = null;
        if (!m104686xc32e09cb(m104682x8e55de5b)) {
            return null;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(m104682x8e55de5b)));
            while (true) {
                try {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            m104666xd71209a9(bufferedReader);
                            return stringBuffer.toString();
                        }
                        stringBuffer.append(readLine);
                        stringBuffer.append("\n");
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "checkTinkerLastUncaughtCrash exception: " + e, new java.lang.Object[0]);
                        m104666xd71209a9(bufferedReader);
                        return null;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bufferedReader2 = bufferedReader;
                    m104666xd71209a9(bufferedReader2);
                    throw th;
                }
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            bufferedReader = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            m104666xd71209a9(bufferedReader2);
            throw th;
        }
    }

    /* renamed from: closeQuietly */
    public static void m104666xd71209a9(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof java.io.Closeable) {
                ((java.io.Closeable) obj).close();
            } else if (obj instanceof java.lang.AutoCloseable) {
                ((java.lang.AutoCloseable) obj).close();
            } else {
                if (!(obj instanceof java.util.zip.ZipFile)) {
                    throw new java.lang.IllegalArgumentException("obj: " + obj + " cannot be closed.");
                }
                ((java.util.zip.ZipFile) obj).close();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: closeZip */
    public static void m104667x41231e09(java.util.zip.ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "Failed to close resource", e17);
            }
        }
    }

    /* renamed from: copyFileUsingStream */
    public static void m104668x757a1d3(java.io.File file, java.io.File file2) {
        java.io.FileOutputStream fileOutputStream;
        if (!m104686xc32e09cb(file) || file2 == null || file.getAbsolutePath().equals(file2.getAbsolutePath())) {
            return;
        }
        java.io.File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        java.io.FileInputStream fileInputStream = null;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                fileOutputStream = new java.io.FileOutputStream(file2, false);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read <= 0) {
                            m104666xd71209a9(fileInputStream2);
                            m104666xd71209a9(fileOutputStream);
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    fileInputStream = fileInputStream2;
                    m104666xd71209a9(fileInputStream);
                    m104666xd71209a9(fileOutputStream);
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                fileOutputStream = null;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            fileOutputStream = null;
        }
    }

    /* renamed from: deleteDir */
    public static final boolean m104670xea9e22e2(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return m104669xea9e22e2(new java.io.File(str));
    }

    /* renamed from: deleteDirAsync */
    public static void m104672x92586cba(java.lang.String str) {
        m104671x92586cba(new java.io.File(str));
    }

    /* renamed from: ensureFileDirectory */
    public static void m104673xde4e9cb3(java.io.File file) {
        if (file == null) {
            return;
        }
        java.io.File parentFile = file.getParentFile();
        if (parentFile.exists()) {
            return;
        }
        parentFile.mkdirs();
    }

    /* renamed from: getFileOrDirectorySize */
    public static long m104674x92bff699(java.io.File file) {
        long j17 = 0;
        if (file != null && file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            java.io.File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (java.io.File file2 : listFiles) {
                    j17 += file2.isDirectory() ? m104674x92bff699(file2) : file2.length();
                }
            }
        }
        return j17;
    }

    /* renamed from: getGuardDirectory */
    public static java.io.File m104675xb39f963e(java.lang.String str) {
        return new java.io.File(str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55704x1a17cdee);
    }

    /* renamed from: getMD5 */
    public static final java.lang.String m104677xb5885268(java.io.InputStream inputStream) {
        int i17;
        if (inputStream == null) {
            return null;
        }
        try {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(32);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            for (byte b17 : messageDigest.digest()) {
                sb6.append(java.lang.Integer.toString((b17 & 255) + 256, 16).substring(1));
            }
            return sb6.toString();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: getPatchDirectory */
    public static java.io.File m104679xac1dbbfb(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return null;
        }
        "oppo".equalsIgnoreCase(android.os.Build.MANUFACTURER);
        return new java.io.File(applicationInfo.dataDir, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55702xce94d634);
    }

    /* renamed from: getPatchInfoFile */
    public static java.io.File m104680x3b463ffc(java.lang.String str) {
        return new java.io.File(str + "/patch_meta.info");
    }

    /* renamed from: getPatchInfoLockFile */
    public static java.io.File m104681x4bb4abc7(java.lang.String str) {
        return new java.io.File(str + "/info.lock");
    }

    /* renamed from: getPatchLastCrashFile */
    public static java.io.File m104682x8e55de5b(android.content.Context context) {
        java.io.File m104683x2b412f87 = m104683x2b412f87(context);
        if (m104683x2b412f87 == null) {
            return null;
        }
        return new java.io.File(m104683x2b412f87, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55709xd272d2d8);
    }

    /* renamed from: getPatchTempDirectory */
    public static java.io.File m104683x2b412f87(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return null;
        }
        return new java.io.File(applicationInfo.dataDir, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55708xb7238671);
    }

    /* renamed from: getPatchVersionDirectory */
    public static java.lang.String m104684x2e62bb27(java.lang.String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55701x7784d7e2 + str.substring(0, 8);
    }

    /* renamed from: getPatchVersionFile */
    public static java.lang.String m104685xa598cc82(java.lang.String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return m104684x2e62bb27(str) + ".apk";
    }

    /* renamed from: isLegalFile */
    public static final boolean m104686xc32e09cb(java.io.File file) {
        return file != null && file.exists() && file.canRead() && file.isFile() && file.length() > 0;
    }

    /* renamed from: isRawDexFile */
    public static boolean m104687x81f6e9b5(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55637xc33c4c99);
    }

    /* renamed from: loadDigestes */
    public static java.lang.String m104688x48712c78(java.util.jar.JarFile jarFile, java.util.jar.JarEntry jarEntry) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.io.BufferedInputStream bufferedInputStream = null;
        try {
            java.io.InputStream inputStream = jarFile.getInputStream(jarEntry);
            byte[] bArr = new byte[4096];
            java.io.BufferedInputStream bufferedInputStream2 = new java.io.BufferedInputStream(inputStream);
            while (true) {
                try {
                    int read = bufferedInputStream2.read(bArr);
                    if (read <= 0) {
                        m104666xd71209a9(bufferedInputStream2);
                        return sb6.toString();
                    }
                    sb6.append(new java.lang.String(bArr, 0, read));
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bufferedInputStream = bufferedInputStream2;
                    m104666xd71209a9(bufferedInputStream);
                    throw th;
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: optimizedPathFor */
    public static java.lang.String m104689x54ec473d(java.io.File file, java.io.File file2) {
        if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104738x9cf9bcb2()) {
            java.lang.String name = file.getName();
            if (!name.endsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55637xc33c4c99)) {
                int lastIndexOf = name.lastIndexOf(".");
                if (lastIndexOf < 0) {
                    name = name.concat(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55637xc33c4c99);
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(lastIndexOf + 4);
                    sb6.append((java.lang.CharSequence) name, 0, lastIndexOf);
                    sb6.append(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55637xc33c4c99);
                    name = sb6.toString();
                }
            }
            return new java.io.File(file2, name).getPath();
        }
        try {
            java.lang.String m104728x98963917 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104728x98963917();
            java.io.File parentFile = file.getParentFile();
            java.lang.String name2 = file.getName();
            int lastIndexOf2 = name2.lastIndexOf(46);
            if (lastIndexOf2 > 0) {
                name2 = name2.substring(0, lastIndexOf2);
            }
            return parentFile.getAbsolutePath() + "/oat/" + m104728x98963917 + "/" + name2 + com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55698xb5cf7628;
        } catch (java.lang.Exception e17) {
            throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("getCurrentInstructionSet fail:", e17);
        }
    }

    /* renamed from: safeDeleteFile */
    public static final boolean m104690x85427134(java.io.File file) {
        boolean z17 = true;
        if (file == null) {
            return true;
        }
        if (file.exists()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "safeDeleteFile, try to delete path: " + file.getPath(), new java.lang.Object[0]);
            z17 = file.delete();
            if (!z17) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "Failed to delete file, try to delete when exit. path: " + file.getPath(), new java.lang.Object[0]);
                file.deleteOnExit();
            }
        }
        return z17;
    }

    /* renamed from: shouldAcceptEvenIfIllegal */
    public static final boolean m104691x54677ec4(java.io.File file) {
        java.lang.String str = android.os.Build.MANUFACTURER;
        return (("vivo".equalsIgnoreCase(str) || "oppo".equalsIgnoreCase(str) || "meizu".equalsIgnoreCase(str)) || (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104742x33bbb0c9(29, true) || com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104739x6e3ebd34())) && (!file.exists() || (file.length() > 0L ? 1 : (file.length() == 0L ? 0 : -1)) == 0);
    }

    /* renamed from: verifyDexFileMd5 */
    public static boolean m104692x8a7ff3a4(java.io.File file, java.lang.String str) {
        return m104693x8a7ff3a4(file, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55634xb1d49d29, str);
    }

    /* renamed from: verifyFileMd5 */
    public static boolean m104694xd666bba9(java.io.File file, java.lang.String str) {
        java.lang.String m104676xb5885268;
        if (str == null || (m104676xb5885268 = m104676xb5885268(file)) == null) {
            return false;
        }
        return str.equals(m104676xb5885268);
    }

    /* renamed from: deleteDir */
    public static final boolean m104669xea9e22e2(java.io.File file) {
        java.io.File[] listFiles;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isFile()) {
            m104690x85427134(file);
            return true;
        }
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return true;
        }
        for (java.io.File file2 : listFiles) {
            m104669xea9e22e2(file2);
        }
        m104690x85427134(file);
        return true;
    }

    /* renamed from: deleteDirAsync */
    public static void m104671x92586cba(final java.io.File file) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.tinker.loader.shareutil.SharePatchFileUtil.1
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104669xea9e22e2(file);
            }
        }, "tinker-clean") { // from class: com.tencent.tinker.loader.shareutil.SharePatchFileUtil.2
            {
                setPriority(4);
            }
        }.start();
    }

    /* renamed from: verifyDexFileMd5 */
    public static boolean m104693x8a7ff3a4(java.io.File file, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (file == null || str2 == null || str == null) {
            return false;
        }
        if (m104687x81f6e9b5(file.getName())) {
            str3 = m104676xb5885268(file);
        } else {
            java.util.zip.ZipFile zipFile = null;
            java.io.InputStream inputStream = null;
            try {
                java.util.zip.ZipFile zipFile2 = new java.util.zip.ZipFile(file);
                try {
                    java.util.zip.ZipEntry entry = zipFile2.getEntry(str);
                    if (entry == null) {
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "There's no entry named: classes.dex in " + file.getAbsolutePath(), new java.lang.Object[0]);
                        m104667x41231e09(zipFile2);
                        return false;
                    }
                    try {
                        inputStream = zipFile2.getInputStream(entry);
                        java.lang.String m104677xb5885268 = m104677xb5885268(inputStream);
                        m104666xd71209a9(inputStream);
                        str3 = m104677xb5885268;
                    } catch (java.lang.Throwable th6) {
                        try {
                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "exception occurred when get md5: " + file.getAbsolutePath(), th6);
                            str3 = "";
                        } finally {
                            m104666xd71209a9(inputStream);
                        }
                    }
                    m104667x41231e09(zipFile2);
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    zipFile = zipFile2;
                    try {
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "Bad dex jar file: " + file.getAbsolutePath(), th);
                        return false;
                    } finally {
                        m104667x41231e09(zipFile);
                    }
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        }
        return str2.equals(str3);
    }

    /* renamed from: getMD5 */
    public static java.lang.String m104678xb5885268(byte[] bArr) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr = new char[digest.length * 2];
            int i17 = 0;
            for (byte b17 : digest) {
                int i18 = i17 + 1;
                char[] cArr2 = f55891x7d912be1;
                cArr[i17] = cArr2[(b17 >>> 4) & 15];
                i17 = i18 + 1;
                cArr[i18] = cArr2[b17 & 15];
            }
            return new java.lang.String(cArr);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: getMD5 */
    public static java.lang.String m104676xb5885268(java.io.File file) {
        java.io.FileInputStream fileInputStream;
        java.io.FileInputStream fileInputStream2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            fileInputStream = new java.io.FileInputStream(file);
            try {
                try {
                    java.lang.String m104677xb5885268 = m104677xb5885268(fileInputStream);
                    m104666xd71209a9(fileInputStream);
                    return m104677xb5885268;
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, e.getMessage(), new java.lang.Object[0]);
                    m104666xd71209a9(fileInputStream);
                    return null;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                fileInputStream2 = fileInputStream;
                m104666xd71209a9(fileInputStream2);
                throw th;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            fileInputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            m104666xd71209a9(fileInputStream2);
            throw th;
        }
    }
}
