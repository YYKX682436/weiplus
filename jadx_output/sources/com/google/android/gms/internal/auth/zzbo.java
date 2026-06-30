package com.google.android.gms.internal.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzbo extends com.google.android.gms.internal.auth.zzbm {
    private final /* synthetic */ com.google.android.gms.auth.api.proxy.ProxyRequest zzec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbo(com.google.android.gms.internal.auth.zzbn zzbnVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest) {
        super(googleApiClient);
        this.zzec = proxyRequest;
    }

    @Override // com.google.android.gms.internal.auth.zzbm
    public final void zzd(android.content.Context context, com.google.android.gms.internal.auth.zzbk zzbkVar) {
        zzbkVar.zzd(new com.google.android.gms.internal.auth.zzbp(this), this.zzec);
    }
}
