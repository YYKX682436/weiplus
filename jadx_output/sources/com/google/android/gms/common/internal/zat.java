package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class zat extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.zat> CREATOR = new com.google.android.gms.common.internal.zau();
    final int zaa;
    private final android.accounts.Account zab;
    private final int zac;
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zad;

    public zat(int i17, android.accounts.Account account, int i18, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this.zaa = i17;
        this.zab = account;
        this.zac = i18;
        this.zad = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18 = this.zaa;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i18);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zad, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zat(android.accounts.Account account, int i17, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this(2, account, i17, googleSignInAccount);
    }
}
