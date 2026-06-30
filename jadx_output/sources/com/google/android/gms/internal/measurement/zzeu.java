package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public final class zzeu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.measurement.zzeu> CREATOR = new com.google.android.gms.internal.measurement.zzev();
    public final java.lang.String name;
    public final java.lang.String origin;
    public final com.google.android.gms.internal.measurement.zzer zzafq;
    public final long zzagb;

    public zzeu(com.google.android.gms.internal.measurement.zzeu zzeuVar, long j17) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzeuVar);
        this.name = zzeuVar.name;
        this.zzafq = zzeuVar.zzafq;
        this.origin = zzeuVar.origin;
        this.zzagb = j17;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.origin;
        java.lang.String str2 = this.name;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzafq);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 21 + java.lang.String.valueOf(str2).length() + valueOf.length());
        sb6.append("origin=");
        sb6.append(str);
        sb6.append(",name=");
        sb6.append(str2);
        sb6.append(",params=");
        sb6.append(valueOf);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.name, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzafq, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.origin, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, this.zzagb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzeu(java.lang.String str, com.google.android.gms.internal.measurement.zzer zzerVar, java.lang.String str2, long j17) {
        this.name = str;
        this.zzafq = zzerVar;
        this.origin = str2;
        this.zzagb = j17;
    }
}
