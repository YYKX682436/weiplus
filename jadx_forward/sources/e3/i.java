package e3;

/* loaded from: classes13.dex */
public class i extends e3.p {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Class f328586a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Constructor f328587b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Method f328588c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.reflect.Method f328589d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f328590e;

    public static boolean g(java.lang.Object obj, java.lang.String str, int i17, boolean z17) {
        h();
        try {
            return ((java.lang.Boolean) f328588c.invoke(obj, str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public static void h() {
        java.lang.Class<?> cls;
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method2;
        if (f328590e) {
            return;
        }
        f328590e = true;
        try {
            cls = java.lang.Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new java.lang.Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", java.lang.String.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            method = android.graphics.Typeface.class.getMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance(cls, 1).getClass());
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f328587b = constructor;
        f328586a = cls;
        f328588c = method2;
        f328589d = method;
    }

    @Override // e3.p
    public android.graphics.Typeface a(android.content.Context context, d3.g gVar, android.content.res.Resources resources, int i17) {
        h();
        try {
            java.lang.Object newInstance = f328587b.newInstance(new java.lang.Object[0]);
            for (d3.h hVar : gVar.f307619a) {
                java.io.File d17 = e3.r.d(context);
                if (d17 == null) {
                    return null;
                }
                try {
                    if (!e3.r.b(d17, resources, hVar.f307625f)) {
                        return null;
                    }
                    if (!g(newInstance, d17.getPath(), hVar.f307621b, hVar.f307622c)) {
                        return null;
                    }
                    d17.delete();
                } catch (java.lang.RuntimeException unused) {
                    return null;
                } finally {
                    d17.delete();
                }
            }
            h();
            try {
                java.lang.Object newInstance2 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) f328586a, 1);
                java.lang.reflect.Array.set(newInstance2, 0, newInstance);
                return (android.graphics.Typeface) f328589d.invoke(null, newInstance2);
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException e18) {
            throw new java.lang.RuntimeException(e18);
        }
    }

    @Override // e3.p
    public android.graphics.Typeface b(android.content.Context context, android.os.CancellationSignal cancellationSignal, k3.n[] nVarArr, int i17) {
        java.io.File file;
        java.lang.String readlink;
        if (nVarArr.length < 1) {
            return null;
        }
        try {
            android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f(nVarArr, i17).f385336a, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = android.system.Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } catch (java.lang.Throwable th6) {
                    try {
                        openFileDescriptor.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (android.system.ErrnoException unused) {
            }
            try {
                if (android.system.OsConstants.S_ISREG(android.system.Os.stat(readlink).st_mode)) {
                    file = new java.io.File(readlink);
                    if (file != null && file.canRead()) {
                        android.graphics.Typeface createFromFile = android.graphics.Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(openFileDescriptor.getFileDescriptor());
                    android.graphics.Typeface c17 = c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c17;
                }
                android.graphics.Typeface c172 = c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c172;
            } finally {
            }
            file = null;
            if (file != null) {
                android.graphics.Typeface createFromFile2 = android.graphics.Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(openFileDescriptor.getFileDescriptor());
        } catch (java.io.IOException unused2) {
            return null;
        }
    }
}
