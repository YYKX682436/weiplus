package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
final class zzm extends com.google.android.gms.auth.api.signin.internal.zzd {
    private final /* synthetic */ com.google.android.gms.auth.api.signin.internal.zzl zzey;

    public zzm(com.google.android.gms.auth.api.signin.internal.zzl zzlVar) {
        this.zzey = zzlVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzd, com.google.android.gms.auth.api.signin.internal.zzt
    public final void zzg(com.google.android.gms.common.api.Status status) {
        this.zzey.setResult((com.google.android.gms.auth.api.signin.internal.zzl) status);
    }
}
