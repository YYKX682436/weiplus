package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzaat {
    private static final com.google.android.gms.internal.measurement.zzaat zzbtq = new com.google.android.gms.internal.measurement.zzaat();
    private final com.google.android.gms.internal.measurement.zzaaw zzbtr;
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.android.gms.internal.measurement.zzaav<?>> zzbts = new java.util.concurrent.ConcurrentHashMap();

    private zzaat() {
        java.lang.String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        com.google.android.gms.internal.measurement.zzaaw zzaawVar = null;
        for (int i17 = 0; i17 <= 0; i17++) {
            zzaawVar = zzfl(strArr[0]);
            if (zzaawVar != null) {
                break;
            }
        }
        this.zzbtr = zzaawVar == null ? new com.google.android.gms.internal.measurement.zzaad() : zzaawVar;
    }

    private static com.google.android.gms.internal.measurement.zzaaw zzfl(java.lang.String str) {
        try {
            return (com.google.android.gms.internal.measurement.zzaaw) java.lang.Class.forName(str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static com.google.android.gms.internal.measurement.zzaat zzud() {
        return zzbtq;
    }

    public final <T> com.google.android.gms.internal.measurement.zzaav<T> zzt(T t17) {
        java.lang.Class<?> cls = t17.getClass();
        com.google.android.gms.internal.measurement.zzzr.zza(cls, "messageType");
        com.google.android.gms.internal.measurement.zzaav<T> zzaavVar = (com.google.android.gms.internal.measurement.zzaav) this.zzbts.get(cls);
        if (zzaavVar != null) {
            return zzaavVar;
        }
        com.google.android.gms.internal.measurement.zzaav<T> zzg = this.zzbtr.zzg(cls);
        com.google.android.gms.internal.measurement.zzzr.zza(cls, "messageType");
        com.google.android.gms.internal.measurement.zzzr.zza(zzg, "schema");
        com.google.android.gms.internal.measurement.zzaav<T> zzaavVar2 = (com.google.android.gms.internal.measurement.zzaav) this.zzbts.putIfAbsent(cls, zzg);
        return zzaavVar2 != null ? zzaavVar2 : zzg;
    }
}
