package org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440;

/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.reflect.Method f429381a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Method f429382b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Method f429383c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.reflect.Constructor f429384d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Class f429385e;

    /* renamed from: f, reason: collision with root package name */
    public static final org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.f f429386f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.reflect.Method f429387g;

    static {
        java.lang.reflect.Method declaredMethod;
        java.lang.reflect.Constructor<?> declaredConstructor;
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.f fVar;
        java.lang.reflect.Constructor<?> declaredConstructor2;
        try {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(1);
            java.lang.Class<?> cls = allocateDirect.getClass();
            f429385e = cls;
            try {
                java.lang.Class<?> cls2 = java.lang.Long.TYPE;
                declaredConstructor = cls.getDeclaredConstructor(cls2, cls2);
                fVar = org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.f.ARGS_LONG_LONG;
                declaredMethod = null;
            } catch (java.lang.NoSuchMethodException unused) {
                try {
                    try {
                        try {
                            declaredConstructor2 = f429385e.getDeclaredConstructor(java.lang.Long.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            fVar = org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.f.ARGS_LONG_INT_REF;
                        } catch (java.lang.NoSuchMethodException unused2) {
                            declaredConstructor2 = f429385e.getDeclaredConstructor(java.lang.Long.TYPE, java.lang.Integer.TYPE);
                            fVar = org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.f.ARGS_LONG_INT;
                        }
                    } catch (java.lang.NoSuchMethodException unused3) {
                        java.lang.Class cls3 = f429385e;
                        java.lang.Class<?> cls4 = java.lang.Integer.TYPE;
                        declaredConstructor2 = cls3.getDeclaredConstructor(cls4, cls4);
                        fVar = org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.f.ARGS_INT_INT;
                    }
                    declaredMethod = null;
                    declaredConstructor = declaredConstructor2;
                } catch (java.lang.NoSuchMethodException unused4) {
                    java.lang.Class<?> cls5 = java.lang.Class.forName("java.nio.MemoryBlock");
                    java.lang.Class<?> cls6 = java.lang.Integer.TYPE;
                    declaredMethod = cls5.getDeclaredMethod("wrapFromJni", cls6, java.lang.Long.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredConstructor = f429385e.getDeclaredConstructor(cls5, cls6, cls6);
                    fVar = org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.f.ARGS_MB_INT_INT;
                }
            }
            f429384d = declaredConstructor;
            f429386f = fVar;
            f429387g = declaredMethod;
            if (declaredConstructor == null) {
                throw new java.lang.RuntimeException("Constructor of DirectByteBuffer is not found");
            }
            try {
                declaredConstructor.setAccessible(true);
            } catch (java.lang.RuntimeException e17) {
                if (!"java.lang.reflect.InaccessibleObjectException".equals(e17.getClass().getName())) {
                    throw e17;
                }
                f429384d = null;
            }
            if (org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h.f75080x6290c056 <= 8) {
                b(allocateDirect);
                return;
            }
            java.lang.Object doPrivileged = java.security.AccessController.doPrivileged(new org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.e(allocateDirect));
            if (doPrivileged instanceof java.lang.Throwable) {
                throw new java.lang.RuntimeException((java.lang.Throwable) doPrivileged);
            }
            f429383c = (java.lang.reflect.Method) doPrivileged;
        } catch (java.lang.Exception e18) {
            throw new java.lang.RuntimeException(e18);
        }
    }

    public static long a(java.nio.Buffer buffer) {
        return ((sun.nio.ch.DirectBuffer) buffer).address();
    }

    public static void b(java.nio.ByteBuffer byteBuffer) {
        java.lang.Object doPrivileged = java.security.AccessController.doPrivileged(new org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.c(byteBuffer));
        if (doPrivileged instanceof java.lang.Throwable) {
            throw new java.lang.RuntimeException((java.lang.Throwable) doPrivileged);
        }
        f429381a = (java.lang.reflect.Method) doPrivileged;
        java.lang.Object doPrivileged2 = java.security.AccessController.doPrivileged(new org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.d(byteBuffer));
        if (doPrivileged2 instanceof java.lang.Throwable) {
            throw new java.lang.RuntimeException((java.lang.Throwable) doPrivileged2);
        }
        f429382b = (java.lang.reflect.Method) doPrivileged2;
    }
}
