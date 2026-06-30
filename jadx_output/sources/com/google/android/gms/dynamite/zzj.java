package com.google.android.gms.dynamite;

/* loaded from: classes13.dex */
final class zzj implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions iVersions) {
        int zzb;
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectionResult = new com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult();
        int zza = iVersions.zza(context, str);
        selectionResult.localVersion = zza;
        int i17 = 1;
        int i18 = 0;
        if (zza != 0) {
            zzb = iVersions.zzb(context, str, false);
            selectionResult.remoteVersion = zzb;
        } else {
            zzb = iVersions.zzb(context, str, true);
            selectionResult.remoteVersion = zzb;
        }
        int i19 = selectionResult.localVersion;
        if (i19 != 0) {
            i18 = i19;
        } else if (zzb == 0) {
            i17 = 0;
            selectionResult.selection = i17;
            return selectionResult;
        }
        if (i18 >= zzb) {
            i17 = -1;
        }
        selectionResult.selection = i17;
        return selectionResult;
    }
}
