package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzjt implements com.google.android.gms.internal.measurement.zzfm {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzjr zzaqu;

    public zzjt(com.google.android.gms.internal.measurement.zzjr zzjrVar) {
        this.zzaqu = zzjrVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzfm
    public final void zza(java.lang.String str, int i17, java.lang.Throwable th6, byte[] bArr, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        this.zzaqu.zzb(str, i17, th6, bArr, map);
    }
}
