package com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15;

/* loaded from: classes13.dex */
final class zzl implements com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy {
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy
    /* renamed from: selectModule */
    public final com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy.SelectionResult mo18694x6f1b1a88(android.content.Context context, java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy.IVersions iVersions) {
        int zzb;
        com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy.SelectionResult selectionResult = new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy.SelectionResult();
        int zza = iVersions.zza(context, str);
        selectionResult.f6024xbf9cb6ed = zza;
        int i17 = 1;
        int i18 = 0;
        if (zza != 0) {
            zzb = iVersions.zzb(context, str, false);
            selectionResult.f6025x33ae01b2 = zzb;
        } else {
            zzb = iVersions.zzb(context, str, true);
            selectionResult.f6025x33ae01b2 = zzb;
        }
        int i19 = selectionResult.f6024xbf9cb6ed;
        if (i19 != 0) {
            i18 = i19;
        } else if (zzb == 0) {
            i17 = 0;
            selectionResult.f6026x99b8718c = i17;
            return selectionResult;
        }
        if (zzb < i18) {
            i17 = -1;
        }
        selectionResult.f6026x99b8718c = i17;
        return selectionResult;
    }
}
