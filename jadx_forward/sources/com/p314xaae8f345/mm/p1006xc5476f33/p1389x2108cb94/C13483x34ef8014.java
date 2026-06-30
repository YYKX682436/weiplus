package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* renamed from: com.tencent.mm.plugin.expansions.Delivery */
/* loaded from: classes13.dex */
final class C13483x34ef8014 {

    /* renamed from: ERR_CODE_TIMEOUT */
    private static final int f35467xa952bda9 = 10001;

    /* renamed from: ERR_CODE_USER_CONFIRM */
    private static final int f35468x7dd39ec4 = 10002;

    /* renamed from: MODULE_NAME */
    private static final java.lang.String f35469x3adc347e = "delivery";

    /* renamed from: REQ_CODE_USER_CONFIRM */
    private static final int f35470x90b5d1bd = 10002;
    private static final java.lang.String TAG = "MicroMsg.exp.Delivery";

    /* renamed from: postDumping */
    static boolean f35473x97afb4ae;

    /* renamed from: preDumping */
    static boolean f35474xbd74e14b;

    /* renamed from: sAttachedContext */
    private static java.lang.ref.WeakReference<android.content.Context> f35477xfc96d278;

    /* renamed from: sBehavior */
    private static z95.c f35478xf8a6f3e5;

    /* renamed from: sDeliveryManager */
    private static qa.b f35479xcdc05426;

    /* renamed from: _hellAccFlag_ */
    private byte f35482x7f11beae;

    /* renamed from: sAllNativeLibDirs */
    private static final java.util.List<java.io.File> f35476xb4e3cc06 = new java.util.LinkedList();

    /* renamed from: sLoadedLibs */
    private static final java.util.List<java.lang.String> f35480x6a75f106 = new java.util.LinkedList();

    /* renamed from: sLoadingLibs */
    private static final java.util.List<java.lang.String> f35481xca60f777 = new java.util.LinkedList();

    /* renamed from: baseSoDepsMap */
    private static java.util.Map<java.lang.String, java.util.List<java.lang.String>> f35471x58e176ab = new java.util.HashMap();

    /* renamed from: depsMap */
    private static java.util.Map<java.lang.String, java.util.List<java.lang.String>> f35472x5ca85878 = new java.util.HashMap();

    /* renamed from: preloadSO */
    private static boolean f35475xbda11a25 = false;

    /* renamed from: access$300 */
    public static /* synthetic */ qa.b m55110xbbd78633() {
        return null;
    }

    /* renamed from: checkInit */
    private static void m55112x17bcfa38() {
        throw new java.lang.IllegalStateException("#init is not yet done!");
    }

