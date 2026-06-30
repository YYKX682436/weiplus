package com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15;

/* loaded from: classes13.dex */
final class zzh implements com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy {
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy
    /* renamed from: selectModule */
    public final com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy.SelectionResult mo18694x6f1b1a88(android.content.Context context, java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy.IVersions iVersions) {
        com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy.SelectionResult selectionResult = new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy.SelectionResult();
        int zzb = iVersions.zzb(context, str, false);
        selectionResult.f6025x33ae01b2 = zzb;
        selectionResult.f6026x99b8718c = zzb != 0 ? 1 : 0;
        return selectionResult;
    }
}
