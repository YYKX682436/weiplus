package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class zzab extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.IGmsCallbacks {
    public zzab(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i17, android.os.IBinder iBinder, android.os.Bundle bundle) {
        android.os.Parcel zza = zza();
        zza.writeInt(i17);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.zzc.zzc(zza, bundle);
        zzC(1, zza);
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i17, android.os.Bundle bundle) {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i17, android.os.IBinder iBinder, com.google.android.gms.common.internal.zzk zzkVar) {
        throw null;
    }
}
