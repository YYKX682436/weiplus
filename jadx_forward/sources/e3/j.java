package e3;

/* loaded from: classes13.dex */
public class j extends e3.p {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Class f328591a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Constructor f328592b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.reflect.Method f328593c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.reflect.Method f328594d;

    static {
        java.lang.Class<?> cls;
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method2;
        try {
            cls = java.lang.Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new java.lang.Class[0]);
            java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", java.nio.ByteBuffer.class, cls2, java.util.List.class, cls2, java.lang.Boolean.TYPE);
            method = android.graphics.Typeface.class.getMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance(cls, 1).getClass());
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f328592b = constructor;
        f328591a = cls;
        f328593c = method2;
        f328594d = method;
    }

    public static boolean g(java.lang.Object obj, java.nio.ByteBuffer byteBuffer, int i17, int i18, boolean z17) {
        try {
            return ((java.lang.Boolean) f328593c.invoke(obj, byteBuffer, java.lang.Integer.valueOf(i17), null, java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[SYNTHETIC] */
    @Override // e3.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface a(android.content.Context r18, d3.g r19, android.content.res.Resources r20, int r21) {
        /*
            r17 = this;
            r1 = 0
            r2 = 0
            java.lang.reflect.Constructor r0 = e3.j.f328592b     // Catch: java.lang.Throwable -> Lc
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r0 = r0.newInstance(r3)     // Catch: java.lang.Throwable -> Lc
            r3 = r0
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r3 != 0) goto L10
            return r1
        L10:
            r0 = r19
            d3.h[] r4 = r0.f307619a
            int r5 = r4.length
            r6 = r2
        L16:
            if (r6 >= r5) goto L71
            r7 = r4[r6]
            int r0 = r7.f307625f
            java.io.File r8 = e3.r.d(r18)
            r9 = r20
            if (r8 != 0) goto L25
            goto L2e
        L25:
            boolean r0 = e3.r.b(r8, r9, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L30
            r8.delete()
        L2e:
            r0 = r1
            goto L59
        L30:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            r10.<init>(r8)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            java.nio.channels.FileChannel r11 = r10.getChannel()     // Catch: java.lang.Throwable -> L49
            long r15 = r11.size()     // Catch: java.lang.Throwable -> L49
            java.nio.channels.FileChannel$MapMode r12 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L49
            r13 = 0
            java.nio.MappedByteBuffer r0 = r11.map(r12, r13, r15)     // Catch: java.lang.Throwable -> L49
            r10.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            goto L56
        L49:
            r0 = move-exception
            r11 = r0
            r10.close()     // Catch: java.lang.Throwable -> L4f
            goto L54
        L4f:
            r0 = move-exception
            r10 = r0
            r11.addSuppressed(r10)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L54:
            throw r11     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L55:
            r0 = r1
        L56:
            r8.delete()
        L59:
            if (r0 != 0) goto L5c
            return r1
        L5c:
            int r8 = r7.f307621b
            boolean r10 = r7.f307622c
            int r7 = r7.f307624e
            boolean r0 = g(r3, r0, r7, r8, r10)
            if (r0 != 0) goto L69
            return r1
        L69:
            int r6 = r6 + 1
            goto L16
        L6c:
            r0 = move-exception
            r8.delete()
            throw r0
        L71:
            java.lang.Class r0 = e3.j.f328591a     // Catch: java.lang.Throwable -> L88
            r4 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r4)     // Catch: java.lang.Throwable -> L88
            java.lang.reflect.Array.set(r0, r2, r3)     // Catch: java.lang.Throwable -> L88
            java.lang.reflect.Method r2 = e3.j.f328594d     // Catch: java.lang.Throwable -> L88
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = r2.invoke(r1, r0)     // Catch: java.lang.Throwable -> L88
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0     // Catch: java.lang.Throwable -> L88
            r1 = r0
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.j.a(android.content.Context, d3.g, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // e3.p
    public android.graphics.Typeface b(android.content.Context context, android.os.CancellationSignal cancellationSignal, k3.n[] nVarArr, int i17) {
        java.lang.Object obj;
        android.graphics.Typeface typeface;
        try {
            obj = f328592b.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        x.n nVar = new x.n();
        for (k3.n nVar2 : nVarArr) {
            android.net.Uri uri = nVar2.f385336a;
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) nVar.m174751x4aabfc28(uri, null);
            if (byteBuffer == null) {
                byteBuffer = e3.r.e(context, cancellationSignal, uri);
                nVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!g(obj, byteBuffer, nVar2.f385337b, nVar2.f385338c, nVar2.f385339d)) {
                return null;
            }
        }
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) f328591a, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            typeface = (android.graphics.Typeface) f328594d.invoke(null, newInstance);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return android.graphics.Typeface.create(typeface, i17);
    }
}
