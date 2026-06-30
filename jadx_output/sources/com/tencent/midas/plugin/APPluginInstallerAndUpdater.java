package com.tencent.midas.plugin;

/* loaded from: classes13.dex */
public class APPluginInstallerAndUpdater {
    private static final int BUFFER_LENGTH = 8192;
    private static final int INSTALL_ERR_LOSTZIPFILE = -2;
    private static final int INSTALL_ERR_MD5CHECKFAIL = -3;
    static final int INSTALL_ERR_SYSTEM = -1;
    static final int INSTALL_FROM_ASSETS = 1;
    static final int INSTALL_FROM_LOCAL = 2;
    private static final int INSTALL_SUCC = 0;
    private static final java.lang.String TAG = "APPluginInstallerAndUpdater";
    static java.util.Map<java.lang.String, java.io.File> sInstallPathMap = new java.util.concurrent.ConcurrentHashMap();
    static java.util.Map<java.lang.String, android.content.pm.PackageInfo> sPackageInfoMap = new java.util.concurrent.ConcurrentHashMap();

    public static java.io.File getInstallPath(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.io.File file = sInstallPathMap.get(str);
        if (file == null) {
            java.io.File pluginPath = com.tencent.midas.plugin.APPluginConfig.getPluginPath(context);
            if (pluginPath == null) {
                return null;
            }
            for (java.io.File file2 : pluginPath.listFiles()) {
                if (file2.getName().startsWith(str)) {
                    sInstallPathMap.put(str, file2);
                    return file2;
                }
            }
        }
        return file;
    }

    public static java.lang.String getInstallPathString(android.content.Context context, java.lang.String str) {
        try {
            java.io.File installPath = getInstallPath(context, str);
            return installPath != null ? installPath.getCanonicalPath() : "";
        } catch (java.io.IOException unused) {
            return "";
        }
    }

