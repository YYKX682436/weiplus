package by5;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f36408a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f36409b;

    /* JADX WARN: Removed duplicated region for block: B:5:0x0089 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = "AbiUtil"
            java.lang.String r1 = by5.a.f36408a
            if (r1 != 0) goto L85
            java.lang.String[] r1 = android.os.Build.SUPPORTED_ABIS     // Catch: java.lang.Throwable -> L12 java.lang.NoSuchFieldError -> L19
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L12 java.lang.NoSuchFieldError -> L19
            java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.Throwable -> L12 java.lang.NoSuchFieldError -> L19
            by5.a.f36408a = r1     // Catch: java.lang.Throwable -> L12 java.lang.NoSuchFieldError -> L19
            goto L2b
        L12:
            r1 = move-exception
            java.lang.String r2 = "getDeviceAbi failed, Build.SUPPORTED_ABIS error"
            by5.c4.d(r0, r2, r1)
            goto L2b
        L19:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getDeviceAbi failed, Build.SUPPORTED_ABIS NoSuchFieldError:"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            by5.c4.c(r0, r1)
        L2b:
            java.lang.String r1 = by5.a.f36408a
            if (r1 != 0) goto L72
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = "getprop ro.product.cpu.abi"
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Throwable -> L5a
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L5a
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L5a
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5a
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L55
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.Throwable -> L53
            by5.a.f36408a = r1     // Catch: java.lang.Throwable -> L53
            goto L63
        L53:
            r1 = move-exception
            goto L5e
        L55:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L5e
        L5a:
            r2 = move-exception
            r3 = r1
            r1 = r2
            r2 = r3
        L5e:
            java.lang.String r4 = "getDeviceAbi failed, error"
            by5.c4.d(r0, r4, r1)     // Catch: java.lang.Throwable -> L6a
        L63:
            by5.u.l(r3)
            by5.u.l(r2)
            goto L72
        L6a:
            r0 = move-exception
            by5.u.l(r3)
            by5.u.l(r2)
            throw r0
        L72:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Device ABI: "
            r1.<init>(r2)
            java.lang.String r2 = by5.a.f36408a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            by5.c4.f(r0, r1)
        L85:
            java.lang.String r0 = by5.a.f36408a
            if (r0 != 0) goto L8b
            java.lang.String r0 = ""
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: by5.a.a():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b() {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: by5.a.b():java.lang.String");
    }

    public static boolean c() {
        java.lang.String a17 = a();
        return a17.equals("x86") || a17.equals("x86_64");
    }
}
