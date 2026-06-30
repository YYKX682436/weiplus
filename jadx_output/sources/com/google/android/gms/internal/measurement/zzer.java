package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public final class zzer extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.lang.Iterable<java.lang.String> {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.measurement.zzer> CREATOR = new com.google.android.gms.internal.measurement.zzet();
    private final android.os.Bundle zzafy;

    public zzer(android.os.Bundle bundle) {
        this.zzafy = bundle;
    }

    public final java.lang.Object get(java.lang.String str) {
        return this.zzafy.get(str);
    }

    public final java.lang.Long getLong(java.lang.String str) {
        return java.lang.Long.valueOf(this.zzafy.getLong(str));
    }

    public final java.lang.String getString(java.lang.String str) {
        return this.zzafy.getString(str);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.lang.String> iterator() {
        return new com.google.android.gms.internal.measurement.zzes(this);
    }

    public final int size() {
        return this.zzafy.size();
    }

    public final java.lang.String toString() {
        return this.zzafy.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 2, zzif(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.Double zzbh(java.lang.String str) {
        return java.lang.Double.valueOf(this.zzafy.getDouble(str));
    }

    public final android.os.Bundle zzif() {
        return new android.os.Bundle(this.zzafy);
    }
}
