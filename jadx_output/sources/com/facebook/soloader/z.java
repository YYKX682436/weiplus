package com.facebook.soloader;

/* loaded from: classes12.dex */
public final class z implements com.facebook.soloader.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f44063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f44064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f44065c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runtime f44066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f44067e;

    public z(boolean z17, java.lang.String str, java.lang.String str2, java.lang.Runtime runtime, java.lang.reflect.Method method) {
        this.f44063a = z17;
        this.f44064b = str;
        this.f44065c = str2;
        this.f44066d = runtime;
        this.f44067e = method;
    }

    public final java.lang.String a(java.lang.String str) {
        try {
            java.io.File file = new java.io.File(str);
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        java.lang.String format = java.lang.String.format("%32x", new java.math.BigInteger(1, messageDigest.digest()));
                        fileInputStream.close();
                        return format;
                    }
                    messageDigest.update(bArr, 0, read);
                }
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable th8) {
                        th6.addSuppressed(th8);
                    }
                    throw th7;
                }
            }
        } catch (java.io.IOException | java.lang.SecurityException | java.security.NoSuchAlgorithmException e17) {
            return e17.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r10 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f44063a
            if (r0 == 0) goto L7a
            r0 = 4
            r10 = r10 & r0
            r1 = 1
            r2 = 0
            if (r10 != r0) goto Lc
            r10 = r1
            goto Ld
        Lc:
            r10 = r2
        Ld:
            if (r10 == 0) goto L12
            java.lang.String r10 = r8.f44064b
            goto L14
        L12:
            java.lang.String r10 = r8.f44065c
        L14:
            r0 = 0
            java.lang.Runtime r3 = r8.f44066d     // Catch: java.lang.Throwable -> L4f java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalArgumentException -> L56 java.lang.IllegalAccessException -> L58
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L4f java.lang.reflect.InvocationTargetException -> L54 java.lang.IllegalArgumentException -> L56 java.lang.IllegalAccessException -> L58
            java.lang.reflect.Method r4 = r8.f44067e     // Catch: java.lang.Throwable -> L41
            java.lang.Runtime r5 = r8.f44066d     // Catch: java.lang.Throwable -> L41
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L41
            r6[r2] = r9     // Catch: java.lang.Throwable -> L41
            java.lang.Class<com.facebook.soloader.c0> r2 = com.facebook.soloader.c0.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L41
            r6[r1] = r2     // Catch: java.lang.Throwable -> L41
            r1 = 2
            r6[r1] = r10     // Catch: java.lang.Throwable -> L41
            java.lang.Object r10 = r4.invoke(r5, r6)     // Catch: java.lang.Throwable -> L41
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L41
            if (r10 != 0) goto L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4d
            if (r10 == 0) goto L85
            r8.a(r9)
            goto L85
        L3b:
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L4d
            throw r0     // Catch: java.lang.Throwable -> L4d
        L41:
            r10 = move-exception
            r7 = r0
            r0 = r10
            r10 = r7
        L45:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4d
            throw r0     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.IllegalArgumentException -> L49 java.lang.IllegalAccessException -> L4b java.lang.Throwable -> L73
        L47:
            r0 = move-exception
            goto L5c
        L49:
            r0 = move-exception
            goto L5c
        L4b:
            r0 = move-exception
            goto L5c
        L4d:
            r0 = move-exception
            goto L45
        L4f:
            r10 = move-exception
            r7 = r0
            r0 = r10
            r10 = r7
            goto L74
        L54:
            r10 = move-exception
            goto L59
        L56:
            r10 = move-exception
            goto L59
        L58:
            r10 = move-exception
        L59:
            r7 = r0
            r0 = r10
            r10 = r7
        L5c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r1.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "Error: Cannot load "
            r1.append(r2)     // Catch: java.lang.Throwable -> L73
            r1.append(r9)     // Catch: java.lang.Throwable -> L73
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> L73
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L73
            r1.<init>(r10, r0)     // Catch: java.lang.Throwable -> L73
            throw r1     // Catch: java.lang.Throwable -> L73
        L73:
            r0 = move-exception
        L74:
            if (r10 == 0) goto L79
            r8.a(r9)
        L79:
            throw r0
        L7a:
            com.tencent.cso.CsoLoader r10 = com.tencent.cso.CsoLoader.f45934a
            java.lang.String r10 = "path"
            kotlin.jvm.internal.o.g(r9, r10)
            com.tencent.cso.CsoLoader.h(r9)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.z.b(java.lang.String, int):void");
    }
}
