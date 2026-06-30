package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* loaded from: classes13.dex */
final class zzp<TResult, TContinuationResult> implements com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2435xce0545d8<TContinuationResult>, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2434xb321c05f, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2432x2aa8748c, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq {
    private final java.util.concurrent.Executor zza;
    private final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2438xddc7e5ba zzb;
    private final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzc;

    public zzp(java.util.concurrent.Executor executor, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2438xddc7e5ba interfaceC2438xddc7e5ba, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzw zzwVar) {
        this.zza = executor;
        this.zzb = interfaceC2438xddc7e5ba;
        this.zzc = zzwVar;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2432x2aa8748c
    /* renamed from: onCanceled */
    public final void mo19574x9dc2a798() {
        this.zzc.zzc();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2434xb321c05f
    /* renamed from: onFailure */
    public final void mo19575xee232ab(java.lang.Exception exc) {
        this.zzc.zza(exc);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2435xce0545d8
    /* renamed from: onSuccess */
    public final void mo19576xe05b4124(TContinuationResult tcontinuationresult) {
        this.zzc.zzb(tcontinuationresult);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq
    public final void zzc() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzq
    public final void zzd(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 abstractC2439x27a9a5) {
        this.zza.execute(new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.zzo(this, abstractC2439x27a9a5));
    }
}
