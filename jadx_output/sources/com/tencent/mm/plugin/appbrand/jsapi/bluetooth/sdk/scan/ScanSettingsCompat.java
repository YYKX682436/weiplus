package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

/* loaded from: classes7.dex */
public class ScanSettingsCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanSettingsCompat> CREATOR = new pb1.b0();

    /* renamed from: d, reason: collision with root package name */
    public final int f80111d;

    /* renamed from: e, reason: collision with root package name */
    public final int f80112e;

    /* renamed from: f, reason: collision with root package name */
    public final long f80113f;

    public ScanSettingsCompat(int i17, int i18, long j17, pb1.b0 b0Var) {
        this.f80111d = i17;
        this.f80112e = i18;
        this.f80113f = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f80111d);
        parcel.writeInt(this.f80112e);
        parcel.writeLong(this.f80113f);
    }

    public ScanSettingsCompat(android.os.Parcel parcel, pb1.b0 b0Var) {
        this.f80111d = parcel.readInt();
        this.f80112e = parcel.readInt();
        this.f80113f = parcel.readLong();
    }
}
