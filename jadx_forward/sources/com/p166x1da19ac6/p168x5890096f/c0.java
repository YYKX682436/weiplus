package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public abstract class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static com.p166x1da19ac6.p168x5890096f.y f125538b;

    /* renamed from: f, reason: collision with root package name */
    public static com.p166x1da19ac6.p168x5890096f.m0[] f125542f;

    /* renamed from: g, reason: collision with root package name */
    public static com.p166x1da19ac6.p168x5890096f.d f125543g;

    /* renamed from: k, reason: collision with root package name */
    public static int f125547k;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantReadWriteLock f125539c = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: d, reason: collision with root package name */
    public static com.p166x1da19ac6.p168x5890096f.d0[] f125540d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f125541e = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashSet f125544h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f125545i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Set f125546j = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: l, reason: collision with root package name */
    public static int f125548l = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f125537a = true;

    public static void a(android.content.Context context, java.util.ArrayList arrayList, int i17) {
        if ((f125547k & 8) != 0) {
            f125542f = null;
            java.io.File i18 = com.p166x1da19ac6.p168x5890096f.m0.i(context, "lib-main");
            try {
                com.p166x1da19ac6.p168x5890096f.e0.a(i18);
                return;
            } catch (java.io.IOException unused) {
                i18.getCanonicalPath();
                return;
            }
        }
        java.io.File file = new java.io.File(context.getApplicationInfo().sourceDir);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.p166x1da19ac6.p168x5890096f.c cVar = new com.p166x1da19ac6.p168x5890096f.c(context, file, "lib-main", i17);
        arrayList2.add(cVar);
        cVar.mo16739x9616526c();
        if (context.getApplicationInfo().splitSourceDirs != null) {
            java.lang.String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i19 = 0;
            int i27 = 0;
            while (i19 < length) {
                com.p166x1da19ac6.p168x5890096f.c cVar2 = new com.p166x1da19ac6.p168x5890096f.c(context, new java.io.File(strArr[i19]), "lib-" + i27, i17);
                cVar2.mo16739x9616526c();
                arrayList2.add(cVar2);
                i19++;
                i27++;
            }
        }
        f125542f = (com.p166x1da19ac6.p168x5890096f.m0[]) arrayList2.toArray(new com.p166x1da19ac6.p168x5890096f.m0[arrayList2.size()]);
        arrayList.addAll(0, arrayList2);
    }

    public static void b(java.lang.String str, int i17, android.os.StrictMode.ThreadPolicy threadPolicy) {
        boolean z17;
        int i18;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock;
        com.p166x1da19ac6.p168x5890096f.m0[] m0VarArr;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock2 = f125539c;
        reentrantReadWriteLock2.readLock().lock();
        try {
            if (f125540d == null) {
                throw new java.lang.UnsatisfiedLinkError("couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock2.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = android.os.StrictMode.allowThreadDiskReads();
                z17 = true;
            } else {
                z17 = false;
            }
            if (f125537a) {
                com.p166x1da19ac6.p168x5890096f.a.a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock2.readLock().lock();
                i18 = 0;
                int i19 = 0;
                while (i18 == 0) {
                    try {
                        com.p166x1da19ac6.p168x5890096f.d0[] d0VarArr = f125540d;
                        if (i19 < d0VarArr.length) {
                            i18 = d0VarArr[i19].a(str, i17, threadPolicy);
                            if (i18 != 3 || (m0VarArr = f125542f) == null) {
                                i19++;
                            } else {
                                for (com.p166x1da19ac6.p168x5890096f.m0 m0Var : m0VarArr) {
                                    synchronized (m0Var) {
                                        synchronized (m0Var.h(str)) {
                                            m0Var.f125582d = str;
                                            m0Var.b(2);
                                        }
                                    }
                                    int a17 = m0Var.a(str, i17, threadPolicy);
                                    if (a17 == 1) {
                                        i18 = a17;
                                        break;
                                    }
                                }
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        throw th6;
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                i18 = 0;
            }
            try {
                if (z17) {
                    android.os.StrictMode.setThreadPolicy(threadPolicy);
                }
                if (i18 == 0 || i18 == 3) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("couldn't find DSO to load: ");
                    sb6.append(str);
                    reentrantReadWriteLock.readLock().lock();
                    for (int i27 = 0; i27 < f125540d.length; i27++) {
                        sb6.append("\n\tSoSource ");
                        sb6.append(i27);
                        sb6.append(": ");
                        sb6.append(f125540d[i27].mo16739x9616526c());
                    }
                    com.p166x1da19ac6.p168x5890096f.d dVar = f125543g;
                    if (dVar != null) {
                        try {
                            android.content.Context context = dVar.f125549a;
                            java.io.File file = new java.io.File(context.createPackageContext(context.getPackageName(), 0).getApplicationInfo().nativeLibraryDir);
                            sb6.append("\n\tNative lib dir: ");
                            sb6.append(file.getAbsolutePath());
                            sb6.append("\n");
                        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                            throw new java.lang.RuntimeException(e17);
                        }
                    }
                    f125539c.readLock().unlock();
                    sb6.append(" result: ");
                    sb6.append(i18);
                    throw new java.lang.UnsatisfiedLinkError(sb6.toString());
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                if (z17) {
                    android.os.StrictMode.setThreadPolicy(threadPolicy);
                }
                if (i18 == 0 || i18 == 3) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("couldn't find DSO to load: ");
                    sb7.append(str);
                    java.lang.String message = th.getMessage();
                    if (message == null) {
                        message = th.toString();
                    }
                    sb7.append(" caused by: ");
                    sb7.append(message);
                    sb7.append(" result: ");
                    sb7.append(i18);
                    java.lang.UnsatisfiedLinkError unsatisfiedLinkError = new java.lang.UnsatisfiedLinkError(sb7.toString());
                    unsatisfiedLinkError.initCause(th);
                    throw unsatisfiedLinkError;
                }
            }
        } finally {
            f125539c.readLock().unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[Catch: all -> 0x000b, TRY_ENTER, TryCatch #1 {, blocks: (B:40:0x0005, B:5:0x0010, B:9:0x0014, B:16:0x0043, B:19:0x0073, B:22:0x004e, B:24:0x005d, B:28:0x006b, B:29:0x0068, B:32:0x006e, B:36:0x0025), top: B:39:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[Catch: all -> 0x000b, TryCatch #1 {, blocks: (B:40:0x0005, B:5:0x0010, B:9:0x0014, B:16:0x0043, B:19:0x0073, B:22:0x004e, B:24:0x005d, B:28:0x006b, B:29:0x0068, B:32:0x006e, B:36:0x0025), top: B:39:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void c(com.p166x1da19ac6.p168x5890096f.y r11) {
        /*
            java.lang.Class<com.facebook.soloader.c0> r0 = com.p166x1da19ac6.p168x5890096f.c0.class
            monitor-enter(r0)
            if (r11 != 0) goto Le
            com.facebook.soloader.y r1 = com.p166x1da19ac6.p168x5890096f.c0.f125538b     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Le
            monitor-exit(r0)
            return
        Lb:
            r11 = move-exception
            goto L7e
        Le:
            if (r11 == 0) goto L14
            com.p166x1da19ac6.p168x5890096f.c0.f125538b = r11     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        L14:
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> Lb
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb
            r2 = 27
            r3 = 1
            r4 = 0
            r6 = 0
            if (r1 <= r2) goto L25
        L23:
            r11 = r6
            goto L3c
        L25:
            java.lang.Class<java.lang.Runtime> r1 = java.lang.Runtime.class
            java.lang.String r2 = "nativeLoad"
            r7 = 3
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lb java.lang.Throwable -> L23
            r7[r4] = r11     // Catch: java.lang.Throwable -> Lb java.lang.Throwable -> L23
            java.lang.Class<java.lang.ClassLoader> r8 = java.lang.ClassLoader.class
            r7[r3] = r8     // Catch: java.lang.Throwable -> Lb java.lang.Throwable -> L23
            r8 = 2
            r7[r8] = r11     // Catch: java.lang.Throwable -> Lb java.lang.Throwable -> L23
            java.lang.reflect.Method r11 = r1.getDeclaredMethod(r2, r7)     // Catch: java.lang.Throwable -> Lb java.lang.Throwable -> L23
            r11.setAccessible(r3)     // Catch: java.lang.Throwable -> Lb java.lang.Throwable -> L23
        L3c:
            if (r11 == 0) goto L40
            r2 = r3
            goto L41
        L40:
            r2 = r4
        L41:
            if (r2 == 0) goto L49
            java.lang.String r1 = com.p166x1da19ac6.p168x5890096f.a0.a()     // Catch: java.lang.Throwable -> Lb
            r3 = r1
            goto L4a
        L49:
            r3 = r6
        L4a:
            if (r3 != 0) goto L4e
            r4 = r6
            goto L73
        L4e:
            java.lang.String r1 = ":"
            java.lang.String[] r6 = r3.split(r1)     // Catch: java.lang.Throwable -> Lb
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb
            int r8 = r6.length     // Catch: java.lang.Throwable -> Lb
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lb
            int r8 = r6.length     // Catch: java.lang.Throwable -> Lb
        L5b:
            if (r4 >= r8) goto L6e
            r9 = r6[r4]     // Catch: java.lang.Throwable -> Lb
            java.lang.String r10 = "!"
            boolean r10 = r9.contains(r10)     // Catch: java.lang.Throwable -> Lb
            if (r10 == 0) goto L68
            goto L6b
        L68:
            r7.add(r9)     // Catch: java.lang.Throwable -> Lb
        L6b:
            int r4 = r4 + 1
            goto L5b
        L6e:
            java.lang.String r1 = android.text.TextUtils.join(r1, r7)     // Catch: java.lang.Throwable -> Lb
            r4 = r1
        L73:
            com.facebook.soloader.z r7 = new com.facebook.soloader.z     // Catch: java.lang.Throwable -> Lb
            r1 = r7
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lb
            com.p166x1da19ac6.p168x5890096f.c0.f125538b = r7     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        L7e:
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p166x1da19ac6.p168x5890096f.c0.c(com.facebook.soloader.y):void");
    }

    public static void d(android.content.Context context, int i17, com.p166x1da19ac6.p168x5890096f.y yVar) {
        int i18;
        if (f125540d != null) {
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = f125539c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            f125547k = i17;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str = java.lang.System.getenv("LD_LIBRARY_PATH");
            if (str == null) {
                str = android.os.Process.is64Bit() ? "/vendor/lib64:/system/lib64" : "/vendor/lib:/system/lib";
            }
            for (java.lang.String str2 : str.split(":")) {
                arrayList.add(new com.p166x1da19ac6.p168x5890096f.f(new java.io.File(str2), 2));
            }
            if (context != null) {
                if ((i17 & 1) != 0) {
                    f125542f = null;
                    arrayList.add(0, new com.p166x1da19ac6.p168x5890096f.n(context, "lib-main"));
                } else {
                    if (com.p166x1da19ac6.p168x5890096f.e0.d(context, f125548l)) {
                        com.p166x1da19ac6.p168x5890096f.e eVar = new com.p166x1da19ac6.p168x5890096f.e(context);
                        eVar.mo16739x9616526c();
                        arrayList.add(0, eVar);
                    } else {
                        int i19 = f125548l;
                        if (i19 != 1) {
                            if (i19 != 2 && i19 != 3) {
                                throw new java.lang.RuntimeException("Unsupported app type, we should not reach here");
                            }
                            i18 = 1;
                        } else {
                            i18 = 0;
                        }
                        com.p166x1da19ac6.p168x5890096f.d dVar = new com.p166x1da19ac6.p168x5890096f.d(context, i18);
                        f125543g = dVar;
                        dVar.mo16739x9616526c();
                        arrayList.add(0, f125543g);
                    }
                    a(context, arrayList, 1);
                }
            }
            com.p166x1da19ac6.p168x5890096f.d0[] d0VarArr = (com.p166x1da19ac6.p168x5890096f.d0[]) arrayList.toArray(new com.p166x1da19ac6.p168x5890096f.d0[arrayList.size()]);
            reentrantReadWriteLock.writeLock().lock();
            int i27 = (f125547k & 2) != 0 ? 1 : 0;
            reentrantReadWriteLock.writeLock().unlock();
            int length = d0VarArr.length;
            while (true) {
                int i28 = length - 1;
                if (length <= 0) {
                    f125540d = d0VarArr;
                    f125541e.getAndIncrement();
                    int length2 = f125540d.length;
                    return;
                } else {
                    java.util.Objects.toString(d0VarArr[i28]);
                    d0VarArr[i28].b(i27);
                    length = i28;
                }
            }
        } catch (java.lang.Throwable th6) {
            throw th6;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(java.lang.String r17, int r18) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p166x1da19ac6.p168x5890096f.c0.e(java.lang.String, int):boolean");
    }

    public static boolean f(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, android.os.StrictMode.ThreadPolicy threadPolicy) {
        boolean z17;
        java.lang.Object obj;
        boolean z18 = false;
        if (!android.text.TextUtils.isEmpty(str2) && f125546j.contains(str2)) {
            return false;
        }
        synchronized (com.p166x1da19ac6.p168x5890096f.c0.class) {
            java.util.HashSet hashSet = f125544h;
            if (!hashSet.contains(str)) {
                z17 = false;
            } else {
                if (str3 == null) {
                    return false;
                }
                z17 = true;
            }
            java.util.Map map = f125545i;
            if (((java.util.HashMap) map).containsKey(str)) {
                obj = ((java.util.HashMap) map).get(str);
            } else {
                java.lang.Object obj2 = new java.lang.Object();
                ((java.util.HashMap) map).put(str, obj2);
                obj = obj2;
            }
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = f125539c;
            reentrantReadWriteLock.readLock().lock();
            try {
                synchronized (obj) {
                    if (!z17) {
                        try {
                            synchronized (com.p166x1da19ac6.p168x5890096f.c0.class) {
                                if (hashSet.contains(str)) {
                                    if (str3 == null) {
                                        reentrantReadWriteLock.readLock().unlock();
                                        return false;
                                    }
                                    z17 = true;
                                }
                                if (!z17) {
                                    try {
                                        b(str, i17, threadPolicy);
                                        synchronized (com.p166x1da19ac6.p168x5890096f.c0.class) {
                                            try {
                                                hashSet.add(str);
                                            } finally {
                                            }
                                        }
                                    } catch (java.lang.UnsatisfiedLinkError e17) {
                                        java.lang.String message = e17.getMessage();
                                        if (message == null || !message.contains("unexpected e_machine:")) {
                                            throw e17;
                                        }
                                        throw new com.p166x1da19ac6.p168x5890096f.b0(e17, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th6) {
                            throw th6;
                        }
                    }
                    if ((i17 & 16) == 0) {
                        if (!android.text.TextUtils.isEmpty(str2) && f125546j.contains(str2)) {
                            z18 = true;
                        }
                        if (str3 != null && !z18) {
                            if (f125537a) {
                                com.p166x1da19ac6.p168x5890096f.a.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                            }
                            try {
                                try {
                                    com.p166x1da19ac6.p168x5890096f.u.a(str2);
                                    throw null;
                                } catch (java.lang.UnsatisfiedLinkError e18) {
                                    throw new java.lang.RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e18);
                                }
                            } finally {
                                boolean z19 = f125537a;
                            }
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return !z17;
                }
            } catch (java.lang.Throwable th7) {
                f125539c.readLock().unlock();
                throw th7;
            }
        }
    }
}
