package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public final class zzbe extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.auth.zzbe> CREATOR = new com.google.android.gms.internal.auth.zzbf();
    private final com.google.android.gms.auth.api.credentials.Credential zzdq;

    public zzbe(com.google.android.gms.auth.api.credentials.Credential credential) {
        this.zzdq = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzdq, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
