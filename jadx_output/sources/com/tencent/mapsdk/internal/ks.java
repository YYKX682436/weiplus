package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ks {

    /* renamed from: a, reason: collision with root package name */
    public static final int f50183a = 1024;

    /* renamed from: b, reason: collision with root package name */
    public static final int f50184b = 1048576;

    /* renamed from: c, reason: collision with root package name */
    public static final int f50185c = 1073741824;

    /* renamed from: d, reason: collision with root package name */
    public static java.io.File f50186d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.String f50187e = "FileUtil";

    /* renamed from: f, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.ln f50188f = new com.tencent.mapsdk.internal.ln();

    public static java.io.File a(java.io.File file, java.lang.String str) {
        if (file == null || android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.io.File file2 = new java.io.File(file, str);
        file2.mkdirs();
        return file2;
    }

    public static java.io.File b(java.io.File file, java.lang.String str) {
        java.io.File file2 = null;
        if (file != null && !android.text.TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(java.io.File.separator);
            if (lastIndexOf != -1) {
                java.lang.String substring = str.substring(lastIndexOf + 1);
                java.io.File file3 = new java.io.File(file, str.substring(0, lastIndexOf));
                str = substring;
                file = file3;
            }
            if (!file.exists() && !file.mkdirs()) {
                if (android.util.Log.isLoggable(f50187e, 6)) {
                    file.getAbsolutePath();
                }
                return null;
            }
            file2 = new java.io.File(file, str);
            try {
                if (!file2.exists() && !file2.createNewFile() && android.util.Log.isLoggable(f50187e, 6)) {
                    file2.getAbsolutePath();
                }
            } catch (java.io.IOException unused) {
                android.util.Log.isLoggable(f50187e, 6);
            }
        }
        return file2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005a, code lost:
    
        if (r1 == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] c(java.io.File r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L6d
            boolean r1 = r6.exists()
            if (r1 != 0) goto Lb
            goto L6d
        Lb:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L50 java.io.FileNotFoundException -> L60
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L50 java.io.FileNotFoundException -> L60
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3a java.io.FileNotFoundException -> L3c
            r6.<init>()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L3a java.io.FileNotFoundException -> L3c
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L52 java.io.FileNotFoundException -> L62
        L19:
            int r3 = r1.read(r2)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L52 java.io.FileNotFoundException -> L62
            r4 = -1
            if (r3 == r4) goto L25
            r4 = 0
            r6.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L52 java.io.FileNotFoundException -> L62
            goto L19
        L25:
            byte[] r0 = r6.toByteArray()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L52 java.io.FileNotFoundException -> L62
            r6.flush()     // Catch: java.io.IOException -> L2f
            r6.close()     // Catch: java.io.IOException -> L2f
        L2f:
            r1.close()     // Catch: java.io.IOException -> L32
        L32:
            return r0
        L33:
            r0 = move-exception
            goto L42
        L35:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L42
        L3a:
            r6 = r0
            goto L52
        L3c:
            r6 = r0
            goto L62
        L3e:
            r6 = move-exception
            r1 = r0
            r0 = r6
            r6 = r1
        L42:
            if (r6 == 0) goto L4a
            r6.flush()     // Catch: java.io.IOException -> L4a
            r6.close()     // Catch: java.io.IOException -> L4a
        L4a:
            if (r1 == 0) goto L4f
            r1.close()     // Catch: java.io.IOException -> L4f
        L4f:
            throw r0
        L50:
            r6 = r0
            r1 = r6
        L52:
            if (r6 == 0) goto L5a
            r6.flush()     // Catch: java.io.IOException -> L5a
            r6.close()     // Catch: java.io.IOException -> L5a
        L5a:
            if (r1 == 0) goto L6d
        L5c:
            r1.close()     // Catch: java.io.IOException -> L6d
            goto L6d
        L60:
            r6 = r0
            r1 = r6
        L62:
            if (r6 == 0) goto L6a
            r6.flush()     // Catch: java.io.IOException -> L6a
            r6.close()     // Catch: java.io.IOException -> L6a
        L6a:
            if (r1 == 0) goto L6d
            goto L5c
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ks.c(java.io.File):byte[]");
    }

    public static java.util.List<java.lang.String> d(java.io.File file) {
        java.io.BufferedReader bufferedReader;
        java.io.BufferedReader bufferedReader2 = null;
        if (file != null && file.exists()) {
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
            } catch (java.io.FileNotFoundException | java.io.IOException unused) {
                bufferedReader = null;
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (true) {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        arrayList.add(readLine);
                    } else {
                        com.tencent.mapsdk.internal.kt.a(bufferedReader);
                        return arrayList;
                    }
                }
            } catch (java.io.FileNotFoundException | java.io.IOException unused2) {
                com.tencent.mapsdk.internal.kt.a(bufferedReader);
                return null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                bufferedReader2 = bufferedReader;
                com.tencent.mapsdk.internal.kt.a(bufferedReader2);
                throw th;
            }
        }
        return null;
    }

    public static java.io.File e(java.io.File file) {
        if (file == null) {
            return null;
        }
        java.io.File parentFile = file.getParentFile();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mapsdk.internal.ln lnVar = f50188f;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(java.lang.System.currentTimeMillis());
        sb6.append(lnVar.a(sb7.toString()));
        sb6.append(".tmp");
        return b(parentFile, sb6.toString());
    }

    public static long f(java.io.File file) {
        return a(file, (java.io.FileFilter) null);
    }

    private static java.io.File g(java.io.File file) {
        return a(file.getParentFile(), file.getName());
    }

    private static boolean h(java.io.File file) {
        if (file != null && file.exists() && file.isFile()) {
            return file.delete();
        }
        return false;
    }

    public static boolean a(java.lang.String str) {
        return a(new java.io.File(str));
    }

    public static java.io.File[] e(java.io.File file, final java.lang.String str) {
        return (file == null || !file.isDirectory()) ? new java.io.File[0] : file.listFiles(new java.io.FileFilter() { // from class: com.tencent.mapsdk.internal.ks.1
            @Override // java.io.FileFilter
            public final boolean accept(java.io.File file2) {
                return java.util.regex.Pattern.compile(str).matcher(file2.getName()).matches();
            }
        });
    }

    public static boolean a(java.io.File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        java.io.File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static java.lang.String a(java.io.File file, int i17) {
        java.io.BufferedReader bufferedReader;
        java.io.BufferedReader bufferedReader2 = null;
        if (file != null && file.exists() && i17 != -1) {
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
                int i18 = 0;
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (i18 == i17) {
                            com.tencent.mapsdk.internal.kt.a(bufferedReader);
                            return readLine;
                        }
                        i18++;
                    } catch (java.io.FileNotFoundException | java.io.IOException unused) {
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader2 = bufferedReader;
                        com.tencent.mapsdk.internal.kt.a(bufferedReader2);
                        throw th;
                    }
                }
            } catch (java.io.FileNotFoundException | java.io.IOException unused2) {
                bufferedReader = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }
        return null;
        com.tencent.mapsdk.internal.kt.a(bufferedReader);
        return null;
    }

    public static int d(java.io.File file, java.lang.String str) {
        if (file != null && file.exists()) {
            java.io.BufferedReader bufferedReader = null;
            try {
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.FileReader(file));
                int i17 = 0;
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            com.tencent.mapsdk.internal.kt.a(bufferedReader2);
                            break;
                        }
                        if (readLine.startsWith(str)) {
                            com.tencent.mapsdk.internal.kt.a(bufferedReader2);
                            return i17;
                        }
                        i17++;
                    } catch (java.io.FileNotFoundException | java.io.IOException unused) {
                        bufferedReader = bufferedReader2;
                        com.tencent.mapsdk.internal.kt.a(bufferedReader);
                        return -1;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader = bufferedReader2;
                        com.tencent.mapsdk.internal.kt.a(bufferedReader);
                        throw th;
                    }
                }
            } catch (java.io.FileNotFoundException | java.io.IOException unused2) {
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }
        return -1;
    }

    public static boolean b(java.io.File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        java.util.Stack stack = new java.util.Stack();
        stack.push(file);
        boolean z17 = false;
        while (!stack.isEmpty()) {
            java.io.File file2 = (java.io.File) stack.peek();
            if (file2.isFile()) {
                z17 = file2.delete();
                stack.pop();
            } else if (file2.isDirectory()) {
                java.io.File[] listFiles = file2.listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    z17 = file2.delete();
                    stack.pop();
                } else {
                    for (java.io.File file3 : listFiles) {
                        stack.push(file3);
                    }
                }
            }
        }
        return z17;
    }

    public static boolean a(java.io.File file, byte[] bArr) {
        java.io.FileOutputStream fileOutputStream;
        if (file == null || bArr == null || !a(file)) {
            return false;
        }
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new java.io.FileOutputStream(file);
        } catch (java.io.FileNotFoundException unused) {
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            fileOutputStream.write(bArr);
            try {
                fileOutputStream.close();
            } catch (java.io.IOException unused3) {
            }
            return true;
        } catch (java.io.FileNotFoundException unused4) {
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 == null) {
                return false;
            }
            try {
                fileOutputStream2.close();
            } catch (java.io.IOException unused5) {
                return false;
            }
        } catch (java.io.IOException unused6) {
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 == null) {
                return false;
            }
            fileOutputStream2.close();
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (java.io.IOException unused7) {
                }
            }
            throw th;
        }
    }

    public static void c(java.io.File file, java.lang.String str) {
        if (file == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (!file.exists()) {
            a(file);
        }
        java.io.RandomAccessFile randomAccessFile = null;
        try {
            java.io.RandomAccessFile randomAccessFile2 = new java.io.RandomAccessFile(file, "rw");
            try {
                randomAccessFile2.seek(randomAccessFile2.length());
                randomAccessFile2.write((str + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE).getBytes());
                com.tencent.mapsdk.internal.kt.a(randomAccessFile2);
            } catch (java.io.FileNotFoundException unused) {
                randomAccessFile = randomAccessFile2;
                com.tencent.mapsdk.internal.kt.a(randomAccessFile);
            } catch (java.io.IOException unused2) {
                randomAccessFile = randomAccessFile2;
                com.tencent.mapsdk.internal.kt.a(randomAccessFile);
            } catch (java.lang.Throwable th6) {
                th = th6;
                randomAccessFile = randomAccessFile2;
                com.tencent.mapsdk.internal.kt.a(randomAccessFile);
                throw th;
            }
        } catch (java.io.FileNotFoundException unused3) {
        } catch (java.io.IOException unused4) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static void a(java.io.File file, int i17, java.lang.String str) {
        java.io.File file2;
        java.io.RandomAccessFile randomAccessFile;
        if (file == null || !file.exists() || i17 == -1) {
            return;
        }
        java.io.RandomAccessFile randomAccessFile2 = null;
        try {
            java.io.RandomAccessFile randomAccessFile3 = new java.io.RandomAccessFile(file, "rw");
            try {
                file2 = e(file);
                try {
                    randomAccessFile = new java.io.RandomAccessFile(file2, "rw");
                    int i18 = 0;
                    long j17 = 0;
                    while (true) {
                        try {
                            try {
                                java.lang.String readLine = randomAccessFile3.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                if (i18 == i17) {
                                    j17 = randomAccessFile3.getFilePointer() - com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE.getBytes().length;
                                } else if (i18 > i17) {
                                    randomAccessFile.write(readLine.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
                                }
                                i18++;
                            } catch (java.io.FileNotFoundException | java.io.IOException unused) {
                                randomAccessFile2 = randomAccessFile3;
                                com.tencent.mapsdk.internal.kt.a(randomAccessFile2);
                                com.tencent.mapsdk.internal.kt.a(randomAccessFile);
                                b(file2);
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            randomAccessFile2 = randomAccessFile3;
                            com.tencent.mapsdk.internal.kt.a(randomAccessFile2);
                            com.tencent.mapsdk.internal.kt.a(randomAccessFile);
                            b(file2);
                            throw th;
                        }
                    }
                    randomAccessFile3.seek(j17);
                    randomAccessFile3.write((str + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE).getBytes());
                    randomAccessFile.seek(0L);
                    while (true) {
                        java.lang.String readLine2 = randomAccessFile.readLine();
                        if (readLine2 == null) {
                            break;
                        } else {
                            randomAccessFile3.write(readLine2.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
                        }
                    }
                    com.tencent.mapsdk.internal.kt.a(randomAccessFile3);
                } catch (java.io.FileNotFoundException unused2) {
                    randomAccessFile = null;
                } catch (java.io.IOException unused3) {
                    randomAccessFile = null;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    randomAccessFile = null;
                }
            } catch (java.io.FileNotFoundException unused4) {
                file2 = null;
                randomAccessFile = null;
            } catch (java.io.IOException unused5) {
                file2 = null;
                randomAccessFile = null;
            } catch (java.lang.Throwable th8) {
                th = th8;
                file2 = null;
                randomAccessFile = null;
            }
        } catch (java.io.FileNotFoundException | java.io.IOException unused6) {
            file2 = null;
            randomAccessFile = null;
        } catch (java.lang.Throwable th9) {
            th = th9;
            file2 = null;
            randomAccessFile = null;
        }
        com.tencent.mapsdk.internal.kt.a(randomAccessFile);
        b(file2);
    }

    public static void b(java.io.File file, byte[] bArr) {
        if (file == null || bArr == null || bArr.length == 0) {
            return;
        }
        if (!file.exists()) {
            a(file);
        }
        java.io.RandomAccessFile randomAccessFile = null;
        try {
            java.io.RandomAccessFile randomAccessFile2 = new java.io.RandomAccessFile(file, "rw");
            try {
                randomAccessFile2.seek(randomAccessFile2.length());
                randomAccessFile2.write(bArr);
                com.tencent.mapsdk.internal.kt.a(randomAccessFile2);
            } catch (java.io.FileNotFoundException unused) {
                randomAccessFile = randomAccessFile2;
                com.tencent.mapsdk.internal.kt.a(randomAccessFile);
            } catch (java.io.IOException unused2) {
                randomAccessFile = randomAccessFile2;
                com.tencent.mapsdk.internal.kt.a(randomAccessFile);
            } catch (java.lang.Throwable th6) {
                th = th6;
                randomAccessFile = randomAccessFile2;
                com.tencent.mapsdk.internal.kt.a(randomAccessFile);
                throw th;
            }
        } catch (java.io.FileNotFoundException unused3) {
        } catch (java.io.IOException unused4) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static void b(java.io.File file, int i17) {
        java.io.File file2;
        java.io.RandomAccessFile randomAccessFile;
        if (!file.exists() || i17 == -1) {
            return;
        }
        boolean z17 = false;
        java.io.RandomAccessFile randomAccessFile2 = null;
        try {
            java.io.RandomAccessFile randomAccessFile3 = new java.io.RandomAccessFile(file, "rw");
            try {
                file2 = e(file);
                try {
                    randomAccessFile = new java.io.RandomAccessFile(file2, "rw");
                    int i18 = 0;
                    while (true) {
                        try {
                            java.lang.String readLine = randomAccessFile3.readLine();
                            if (readLine == null) {
                                break;
                            }
                            if (i18 != i17) {
                                randomAccessFile.write(readLine.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
                                randomAccessFile.write(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE.getBytes());
                            } else {
                                z17 = true;
                            }
                            i18++;
                        } catch (java.io.FileNotFoundException unused) {
                            randomAccessFile2 = randomAccessFile3;
                            com.tencent.mapsdk.internal.kt.a(randomAccessFile2);
                            com.tencent.mapsdk.internal.kt.a(randomAccessFile);
                            if (!z17) {
                                b(file2);
                                return;
                            }
                            b(file);
                            a(file2, file);
                        } catch (java.io.IOException unused2) {
                            randomAccessFile2 = randomAccessFile3;
                            com.tencent.mapsdk.internal.kt.a(randomAccessFile2);
                            com.tencent.mapsdk.internal.kt.a(randomAccessFile);
                            if (!z17) {
                                b(file2);
                                return;
                            }
                            b(file);
                            a(file2, file);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            randomAccessFile2 = randomAccessFile3;
                            com.tencent.mapsdk.internal.kt.a(randomAccessFile2);
                            com.tencent.mapsdk.internal.kt.a(randomAccessFile);
                            if (z17) {
                                b(file);
                                a(file2, file);
                            } else {
                                b(file2);
                            }
                            throw th;
                        }
                    }
                    com.tencent.mapsdk.internal.kt.a(randomAccessFile3);
                    com.tencent.mapsdk.internal.kt.a(randomAccessFile);
                    if (!z17) {
                        b(file2);
                        return;
                    }
                } catch (java.io.FileNotFoundException unused3) {
                    randomAccessFile = null;
                } catch (java.io.IOException unused4) {
                    randomAccessFile = null;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    randomAccessFile = null;
                }
            } catch (java.io.FileNotFoundException unused5) {
                file2 = null;
                randomAccessFile = null;
            } catch (java.io.IOException unused6) {
                file2 = null;
                randomAccessFile = null;
            } catch (java.lang.Throwable th8) {
                th = th8;
                file2 = null;
                randomAccessFile = null;
            }
        } catch (java.io.FileNotFoundException unused7) {
            file2 = null;
            randomAccessFile = null;
        } catch (java.io.IOException unused8) {
            file2 = null;
            randomAccessFile = null;
        } catch (java.lang.Throwable th9) {
            th = th9;
            file2 = null;
            randomAccessFile = null;
        }
        b(file);
        a(file2, file);
    }

    public static boolean a(java.io.File file, java.io.File file2) {
        if (file == null || !file.exists()) {
            return false;
        }
        b(file2);
        return file.renameTo(file2);
    }

    private static boolean a(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(str);
        java.io.File file2 = new java.io.File(str2);
        if (file2.exists()) {
            f(file2);
        }
        return file.renameTo(new java.io.File(str2));
    }

    public static long a(java.io.File file, java.io.FileFilter fileFilter) {
        java.io.File[] listFiles;
        long j17 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory() && (listFiles = file.listFiles(fileFilter)) != null) {
            for (java.io.File file2 : listFiles) {
                j17 += a(file2, fileFilter);
            }
        }
        if (fileFilter != null && !fileFilter.accept(file)) {
            return j17;
        }
        long length = file.length();
        java.io.File file3 = new java.io.File(file.getAbsolutePath() + java.lang.System.currentTimeMillis());
        file.renameTo(file3);
        file3.delete();
        return length;
    }

    public static java.lang.String a(android.content.Context context) {
        if (context == null) {
            return "";
        }
        try {
            java.lang.String packageName = context.getPackageName();
            if (packageName != null && packageName.length() != 0) {
                return packageName.length() > 255 ? packageName.substring(0, 254) : packageName;
            }
        } catch (java.lang.Exception unused) {
        }
        return "";
    }

    public static void b(java.io.File file, int i17, java.lang.String str) {
        java.io.File file2;
        java.io.RandomAccessFile randomAccessFile;
        if (file == null || !file.exists() || i17 == -1 || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        boolean z17 = false;
        java.io.RandomAccessFile randomAccessFile2 = null;
        try {
            java.io.RandomAccessFile randomAccessFile3 = new java.io.RandomAccessFile(file, "rw");
            try {
                file2 = e(file);
                try {
                    randomAccessFile = new java.io.RandomAccessFile(file2, "rw");
                    int i18 = 0;
                    while (true) {
                        try {
                            java.lang.String readLine = randomAccessFile3.readLine();
                            if (readLine == null) {
                                break;
                            }
                            if (i18 != i17) {
                                randomAccessFile.write(readLine.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
                                randomAccessFile.write(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE.getBytes());
                            } else {
                                randomAccessFile.write((str + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE).getBytes());
                                z17 = true;
                            }
                            i18++;
                        } catch (java.io.FileNotFoundException unused) {
                            randomAccessFile2 = randomAccessFile3;
                            com.tencent.mapsdk.internal.kt.a(randomAccessFile2);
                            com.tencent.mapsdk.internal.kt.a(randomAccessFile);
                            if (!z17) {
                                b(file2);
                                return;
                            }
                            b(file);
                            a(file2, file);
                        } catch (java.io.IOException unused2) {
                            randomAccessFile2 = randomAccessFile3;
                            com.tencent.mapsdk.internal.kt.a(randomAccessFile2);
                            com.tencent.mapsdk.internal.kt.a(randomAccessFile);
                            if (!z17) {
                                b(file2);
                                return;
                            }
                            b(file);
                            a(file2, file);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            randomAccessFile2 = randomAccessFile3;
                            com.tencent.mapsdk.internal.kt.a(randomAccessFile2);
                            com.tencent.mapsdk.internal.kt.a(randomAccessFile);
                            if (z17) {
                                b(file);
                                a(file2, file);
                            } else {
                                b(file2);
                            }
                            throw th;
                        }
                    }
                    com.tencent.mapsdk.internal.kt.a(randomAccessFile3);
                    com.tencent.mapsdk.internal.kt.a(randomAccessFile);
                    if (!z17) {
                        b(file2);
                        return;
                    }
                } catch (java.io.FileNotFoundException unused3) {
                    randomAccessFile = null;
                } catch (java.io.IOException unused4) {
                    randomAccessFile = null;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    randomAccessFile = null;
                }
            } catch (java.io.FileNotFoundException unused5) {
                file2 = null;
                randomAccessFile = null;
            } catch (java.io.IOException unused6) {
                file2 = null;
                randomAccessFile = null;
            } catch (java.lang.Throwable th8) {
                th = th8;
                file2 = null;
                randomAccessFile = null;
            }
        } catch (java.io.FileNotFoundException unused7) {
            file2 = null;
            randomAccessFile = null;
        } catch (java.io.IOException unused8) {
            file2 = null;
            randomAccessFile = null;
        } catch (java.lang.Throwable th9) {
            th = th9;
            file2 = null;
            randomAccessFile = null;
        }
        b(file);
        a(file2, file);
    }

    public static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return "";
        }
        java.lang.String trim = str.trim();
        if (trim.contains("../")) {
            trim = trim.replaceAll("\\.\\./", "");
        }
        while (trim.startsWith(java.io.File.separator)) {
            trim = trim.substring(1);
        }
        while (trim.endsWith(java.io.File.separator)) {
            trim = trim.substring(0, trim.length() - 1);
        }
        return trim;
    }

    public static void b(java.io.File file, java.io.File file2) {
        if (!file2.exists()) {
            a(file2.getParentFile(), file2.getName());
        }
        if (file.isDirectory()) {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (java.io.File file3 : listFiles) {
                    b(file3, new java.io.File(file2, file.getName()));
                }
                return;
            }
            return;
        }
        java.io.File file4 = new java.io.File(file2, file.getName());
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            try {
                java.nio.file.Files.copy(file.toPath(), file4.toPath(), new java.nio.file.CopyOption[0]);
            } catch (java.io.IOException unused) {
            }
        } else {
            a(file4, c(file));
        }
    }

    private static java.io.File[] b(java.io.File file, java.io.FileFilter fileFilter) {
        java.io.File[] fileArr = new java.io.File[0];
        return (file != null && file.isDirectory()) ? file.listFiles(fileFilter) : fileArr;
    }
}
