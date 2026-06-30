package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public final class zzjx extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.measurement.zzjx> CREATOR = new com.google.android.gms.internal.measurement.zzjy();
    public final java.lang.String name;
    public final java.lang.String origin;
    private final int versionCode;
    private final java.lang.String zzajf;
    public final long zzaqz;
    private final java.lang.Long zzara;
    private final java.lang.Float zzarb;
    private final java.lang.Double zzarc;

    public zzjx(int i17, java.lang.String str, long j17, java.lang.Long l17, java.lang.Float f17, java.lang.String str2, java.lang.String str3, java.lang.Double d17) {
        this.versionCode = i17;
        this.name = str;
        this.zzaqz = j17;
        this.zzara = l17;
        this.zzarb = null;
        if (i17 == 1) {
            this.zzarc = f17 != null ? java.lang.Double.valueOf(f17.doubleValue()) : null;
        } else {
            this.zzarc = d17;
        }
        this.zzajf = str2;
        this.origin = str3;
    }

    public final java.lang.Object getValue() {
        java.lang.Long l17 = this.zzara;
        if (l17 != null) {
            return l17;
        }
        java.lang.Double d17 = this.zzarc;
        if (d17 != null) {
            return d17;
        }
        java.lang.String str = this.zzajf;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.name, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzaqz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(parcel, 4, this.zzara, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(parcel, 5, null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzajf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.origin, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(parcel, 8, this.zzarc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzjx(com.google.android.gms.internal.measurement.zzjz zzjzVar) {
        this(zzjzVar.name, zzjzVar.zzaqz, zzjzVar.value, zzjzVar.origin);
    }

    public zzjx(java.lang.String str, long j17, java.lang.Object obj, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.versionCode = 2;
        this.name = str;
        this.zzaqz = j17;
        this.origin = str2;
        if (obj == null) {
            this.zzara = null;
            this.zzarb = null;
            this.zzarc = null;
            this.zzajf = null;
            return;
        }
        if (obj instanceof java.lang.Long) {
            this.zzara = (java.lang.Long) obj;
            this.zzarb = null;
            this.zzarc = null;
            this.zzajf = null;
            return;
        }
        if (obj instanceof java.lang.String) {
            this.zzara = null;
            this.zzarb = null;
            this.zzarc = null;
            this.zzajf = (java.lang.String) obj;
            return;
        }
        if (!(obj instanceof java.lang.Double)) {
            throw new java.lang.IllegalArgumentException("User attribute given of un-supported type");
        }
        this.zzara = null;
        this.zzarb = null;
        this.zzarc = (java.lang.Double) obj;
        this.zzajf = null;
    }
}
