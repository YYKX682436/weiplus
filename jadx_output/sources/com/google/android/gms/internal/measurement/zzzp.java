package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzzp implements com.google.android.gms.internal.measurement.zzaak {
    private static final com.google.android.gms.internal.measurement.zzzp zzbrx = new com.google.android.gms.internal.measurement.zzzp();

    private zzzp() {
    }

    public static com.google.android.gms.internal.measurement.zzzp zztl() {
        return zzbrx;
    }

    @Override // com.google.android.gms.internal.measurement.zzaak
    public final boolean zzd(java.lang.Class<?> cls) {
        return com.google.android.gms.internal.measurement.zzzq.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zzaak
    public final com.google.android.gms.internal.measurement.zzaaj zze(java.lang.Class<?> cls) {
        if (!com.google.android.gms.internal.measurement.zzzq.class.isAssignableFrom(cls)) {
            java.lang.String name = cls.getName();
            throw new java.lang.IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new java.lang.String("Unsupported message type: "));
        }
        try {
            return (com.google.android.gms.internal.measurement.zzaaj) com.google.android.gms.internal.measurement.zzzq.zzf(cls.asSubclass(com.google.android.gms.internal.measurement.zzzq.class)).zza(3, (java.lang.Object) null, (java.lang.Object) null);
        } catch (java.lang.Exception e17) {
            java.lang.String name2 = cls.getName();
            throw new java.lang.RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new java.lang.String("Unable to get message info for "), e17);
        }
    }
}
