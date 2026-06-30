package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public final class zzbh extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.internal.auth.zzbk> {
    private final android.os.Bundle zzcf;

    public zzbh(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.auth.api.zzh zzhVar, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 16, clientSettings, connectionCallbacks, onConnectionFailedListener);
        if (zzhVar != null) {
            throw new java.lang.NoSuchMethodError();
        }
        this.zzcf = new android.os.Bundle();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof com.google.android.gms.internal.auth.zzbk ? (com.google.android.gms.internal.auth.zzbk) queryLocalInterface : new com.google.android.gms.internal.auth.zzbl(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.os.Bundle getGetServiceRequestExtraArgs() {
        return this.zzcf;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        com.google.android.gms.common.internal.ClientSettings clientSettings = getClientSettings();
        return (android.text.TextUtils.isEmpty(clientSettings.getAccountName()) || clientSettings.getApplicableScopes(com.google.android.gms.auth.api.zzf.API).isEmpty()) ? false : true;
    }
}
