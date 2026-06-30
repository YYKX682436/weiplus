package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public class TelemetryData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.TelemetryData> CREATOR = new com.google.android.gms.common.internal.zaab();
    private final int zaa;
    private java.util.List zab;

    public TelemetryData(int i17, java.util.List list) {
        this.zaa = i17;
        this.zab = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zab, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zaa() {
        return this.zaa;
    }

    public final java.util.List zab() {
        return this.zab;
    }

    public final void zac(com.google.android.gms.common.internal.MethodInvocation methodInvocation) {
        if (this.zab == null) {
            this.zab = new java.util.ArrayList();
        }
        this.zab.add(methodInvocation);
    }
}
