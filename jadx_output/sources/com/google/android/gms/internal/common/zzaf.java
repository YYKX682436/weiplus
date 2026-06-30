package com.google.android.gms.internal.common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzaf extends com.google.android.gms.internal.common.zzag {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.common.zzag zzc;

    public zzaf(com.google.android.gms.internal.common.zzag zzagVar, int i17, int i18) {
        this.zzc = zzagVar;
        this.zza = i17;
        this.zzb = i18;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i17) {
        com.google.android.gms.internal.common.zzs.zza(i17, this.zzb, ya.b.INDEX);
        return this.zzc.get(i17 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final java.lang.Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.common.zzag subList(int i17, int i18) {
        com.google.android.gms.internal.common.zzs.zzc(i17, i18, this.zzb);
        int i19 = this.zza;
        return this.zzc.subList(i17 + i19, i18 + i19);
    }
}
