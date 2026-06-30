package com.google.android.gms.common;

/* loaded from: classes13.dex */
public final class zzs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzs> CREATOR = new com.google.android.gms.common.zzt();
    private final java.lang.String zza;
    private final com.google.android.gms.common.zzj zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzs(java.lang.String str, com.google.android.gms.common.zzj zzjVar, boolean z17, boolean z18) {
        this.zza = str;
        this.zzb = zzjVar;
        this.zzc = z17;
        this.zzd = z18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.zzj zzjVar = this.zzb;
        if (zzjVar == null) {
            zzjVar = null;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzjVar, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzs(java.lang.String str, android.os.IBinder iBinder, boolean z17, boolean z18) {
        this.zza = str;
        com.google.android.gms.common.zzk zzkVar = null;
        if (iBinder != null) {
            try {
                com.google.android.gms.dynamic.IObjectWrapper zzd = com.google.android.gms.common.internal.zzz.zzg(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzd);
                if (bArr != null) {
                    zzkVar = new com.google.android.gms.common.zzk(bArr);
                }
            } catch (android.os.RemoteException unused) {
            }
        }
        this.zzb = zzkVar;
        this.zzc = z17;
        this.zzd = z18;
    }
}
