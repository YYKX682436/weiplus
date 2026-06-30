package com.tencent.midas.plugin;

/* loaded from: classes13.dex */
public class APPluginUtils {
    private static final int BUFFER_LENGTH = 8192;
    private static final java.lang.String TAG = "PluginUtils";
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static java.lang.String installErrMsg = null;
    private static java.util.ArrayList<java.lang.String> emptyResList = null;
    private static java.lang.String[] fileList = null;
    private static java.lang.Object copyFileObject = new java.lang.Object();

    private static void callbackInMidasPluginWhenRunningInNewProcess(android.content.Context context, int i17, java.lang.String str) {
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("EXTRA_CALLBACK_RESULT_CODE", i17);
            intent.putExtra("EXTRA_CALLBACK_RESULT_MSG", str);
            com.tencent.midas.plugin.APPluginInterfaceManager.initPluginInterface(context, com.tencent.midas.control.APMidasPayHelper.MIDAS_PLUGIN_NAME, com.tencent.midas.control.APMidasPayHelper.PKG_DISTRIBUTE, com.tencent.midas.control.APMidasPayHelper.MED_DISTRIBUTE_CALLBACK_FROM_MIDAS_PAY, new java.lang.Object[]{context, intent});
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.e("PluginProxyActivity", "openPlugin error:" + e17.toString());
        }
    }

    public static void callbackInMidasPluginWithoutCaringAboutNewProcess(android.content.Context context, int i17, java.lang.String str) {
        if (context == null) {
            com.tencent.midas.comm.APLog.e(TAG, "Call back in plugin without caring process fail, null context!");
            return;
        }
        com.tencent.midas.comm.APLog.d(TAG, "Call back in plugin without caring process, context ok!");
        if (com.tencent.midas.control.APMidasPayHelper.isNewProcess(context)) {
            com.tencent.midas.comm.APLog.d(TAG, "Call back in plugin without caring process, is new process!");
            callbackInMidasPluginWhenRunningInNewProcess(context, i17, str);
            return;
        }
        com.tencent.midas.comm.APLog.d(TAG, "Call back in plugin without caring process, not new process!");
        com.tencent.midas.api.APMidasResponse aPMidasResponse = new com.tencent.midas.api.APMidasResponse();
        aPMidasResponse.resultCode = i17;
        aPMidasResponse.resultMsg = str;
        com.tencent.midas.control.APMidasPayHelper.midasCallBack(aPMidasResponse);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean checkFileMD5(java.lang.String r5, java.lang.String r6) {
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
            java.lang.String r5 = toHexString(r5)     // Catch: java.lang.Exception -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginUtils.checkFileMD5(java.lang.String, java.lang.String):boolean");
    }

    public static void clearDirContent(java.io.File file) {
        if (file == null || (!file.exists() || !file.isDirectory())) {
            com.tencent.midas.comm.APLog.e(TAG, "call clear dir content, but parameter error!");
            return;
        }
        com.tencent.midas.comm.APLog.d(TAG, "About to clear dir, path = " + file.getAbsolutePath());
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

    public static void copyDirect(android.content.Context context, java.io.File file, java.io.File file2) {
        java.io.File[] listFiles;
        if (file == null || file2 == null || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (java.io.File file3 : listFiles) {
            copyFile(file3.getAbsolutePath(), file2.getAbsolutePath(), file3.getName());
        }
    }

    public static void copyEmtpyResAPKFromAssets(android.content.Context context) {
        java.lang.String[] assetFileList;
        if (isHasBSL() && (assetFileList = getAssetFileList(context)) != null) {
            for (java.lang.String str : assetFileList) {
                if (str.startsWith("MidasEmptyRes") && str.endsWith(".apk")) {
                    java.lang.String str2 = com.tencent.midas.plugin.APPluginConfig.getPluginEmptyResPath(context).getAbsolutePath() + java.io.File.separator + str;
                    com.tencent.midas.comm.APLog.i("APPluginUtils", "copyEmtpyResAPKFromAssets meptyResPath:" + str2);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void copyFile(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
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
            java.lang.String r0 = toHexString(r5)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L95
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginUtils.copyFile(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void deleteBKPlugin(android.content.Context context) {
        com.tencent.midas.comm.APLog.i("APPluginUtils", "deleteUpdatePlugin");
        deleteFiles(com.tencent.midas.plugin.APPluginConfig.getPluginBackUpPath(context));
    }

    public static void deleteDex(android.content.Context context) {
        com.tencent.midas.comm.APLog.i("APPluginUtils", "deleteDex");
        deleteFiles(com.tencent.midas.plugin.APPluginConfig.getOptimizedDexPath(context));
    }

    public static void deleteFiles(java.io.File file) {
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

    public static void deleteLibs(android.content.Context context) {
        com.tencent.midas.comm.APLog.i("APPluginUtils", "deleteLibs");
        deleteFiles(com.tencent.midas.plugin.APPluginConfig.getLibPath(context));
    }

    public static void deletePlugin(android.content.Context context) {
        com.tencent.midas.comm.APLog.i("APPluginUtils", "deletePlugin");
        deleteFiles(com.tencent.midas.plugin.APPluginConfig.getPluginPath(context));
    }

    public static void deletePluginOat(android.content.Context context) {
        java.io.File[] listFiles;
        com.tencent.midas.comm.APLog.i("APPluginUtils", "delete oat Plugin");
        java.io.File pluginDexOfOat = com.tencent.midas.plugin.APPluginConfig.getPluginDexOfOat(context);
        if (pluginDexOfOat == null) {
            return;
        }
        try {
            if (!pluginDexOfOat.isDirectory() || (listFiles = pluginDexOfOat.listFiles()) == null) {
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
                            com.tencent.midas.comm.APLog.i("APPluginUtils", "delete oat file=" + file2.getName());
                            file2.delete();
                        }
                    }
                    file.delete();
                }
            }
            pluginDexOfOat.delete();
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void deleteUpdatePlugin(android.content.Context context) {
        com.tencent.midas.comm.APLog.d(TAG, "Calling into deleteUpdatePlugin " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        deleteFiles(com.tencent.midas.plugin.APPluginConfig.getPluginUpdatePath(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0121, code lost:
    
        if (r6 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0123, code lost:
    
        r6.onLoadPath(r9.getPath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0164, code lost:
    
        if (r6 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r0.startsWith("x86") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int extractLibs(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginUtils.extractLibs(java.lang.String, java.lang.String):int");
    }

    private static java.lang.String[] getAssetFileList(android.content.Context context) {
        try {
            if (fileList == null) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                fileList = context.getAssets().list("");
                com.tencent.midas.data.APPluginReportManager.getInstance().insertTimeDataEx(java.lang.Thread.currentThread().getName(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_GET_FILELIST_FROM_ASSETS, currentTimeMillis);
            }
        } catch (java.io.IOException e17) {
            com.tencent.midas.comm.APLog.w("APPLuginUtils", "getPluginNameFromAssets e:" + e17.getMessage());
        }
        return fileList;
    }

    public static int getAssetsVersionCode(android.content.Context context) {
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = context.getAssets().open("MidasPay.zip");
                int zipVersionCodeWtihStream = getZipVersionCodeWtihStream(context, inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                return zipVersionCodeWtihStream;
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
            installErrMsg = getFullExceptionStacktrace(e17);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused3) {
                }
            }
            com.tencent.midas.comm.APLog.i("assets 目录下内核版本号：", "versionCode:0");
            return 0;
        }
    }

    public static java.io.File getDataZipFile(android.content.Context context) {
        java.lang.String path = com.tencent.midas.api.APMidasPayAPI.getPath();
        if (android.text.TextUtils.isEmpty(path)) {
            return null;
        }
        com.tencent.midas.comm.APLog.i("APPluginUtils", "getDataZipFile sPath:" + path);
        java.io.File file = new java.io.File(path);
        if (file.getName().startsWith("MidasPay") && file.getName().endsWith(".zip")) {
            return file;
        }
        return null;
    }

    public static java.lang.String getExceptionInfo(java.lang.Throwable th6) {
        while (th6.getCause() != null) {
            th6 = th6.getCause();
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th6.printStackTrace(new java.io.PrintWriter((java.io.Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static java.lang.String getFullExceptionStacktrace(java.lang.Throwable th6) {
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

    public static java.lang.String getInitErrorMsg() {
        return installErrMsg;
    }

    public static java.io.File getInstallPath(android.content.Context context, java.lang.String str) {
        return com.tencent.midas.plugin.APPluginInstallerAndUpdater.getInstallPath(context, str);
    }

    public static java.lang.String getInstallPathString(android.content.Context context, java.lang.String str) {
        return com.tencent.midas.plugin.APPluginInstallerAndUpdater.getInstallPathString(context, str);
    }

    public static java.io.File getLibPath(android.content.Context context) {
        return com.tencent.midas.plugin.APPluginConfig.getLibPath(context);
    }

    public static java.lang.String getMD5FromPath(java.lang.String str) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getMidasCoreVersionName(android.content.Context r6) {
        /*
            java.io.File r0 = com.tencent.midas.plugin.APPluginConfig.getPluginPath(r6)
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
            android.content.pm.PackageInfo r6 = getPackageInfo(r6, r0)
            if (r6 == 0) goto L2f
            java.lang.String r1 = r6.versionName
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginUtils.getMidasCoreVersionName(android.content.Context):java.lang.String");
    }

    public static java.util.ArrayList<java.lang.String> getMidasEmptyPaht(android.content.Context context) {
        if (emptyResList == null) {
            emptyResList = new java.util.ArrayList<>();
            java.io.File pluginEmptyResPath = com.tencent.midas.plugin.APPluginConfig.getPluginEmptyResPath(context);
            if (pluginEmptyResPath != null) {
                for (java.io.File file : pluginEmptyResPath.listFiles()) {
                    if (file.getName().startsWith("MidasEmptyRes") && file.getName().endsWith(".apk")) {
                        try {
                            emptyResList.add(file.getCanonicalPath());
                        } catch (java.io.IOException unused) {
                        }
                    }
                }
            }
        }
        return emptyResList;
    }

    public static android.content.pm.PackageInfo getPackageInfo(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        android.content.pm.PackageInfo packageInfo = com.tencent.midas.plugin.APPluginInstallerAndUpdater.sPackageInfoMap.get(str);
        if (packageInfo == null && (packageInfo = packageManager.getPackageArchiveInfo(str, 128)) != null) {
            com.tencent.midas.plugin.APPluginInstallerAndUpdater.sPackageInfoMap.put(str, packageInfo);
        }
        return packageInfo;
    }

    public static java.lang.String getProcessName(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return android.app.Application.getProcessName();
        }
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
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

    public static int getZipVersionCodeWtihFileName(android.content.Context context, java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        com.tencent.midas.comm.APLog.i("getAssetsVersionCodeWtihFileName", "sUnzipMidasPayFile:" + str);
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
            int zipVersionCodeWtihStream = getZipVersionCodeWtihStream(context, fileInputStream);
            try {
                fileInputStream.close();
            } catch (java.io.IOException unused) {
            }
            return zipVersionCodeWtihStream;
        } catch (java.lang.Exception e18) {
            e = e18;
            fileInputStream2 = fileInputStream;
            installErrMsg = getFullExceptionStacktrace(e);
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (java.io.IOException unused2) {
                }
            }
            com.tencent.midas.comm.APLog.i("special data direct", "versionCode:0");
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
    
        r2 = java.lang.Integer.parseInt(r1.substring(0, r1.lastIndexOf(com.tencent.tinker.loader.shareutil.ShareConstants.JAR_SUFFIX)).split("_")[2]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int getZipVersionCodeWtihStream(android.content.Context r6, java.io.InputStream r7) {
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
            com.tencent.midas.comm.APLog.i(r0, r1)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
        L20:
            if (r7 == 0) goto L78
            java.lang.String r1 = r7.getName()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            r3.<init>()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            java.lang.String r5 = "fileName:"
            r3.append(r5)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            r3.append(r1)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
            com.tencent.midas.comm.APLog.i(r0, r3)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7f
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
            java.lang.String r6 = getFullExceptionStacktrace(r6)     // Catch: java.lang.Throwable -> L82
            com.tencent.midas.plugin.APPluginUtils.installErrMsg = r6     // Catch: java.lang.Throwable -> L82
            if (r3 == 0) goto L90
            r3.close()     // Catch: java.lang.Exception -> L90
        L90:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "versionCode:"
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "special data direct"
            com.tencent.midas.comm.APLog.i(r7, r6)
            return r2
        La4:
            if (r3 == 0) goto La9
            r3.close()     // Catch: java.lang.Exception -> La9
        La9:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginUtils.getZipVersionCodeWtihStream(android.content.Context, java.io.InputStream):int");
    }

    private static boolean isHasBSL() {
        boolean z17;
        try {
            java.lang.Class.forName("com.tencent.theme.SkinEngine").getMethod("getInstances", new java.lang.Class[0]);
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.w("APPluginContext", " is not has com.tencent.theme.SkinEngine e:" + e17.toString());
            z17 = false;
        }
        if (z17) {
            return z17;
        }
        try {
            java.lang.Class.forName("com.tencent.component.theme.SkinEngine").getMethod("getInstances", new java.lang.Class[0]);
            return true;
        } catch (java.lang.Exception e18) {
            com.tencent.midas.comm.APLog.w("APPluginContext", " is not has com.tencent.component.theme.SkinEngine e:" + e18.toString());
            return false;
        }
    }

    public static boolean isInNewProcess(android.content.Context context) {
        java.lang.String processName = getProcessName(context);
        java.lang.String packageName = context.getApplicationContext().getPackageName();
        if (android.text.TextUtils.isEmpty(processName)) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(packageName);
        sb6.append(":");
        return processName.startsWith(sb6.toString()) || !processName.equals(packageName);
    }

    public static void readSingInfo(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.io.File file) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file.getCanonicalPath()));
            com.tencent.midas.comm.APMidasRSATools aPMidasRSATools = new com.tencent.midas.comm.APMidasRSATools();
            for (java.lang.String readLine = bufferedReader.readLine(); readLine != null && !android.text.TextUtils.isEmpty(readLine); readLine = bufferedReader.readLine()) {
                java.lang.String[] split = readLine.split("\\:");
                hashMap.put(split[0].split("\\_")[0], aPMidasRSATools.deCodeKey(split[1]).substring(r1.length() - 32));
            }
            bufferedReader.close();
        } catch (java.io.FileNotFoundException | java.io.IOException unused) {
        }
    }

    public static void readSingInfoItems(java.util.HashMap<java.lang.String, com.tencent.midas.plugin.APSignIniItem> hashMap, java.io.File file) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file.getCanonicalPath()));
            com.tencent.midas.comm.APMidasRSATools aPMidasRSATools = new com.tencent.midas.comm.APMidasRSATools();
            for (java.lang.String readLine = bufferedReader.readLine(); readLine != null && !android.text.TextUtils.isEmpty(readLine); readLine = bufferedReader.readLine()) {
                java.lang.String[] split = readLine.split("\\:");
                java.lang.String str = split[0];
                java.lang.String substring = aPMidasRSATools.deCodeKey(split[1]).substring(r4.length() - 32);
                java.lang.String str2 = str.split("\\_")[0];
                com.tencent.midas.plugin.APSignIniItem aPSignIniItem = new com.tencent.midas.plugin.APSignIniItem();
                aPSignIniItem.name = str2;
                aPSignIniItem.f53143md5 = substring;
                aPSignIniItem.fullName = split[0];
                hashMap.put(str2, aPSignIniItem);
            }
            bufferedReader.close();
        } catch (java.io.FileNotFoundException | java.io.IOException unused) {
        }
    }

    public static void release() {
        com.tencent.midas.plugin.APPluginInstallerAndUpdater.sInstallPathMap.clear();
        com.tencent.midas.plugin.APPluginInstallerAndUpdater.sPackageInfoMap.clear();
    }

    public static void showLaunchPluginFail(android.content.Context context, java.lang.String str, boolean z17) {
        com.tencent.midas.comm.APLog.d(TAG, "Calling into showLaunchPluginFail, needToPureH5Pay = " + z17 + " caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        if (!android.text.TextUtils.isEmpty(str)) {
            com.tencent.midas.data.APPluginReportManager.getInstance().reportImmediatelyOneRecord(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY, com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_NAME_LAUNCH_ERROR, str);
        }
        if (!z17 || com.tencent.midas.jsbridge.APWebJSBridgeActivity.startPureH5Pay(context, str, "showLaunchPluginFail")) {
            return;
        }
        if (str != null && (str.contains("空间") || str.contains("Space"))) {
            android.widget.Toast.makeText(context, "系统可用内存不足，请退出重试", 0).show();
        } else if (android.text.TextUtils.isEmpty(str) || !(str.contains("webview") || str.contains("Webview"))) {
            android.widget.Toast.makeText(context, "系统繁忙，请退出重试", 0).show();
        } else {
            android.widget.Toast.makeText(context, "系统组件缺失，请退出重试", 0).show();
        }
        callbackInMidasPluginWithoutCaringAboutNewProcess(context, 100, "Unexpected error!");
    }

    public static java.lang.String toHexString(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(bArr.length * 2);
        for (int i17 = 0; i17 < bArr.length; i17++) {
            char[] cArr = HEX_DIGITS;
            sb6.append(cArr[(bArr[i17] & 240) >>> 4]);
            sb6.append(cArr[bArr[i17] & 15]);
        }
        return sb6.toString();
    }

    public static void unInstallPlugin(android.content.Context context) {
        com.tencent.midas.comm.APLog.d(TAG, "unInstallPlugin " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        com.tencent.midas.plugin.APPluginInstallerAndUpdater.unInstallPlugin(context);
    }

    public static void updateLibExtendNum() {
        com.tencent.midas.plugin.APPluginConfig.libExtend++;
        com.tencent.midas.comm.APLog.i("APPluginUtils", "updateLibExtendNum libExtend:" + com.tencent.midas.plugin.APPluginConfig.libExtend);
    }

    public static java.util.HashMap<java.lang.String, java.lang.String> url2Map(java.lang.String str) {
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
                com.tencent.midas.comm.APLog.i("url2Map", "url后参数为空");
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
            com.tencent.midas.comm.APLog.w("url2Map", e17.toString());
        }
        return hashMap;
    }

    public static boolean copyFile(java.lang.String str, java.lang.String str2, java.lang.String str3) {
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
