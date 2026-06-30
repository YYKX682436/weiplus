package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class zzd extends com.google.android.gms.common.internal.zzac {
    private com.google.android.gms.common.internal.BaseGmsClient zza;
    private final int zzb;

    public zzd(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i17) {
        this.zza = baseGmsClient;
        this.zzb = i17;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i17, android.os.IBinder iBinder, android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
        this.zza.onPostInitHandler(i17, iBinder, bundle, this.zzb);
        this.zza = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i17, android.os.Bundle bundle) {
        android.util.Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new java.lang.Exception());
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i17, android.os.IBinder iBinder, com.google.android.gms.common.internal.zzk zzkVar) {
        com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkVar);
        com.google.android.gms.common.internal.BaseGmsClient.zzj(baseGmsClient, zzkVar);
        onPostInitComplete(i17, iBinder, zzkVar.zza);
    }
}
