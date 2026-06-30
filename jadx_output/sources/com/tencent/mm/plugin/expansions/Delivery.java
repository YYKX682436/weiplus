package com.tencent.mm.plugin.expansions;

/* loaded from: classes13.dex */
final class Delivery {
    private static final int ERR_CODE_TIMEOUT = 10001;
    private static final int ERR_CODE_USER_CONFIRM = 10002;
    private static final java.lang.String MODULE_NAME = "delivery";
    private static final int REQ_CODE_USER_CONFIRM = 10002;
    private static final java.lang.String TAG = "MicroMsg.exp.Delivery";
    static boolean postDumping;
    static boolean preDumping;
    private static java.lang.ref.WeakReference<android.content.Context> sAttachedContext;
    private static z95.c sBehavior;
    private static qa.b sDeliveryManager;
    private byte _hellAccFlag_;
    private static final java.util.List<java.io.File> sAllNativeLibDirs = new java.util.LinkedList();
    private static final java.util.List<java.lang.String> sLoadedLibs = new java.util.LinkedList();
    private static final java.util.List<java.lang.String> sLoadingLibs = new java.util.LinkedList();
    private static java.util.Map<java.lang.String, java.util.List<java.lang.String>> baseSoDepsMap = new java.util.HashMap();
    private static java.util.Map<java.lang.String, java.util.List<java.lang.String>> depsMap = new java.util.HashMap();
    private static boolean preloadSO = false;

    public static /* synthetic */ qa.b access$300() {
        return null;
    }

    private static void checkInit() {
        throw new java.lang.IllegalStateException("#init is not yet done!");
    }

    private static void doRequest(com.tencent.mm.plugin.expansions.e eVar) {
        checkInit();
        com.tencent.mars.xlog.Log.i(TAG, "#doRequest, isInstalled = " + isInstalled());
        if (isInstalled()) {
            if (eVar != null) {
                eVar.onSuccess(MODULE_NAME);
            }
        } else {
            preloadLibrary();
            new java.util.concurrent.atomic.AtomicBoolean();
            new java.util.concurrent.atomic.AtomicInteger(0);
            throw new java.lang.RuntimeException("stub!");
        }
    }

