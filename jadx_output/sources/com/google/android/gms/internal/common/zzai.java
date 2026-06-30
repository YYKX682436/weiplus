package com.google.android.gms.internal.common;

/* JADX INFO: Access modifiers changed from: package-private */
@org.jspecify.nullness.NullMarked
/* loaded from: classes13.dex */
public final class zzai extends com.google.android.gms.internal.common.zzag {
    static final com.google.android.gms.internal.common.zzag zza = new com.google.android.gms.internal.common.zzai(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    public zzai(java.lang.Object[] objArr, int i17) {
        this.zzb = objArr;
        this.zzc = i17;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i17) {
        com.google.android.gms.internal.common.zzs.zza(i17, this.zzc, ya.b.INDEX);
        java.lang.Object obj = this.zzb[i17];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzag, com.google.android.gms.internal.common.zzac
    public final int zza(java.lang.Object[] objArr, int i17) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final java.lang.Object[] zzg() {
        return this.zzb;
    }
}
