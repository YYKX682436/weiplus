package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
public final class zzh extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.auth.api.signin.internal.zzv> {
    private final com.google.android.gms.auth.api.signin.GoogleSignInOptions zzev;

    public zzh(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, clientSettings, connectionCallbacks, onConnectionFailedListener);
        googleSignInOptions = googleSignInOptions == null ? new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder().build() : googleSignInOptions;
        if (!clientSettings.getAllRequestedScopes().isEmpty()) {
            com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder builder = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder(googleSignInOptions);
            java.util.Iterator<com.google.android.gms.common.api.Scope> it = clientSettings.getAllRequestedScopes().iterator();
            while (it.hasNext()) {
                builder.requestScopes(it.next(), new com.google.android.gms.common.api.Scope[0]);
            }
            googleSignInOptions = builder.build();
        }
        this.zzev = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof com.google.android.gms.auth.api.signin.internal.zzv ? (com.google.android.gms.auth.api.signin.internal.zzv) queryLocalInterface : new com.google.android.gms.auth.api.signin.internal.zzw(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final android.content.Intent getSignInIntent() {
        return com.google.android.gms.auth.api.signin.internal.zzi.zzd(getContext(), this.zzev);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean providesSignIn() {
        return true;
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions zzn() {
        return this.zzev;
    }
}
