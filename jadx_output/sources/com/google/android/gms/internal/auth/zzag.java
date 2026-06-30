package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public final class zzag extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.auth.zzag> CREATOR = new com.google.android.gms.internal.auth.zzah();
    private final java.lang.String accountType;
    private final int zzy;

    public zzag(int i17, java.lang.String str) {
        this.zzy = 1;
        this.accountType = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.accountType, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzag(java.lang.String str) {
        this(1, str);
    }
}
