package com.google.android.gms.auth;

/* loaded from: classes13.dex */
public class TokenData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.TokenData> CREATOR = new com.google.android.gms.auth.zzn();
    private final java.lang.Long zzaa;
    private final boolean zzab;
    private final boolean zzac;
    private final java.util.List<java.lang.String> zzad;
    private final int zzy;
    private final java.lang.String zzz;

    public TokenData(int i17, java.lang.String str, java.lang.Long l17, boolean z17, boolean z18, java.util.List<java.lang.String> list) {
        this.zzy = i17;
        this.zzz = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzaa = l17;
        this.zzab = z17;
        this.zzac = z18;
        this.zzad = list;
    }

    public static com.google.android.gms.auth.TokenData zzd(android.os.Bundle bundle, java.lang.String str) {
        bundle.setClassLoader(com.google.android.gms.auth.TokenData.class.getClassLoader());
        android.os.Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(com.google.android.gms.auth.TokenData.class.getClassLoader());
        return (com.google.android.gms.auth.TokenData) bundle2.getParcelable("TokenData");
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.TokenData)) {
            return false;
        }
        com.google.android.gms.auth.TokenData tokenData = (com.google.android.gms.auth.TokenData) obj;
        return android.text.TextUtils.equals(this.zzz, tokenData.zzz) && com.google.android.gms.common.internal.Objects.equal(this.zzaa, tokenData.zzaa) && this.zzab == tokenData.zzab && this.zzac == tokenData.zzac && com.google.android.gms.common.internal.Objects.equal(this.zzad, tokenData.zzad);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzz, this.zzaa, java.lang.Boolean.valueOf(this.zzab), java.lang.Boolean.valueOf(this.zzac), this.zzad);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzz, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(parcel, 3, this.zzaa, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzab);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zzac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 6, this.zzad, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String zze() {
        return this.zzz;
    }
}
