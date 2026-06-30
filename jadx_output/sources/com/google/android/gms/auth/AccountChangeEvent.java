package com.google.android.gms.auth;

/* loaded from: classes13.dex */
public class AccountChangeEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.AccountChangeEvent> CREATOR = new com.google.android.gms.auth.zzd();
    private final int zzh;
    private final long zzi;
    private final java.lang.String zzj;
    private final int zzk;
    private final int zzl;
    private final java.lang.String zzm;

    public AccountChangeEvent(int i17, long j17, java.lang.String str, int i18, int i19, java.lang.String str2) {
        this.zzh = i17;
        this.zzi = j17;
        this.zzj = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzk = i18;
        this.zzl = i19;
        this.zzm = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.auth.AccountChangeEvent) {
            com.google.android.gms.auth.AccountChangeEvent accountChangeEvent = (com.google.android.gms.auth.AccountChangeEvent) obj;
            if (this.zzh == accountChangeEvent.zzh && this.zzi == accountChangeEvent.zzi && com.google.android.gms.common.internal.Objects.equal(this.zzj, accountChangeEvent.zzj) && this.zzk == accountChangeEvent.zzk && this.zzl == accountChangeEvent.zzl && com.google.android.gms.common.internal.Objects.equal(this.zzm, accountChangeEvent.zzm)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getAccountName() {
        return this.zzj;
    }

    public java.lang.String getChangeData() {
        return this.zzm;
    }

    public int getChangeType() {
        return this.zzk;
    }

    public int getEventIndex() {
        return this.zzl;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzh), java.lang.Long.valueOf(this.zzi), this.zzj, java.lang.Integer.valueOf(this.zzk), java.lang.Integer.valueOf(this.zzl), this.zzm);
    }

    public java.lang.String toString() {
        int i17 = this.zzk;
        java.lang.String str = i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        java.lang.String str2 = this.zzj;
        java.lang.String str3 = this.zzm;
        int i18 = this.zzl;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 91 + str.length() + java.lang.String.valueOf(str3).length());
        sb6.append("AccountChangeEvent {accountName = ");
        sb6.append(str2);
        sb6.append(", changeType = ");
        sb6.append(str);
        sb6.append(", changeData = ");
        sb6.append(str3);
        sb6.append(", eventIndex = ");
        sb6.append(i18);
        sb6.append("}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AccountChangeEvent(long j17, java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.zzh = 1;
        this.zzi = j17;
        this.zzj = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzk = i17;
        this.zzl = i18;
        this.zzm = str2;
    }
}
