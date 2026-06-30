package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* loaded from: classes13.dex */
final class zzh implements com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq {
    private final java.util.concurrent.Executor zza;
    private final java.lang.Object zzb = new java.lang.Object();
    private com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2432x2aa8748c zzc;

    public zzh(java.util.concurrent.Executor executor, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2432x2aa8748c interfaceC2432x2aa8748c) {
        this.zza = executor;
        this.zzc = interfaceC2432x2aa8748c;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq
    public final void zzc() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq
    public final void zzd(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 abstractC2439x27a9a5) {
        if (abstractC2439x27a9a5.mo19597xc9602be3()) {
            synchronized (this.zzb) {
                if (this.zzc == null) {
                    return;
                }
                this.zza.execute(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzg(this));
            }
        }
    }
}
