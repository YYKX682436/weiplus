package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.UnsafeAccess */
/* loaded from: classes16.dex */
public final class C30147x2a467aca {

    /* renamed from: DISABLED_BY_USER */
    private static final boolean f76692x8b54c7f0;

    /* renamed from: UNSAFE */
    public static final sun.misc.Unsafe f76693x957dcda6;

    static {
        f76692x8b54c7f0 = java.lang.System.getProperty("rx.unsafe-disable") != null;
        sun.misc.Unsafe unsafe = null;
        try {
            java.lang.reflect.Field declaredField = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (sun.misc.Unsafe) declaredField.get(null);
        } catch (java.lang.Throwable unused) {
        }
        f76693x957dcda6 = unsafe;
    }

    private C30147x2a467aca() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    /* renamed from: addressOf */
    public static long m163330x342078eb(java.lang.Class<?> cls, java.lang.String str) {
        try {
            return f76693x957dcda6.objectFieldOffset(cls.getDeclaredField(str));
        } catch (java.lang.NoSuchFieldException e17) {
            java.lang.InternalError internalError = new java.lang.InternalError();
            internalError.initCause(e17);
            throw internalError;
        }
    }

    /* renamed from: compareAndSwapInt */
    public static boolean m163331xe5a3ee4a(java.lang.Object obj, long j17, int i17, int i18) {
        return f76693x957dcda6.compareAndSwapInt(obj, j17, i17, i18);
    }

    /* renamed from: getAndAddInt */
    public static int m163332xeea6b18f(java.lang.Object obj, long j17, int i17) {
        sun.misc.Unsafe unsafe;
        int intVolatile;
        do {
            unsafe = f76693x957dcda6;
            intVolatile = unsafe.getIntVolatile(obj, j17);
        } while (!unsafe.compareAndSwapInt(obj, j17, intVolatile, intVolatile + i17));
        return intVolatile;
    }

    /* renamed from: getAndIncrementInt */
    public static int m163333x848bf41(java.lang.Object obj, long j17) {
        sun.misc.Unsafe unsafe;
        int intVolatile;
        do {
            unsafe = f76693x957dcda6;
            intVolatile = unsafe.getIntVolatile(obj, j17);
        } while (!unsafe.compareAndSwapInt(obj, j17, intVolatile, intVolatile + 1));
        return intVolatile;
    }

    /* renamed from: getAndSetInt */
    public static int m163334xd734a2e(java.lang.Object obj, long j17, int i17) {
        sun.misc.Unsafe unsafe;
        int intVolatile;
        do {
            unsafe = f76693x957dcda6;
            intVolatile = unsafe.getIntVolatile(obj, j17);
        } while (!unsafe.compareAndSwapInt(obj, j17, intVolatile, i17));
        return intVolatile;
    }

    /* renamed from: isUnsafeAvailable */
    public static boolean m163335x5c51bd39() {
        return (f76693x957dcda6 == null || f76692x8b54c7f0) ? false : true;
    }
}