    private static int installFromAssets(android.content.Context context) {
        com.tencent.midas.plugin.APPluginUtils.copyEmtpyResAPKFromAssets(context);
        if (android.text.TextUtils.isEmpty("MidasPay.zip")) {
            return -2;
        }
        java.io.InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open("MidasPay.zip");
            installFromZipStream(context, inputStream);
            if (inputStream == null) {
                return 0;
            }
            try {
                inputStream.close();
                return 0;
            } catch (java.io.IOException unused) {
                return 0;
            }
        } catch (java.io.IOException unused2) {
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (java.io.IOException unused3) {
                return -1;
            }
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused4) {
                }
            }
            throw th6;
        }
    }

    private static int installFromData(android.content.Context context) {
        com.tencent.midas.plugin.APPluginUtils.copyEmtpyResAPKFromAssets(context);
        java.io.File dataZipFile = com.tencent.midas.plugin.APPluginUtils.getDataZipFile(context);
        com.tencent.midas.comm.APLog.i("APPluginUtils", "installFromData zipFile:" + dataZipFile);
        if (dataZipFile == null) {
            return -2;
        }
        java.io.FileInputStream fileInputStream = null;
        try {
            com.tencent.midas.comm.APLog.i("APPluginUtils", "installFromData filePath:" + dataZipFile.getCanonicalPath());
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(dataZipFile);
            try {
                installFromZipStream(context, fileInputStream2);
                try {
                    fileInputStream2.close();
                    return 0;
                } catch (java.io.IOException unused) {
                    return 0;
                }
            } catch (java.io.IOException unused2) {
                fileInputStream = fileInputStream2;
                if (fileInputStream == null) {
                    return -1;
                }
                try {
                    fileInputStream.close();
                    return -1;
                } catch (java.io.IOException unused3) {
                    return -1;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (java.io.IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (java.io.IOException unused5) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static int installFromLocal(android.content.Context context) {
        int i17;
        com.tencent.midas.comm.APLog.d(TAG, "Calling into installFromLocal " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        com.tencent.midas.plugin.APPluginUtils.deleteBKPlugin(context);
        com.tencent.midas.plugin.APPluginUtils.copyDirect(context, com.tencent.midas.plugin.APPluginConfig.getPluginUpdatePath(context), com.tencent.midas.plugin.APPluginConfig.getPluginBackUpPath(context));
        try {
            java.io.File pluginUpdatePath = com.tencent.midas.plugin.APPluginConfig.getPluginUpdatePath(context);
            i17 = installFromLocalByPath(context, pluginUpdatePath);
            com.tencent.midas.comm.APLog.d(TAG, "Calling into installFromLocal, installFromLocalByPath result state = " + i17 + " install src = " + pluginUpdatePath);
        } catch (java.lang.Exception unused) {
            i17 = -1;
        }
        if (i17 != 0) {
            unInstallPlugin(context);
            i17 = installFromLocalByPath(context, com.tencent.midas.plugin.APPluginConfig.getPluginBackUpPath(context));
            if (i17 != 0) {
                unInstallPlugin(context);
            }
        } else {
            com.tencent.midas.plugin.APPluginUtils.deleteUpdatePlugin(context);
        }
        com.tencent.midas.comm.APLog.i("APPluginUtils", "installFromLocal state:" + i17);
        return i17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:(2:10|11)|(3:131|132|(6:(2:141|142)|(1:136)|(1:138)|139|140|42))|13|(5:91|92|93|(13:97|98|99|100|101|102|103|104|105|(2:107|108)(1:110)|109|94|95)|123)|15|16|17|18|19|21|22|23|24|25|(3:26|27|(4:29|30|31|33)(1:66))|67|68|69|70|71|42|8) */
    /* JADX WARN: Can't wrap try/catch for region: R(23:10|11|(3:131|132|(6:(2:141|142)|(1:136)|(1:138)|139|140|42))|13|(5:91|92|93|(13:97|98|99|100|101|102|103|104|105|(2:107|108)(1:110)|109|94|95)|123)|15|16|17|18|19|21|22|23|24|25|(3:26|27|(4:29|30|31|33)(1:66))|67|68|69|70|71|42|8) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017d, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0182, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0178, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0150, code lost:
    
        r11 = -1;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014b, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015b, code lost:
    
        r11 = -1;
        r12 = 0;
        r6 = r3;
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0156, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0157, code lost:
    
        r11 = -1;
        r6 = r3;
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0164, code lost:
    
        r11 = -1;
        r12 = 0;
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016f, code lost:
    
        r6 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0160, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0161, code lost:
    
        r11 = -1;
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016a, code lost:
    
        r6 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016d, code lost:
    
        r11 = -1;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0168, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0169, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0196 A[Catch: Exception -> 0x0192, IOException -> 0x019e, TryCatch #19 {Exception -> 0x0192, blocks: (B:65:0x0178, B:57:0x017d, B:59:0x0182, B:62:0x0185, B:45:0x018e, B:38:0x0196, B:40:0x019b, B:69:0x013a), top: B:44:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019b A[Catch: Exception -> 0x0192, IOException -> 0x019e, TRY_LEAVE, TryCatch #19 {Exception -> 0x0192, blocks: (B:65:0x0178, B:57:0x017d, B:59:0x0182, B:62:0x0185, B:45:0x018e, B:38:0x0196, B:40:0x019b, B:69:0x013a), top: B:44:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017d A[Catch: IOException -> 0x0185, Exception -> 0x0192, TryCatch #6 {IOException -> 0x0185, blocks: (B:65:0x0178, B:57:0x017d, B:59:0x0182), top: B:64:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0182 A[Catch: IOException -> 0x0185, Exception -> 0x0192, TRY_LEAVE, TryCatch #6 {IOException -> 0x0185, blocks: (B:65:0x0178, B:57:0x017d, B:59:0x0182), top: B:64:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int installFromLocalByPath(android.content.Context r18, java.io.File r19) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginInstallerAndUpdater.installFromLocalByPath(android.content.Context, java.io.File):int");
    }

    public static int installFromZipStream(android.content.Context context, java.io.InputStream inputStream) {
        java.util.zip.ZipInputStream zipInputStream;
        java.lang.String str;
        java.io.FileOutputStream fileOutputStream;
        java.io.BufferedOutputStream bufferedOutputStream;
        com.tencent.midas.plugin.APPluginUtils.copyEmtpyResAPKFromAssets(context);
        if (inputStream == null) {
            return -2;
        }
        java.util.zip.ZipInputStream zipInputStream2 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        java.io.BufferedOutputStream bufferedOutputStream2 = null;
        java.util.zip.ZipInputStream zipInputStream3 = null;
        try {
            try {
                zipInputStream = new java.util.zip.ZipInputStream(inputStream);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
            java.lang.String absolutePath = com.tencent.midas.plugin.APPluginConfig.getPluginPath(context).getAbsolutePath();
            while (nextEntry != null) {
                java.lang.String name = nextEntry.getName();
                if (!nextEntry.isDirectory() && !name.contains("../")) {
                    if (name.endsWith(com.tencent.tinker.loader.shareutil.ShareConstants.JAR_SUFFIX)) {
                        int lastIndexOf = name.lastIndexOf(com.tencent.tinker.loader.shareutil.ShareConstants.JAR_SUFFIX);
                        if (lastIndexOf != -1) {
                            name = name.substring(0, lastIndexOf);
                        }
                        java.lang.String str2 = name.split("_")[3];
                        str = absolutePath + java.io.File.separator + name + ".apk";
                    } else {
                        str = absolutePath + java.io.File.separator + name;
                    }
                    try {
                        fileOutputStream = new java.io.FileOutputStream(new java.io.File(str));
                        try {
                            try {
                                bufferedOutputStream = new java.io.BufferedOutputStream(fileOutputStream);
                            } catch (java.lang.Exception e18) {
                                e = e18;
                            }
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                        }
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int read = zipInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, read);
                            }
                            bufferedOutputStream.flush();
                            java.util.zip.ZipEntry nextEntry2 = zipInputStream.getNextEntry();
                            try {
                                bufferedOutputStream.close();
                                fileOutputStream.close();
                            } catch (java.io.IOException unused) {
                            }
                            nextEntry = nextEntry2;
                        } catch (java.lang.Exception e19) {
                            e = e19;
                            bufferedOutputStream2 = bufferedOutputStream;
                            com.tencent.midas.plugin.APPluginUtils.installErrMsg = com.tencent.midas.plugin.APPluginUtils.getFullExceptionStacktrace(e);
                            if (bufferedOutputStream2 != null) {
                                try {
                                    bufferedOutputStream2.close();
                                } catch (java.io.IOException unused2) {
                                    zipInputStream.close();
                                    return -1;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            try {
                                zipInputStream.close();
                            } catch (java.io.IOException unused3) {
                            }
                            return -1;
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            bufferedOutputStream2 = bufferedOutputStream;
                            if (bufferedOutputStream2 != null) {
                                try {
                                    bufferedOutputStream2.close();
                                } catch (java.io.IOException unused4) {
                                    throw th;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (java.lang.Exception e27) {
                        e = e27;
                        fileOutputStream = null;
                    } catch (java.lang.Throwable th9) {
                        th = th9;
                        fileOutputStream = null;
                    }
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            try {
                zipInputStream.close();
            } catch (java.io.IOException unused5) {
            }
            return 0;
        } catch (java.lang.Exception e28) {
            e = e28;
            zipInputStream2 = zipInputStream;
            com.tencent.midas.plugin.APPluginUtils.installErrMsg = com.tencent.midas.plugin.APPluginUtils.getFullExceptionStacktrace(e);
            if (zipInputStream2 != null) {
                try {
                    zipInputStream2.close();
                } catch (java.io.IOException unused6) {
                }
            }
            return -1;
        } catch (java.lang.Throwable th10) {
            th = th10;
            zipInputStream3 = zipInputStream;
            if (zipInputStream3 != null) {
                try {
                    zipInputStream3.close();
                } catch (java.io.IOException unused7) {
                }
            }
            throw th;
        }
    }

    public static int installPlugin(android.content.Context context, int i17) {
        com.tencent.midas.comm.APLog.d(TAG, "installPlugin from = " + i17);
        int i18 = 0;
        try {
            unInstallPlugin(context);
            if (i17 == 1) {
                i18 = installFromAssets(context);
            } else if (i17 == 2) {
                i18 = installFromData(context);
            }
            if (i18 != 0) {
                unInstallPlugin(context);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.w("APPluginUtils", "installPlugin Exception:" + e17.toString());
            com.tencent.midas.plugin.APPluginUtils.installErrMsg = com.tencent.midas.plugin.APPluginUtils.getFullExceptionStacktrace(e17);
        }
        return i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int isNeedUpdateFromAssets(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "MidasCore"
            java.io.File r0 = getInstallPath(r5, r0)     // Catch: java.lang.Exception -> Lb
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.lang.Exception -> Lb
            goto Ld
        Lb:
            java.lang.String r0 = ""
        Ld:
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L21
            if (r2 != 0) goto L1b
            android.content.pm.PackageInfo r0 = com.tencent.midas.plugin.APPluginUtils.getPackageInfo(r5, r0)     // Catch: java.lang.Exception -> L21
            int r0 = r0.versionCode     // Catch: java.lang.Exception -> L21
            goto L1c
        L1b:
            r0 = r1
        L1c:
            int r2 = com.tencent.midas.plugin.APPluginUtils.getAssetsVersionCode(r5)     // Catch: java.lang.Exception -> L22
            goto L23
        L21:
            r0 = r1
        L22:
            r2 = r1
        L23:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "isNeedUpdateFromAssets coreVC:"
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " assetsVC:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "APPluginUtils"
            com.tencent.midas.comm.APLog.i(r4, r3)
            java.lang.String r3 = "release"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L5c
            r6 = 199010(0x30962, float:2.78872E-40)
            if (r6 == r2) goto L5c
            if (r5 == 0) goto L5c
            boolean r6 = r5 instanceof android.app.Activity
            if (r6 == 0) goto L5c
            r6 = r5
            android.app.Activity r6 = (android.app.Activity) r6
            com.tencent.midas.plugin.APPluginInstallerAndUpdater$1 r3 = new com.tencent.midas.plugin.APPluginInstallerAndUpdater$1
            r3.<init>()
            r6.runOnUiThread(r3)
        L5c:
            if (r2 <= r0) goto L60
            r5 = 1
            return r5
        L60:
            java.io.File r6 = com.tencent.midas.plugin.APPluginUtils.getDataZipFile(r5)
            if (r6 == 0) goto L83
            java.lang.String r6 = r6.getAbsolutePath()
            int r5 = com.tencent.midas.plugin.APPluginUtils.getZipVersionCodeWtihFileName(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "isNeedUpdateFromAssets dataVC:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.midas.comm.APLog.i(r4, r6)
            if (r5 <= r0) goto L83
            r5 = 2
            return r5
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginInstallerAndUpdater.isNeedUpdateFromAssets(android.content.Context, java.lang.String):int");
    }

    public static boolean isNeedUpdateFromLocal(android.content.Context context) {
        com.tencent.midas.comm.APLog.d(TAG, "isNeedUpdateFromLocal");
        java.io.File pluginUpdatePath = com.tencent.midas.plugin.APPluginConfig.getPluginUpdatePath(context);
        try {
            java.io.File file = new java.io.File(pluginUpdatePath, com.tencent.midas.plugin.APPluginConfig.SIGN_FILE_NAME);
            if (!file.exists()) {
                com.tencent.midas.comm.APLog.d(TAG, "isNeedUpdateFromLocal, sign file not exist, return false!");
                return false;
            }
            com.tencent.midas.comm.APLog.d(TAG, "isNeedUpdateFromLocal, sign file exist!");
            java.util.HashMap hashMap = new java.util.HashMap();
            com.tencent.midas.plugin.APPluginUtils.readSingInfoItems(hashMap, file);
            java.io.File[] listFiles = pluginUpdatePath.listFiles();
            if (listFiles == null) {
                com.tencent.midas.comm.APLog.d(TAG, "isNeedUpdateFromLocal, cannot get local file list, return false!");
                return false;
            }
            if (listFiles.length == 0) {
                com.tencent.midas.comm.APLog.d(TAG, "isNeedUpdateFromLocal, empty local file list, return false!");
                return false;
            }
            boolean z17 = false;
            for (java.io.File file2 : listFiles) {
                java.lang.String name = file2.getName();
                com.tencent.midas.comm.APLog.d(TAG, "isNeedUpdateFromLocal, iterating update dir file list, current = " + name);
                if (name.startsWith("MidasCore")) {
                    z17 = true;
                }
                if (name.endsWith(".apk")) {
                    boolean checkFileMD5 = com.tencent.midas.plugin.APPluginUtils.checkFileMD5(file2.getCanonicalPath(), ((com.tencent.midas.plugin.APSignIniItem) hashMap.get(name.split("\\_")[0])).f53143md5);
                    com.tencent.midas.comm.APLog.d(TAG, "isNeedUpdateFromLocal, iterating update dir file list, current = " + name + " valid = " + checkFileMD5);
                    if (!checkFileMD5) {
                        com.tencent.midas.plugin.APPluginUtils.clearDirContent(pluginUpdatePath);
                        return false;
                    }
                    hashMap.remove(name.split("\\_")[0]);
                } else {
                    com.tencent.midas.comm.APLog.d(TAG, "isNeedUpdateFromLocal, iterating update dir file list, current = " + name + ", not apk file, continue!");
                }
            }
            if (hashMap.size() > 0) {
                com.tencent.midas.comm.APLog.d(TAG, "isNeedUpdateFromLocal, update dir file list iterate finish! sigMap size = " + hashMap.size());
                java.io.File pluginPath = com.tencent.midas.plugin.APPluginConfig.getPluginPath(context);
                for (com.tencent.midas.plugin.APSignIniItem aPSignIniItem : hashMap.values()) {
                    com.tencent.midas.comm.APLog.d(TAG, "isNeedUpdateFromLocal, iterating sigMap left, current = " + aPSignIniItem.fullName);
                    if (!new java.io.File(pluginPath, aPSignIniItem.fullName).exists()) {
                        com.tencent.midas.comm.APLog.e(TAG, "isNeedUpdateFromLocal, iterating sigMap left, current = " + aPSignIniItem.fullName + " missing in midasplugins!");
                        com.tencent.midas.plugin.APPluginUtils.clearDirContent(pluginUpdatePath);
                        return false;
                    }
                    com.tencent.midas.comm.APLog.d(TAG, "isNeedUpdateFromLocal, iterating sigMap left, current = " + aPSignIniItem.fullName + " exist in midasplugins!");
                }
            } else {
                com.tencent.midas.comm.APLog.d(TAG, "isNeedUpdateFromLocal, update dir file list iterate finish! sigMap size is 0");
            }
            if (!z17) {
                com.tencent.midas.comm.APLog.d(TAG, "isNeedUpdateFromLocal, hasMidasCoreFile == false!");
                return false;
            }
            com.tencent.midas.comm.APLog.d(TAG, "isNeedUpdateFromLocal, hasMidasCoreFile == true!");
            com.tencent.midas.comm.APLog.e(TAG, "isNeedUpdateFromLocal, return true!");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.e(TAG, "isNeedUpdateFromLocal, got exception = " + e17);
            return false;
        }
    }

    public static void unInstallPlugin(android.content.Context context) {
        com.tencent.midas.comm.APLog.d(TAG, "unInstallPlugin " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        com.tencent.midas.plugin.APPluginUtils.deletePlugin(context);
        com.tencent.midas.plugin.APPluginUtils.deleteDex(context);
        com.tencent.midas.plugin.APPluginUtils.deleteLibs(context);
        sInstallPathMap.clear();
        sPackageInfoMap.clear();
        com.tencent.midas.plugin.APPluginStatic.release();
        com.tencent.midas.plugin.APPluginConfig.libExtend++;
    }
}
