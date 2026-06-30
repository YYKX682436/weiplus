package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzabm {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.zzabm.class.getName());
    private static final java.lang.Class<?> zzbqv;
    private static final sun.misc.Unsafe zzbtj;
    private static final boolean zzbun;
    private static final boolean zzbuo;
    private static final com.google.android.gms.internal.measurement.zzabm.zzd zzbup;
    private static final boolean zzbuq;
    private static final boolean zzbur;
    private static final long zzbus;
    private static final long zzbut;
    private static final long zzbuu;
    private static final long zzbuv;
    private static final long zzbuw;
    private static final long zzbux;
    private static final long zzbuy;
    private static final long zzbuz;
    private static final long zzbva;
    private static final long zzbvb;
    private static final long zzbvc;
    private static final long zzbvd;
    private static final long zzbve;
    private static final long zzbvf;
    private static final long zzbvg;
    private static final boolean zzbvh;

    /* loaded from: classes13.dex */
    public static final class zza extends com.google.android.gms.internal.measurement.zzabm.zzd {
        public zza(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }
    }

    /* loaded from: classes13.dex */
    public static final class zzb extends com.google.android.gms.internal.measurement.zzabm.zzd {
        public zzb(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }
    }

    /* loaded from: classes13.dex */
    public static final class zzc extends com.google.android.gms.internal.measurement.zzabm.zzd {
        public zzc(sun.misc.Unsafe unsafe) {
            super(unsafe);
        }
    }

    /* loaded from: classes13.dex */
    public static abstract class zzd {
        sun.misc.Unsafe zzbvi;

        public zzd(sun.misc.Unsafe unsafe) {
            this.zzbvi = unsafe;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ec  */
    static {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzabm.<clinit>():void");
    }

    private zzabm() {
    }

    private static long zza(java.lang.reflect.Field field) {
        com.google.android.gms.internal.measurement.zzabm.zzd zzdVar;
        if (field == null || (zzdVar = zzbup) == null) {
            return -1L;
        }
        return zzdVar.zzbvi.objectFieldOffset(field);
    }

    private static int zzi(java.lang.Class<?> cls) {
        if (zzbur) {
            return zzbup.zzbvi.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzj(java.lang.Class<?> cls) {
        if (zzbur) {
            return zzbup.zzbvi.arrayIndexScale(cls);
        }
        return -1;
    }

    private static boolean zzk(java.lang.Class<?> cls) {
        if (!com.google.android.gms.internal.measurement.zzyv.zzsv()) {
            return false;
        }
        try {
            java.lang.Class<?> cls2 = zzbqv;
            java.lang.Class<?> cls3 = java.lang.Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, cls3);
            java.lang.Class<?> cls4 = java.lang.Integer.TYPE;
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

    public static sun.misc.Unsafe zzur() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.measurement.zzabn());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static boolean zzus() {
        sun.misc.Unsafe unsafe = zzbtj;
        if (unsafe == null) {
            return false;
        }
        try {
            java.lang.Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", java.lang.Class.class);
            cls.getMethod("arrayIndexScale", java.lang.Class.class);
            java.lang.Class<?> cls2 = java.lang.Long.TYPE;
            cls.getMethod("getInt", java.lang.Object.class, cls2);
            cls.getMethod("putInt", java.lang.Object.class, cls2, java.lang.Integer.TYPE);
            cls.getMethod("getLong", java.lang.Object.class, cls2);
            cls.getMethod("putLong", java.lang.Object.class, cls2, cls2);
            cls.getMethod("getObject", java.lang.Object.class, cls2);
            cls.getMethod("putObject", java.lang.Object.class, cls2, java.lang.Object.class);
            if (com.google.android.gms.internal.measurement.zzyv.zzsv()) {
                return true;
            }
            cls.getMethod("getByte", java.lang.Object.class, cls2);
            cls.getMethod("putByte", java.lang.Object.class, cls2, java.lang.Byte.TYPE);
            cls.getMethod("getBoolean", java.lang.Object.class, cls2);
            cls.getMethod("putBoolean", java.lang.Object.class, cls2, java.lang.Boolean.TYPE);
            cls.getMethod("getFloat", java.lang.Object.class, cls2);
            cls.getMethod("putFloat", java.lang.Object.class, cls2, java.lang.Float.TYPE);
            cls.getMethod("getDouble", java.lang.Object.class, cls2);
            cls.getMethod("putDouble", java.lang.Object.class, cls2, java.lang.Double.TYPE);
            return true;
        } catch (java.lang.Throwable th6) {
            java.util.logging.Logger logger2 = logger;
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.String valueOf = java.lang.String.valueOf(th6);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 71);
            sb6.append("platform method missing - proto runtime falling back to safer methods: ");
            sb6.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb6.toString());
            return false;
        }
    }

    private static boolean zzut() {
        sun.misc.Unsafe unsafe = zzbtj;
        if (unsafe == null) {
            return false;
        }
        try {
            java.lang.Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            java.lang.Class<?> cls2 = java.lang.Long.TYPE;
            cls.getMethod("getLong", java.lang.Object.class, cls2);
            if (zzuu() == null) {
                return false;
            }
            if (com.google.android.gms.internal.measurement.zzyv.zzsv()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, java.lang.Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, java.lang.Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", java.lang.Object.class, cls2, java.lang.Object.class, cls2, cls2);
            return true;
        } catch (java.lang.Throwable th6) {
            java.util.logging.Logger logger2 = logger;
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.String valueOf = java.lang.String.valueOf(th6);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 71);
            sb6.append("platform method missing - proto runtime falling back to safer methods: ");
            sb6.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb6.toString());
            return false;
        }
    }

    private static java.lang.reflect.Field zzuu() {
        java.lang.reflect.Field zza2;
        if (com.google.android.gms.internal.measurement.zzyv.zzsv() && (zza2 = zza(java.nio.Buffer.class, "effectiveDirectAddress")) != null) {
            return zza2;
        }
        java.lang.reflect.Field zza3 = zza(java.nio.Buffer.class, "address");
        if (zza3 == null || zza3.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return zza3;
    }

    private static java.lang.reflect.Field zza(java.lang.Class<?> cls, java.lang.String str) {
        try {
            java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
