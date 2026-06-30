package com.google.android.gms.security;

/* loaded from: classes13.dex */
final class zza extends android.os.AsyncTask {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.security.ProviderInstaller.ProviderInstallListener zzb;

    public zza(android.content.Context context, com.google.android.gms.security.ProviderInstaller.ProviderInstallListener providerInstallListener) {
        this.zza = context;
        this.zzb = providerInstallListener;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] objArr) {
        try {
            com.google.android.gms.security.ProviderInstaller.installIfNeeded(this.zza);
            return 0;
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException e17) {
            return java.lang.Integer.valueOf(e17.errorCode);
        } catch (com.google.android.gms.common.GooglePlayServicesRepairableException e18) {
            return java.lang.Integer.valueOf(e18.getConnectionStatusCode());
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(java.lang.Object obj) {
        com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight;
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num.intValue() == 0) {
            this.zzb.onProviderInstalled();
            return;
        }
        android.content.Context context = this.zza;
        googleApiAvailabilityLight = com.google.android.gms.security.ProviderInstaller.zza;
        this.zzb.onProviderInstallFailed(num.intValue(), googleApiAvailabilityLight.getErrorResolutionIntent(context, num.intValue(), "pi"));
    }
}
