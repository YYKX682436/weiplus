package com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat */
/* loaded from: classes12.dex */
public class C4632xe8a3494d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4632xe8a3494d> f19905x681a0c0c = new rh.h1();

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f134090d;

    public C4632xe8a3494d() {
        this.f134090d = java.util.Collections.emptyList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int size = this.f134090d.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeLongArray((long[]) this.f134090d.get(i18));
        }
    }

    public C4632xe8a3494d(android.os.Parcel parcel) {
        this.f134090d = java.util.Collections.emptyList();
        int readInt = parcel.readInt();
        this.f134090d = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 < readInt; i17++) {
            this.f134090d.add(parcel.createLongArray());
        }
    }
}
