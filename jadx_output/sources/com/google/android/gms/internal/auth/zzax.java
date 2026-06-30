package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public final class zzax extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.internal.auth.zzbc> {
    private final com.google.android.gms.auth.api.Auth.AuthCredentialsOptions zzdv;

    public zzax(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authCredentialsOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzdv = authCredentialsOptions;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof com.google.android.gms.internal.auth.zzbc ? (com.google.android.gms.internal.auth.zzbc) queryLocalInterface : new com.google.android.gms.internal.auth.zzbd(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.os.Bundle getGetServiceRequestExtraArgs() {
        com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authCredentialsOptions = this.zzdv;
        return authCredentialsOptions == null ? new android.os.Bundle() : authCredentialsOptions.toBundle();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    public final com.google.android.gms.auth.api.Auth.AuthCredentialsOptions zzk() {
        return this.zzdv;
    }
}
