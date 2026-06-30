package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil */
/* loaded from: classes13.dex */
public class C26380x4ab8bb4c {

    /* renamed from: FILE_NAME */
    private static final java.lang.String f53046x59634b6e = "TPDLIOUtil";

    /* renamed from: PROTOCOL_ASSET */
    private static final java.lang.String f53048xcf648269 = "asset";

    /* renamed from: PROTOCOL_FILE */
    private static final java.lang.String f53049xe5aa86c3 = "file";

    /* renamed from: PROTOCOL_HTTP */
    private static final java.lang.String f53050xe5ab99cf = "http";

    /* renamed from: PROTOCOL_HTTPS */
    private static final java.lang.String f53051xcfc7a064 = "https";

    /* renamed from: PROTOCOL_PATTERN */
    private static java.util.regex.Pattern f53052x832884c9 = java.util.regex.Pattern.compile("^(\\w+):/{2,3}");

    /* renamed from: PATH_PATTERN */
    private static java.util.regex.Pattern f53047x99218556 = java.util.regex.Pattern.compile("^(\\w+):/{2,3}(.*)");

    /* renamed from: compare */
    public static java.io.File m102475x38a73ce5(java.io.File file, java.io.File file2) {
        return file == null ? file2 : (file2 == null || !file2.exists()) ? file : (file.exists() && file.lastModified() > file2.lastModified()) ? file : file2;
    }

