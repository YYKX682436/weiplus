package com.tencent.matrix.batterycanary.stats;

/* loaded from: classes12.dex */
public class e implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord[i17];
    }
}
