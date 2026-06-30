package w46;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f524460a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f524461b = {"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable"};

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.reflect.Method f524462c;

    /* renamed from: d, reason: collision with root package name */
    public static /* synthetic */ java.lang.Class f524463d;

    static {
        java.lang.reflect.Method method = null;
        try {
            java.lang.Class cls = f524463d;
            if (cls == null) {
                cls = a("java.lang.Throwable");
                f524463d = cls;
            }
            method = cls.getMethod("getCause", null);
        } catch (java.lang.Exception unused) {
        }
        f524462c = method;
        try {
            java.lang.Class cls2 = f524463d;
            if (cls2 == null) {
                cls2 = a("java.lang.Throwable");
                f524463d = cls2;
            }
            java.lang.Class<?>[] clsArr = new java.lang.Class[1];
            java.lang.Class<?> cls3 = f524463d;
            if (cls3 == null) {
                cls3 = a("java.lang.Throwable");
                f524463d = cls3;
            }
            clsArr[0] = cls3;
            cls2.getMethod("initCause", clsArr);
        } catch (java.lang.Exception unused2) {
        }
    }

    public static /* synthetic */ java.lang.Class a(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e17) {
            throw new java.lang.NoClassDefFoundError(e17.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071 A[EDGE_INSN: B:36:0x0071->B:37:0x0071 BREAK  A[LOOP:0: B:21:0x0038->B:58:0x006e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Throwable b(java.lang.Throwable r5, java.lang.String[] r6) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof w46.b
            if (r1 == 0) goto L10
            r1 = r5
            w46.b r1 = (w46.b) r1
            w46.d r1 = (w46.d) r1
            java.lang.Throwable r1 = r1.f524466e
            goto L29
        L10:
            boolean r1 = r5 instanceof java.sql.SQLException
            if (r1 == 0) goto L1c
            r1 = r5
            java.sql.SQLException r1 = (java.sql.SQLException) r1
            java.sql.SQLException r1 = r1.getNextException()
            goto L29
        L1c:
            boolean r1 = r5 instanceof java.lang.reflect.InvocationTargetException
            if (r1 == 0) goto L28
            r1 = r5
            java.lang.reflect.InvocationTargetException r1 = (java.lang.reflect.InvocationTargetException) r1
            java.lang.Throwable r1 = r1.getTargetException()
            goto L29
        L28:
            r1 = r0
        L29:
            if (r1 != 0) goto L9f
            if (r6 != 0) goto L37
            java.lang.Object r2 = w46.a.f524460a
            monitor-enter(r2)
            java.lang.String[] r6 = w46.a.f524461b     // Catch: java.lang.Throwable -> L34
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            goto L37
        L34:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            throw r5
        L37:
            r2 = 0
        L38:
            int r3 = r6.length
            if (r2 >= r3) goto L71
            r3 = r6[r2]
            if (r3 == 0) goto L6e
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Throwable -> L48
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L48
            goto L49
        L48:
            r1 = r0
        L49:
            if (r1 == 0) goto L6a
            java.lang.Class r3 = w46.a.f524463d
            if (r3 != 0) goto L57
            java.lang.String r3 = "java.lang.Throwable"
            java.lang.Class r3 = a(r3)
            w46.a.f524463d = r3
        L57:
            java.lang.Class r4 = r1.getReturnType()
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L6a
            java.lang.Object[] r3 = u46.a.f506189a     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r1 = r1.invoke(r5, r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> L6a
            goto L6b
        L6a:
            r1 = r0
        L6b:
            if (r1 == 0) goto L6e
            goto L71
        L6e:
            int r2 = r2 + 1
            goto L38
        L71:
            if (r1 != 0) goto L9f
            java.lang.String r6 = "detail"
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Throwable -> L7e
            java.lang.reflect.Field r6 = r1.getField(r6)     // Catch: java.lang.Throwable -> L7e
            goto L7f
        L7e:
            r6 = r0
        L7f:
            if (r6 == 0) goto L9e
            java.lang.Class r1 = w46.a.f524463d
            if (r1 != 0) goto L8d
            java.lang.String r1 = "java.lang.Throwable"
            java.lang.Class r1 = a(r1)
            w46.a.f524463d = r1
        L8d:
            java.lang.Class r2 = r6.getType()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L9e
            java.lang.Object r5 = r6.get(r5)     // Catch: java.lang.Throwable -> L9e
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch: java.lang.Throwable -> L9e
            r0 = r5
        L9e:
            r1 = r0
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w46.a.b(java.lang.Throwable, java.lang.String[]):java.lang.Throwable");
    }
}
