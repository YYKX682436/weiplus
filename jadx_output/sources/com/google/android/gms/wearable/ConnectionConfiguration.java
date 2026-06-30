package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public class ConnectionConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.ConnectionConfiguration> CREATOR = new com.google.android.gms.wearable.zzg();
    private final java.lang.String name;
    private final int type;
    private final java.lang.String zzi;
    private final int zzj;
    private final boolean zzk;
    private volatile boolean zzl;
    private volatile java.lang.String zzm;
    private boolean zzn;
    private java.lang.String zzo;

    public ConnectionConfiguration(java.lang.String str, java.lang.String str2, int i17, int i18, boolean z17, boolean z18, java.lang.String str3, boolean z19, java.lang.String str4) {
        this.name = str;
        this.zzi = str2;
        this.type = i17;
        this.zzj = i18;
        this.zzk = z17;
        this.zzl = z18;
        this.zzm = str3;
        this.zzn = z19;
        this.zzo = str4;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.wearable.ConnectionConfiguration)) {
            return false;
        }
        com.google.android.gms.wearable.ConnectionConfiguration connectionConfiguration = (com.google.android.gms.wearable.ConnectionConfiguration) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.name, connectionConfiguration.name) && com.google.android.gms.common.internal.Objects.equal(this.zzi, connectionConfiguration.zzi) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(connectionConfiguration.type)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzj), java.lang.Integer.valueOf(connectionConfiguration.zzj)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzk), java.lang.Boolean.valueOf(connectionConfiguration.zzk)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzn), java.lang.Boolean.valueOf(connectionConfiguration.zzn));
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.name, this.zzi, java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(this.zzj), java.lang.Boolean.valueOf(this.zzk), java.lang.Boolean.valueOf(this.zzn));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ConnectionConfiguration[ ");
        java.lang.String valueOf = java.lang.String.valueOf(this.name);
        sb6.append(valueOf.length() != 0 ? "mName=".concat(valueOf) : new java.lang.String("mName="));
        java.lang.String valueOf2 = java.lang.String.valueOf(this.zzi);
        sb6.append(valueOf2.length() != 0 ? ", mAddress=".concat(valueOf2) : new java.lang.String(", mAddress="));
        int i17 = this.type;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(19);
        sb7.append(", mType=");
        sb7.append(i17);
        sb6.append(sb7.toString());
        int i18 = this.zzj;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(19);
        sb8.append(", mRole=");
        sb8.append(i18);
        sb6.append(sb8.toString());
        boolean z17 = this.zzk;
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(16);
        sb9.append(", mEnabled=");
        sb9.append(z17);
        sb6.append(sb9.toString());
        boolean z18 = this.zzl;
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder(20);
        sb10.append(", mIsConnected=");
        sb10.append(z18);
        sb6.append(sb10.toString());
        java.lang.String valueOf3 = java.lang.String.valueOf(this.zzm);
        sb6.append(valueOf3.length() != 0 ? ", mPeerNodeId=".concat(valueOf3) : new java.lang.String(", mPeerNodeId="));
        boolean z19 = this.zzn;
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder(21);
        sb11.append(", mBtlePriority=");
        sb11.append(z19);
        sb6.append(sb11.toString());
        java.lang.String valueOf4 = java.lang.String.valueOf(this.zzo);
        sb6.append(valueOf4.length() != 0 ? ", mNodeId=".concat(valueOf4) : new java.lang.String(", mNodeId="));
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.name, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.type);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, this.zzo, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
