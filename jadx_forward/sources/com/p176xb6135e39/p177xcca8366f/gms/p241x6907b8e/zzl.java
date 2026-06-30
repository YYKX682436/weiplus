package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzl implements com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq {
    private final java.util.concurrent.Executor zza;
    private final java.lang.Object zzb = new java.lang.Object();
    private com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2434xb321c05f zzc;

    public zzl(java.util.concurrent.Executor executor, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2434xb321c05f interfaceC2434xb321c05f) {
        this.zza = executor;
        this.zzc = interfaceC2434xb321c05f;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq
    public final void zzc() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq
    public final void zzd(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 abstractC2439x27a9a5) {
        if (abstractC2439x27a9a5.mo19599x55b0a764() || abstractC2439x27a9a5.mo19597xc9602be3()) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzc == null) {
                return;
            }
            this.zza.execute(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzk(this, abstractC2439x27a9a5));
        }
    }
}
