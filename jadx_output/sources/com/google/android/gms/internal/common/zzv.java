package com.google.android.gms.internal.common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzv implements java.lang.Iterable {
    final /* synthetic */ java.lang.CharSequence zza;
    final /* synthetic */ com.google.android.gms.internal.common.zzx zzb;

    public zzv(com.google.android.gms.internal.common.zzx zzxVar, java.lang.CharSequence charSequence) {
        this.zzb = zzxVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.util.Iterator zzh;
        zzh = this.zzb.zzh(this.zza);
        return zzh;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append('[');
        java.util.Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb6.append(com.google.android.gms.internal.common.zzq.zza(it.next(), ", "));
                while (it.hasNext()) {
                    sb6.append((java.lang.CharSequence) ", ");
                    sb6.append(com.google.android.gms.internal.common.zzq.zza(it.next(), ", "));
                }
            }
            sb6.append(']');
            return sb6.toString();
        } catch (java.io.IOException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }
}