    /* renamed from: doRequest */
    private static void m55113x99e55b84(com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.e eVar) {
        m55112x17bcfa38();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "#doRequest, isInstalled = " + m55129x47f87970());
        if (m55129x47f87970()) {
            if (eVar != null) {
                eVar.mo55155xe05b4124(f35469x3adc347e);
            }
        } else {
            m55135xfbcf2272();
            new java.util.concurrent.atomic.AtomicBoolean();
            new java.util.concurrent.atomic.AtomicInteger(0);
            throw new java.lang.RuntimeException("stub!");
        }
    }

    /* renamed from: dumpApkLibEntry */
    public static void m55114x1ae4b095(java.io.File file) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, " split-apk " + file.getAbsolutePath());
        if (!file.isFile()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, " not file, skip");
            return;
        }
        try {
            java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(file);
            try {
                java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    java.lang.String name = entries.nextElement().getName();
                    if (name.endsWith(".so")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, " > " + name);
                    }
                }
                zipFile.close();
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "dumpApkLibEntry fail", new java.lang.Object[0]);
        }
    }

    /* renamed from: dumpAppClassLoader */
    public static void m55115x3c6695de() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "dumping classloader");
        java.util.Iterator<java.io.File> it = m55123x1cd12bdf(com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.class.getClassLoader()).iterator();
        while (it.hasNext()) {
            m55116xadd6a8e3(it.next());
        }
    }

    /* renamed from: dumpFiles */
    public static void m55116xadd6a8e3(java.io.File file) {
        if (file.isDirectory()) {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (java.io.File file2 : listFiles) {
                    m55116xadd6a8e3(file2);
                }
                return;
            }
            return;
        }
        if (!file.getAbsolutePath().contains(".apk!/lib")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, " > " + file.getAbsolutePath());
        } else {
            m55114x1ae4b095(new java.io.File(file.getAbsolutePath().substring(0, file.getAbsolutePath().indexOf(".apk!/lib")) + ".apk"));
        }
    }

    /* renamed from: dumping */
    private static void m55117x77caa96e() {
        com.p166x1da19ac6.p168x5890096f.d0[] d0VarArr;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "dumping SoLoader");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "skip, no debug env");
            return;
        }
        try {
            boolean z17 = com.p166x1da19ac6.p168x5890096f.c0.f125537a;
            synchronized (com.p166x1da19ac6.p168x5890096f.c0.class) {
                d0VarArr = com.p166x1da19ac6.p168x5890096f.c0.f125540d;
            }
            for (com.p166x1da19ac6.p168x5890096f.d0 d0Var : d0VarArr) {
                if (d0Var instanceof com.p166x1da19ac6.p168x5890096f.s) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, " - ApkSoSource: " + ((com.p166x1da19ac6.p168x5890096f.s) d0Var).f125592f);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, " - " + d0Var);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "dumping SoLoader fail", new java.lang.Object[0]);
        }
        m55115x3c6695de();
    }

    /* renamed from: findLibraryPathByName */
    public static java.lang.String m55118x5942be69(java.lang.String str) {
        java.util.List<java.io.File> list = f35476xb4e3cc06;
        if (list.isEmpty()) {
            synchronized (list) {
                if (list.isEmpty()) {
                    list.addAll(m55123x1cd12bdf(com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.class.getClassLoader()));
                }
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        java.util.Iterator<java.io.File> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String m55136x892c9d57 = m55136x892c9d57(str, it.next());
            if (!android.text.TextUtils.isEmpty(m55136x892c9d57)) {
                return m55136x892c9d57;
            }
        }
        return null;
    }

    /* renamed from: getAAbInfo */
    public static java.lang.String m55119xbd7c87fa() {
        if (m55128x7d80d2b7()) {
            throw null;
        }
        return "aab-disabled";
    }

    /* renamed from: getAssets */
    public static java.util.concurrent.Future<?> m55120x11279679(l30.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "#getAssets, isInstalled = " + m55129x47f87970());
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.f();
        m55113x99e55b84(new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.d(fVar, aVar));
        return fVar;
    }

    /* renamed from: getDeps */
    private static java.util.List<java.lang.String> m55121xfb7e66ba(java.lang.String str) {
        return f35472x5ca85878.get(str);
    }

    /* renamed from: getLastObbErrorInfo */
    public static java.lang.String m55122xd61313d3() {
        return !m55128x7d80d2b7() ? "aab-disabled" : com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("delivery_request_status", "initial");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: getNativeLibraryDirectoriesCompat */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.io.File> m55123x1cd12bdf(java.lang.ClassLoader r9) {
        /*
            java.lang.String r0 = "MicroMsg.exp.Delivery"
            java.lang.String r1 = "classloader = "
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lbe
            r3.append(r9)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = "   sourceDirectories:"
            r3.append(r1)     // Catch: java.lang.Throwable -> Lbe
            android.content.Context r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String[] r1 = m55140xf8d6b8b0(r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch: java.lang.Throwable -> Lbe
            r3.append(r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lbe
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Throwable -> Lbe
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r4)     // Catch: java.lang.Throwable -> L5e
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3, r4)     // Catch: java.lang.Throwable -> Lbe
            java.util.List r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.g.a(r9)     // Catch: java.lang.Throwable -> Lbe
            goto Lc7
        L7a:
            java.util.List r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.g.a(r9)     // Catch: java.lang.Throwable -> L7f
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r7, r6)     // Catch: java.lang.Throwable -> Lbe
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbe
            r1.<init>()     // Catch: java.lang.Throwable -> Lbe
            java.lang.reflect.Field r4 = ak0.c0.a(r9, r4)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r9 = r4.get(r9)     // Catch: java.lang.Throwable -> Lbe
            if (r9 == 0) goto Lc7
            java.lang.reflect.Field r3 = ak0.c0.a(r9, r3)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r9 = r3.get(r9)     // Catch: java.lang.Throwable -> Lbe
            java.io.File[] r9 = (java.io.File[]) r9     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r3 = "dumpV14: nativeLibraryDirectories"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r3)     // Catch: java.lang.Throwable -> Lbe
            if (r9 == 0) goto Lc7
            java.util.List r9 = java.util.Arrays.asList(r9)     // Catch: java.lang.Throwable -> Lbe
            r1.addAll(r9)     // Catch: java.lang.Throwable -> Lbe
            goto Lc7
        Lbe:
            r9 = move-exception
            java.lang.String r1 = "dumping fail"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r9, r1, r2)
            r1 = 0
        Lc7:
            if (r1 != 0) goto Lcd
            java.util.List r1 = java.util.Collections.emptyList()
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55123x1cd12bdf(java.lang.ClassLoader):java.util.List");
    }

    /* renamed from: getSoLibDir */
    public static java.util.concurrent.Future<?> m55124x9d7aa2ba(l30.g gVar) {
        throw new java.lang.RuntimeException("Stub!");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* renamed from: init */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m55125x316510(android.content.Context r5, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55125x316510(android.content.Context, java.util.Map, java.util.Map):void");
    }

    /* renamed from: injectClassLoaderContext */
    private static void m55126xce3f1ef5(android.content.Context context) {
        com.p166x1da19ac6.p168x5890096f.d0[] d0VarArr;
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "#injectClassLoaderContext");
        java.util.List<java.io.File> m55123x1cd12bdf = m55123x1cd12bdf(com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.class.getClassLoader());
        if (!m55123x1cd12bdf.isEmpty()) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "collect SoLoader list");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z17 = com.p166x1da19ac6.p168x5890096f.c0.f125537a;
                synchronized (com.p166x1da19ac6.p168x5890096f.c0.class) {
                    d0VarArr = com.p166x1da19ac6.p168x5890096f.c0.f125540d;
                }
                for (com.p166x1da19ac6.p168x5890096f.d0 d0Var : d0VarArr) {
                    if (d0Var instanceof com.p166x1da19ac6.p168x5890096f.s) {
                        arrayList.add(((com.p166x1da19ac6.p168x5890096f.s) d0Var).f125592f);
                    } else if ((d0Var instanceof com.p166x1da19ac6.p168x5890096f.f) || (d0Var instanceof com.p166x1da19ac6.p168x5890096f.d)) {
                        com.p166x1da19ac6.p168x5890096f.f fVar = d0Var instanceof com.p166x1da19ac6.p168x5890096f.f ? (com.p166x1da19ac6.p168x5890096f.f) d0Var : null;
                        if (d0Var instanceof com.p166x1da19ac6.p168x5890096f.d) {
                            fVar = ((com.p166x1da19ac6.p168x5890096f.d) d0Var).f125551c;
                        }
                        if (fVar != null) {
                            arrayList.add(fVar.f125555a);
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "inject SoLoader list");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.io.File file : m55123x1cd12bdf) {
                    if (!arrayList.contains(file)) {
                        if (file.getAbsolutePath().contains(".apk!/lib")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "inject ApkSoSource: " + file);
                            java.lang.String str = file.getAbsolutePath().substring(0, file.getAbsolutePath().indexOf(".apk!/lib")) + ".apk";
                            java.io.File file2 = new java.io.File(str);
                            if (!arrayList.contains(file2)) {
                                int lastIndexOf = str.lastIndexOf("/");
                                int lastIndexOf2 = str.lastIndexOf(".apk");
                                if (lastIndexOf < 0 || (i17 = lastIndexOf + 1) >= lastIndexOf2) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "invalid apkPath: " + str);
                                } else {
                                    arrayList2.add(new com.p166x1da19ac6.p168x5890096f.c(context, file2, str.substring(i17, lastIndexOf2), 1));
                                }
                            }
                        } else if (file.isDirectory()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "inject DirectorySoSource: " + file);
                            arrayList2.add(new com.p166x1da19ac6.p168x5890096f.f(file, 0));
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "inject fail, unknown so lib type: " + file);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "soSourceList is empty, skip inject");
                } else {
                    arrayList2.addAll(java.util.Arrays.asList(d0VarArr));
                    com.p166x1da19ac6.p168x5890096f.d0[] d0VarArr2 = (com.p166x1da19ac6.p168x5890096f.d0[]) arrayList2.toArray(new com.p166x1da19ac6.p168x5890096f.d0[0]);
                    synchronized (com.p166x1da19ac6.p168x5890096f.c0.class) {
                        com.p166x1da19ac6.p168x5890096f.c0.f125540d = d0VarArr2;
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "injectClassLoaderContext fail", new java.lang.Object[0]);
            }
        }
        m55117x77caa96e();
    }

    /* renamed from: install */
    public static java.util.concurrent.Future<?> m55127x74ae259b(l30.g gVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "#install delivery, isInstalled = " + m55129x47f87970());
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.f();
        m55113x99e55b84(new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.c(fVar, gVar));
        return fVar;
    }

    /* renamed from: isEnabled */
    public static boolean m55128x7d80d2b7() {
        return false;
    }

    /* renamed from: isInstalled */
    public static boolean m55129x47f87970() {
        if (m55128x7d80d2b7()) {
            throw null;
        }
        return true;
    }

    /* renamed from: loadLibrary */
    public static java.util.concurrent.Future<?> m55131xeb57c8f5(java.lang.String str, l30.g gVar) {
        throw new java.lang.RuntimeException("Stub!");
    }

    /* renamed from: loadLibraryFlattWithinDelivery */
    private static void m55132x80a4a345(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "loadLibrary flatt, libName  = " + str + " recursive = " + z17);
        java.util.List<java.lang.String> list = f35480x6a75f106;
        synchronized (list) {
            if (list.contains(str)) {
                return;
            }
            java.lang.String m55118x5942be69 = m55118x5942be69(str);
            if (!android.text.TextUtils.isEmpty(m55118x5942be69)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "loadLibraryFlatt with System#load, libName  = " + str);
                com.p314xaae8f345.cso.C2941xefde02d2.g(m55118x5942be69);
                synchronized (list) {
                    if (!list.contains(str)) {
                        list.add(str);
                    }
                }
                return;
            }
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "loadLibraryFlatt with SplitInstallHelper#loadLibrary, libName  = " + str);
                synchronized (list) {
                    if (!list.contains(str)) {
                        list.add(str);
                    }
                }
            } catch (java.lang.UnsatisfiedLinkError e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "SplitInstallHelper.loadLibrary fail, e = " + e17.getMessage());
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "loadLibraryFlatt with ReLinker#loadLibrary, libName  = " + str);
                    z46.f fVar = new z46.f();
                    fVar.f551690d = true;
                    fVar.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, null, null);
                    java.util.List<java.lang.String> list2 = f35480x6a75f106;
                    synchronized (list2) {
                        if (!list2.contains(str)) {
                            list2.add(str);
                        }
                    }
                } catch (java.lang.UnsatisfiedLinkError e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "ReLinker#loadLibrary fail, e = " + e18.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "loadLibraryFlatt with System#loadLibrary, libName  = " + str);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(str);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/expansions/Delivery", "loadLibraryFlattWithinDelivery", "(Ljava/lang/String;Z)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                    yj0.a.f(obj, "com/tencent/mm/plugin/expansions/Delivery", "loadLibraryFlattWithinDelivery", "(Ljava/lang/String;Z)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    java.util.List<java.lang.String> list3 = f35480x6a75f106;
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
    /* renamed from: loadLibraryImpl */
    public static void m55133x77d31cb5(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "loadLibraryImpl, libName  = " + str);
        java.util.List<java.lang.String> m55121xfb7e66ba = m55121xfb7e66ba(str);
        if (m55121xfb7e66ba != null && !m55121xfb7e66ba.isEmpty()) {
            for (java.lang.String str2 : m55121xfb7e66ba) {
                if (!android.text.TextUtils.isEmpty(str2.trim())) {
                    try {
                        m55132x80a4a345(str2.trim(), z17);
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "loadLibrary subLib fail, e = " + th6.getMessage());
                    }
                }
            }
        }
        m55132x80a4a345(str, false);
    }

    /* renamed from: onAttachBaseContext */
    public static void m55134x236401fa(android.content.Context context) {
        m55112x17bcfa38();
        f35477xfc96d278 = new java.lang.ref.WeakReference<>(context);
    }

    /* renamed from: preloadLibrary */
    private static void m55135xfbcf2272() {
        if (f35475xbda11a25 || !gm0.j1.a()) {
            return;
        }
        f35475xbda11a25 = true;
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.a());
    }

    /* renamed from: recursiveFindLibraryPathByName */
    private static java.lang.String m55136x892c9d57(java.lang.String str, java.io.File file) {
        java.io.File[] listFiles;
        if (file.isFile()) {
            if (file.getAbsolutePath().endsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428 + str + ".so")) {
                return file.getAbsolutePath();
            }
        }
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            return null;
        }
        for (java.io.File file2 : listFiles) {
            java.lang.String m55136x892c9d57 = m55136x892c9d57(str, file2);
            if (!android.text.TextUtils.isEmpty(m55136x892c9d57)) {
                return m55136x892c9d57;
            }
        }
        return null;
    }

    /* renamed from: request */
    public static java.util.concurrent.Future<?> m55137x414ef28f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "#request delivery, isInstalled = " + m55129x47f87970());
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.f();
        m55113x99e55b84(new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.b(fVar));
        return fVar;
    }

    /* renamed from: requestSync */
    public static boolean m55138x448ca1ca(boolean z17) {
        boolean z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "requestSync delivery, retryUntilSuccess = " + z17 + ", isInstalled = " + m55129x47f87970());
        if (m55129x47f87970()) {
            return true;
        }
        m55112x17bcfa38();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i17 = 2000;
        int i18 = 0;
        do {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "requestSync, retryCount = " + i18);
                m55137x414ef28f().get();
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "#requestSync future wait fail, error = %s", e17.getMessage());
            }
            if (m55129x47f87970() || !z17) {
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exp.Expansions", "requestDeliverySync time consumed = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return m55129x47f87970();
    }

    /* renamed from: saveDeliveryStatus */
    public static void m55139xa431bfe3(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString("delivery_request_status", str);
    }

    /* renamed from: sourceDirectories */
    private static java.lang.String[] m55140xf8d6b8b0(android.content.Context context) {
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

    /* renamed from: tryGetAssets */
    public static android.content.res.AssetManager m55141xc9a6b6fe() {
        if (m55129x47f87970()) {
            return f35478xf8a6f3e5.mo55159x11279679();
        }
        return null;
    }

    /* renamed from: tryGetSoLibDir */
    public static java.lang.String m55142x32b3b5ff() {
        if (!m55129x47f87970()) {
            return null;
        }
        return f35478xf8a6f3e5.a().getAbsolutePath() + java.io.File.separator;
    }

    /* renamed from: tryLoadLibrary */
    public static boolean m55143x8090dc3a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "#tryLoadLibrary, isInstalled = " + m55129x47f87970());
        if (m55129x47f87970()) {
            try {
                m55133x77d31cb5(str, true);
                return true;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "tryLoadLibrary fail", new java.lang.Object[0]);
                if (z17) {
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "try SoLoader at last, libName = " + str);
                        com.p166x1da19ac6.p168x5890096f.c0.e(str, 0);
                        return true;
                    } catch (java.lang.Throwable th7) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th7, "SoLoader.loadLibrary fail", new java.lang.Object[0]);
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "Delivery is not installed, libName = " + str);
        }
        return false;
    }

    /* renamed from: tryRetrieveDelivery */
    public static void m55144x5177f42b(int i17) {
        try {
            java.lang.String str = "content://com.google.android.finsky.FileProvider/dynamicsplits/" + i17 + "/delivery";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "#tryRetrieveDelivery, uri = " + str);
            java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a().getContentResolver().openInputStream(android.net.Uri.parse(str)));
            while (true) {
                java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, " > zipEntry: " + nextEntry.getName());
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "tryRetrieveDelivery fail", new java.lang.Object[0]);
        }
    }

    /* renamed from: updateLang */
    public static void m55145xee58b257(java.lang.String str) {
        m55112x17bcfa38();
        if (!android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.RuntimeException("stub!");
        }
    }

    /* renamed from: isInstalled */
    public static boolean m55130x47f87970(java.lang.String str) {
        return m55129x47f87970();
    }
}
