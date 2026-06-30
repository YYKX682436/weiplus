package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanSettingsCompat */
/* loaded from: classes7.dex */
public class C12041x3974a582 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12041x3974a582> f33962x681a0c0c = new pb1.b0();

    /* renamed from: d, reason: collision with root package name */
    public final int f161644d;

    /* renamed from: e, reason: collision with root package name */
    public final int f161645e;

    /* renamed from: f, reason: collision with root package name */
    public final long f161646f;

    public C12041x3974a582(int i17, int i18, long j17, pb1.b0 b0Var) {
        this.f161644d = i17;
        this.f161645e = i18;
        this.f161646f = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f161644d);
        parcel.writeInt(this.f161645e);
        parcel.writeLong(this.f161646f);
    }

    public C12041x3974a582(android.os.Parcel parcel, pb1.b0 b0Var) {
        this.f161644d = parcel.readInt();
        this.f161645e = parcel.readInt();
        this.f161646f = parcel.readLong();
    }
}
