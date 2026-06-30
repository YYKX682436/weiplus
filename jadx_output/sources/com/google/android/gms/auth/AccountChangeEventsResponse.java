package com.google.android.gms.auth;

/* loaded from: classes13.dex */
public class AccountChangeEventsResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.AccountChangeEventsResponse> CREATOR = new com.google.android.gms.auth.zzf();
    private final int zzh;
    private final java.util.List<com.google.android.gms.auth.AccountChangeEvent> zzo;

    public AccountChangeEventsResponse(int i17, java.util.List<com.google.android.gms.auth.AccountChangeEvent> list) {
        this.zzh = i17;
        this.zzo = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
    }

    public java.util.List<com.google.android.gms.auth.AccountChangeEvent> getEvents() {
        return this.zzo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzo, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AccountChangeEventsResponse(java.util.List<com.google.android.gms.auth.AccountChangeEvent> list) {
        this.zzh = 1;
        this.zzo = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
    }
}
