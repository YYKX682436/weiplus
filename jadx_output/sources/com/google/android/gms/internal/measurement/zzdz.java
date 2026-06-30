package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public final class zzdz extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.measurement.zzdz> CREATOR = new com.google.android.gms.internal.measurement.zzea();
    public final java.lang.String packageName;
    public final java.lang.String zzadm;
    public final java.lang.String zzado;
    public final long zzads;
    public final java.lang.String zzadt;
    public final long zzadu;
    public final long zzadv;
    public final boolean zzadw;
    public final long zzadx;
    public final boolean zzady;
    public final boolean zzadz;
    public final java.lang.String zzaek;
    public final boolean zzael;
    public final long zzaem;
    public final int zzaen;
    public final boolean zzaeo;
    public final java.lang.String zzth;

    public zzdz(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, long j18, long j19, java.lang.String str5, boolean z17, boolean z18, java.lang.String str6, long j27, long j28, int i17, boolean z19, boolean z27, boolean z28) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.packageName = str;
        this.zzadm = android.text.TextUtils.isEmpty(str2) ? null : str2;
        this.zzth = str3;
        this.zzads = j17;
        this.zzadt = str4;
        this.zzadu = j18;
        this.zzadv = j19;
        this.zzaek = str5;
        this.zzadw = z17;
        this.zzael = z18;
        this.zzado = str6;
        this.zzadx = j27;
        this.zzaem = j28;
        this.zzaen = i17;
        this.zzady = z19;
        this.zzadz = z27;
        this.zzaeo = z28;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzadm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzth, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzadt, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 6, this.zzadu);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 7, this.zzadv);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzaek, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzadw);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzael);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 11, this.zzads);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, this.zzado, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 13, this.zzadx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 14, this.zzaem);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 15, this.zzaen);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 16, this.zzady);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 17, this.zzadz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 18, this.zzaeo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzdz(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, long j18, java.lang.String str5, boolean z17, boolean z18, long j19, java.lang.String str6, long j27, long j28, int i17, boolean z19, boolean z27, boolean z28) {
        this.packageName = str;
        this.zzadm = str2;
        this.zzth = str3;
        this.zzads = j19;
        this.zzadt = str4;
        this.zzadu = j17;
        this.zzadv = j18;
        this.zzaek = str5;
        this.zzadw = z17;
        this.zzael = z18;
        this.zzado = str6;
        this.zzadx = j27;
        this.zzaem = j28;
        this.zzaen = i17;
        this.zzady = z19;
        this.zzadz = z27;
        this.zzaeo = z28;
    }
}
