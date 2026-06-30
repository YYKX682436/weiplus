package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
final class zzp extends com.google.android.gms.internal.auth.zzq {
    private final /* synthetic */ com.google.android.gms.internal.auth.zzo zzai;

    public zzp(com.google.android.gms.internal.auth.zzo zzoVar) {
        this.zzai = zzoVar;
    }

    @Override // com.google.android.gms.internal.auth.zzq, com.google.android.gms.auth.account.zzd
    public final void zzd(boolean z17) {
        this.zzai.setResult((com.google.android.gms.internal.auth.zzo) new com.google.android.gms.internal.auth.zzt(z17 ? com.google.android.gms.common.api.Status.RESULT_SUCCESS : com.google.android.gms.internal.auth.zzk.zzaf));
    }
}
