package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class zzf extends com.google.android.gms.common.internal.zza {
    public final android.os.IBinder zze;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i17, android.os.IBinder iBinder, android.os.Bundle bundle) {
        super(baseGmsClient, i17, bundle);
        this.zzf = baseGmsClient;
        this.zze = iBinder;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void zzb(com.google.android.gms.common.ConnectionResult connectionResult) {
        if (this.zzf.zzx != null) {
            this.zzf.zzx.onConnectionFailed(connectionResult);
        }
        this.zzf.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean zzd() {
        com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        try {
            android.os.IBinder iBinder = this.zze;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(iBinder);
            if (!this.zzf.getServiceDescriptor().equals(iBinder.getInterfaceDescriptor())) {
                this.zzf.getServiceDescriptor();
                return false;
            }
            android.os.IInterface createServiceInterface = this.zzf.createServiceInterface(this.zze);
            if (createServiceInterface == null) {
                return false;
            }
            if (!com.google.android.gms.common.internal.BaseGmsClient.zzn(this.zzf, 2, 4, createServiceInterface) && !com.google.android.gms.common.internal.BaseGmsClient.zzn(this.zzf, 3, 4, createServiceInterface)) {
                return false;
            }
            this.zzf.zzB = null;
            com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zzf;
            android.os.Bundle connectionHint = baseGmsClient.getConnectionHint();
            baseConnectionCallbacks = baseGmsClient.zzw;
            if (baseConnectionCallbacks != null) {
                baseConnectionCallbacks2 = this.zzf.zzw;
                baseConnectionCallbacks2.onConnected(connectionHint);
            }
            return true;
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }
}
