package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
final class zzo extends com.google.android.gms.auth.api.signin.internal.zzd {
    private final /* synthetic */ com.google.android.gms.auth.api.signin.internal.zzn zzez;

    public zzo(com.google.android.gms.auth.api.signin.internal.zzn zznVar) {
        this.zzez = zznVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzd, com.google.android.gms.auth.api.signin.internal.zzt
    public final void zzh(com.google.android.gms.common.api.Status status) {
        this.zzez.setResult((com.google.android.gms.auth.api.signin.internal.zzn) status);
    }
}
