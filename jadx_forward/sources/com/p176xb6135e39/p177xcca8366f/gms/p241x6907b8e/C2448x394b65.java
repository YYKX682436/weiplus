package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.zzaf */
/* loaded from: classes13.dex */
public final class C2448x394b65<T> implements com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2447x394b64<T> {
    private final java.lang.Object zza = new java.lang.Object();
    private final int zzb;
    private final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private java.lang.Exception zzg;
    private boolean zzh;

    public C2448x394b65(int i17, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar) {
        this.zzb = i17;
        this.zzc = zzwVar;
    }

    private final void zza() {
        if (this.zzd + this.zze + this.zzf == this.zzb) {
            if (this.zzg == null) {
                if (this.zzh) {
                    this.zzc.zzc();
                    return;
                } else {
                    this.zzc.zzb(null);
                    return;
                }
            }
            this.zzc.zza(new java.util.concurrent.ExecutionException(this.zze + " out of " + this.zzb + " underlying tasks failed", this.zzg));
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2432x2aa8748c
    /* renamed from: onCanceled */
    public final void mo19574x9dc2a798() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2434xb321c05f
    /* renamed from: onFailure */
    public final void mo19575xee232ab(java.lang.Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2435xce0545d8
    /* renamed from: onSuccess */
    public final void mo19576xe05b4124(T t17) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}
