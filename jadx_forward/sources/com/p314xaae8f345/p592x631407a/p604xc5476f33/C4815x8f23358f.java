package com.p314xaae8f345.p592x631407a.p604xc5476f33;

/* renamed from: com.tencent.midas.plugin.APPluginUtils */
/* loaded from: classes13.dex */
public class C4815x8f23358f {

    /* renamed from: BUFFER_LENGTH */
    private static final int f20817xf204dbc5 = 8192;
    private static final java.lang.String TAG = "PluginUtils";

    /* renamed from: HEX_DIGITS */
    private static final char[] f20818x7a20c6aa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: installErrMsg */
    static java.lang.String f20822x845e2157 = null;

    /* renamed from: emptyResList */
    private static java.util.ArrayList<java.lang.String> f20820x3b997f51 = null;

    /* renamed from: fileList */
    private static java.lang.String[] f20821xd424fc3a = null;

    /* renamed from: copyFileObject */
    private static java.lang.Object f20819x5bc5f530 = new java.lang.Object();

    /* renamed from: callbackInMidasPluginWhenRunningInNewProcess */
    private static void m42136x1161856(android.content.Context context, int i17, java.lang.String str) {
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("EXTRA_CALLBACK_RESULT_CODE", i17);
            intent.putExtra("EXTRA_CALLBACK_RESULT_MSG", str);
            com.p314xaae8f345.p592x631407a.p604xc5476f33.C4809x3fd5c96.m42103x34971816(context, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20418xb441bfb2, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20421x9d792e54, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20395xdd271b1d, new java.lang.Object[]{context, intent});
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("PluginProxyActivity", "openPlugin error:" + e17.toString());
        }
    }

    /* renamed from: callbackInMidasPluginWithoutCaringAboutNewProcess */
    public static void m42137xf4344e09(android.content.Context context, int i17, java.lang.String str) {
        if (context == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Call back in plugin without caring process fail, null context!");
            return;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Call back in plugin without caring process, context ok!");
        if (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41775x926af579(context)) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Call back in plugin without caring process, is new process!");
            m42136x1161856(context, i17, str);
            return;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Call back in plugin without caring process, not new process!");
        com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec = new com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec();
        c4728x8ec3caec.f20116xdde293aa = i17;
        c4728x8ec3caec.f20118x938b9624 = str;
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41776x3161eff(c4728x8ec3caec);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* renamed from: checkFileMD5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m42138xc96bec5a(java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L38
            if (r2 != 0) goto L37
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L38
            if (r2 == 0) goto Lf
            goto L37
        Lf:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L38
            r2.<init>(r5)     // Catch: java.lang.Exception -> L38
            java.lang.String r5 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch: java.lang.Exception -> L35
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L35
        L1e:
            int r3 = r2.read(r1)     // Catch: java.lang.Exception -> L35
            r4 = -1
            if (r3 == r4) goto L29
            r5.update(r1, r0, r3)     // Catch: java.lang.Exception -> L35
            goto L1e
        L29:
            r2.close()     // Catch: java.lang.Exception -> L35
            byte[] r5 = r5.digest()     // Catch: java.lang.Exception -> L35
            java.lang.String r5 = m42174x72b50ad1(r5)     // Catch: java.lang.Exception -> L35
            goto L3f
        L35:
            r1 = r2
            goto L38
        L37:
            return r0
        L38:
            if (r1 == 0) goto L3d
            r1.close()     // Catch: java.io.IOException -> L3d
        L3d:
            java.lang.String r5 = ""
        L3f:
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L47
            r5 = 1
            return r5
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42138xc96bec5a(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: clearDirContent */
    public static void m42139xed0d5559(java.io.File file) {
        if (file == null || (!file.exists() || !file.isDirectory())) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "call clear dir content, but parameter error!");
            return;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "About to clear dir, path = " + file.getAbsolutePath());
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (java.io.File file2 : listFiles) {
            if (file2 != null && file2.exists()) {
                file2.delete();
            }
        }
    }

    /* renamed from: copyDirect */
    public static void m42140xaf6f0bbe(android.content.Context context, java.io.File file, java.io.File file2) {
        java.io.File[] listFiles;
        if (file == null || file2 == null || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (java.io.File file3 : listFiles) {
            m42143xe1d15691(file3.getAbsolutePath(), file2.getAbsolutePath(), file3.getName());
        }
    }

    /* renamed from: copyEmtpyResAPKFromAssets */
    public static void m42141x5e1843c9(android.content.Context context) {
        java.lang.String[] m42152xdc8a1794;
        if (m42168xdf31230b() && (m42152xdc8a1794 = m42152xdc8a1794(context)) != null) {
            for (java.lang.String str : m42152xdc8a1794) {
                if (str.startsWith("MidasEmptyRes") && str.endsWith(".apk")) {
                    java.lang.String str2 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42076xbf7623a1(context).getAbsolutePath() + java.io.File.separator + str;
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginUtils", "copyEmtpyResAPKFromAssets meptyResPath:" + str2);
                    try {
                        java.io.InputStream open = context.getAssets().open(str);
                        java.io.File file = new java.io.File(str2);
                        file.createNewFile();
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = open.read(bArr);
                            if (read <= 0) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, read);
                            }
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        open.close();
                    } catch (java.io.IOException unused) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[SYNTHETIC] */
    /* renamed from: copyFile */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m42142xe1d15691(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> Lb0
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> Lb0
            java.lang.String r5 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            if (r4 != 0) goto L1c
            r3.mkdir()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
        L1c:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            r4.<init>()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            r4.append(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            r4.append(r7)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L93
            boolean r6 = r3.exists()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            if (r6 == 0) goto L43
            r2.close()     // Catch: java.io.IOException -> L39
        L39:
            int r5 = r0.compareToIgnoreCase(r8)
            if (r5 == 0) goto L42
            r3.delete()
        L42:
            return
        L43:
            java.io.File r6 = r3.getParentFile()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            boolean r6 = r6.exists()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            if (r6 != 0) goto L54
            java.io.File r6 = r3.getParentFile()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r6.mkdirs()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
        L54:
            r3.createNewFile()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r7 = 8192(0x2000, float:1.148E-41)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L95
        L60:
            int r1 = r2.read(r7)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L95
            r4 = -1
            if (r1 == r4) goto L6f
            r4 = 0
            r6.write(r7, r4, r1)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L95
            r5.update(r7, r4, r1)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L95
            goto L60
        L6f:
            byte[] r5 = r5.digest()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L95
            java.lang.String r0 = m42174x72b50ad1(r5)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L95
            r6.flush()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L95
            r2.close()     // Catch: java.io.IOException -> L80
            r6.close()     // Catch: java.io.IOException -> L80
        L80:
            int r5 = r0.compareToIgnoreCase(r8)
            if (r5 == 0) goto Lc7
            goto Lc4
        L87:
            r5 = move-exception
            goto L91
        L89:
            r5 = move-exception
            r6 = r1
            goto L91
        L8c:
            r6 = r1
            goto L95
        L8e:
            r5 = move-exception
            r6 = r1
            r3 = r6
        L91:
            r1 = r2
            goto L9a
        L93:
            r6 = r1
            r3 = r6
        L95:
            r1 = r2
            goto Lb2
        L97:
            r5 = move-exception
            r6 = r1
            r3 = r6
        L9a:
            if (r1 == 0) goto L9f
            r1.close()     // Catch: java.io.IOException -> La4
        L9f:
            if (r6 == 0) goto La4
            r6.close()     // Catch: java.io.IOException -> La4
        La4:
            int r6 = r0.compareToIgnoreCase(r8)
            if (r6 == 0) goto Laf
            if (r3 == 0) goto Laf
            r3.delete()
        Laf:
            throw r5
        Lb0:
            r6 = r1
            r3 = r6
        Lb2:
            if (r1 == 0) goto Lb7
            r1.close()     // Catch: java.io.IOException -> Lbc
        Lb7:
            if (r6 == 0) goto Lbc
            r6.close()     // Catch: java.io.IOException -> Lbc
        Lbc:
            int r5 = r0.compareToIgnoreCase(r8)
            if (r5 == 0) goto Lc7
            if (r3 == 0) goto Lc7
        Lc4:
            r3.delete()
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42142xe1d15691(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: deleteBKPlugin */
    public static void m42144x57f4f387(android.content.Context context) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginUtils", "deleteUpdatePlugin");
        m42146xbbbd178c(com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42074x9bf91830(context));
    }

    /* renamed from: deleteDex */
    public static void m42145xea9e226c(android.content.Context context) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginUtils", "deleteDex");
        m42146xbbbd178c(com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42073x88fb252b(context));
    }

    /* renamed from: deleteFiles */
    public static void m42146xbbbd178c(java.io.File file) {
        if (file == null) {
            return;
        }
        if (!file.isDirectory()) {
            file.delete();
            return;
        }
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (java.io.File file2 : listFiles) {
            if (file2 != null && file2.exists()) {
                file2.delete();
            }
        }
        file.delete();
    }

    /* renamed from: deleteLibs */
    public static void m42147x6929dad9(android.content.Context context) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginUtils", "deleteLibs");
        m42146xbbbd178c(com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42072x47a5ec14(context));
    }

    /* renamed from: deletePlugin */
    public static void m42148xcd24b4be(android.content.Context context) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginUtils", "deletePlugin");
        m42146xbbbd178c(com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42077xd72d2dee(context));
    }

    /* renamed from: deletePluginOat */
    public static void m42149xc2865f44(android.content.Context context) {
        java.io.File[] listFiles;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginUtils", "delete oat Plugin");
        java.io.File m42075xfa9602fd = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42075xfa9602fd(context);
        if (m42075xfa9602fd == null) {
            return;
        }
        try {
            if (!m42075xfa9602fd.isDirectory() || (listFiles = m42075xfa9602fd.listFiles()) == null) {
                return;
            }
            for (java.io.File file : listFiles) {
                if (file.isDirectory()) {
                    java.io.File[] listFiles2 = file.listFiles();
                    if (listFiles2 == null) {
                        return;
                    }
                    for (java.io.File file2 : listFiles2) {
                        if (file2 != null && file2.exists()) {
                            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginUtils", "delete oat file=" + file2.getName());
                            file2.delete();
                        }
                    }
                    file.delete();
                }
            }
            m42075xfa9602fd.delete();
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: deleteUpdatePlugin */
    public static void m42150x777ecaa7(android.content.Context context) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Calling into deleteUpdatePlugin " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        m42146xbbbd178c(com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42078xf89d1397(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0121, code lost:
    
        if (r6 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0123, code lost:
    
        r6.m41423x1319dd2a(r9.getPath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0164, code lost:
    
        if (r6 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r0.startsWith("x86") != false) goto L13;
     */
    /* renamed from: extractLibs */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m42151x6ca2d6af(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42151x6ca2d6af(java.lang.String, java.lang.String):int");
    }

    /* renamed from: getAssetFileList */
    private static java.lang.String[] m42152xdc8a1794(android.content.Context context) {
        try {
            if (f20821xd424fc3a == null) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                f20821xd424fc3a = context.getAssets().list("");
                com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41937x21a232c3(java.lang.Thread.currentThread().getName(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20607x2db3f251, currentTimeMillis);
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w("APPLuginUtils", "getPluginNameFromAssets e:" + e17.getMessage());
        }
        return f20821xd424fc3a;
    }

    /* renamed from: getAssetsVersionCode */
    public static int m42153xc6ca8eac(android.content.Context context) {
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = context.getAssets().open("MidasPay.zip");
                int m42167xbc0b64f6 = m42167xbc0b64f6(context, inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                return m42167xbc0b64f6;
            } catch (java.lang.Throwable th6) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
                throw th6;
            }
        } catch (java.lang.Exception e17) {
            f20822x845e2157 = m42156x651de627(e17);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused3) {
                }
            }
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("assets 目录下内核版本号：", "versionCode:0");
            return 0;
        }
    }

    /* renamed from: getDataZipFile */
    public static java.io.File m42154x70bda3fd(android.content.Context context) {
        java.lang.String m41358xfb83cc9b = com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41358xfb83cc9b();
        if (android.text.TextUtils.isEmpty(m41358xfb83cc9b)) {
            return null;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginUtils", "getDataZipFile sPath:" + m41358xfb83cc9b);
        java.io.File file = new java.io.File(m41358xfb83cc9b);
        if (file.getName().startsWith("MidasPay") && file.getName().endsWith(".zip")) {
            return file;
        }
        return null;
    }

    /* renamed from: getExceptionInfo */
    public static java.lang.String m42155xcdc3a5e7(java.lang.Throwable th6) {
        while (th6.getCause() != null) {
            th6 = th6.getCause();
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th6.printStackTrace(new java.io.PrintWriter((java.io.Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    /* renamed from: getFullExceptionStacktrace */
    public static java.lang.String m42156x651de627(java.lang.Throwable th6) {
        java.io.PrintWriter printWriter;
        java.io.StringWriter stringWriter = null;
        try {
            java.io.StringWriter stringWriter2 = new java.io.StringWriter();
            try {
                printWriter = new java.io.PrintWriter(stringWriter2);
                try {
                    th6.printStackTrace(printWriter);
                    java.lang.String stringWriter3 = stringWriter2.toString();
                    try {
                        stringWriter2.close();
                        printWriter.close();
                    } catch (java.io.IOException unused) {
                    }
                    return stringWriter3;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    stringWriter = stringWriter2;
                    if (stringWriter != null) {
                        try {
                            stringWriter.close();
                        } catch (java.io.IOException unused2) {
                            throw th;
                        }
                    }
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                printWriter = null;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            printWriter = null;
        }
    }

    /* renamed from: getInitErrorMsg */
    public static java.lang.String m42157x3b470bff() {
        return f20822x845e2157;
    }

    /* renamed from: getInstallPath */
    public static java.io.File m42158x5997ff2a(android.content.Context context, java.lang.String str) {
        return com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42090x5997ff2a(context, str);
    }

    /* renamed from: getInstallPathString */
    public static java.lang.String m42159x235cc3db(android.content.Context context, java.lang.String str) {
        return com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42091x235cc3db(context, str);
    }

    /* renamed from: getLibPath */
    public static java.io.File m42160x47a5ec14(android.content.Context context) {
        return com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42072x47a5ec14(context);
    }

    /* renamed from: getMD5FromPath */
    public static java.lang.String m42161x8e8bd977(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(".apk");
        int lastIndexOf2 = str.lastIndexOf("_");
        if (lastIndexOf == -1 || lastIndexOf2 == -1) {
            return "";
        }
        try {
            return str.substring(lastIndexOf2 + 1, lastIndexOf);
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r0 = r3.getCanonicalPath();
     */
    /* renamed from: getMidasCoreVersionName */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m42162x95f61f00(android.content.Context r6) {
        /*
            java.io.File r0 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42077xd72d2dee(r6)
            java.lang.String r1 = ""
            if (r0 == 0) goto L26
            java.io.File[] r0 = r0.listFiles()
            r2 = 0
        Ld:
            int r3 = r0.length
            if (r2 >= r3) goto L26
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "MidasCore"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L23
            java.lang.String r0 = r3.getCanonicalPath()     // Catch: java.io.IOException -> L26
            goto L27
        L23:
            int r2 = r2 + 1
            goto Ld
        L26:
            r0 = r1
        L27:
            android.content.pm.PackageInfo r6 = m42164xffec0de(r6, r0)
            if (r6 == 0) goto L2f
            java.lang.String r1 = r6.versionName
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42162x95f61f00(android.content.Context):java.lang.String");
    }

    /* renamed from: getMidasEmptyPaht */
    public static java.util.ArrayList<java.lang.String> m42163x399b8346(android.content.Context context) {
        if (f20820x3b997f51 == null) {
            f20820x3b997f51 = new java.util.ArrayList<>();
            java.io.File m42076xbf7623a1 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.m42076xbf7623a1(context);
            if (m42076xbf7623a1 != null) {
                for (java.io.File file : m42076xbf7623a1.listFiles()) {
                    if (file.getName().startsWith("MidasEmptyRes") && file.getName().endsWith(".apk")) {
                        try {
                            f20820x3b997f51.add(file.getCanonicalPath());
                        } catch (java.io.IOException unused) {
                        }
                    }
                }
            }
        }
        return f20820x3b997f51;
    }

    /* renamed from: getPackageInfo */
    public static android.content.pm.PackageInfo m42164xffec0de(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        android.content.pm.PackageInfo packageInfo = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.f20767x922f11fb.get(str);
        if (packageInfo == null && (packageInfo = packageManager.getPackageArchiveInfo(str, 128)) != null) {
            com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.f20767x922f11fb.put(str, packageInfo);
        }
        return packageInfo;
    }

    /* renamed from: getProcessName */
    public static java.lang.String m42165xe5e58464(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return android.app.Application.getProcessName();
        }
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == android.os.Process.myPid()) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    /* renamed from: getZipVersionCodeWtihFileName */
    public static int m42166x502c561d(android.content.Context context, java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("getAssetsVersionCodeWtihFileName", "sUnzipMidasPayFile:" + str);
        java.io.FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new java.io.FileInputStream(str);
            } catch (java.lang.Exception e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            int m42167xbc0b64f6 = m42167xbc0b64f6(context, fileInputStream);
            try {
                fileInputStream.close();
            } catch (java.io.IOException unused) {
            }
            return m42167xbc0b64f6;
        } catch (java.lang.Exception e18) {
            e = e18;
            fileInputStream2 = fileInputStream;
            f20822x845e2157 = m42156x651de627(e);
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (java.io.IOException unused2) {
                }
            }
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("special data direct", "versionCode:0");
            return 0;
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (java.io.IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        r2 = java.lang.Integer.parseInt(r1.substring(0, r1.lastIndexOf(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55691xbc9c2a15)).split("_")[2]);
     */
    /* renamed from: getZipVersionCodeWtihStream */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int m42167xbc0b64f6(android.content.Context r6, java.io.InputStream r7) {
        /*
            java.lang.String r6 = ".jar"
            java.lang.String r0 = "getAssetsVersionCodeWtihFileName"
            java.lang.String r1 = "zipEntry:"
            r2 = 0
            r3 = 0
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L84
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L84
            java.util.zip.ZipEntry r7 = r4.getNextEntry()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            r3.append(r7)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(r0, r1)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
        L20:
            if (r7 == 0) goto L78
            java.lang.String r1 = r7.getName()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            r3.<init>()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            java.lang.String r5 = "fileName:"
            r3.append(r5)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            r3.append(r1)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(r0, r3)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            boolean r7 = r7.isDirectory()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            if (r7 != 0) goto L73
            java.lang.String r7 = "../"
            boolean r7 = r1.contains(r7)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            if (r7 == 0) goto L49
            goto L73
        L49:
            java.lang.String r7 = "MidasCore"
            boolean r7 = r1.startsWith(r7)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            if (r7 == 0) goto L6e
            boolean r7 = r1.endsWith(r6)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            if (r7 == 0) goto L6e
            int r6 = r1.lastIndexOf(r6)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            java.lang.String r6 = r1.substring(r2, r6)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            java.lang.String r7 = "_"
            java.lang.String[] r6 = r6.split(r7)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            r7 = 2
            r6 = r6[r7]     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            r2 = r6
            goto L78
        L6e:
            java.util.zip.ZipEntry r7 = r4.getNextEntry()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            goto L20
        L73:
            java.util.zip.ZipEntry r7 = r4.getNextEntry()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            goto L20
        L78:
            r4.close()     // Catch: java.lang.Exception -> L90
            goto L90
        L7c:
            r6 = move-exception
            r3 = r4
            goto La4
        L7f:
            r6 = move-exception
            r3 = r4
            goto L85
        L82:
            r6 = move-exception
            goto La4
        L84:
            r6 = move-exception
        L85:
            java.lang.String r6 = m42156x651de627(r6)     // Catch: java.lang.Throwable -> L82
            com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.f20822x845e2157 = r6     // Catch: java.lang.Throwable -> L82
            if (r3 == 0) goto L90
            r3.close()     // Catch: java.lang.Exception -> L90
        L90:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "versionCode:"
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "special data direct"
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(r7, r6)
            return r2
        La4:
            if (r3 == 0) goto La9
            r3.close()     // Catch: java.lang.Exception -> La9
        La9:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42167xbc0b64f6(android.content.Context, java.io.InputStream):int");
    }

    /* renamed from: isHasBSL */
    private static boolean m42168xdf31230b() {
        boolean z17;
        try {
            java.lang.Class.forName("com.tencent.theme.SkinEngine").getMethod("getInstances", new java.lang.Class[0]);
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w("APPluginContext", " is not has com.tencent.theme.SkinEngine e:" + e17.toString());
            z17 = false;
        }
        if (z17) {
            return z17;
        }
        try {
            java.lang.Class.forName("com.tencent.component.theme.SkinEngine").getMethod("getInstances", new java.lang.Class[0]);
            return true;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w("APPluginContext", " is not has com.tencent.component.theme.SkinEngine e:" + e18.toString());
            return false;
        }
    }

    /* renamed from: isInNewProcess */
    public static boolean m42169x7c9269fe(android.content.Context context) {
        java.lang.String m42165xe5e58464 = m42165xe5e58464(context);
        java.lang.String packageName = context.getApplicationContext().getPackageName();
        if (android.text.TextUtils.isEmpty(m42165xe5e58464)) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(packageName);
        sb6.append(":");
        return m42165xe5e58464.startsWith(sb6.toString()) || !m42165xe5e58464.equals(packageName);
    }

    /* renamed from: readSingInfo */
    public static void m42170xc7d89f93(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.io.File file) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file.getCanonicalPath()));
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4759x7fb6c226 c4759x7fb6c226 = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4759x7fb6c226();
            for (java.lang.String readLine = bufferedReader.readLine(); readLine != null && !android.text.TextUtils.isEmpty(readLine); readLine = bufferedReader.readLine()) {
                java.lang.String[] split = readLine.split("\\:");
                hashMap.put(split[0].split("\\_")[0], c4759x7fb6c226.m41656x81edbd71(split[1]).substring(r1.length() - 32));
            }
            bufferedReader.close();
        } catch (java.io.FileNotFoundException | java.io.IOException unused) {
        }
    }

    /* renamed from: readSingInfoItems */
    public static void m42171xb0c61bed(java.util.HashMap<java.lang.String, com.p314xaae8f345.p592x631407a.p604xc5476f33.C4816x909e2ceb> hashMap, java.io.File file) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file.getCanonicalPath()));
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4759x7fb6c226 c4759x7fb6c226 = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4759x7fb6c226();
            for (java.lang.String readLine = bufferedReader.readLine(); readLine != null && !android.text.TextUtils.isEmpty(readLine); readLine = bufferedReader.readLine()) {
                java.lang.String[] split = readLine.split("\\:");
                java.lang.String str = split[0];
                java.lang.String substring = c4759x7fb6c226.m41656x81edbd71(split[1]).substring(r4.length() - 32);
                java.lang.String str2 = str.split("\\_")[0];
                com.p314xaae8f345.p592x631407a.p604xc5476f33.C4816x909e2ceb c4816x909e2ceb = new com.p314xaae8f345.p592x631407a.p604xc5476f33.C4816x909e2ceb();
                c4816x909e2ceb.f20824x337a8b = str2;
                c4816x909e2ceb.f134676md5 = substring;
                c4816x909e2ceb.f20823x4f5331ba = split[0];
                hashMap.put(str2, c4816x909e2ceb);
            }
            bufferedReader.close();
        } catch (java.io.FileNotFoundException | java.io.IOException unused) {
        }
    }

    /* renamed from: release */
    public static void m42172x41012807() {
        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.f20766x5247a02f.clear();
        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.f20767x922f11fb.clear();
    }

    /* renamed from: showLaunchPluginFail */
    public static void m42173xe592aa21(android.content.Context context, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Calling into showLaunchPluginFail, needToPureH5Pay = " + z17 + " caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        if (!android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41940xebbf4a4d(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20540x4c0395c3, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20605x9a3893de, str);
        }
        if (!z17 || com.p314xaae8f345.p592x631407a.p603x745bd612.ActivityC4793x6b9f8206.m41984x81ab0241(context, str, "showLaunchPluginFail")) {
            return;
        }
        if (str != null && (str.contains("空间") || str.contains("Space"))) {
            android.widget.Toast.makeText(context, "系统可用内存不足，请退出重试", 0).show();
        } else if (android.text.TextUtils.isEmpty(str) || !(str.contains("webview") || str.contains("Webview"))) {
            android.widget.Toast.makeText(context, "系统繁忙，请退出重试", 0).show();
        } else {
            android.widget.Toast.makeText(context, "系统组件缺失，请退出重试", 0).show();
        }
        m42137xf4344e09(context, 100, "Unexpected error!");
    }

    /* renamed from: toHexString */
    public static java.lang.String m42174x72b50ad1(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(bArr.length * 2);
        for (int i17 = 0; i17 < bArr.length; i17++) {
            char[] cArr = f20818x7a20c6aa;
            sb6.append(cArr[(bArr[i17] & 240) >>> 4]);
            sb6.append(cArr[bArr[i17] & 15]);
        }
        return sb6.toString();
    }

    /* renamed from: unInstallPlugin */
    public static void m42175xe5040295(android.content.Context context) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "unInstallPlugin " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42100xe5040295(context);
    }

    /* renamed from: updateLibExtendNum */
    public static void m42176xeddc1070() {
        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.f20753xe4ec95ff++;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginUtils", "updateLibExtendNum libExtend:" + com.p314xaae8f345.p592x631407a.p604xc5476f33.C4806x3647fa24.f20753xe4ec95ff);
    }

    /* renamed from: url2Map */
    public static java.util.HashMap<java.lang.String, java.lang.String> m42177xf5cb5db9(java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        java.lang.String[] split = str.split("\\?");
        if (split == null) {
            return null;
        }
        if (split.length == 1) {
            str = split[0];
        } else if (split.length == 2) {
            str = split[1];
        }
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("url2Map", "url后参数为空");
            } else {
                java.lang.String[] split2 = str.split("\\&");
                java.lang.String str2 = "";
                java.lang.String str3 = "";
                for (int i17 = 0; i17 < split2.length; i17++) {
                    try {
                        str2 = split2[i17].split("\\=")[0];
                        str3 = split2[i17].split("\\=")[1];
                    } catch (java.lang.Exception unused) {
                    }
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        hashMap.put(str2, str3);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w("url2Map", e17.toString());
        }
        return hashMap;
    }

    /* renamed from: copyFile */
    public static boolean m42143xe1d15691(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.io.FileOutputStream fileOutputStream;
        java.io.FileInputStream fileInputStream = null;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(str);
            try {
                java.io.File file = new java.io.File(str2);
                if (!file.exists()) {
                    file.mkdir();
                }
                java.io.File file2 = new java.io.File(str2, str3);
                if (file2.exists()) {
                    try {
                        fileInputStream2.close();
                    } catch (java.io.IOException unused) {
                    }
                    return false;
                }
                fileOutputStream = new java.io.FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.flush();
                            try {
                                fileInputStream2.close();
                                fileOutputStream.close();
                                return true;
                            } catch (java.io.IOException unused2) {
                                return true;
                            }
                        }
                    }
                } catch (java.lang.Exception unused3) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (java.io.IOException unused4) {
                            return false;
                        }
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    return false;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (java.io.IOException unused5) {
                            throw th;
                        }
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (java.lang.Exception unused6) {
                fileOutputStream = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                fileOutputStream = null;
            }
        } catch (java.lang.Exception unused7) {
            fileOutputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            fileOutputStream = null;
        }
    }
}
