package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzl extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzl> CREATOR = new com.google.android.gms.wearable.internal.zzm();

    /* renamed from: id, reason: collision with root package name */
    private int f44277id;
    private final java.lang.String packageName;
    private final java.lang.String zzbf;
    private final java.lang.String zzbg;
    private final java.lang.String zzbh;
    private final java.lang.String zzbi;
    private final java.lang.String zzbj;
    private final java.lang.String zzbk;
    private final byte zzbl;
    private final byte zzbm;
    private final byte zzbn;
    private final byte zzbo;

    public zzl(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, byte b17, byte b18, byte b19, byte b27, java.lang.String str7) {
        this.f44277id = i17;
        this.zzbf = str;
        this.zzbg = str2;
        this.zzbh = str3;
        this.zzbi = str4;
        this.zzbj = str5;
        this.zzbk = str6;
        this.zzbl = b17;
        this.zzbm = b18;
        this.zzbn = b19;
        this.zzbo = b27;
        this.packageName = str7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.wearable.internal.zzl.class == obj.getClass()) {
            com.google.android.gms.wearable.internal.zzl zzlVar = (com.google.android.gms.wearable.internal.zzl) obj;
            if (this.f44277id != zzlVar.f44277id || this.zzbl != zzlVar.zzbl || this.zzbm != zzlVar.zzbm || this.zzbn != zzlVar.zzbn || this.zzbo != zzlVar.zzbo || !this.zzbf.equals(zzlVar.zzbf)) {
                return false;
            }
            java.lang.String str = this.zzbg;
            if (str == null ? zzlVar.zzbg != null : !str.equals(zzlVar.zzbg)) {
                return false;
            }
            if (!this.zzbh.equals(zzlVar.zzbh) || !this.zzbi.equals(zzlVar.zzbi) || !this.zzbj.equals(zzlVar.zzbj)) {
                return false;
            }
            java.lang.String str2 = this.zzbk;
            if (str2 == null ? zzlVar.zzbk != null : !str2.equals(zzlVar.zzbk)) {
                return false;
            }
            java.lang.String str3 = this.packageName;
            java.lang.String str4 = zzlVar.packageName;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f44277id + 31) * 31) + this.zzbf.hashCode()) * 31;
        java.lang.String str = this.zzbg;
        int hashCode2 = (((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.zzbh.hashCode()) * 31) + this.zzbi.hashCode()) * 31) + this.zzbj.hashCode()) * 31;
        java.lang.String str2 = this.zzbk;
        int hashCode3 = (((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.zzbl) * 31) + this.zzbm) * 31) + this.zzbn) * 31) + this.zzbo) * 31;
        java.lang.String str3 = this.packageName;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        int i17 = this.f44277id;
        java.lang.String str = this.zzbf;
        java.lang.String str2 = this.zzbg;
        java.lang.String str3 = this.zzbh;
        java.lang.String str4 = this.zzbi;
        java.lang.String str5 = this.zzbj;
        java.lang.String str6 = this.zzbk;
        byte b17 = this.zzbl;
        byte b18 = this.zzbm;
        byte b19 = this.zzbn;
        byte b27 = this.zzbo;
        java.lang.String str7 = this.packageName;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 211 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length() + java.lang.String.valueOf(str4).length() + java.lang.String.valueOf(str5).length() + java.lang.String.valueOf(str6).length() + java.lang.String.valueOf(str7).length());
        sb6.append("AncsNotificationParcelable{, id=");
        sb6.append(i17);
        sb6.append(", appId='");
        sb6.append(str);
        sb6.append("', dateTime='");
        sb6.append(str2);
        sb6.append("', notificationText='");
        sb6.append(str3);
        sb6.append("', title='");
        sb6.append(str4);
        sb6.append("', subtitle='");
        sb6.append(str5);
        sb6.append("', displayName='");
        sb6.append(str6);
        sb6.append("', eventId=");
        sb6.append((int) b17);
        sb6.append(", eventFlags=");
        sb6.append((int) b18);
        sb6.append(", categoryId=");
        sb6.append((int) b19);
        sb6.append(", categoryCount=");
        sb6.append((int) b27);
        sb6.append(", packageName='");
        sb6.append(str7);
        sb6.append("'}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.f44277id);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzbf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzbg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzbh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzbi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzbj, false);
        java.lang.String str = this.zzbk;
        if (str == null) {
            str = this.zzbf;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 9, this.zzbl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 10, this.zzbm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 11, this.zzbn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 12, this.zzbo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 13, this.packageName, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
