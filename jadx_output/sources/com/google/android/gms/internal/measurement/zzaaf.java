package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzaaf implements com.google.android.gms.internal.measurement.zzaak {
    private com.google.android.gms.internal.measurement.zzaak[] zzbtf;

    public zzaaf(com.google.android.gms.internal.measurement.zzaak... zzaakVarArr) {
        this.zzbtf = zzaakVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzaak
    public final boolean zzd(java.lang.Class<?> cls) {
        for (com.google.android.gms.internal.measurement.zzaak zzaakVar : this.zzbtf) {
            if (zzaakVar.zzd(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzaak
    public final com.google.android.gms.internal.measurement.zzaaj zze(java.lang.Class<?> cls) {
        for (com.google.android.gms.internal.measurement.zzaak zzaakVar : this.zzbtf) {
            if (zzaakVar.zzd(cls)) {
                return zzaakVar.zze(cls);
            }
        }
        java.lang.String name = cls.getName();
        throw new java.lang.UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new java.lang.String("No factory is available for message type: "));
    }
}
