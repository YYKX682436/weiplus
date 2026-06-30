package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzgn extends com.google.android.gms.internal.measurement.zzez {
    private final com.google.android.gms.internal.measurement.zzjr zzajp;
    private java.lang.Boolean zzanc;
    private java.lang.String zzand;

    public zzgn(com.google.android.gms.internal.measurement.zzjr zzjrVar) {
        this(zzjrVar, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zzb(com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        zzb(zzdzVar, false);
        zze(new com.google.android.gms.internal.measurement.zzgo(this, zzdzVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final java.lang.String zzc(com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        zzb(zzdzVar, false);
        return this.zzajp.zzh(zzdzVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zzd(com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        zzc(zzdzVar.packageName, false);
        zze(new com.google.android.gms.internal.measurement.zzgx(this, zzdzVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final java.util.List<com.google.android.gms.internal.measurement.zzed> zze(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        zzc(str, true);
        try {
            return (java.util.List) this.zzajp.zzgd().zzb(new com.google.android.gms.internal.measurement.zzgw(this, str, str2, str3)).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            this.zzajp.zzge().zzim().zzg("Failed to get conditional user properties", e17);
            return java.util.Collections.emptyList();
        }
    }

    private zzgn(com.google.android.gms.internal.measurement.zzjr zzjrVar, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjrVar);
        this.zzajp = zzjrVar;
        this.zzand = null;
    }

    private final void zzb(com.google.android.gms.internal.measurement.zzdz zzdzVar, boolean z17) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzdzVar);
        zzc(zzdzVar.packageName, false);
        this.zzajp.zzgb().zzcg(zzdzVar.zzadm);
    }

    private final void zzc(java.lang.String str, boolean z17) {
        boolean z18;
        if (android.text.TextUtils.isEmpty(str)) {
            this.zzajp.zzge().zzim().log("Measurement Service called without app package");
            throw new java.lang.SecurityException("Measurement Service called without app package");
        }
        if (z17) {
            try {
                if (this.zzanc == null) {
                    if (!"com.google.android.gms".equals(this.zzand) && !com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(this.zzajp.getContext(), android.os.Binder.getCallingUid()) && !com.google.android.gms.common.GoogleSignatureVerifier.getInstance(this.zzajp.getContext()).isUidGoogleSigned(android.os.Binder.getCallingUid())) {
                        z18 = false;
                        this.zzanc = java.lang.Boolean.valueOf(z18);
                    }
                    z18 = true;
                    this.zzanc = java.lang.Boolean.valueOf(z18);
                }
                if (this.zzanc.booleanValue()) {
                    return;
                }
            } catch (java.lang.SecurityException e17) {
                this.zzajp.zzge().zzim().zzg("Measurement Service called with invalid calling package. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str));
                throw e17;
            }
        }
        if (this.zzand == null && com.google.android.gms.common.GooglePlayServicesUtilLight.uidHasPackageName(this.zzajp.getContext(), android.os.Binder.getCallingUid(), str)) {
            this.zzand = str;
        }
        if (str.equals(this.zzand)) {
        } else {
            throw new java.lang.SecurityException(java.lang.String.format("Unknown calling package name '%s'.", str));
        }
    }

    private final void zze(java.lang.Runnable runnable) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        if (com.google.android.gms.internal.measurement.zzew.zzaia.get().booleanValue() && this.zzajp.zzgd().zzjk()) {
            runnable.run();
        } else {
            this.zzajp.zzgd().zzc(runnable);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final java.util.List<com.google.android.gms.internal.measurement.zzjx> zza(com.google.android.gms.internal.measurement.zzdz zzdzVar, boolean z17) {
        zzb(zzdzVar, false);
        try {
            java.util.List<com.google.android.gms.internal.measurement.zzjz> list = (java.util.List) this.zzajp.zzgd().zzb(new com.google.android.gms.internal.measurement.zzhd(this, zzdzVar)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.google.android.gms.internal.measurement.zzjz zzjzVar : list) {
                if (z17 || !com.google.android.gms.internal.measurement.zzka.zzci(zzjzVar.name)) {
                    arrayList.add(new com.google.android.gms.internal.measurement.zzjx(zzjzVar));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            this.zzajp.zzge().zzim().zze("Failed to get user attributes. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(zzdzVar.packageName), e17);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final java.util.List<com.google.android.gms.internal.measurement.zzed> zza(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        zzb(zzdzVar, false);
        try {
            return (java.util.List) this.zzajp.zzgd().zzb(new com.google.android.gms.internal.measurement.zzgv(this, zzdzVar, str, str2)).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            this.zzajp.zzge().zzim().zzg("Failed to get conditional user properties", e17);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zzb(com.google.android.gms.internal.measurement.zzed zzedVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzedVar);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzedVar.zzaep);
        zzc(zzedVar.packageName, true);
        com.google.android.gms.internal.measurement.zzed zzedVar2 = new com.google.android.gms.internal.measurement.zzed(zzedVar);
        zze(zzedVar.zzaep.getValue() == null ? new com.google.android.gms.internal.measurement.zzgr(this, zzedVar2) : new com.google.android.gms.internal.measurement.zzgs(this, zzedVar2));
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final java.util.List<com.google.android.gms.internal.measurement.zzjx> zza(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        zzc(str, true);
        try {
            java.util.List<com.google.android.gms.internal.measurement.zzjz> list = (java.util.List) this.zzajp.zzgd().zzb(new com.google.android.gms.internal.measurement.zzgu(this, str, str2, str3)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.google.android.gms.internal.measurement.zzjz zzjzVar : list) {
                if (z17 || !com.google.android.gms.internal.measurement.zzka.zzci(zzjzVar.name)) {
                    arrayList.add(new com.google.android.gms.internal.measurement.zzjx(zzjzVar));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            this.zzajp.zzge().zzim().zze("Failed to get user attributes. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e17);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final java.util.List<com.google.android.gms.internal.measurement.zzjx> zza(java.lang.String str, java.lang.String str2, boolean z17, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        zzb(zzdzVar, false);
        try {
            java.util.List<com.google.android.gms.internal.measurement.zzjz> list = (java.util.List) this.zzajp.zzgd().zzb(new com.google.android.gms.internal.measurement.zzgt(this, zzdzVar, str, str2)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.google.android.gms.internal.measurement.zzjz zzjzVar : list) {
                if (z17 || !com.google.android.gms.internal.measurement.zzka.zzci(zzjzVar.name)) {
                    arrayList.add(new com.google.android.gms.internal.measurement.zzjx(zzjzVar));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            this.zzajp.zzge().zzim().zze("Failed to get user attributes. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(zzdzVar.packageName), e17);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zza(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        zze(new com.google.android.gms.internal.measurement.zzhf(this, str2, str3, str, j17));
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zza(com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        zzb(zzdzVar, false);
        zze(new com.google.android.gms.internal.measurement.zzhe(this, zzdzVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zza(com.google.android.gms.internal.measurement.zzed zzedVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzedVar);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzedVar.zzaep);
        zzb(zzdzVar, false);
        com.google.android.gms.internal.measurement.zzed zzedVar2 = new com.google.android.gms.internal.measurement.zzed(zzedVar);
        zzedVar2.packageName = zzdzVar.packageName;
        zze(zzedVar.zzaep.getValue() == null ? new com.google.android.gms.internal.measurement.zzgp(this, zzedVar2, zzdzVar) : new com.google.android.gms.internal.measurement.zzgq(this, zzedVar2, zzdzVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zza(com.google.android.gms.internal.measurement.zzeu zzeuVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzeuVar);
        zzb(zzdzVar, false);
        zze(new com.google.android.gms.internal.measurement.zzgy(this, zzeuVar, zzdzVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zza(com.google.android.gms.internal.measurement.zzeu zzeuVar, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzeuVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzc(str, true);
        zze(new com.google.android.gms.internal.measurement.zzgz(this, zzeuVar, str));
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zza(com.google.android.gms.internal.measurement.zzjx zzjxVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjxVar);
        zzb(zzdzVar, false);
        zze(zzjxVar.getValue() == null ? new com.google.android.gms.internal.measurement.zzhb(this, zzjxVar, zzdzVar) : new com.google.android.gms.internal.measurement.zzhc(this, zzjxVar, zzdzVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final byte[] zza(com.google.android.gms.internal.measurement.zzeu zzeuVar, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzeuVar);
        zzc(str, true);
        this.zzajp.zzge().zzis().zzg("Log and bundle. event", this.zzajp.zzga().zzbj(zzeuVar.name));
        long nanoTime = this.zzajp.zzbt().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zzajp.zzgd().zzc(new com.google.android.gms.internal.measurement.zzha(this, zzeuVar, str)).get();
            if (bArr == null) {
                this.zzajp.zzge().zzim().zzg("Log and bundle returned null. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str));
                bArr = new byte[0];
            }
            this.zzajp.zzge().zzis().zzd("Log and bundle processed. event, size, time_ms", this.zzajp.zzga().zzbj(zzeuVar.name), java.lang.Integer.valueOf(bArr.length), java.lang.Long.valueOf((this.zzajp.zzbt().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            this.zzajp.zzge().zzim().zzd("Failed to log and bundle. appId, event, error", com.google.android.gms.internal.measurement.zzfg.zzbm(str), this.zzajp.zzga().zzbj(zzeuVar.name), e17);
            return null;
        }
    }
}
