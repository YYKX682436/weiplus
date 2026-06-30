package com.google.android.gms.common.stats;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public final class WakeLockEvent extends com.google.android.gms.common.stats.StatsEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.stats.WakeLockEvent> CREATOR = new com.google.android.gms.common.stats.zza();
    final int zza;
    private final long zzb;
    private final int zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final int zzg;
    private final java.util.List zzh;
    private final java.lang.String zzi;
    private final long zzj;
    private final int zzk;
    private final java.lang.String zzl;
    private final float zzm;
    private final long zzn;
    private final boolean zzo;

    public WakeLockEvent(int i17, long j17, int i18, java.lang.String str, int i19, java.util.List list, java.lang.String str2, long j18, int i27, java.lang.String str3, java.lang.String str4, float f17, long j19, java.lang.String str5, boolean z17) {
        this.zza = i17;
        this.zzb = j17;
        this.zzc = i18;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i19;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j18;
        this.zzk = i27;
        this.zzl = str4;
        this.zzm = f17;
        this.zzn = j19;
        this.zzo = z17;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 6, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 8, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 11, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 14, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 15, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 16, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 17, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final java.lang.String zzc() {
        java.util.List list = this.zzh;
        java.lang.String join = list == null ? "" : android.text.TextUtils.join(",", list);
        int i17 = this.zzk;
        java.lang.String str = this.zze;
        java.lang.String str2 = this.zzl;
        float f17 = this.zzm;
        java.lang.String str3 = this.zzf;
        int i18 = this.zzg;
        java.lang.String str4 = this.zzd;
        boolean z17 = this.zzo;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\t");
        sb6.append(str4);
        sb6.append("\t");
        sb6.append(i18);
        sb6.append("\t");
        sb6.append(join);
        sb6.append("\t");
        sb6.append(i17);
        sb6.append("\t");
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append("\t");
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append("\t");
        sb6.append(f17);
        sb6.append("\t");
        sb6.append(str3 != null ? str3 : "");
        sb6.append("\t");
        sb6.append(z17);
        return sb6.toString();
    }
}