    public static void dumpApkLibEntry(java.io.File file) {
        com.tencent.mars.xlog.Log.i(TAG, " split-apk " + file.getAbsolutePath());
        if (!file.isFile()) {
            com.tencent.mars.xlog.Log.i(TAG, " not file, skip");
            return;
        }
        try {
            java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(file);
            try {
                java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    java.lang.String name = entries.nextElement().getName();
                    if (name.endsWith(".so")) {
                        com.tencent.mars.xlog.Log.i(TAG, " > " + name);
                    }
                }
                zipFile.close();
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "dumpApkLibEntry fail", new java.lang.Object[0]);
        }
    }

    public static void dumpAppClassLoader() {
        com.tencent.mars.xlog.Log.i(TAG, "dumping classloader");
        java.util.Iterator<java.io.File> it = getNativeLibraryDirectoriesCompat(com.tencent.mm.plugin.expansions.Delivery.class.getClassLoader()).iterator();
        while (it.hasNext()) {
            dumpFiles(it.next());
        }
    }

    public static void dumpFiles(java.io.File file) {
        if (file.isDirectory()) {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (java.io.File file2 : listFiles) {
                    dumpFiles(file2);
                }
                return;
            }
            return;
        }
        if (!file.getAbsolutePath().contains(".apk!/lib")) {
            com.tencent.mars.xlog.Log.i(TAG, " > " + file.getAbsolutePath());
        } else {
            dumpApkLibEntry(new java.io.File(file.getAbsolutePath().substring(0, file.getAbsolutePath().indexOf(".apk!/lib")) + ".apk"));
        }
    }

    private static void dumping() {
        com.facebook.soloader.d0[] d0VarArr;
        com.tencent.mars.xlog.Log.i(TAG, "dumping SoLoader");
        if (!com.tencent.mm.sdk.platformtools.s9.f192975c && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.i(TAG, "skip, no debug env");
            return;
        }
        try {
            boolean z17 = com.facebook.soloader.c0.f44004a;
            synchronized (com.facebook.soloader.c0.class) {
                d0VarArr = com.facebook.soloader.c0.f44007d;
            }
            for (com.facebook.soloader.d0 d0Var : d0VarArr) {
                if (d0Var instanceof com.facebook.soloader.s) {
                    com.tencent.mars.xlog.Log.i(TAG, " - ApkSoSource: " + ((com.facebook.soloader.s) d0Var).f44059f);
                } else {
                    com.tencent.mars.xlog.Log.i(TAG, " - " + d0Var);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "dumping SoLoader fail", new java.lang.Object[0]);
        }
        dumpAppClassLoader();
    }

    public static java.lang.String findLibraryPathByName(java.lang.String str) {
        java.util.List<java.io.File> list = sAllNativeLibDirs;
        if (list.isEmpty()) {
            synchronized (list) {
                if (list.isEmpty()) {
                    list.addAll(getNativeLibraryDirectoriesCompat(com.tencent.mm.plugin.expansions.Delivery.class.getClassLoader()));
                }
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        java.util.Iterator<java.io.File> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String recursiveFindLibraryPathByName = recursiveFindLibraryPathByName(str, it.next());
            if (!android.text.TextUtils.isEmpty(recursiveFindLibraryPathByName)) {
                return recursiveFindLibraryPathByName;
            }
        }
        return null;
    }

    public static java.lang.String getAAbInfo() {
        if (isEnabled()) {
            throw null;
        }
        return "aab-disabled";
    }

    public static java.util.concurrent.Future<?> getAssets(l30.a aVar) {
        com.tencent.mars.xlog.Log.i(TAG, "#getAssets, isInstalled = " + isInstalled());
        com.tencent.mm.plugin.expansions.f fVar = new com.tencent.mm.plugin.expansions.f();
        doRequest(new com.tencent.mm.plugin.expansions.d(fVar, aVar));
        return fVar;
    }

    private static java.util.List<java.lang.String> getDeps(java.lang.String str) {
        return depsMap.get(str);
    }

    public static java.lang.String getLastObbErrorInfo() {
        return !isEnabled() ? "aab-disabled" : com.tencent.mm.sdk.platformtools.o4.L().getString("delivery_request_status", "initial");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.io.File> getNativeLibraryDirectoriesCompat(java.lang.ClassLoader r9) {
        /*
            java.lang.String r0 = "MicroMsg.exp.Delivery"
            java.lang.String r1 = "classloader = "
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lbe
            r3.append(r9)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = "   sourceDirectories:"
            r3.append(r1)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r1 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String[] r1 = sourceDirectories(r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch: java.lang.Throwable -> Lbe
            r3.append(r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lbe
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> Lbe
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r3 = "nativeLibraryDirectories"
            java.lang.String r4 = "pathList"
            r5 = 1
            r6 = 2
            r7 = 25
            if (r1 != r7) goto L38
            int r8 = android.os.Build.VERSION.PREVIEW_SDK_INT     // Catch: java.lang.Throwable -> Lbe
            if (r8 != 0) goto L3a
        L38:
            if (r1 <= r7) goto L7a
        L3a:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5e
            r1.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.reflect.Field r4 = ak0.c0.a(r9, r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r4 = r4.get(r9)     // Catch: java.lang.Throwable -> L5e
            if (r4 == 0) goto Lc7
            java.lang.reflect.Field r3 = ak0.c0.a(r4, r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L5e
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "dumpV25: nativeLibraryDirectories"
            com.tencent.mars.xlog.Log.i(r0, r4)     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto Lc7
            r1.addAll(r3)     // Catch: java.lang.Throwable -> L5e
            goto Lc7
        L5e:
            r1 = move-exception
            java.lang.String r3 = "v25 fail, sdk: %d, error: %s, try to fallback to V23"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lbe
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lbe
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lbe
            r4[r2] = r6     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> Lbe
            r4[r5] = r1     // Catch: java.lang.Throwable -> Lbe
            com.tencent.mars.xlog.Log.e(r0, r3, r4)     // Catch: java.lang.Throwable -> Lbe
            java.util.List r1 = com.tencent.mm.plugin.expansions.g.a(r9)     // Catch: java.lang.Throwable -> Lbe
            goto Lc7
        L7a:
            java.util.List r1 = com.tencent.mm.plugin.expansions.g.a(r9)     // Catch: java.lang.Throwable -> L7f
            goto Lc7
        L7f:
            r1 = move-exception
            java.lang.String r7 = "v23 fail, sdk: %d, error: %s, try to fallback to V14"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lbe
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lbe
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lbe
            r6[r2] = r8     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> Lbe
            r6[r5] = r1     // Catch: java.lang.Throwable -> Lbe
            com.tencent.mars.xlog.Log.e(r0, r7, r6)     // Catch: java.lang.Throwable -> Lbe
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbe
            r1.<init>()     // Catch: java.lang.Throwable -> Lbe
            java.lang.reflect.Field r4 = ak0.c0.a(r9, r4)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r9 = r4.get(r9)     // Catch: java.lang.Throwable -> Lbe
            if (r9 == 0) goto Lc7
            java.lang.reflect.Field r3 = ak0.c0.a(r9, r3)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r9 = r3.get(r9)     // Catch: java.lang.Throwable -> Lbe
            java.io.File[] r9 = (java.io.File[]) r9     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r3 = "dumpV14: nativeLibraryDirectories"
            com.tencent.mars.xlog.Log.i(r0, r3)     // Catch: java.lang.Throwable -> Lbe
            if (r9 == 0) goto Lc7
            java.util.List r9 = java.util.Arrays.asList(r9)     // Catch: java.lang.Throwable -> Lbe
            r1.addAll(r9)     // Catch: java.lang.Throwable -> Lbe
            goto Lc7
        Lbe:
            r9 = move-exception
            java.lang.String r1 = "dumping fail"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r9, r1, r2)
            r1 = 0
        Lc7:
            if (r1 != 0) goto Lcd
            java.util.List r1 = java.util.Collections.emptyList()
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.expansions.Delivery.getNativeLibraryDirectoriesCompat(java.lang.ClassLoader):java.util.List");
    }

    public static java.util.concurrent.Future<?> getSoLibDir(l30.g gVar) {
        throw new java.lang.RuntimeException("Stub!");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void init(android.content.Context r5, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.expansions.Delivery.init(android.content.Context, java.util.Map, java.util.Map):void");
    }

    private static void injectClassLoaderContext(android.content.Context context) {
        com.facebook.soloader.d0[] d0VarArr;
        int i17;
        com.tencent.mars.xlog.Log.i(TAG, "#injectClassLoaderContext");
        java.util.List<java.io.File> nativeLibraryDirectoriesCompat = getNativeLibraryDirectoriesCompat(com.tencent.mm.plugin.expansions.Delivery.class.getClassLoader());
        if (!nativeLibraryDirectoriesCompat.isEmpty()) {
            try {
                com.tencent.mars.xlog.Log.i(TAG, "collect SoLoader list");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z17 = com.facebook.soloader.c0.f44004a;
                synchronized (com.facebook.soloader.c0.class) {
                    d0VarArr = com.facebook.soloader.c0.f44007d;
                }
                for (com.facebook.soloader.d0 d0Var : d0VarArr) {
                    if (d0Var instanceof com.facebook.soloader.s) {
                        arrayList.add(((com.facebook.soloader.s) d0Var).f44059f);
                    } else if ((d0Var instanceof com.facebook.soloader.f) || (d0Var instanceof com.facebook.soloader.d)) {
                        com.facebook.soloader.f fVar = d0Var instanceof com.facebook.soloader.f ? (com.facebook.soloader.f) d0Var : null;
                        if (d0Var instanceof com.facebook.soloader.d) {
                            fVar = ((com.facebook.soloader.d) d0Var).f44018c;
                        }
                        if (fVar != null) {
                            arrayList.add(fVar.f44022a);
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i(TAG, "inject SoLoader list");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.io.File file : nativeLibraryDirectoriesCompat) {
                    if (!arrayList.contains(file)) {
                        if (file.getAbsolutePath().contains(".apk!/lib")) {
                            com.tencent.mars.xlog.Log.i(TAG, "inject ApkSoSource: " + file);
                            java.lang.String str = file.getAbsolutePath().substring(0, file.getAbsolutePath().indexOf(".apk!/lib")) + ".apk";
                            java.io.File file2 = new java.io.File(str);
                            if (!arrayList.contains(file2)) {
                                int lastIndexOf = str.lastIndexOf("/");
                                int lastIndexOf2 = str.lastIndexOf(".apk");
                                if (lastIndexOf < 0 || (i17 = lastIndexOf + 1) >= lastIndexOf2) {
                                    com.tencent.mars.xlog.Log.w(TAG, "invalid apkPath: " + str);
                                } else {
                                    arrayList2.add(new com.facebook.soloader.c(context, file2, str.substring(i17, lastIndexOf2), 1));
                                }
                            }
                        } else if (file.isDirectory()) {
                            com.tencent.mars.xlog.Log.i(TAG, "inject DirectorySoSource: " + file);
                            arrayList2.add(new com.facebook.soloader.f(file, 0));
                        } else {
                            com.tencent.mars.xlog.Log.w(TAG, "inject fail, unknown so lib type: " + file);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    com.tencent.mars.xlog.Log.i(TAG, "soSourceList is empty, skip inject");
                } else {
                    arrayList2.addAll(java.util.Arrays.asList(d0VarArr));
                    com.facebook.soloader.d0[] d0VarArr2 = (com.facebook.soloader.d0[]) arrayList2.toArray(new com.facebook.soloader.d0[0]);
                    synchronized (com.facebook.soloader.c0.class) {
                        com.facebook.soloader.c0.f44007d = d0VarArr2;
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "injectClassLoaderContext fail", new java.lang.Object[0]);
            }
        }
        dumping();
    }

    public static java.util.concurrent.Future<?> install(l30.g gVar) {
        com.tencent.mars.xlog.Log.i(TAG, "#install delivery, isInstalled = " + isInstalled());
        com.tencent.mm.plugin.expansions.f fVar = new com.tencent.mm.plugin.expansions.f();
        doRequest(new com.tencent.mm.plugin.expansions.c(fVar, gVar));
        return fVar;
    }

    public static boolean isEnabled() {
        return false;
    }

    public static boolean isInstalled() {
        if (isEnabled()) {
            throw null;
        }
        return true;
    }

    public static java.util.concurrent.Future<?> loadLibrary(java.lang.String str, l30.g gVar) {
        throw new java.lang.RuntimeException("Stub!");
    }

    private static void loadLibraryFlattWithinDelivery(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i(TAG, "loadLibrary flatt, libName  = " + str + " recursive = " + z17);
        java.util.List<java.lang.String> list = sLoadedLibs;
        synchronized (list) {
            if (list.contains(str)) {
                return;
            }
            java.lang.String findLibraryPathByName = findLibraryPathByName(str);
            if (!android.text.TextUtils.isEmpty(findLibraryPathByName)) {
                com.tencent.mars.xlog.Log.i(TAG, "loadLibraryFlatt with System#load, libName  = " + str);
                com.tencent.cso.CsoLoader.g(findLibraryPathByName);
                synchronized (list) {
                    if (!list.contains(str)) {
                        list.add(str);
                    }
                }
                return;
            }
            try {
                com.tencent.mars.xlog.Log.i(TAG, "loadLibraryFlatt with SplitInstallHelper#loadLibrary, libName  = " + str);
                synchronized (list) {
                    if (!list.contains(str)) {
                        list.add(str);
                    }
                }
            } catch (java.lang.UnsatisfiedLinkError e17) {
                com.tencent.mars.xlog.Log.e(TAG, "SplitInstallHelper.loadLibrary fail, e = " + e17.getMessage());
                try {
                    com.tencent.mars.xlog.Log.i(TAG, "loadLibraryFlatt with ReLinker#loadLibrary, libName  = " + str);
                    z46.f fVar = new z46.f();
                    fVar.f470157d = true;
                    fVar.b(com.tencent.mm.sdk.platformtools.x2.f193071a, str, null, null);
                    java.util.List<java.lang.String> list2 = sLoadedLibs;
                    synchronized (list2) {
                        if (!list2.contains(str)) {
                            list2.add(str);
                        }
                    }
                } catch (java.lang.UnsatisfiedLinkError e18) {
                    com.tencent.mars.xlog.Log.e(TAG, "ReLinker#loadLibrary fail, e = " + e18.getMessage());
                    com.tencent.mars.xlog.Log.i(TAG, "loadLibraryFlatt with System#loadLibrary, libName  = " + str);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(str);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/expansions/Delivery", "loadLibraryFlattWithinDelivery", "(Ljava/lang/String;Z)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
                    yj0.a.f(obj, "com/tencent/mm/plugin/expansions/Delivery", "loadLibraryFlattWithinDelivery", "(Ljava/lang/String;Z)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    java.util.List<java.lang.String> list3 = sLoadedLibs;
                    synchronized (list3) {
                        if (!list3.contains(str)) {
                            list3.add(str);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void loadLibraryImpl(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i(TAG, "loadLibraryImpl, libName  = " + str);
        java.util.List<java.lang.String> deps = getDeps(str);
        if (deps != null && !deps.isEmpty()) {
            for (java.lang.String str2 : deps) {
                if (!android.text.TextUtils.isEmpty(str2.trim())) {
                    try {
                        loadLibraryFlattWithinDelivery(str2.trim(), z17);
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e(TAG, "loadLibrary subLib fail, e = " + th6.getMessage());
                    }
                }
            }
        }
        loadLibraryFlattWithinDelivery(str, false);
    }

    public static void onAttachBaseContext(android.content.Context context) {
        checkInit();
        sAttachedContext = new java.lang.ref.WeakReference<>(context);
    }

    private static void preloadLibrary() {
        if (preloadSO || !gm0.j1.a()) {
            return;
        }
        preloadSO = true;
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.expansions.a());
    }

    private static java.lang.String recursiveFindLibraryPathByName(java.lang.String str, java.io.File file) {
        java.io.File[] listFiles;
        if (file.isFile()) {
            if (file.getAbsolutePath().endsWith(com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH + str + ".so")) {
                return file.getAbsolutePath();
            }
        }
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            return null;
        }
        for (java.io.File file2 : listFiles) {
            java.lang.String recursiveFindLibraryPathByName = recursiveFindLibraryPathByName(str, file2);
            if (!android.text.TextUtils.isEmpty(recursiveFindLibraryPathByName)) {
                return recursiveFindLibraryPathByName;
            }
        }
        return null;
    }

    public static java.util.concurrent.Future<?> request() {
        com.tencent.mars.xlog.Log.i(TAG, "#request delivery, isInstalled = " + isInstalled());
        com.tencent.mm.plugin.expansions.f fVar = new com.tencent.mm.plugin.expansions.f();
        doRequest(new com.tencent.mm.plugin.expansions.b(fVar));
        return fVar;
    }

    public static boolean requestSync(boolean z17) {
        boolean z18;
        com.tencent.mars.xlog.Log.i(TAG, "requestSync delivery, retryUntilSuccess = " + z17 + ", isInstalled = " + isInstalled());
        if (isInstalled()) {
            return true;
        }
        checkInit();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i17 = 2000;
        int i18 = 0;
        do {
            try {
                com.tencent.mars.xlog.Log.i(TAG, "requestSync, retryCount = " + i18);
                request().get();
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
                com.tencent.mars.xlog.Log.w(TAG, "#requestSync future wait fail, error = %s", e17.getMessage());
            }
            if (isInstalled() || !z17) {
                z18 = false;
            } else {
                i18++;
                try {
                    java.lang.Thread.sleep(i17);
                } catch (java.lang.InterruptedException unused) {
                }
                i17 = (int) (i17 * 1.5f);
                z18 = true;
            }
        } while (z18);
        com.tencent.mars.xlog.Log.i("MicroMsg.exp.Expansions", "requestDeliverySync time consumed = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return isInstalled();
    }

    public static void saveDeliveryStatus(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.o4.L().putString("delivery_request_status", str);
    }

    private static java.lang.String[] sourceDirectories(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        java.lang.String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new java.lang.String[]{applicationInfo.sourceDir};
        }
        java.lang.String[] strArr2 = new java.lang.String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        java.lang.System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    public static android.content.res.AssetManager tryGetAssets() {
        if (isInstalled()) {
            return sBehavior.getAssets();
        }
        return null;
    }

    public static java.lang.String tryGetSoLibDir() {
        if (!isInstalled()) {
            return null;
        }
        return sBehavior.a().getAbsolutePath() + java.io.File.separator;
    }

    public static boolean tryLoadLibrary(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i(TAG, "#tryLoadLibrary, isInstalled = " + isInstalled());
        if (isInstalled()) {
            try {
                loadLibraryImpl(str, true);
                return true;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "tryLoadLibrary fail", new java.lang.Object[0]);
                if (z17) {
                    try {
                        com.tencent.mars.xlog.Log.i(TAG, "try SoLoader at last, libName = " + str);
                        com.facebook.soloader.c0.e(str, 0);
                        return true;
                    } catch (java.lang.Throwable th7) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th7, "SoLoader.loadLibrary fail", new java.lang.Object[0]);
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w(TAG, "Delivery is not installed, libName = " + str);
        }
        return false;
    }

    public static void tryRetrieveDelivery(int i17) {
        try {
            java.lang.String str = "content://com.google.android.finsky.FileProvider/dynamicsplits/" + i17 + "/delivery";
            com.tencent.mars.xlog.Log.i(TAG, "#tryRetrieveDelivery, uri = " + str);
            java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(com.tencent.mm.sdk.platformtools.i.a().getContentResolver().openInputStream(android.net.Uri.parse(str)));
            while (true) {
                java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return;
                }
                com.tencent.mars.xlog.Log.i(TAG, " > zipEntry: " + nextEntry.getName());
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "tryRetrieveDelivery fail", new java.lang.Object[0]);
        }
    }

    public static void updateLang(java.lang.String str) {
        checkInit();
        if (!android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.RuntimeException("stub!");
        }
    }

    public static boolean isInstalled(java.lang.String str) {
        return isInstalled();
    }
}
