package com.google.android.gms.common.server;

/* loaded from: classes13.dex */
public class FavaDiagnosticsEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.FavaDiagnosticsEntity> CREATOR = new com.google.android.gms.common.server.zaa();
    final int zaa;
    public final java.lang.String zab;
    public final int zac;

    public FavaDiagnosticsEntity(int i17, java.lang.String str, int i18) {
        this.zaa = i17;
        this.zab = str;
        this.zac = i18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18 = this.zaa;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i18);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zab, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public FavaDiagnosticsEntity(java.lang.String str, int i17) {
        this.zaa = 1;
        this.zab = str;
        this.zac = i17;
    }
}
