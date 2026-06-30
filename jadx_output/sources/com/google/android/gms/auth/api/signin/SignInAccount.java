package com.google.android.gms.auth.api.signin;

/* loaded from: classes13.dex */
public class SignInAccount extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.SignInAccount> CREATOR = new com.google.android.gms.auth.api.signin.zze();

    @java.lang.Deprecated
    private java.lang.String zzeo;
    private com.google.android.gms.auth.api.signin.GoogleSignInAccount zzep;

    @java.lang.Deprecated
    private java.lang.String zzeq;

    public SignInAccount(java.lang.String str, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, java.lang.String str2) {
        this.zzep = googleSignInAccount;
        this.zzeo = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.zzeq = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleSignInAccount() {
        return this.zzep;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzeo, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzep, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzeq, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
