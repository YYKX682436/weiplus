package com.google.android.gms.auth;

/* loaded from: classes13.dex */
public class AccountChangeEventsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.AccountChangeEventsRequest> CREATOR = new com.google.android.gms.auth.zze();
    private final int zzh;

    @java.lang.Deprecated
    private java.lang.String zzj;
    private int zzl;
    private android.accounts.Account zzn;

    public AccountChangeEventsRequest() {
        this.zzh = 1;
    }

    public android.accounts.Account getAccount() {
        return this.zzn;
    }

    @java.lang.Deprecated
    public java.lang.String getAccountName() {
        return this.zzj;
    }

    public int getEventIndex() {
        return this.zzl;
    }

    public com.google.android.gms.auth.AccountChangeEventsRequest setAccount(android.accounts.Account account) {
        this.zzn = account;
        return this;
    }

    @java.lang.Deprecated
    public com.google.android.gms.auth.AccountChangeEventsRequest setAccountName(java.lang.String str) {
        this.zzj = str;
        return this;
    }

    public com.google.android.gms.auth.AccountChangeEventsRequest setEventIndex(int i17) {
        this.zzl = i17;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzn, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AccountChangeEventsRequest(int i17, int i18, java.lang.String str, android.accounts.Account account) {
        this.zzh = i17;
        this.zzl = i18;
        this.zzj = str;
        if (account != null || android.text.TextUtils.isEmpty(str)) {
            this.zzn = account;
        } else {
            this.zzn = new android.accounts.Account(str, "com.google");
        }
    }
}
