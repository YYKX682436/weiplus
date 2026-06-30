package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzaad implements com.google.android.gms.internal.measurement.zzaaw {
    private static final com.google.android.gms.internal.measurement.zzaak zzbte = new com.google.android.gms.internal.measurement.zzaae();
    private final com.google.android.gms.internal.measurement.zzaak zzbtd;

    public zzaad() {
        this(new com.google.android.gms.internal.measurement.zzaaf(com.google.android.gms.internal.measurement.zzzp.zztl(), zzts()));
    }

    private static boolean zza(com.google.android.gms.internal.measurement.zzaaj zzaajVar) {
        return zzaajVar.zztw() == com.google.android.gms.internal.measurement.zzzq.zzb.zzbsk;
    }

    private static com.google.android.gms.internal.measurement.zzaak zzts() {
        try {
            int i17 = com.google.protobuf.n0.f45331a;
            return (com.google.android.gms.internal.measurement.zzaak) com.google.protobuf.n0.class.getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return zzbte;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaw
    public final <T> com.google.android.gms.internal.measurement.zzaav<T> zzg(java.lang.Class<T> cls) {
        com.google.android.gms.internal.measurement.zzaax.zzh(cls);
        com.google.android.gms.internal.measurement.zzaaj zze = this.zzbtd.zze(cls);
        if (zze.zztx()) {
            return com.google.android.gms.internal.measurement.zzzq.class.isAssignableFrom(cls) ? com.google.android.gms.internal.measurement.zzaap.zza(com.google.android.gms.internal.measurement.zzaax.zzug(), com.google.android.gms.internal.measurement.zzzl.zztg(), zze.zzty()) : com.google.android.gms.internal.measurement.zzaap.zza(com.google.android.gms.internal.measurement.zzaax.zzue(), com.google.android.gms.internal.measurement.zzzl.zzth(), zze.zzty());
        }
        if (!com.google.android.gms.internal.measurement.zzzq.class.isAssignableFrom(cls)) {
            boolean zza = zza(zze);
            com.google.android.gms.internal.measurement.zzaaq zzua = com.google.android.gms.internal.measurement.zzaas.zzua();
            com.google.android.gms.internal.measurement.zzzz zztq = com.google.android.gms.internal.measurement.zzzz.zztq();
            return zza ? com.google.android.gms.internal.measurement.zzaao.zza(cls, zze, zzua, zztq, com.google.android.gms.internal.measurement.zzaax.zzue(), com.google.android.gms.internal.measurement.zzzl.zzth(), com.google.android.gms.internal.measurement.zzaai.zztt()) : com.google.android.gms.internal.measurement.zzaao.zza(cls, zze, zzua, zztq, com.google.android.gms.internal.measurement.zzaax.zzuf(), null, com.google.android.gms.internal.measurement.zzaai.zztt());
        }
        boolean zza2 = zza(zze);
        com.google.android.gms.internal.measurement.zzaaq zzub = com.google.android.gms.internal.measurement.zzaas.zzub();
        com.google.android.gms.internal.measurement.zzzz zztr = com.google.android.gms.internal.measurement.zzzz.zztr();
        com.google.android.gms.internal.measurement.zzabj<?, ?> zzug = com.google.android.gms.internal.measurement.zzaax.zzug();
        return zza2 ? com.google.android.gms.internal.measurement.zzaao.zza(cls, zze, zzub, zztr, zzug, com.google.android.gms.internal.measurement.zzzl.zztg(), com.google.android.gms.internal.measurement.zzaai.zztu()) : com.google.android.gms.internal.measurement.zzaao.zza(cls, zze, zzub, zztr, zzug, null, com.google.android.gms.internal.measurement.zzaai.zztu());
    }

    private zzaad(com.google.android.gms.internal.measurement.zzaak zzaakVar) {
        this.zzbtd = (com.google.android.gms.internal.measurement.zzaak) com.google.android.gms.internal.measurement.zzzr.zza(zzaakVar, "messageInfoFactory");
    }
}