    /* renamed from: copy */
    public static int m102477x2eaf75(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        if (inputStream == null || outputStream == null) {
            return 0;
        }
        byte[] bArr = new byte[1024];
        int i17 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                i17 += read;
            } catch (java.io.IOException unused) {
            }
        }
        return i17;
    }

    /* renamed from: createFile */
    public static boolean m102478x51962c98(java.io.File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        if (!m102480xdd00af25(file)) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    /* renamed from: createParentDirectories */
    public static boolean m102480xdd00af25(java.io.File file) {
        if (file == null) {
            return false;
        }
        java.io.File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists()) {
            return true;
        }
        return parentFile.mkdirs();
    }

    /* renamed from: getPath */
    public static java.lang.String m102482xfb83cc9b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.regex.Matcher matcher = f53047x99218556.matcher(str);
        return (matcher.find() && matcher.group(1).equals(f53048xcf648269)) ? matcher.group(2) : str;
    }

    /* renamed from: getProtocol */
    public static java.lang.String m102483x40e4cc0e(java.lang.String str) {
        if (str != null && str.length() > 0) {
            java.util.regex.Matcher matcher = f53052x832884c9.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return f53049xe5aa86c3;
    }

    /* renamed from: isExternalStorageMounted */
    public static boolean m102484x59a899f2() {
        return android.os.Environment.getExternalStorageState().equals("mounted");
    }

    /* renamed from: isRemoteFile */
    public static boolean m102485xbf75cbac(java.lang.String str) {
        java.lang.String m102483x40e4cc0e = m102483x40e4cc0e(str);
        return m102483x40e4cc0e.equals(f53051xcfc7a064) || m102483x40e4cc0e.equals(f53050xe5ab99cf);
    }

    /* renamed from: open */
    public static java.io.InputStream m102486x34264a(android.content.Context context, java.lang.String str) {
        java.lang.String m102483x40e4cc0e = m102483x40e4cc0e(str);
        if (m102483x40e4cc0e.equals(f53048xcf648269)) {
            try {
                return context.getAssets().open(m102482xfb83cc9b(str));
            } catch (java.io.IOException unused) {
                return null;
            }
        }
        if (m102483x40e4cc0e.equals(f53049xe5aa86c3)) {
            try {
                return new java.io.FileInputStream(m102482xfb83cc9b(str));
            } catch (java.lang.Exception unused2) {
                return null;
            }
        }
        if (!m102483x40e4cc0e.equals(f53050xe5ab99cf) && !m102483x40e4cc0e.equals(f53051xcfc7a064)) {
            return null;
        }
        try {
            return new java.net.URL(str).openStream();
        } catch (java.lang.Exception unused3) {
            return null;
        }
    }

    /* renamed from: openInputStream */
    public static java.io.InputStream m102488x805ea340(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return m102487x805ea340(new java.io.File(str));
    }

    /* renamed from: openOutputStream */
    public static java.io.OutputStream m102490xb9112b4b(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return m102489xb9112b4b(new java.io.File(str));
    }

    /* renamed from: recursiveDelete */
    public static void m102491xf664687d(java.io.File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        java.io.File[] listFiles = file.listFiles();
                        if (listFiles == null) {
                            return;
                        }
                        for (java.io.File file2 : listFiles) {
                            m102491xf664687d(file2);
                        }
                    }
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.d(f53046x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "recursiveDelete: delete=" + file.delete());
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.d(f53046x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "recursiveDelete failed, error:" + e17.toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r6.createNewFile() == false) goto L17;
     */
    /* renamed from: write */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m102492x6c257df(java.io.File r6, byte[] r7, int r8, int r9) {
        /*
            java.lang.String r0 = "write error:"
            java.lang.String r1 = "tpdlnative"
            java.lang.String r2 = "TPDLIOUtil"
            r3 = 0
            if (r6 == 0) goto L88
            if (r7 == 0) goto L88
            int r4 = r7.length
            if (r4 > 0) goto L10
            goto L88
        L10:
            boolean r4 = r6.exists()
            if (r4 != 0) goto L2a
            java.io.File r4 = r6.getParentFile()
            if (r4 == 0) goto L23
            boolean r4 = r4.mkdirs()
            if (r4 != 0) goto L23
            return r3
        L23:
            boolean r4 = r6.createNewFile()     // Catch: java.io.IOException -> L29
            if (r4 != 0) goto L2a
        L29:
            return r3
        L2a:
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L6e
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L6e
            r5.write(r7, r8, r9)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r5.close()     // Catch: java.io.IOException -> L37
            goto L4b
        L37:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r6 = r6.toString()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(r2, r3, r1, r6)
        L4b:
            r6 = 1
            return r6
        L4d:
            r6 = move-exception
            r4 = r5
            goto L53
        L50:
            r4 = r5
            goto L6e
        L52:
            r6 = move-exception
        L53:
            if (r4 == 0) goto L6d
            r4.close()     // Catch: java.io.IOException -> L59
            goto L6d
        L59:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            java.lang.String r7 = r7.toString()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(r2, r3, r1, r7)
        L6d:
            throw r6
        L6e:
            if (r4 == 0) goto L88
            r4.close()     // Catch: java.io.IOException -> L74
            goto L88
        L74:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r6 = r6.toString()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(r2, r3, r1, r6)
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26380x4ab8bb4c.m102492x6c257df(java.io.File, byte[], int, int):boolean");
    }

    /* renamed from: copy */
    public static int m102476x2eaf75(java.io.File file, java.io.File file2) {
        java.io.FileOutputStream fileOutputStream;
        if (file == null || file2 == null || !file.exists()) {
            return 0;
        }
        if (!file2.exists()) {
            java.io.File parentFile = file2.getParentFile();
            if (parentFile == null) {
                return 0;
            }
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                return 0;
            }
        }
        java.io.FileInputStream fileInputStream = null;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                fileOutputStream = new java.io.FileOutputStream(file2);
                try {
                    int m102477x2eaf75 = m102477x2eaf75(fileInputStream2, fileOutputStream);
                    try {
                        fileInputStream2.close();
                    } catch (java.io.IOException unused) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                    return m102477x2eaf75;
                } catch (java.io.FileNotFoundException unused3) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (java.io.IOException unused4) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException unused5) {
                        }
                    }
                    return 0;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (java.io.IOException unused6) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (java.io.IOException unused7) {
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (java.io.FileNotFoundException unused8) {
                fileOutputStream = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                fileOutputStream = null;
            }
        } catch (java.io.FileNotFoundException unused9) {
            fileOutputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            fileOutputStream = null;
        }
    }

    /* renamed from: openInputStream */
    public static java.io.InputStream m102487x805ea340(java.io.File file) {
        if (file == null) {
            return null;
        }
        try {
            return new java.io.FileInputStream(file);
        } catch (java.io.FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: openOutputStream */
    public static java.io.OutputStream m102489xb9112b4b(java.io.File file) {
        if (file != null && m102478x51962c98(file)) {
            try {
                return new java.io.FileOutputStream(file);
            } catch (java.io.FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* renamed from: createFile */
    public static boolean m102479x51962c98(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return m102478x51962c98(new java.io.File(str));
    }

    /* renamed from: createParentDirectories */
    public static boolean m102481xdd00af25(java.lang.String str) {
        return m102480xdd00af25(new java.io.File(str));
    }
}
