package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzep {
    final java.lang.String name;
    private final java.lang.String origin;
    final long timestamp;
    final long zzafp;
    final com.google.android.gms.internal.measurement.zzer zzafq;
    final java.lang.String zzti;

    public zzep(com.google.android.gms.internal.measurement.zzgl zzglVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, long j18, android.os.Bundle bundle) {
        com.google.android.gms.internal.measurement.zzer zzerVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
        this.zzti = str2;
        this.name = str3;
        this.origin = android.text.TextUtils.isEmpty(str) ? null : str;
        this.timestamp = j17;
        this.zzafp = j18;
        if (j18 != 0 && j18 > j17) {
            zzglVar.zzge().zzip().zzg("Event created with reverse previous/current timestamps. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzerVar = new com.google.android.gms.internal.measurement.zzer(new android.os.Bundle());
        } else {
            android.os.Bundle bundle2 = new android.os.Bundle(bundle);
            java.util.Iterator<java.lang.String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                if (next == null) {
                    zzglVar.zzge().zzim().log("Param name can't be null");
                } else {
                    java.lang.Object zzh = zzglVar.zzgb().zzh(next, bundle2.get(next));
                    if (zzh == null) {
                        zzglVar.zzge().zzip().zzg("Param value can't be null", zzglVar.zzga().zzbk(next));
                    } else {
                        zzglVar.zzgb().zza(bundle2, next, zzh);
                    }
                }
                it.remove();
            }
            zzerVar = new com.google.android.gms.internal.measurement.zzer(bundle2);
        }
        this.zzafq = zzerVar;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zzti;
        java.lang.String str2 = this.name;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzafq);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 33 + java.lang.String.valueOf(str2).length() + valueOf.length());
        sb6.append("Event{appId='");
        sb6.append(str);
        sb6.append("', name='");
        sb6.append(str2);
        sb6.append("', params=");
        sb6.append(valueOf);
        sb6.append('}');
        return sb6.toString();
    }

    public final com.google.android.gms.internal.measurement.zzep zza(com.google.android.gms.internal.measurement.zzgl zzglVar, long j17) {
        return new com.google.android.gms.internal.measurement.zzep(zzglVar, this.origin, this.zzti, this.name, this.timestamp, j17, this.zzafq);
    }

    private zzep(com.google.android.gms.internal.measurement.zzgl zzglVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, long j18, com.google.android.gms.internal.measurement.zzer zzerVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzerVar);
        this.zzti = str2;
        this.name = str3;
        this.origin = android.text.TextUtils.isEmpty(str) ? null : str;
        this.timestamp = j17;
        this.zzafp = j18;
        if (j18 != 0 && j18 > j17) {
            zzglVar.zzge().zzip().zze("Event created with reverse previous/current timestamps. appId, name", com.google.android.gms.internal.measurement.zzfg.zzbm(str2), com.google.android.gms.internal.measurement.zzfg.zzbm(str3));
        }
        this.zzafq = zzerVar;
    }
}
