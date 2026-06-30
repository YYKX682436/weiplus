package com.tencent.matrix.batterycanary.stats;

/* loaded from: classes12.dex */
public class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.matrix.batterycanary.stats.BatteryRecord.AppStatRecord(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.matrix.batterycanary.stats.BatteryRecord.AppStatRecord[i17];
    }
}
