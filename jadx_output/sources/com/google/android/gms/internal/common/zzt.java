package com.google.android.gms.internal.common;

/* loaded from: classes13.dex */
final class zzt extends com.google.android.gms.internal.common.zzw {
    final /* synthetic */ com.google.android.gms.internal.common.zzu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(com.google.android.gms.internal.common.zzu zzuVar, com.google.android.gms.internal.common.zzx zzxVar, java.lang.CharSequence charSequence) {
        super(zzxVar, charSequence);
        this.zza = zzuVar;
    }

    @Override // com.google.android.gms.internal.common.zzw
    public final int zzc(int i17) {
        return i17 + 1;
    }

    @Override // com.google.android.gms.internal.common.zzw
    public final int zzd(int i17) {
        java.lang.CharSequence charSequence = ((com.google.android.gms.internal.common.zzw) this).zzb;
        int length = charSequence.length();
        com.google.android.gms.internal.common.zzs.zzb(i17, length, ya.b.INDEX);
        while (i17 < length) {
            com.google.android.gms.internal.common.zzu zzuVar = this.zza;
            if (zzuVar.zza.zza(charSequence.charAt(i17))) {
                return i17;
            }
            i17++;
        }
        return -1;
    }
}
