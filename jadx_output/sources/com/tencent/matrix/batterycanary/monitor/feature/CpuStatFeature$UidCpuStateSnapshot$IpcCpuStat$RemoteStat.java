package com.tencent.matrix.batterycanary.monitor.feature;

/* loaded from: classes12.dex */
public class CpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat> CREATOR = new rh.h1();

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f52557d;

    public CpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat() {
        this.f52557d = java.util.Collections.emptyList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int size = this.f52557d.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeLongArray((long[]) this.f52557d.get(i18));
        }
    }

    public CpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat(android.os.Parcel parcel) {
        this.f52557d = java.util.Collections.emptyList();
        int readInt = parcel.readInt();
        this.f52557d = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 < readInt; i17++) {
            this.f52557d.add(parcel.createLongArray());
        }
    }
}
