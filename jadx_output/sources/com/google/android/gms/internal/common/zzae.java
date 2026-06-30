package com.google.android.gms.internal.common;

/* loaded from: classes13.dex */
final class zzae extends com.google.android.gms.internal.common.zzz {
    private final com.google.android.gms.internal.common.zzag zza;

    public zzae(com.google.android.gms.internal.common.zzag zzagVar, int i17) {
        super(zzagVar.size(), i17);
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final java.lang.Object zza(int i17) {
        return this.zza.get(i17);
    }
}
