package com.google.android.gms.common;

/* loaded from: classes13.dex */
public final class zzq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzq> CREATOR = new com.google.android.gms.common.zzr();
    private final boolean zza;
    private final java.lang.String zzb;
    private final int zzc;
    private final int zzd;

    public zzq(boolean z17, java.lang.String str, int i17, int i18) {
        this.zza = z17;
        this.zzb = str;
        this.zzc = com.google.android.gms.common.zzy.zza(i17) - 1;
        this.zzd = com.google.android.gms.common.zzd.zza(i18) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public final int zzc() {
        return com.google.android.gms.common.zzd.zza(this.zzd);
    }

    public final int zzd() {
        return com.google.android.gms.common.zzy.zza(this.zzc);
    }
}
