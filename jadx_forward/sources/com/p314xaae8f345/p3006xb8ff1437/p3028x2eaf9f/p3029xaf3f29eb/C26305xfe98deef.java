package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPLoadLibFromApk */
/* loaded from: classes12.dex */
public final class C26305xfe98deef {

    /* renamed from: mLoadedLibs */
    private static final java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.ClassLoader>> f51934xed19c080 = new java.util.HashMap<>();

    /* renamed from: mContext */
    private static android.content.Context f51933xd6cfe882 = null;

    /* renamed from: com.tencent.thumbplayer.core.common.TPLoadLibFromApk$LibraryBrokenHandler */
    /* loaded from: classes12.dex */
    public static class LibraryBrokenHandler implements java.lang.Thread.UncaughtExceptionHandler {

        /* renamed from: mParent */
        private java.lang.Thread.UncaughtExceptionHandler f51935x14172f77;

        public LibraryBrokenHandler(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f51935x14172f77 = uncaughtExceptionHandler;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
        @Override // java.lang.Thread.UncaughtExceptionHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void uncaughtException(java.lang.Thread r5, java.lang.Throwable r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof java.lang.UnsatisfiedLinkError
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L19
                boolean r0 = r6 instanceof java.lang.NoSuchMethodError
                if (r0 == 0) goto L17
                java.lang.String r0 = r6.getMessage()
                java.lang.String r3 = ".*sig(nature)?[=:].*"
                boolean r0 = r0.matches(r3)
                if (r0 == 0) goto L17
                goto L19
            L17:
                r0 = r2
                goto L1a
            L19:
                r0 = r1
            L1a:
                if (r0 == 0) goto L24
                android.content.Context r0 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26305xfe98deef.m101788xbbd77af0()     // Catch: java.lang.Exception -> L24
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26305xfe98deef.m101789xbbd77eb1(r0)     // Catch: java.lang.Exception -> L24
                goto L25
            L24:
                r1 = r2
            L25:
                if (r1 == 0) goto L32
                java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError
                java.lang.String r1 = "Invalid so detected and recovered."
                r0.<init>(r1)
                java.lang.Throwable r6 = r0.initCause(r6)
            L32:
                java.lang.Thread$UncaughtExceptionHandler r0 = r4.f51935x14172f77
                r0.uncaughtException(r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26305xfe98deef.LibraryBrokenHandler.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
        }
    }

    private C26305xfe98deef() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: extractAllLibraries */
    public static void m101790x3c451519(android.content.Context context) {
        if (context == null) {
            return;
        }
        java.util.List<java.lang.String> m101793xed4b8df1 = m101793xed4b8df1();
        java.io.File dir = context.getDir("recover_lib", 0);
        java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(context.getApplicationInfo().sourceDir);
        try {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("lib/[A-Za-z0-9-_=]+/lib([A-Za-z0-9-_=]+)\\.so");
            java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                java.util.zip.ZipEntry nextElement = entries.nextElement();
                java.lang.String name = nextElement.getName();
                if (!android.text.TextUtils.isEmpty(name) && name.contains("../")) {
                    throw new java.lang.Exception("contain ../, throw err");
                }
                java.util.regex.Matcher matcher = compile.matcher(nextElement.getName());
                if (matcher.matches()) {
                    java.lang.String group = matcher.group(1);
                    if (!hashSet.contains(group)) {
                        m101791x19b5fcfa(zipFile, group, m101793xed4b8df1, new java.io.File(dir, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428 + group + ".so"));
                        hashSet.add(group);
                    }
                }
            }
        } finally {
            zipFile.close();
        }
    }

