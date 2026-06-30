package o35;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f424284a = new java.util.HashSet(java.util.Arrays.asList("ppt", "pdf", "doc", "docx", "pptx"));

    public static boolean a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloaderFileUtils", "deleteFilePath, %s -> %s", str, com.p314xaae8f345.mm.vfs.w6.i(str, false));
        return !r6Var.m() || r6Var.l();
    }

    public static boolean b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        return r6Var.m() && r6Var.A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        if (r3.isClosed() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
    
        if (r3.isClosed() == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(android.net.Uri r11) {
        /*
            java.lang.String r0 = ""
            if (r11 != 0) goto L5
            return r0
        L5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getContentUriFileExt() called with: filePath = ["
            r1.<init>(r2)
            java.lang.String r2 = r11.toString()
            r1.append(r2)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.ResDownloaderFileUtils"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            r1 = 0
            r3 = 0
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r11
            android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            if (r3 == 0) goto L97
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            if (r4 == 0) goto L97
            java.lang.String r4 = "mime_type"
            int r4 = r3.getColumnIndex(r4)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            r5 = -1
            if (r4 == r5) goto L68
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            android.webkit.MimeTypeMap r6 = android.webkit.MimeTypeMap.getSingleton()     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            java.lang.String r6 = r6.getExtensionFromMimeType(r4)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            java.lang.String r7 = "getContentUriFileExt: mimeType:%s fileExt:%s"
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r6}     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r7, r4)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            if (r4 != 0) goto L68
            boolean r11 = r3.isClosed()
            if (r11 != 0) goto L67
            r3.close()
        L67:
            return r6
        L68:
            java.lang.String r4 = "_display_name"
            int r4 = r3.getColumnIndex(r4)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            if (r4 == r5) goto L97
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            if (r5 != 0) goto L97
            java.lang.String r5 = e(r4)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            java.lang.String r6 = "getContentUriFileExt: fileTitle:%s fileExt:%s"
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6, r4)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            if (r4 != 0) goto L97
            boolean r11 = r3.isClosed()
            if (r11 != 0) goto L96
            r3.close()
        L96:
            return r5
        L97:
            java.lang.String r4 = r11.toString()     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            java.lang.String r4 = com.p314xaae8f345.mm.vfs.w6.n(r4)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            if (r5 != 0) goto Lc2
            java.lang.String r5 = "getContentUriFileExt: uri:%s fileExt:%s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            r6[r1] = r11     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            r11 = 1
            r6[r11] = r4     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r5, r6)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            if (r3 == 0) goto Lc1
            boolean r11 = r3.isClosed()
            if (r11 != 0) goto Lc1
            r3.close()
        Lc1:
            return r4
        Lc2:
            if (r3 == 0) goto Le0
            boolean r11 = r3.isClosed()
            if (r11 != 0) goto Le0
            goto Ldd
        Lcb:
            r11 = move-exception
            goto Le1
        Lcd:
            r11 = move-exception
            java.lang.String r4 = "getContentUriFileExt"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lcb
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r11, r4, r1)     // Catch: java.lang.Throwable -> Lcb
            if (r3 == 0) goto Le0
            boolean r11 = r3.isClosed()
            if (r11 != 0) goto Le0
        Ldd:
            r3.close()
        Le0:
            return r0
        Le1:
            if (r3 == 0) goto Lec
            boolean r0 = r3.isClosed()
            if (r0 != 0) goto Lec
            r3.close()
        Lec:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o35.a.c(android.net.Uri):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (r0.isClosed() == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(java.lang.String r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getContentUriFileExt() called with: filePath = ["
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.ResDownloaderFileUtils"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r10)
            java.lang.String r2 = ""
            if (r0 == 0) goto L21
            return r2
        L21:
            r0 = 0
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            android.content.ContentResolver r4 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            android.net.Uri r5 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r0 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            if (r0 == 0) goto L6a
            boolean r10 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            if (r10 == 0) goto L6a
            java.lang.String r10 = "mime_type"
            int r10 = r0.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            r3 = -1
            if (r10 == r3) goto L6a
            java.lang.String r10 = r0.getString(r10)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            android.webkit.MimeTypeMap r3 = android.webkit.MimeTypeMap.getSingleton()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            java.lang.String r3 = r3.getExtensionFromMimeType(r10)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            java.lang.String r4 = "getContentUriFileExt: mimeType:%s fileExt:%s"
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r3}     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r4, r10)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            boolean r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            if (r10 != 0) goto L6a
            boolean r10 = r0.isClosed()
            if (r10 != 0) goto L69
            r0.close()
        L69:
            return r3
        L6a:
            if (r0 == 0) goto L8a
            boolean r10 = r0.isClosed()
            if (r10 != 0) goto L8a
        L72:
            r0.close()
            goto L8a
        L76:
            r10 = move-exception
            goto L8b
        L78:
            r10 = move-exception
            java.lang.String r3 = "getContentUriFileExt"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L76
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r10, r3, r4)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L8a
            boolean r10 = r0.isClosed()
            if (r10 != 0) goto L8a
            goto L72
        L8a:
            return r2
        L8b:
            if (r0 == 0) goto L96
            boolean r1 = r0.isClosed()
            if (r1 != 0) goto L96
            r0.close()
        L96:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o35.a.d(java.lang.String):java.lang.String");
    }

    public static java.lang.String e(java.lang.String str) {
        try {
            int lastIndexOf = str.lastIndexOf(46);
            return (lastIndexOf == -1 || lastIndexOf >= str.length() + (-1)) ? "" : str.substring(lastIndexOf + 1);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloaderFileUtils", e17, "getExtensionFromFileName", new java.lang.Object[0]);
            return "";
        }
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17)) {
                return n17;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.startsWith("content://")) {
                n17 = d(str);
            }
            return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17) ? n17 : e(str2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloaderFileUtils", e17, "getFileExt", new java.lang.Object[0]);
            return "";
        }
    }

    public static long g(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0L;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloaderFileUtils", "getFileLength %s -> %s", str, com.p314xaae8f345.mm.vfs.w6.i(str, false));
        if (r6Var.A()) {
            return r6Var.C();
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r1.isClosed() == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String h(android.net.Uri r10) {
        /*
            java.lang.String r0 = ""
            if (r10 != 0) goto L5
            return r0
        L5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getFileName() called with: filePath = ["
            r1.<init>(r2)
            java.lang.String r2 = r10.toString()
            r1.append(r2)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.ResDownloaderFileUtils"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            r1 = 0
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            android.content.ContentResolver r4 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r10
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            if (r1 == 0) goto L50
            boolean r10 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            if (r10 == 0) goto L50
            java.lang.String r10 = "_display_name"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            r3 = -1
            if (r10 == r3) goto L50
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L4f
            r1.close()
        L4f:
            return r10
        L50:
            if (r1 == 0) goto L70
            boolean r10 = r1.isClosed()
            if (r10 != 0) goto L70
        L58:
            r1.close()
            goto L70
        L5c:
            r10 = move-exception
            goto L71
        L5e:
            r10 = move-exception
            java.lang.String r3 = "getContentUriFileExt"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L5c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r10, r3, r4)     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L70
            boolean r10 = r1.isClosed()
            if (r10 != 0) goto L70
            goto L58
        L70:
            return r0
        L71:
            if (r1 == 0) goto L7c
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L7c
            r1.close()
        L7c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o35.a.h(android.net.Uri):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable] */
    public static byte[] i(java.lang.String str) {
        ?? r86;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        try {
            try {
                inputStream = com.p314xaae8f345.mm.vfs.w6.E(str);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloaderFileUtils", "readBytes %s -> %s", str, com.p314xaae8f345.mm.vfs.w6.i(str, false));
                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            byteArrayOutputStream.flush();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            j(inputStream);
                            j(byteArrayOutputStream);
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } catch (java.io.FileNotFoundException e17) {
                    e = e17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloaderFileUtils", e, "", new java.lang.Object[0]);
                    j(inputStream);
                    j(byteArrayOutputStream);
                    return null;
                } catch (java.io.IOException e18) {
                    e = e18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloaderFileUtils", e, "", new java.lang.Object[0]);
                    j(inputStream);
                    j(byteArrayOutputStream);
                    return null;
                }
            } catch (java.io.FileNotFoundException e19) {
                e = e19;
                byteArrayOutputStream = null;
            } catch (java.io.IOException e27) {
                e = e27;
                byteArrayOutputStream = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                str = null;
                inputStream2 = inputStream;
                r86 = str;
                j(inputStream2);
                j(r86);
                throw th;
            }
        } catch (java.io.FileNotFoundException e28) {
            e = e28;
            byteArrayOutputStream = null;
            inputStream = null;
        } catch (java.io.IOException e29) {
            e = e29;
            byteArrayOutputStream = null;
            inputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            r86 = 0;
            j(inputStream2);
            j(r86);
            throw th;
        }
    }

    public static void j(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloaderFileUtils", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloaderFileUtils", java.lang.String.format("%s close failed (%s)", closeable.getClass().getSimpleName(), e17.getMessage()));
        }
    }

    public static boolean k(java.lang.String str, byte[] bArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloaderFileUtils", "writeBytes %s -> %s", str, com.p314xaae8f345.mm.vfs.w6.i(str, false));
        r6Var.l();
        r6Var.s().J();
        java.io.OutputStream outputStream = null;
        try {
            try {
                try {
                    outputStream = com.p314xaae8f345.mm.vfs.w6.H(r6Var);
                    outputStream.write(bArr);
                    try {
                        outputStream.flush();
                        outputStream.close();
                        return true;
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloaderFileUtils", e17, "", new java.lang.Object[0]);
                        return true;
                    }
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloaderFileUtils", e18, "", new java.lang.Object[0]);
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            outputStream.close();
                        } catch (java.io.IOException e19) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloaderFileUtils", e19, "", new java.lang.Object[0]);
                        }
                    }
                    return false;
                }
            } catch (java.io.FileNotFoundException e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloaderFileUtils", e27, "", new java.lang.Object[0]);
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        outputStream.close();
                    } catch (java.io.IOException e28) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloaderFileUtils", e28, "", new java.lang.Object[0]);
                    }
                }
                return false;
            }
        } catch (java.lang.Throwable th6) {
            if (outputStream != null) {
                try {
                    outputStream.flush();
                    outputStream.close();
                } catch (java.io.IOException e29) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloaderFileUtils", e29, "", new java.lang.Object[0]);
                }
            }
            throw th6;
        }
    }
}
