package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public final class zzed extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.measurement.zzed> CREATOR = new com.google.android.gms.internal.measurement.zzee();
    public boolean active;
    public long creationTimestamp;
    public java.lang.String origin;
    public java.lang.String packageName;
    public long timeToLive;
    public java.lang.String triggerEventName;
    public long triggerTimeout;
    public com.google.android.gms.internal.measurement.zzjx zzaep;
    public com.google.android.gms.internal.measurement.zzeu zzaeq;
    public com.google.android.gms.internal.measurement.zzeu zzaer;
    public com.google.android.gms.internal.measurement.zzeu zzaes;

    public zzed(com.google.android.gms.internal.measurement.zzed zzedVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzedVar);
        this.packageName = zzedVar.packageName;
        this.origin = zzedVar.origin;
        this.zzaep = zzedVar.zzaep;
        this.creationTimestamp = zzedVar.creationTimestamp;
        this.active = zzedVar.active;
        this.triggerEventName = zzedVar.triggerEventName;
        this.zzaeq = zzedVar.zzaeq;
        this.triggerTimeout = zzedVar.triggerTimeout;
        this.zzaer = zzedVar.zzaer;
        this.timeToLive = zzedVar.timeToLive;
        this.zzaes = zzedVar.zzaes;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.origin, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzaep, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, this.creationTimestamp);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, this.active);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.triggerEventName, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzaeq, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 9, this.triggerTimeout);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, this.zzaer, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 11, this.timeToLive);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 12, this.zzaes, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzed(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.zzjx zzjxVar, long j17, boolean z17, java.lang.String str3, com.google.android.gms.internal.measurement.zzeu zzeuVar, long j18, com.google.android.gms.internal.measurement.zzeu zzeuVar2, long j19, com.google.android.gms.internal.measurement.zzeu zzeuVar3) {
        this.packageName = str;
        this.origin = str2;
        this.zzaep = zzjxVar;
        this.creationTimestamp = j17;
        this.active = z17;
        this.triggerEventName = str3;
        this.zzaeq = zzeuVar;
        this.triggerTimeout = j18;
        this.zzaer = zzeuVar2;
        this.timeToLive = j19;
        this.zzaes = zzeuVar3;
    }
}
