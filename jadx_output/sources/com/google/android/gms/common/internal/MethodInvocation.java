package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public class MethodInvocation extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.MethodInvocation> CREATOR = new com.google.android.gms.common.internal.zan();
    private final int zaa;
    private final int zab;
    private final int zac;
    private final long zad;
    private final long zae;
    private final java.lang.String zaf;
    private final java.lang.String zag;
    private final int zah;
    private final int zai;

    @java.lang.Deprecated
    public MethodInvocation(int i17, int i18, int i19, long j17, long j18, java.lang.String str, java.lang.String str2, int i27) {
        this(i17, i18, i19, j17, j18, str, str2, i27, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18 = this.zaa;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i18);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zab);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zad);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, this.zae);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zaf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zag, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 8, this.zah);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 9, this.zai);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public MethodInvocation(int i17, int i18, int i19, long j17, long j18, java.lang.String str, java.lang.String str2, int i27, int i28) {
        this.zaa = i17;
        this.zab = i18;
        this.zac = i19;
        this.zad = j17;
        this.zae = j18;
        this.zaf = str;
        this.zag = str2;
        this.zah = i27;
        this.zai = i28;
    }
}
