package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* loaded from: classes13.dex */
abstract class zza extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzc {
    public final int zza;
    public final android.os.Bundle zzb;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687, int i17, android.os.Bundle bundle) {
        super(abstractC1900x418ca687, java.lang.Boolean.TRUE);
        this.zzc = abstractC1900x418ca687;
        this.zza = i17;
        this.zzb = bundle;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzc
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        if (this.zza != 0) {
            this.zzc.zzp(1, null);
            android.os.Bundle bundle = this.zzb;
            zzb(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(this.zza, bundle != null ? (android.app.PendingIntent) bundle.getParcelable(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.f5929xa3daf464) : null));
        } else {
            if (zzd()) {
                return;
            }
            this.zzc.zzp(1, null);
            zzb(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(8, null));
        }
    }

    public abstract void zzb(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb);

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzc
    public final void zzc() {
    }

    public abstract boolean zzd();
}
