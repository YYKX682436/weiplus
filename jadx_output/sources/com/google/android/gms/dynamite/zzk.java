package com.google.android.gms.dynamite;

/* loaded from: classes13.dex */
final class zzk implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions iVersions) {
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectionResult = new com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.localVersion = iVersions.zza(context, str);
        int i17 = 1;
        int zzb = iVersions.zzb(context, str, true);
        selectionResult.remoteVersion = zzb;
        int i18 = selectionResult.localVersion;
        if (i18 == 0) {
            i18 = 0;
            if (zzb == 0) {
                i17 = 0;
                selectionResult.selection = i17;
                return selectionResult;
            }
        }
        if (zzb < i18) {
            i17 = -1;
        }
        selectionResult.selection = i17;
        return selectionResult;
    }
}
