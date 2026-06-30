package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzd implements com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq {
    private final java.util.concurrent.Executor zza;
    private final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2429xdcb5ca57 zzb;
    private final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzc;

    public zzd(java.util.concurrent.Executor executor, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2429xdcb5ca57 interfaceC2429xdcb5ca57, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar) {
        this.zza = executor;
        this.zzb = interfaceC2429xdcb5ca57;
        this.zzc = zzwVar;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq
    public final void zzc() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq
    public final void zzd(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 abstractC2439x27a9a5) {
        this.zza.execute(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzc(this, abstractC2439x27a9a5));
    }
}
