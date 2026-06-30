package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class ib {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.logging.Logger f45202a = java.util.logging.Logger.getLogger(com.google.protobuf.ib.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final sun.misc.Unsafe f45203b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f45204c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.protobuf.hb f45205d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f45206e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f45207f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f45208g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f45209h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f45210i;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ib.<clinit>():void");
    }

    public static java.lang.Object a(java.lang.Class cls) {
        try {
            return f45203b.allocateInstance(cls);
        } catch (java.lang.InstantiationException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }

    public static int b(java.lang.Class cls) {
        if (f45207f) {
            return f45205d.a(cls);
        }
        return -1;
    }

    public static int c(java.lang.Class cls) {
        if (f45207f) {
            return f45205d.b(cls);
        }
        return -1;
    }

    public static java.lang.reflect.Field d() {
        java.lang.reflect.Field field;
        java.lang.reflect.Field field2;
        if (com.google.protobuf.i.a()) {
            try {
                field2 = java.nio.Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (java.lang.Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = java.nio.Buffer.class.getDeclaredField("address");
        } catch (java.lang.Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return field;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(java.lang.Class cls) {
        if (!com.google.protobuf.i.a()) {
            return false;
        }
        try {
            java.lang.Class cls2 = f45204c;
            java.lang.Class cls3 = java.lang.Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, cls3);
            java.lang.Class cls4 = java.lang.Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean f(java.lang.Object obj, long j17) {
        return f45205d.d(obj, j17);
    }

    public static byte g(long j17) {
        return f45205d.e(j17);
    }

    public static byte h(byte[] bArr, long j17) {
        return f45205d.f(bArr, f45208g + j17);
    }

    public static byte i(java.lang.Object obj, long j17) {
        return (byte) ((m(obj, (-4) & j17) >>> ((int) (((~j17) & 3) << 3))) & 255);
    }

    public static byte j(java.lang.Object obj, long j17) {
        return (byte) ((m(obj, (-4) & j17) >>> ((int) ((j17 & 3) << 3))) & 255);
    }

    public static double k(java.lang.Object obj, long j17) {
        return f45205d.g(obj, j17);
    }

    public static float l(java.lang.Object obj, long j17) {
        return f45205d.h(obj, j17);
    }

    public static int m(java.lang.Object obj, long j17) {
        return f45205d.i(obj, j17);
    }

    public static long n(java.lang.Object obj, long j17) {
        return f45205d.j(obj, j17);
    }

    public static java.lang.Object o(java.lang.Object obj, long j17) {
        return f45205d.k(obj, j17);
    }

    public static sun.misc.Unsafe p() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.protobuf.db());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static long q(java.lang.reflect.Field field) {
        return f45205d.l(field);
    }

    public static void r(byte[] bArr, long j17, byte b17) {
        f45205d.n(bArr, f45208g + j17, b17);
    }

    public static void s(java.lang.Object obj, long j17, byte b17) {
        long j18 = (-4) & j17;
        int m17 = m(obj, j18);
        int i17 = ((~((int) j17)) & 3) << 3;
        u(obj, j18, ((255 & b17) << i17) | (m17 & (~(255 << i17))));
    }

    public static void t(java.lang.Object obj, long j17, byte b17) {
        long j18 = (-4) & j17;
        int i17 = (((int) j17) & 3) << 3;
        u(obj, j18, ((255 & b17) << i17) | (m(obj, j18) & (~(255 << i17))));
    }

    public static void u(java.lang.Object obj, long j17, int i17) {
        f45205d.q(obj, j17, i17);
    }

    public static void v(java.lang.Object obj, long j17, long j18) {
        f45205d.r(obj, j17, j18);
    }

    public static void w(java.lang.Object obj, long j17, java.lang.Object obj2) {
        f45205d.s(obj, j17, obj2);
    }
}
