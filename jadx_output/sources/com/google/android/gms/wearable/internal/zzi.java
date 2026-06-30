package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzi extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzi> CREATOR = new com.google.android.gms.wearable.internal.zzj();
    private final java.lang.String value;
    private byte zzbd;
    private final byte zzbe;

    public zzi(byte b17, byte b18, java.lang.String str) {
        this.zzbd = b17;
        this.zzbe = b18;
        this.value = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.gms.wearable.internal.zzi.class != obj.getClass()) {
            return false;
        }
        com.google.android.gms.wearable.internal.zzi zziVar = (com.google.android.gms.wearable.internal.zzi) obj;
        return this.zzbd == zziVar.zzbd && this.zzbe == zziVar.zzbe && this.value.equals(zziVar.value);
    }

    public final int hashCode() {
        return ((((this.zzbd + 31) * 31) + this.zzbe) * 31) + this.value.hashCode();
    }

    public final java.lang.String toString() {
        byte b17 = this.zzbd;
        byte b18 = this.zzbe;
        java.lang.String str = this.value;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 73);
        sb6.append("AmsEntityUpdateParcelable{, mEntityId=");
        sb6.append((int) b17);
        sb6.append(", mAttributeId=");
        sb6.append((int) b18);
        sb6.append(", mValue='");
        sb6.append(str);
        sb6.append("'}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 2, this.zzbd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 3, this.zzbe);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.value, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
