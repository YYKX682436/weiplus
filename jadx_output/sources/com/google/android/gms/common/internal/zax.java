package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class zax extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.zax> CREATOR = new com.google.android.gms.common.internal.zay();
    final int zaa;
    private final int zab;
    private final int zac;

    @java.lang.Deprecated
    private final com.google.android.gms.common.api.Scope[] zad;

    public zax(int i17, int i18, int i19, com.google.android.gms.common.api.Scope[] scopeArr) {
        this.zaa = i17;
        this.zab = i18;
        this.zac = i19;
        this.zad = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18 = this.zaa;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i18);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zab);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 4, this.zad, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
