package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzaax {
    private static final java.lang.Class<?> zzbtt = zzuh();
    private static final com.google.android.gms.internal.measurement.zzabj<?, ?> zzbtu = zzu(false);
    private static final com.google.android.gms.internal.measurement.zzabj<?, ?> zzbtv = zzu(true);
    private static final com.google.android.gms.internal.measurement.zzabj<?, ?> zzbtw = new com.google.android.gms.internal.measurement.zzabl();

    public static void zzh(java.lang.Class<?> cls) {
        java.lang.Class<?> cls2;
        if (!com.google.android.gms.internal.measurement.zzzq.class.isAssignableFrom(cls) && (cls2 = zzbtt) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    private static com.google.android.gms.internal.measurement.zzabj<?, ?> zzu(boolean z17) {
        try {
            java.lang.Class<?> zzui = zzui();
            if (zzui == null) {
                return null;
            }
            return (com.google.android.gms.internal.measurement.zzabj) zzui.getConstructor(java.lang.Boolean.TYPE).newInstance(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static com.google.android.gms.internal.measurement.zzabj<?, ?> zzue() {
        return zzbtu;
    }

    public static com.google.android.gms.internal.measurement.zzabj<?, ?> zzuf() {
        return zzbtv;
    }

    public static com.google.android.gms.internal.measurement.zzabj<?, ?> zzug() {
        return zzbtw;
    }

    private static java.lang.Class<?> zzuh() {
        try {
            int i17 = com.google.protobuf.f5.f45077d;
            return com.google.protobuf.f5.class;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.Class<?> zzui() {
        return com.google.protobuf.za.class;
    }
}
