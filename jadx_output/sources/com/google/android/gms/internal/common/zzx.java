package com.google.android.gms.internal.common;

@org.jspecify.nullness.NullMarked
/* loaded from: classes13.dex */
public final class zzx {
    private final com.google.android.gms.internal.common.zzo zza;
    private final boolean zzb;
    private final com.google.android.gms.internal.common.zzu zzc;

    private zzx(com.google.android.gms.internal.common.zzu zzuVar, boolean z17, com.google.android.gms.internal.common.zzo zzoVar, int i17) {
        this.zzc = zzuVar;
        this.zzb = z17;
        this.zza = zzoVar;
    }

    public static com.google.android.gms.internal.common.zzx zzc(com.google.android.gms.internal.common.zzo zzoVar) {
        return new com.google.android.gms.internal.common.zzx(new com.google.android.gms.internal.common.zzu(zzoVar), false, com.google.android.gms.internal.common.zzn.zza, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Iterator zzh(java.lang.CharSequence charSequence) {
        return new com.google.android.gms.internal.common.zzt(this.zzc, this, charSequence);
    }

    public final com.google.android.gms.internal.common.zzx zzb() {
        return new com.google.android.gms.internal.common.zzx(this.zzc, true, this.zza, Integer.MAX_VALUE);
    }

    public final java.lang.Iterable zzd(java.lang.CharSequence charSequence) {
        return new com.google.android.gms.internal.common.zzv(this, charSequence);
    }

    public final java.util.List zzf(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.util.Iterator zzh = zzh(charSequence);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (zzh.hasNext()) {
            arrayList.add((java.lang.String) zzh.next());
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }
}