    /* renamed from: extractLibrary */
    private static boolean m101791x19b5fcfa(java.util.zip.ZipFile zipFile, java.lang.String str, java.util.List<java.lang.String> list, java.io.File file) {
        if (file.isFile()) {
            return true;
        }
        java.util.Iterator<java.lang.String> it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        java.util.zip.ZipEntry entry = zipFile.getEntry("lib/" + it.next() + "/lib" + str + ".so");
        if (entry == null) {
            return false;
        }
        java.lang.String name = entry.getName();
        if (!android.text.TextUtils.isEmpty(name) && name.contains("../")) {
            return false;
        }
        java.io.InputStream inputStream = zipFile.getInputStream(entry);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 2048);
                if (read == -1) {
                    try {
                        file.setReadOnly();
                        return true;
                    } catch (java.lang.Throwable unused) {
                        return false;
                    }
                }
                fileOutputStream.write(bArr, 0, read);
            } finally {
                inputStream.close();
                fileOutputStream.close();
            }
        }
    }

    /* renamed from: find */
    public static java.lang.String m101792x2ff5b9(java.lang.String str, android.content.Context context) {
        java.lang.String str2 = null;
        if (context == null) {
            return null;
        }
        try {
            java.lang.ClassLoader classLoader = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26305xfe98deef.class.getClassLoader();
            java.lang.reflect.Method declaredMethod = java.lang.ClassLoader.class.getDeclaredMethod("findLibrary", java.lang.String.class);
            declaredMethod.setAccessible(true);
            str2 = (java.lang.String) declaredMethod.invoke(classLoader, str);
        } catch (java.lang.Exception unused) {
        }
        if (str2 != null) {
            return str2;
        }
        java.io.File file = new java.io.File(context.getDir("recover_lib", 0), com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428 + str + ".so");
        return file.canRead() ? file.getAbsolutePath() : str2;
    }

    /* renamed from: generateAbiList */
    private static java.util.List<java.lang.String> m101793xed4b8df1() {
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        java.lang.reflect.Method method = java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class);
        java.lang.String str = (java.lang.String) method.invoke(null, "ro.product.cpu.abi");
        if (str != null && str.length() > 0) {
            arrayList.add(str);
        }
        java.lang.String str2 = (java.lang.String) method.invoke(null, "ro.product.cpu.abi2");
        if (str2 != null && str2.length() > 0) {
            arrayList.add(str2);
        }
        arrayList.add("armeabi");
        return arrayList;
    }

    /* renamed from: load */
    public static boolean m101794x32c4e6(java.lang.String str, java.lang.ClassLoader classLoader, android.content.Context context) {
        if (str == null || str.length() == 0 || classLoader == null) {
            return false;
        }
        f51933xd6cfe882 = context;
        java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.ClassLoader>> hashMap = f51934xed19c080;
        synchronized (hashMap) {
            java.lang.ref.WeakReference<java.lang.ClassLoader> weakReference = hashMap.get(str);
            java.lang.ClassLoader classLoader2 = weakReference != null ? weakReference.get() : null;
            if (classLoader2 != null) {
                if (classLoader2 == classLoader) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "callerClassLoader has already load ! name=".concat(str));
                    return true;
                }
                throw new java.lang.UnsatisfiedLinkError("Library '" + str + "' was loaded by a different ClassLoader.");
            }
            if (context == null) {
                try {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "context is null,load by System.loadLibrary,name= ".concat(str));
                    m101798x90163609(str, classLoader);
                    synchronized (hashMap) {
                        hashMap.put(str, new java.lang.ref.WeakReference<>(classLoader));
                    }
                    return true;
                } catch (java.lang.reflect.InvocationTargetException e17) {
                    throw ((java.lang.UnsatisfiedLinkError) new java.lang.UnsatisfiedLinkError("Failed loading library: ".concat(str)).initCause(e17.getCause()));
                } catch (java.lang.Exception e18) {
                    throw ((java.lang.UnsatisfiedLinkError) new java.lang.UnsatisfiedLinkError("Failed loading library: ".concat(str)).initCause(e18));
                }
            }
            java.io.File file = new java.io.File(context.getDir("recover_lib", 0), com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428 + str + ".so");
            java.lang.UnsatisfiedLinkError m101796x2983a165 = m101796x2983a165(str, classLoader, context, file);
            if (m101796x2983a165 == null) {
                return true;
            }
            return m101795xbe02764c(str, classLoader, context, file, m101796x2983a165);
        }
    }

    /* renamed from: loadFromApk */
    private static boolean m101795xbe02764c(java.lang.String str, java.lang.ClassLoader classLoader, android.content.Context context, java.io.File file, java.lang.UnsatisfiedLinkError unsatisfiedLinkError) {
        java.lang.String str2;
        java.util.zip.ZipFile zipFile;
        java.util.zip.ZipFile zipFile2 = null;
        try {
            try {
                str2 = context.getApplicationInfo().sourceDir;
                zipFile = new java.util.zip.ZipFile(str2);
            } catch (java.lang.Exception e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "unzip apk,name= " + str + "apkPath=" + str2);
            if (!m101791x19b5fcfa(zipFile, str, m101793xed4b8df1(), file)) {
                throw new java.lang.RuntimeException("Can't find recover library: " + str);
            }
            try {
                zipFile.close();
                try {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "load from unzip apk,name= " + str);
                    m101797x29542652(file.getAbsolutePath(), classLoader);
                    java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.ClassLoader>> hashMap = f51934xed19c080;
                    synchronized (hashMap) {
                        hashMap.put(str, new java.lang.ref.WeakReference<>(classLoader));
                    }
                    return true;
                } catch (java.lang.reflect.InvocationTargetException e18) {
                    if (unsatisfiedLinkError != null) {
                        throw unsatisfiedLinkError;
                    }
                    throw ((java.lang.UnsatisfiedLinkError) new java.lang.UnsatisfiedLinkError("Failed recovering native library: " + str).initCause(e18.getCause()));
                } catch (java.lang.Exception e19) {
                    if (unsatisfiedLinkError == null) {
                        throw ((java.lang.UnsatisfiedLinkError) new java.lang.UnsatisfiedLinkError("Failed recovering native library.").initCause(e19));
                    }
                    throw unsatisfiedLinkError;
                }
            } catch (java.io.IOException unused) {
                return false;
            }
        } catch (java.lang.Exception e27) {
            e = e27;
            zipFile2 = zipFile;
            throw ((java.lang.UnsatisfiedLinkError) new java.lang.UnsatisfiedLinkError("Failed recovering native library.").initCause(e));
        } catch (java.lang.Throwable th7) {
            th = th7;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (java.io.IOException unused2) {
                    return false;
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: loadFromRecovery */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.UnsatisfiedLinkError m101796x2983a165(java.lang.String r4, java.lang.ClassLoader r5, android.content.Context r6, java.io.File r7) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26305xfe98deef.m101796x2983a165(java.lang.String, java.lang.ClassLoader, android.content.Context, java.io.File):java.lang.UnsatisfiedLinkError");
    }

    /* renamed from: reflectSystemLoad */
    private static void m101797x29542652(java.lang.String str, java.lang.ClassLoader classLoader) {
        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
        java.lang.reflect.Method declaredMethod = runtime.getClass().getDeclaredMethod("load", java.lang.String.class, java.lang.ClassLoader.class);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(runtime, str, classLoader);
    }

    /* renamed from: reflectSystemLoadLibrary */
    private static void m101798x90163609(java.lang.String str, java.lang.ClassLoader classLoader) {
        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
        java.lang.reflect.Method declaredMethod = runtime.getClass().getDeclaredMethod("loadLibrary", java.lang.String.class, java.lang.ClassLoader.class);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(runtime, str, classLoader);
    }

    /* renamed from: setupBrokenLibraryHandler */
    public static void m101799xa32ecb61() {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26305xfe98deef.LibraryBrokenHandler(java.lang.Thread.getDefaultUncaughtExceptionHandler()));
    }
}
