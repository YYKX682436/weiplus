package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public final class zzak extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.auth.zzak> CREATOR = new com.google.android.gms.internal.auth.zzal();
    private final java.lang.String accountType;
    private final android.app.PendingIntent zzch;
    private final int zzy;

    public zzak(int i17, java.lang.String str, android.app.PendingIntent pendingIntent) {
        this.zzy = 1;
        this.accountType = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzch = (android.app.PendingIntent) com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.accountType, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzch, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzak(java.lang.String str, android.app.PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }
}
