package com.google.android.gms.common;

/* loaded from: classes13.dex */
public class Feature extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.Feature> CREATOR = new com.google.android.gms.common.zzc();
    private final java.lang.String zza;

    @java.lang.Deprecated
    private final int zzb;
    private final long zzc;

    public Feature(java.lang.String str, int i17, long j17) {
        this.zza = str;
        this.zzb = i17;
        this.zzc = j17;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.common.Feature) {
            com.google.android.gms.common.Feature feature = (com.google.android.gms.common.Feature) obj;
            if (((getName() != null && getName().equals(feature.getName())) || (getName() == null && feature.getName() == null)) && getVersion() == feature.getVersion()) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getName() {
        return this.zza;
    }

    public long getVersion() {
        long j17 = this.zzc;
        return j17 == -1 ? this.zzb : j17;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(getName(), java.lang.Long.valueOf(getVersion()));
    }

    public final java.lang.String toString() {
        com.google.android.gms.common.internal.Objects.ToStringHelper stringHelper = com.google.android.gms.common.internal.Objects.toStringHelper(this);
        stringHelper.add(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, getName());
        stringHelper.add("version", java.lang.Long.valueOf(getVersion()));
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, getVersion());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public Feature(java.lang.String str, long j17) {
        this.zza = str;
        this.zzc = j17;
        this.zzb = -1;
    }
}
