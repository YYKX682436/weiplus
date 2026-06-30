package b56;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static android.content.Context f18113a;

    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r14) {
        /*
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = "currentApplication"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Exception -> L19
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Exception -> L19
            android.app.Application r1 = (android.app.Application) r1     // Catch: java.lang.Exception -> L19
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Exception -> L19
            b56.a.f18113a = r1     // Catch: java.lang.Exception -> L19
        L19:
            android.content.Context r1 = b56.a.f18113a
            boolean r2 = android.text.TextUtils.isEmpty(r14)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L24
            goto L69
        L24:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L65
            r2.<init>()     // Catch: java.lang.Throwable -> L65
            r2.add(r14)     // Catch: java.lang.Throwable -> L65
            java.lang.Object r13 = new java.lang.Object     // Catch: java.lang.Throwable -> L65
            r13.<init>()     // Catch: java.lang.Throwable -> L65
            java.util.Collections.reverse(r2)     // Catch: java.lang.Throwable -> L65
            java.lang.Object[] r6 = r2.toArray()     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = "org/extra/tools/a"
            java.lang.String r8 = "a"
            java.lang.String r9 = "(Ljava/lang/String;)Z"
            java.lang.String r10 = "java/lang/System_EXEC_"
            java.lang.String r11 = "loadLibrary"
            java.lang.String r12 = "(Ljava/lang/String;)V"
            r5 = r13
            yj0.a.d(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L65
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L65
            com.tencent.cso.CsoLoader.e(r2)     // Catch: java.lang.Throwable -> L65
            java.lang.String r6 = "org/extra/tools/a"
            java.lang.String r7 = "a"
            java.lang.String r8 = "(Ljava/lang/String;)Z"
            java.lang.String r9 = "java/lang/System_EXEC_"
            java.lang.String r10 = "loadLibrary"
            java.lang.String r11 = "(Ljava/lang/String;)V"
            r5 = r13
            yj0.a.f(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L65
            r2 = r3
            goto L6a
        L65:
            r2 = move-exception
            r2.getMessage()
        L69:
            r2 = r4
        L6a:
            if (r2 == 0) goto L6d
            goto Lc8
        L6d:
            if (r1 == 0) goto Lb3
            boolean r2 = android.text.TextUtils.isEmpty(r14)
            if (r2 == 0) goto L76
            goto Lb3
        L76:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r2.<init>()     // Catch: java.lang.Throwable -> Laf
            android.content.pm.ApplicationInfo r5 = r1.getApplicationInfo()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = r5.dataDir     // Catch: java.lang.Throwable -> Laf
            r2.append(r5)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "/lib"
            r2.append(r5)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r5.<init>()     // Catch: java.lang.Throwable -> Laf
            r5.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> Laf
            r5.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "lib"
            r5.append(r2)     // Catch: java.lang.Throwable -> Laf
            r5.append(r14)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = ".so"
            r5.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> Laf
            com.tencent.cso.CsoLoader.g(r2)     // Catch: java.lang.Throwable -> Laf
            goto Lb4
        Laf:
            r2 = move-exception
            r2.getMessage()
        Lb3:
            r3 = r4
        Lb4:
            if (r3 == 0) goto Lb7
            goto Lc8
        Lb7:
            if (r1 == 0) goto Lc8
            boolean r2 = android.text.TextUtils.isEmpty(r14)
            if (r2 == 0) goto Lc0
            goto Lc8
        Lc0:
            z46.f r2 = new z46.f     // Catch: java.lang.Throwable -> Lc8
            r2.<init>()     // Catch: java.lang.Throwable -> Lc8
            r2.b(r1, r14, r0, r0)     // Catch: java.lang.Throwable -> Lc8
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b56.a.a(java.lang.String):void");
    }
}
