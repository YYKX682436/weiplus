package com.google.android.gms.dynamite;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzo implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions {
    private final int zza;

    public zzo(int i17, int i18) {
        this.zza = i17;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zza(android.content.Context context, java.lang.String str) {
        return this.zza;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zzb(android.content.Context context, java.lang.String str, boolean z17) {
        return 0;
    }
}
