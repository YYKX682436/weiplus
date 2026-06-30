package com.google.android.gms.auth.api;

/* loaded from: classes13.dex */
public final class zzf {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.zzh> API;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzbh> zzas;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzbh, com.google.android.gms.auth.api.zzh> zzat;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzbh> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zzas = clientKey;
        com.google.android.gms.auth.api.zzg zzgVar = new com.google.android.gms.auth.api.zzg();
        zzat = zzgVar;
        API = new com.google.android.gms.common.api.Api<>("Auth.PROXY_API", zzgVar, clientKey);
    }
}
