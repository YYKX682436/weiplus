package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes13.dex */
public class DeviceMetaData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.DeviceMetaData> CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzy();
    private boolean zzcc;
    private long zzcd;
    private final boolean zzce;
    private final int zzy;

    public DeviceMetaData(int i17, boolean z17, long j17, boolean z18) {
        this.zzy = i17;
        this.zzcc = z17;
        this.zzcd = j17;
        this.zzce = z18;
    }

    public long getMinAgeOfLockScreen() {
        return this.zzcd;
    }

    public boolean isChallengeAllowed() {
        return this.zzce;
    }

    public boolean isLockScreenSolved() {
        return this.zzcc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, isLockScreenSolved());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, getMinAgeOfLockScreen());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, isChallengeAllowed());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
