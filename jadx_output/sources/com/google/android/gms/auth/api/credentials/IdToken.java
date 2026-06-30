package com.google.android.gms.auth.api.credentials;

/* loaded from: classes13.dex */
public final class IdToken extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.IdToken> CREATOR = new com.google.android.gms.auth.api.credentials.zzl();
    private final java.lang.String zzbx;
    private final java.lang.String zzdf;

    public IdToken(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(!android.text.TextUtils.isEmpty(str), "account type string cannot be null or empty");
        com.google.android.gms.common.internal.Preconditions.checkArgument(!android.text.TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.zzbx = str;
        this.zzdf = str2;
    }

    public final java.lang.String getAccountType() {
        return this.zzbx;
    }

    public final java.lang.String getIdToken() {
        return this.zzdf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getAccountType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getIdToken(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
