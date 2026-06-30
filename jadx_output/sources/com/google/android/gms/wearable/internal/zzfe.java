package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzfe extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.wearable.MessageEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzfe> CREATOR = new com.google.android.gms.wearable.internal.zzff();
    private final byte[] data;
    private final java.lang.String zzcl;
    private final int zzeh;
    private final java.lang.String zzek;

    public zzfe(int i17, java.lang.String str, byte[] bArr, java.lang.String str2) {
        this.zzeh = i17;
        this.zzcl = str;
        this.data = bArr;
        this.zzek = str2;
    }

    @Override // com.google.android.gms.wearable.MessageEvent
    public final byte[] getData() {
        return this.data;
    }

    @Override // com.google.android.gms.wearable.MessageEvent
    public final java.lang.String getPath() {
        return this.zzcl;
    }

    @Override // com.google.android.gms.wearable.MessageEvent
    public final int getRequestId() {
        return this.zzeh;
    }

    @Override // com.google.android.gms.wearable.MessageEvent
    public final java.lang.String getSourceNodeId() {
        return this.zzek;
    }

    public final java.lang.String toString() {
        int i17 = this.zzeh;
        java.lang.String str = this.zzcl;
        byte[] bArr = this.data;
        java.lang.String valueOf = java.lang.String.valueOf(bArr == null ? "null" : java.lang.Integer.valueOf(bArr.length));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 43 + valueOf.length());
        sb6.append("MessageEventParcelable[");
        sb6.append(i17);
        sb6.append(",");
        sb6.append(str);
        sb6.append(", size=");
        sb6.append(valueOf);
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getRequestId());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getPath(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, getData(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getSourceNodeId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
