package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
final class zzbp extends com.google.android.gms.internal.auth.zzbg {
    private final /* synthetic */ com.google.android.gms.internal.auth.zzbo zzed;

    public zzbp(com.google.android.gms.internal.auth.zzbo zzboVar) {
        this.zzed = zzboVar;
    }

    @Override // com.google.android.gms.internal.auth.zzbg, com.google.android.gms.internal.auth.zzbi
    public final void zzd(com.google.android.gms.auth.api.proxy.ProxyResponse proxyResponse) {
        this.zzed.setResult((com.google.android.gms.internal.auth.zzbo) new com.google.android.gms.internal.auth.zzbq(proxyResponse));
    }
}
